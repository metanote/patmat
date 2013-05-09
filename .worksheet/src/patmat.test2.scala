package patmat
import Huffman._
import Ordering._
object test2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(108); 
  println("Welcome to the Scala worksheet");$skip(32); 

def mult(x:Int)(y:Int):Int=x*y;System.out.println("""mult: (x: Int)(y: Int)Int""");$skip(31); 
def mult2(x:Int,y:Int):Int=x*y;System.out.println("""mult2: (x: Int, y: Int)Int""");$skip(11); val res$0 = 
mult2(3,4);System.out.println("""res0: Int = """ + $show(res$0));$skip(18); 
 val m = mult(3)_;System.out.println("""m  : Int => Int = """ + $show(m ));$skip(6); val res$1 = 
 m(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(46); 
 
 def gg(c:List[Char] ):Char={c(c.length-1)};System.out.println("""gg: (c: List[Char])Char""");$skip(42); 
 val a= List(List('c','d'),List('a','x'));System.out.println("""a  : List[List[Char]] = """ + $show(a ));$skip(11); val res$2 = 
 a.flatten;System.out.println("""res2: List[Char] = """ + $show(res$2));$skip(32); 
 
 val l =List('a','c','v','s');System.out.println("""l  : List[Char] = """ + $show(l ));$skip(45); 
def f(c:Char):Char=if (c=='a') 'x' else  'y';System.out.println("""f: (c: Char)Char""");$skip(25); val res$3 = 

l.flatMap(x=>f(x)::Nil);System.out.println("""res3: List[Char] = """ + $show(res$3));$skip(111); 
 
 
 val table :List[(Char,List[Int])]=List(('a',List(1,0,0,0,1)),('d',List(1,1,0,0,0)),('b',List(1,1,0,0,0)));System.out.println("""table  : List[(Char, List[Int])] = """ + $show(table ));$skip(29); 
val kff=codeBits(table)('d');System.out.println("""kff  : List[patmat.Huffman.Bit] = """ + $show(kff ));$skip(33); 
    val numbers =List(1,2,3,4,5);System.out.println("""numbers  : List[Int] = """ + $show(numbers ));$skip(45); val res$4 = 
    
    
    numbers.flatMap(x=> List(x+1));System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(21); val res$5 = 
 numbers.map(x=>x*2);System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(141); 

def initial(l:List[Int]):List[Int]= l match{
      case List() => Nil
      case List(x) =>Nil
      case y :: ys => y::initial(ys)
      };System.out.println("""initial: (l: List[Int])List[Int]""");$skip(17); val res$6 = 
initial(numbers);System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(136); 



def removeAt(n:Int,xs :List[Int]):List[Int] = xs match{
case List() =>List()
case x :: tl => if (n==1) tl else x::removeAt(n-1,tl)
};System.out.println("""removeAt: (n: Int, xs: List[Int])List[Int]""");$skip(21); val res$7 = 

removeAt(6,numbers);System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(155); 





def flatten(l:List[Any]):List[Any]= l match{
case List()=>Nil
case (x:List[_])::tail => flatten(x)++ flatten(tail)
case h::tail=> h::flatten(tail)

};System.out.println("""flatten: (l: List[Any])List[Any]""");$skip(27); val res$8 = 
flatten(List(1,List(1,3)));System.out.println("""res8: List[Any] = """ + $show(res$8));$skip(183); 

def merge(xs:List[Int],ys:List[Int]):List[Int]=xs match{
case Nil => ys
case x::xs1 =>
ys match{
case Nil =>xs
case y :: ys1 =>
if (x<y) x:: merge(xs1,ys) else y:: merge(ys1,xs)
}
};System.out.println("""merge: (xs: List[Int], ys: List[Int])List[Int]""");$skip(513); 

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
};System.out.println("""squareList: (xs: List[Int])List[Int]""");$skip(26); 
val b=List(1,3,2,6,4,9,7);System.out.println("""b  : List[Int] = """ + $show(b ));$skip(20); val res$9 = 
(b foldLeft 0)(_+_);System.out.println("""res9: Int = """ + $show(res$9));$skip(14); val res$10 = 
squareList(b);System.out.println("""res10: List[Int] = """ + $show(res$10));$skip(61); 
def squareListe2(xs : List[Int]):List[Int] = xs map (x=>x*x);System.out.println("""squareListe2: (xs: List[Int])List[Int]""");$skip(16); val res$11 = 
squareListe2(b);System.out.println("""res11: List[Int] = """ + $show(res$11));$skip(143); 


def pack[T](xs :List[T]):List[List[T]]= xs match{
case Nil =>Nil
case y:: ys =>
val(first,rest)= xs span (x => x==y)
first :: pack(rest)


};System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(51); 
val data=List("a","a","b","v","a","a","c","c","c");System.out.println("""data  : List[String] = """ + $show(data ));$skip(12); val res$12 = 

pack(data);System.out.println("""res12: List[List[String]] = """ + $show(res$12));$skip(83); 
def encode[T](xs:List[T]):(List[(T,Int)])=
pack(xs) map (ys =>(ys.head,ys.length));System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(58); val res$13 = 
data.flatMap(w=>List((w,data.takeWhile(x=>x==w).length)));System.out.println("""res13: List[(String, Int)] = """ + $show(res$13));$skip(22); 
 val enc=encode(data);System.out.println("""enc  : List[(String, Int)] = """ + $show(enc ));$skip(116); 

//foldLeft ne peut pas etre appliquer ici
def concat[T](xs:List[T],ys:List[T]):List[T]= (xs foldRight ys) (_ :: _);System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""");$skip(15); val res$14 = 
concat(b,data);System.out.println("""res14: List[Any] = """ + $show(res$14))}


}
