
public class MyBean 		//OuterBean
{
	private SampleBean sb;	//InnerBean
	//setter
	public void setSb(SampleBean sb) {
		this.sb = sb;
	}
	//business component
	public void saySomeThing()
	{
		System.out.println("Data from MyBean:	Welcome Chanti");
		sb.sayHello();
	}
}
