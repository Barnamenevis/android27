//super class
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


// sub class
public class Samand extends Peugeot
{
	//koliyeye property va method haye public va protected ra be ers mibarad
	public String speaker;
	
	public function speak(string Text)
	{
		if("door is open")
			this.speaker = Text;
			return this.speaker;
	}
}

P7 = new Samand("sdufihgi");
p7.speak("darbe khodro baaz ast");










