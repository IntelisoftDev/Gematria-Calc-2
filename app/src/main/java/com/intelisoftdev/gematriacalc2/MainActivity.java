package com.intelisoftdev.gematriacalc2;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CanvasView canvasView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        CanvasView mCanvas = (CanvasView)findViewById(R.id.instrCanvas);
        if (isFirstTime()) {
            mCanvas.setVisibility(View.INVISIBLE);
        }
        autoResize();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private boolean isFirstTime()
    {
        SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        boolean ranBefore = preferences.getBoolean("RanBefore", false);
        if (!ranBefore) {
            CanvasView mCanvas = (CanvasView)findViewById(R.id.instrCanvas);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean("RanBefore", true);
            editor.commit();
            mCanvas.setVisibility(View.VISIBLE);
        }
        return ranBefore;
    }
    private void autoResize() {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        int screenWidth = ToDp(metrics.widthPixels);
        int screenHeight = ToDp(metrics.heightPixels);
        int mBtnW = (screenWidth)/4;
        int mBtnH = (screenHeight)/4;
        int txtw = (screenWidth);
        int txth = (screenHeight)/6;
        int rotation = getWindowManager().getDefaultDisplay().getRotation();
        int textSize = 0;
        if(rotation == Surface.ROTATION_270 || rotation == Surface.ROTATION_90) {
            textSize= (screenWidth)/30;
        }
        else {
            textSize = (screenWidth)/25;
        }

        Button aBtn = (Button)findViewById(R.id.aBtn);
        aBtn.setWidth(mBtnW); aBtn.setHeight(mBtnH); aBtn.setTextSize(textSize);
        Button bBtn = (Button)findViewById(R.id.bBtn);
        bBtn.setWidth(mBtnW); bBtn.setHeight(mBtnH); bBtn.setTextSize(textSize);
        Button gBtn = (Button)findViewById(R.id.gBtn);
        gBtn.setWidth(mBtnW); gBtn.setHeight(mBtnH); gBtn.setTextSize(textSize);
        Button dBtn = (Button)findViewById(R.id.dBtn);
        dBtn.setWidth(mBtnW); dBtn.setHeight(mBtnH); dBtn.setTextSize(textSize);
        Button eBtn = (Button)findViewById(R.id.eBtn);
        eBtn.setWidth(mBtnW); eBtn.setHeight(mBtnH); eBtn.setTextSize(textSize);
        Button digammaBtn = (Button)findViewById(R.id.digammaBtn);
        digammaBtn.setWidth(mBtnW); digammaBtn.setHeight(mBtnH); digammaBtn.setTextSize(textSize);
        Button zBtn = (Button)findViewById(R.id.zBtn);
        zBtn.setWidth(mBtnW); zBtn.setHeight(mBtnH); zBtn.setTextSize(textSize);
        Button hBtn = (Button)findViewById(R.id.hBtn);
        hBtn.setWidth(mBtnW); hBtn.setHeight(mBtnH); hBtn.setTextSize(textSize);
        Button thBtn = (Button)findViewById(R.id.thBtn);
        thBtn.setWidth(mBtnW); thBtn.setHeight(mBtnH); thBtn.setTextSize(textSize);
        Button iBtn = (Button)findViewById(R.id.iBtn);
        iBtn.setWidth(mBtnW); iBtn.setHeight(mBtnH); iBtn.setTextSize(textSize);
        Button kBtn = (Button)findViewById(R.id.kBtn);
        kBtn.setWidth(mBtnW); kBtn.setHeight(mBtnH); kBtn.setTextSize(textSize);
        Button lBtn = (Button)findViewById(R.id.lBtn);
        kBtn.setWidth(mBtnW); lBtn.setHeight(mBtnH); lBtn.setTextSize(textSize);
        Button mBtn = (Button)findViewById(R.id.mBtn);
        mBtn.setWidth(mBtnW); mBtn.setHeight(mBtnH); mBtn.setTextSize(textSize);
        Button nBtn = (Button)findViewById(R.id.nBtn);
        nBtn.setWidth(mBtnW); nBtn.setHeight(mBtnH); nBtn.setTextSize(textSize);
        Button xBtn = (Button)findViewById(R.id.xBtn);
        xBtn.setWidth(mBtnW); xBtn.setHeight(mBtnH); xBtn.setTextSize(textSize);
        Button oBtn = (Button)findViewById(R.id.oBtn);
        oBtn.setWidth(mBtnW); oBtn.setHeight(mBtnH); oBtn.setTextSize(textSize);
        Button pBtn = (Button)findViewById(R.id.pBtn);
        pBtn.setWidth(mBtnW); pBtn.setHeight(mBtnH); pBtn.setTextSize(textSize);
        Button rBtn = (Button)findViewById(R.id.rBtn);
        rBtn.setWidth(mBtnW); rBtn.setHeight(mBtnH); rBtn.setTextSize(textSize);
        Button sBtn = (Button)findViewById(R.id.sBtn);
        sBtn.setWidth(mBtnW); sBtn.setHeight(mBtnH); sBtn.setTextSize(textSize);
        Button tBtn = (Button)findViewById(R.id.tBtn);
        tBtn.setWidth(mBtnW); tBtn.setHeight(mBtnH); tBtn.setTextSize(textSize);
        Button uBtn = (Button)findViewById(R.id.uBtn);
        uBtn.setWidth(mBtnW); uBtn.setHeight(mBtnH); uBtn.setTextSize(textSize);
        Button phiBtn = (Button)findViewById(R.id.phiBtn);
        phiBtn.setWidth(mBtnW); phiBtn.setHeight(mBtnH); phiBtn.setTextSize(textSize);
        Button cBtn = (Button)findViewById(R.id.cBtn);
        cBtn.setWidth(mBtnW); cBtn.setHeight(mBtnH); cBtn.setTextSize(textSize);
        Button psiBtn = (Button)findViewById(R.id.psiBtn);
        psiBtn.setWidth(mBtnW); psiBtn.setHeight(mBtnH); psiBtn.setTextSize(textSize);
        Button omegaBtn = (Button)findViewById(R.id.omegaBtn);
        omegaBtn.setWidth(mBtnW); omegaBtn.setHeight(mBtnH); omegaBtn.setTextSize(textSize);
        Button clsBtn = (Button)findViewById(R.id.clsBtn);
        clsBtn.setWidth(mBtnW); clsBtn.setHeight(mBtnH); clsBtn.setTextSize(textSize);
        // CalcBtn
        Button calcBtn = (Button)findViewById(R.id.calcBtn);
        calcBtn.setWidth(mBtnW); calcBtn.setHeight(mBtnH); calcBtn.setTextSize(textSize);

        // delBtn
        Button delBtn = (Button)findViewById(R.id.delBtn);
        delBtn.setWidth(mBtnW); delBtn.setHeight(mBtnH); delBtn.setTextSize(textSize);

        ResPack resPack = new ResPack();
        // textView
        resPack.textView.setWidth(txtw); resPack.textView.setHeight(txth); resPack.textView.setTextSize(textSize + 5);

        //SumView
        resPack.sumView.setWidth(mBtnW*2); resPack.sumView.setHeight(txth - 5); resPack.sumView.setTextSize(textSize);
        // rotation
        if(rotation == Surface.ROTATION_270 || rotation == Surface.ROTATION_90){
            textSize = (screenWidth) / 30;
            resPack.textView.setHeight(txth + 6); resPack.textView.setWidth(txtw/2 + 5);
            resPack.textView.setTextSize(textSize - 4);
            delBtn.setWidth(mBtnW + 10);
        }
    }
    private int ToDp(float pix) {
        int dp = (int)((pix)/Resources.getSystem().getDisplayMetrics().density);
        return dp;
    }
    List<String> textList = new ArrayList<String>();
    public void instrCanvasClicked(View v) {
        CanvasView mCanvas = (CanvasView)findViewById(R.id.instrCanvas);
        mCanvas.setVisibility(View.INVISIBLE);
    }
    public void aBtnClicked(View v) {
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.alpha_s);
    }
    public void bBtnClicked(View v) {
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.beta_s);
    }
    public void gBtnClicked(View v) {
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.gamma_s);
    }
    public void dBtnClicked(View v) {
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.delta_s);
    }
    public void eBtnClicked(View v) {
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.epsilon_s);
    }
    public void digammaBtnClicked(View v) {
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.digamma_s);
    }
    public void zBtnClicked(View v) {
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.zeta_s);
    }
    public void hBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.eta_s);
    }
    public void thBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.theta_s);
    }
    public void iBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.iota_s);
    }
    public void kBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.kappa_s);
    }
    public void lBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.lambda_s);
    }
    public void mBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.mu_s);
    }
    public void nBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.nu_s);
    }
    public void xBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.xi_s);
    }
    public void oBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.omicron_s);
    }
    public void pBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.pi_s);
    }
    public void rBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.rho_s);
    }
    public void sBtnClicked(View v){
        ResPack resPack = new ResPack();
        String tx1 = resPack.textView.getText().toString();
        if(tx1.length() > 1) {
            char ch = tx1.charAt(tx1.length() - 1);
            //char ch1 = resPack.textView.getText().toString().charAt(1);
            if(ch == 'σ') {
                String mtext = resPack.textView.getText().toString();
                resPack.textView.setText(mtext.substring(0, mtext.length() - 1));
                resPack.textView.append(resPack.end_sigma);
            }
            else
                resPack.textView.append(resPack.reg_sigma);
        }
        else
            resPack.textView.append(resPack.reg_sigma);
    }
    public void tBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.tau_s);
    }
    public void uBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.upsilon_s);
    }
    public void phiBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.phi_s);
    }
    public void cBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.chi_s);
    }
    public void psiBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.psi_s);
    }
    public void omegaBtnClicked(View v){
        ResPack resPack = new ResPack();
        resPack.textView.append(resPack.omega_s);
    }
    public void calcBtnClicked(View v) {
        ResPack resPack = new ResPack();
        resPack.sumView.setText("");
        int len = 0;
        int sum = 0;
        String[] textViewText = resPack.textView.getText().toString().split("");
        for(String c : textViewText) {
            textList.add(c);
        }
        while(len < textList.size()) {
            if (textList.get(len).contains(resPack.alpha_s)) {
                sum += 1;
            }
            if(textList.get(len).contains(resPack.beta_s)) {
                sum += 2;
            }
            if(textList.get(len).contains(resPack.gamma_s)) {
                sum += 3;
            }
            if(textList.get(len).contains(resPack.delta_s)) {
                sum += 4;
            }
            if(textList.get(len).contains(resPack.epsilon_s)){
                sum += 5;
            }
            if(textList.get(len).contains(resPack.digamma_s)) {
                sum += 6;
            }
            if(textList.get(len).contains(resPack.zeta_s)) {
                sum += 7;
            }
            if(textList.get(len).contains(resPack.eta_s)) {
                sum += 8;
            }
            if(textList.get(len).contains(resPack.theta_s)) {
                sum += 9;
            }
            if(textList.get(len).contains(resPack.iota_s)){
                sum += 10;
            }
            if(textList.get(len).contains(resPack.kappa_s)){
                sum += 20;
            }
            if (textList.get(len).contains(resPack.lambda_s)){
                sum += 30;
            }
            if (textList.get(len).contains(resPack.mu_s)){
                sum += 40;
            }
            if (textList.get(len).contains(resPack.nu_s)){
                sum += 50;
            }
            if (textList.get(len).contains(resPack.xi_s)){
                sum += 60;
            }
            if (textList.get(len).contains(resPack.omicron_s)){
                sum += 70;
            }
            if (textList.get(len).contains(resPack.pi_s)){
                sum += 80;
            }
            if (textList.get(len).contains(resPack.rho_s)){
                sum += 100;
            }
            if (textList.get(len).contains(resPack.reg_sigma) || textList.get(len).contains(resPack.end_sigma)){
                sum += 200;
            }
            if (textList.get(len).contains(resPack.tau_s)){
                sum += 300;
            }
            if (textList.get(len).contains(resPack.upsilon_s)) {
                sum += 400;
            }
            if (textList.get(len).contains(resPack.phi_s)) {
                sum += 500;
            }
            if (textList.get(len).contains(resPack.chi_s)){
                sum += 600;
            }
            if (textList.get(len).contains(resPack.psi_s)){
                sum += 700;
            }
            if (textList.get(len).contains(resPack.omega_s)){
                sum += 800;
            }
            len += 1;
        }

        resPack.sumView.setText(Integer.toString(sum));
        sum = 0;
        textList.clear();
    }
    public void clsAll() {
        ResPack resPack = new ResPack();
        resPack.textView.setText("");
        resPack.sumView.setText("");
    }
    public void clsBtnClicked(View v) {
        clsAll();
    }
    public void delBtnClicked(View v){
        ResPack resPack = new ResPack();
        if(resPack.textView.getText().toString() != "") {
            try {
                String mtext = resPack.textView.getText().toString();
                resPack.textView.setText(mtext.substring(0, mtext.length() - 1));
            }
            catch (Exception e){
                Toast toast = Toast.makeText(this, (String)getResources().getText(R.string.delException), Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    }
    class ResPack {
        TextView textView = (TextView)findViewById(R.id.textView);
        TextView sumView = (TextView)findViewById(R.id.sumView);
        RelativeLayout mrelativeLayout = (RelativeLayout)findViewById(R.id.mrelativeLayout);
        String alpha_s = getResources().getString(R.string.alpha_s);
        String beta_s = getResources().getString(R.string.beta_s);
        String gamma_s = getResources().getString(R.string.gamma_s);
        String delta_s = getResources().getString(R.string.delta_s);
        String epsilon_s = getResources().getString(R.string.epsilon_s);
        String digamma_s = getResources().getString(R.string.digamma_s);
        String zeta_s = getResources().getString(R.string.zeta_s);
        String eta_s = getResources().getString(R.string.eta_s);
        String theta_s = getResources().getString(R.string.theta_s);
        String iota_s = getResources().getString(R.string.iota_s);
        String lambda_s = getResources().getString(R.string.lambda_s);
        String kappa_s = getResources().getString(R.string.kappa_s);
        String mu_s = getResources().getString(R.string.mu_s);
        String  nu_s = getResources().getString(R.string.nu_s);
        String xi_s = getResources().getString(R.string.xi_s);
        String omicron_s = getResources().getString(R.string.omicron_s);
        String pi_s = getResources().getString(R.string.pi_s);
        String rho_s = getResources().getString(R.string.rho_s);
        String reg_sigma = getResources().getString(R.string.reg_sigma);
        String end_sigma = getResources().getString(R.string.end_sigma);
        String sigma_s = getResources().getString(R.string.sigma_s);
        String tau_s = getResources().getString(R.string.tau_s);
        String upsilon_s = getResources().getString(R.string.upsilon_s);
        String phi_s = getResources().getString(R.string.phi_s);
        String chi_s = getResources().getString(R.string.chi_s);
        String psi_s = getResources().getString(R.string.psi_s);
        String omega_s = getResources().getString(R.string.omega_s);
    }
}
