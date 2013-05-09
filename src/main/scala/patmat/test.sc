package patmat
import scala.util.Sorting
import patmat._
import Huffman._
object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
 
 
 
 val leaf2=Fork(Leaf('a',2),Leaf('b',3),List('a','b'),5)
                                                  //> leaf2  : patmat.Huffman.Fork = Fork(Leaf(a,2),Leaf(b,3),List(a, b),5)
 val leaf=Leaf('a',0)                             //> leaf  : patmat.Huffman.Leaf = Leaf(a,0)
 decode(leaf2,List(1,1,0,1))                      //>  Tree Fork(Leaf(a,2),Leaf(b,3),List(a, b),5) Bits List(1, 1, 0, 1)
                                                  //|  Tree Fork(Leaf(a,2),Leaf(b,3),List(a, b),5) Bits List(1, 0, 1)
                                                  //|  Tree Fork(Leaf(a,2),Leaf(b,3),List(a, b),5) Bits List(0, 1)
                                                  //|  Tree Fork(Leaf(a,2),Leaf(b,3),List(a, b),5) Bits List(1)
                                                  //| res0: List[Char] = List(b, b, a, b)
val ccc=encode(leaf2)(List('b', 'b', 'a', 'b'))   //> ccc  : List[patmat.Huffman.Bit] = List(1, 1, 0, 1)
 
   val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9)
                                                  //> t2  : patmat.Huffman.Fork = Fork(Fork(Leaf(a,2),Leaf(b,3),List(a, b),5),Leaf
                                                  //| (d,4),List(a, b, d),9)
 
 val code=createCodeTree(List('a','b','c'))       //> code  : patmat.Huffman.CodeTree = Fork(Leaf(c,1),Fork(Leaf(a,1),Leaf(b,1),Li
                                                  //| st(a, b),2),List(c, a, b),3)
 convert(code)                                    //> res1: patmat.Huffman.CodeTable = List((c,List(0)), (a,List(1, 0)), (b,List(1
                                                  //| , 1)))
 
val codeTable=List(('c',List(1,1,0)),('b',List(1,1,0)),('a',List(1,1,0)))
                                                  //> codeTable  : List[(Char, List[Int])] = List((c,List(1, 1, 0)), (b,List(1, 1,
                                                  //|  0)), (a,List(1, 1, 0)))
 
 
 
 
 val table :List[(Char,List[Int])]=List(('a',List(1,0,0,0,1)),('b',List(1,1,0,0,0)))
                                                  //> table  : List[(Char, List[Int])] = List((a,List(1, 0, 0, 0, 1)), (b,List(1, 
                                                  //| 1, 0, 0, 0)))
val kff=codeBits(table)('b')                      //> kff  : List[patmat.Huffman.Bit] = List(1, 1, 0, 0, 0)
 
 
quickEncode(leaf2)(List('b','b','a','b'))         //> res2: List[patmat.Huffman.Bit] = List(1, 1, 0, 1)
 
 
  encode(leaf2)(List('b','b','a','b'))            //> res3: List[patmat.Huffman.Bit] = List(1, 1, 0, 1)
// decode(frenchCode,secret)
 
 
 val myvect=Vector(1,3,4)                         //> myvect  : scala.collection.immutable.Vector[Int] = Vector(1, 3, 4)
 myvect.foldRight(0.0)(_+_)                       //> res4: Double = 8.0
 
 def f(c :Char):List[Char] = if (c=='a') 'b'::List (c) else 'x' ::List(c)
                                                  //> f: (c: Char)List[Char]
 
 val chars=List('a','b','c')                      //> chars  : List[Char] = List(a, b, c)


 val mymap=Map(1->2,2->3)                         //> mymap  : scala.collection.immutable.Map[Int,Int] = Map(1 -> 2, 2 -> 3)
 
 val list=List(1,3,4)                             //> list  : List[Int] = List(1, 3, 4)
 
 list contains 1                                  //> res5: Boolean = true
 //list.flatMap(w=>w+1)
def h(x:Int):Int=x*x                              //> h: (x: Int)Int
val nestedNumbers = List(List(1, 2), List(3, 4))  //> nestedNumbers  : List[List[Int]] = List(List(1, 2), List(3, 4))
nestedNumbers.flatMap(x => x.map(_ * 2))          //> res6: List[Int] = List(2, 4, 6, 8)
 def ff(x:Int)(y:Int):Int={
 x*y
 }                                                //> ff: (x: Int)(y: Int)Int
 
 val aa=ff(2)(3)                                  //> aa  : Int = 6
 
  
def insert(x:Int, xs :List[Int]):List[Int]=xs match{
case List()=>List(x)
case y :: ys => if(x<=y) x::xs else y:: insert(x,ys)
}                                                 //> insert: (x: Int, xs: List[Int])List[Int]
  
def isort(x :List[Int]): List[Int] = x match {
case List()=>List()
case y :: ys => {insert(y, isort(ys))}
}                                                 //> isort: (x: List[Int])List[Int]

type i = Int

val x:i=1                                         //> x  : patmat.test.i = 1
val l=List(2,1,3,4,9,5)                           //> l  : List[Int] = List(2, 1, 3, 4, 9, 5)
l.drop(1)                                         //> res7: List[Int] = List(1, 3, 4, 9, 5)
l.drop(1)                                         //> res8: List[Int] = List(1, 3, 4, 9, 5)

l.tail                                            //> res9: List[Int] = List(1, 3, 4, 9, 5)
l filter (2<)                                     //> res10: List[Int] = List(3, 4, 9, 5)

def v(a: Int):Int={a*a}                           //> v: (a: Int)Int
def g(b:Int):Int={b+b}                            //> g: (b: Int)Int
def numb(v:Int=>Int,x:Int)(g:Int=>Int)={
(x-1)*g(x)*v(x)
}                                                 //> numb: (v: Int => Int, x: Int)(g: Int => Int)Int

val z =numb(v,3)(g)                               //> z  : Int = 108


isort(l)                                          //> res11: List[Int] = List(1, 2, 3, 4, 5, 9)
def fonction(l:List[Int]) :List[Int] = l match{
case Nil => Nil
case List(x) => List(x*3)
case x :: xs =>x+1 ::fonction(xs)
}                                                 //> fonction: (l: List[Int])List[Int]
fonction(List(1,3,4))                             //> res12: List[Int] = List(2, 4, 12)
fonction(List(3))                                 //> res13: List[Int] = List(9)

//def efface(c:List[Char]):List(Char)


def times(chars:List[Char]):List[(Char,Int)]=chars match{
case Nil => Nil
case x::xs => (x,chars.count(_==x))::(times(xs.filter(_!=x)))
}                                                 //> times: (chars: List[Char])List[(Char, Int)]

val t=times("annabccda".toList)                   //> t  : List[(Char, Int)] = List((a,3), (n,2), (b,1), (c,2), (d,1))
val k= t.toArray                                  //> k  : Array[(Char, Int)] = Array((a,3), (n,2), (b,1), (c,2), (d,1))


createCodeTree(string2Chars("annabccdaa"))        //> res14: patmat.Huffman.CodeTree = Fork(Leaf(a,4),Fork(Leaf(c,2),Fork(Fork(Le
                                                  //| af(b,1),Leaf(d,1),List(b, d),2),Leaf(n,2),List(b, d, n),4),List(c, b, d, n)
                                                  //| ,6),List(a, c, b, d, n),10)



scala.util.Sorting.stableSort(t)(manifest[(Char, Int)], Ordering.by(_._2)).toList
                                                  //> res15: List[(Char, Int)] = List((b,1), (d,1), (n,2), (c,2), (a,3))

 
val tree =new Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
                                                  //> tree  : patmat.Huffman.Fork = Fork(Leaf(a,2),Leaf(b,3),List(a, b),5)
val ct =List(Leaf('e',1))                         //> ct  : List[patmat.Huffman.Leaf] = List(Leaf(e,1))
val cc=List()                                     //> cc  : List[Nothing] = List()
val xp=List(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5),Leaf('e',1))
                                                  //> xp  : List[Product with Serializable with patmat.Huffman.CodeTree] = List(F
                                                  //| ork(Leaf(a,2),Leaf(b,3),List(a, b),5), Leaf(e,1))
val bool=singleton(xp)                            //> bool  : Boolean = false
xp(0)                                             //> res16: Product with Serializable with patmat.Huffman.CodeTree = Fork(Leaf(a
                                                  //| ,2),Leaf(b,3),List(a, b),5)
val lis =List(1,3,2,6)                            //> lis  : List[Int] = List(1, 3, 2, 6)
val tt=lis.tail.tail                              //> tt  : List[Int] = List(2, 6)
lis ::: tt                                        //> res17: List[Int] = List(1, 3, 2, 6, 2, 6)



 val tree1=List(Leaf('e', 10), Leaf('t', 7), Leaf('x', 9))
                                                  //> tree1  : List[patmat.Huffman.Leaf] = List(Leaf(e,10), Leaf(t,7), Leaf(x,9))
                                                  //| 

val zz=makeCodeTree(tree1(0),tree1(1))::tree1.tail.tail
                                                  //> zz  : List[Product with Serializable with patmat.Huffman.CodeTree] = List(F
                                                  //| ork(Leaf(e,10),Leaf(t,7),List(e, t),17), Leaf(x,9))



def multip( f : Int => Int,x:Int) :Int= f(x)*x    //> multip: (f: Int => Int, x: Int)Int

(List(makeCodeTree(tree1(0),tree1(1))) :::tree1.tail.tail).sortWith(weight(_)<weight(_))
                                                  //> res18: List[Product with Serializable with patmat.Huffman.CodeTree] = List(
                                                  //| Leaf(x,9), Fork(Leaf(e,10),Leaf(t,7),List(e, t),17))

zz                                                //> res19: List[Product with Serializable with patmat.Huffman.CodeTree] = List(
                                                  //| Fork(Leaf(e,10),Leaf(t,7),List(e, t),17), Leaf(x,9))


until(singleton,combine)(zz)                      //> res20: List[patmat.Huffman.CodeTree] = List(Fork(Fork(Leaf(e,10),Leaf(t,7),
                                                  //| List(e, t),17),Leaf(x,9),List(e, t, x),26))
makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3)))
                                                  //> res21: List[patmat.Huffman.Leaf] = List(Leaf(e,1), Leaf(t,2), Leaf(x,3))

}