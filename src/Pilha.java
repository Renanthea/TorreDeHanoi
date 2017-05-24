

public class Pilha {
	
	public int iTAM = 10;
	public int iPilha[];
	public int iPos = 0;
	
	public Pilha(int n){
		
		iPilha = new int[n];
		
		
	}
	
	public int push( int iC)
	{
	if( iPos >= iTAM) return 0;
	return iPilha[ iPos++ ] = iC;
	}
	public int pop()
	{
	if( iPos == 0) return 0;
	return iPilha[ --iPos ];
	}
	public int size( )
	{
	return iPos;
	}
	public int top( )
	{
	return iPilha[iPos-1];
	}
		
}
