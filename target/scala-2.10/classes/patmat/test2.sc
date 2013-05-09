package patmat
import Huffman._
import Ordering._
object test2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

def mult(x:Int)(y:Int):Int=x*y                    //> mult: (x: Int)(y: Int)Int
def mult2(x:Int,y:Int):Int=x*y                    //> mult2: (x: Int, y: Int)Int
mult2(3,4)                                        //> res0: Int = 12
 val m = mult(3)_                                 //> m  : Int => Int = <function1>
 m(5)                                             //> res1: Int = 15
 
 def gg(c:List[Char] ):Char={c(c.length-1)}       //> gg: (c: List[Char])Char
 val a= List(List('c','d'),List('a','x'))         //> a  : List[List[Char]] = List(List(c, d), List(a, x))
 a.flatten                                        //> res2: List[Char] = List(c, d, a, x)
 
 val l =List('a','c','v','s')                     //> l  : List[Char] = List(a, c, v, s)
def f(c:Char):Char=if (c=='a') 'x' else  'y'      //> f: (c: Char)Char

l.flatMap(x=>f(x)::Nil)                           //> res3: List[Char] = List(x, y, y, y)
 
 
 val table :List[(Char,List[Int])]=List(('a',List(1,0,0,0,1)),('d',List(1,1,0,0,0)),('b',List(1,1,0,0,0)))
                                                  //> table  : List[(Char, List[Int])] = List((a,List(1, 0, 0, 0, 1)), (d,List(1, 
                                                  //| 1, 0, 0, 0)), (b,List(1, 1, 0, 0, 0)))
val kff=codeBits(table)('d')                      //> kff  : List[patmat.Huffman.Bit] = List(1, 1, 0, 0, 0)
    val numbers =List(1,2,3,4,5)                  //> numbers  : List[Int] = List(1, 2, 3, 4, 5)
    
    
    numbers.flatMap(x=> List(x+1))                //> res4: List[Int] = List(2, 3, 4, 5, 6)
 numbers.map(x=>x*2)                              //> res5: List[Int] = List(2, 4, 6, 8, 10)

def initial(l:List[Int]):List[Int]= l match{
      case List() => Nil
      case List(x) =>Nil
      case y :: ys => y::initial(ys)
      }                                           //> initial: (l: List[Int])List[Int]
initial(numbers)                                  //> res6: List[Int] = List(1, 2, 3, 4)



def removeAt(n:Int,xs :List[Int]):List[Int] = xs match{
case List() =>List()
case x :: tl => if (n==1) tl else x::removeAt(n-1,tl)
}                                                 //> removeAt: (n: Int, xs: List[Int])List[Int]

removeAt(6,numbers)                               //> res7: List[Int] = List(1, 2, 3, 4, 5)





def flatten(l:List[Any]):List[Any]= l match{
case List()=>Nil
case (x:List[_])::tail => flatten(x)++ flatten(tail)
case h::tail=> h::flatten(tail)

}                                                 //> flatten: (l: List[Any])List[Any]
flatten(List(1,List(1,3)))                        //> res8: List[Any] = List(1, 1, 3)

def merge(xs:List[Int],ys:List[Int]):List[Int]=xs match{
case Nil => ys
case x::xs1 =>
ys match{
case Nil =>xs
case y :: ys1 =>
if (x<y) x:: merge(xs1,ys) else y:: merge(ys1,xs)
}
}                                                 //> merge: (xs: List[Int], ys: List[Int])List[Int]

//generaliser le typage

/*
def msort[T](xs:List[T])(ord:Ordering[T]):List[T]={
val n=xs.length/2
if(n==0) xs
else{
def merge2[T](xs:List[T],ys:List[T]):List[T]={
(xs,ys) match{
case (Nil,ys)=>ys
case (xs,Nil)=>xs
case (x::t,y::tl2)=>if (ord.lt(x,y)) x::merge2(t,ys) else y::merge2(xs,tl2)
}
}

val (fst,snd) = xs splitAt n
merge2(msort(fst)(lt), msort(snd)(lt))
}
}


val ls=msort()((x:Int,y:Int)=>x<y)

*/

def squareList(xs :List[Int]):List[Int]=xs match{
case Nil =>Nil
case y::ys => y*y :: squareList(ys)
}                                                 //> squareList: (xs: List[Int])List[Int]
val b=List(1,3,2,6,4,9,7)                         //> b  : List[Int] = List(1, 3, 2, 6, 4, 9, 7)
(b foldLeft 0)(_+_)                               //> res9: Int = 32
squareList(b)                                     //> res10: List[Int] = List(1, 9, 4, 36, 16, 81, 49)
def squareListe2(xs : List[Int]):List[Int] = xs map (x=>x*x)
                                                  //> squareListe2: (xs: List[Int])List[Int]
squareListe2(b)                                   //> res11: List[Int] = List(1, 9, 4, 36, 16, 81, 49)


def pack[T](xs :List[T]):List[List[T]]= xs match{
case Nil =>Nil
case y:: ys =>
val(first,rest)= xs span (x => x==y)
first :: pack(rest)


}                                                 //> pack: [T](xs: List[T])List[List[T]]
val data=List("a","a","b","v","a","a","c","c","c")//> data  : List[String] = List(a, a, b, v, a, a, c, c, c)

pack(data)                                        //> res12: List[List[String]] = List(List(a, a), List(b), List(v), List(a, a), 
                                                  //| List(c, c, c))
def encode[T](xs:List[T]):(List[(T,Int)])=
pack(xs) map (ys =>(ys.head,ys.length))           //> encode: [T](xs: List[T])List[(T, Int)]
data.flatMap(w=>List((w,data.takeWhile(x=>x==w).length)))
                                                  //> res13: List[(String, Int)] = List((a,2), (a,2), (b,0), (v,0), (a,2), (a,2),
                                                  //|  (c,0), (c,0), (c,0))
 val enc=encode(data)                             //> enc  : List[(String, Int)] = List((a,2), (b,1), (v,1), (a,2), (c,3))

//foldLeft ne peut pas etre appliquer ici
def concat[T](xs:List[T],ys:List[T]):List[T]= (xs foldRight ys) (_ :: _)
                                                  //> concat: [T](xs: List[T], ys: List[T])List[T]
concat(b,data)                                    //> res14: List[Any] = List(1, 3, 2, 6, 4, 9, 7, a, a, b, v, a, a, c, c, c)


}