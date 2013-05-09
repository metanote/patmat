package patmat
import scala.util.Sorting
import patmat._
import Huffman._
object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(131); 
  println("Welcome to the Scala worksheet");$skip(63); 
 
 
 
 val leaf2=Fork(Leaf('a',2),Leaf('b',3),List('a','b'),5);System.out.println("""leaf2  : patmat.Huffman.Fork = """ + $show(leaf2 ));$skip(22); 
 val leaf=Leaf('a',0);System.out.println("""leaf  : patmat.Huffman.Leaf = """ + $show(leaf ));$skip(29); val res$0 = 
 decode(leaf2,List(1,1,0,1));System.out.println("""res0: List[Char] = """ + $show(res$0));$skip(48); 
val ccc=encode(leaf2)(List('b', 'b', 'a', 'b'));System.out.println("""ccc  : List[patmat.Huffman.Bit] = """ + $show(ccc ));$skip(104); 
 
   val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9);System.out.println("""t2  : patmat.Huffman.Fork = """ + $show(t2 ));$skip(46); 
 
 val code=createCodeTree(List('a','b','c'));System.out.println("""code  : patmat.Huffman.CodeTree = """ + $show(code ));$skip(15); val res$1 = 
 convert(code);System.out.println("""res1: patmat.Huffman.CodeTable = """ + $show(res$1));$skip(76); 
 
val codeTable=List(('c',List(1,1,0)),('b',List(1,1,0)),('a',List(1,1,0)));System.out.println("""codeTable  : List[(Char, List[Int])] = """ + $show(codeTable ));$skip(93); 
 
 
 
 
 val table :List[(Char,List[Int])]=List(('a',List(1,0,0,0,1)),('b',List(1,1,0,0,0)));System.out.println("""table  : List[(Char, List[Int])] = """ + $show(table ));$skip(29); 
val kff=codeBits(table)('b');System.out.println("""kff  : List[patmat.Huffman.Bit] = """ + $show(kff ));$skip(46); val res$2 = 
 
 
quickEncode(leaf2)(List('b','b','a','b'));System.out.println("""res2: List[patmat.Huffman.Bit] = """ + $show(res$2));$skip(43); val res$3 = 
 
 
  encode(leaf2)(List('b','b','a','b'));System.out.println("""res3: List[patmat.Huffman.Bit] = """ + $show(res$3));$skip(59); 
// decode(frenchCode,secret)
 
 
 val myvect=Vector(1,3,4);System.out.println("""myvect  : scala.collection.immutable.Vector[Int] = """ + $show(myvect ));$skip(28); val res$4 = 
 myvect.foldRight(0.0)(_+_);System.out.println("""res4: Double = """ + $show(res$4));$skip(76); 
 
 def f(c :Char):List[Char] = if (c=='a') 'b'::List (c) else 'x' ::List(c);System.out.println("""f: (c: Char)List[Char]""");$skip(31); 
 
 val chars=List('a','b','c');System.out.println("""chars  : List[Char] = """ + $show(chars ));$skip(28); 


 val mymap=Map(1->2,2->3);System.out.println("""mymap  : scala.collection.immutable.Map[Int,Int] = """ + $show(mymap ));$skip(24); 
 
 val list=List(1,3,4);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(19); val res$5 = 
 
 list contains 1;System.out.println("""res5: Boolean = """ + $show(res$5));$skip(45); 
 //list.flatMap(w=>w+1)
def h(x:Int):Int=x*x;System.out.println("""h: (x: Int)Int""");$skip(49); 
val nestedNumbers = List(List(1, 2), List(3, 4));System.out.println("""nestedNumbers  : List[List[Int]] = """ + $show(nestedNumbers ));$skip(41); val res$6 = 
nestedNumbers.flatMap(x => x.map(_ * 2));System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(36); 
 def ff(x:Int)(y:Int):Int={
 x*y
 };System.out.println("""ff: (x: Int)(y: Int)Int""");$skip(19); 
 
 val aa=ff(2)(3);System.out.println("""aa  : Int = """ + $show(aa ));$skip(134); 
 
  
def insert(x:Int, xs :List[Int]):List[Int]=xs match{
case List()=>List(x)
case y :: ys => if(x<=y) x::xs else y:: insert(x,ys)
};System.out.println("""insert: (x: Int, xs: List[Int])List[Int]""");$skip(111); 
  
def isort(x :List[Int]): List[Int] = x match {
case List()=>List()
case y :: ys => {insert(y, isort(ys))}
}

type i = Int;System.out.println("""isort: (x: List[Int])List[Int]""");$skip(25); 

val x:i=1;System.out.println("""x  : patmat.test.i = """ + $show(x ));$skip(24); 
val l=List(2,1,3,4,9,5);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(10); val res$7 = 
l.drop(1);System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(10); val res$8 = 
l.drop(1);System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(8); val res$9 = 

l.tail;System.out.println("""res9: List[Int] = """ + $show(res$9));$skip(14); val res$10 = 
l filter (2<);System.out.println("""res10: List[Int] = """ + $show(res$10));$skip(25); 

def v(a: Int):Int={a*a};System.out.println("""v: (a: Int)Int""");$skip(23); 
def g(b:Int):Int={b+b};System.out.println("""g: (b: Int)Int""");$skip(59); 
def numb(v:Int=>Int,x:Int)(g:Int=>Int)={
(x-1)*g(x)*v(x)
};System.out.println("""numb: (v: Int => Int, x: Int)(g: Int => Int)Int""");$skip(21); 

val z =numb(v,3)(g);System.out.println("""z  : Int = """ + $show(z ));$skip(11); val res$11 = 


isort(l);System.out.println("""res11: List[Int] = """ + $show(res$11));$skip(126); 
def fonction(l:List[Int]) :List[Int] = l match{
case Nil => Nil
case List(x) => List(x*3)
case x :: xs =>x+1 ::fonction(xs)
};System.out.println("""fonction: (l: List[Int])List[Int]""");$skip(22); val res$12 = 
fonction(List(1,3,4));System.out.println("""res12: List[Int] = """ + $show(res$12));$skip(18); val res$13 = 
fonction(List(3));System.out.println("""res13: List[Int] = """ + $show(res$13));$skip(179); 

//def efface(c:List[Char]):List(Char)


def times(chars:List[Char]):List[(Char,Int)]=chars match{
case Nil => Nil
case x::xs => (x,chars.count(_==x))::(times(xs.filter(_!=x)))
};System.out.println("""times: (chars: List[Char])List[(Char, Int)]""");$skip(33); 

val t=times("annabccda".toList);System.out.println("""t  : List[(Char, Int)] = """ + $show(t ));$skip(17); 
val k= t.toArray;System.out.println("""k  : Array[(Char, Int)] = """ + $show(k ));$skip(45); val res$14 = 


createCodeTree(string2Chars("annabccdaa"));System.out.println("""res14: patmat.Huffman.CodeTree = """ + $show(res$14));$skip(85); val res$15 = 



scala.util.Sorting.stableSort(t)(manifest[(Char, Int)], Ordering.by(_._2)).toList;System.out.println("""res15: List[(Char, Int)] = """ + $show(res$15));$skip(66); 

 
val tree =new Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5);System.out.println("""tree  : patmat.Huffman.Fork = """ + $show(tree ));$skip(26); 
val ct =List(Leaf('e',1));System.out.println("""ct  : List[patmat.Huffman.Leaf] = """ + $show(ct ));$skip(14); 
val cc=List();System.out.println("""cc  : List[Nothing] = """ + $show(cc ));$skip(74); 
val xp=List(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5),Leaf('e',1));System.out.println("""xp  : List[Product with Serializable with patmat.Huffman.CodeTree] = """ + $show(xp ));$skip(23); 
val bool=singleton(xp);System.out.println("""bool  : Boolean = """ + $show(bool ));$skip(6); val res$16 = 
xp(0);System.out.println("""res16: Product with Serializable with patmat.Huffman.CodeTree = """ + $show(res$16));$skip(23); 
val lis =List(1,3,2,6);System.out.println("""lis  : List[Int] = """ + $show(lis ));$skip(21); 
val tt=lis.tail.tail;System.out.println("""tt  : List[Int] = """ + $show(tt ));$skip(11); val res$17 = 
lis ::: tt;System.out.println("""res17: List[Int] = """ + $show(res$17));$skip(62); 



 val tree1=List(Leaf('e', 10), Leaf('t', 7), Leaf('x', 9));System.out.println("""tree1  : List[patmat.Huffman.Leaf] = """ + $show(tree1 ));$skip(57); 

val zz=makeCodeTree(tree1(0),tree1(1))::tree1.tail.tail;System.out.println("""zz  : List[Product with Serializable with patmat.Huffman.CodeTree] = """ + $show(zz ));$skip(50); 



def multip( f : Int => Int,x:Int) :Int= f(x)*x;System.out.println("""multip: (f: Int => Int, x: Int)Int""");$skip(90); val res$18 = 

(List(makeCodeTree(tree1(0),tree1(1))) :::tree1.tail.tail).sortWith(weight(_)<weight(_));System.out.println("""res18: List[Product with Serializable with patmat.Huffman.CodeTree] = """ + $show(res$18));$skip(4); val res$19 = 

zz;System.out.println("""res19: List[Product with Serializable with patmat.Huffman.CodeTree] = """ + $show(res$19));$skip(31); val res$20 = 


until(singleton,combine)(zz);System.out.println("""res20: List[patmat.Huffman.CodeTree] = """ + $show(res$20));$skip(56); val res$21 = 
makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3)));System.out.println("""res21: List[patmat.Huffman.Leaf] = """ + $show(res$21))}

}
