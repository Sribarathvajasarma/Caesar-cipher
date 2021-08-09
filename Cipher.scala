object Cipher {
  def main(args: Array[String]): Unit = {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size);    //Encryption function
    val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size);    //Decryption function
    val cipher=(algo:(Char,Int,String)=> Char,s:String,key:Int,a:String)=> s.map(algo(_,key,a));  // Higher order function
    print("Enter the string that needs to be encrypted: ");
    var str= scala.io.StdIn.readLine();
     print("Enter the key value: ");
    var key = scala.io.StdIn.readInt();
    val ct=cipher(E,str,key,alphabet);
    println("Encrypted String: "+ct);                           // Encrypted string
    val pt=cipher(D,ct,key,alphabet);
    println("Decrypted String: "+pt);                          // Decrypted string


  }

}

