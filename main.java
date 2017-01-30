    Button smsbtn;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        smsbtn = (Button) findViewById(R.id.sms_button);
        editText = (EditText) findViewById(R.id.editText);

        smsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = editText.getText().toString();
                String txt2 = "REG*001*0001*000000001*130*300000*15*12*12*Neel Tamhane*017xxxxxxx#";
               // String txt = "Test SMS through App :::  Office code :001,Customer code:GGP0001,SOLcontrol ID:000000001,Watt:130,Package price:300000,Down Payment:15,Installment:12,Service charge:12,Customer name:Neel Tamhane,Customer mobile numbe:017xxxxxxx# ";
                sendSMS("01963774588", txt2);
            }
        });
    }

    private void sendSMS(String phoneNumber, String message) {
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber, null, message, null, null);
    }