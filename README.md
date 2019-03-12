# BroadcastReceiverSample

BroadcastReceiverlar ile ilgili basit önekler yer almaktadır. Butonlara tıklandığında ilgili receiverlar çağırılıp, Toast ile ekrana yazdırılıyor.

 public void sendBroadcastMessage(View view){

        //Intent intent = new Intent(this, MyFirstReceiver.class);
        Intent intent = new Intent("my.custom.action.name");
        intent.putExtra("ad", "İsmail Hakkı Aydın");
        intent.putExtra("yas",24);
        sendBroadcast(intent);

    }
    
    public class MyFirstReceiver extends BroadcastReceiver {

    private static final String TAG = MyFirstReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {

        String isim=intent.getStringExtra("ad");
        int yas = intent.getIntExtra("yas",0);

        Toast.makeText(context, "Birinci Receiver "+ isim +" "+yas, Toast.LENGTH_LONG).show();

    }
}kodları ilave edilerek broadcast ile veri trasnferleri yapabiliyoruz. aynı zaman da bu işlemleri intent yerine bundle ile de gerçekleştirebiliyoruz.

 Intent intent = new Intent("my.custom.anotheraction.name");
 
        Bundle bundle=new Bundle();
        bundle.putString("ad", "ismail hakkı aydın");
        bundle.putInt("yas", 24);
        intent.putExtras(bundle);
 
        sendBroadcast(intent);
 

![alt text](https://github.com/ihaydinn/BroadcastReceiverSample/blob/master/broadcastreceiver.png)
![alt text](https://github.com/ihaydinn/BroadcastReceiverSample/blob/master/broadcastreceiver2.png)
