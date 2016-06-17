public class Peugeot
{
   public string color;
   public int door;
   protected String Injector;
   private string EngineName;

   public Peugeot(string shomareyeMotor)
   {
	this.EngineName = shomareyeMotor;
   }
   public start(string FingerPrint)
   {
	if(this.MatchAsareAngosht(FingerPrint))
	{
		// roshan sho
	}
	else
	{
		// roshan nasho va yadet bashad yekbar asare angoshte eshtebah amade
		// age shod 3 bar 1 saat kaar nakon
	}
   }
   
   private MatchAsareAngosht(string angoshtSignature)
   {
	  if(angoshtSignature == 'signature angoshte sahebe mashin')
		return true;
	  else
		  return false;
   }
}
	IR324565 = new Peugeot("B7dhs");
	IR324565.color =  "red";
	IR324565.door =  2;
	
	IR324566 = new Peugeot("B7dsdf");
	IR324566.color =  "red";
	IR324566.door =  4;
	
	IR324566 = new Peugeot("Bsdfsds");
	IR324566.color =  "yellow";
	IR324566.door =  4;
	
	IR324566 = new Peugeot("Berfgv");
	IR324566.color =  "blue";
	IR324566.door =  6;
