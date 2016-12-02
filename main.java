/*** LOGGING OUT DATA ***/
private static final String TAG = "ClassName";
Log.d(TAG, "methodName: information" + varName);
Log.e(TAG, "methodName: error information");

/*** PRIMITIVE TYPE ***/
byte, short, long varName;
int age = 35;
double time = 1.2;
boolean oldy = (age > 35);

/*** STRING ***/
String name = "Name";
System.out.println("Name: " + name);

/*** ENUM ***/
enum LootType {POTION, RING, ARMOR}

/*** TEST CONDITION ***/
if (age < 35) { 
	System.out.println("Logic here");
} else { System.out.println("Logic here"); }

/*** ARRAY ***/
ArrayList<int> arrName = new ArrayList<>();		// initialize a new array list

/*** LOOP ***/
while (boolean_expression) {		// use break/continue
	System.out.println("Logic here"); }

do { System.out.println("Logic here"); 		// do-while
	} while (boolean_expression);

for(int i = 0; i < 5; i++) {		// for-in loop
	System.out.println(i); }

for (int item : arrayListName) {		// for-each loop
	System.out.println(item); }

/*** CLASS ***/
public class ClassName {		// defining a class
	private String handleName;		// class fields
	private int startLives;
	
	public ClassName() {		// constructor
		this("Unknown player");
	}
	public ClassName(String name) {		// constructor with different signature
		this(name, 3);
	}

	public ClassName(String name, int lives) {		// constructor with different signature
		this.handleName = name;
		this.startLives = lives;
	}
	public String getHandeName() {		// getter method for every field
		return handleName;
	}
	public void setHandleName(String name) {		// setter method for every field
		this.handleName = name;
	}
}
public class SubClassName extends ClassName {
	public SubClassName(String name, int lives) {		// call super class constructor
		super(name, lives); }
	@Override
	public void methodName(int parameter) {		// override method
		super.methodName(parameter / 2); }
}
ClassName name = new ClassName();		// create a new instance
ClassName newName = new ClassName("Name");
ClassName anotherName = new ClassName("Name", 5);

/***  ***/
/***  ***/
/***  ***/
/***  ***/
/***  ***/
/***  ***/
/***  ***/



/*** ANDROID SDK. BUTTONS AND FIELDS CONNECTION ***/
private static final String STATE_PENDING_OPERATION = "PendingOperation";
private static final String STATE_OPERAND_ONE = "OperandOne";

@Override
protected void onCreate(Bundle savedInstanceState) {
    result = (EditText) findViewById(R.id.result);
    displayOperation = (TextView) findViewById(R.id.operation);
    Button button = (Button) findViewById(R.id.button);

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Button b = (Button) view;
            newNumber.append(b.getText().toString()); }
    };
    button.setOnClickListener(listener);
}

/*** ANDROID SDK. SAVE AND LOAD STATE OF DEVICE ***/
@Override
public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
    outState.putString(STATE_PENDING_OPERATION, pendingOperation);
    if (operandOne != null)
        outState.putDouble(STATE_OPERAND_ONE, operandOne);
    super.onSaveInstanceState(outState, outPersistentState);
}

@Override
protected void onRestoreInstanceState(Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    pendingOperation = savedInstanceState.getString(STATE_PENDING_OPERATION);
    operandOne = savedInstanceState.getDouble(STATE_OPERAND_ONE);
    displayOperation.setText(pendingOperation);
}

/*** ANDROID SDK. ASYNC TASK ***/
@Override
protected void onCreate(Bundle savedInstanceState) {
    DownloadData downloadData = new DownloadData();
    downloadData.execute("http");
}
private class DownloadData extends AsyncTask<String, Void, String> {
    @Override
    protected void onPostExecute(String s) {
    	super.onPostExecute(s); }
    
    @Override
    protected String doInBackground(String... strings) {
        String rssFeed = downloadXML(strings[0]);
        if (rssFeed == null)
            Log.e(TAG, "doInBackground: Error downloading");
        return rssFeed; }
    
    private String downloadXML (String urlPath) {
        StringBuilder xmlResult = new StringBuilder();
        try {
            URL url = new URL(urlPath);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int response = connection.getResponseCode();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            int charsRead;
            char[] inputBuffer = new char[500];
            while (true) {
                charsRead = reader.read(inputBuffer);
                if (charsRead < 0)
                    break;
                if (charsRead > 0)
                    xmlResult.append(String.copyValueOf(inputBuffer, 0, charsRead));
            }
            reader.close();
            return xmlResult.toString();
        } catch (MalformedURLException e) {
            Log.e(TAG, "downloadXML: Invalid URL" + e.getMessage());
        } catch (IOException e) {
            Log.e(TAG, "downloadXML: IO Exception reading data" + e.getMessage());
        }
        return null;
    }
}

/*** ANDROID SDK. ***/

/*** ANDROID SDK. ***/
/*** ANDROID SDK. ***/
/*** ANDROID SDK. ***/
/*** ANDROID SDK. ***/
/*** ANDROID SDK. ***/
