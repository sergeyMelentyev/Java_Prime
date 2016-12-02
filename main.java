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
/***  ***/

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: starting async task");
        DownloadData downloadData = new DownloadData();
        downloadData.execute("http://ax.itunes.apple.com/WebObjects/MZStoreServices.woa/ws/RSS/topfreeapplications/limit=10/xml");
        Log.d(TAG, "onCreate: done.");
    }

    private class DownloadData extends AsyncTask<String, Void, String> {
        private static final String TAG = "DownloadData";

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Log.d(TAG, "onPostExecute: parameter is " + s);
        }

        @Override
        protected String doInBackground(String... strings) {
            Log.d(TAG, "doInBackground: starts with " + strings[0]);
            String rssFeed = downloadXML(strings[0]);
            if (rssFeed == null)
                Log.e(TAG, "doInBackground: Error downloading");
            return rssFeed;
        }

        private String downloadXML (String urlPath) {
            StringBuilder xmlResult = new StringBuilder();
            try {
                URL url = new URL(urlPath);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                int response = connection.getResponseCode();
                Log.d(TAG, "downloadXML: The response code was: " + response);
//                InputStream inputStream = connection.getInputStream();
//                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//                BufferedReader reader = new BufferedReader(inputStreamReader);
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

}






public class MainActivity extends AppCompatActivity {
    private EditText result;
    private EditText newNumber;
    private TextView displayOperation;

    private Double operandOne = null;
    private Double operandTwo = null;
    private String pendingOperation = "=";

    private static final String STATE_PENDING_OPERATION = "PendingOperation";
    private static final String STATE_OPERAND_ONE = "OperandOne";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (EditText) findViewById(R.id.result);
        newNumber = (EditText) findViewById(R.id.newNumber);
        displayOperation = (TextView) findViewById(R.id.operation);

        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button buttonDot = (Button) findViewById(R.id.buttonDot);
        Button buttonEquals = (Button) findViewById(R.id.buttonEquals);
        Button buttonDivide = (Button) findViewById(R.id.buttonDivide);
        Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button) view;
                newNumber.append(b.getText().toString());
            }
        };

        button0.setOnClickListener(listener);
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
        button8.setOnClickListener(listener);
        button9.setOnClickListener(listener);
        buttonDot.setOnClickListener(listener);

        View.OnClickListener opListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button) view;
                String op = b.getText().toString();
                String value = newNumber.getText().toString();
                try {
                    Double doubleValue = Double.valueOf(value);
                    performOperation(doubleValue, op);
                } catch (NumberFormatException e) {
                    newNumber.setText("");
                }
                pendingOperation = op;
                displayOperation.setText(pendingOperation);
            }
        };
        buttonEquals.setOnClickListener(opListener);
        buttonDivide.setOnClickListener(opListener);
        buttonMultiply.setOnClickListener(opListener);
        buttonMinus.setOnClickListener(opListener);
        buttonPlus.setOnClickListener(opListener);
    }

    @Override       // save state before device rotation starts
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        outState.putString(STATE_PENDING_OPERATION, pendingOperation);
        if (operandOne != null)
            outState.putDouble(STATE_OPERAND_ONE, operandOne);
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override       // load state after device rotation ends
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        pendingOperation = savedInstanceState.getString(STATE_PENDING_OPERATION);
        operandOne = savedInstanceState.getDouble(STATE_OPERAND_ONE);
        displayOperation.setText(pendingOperation);
    }

    private void performOperation(Double value, String operation) {
        if (null == operandOne)
            operandOne = value;
        else {
            operandTwo = value;
            if (pendingOperation.equals("="))
                pendingOperation = operation;
            switch (pendingOperation) {
                case "=":
                    operandOne = operandTwo;
                    break;
                case "/":
                    if (operandTwo == 0)
                        operandOne = 0.0;
                    else
                        operandOne /= operandTwo;
                    break;
                case "*":
                    operandOne *= operandTwo;
                    break;
                case "-":
                    operandOne -= operandTwo;
                    break;
                case "+":
                    operandOne += operandTwo;
                    break;
            }
        }
        result.setText(operandOne.toString());
        newNumber.setText("");
    }
}
