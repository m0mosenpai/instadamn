package com.facebook.fxcropapp.ig;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC58323PtF;
import X.AbstractC61775RtV;
import X.AbstractC63326Sha;
import X.C0f9;
import X.C102884kP;
import X.SB7;
import X.SUY;
import X.ViewOnClickListenerC63508Sob;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.fxcrop.SimpleCropView;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.ui.base.IgButton;

/* loaded from: classes10.dex */
public class IgCropActivity extends IgFragmentActivity {
    public static final float A02 = AbstractC61775RtV.A00(16);
    public SimpleCropView A00;
    public IgButton A01 = null;

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [X.Q2d, android.os.AsyncTask] */
    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String A0I;
        String A0G;
        String A0E;
        int A00 = C0f9.A00(1392093188);
        if (!AbstractC58323PtF.A1W(this)) {
            i = 1608222977;
        } else {
            super.onCreate(bundle);
            setContentView(R.layout.simple_crop_activity_ig);
            String str = "";
            Uri uri = (Uri) getIntent().getParcelableExtra("");
            SimpleCropView simpleCropView = (SimpleCropView) findViewById(R.id.simple_crop_view);
            this.A00 = simpleCropView;
            if (simpleCropView != null && uri != null) {
                simpleCropView.setImageUri(uri);
            }
            TextView textView = (TextView) findViewById(R.id.cancel_button);
            if (textView != null) {
                C102884kP c102884kP = AbstractC63326Sha.A03;
                String str2 = "";
                if (c102884kP != null && (A0E = c102884kP.A0E()) != null) {
                    str2 = A0E;
                }
                textView.setText(str2);
                ViewOnClickListenerC63508Sob.A01(textView, 15, this);
            }
            TextView textView2 = (TextView) findViewById(R.id.done_button);
            if (textView2 != null) {
                C102884kP c102884kP2 = AbstractC63326Sha.A03;
                String str3 = "";
                if (c102884kP2 != null && (A0G = c102884kP2.A0G()) != null) {
                    str3 = A0G;
                }
                textView2.setText(str3);
                ViewOnClickListenerC63508Sob.A01(textView2, 16, this);
            }
            IgButton igButton = (IgButton) findViewById(R.id.rotate_button);
            this.A01 = igButton;
            if (igButton != null) {
                C102884kP c102884kP3 = AbstractC63326Sha.A03;
                if (c102884kP3 != null && (A0I = c102884kP3.A0I()) != null) {
                    str = A0I;
                }
                igButton.setText(str);
                ViewOnClickListenerC63508Sob.A01(this.A01, 17, this);
                String A002 = AbstractC63326Sha.A00(43);
                SB7 sb7 = new SB7(this);
                ?? asyncTask = new AsyncTask();
                asyncTask.A02 = A002;
                asyncTask.A01 = sb7;
                asyncTask.A00 = null;
                asyncTask.execute(new Void[0]);
            }
            overridePendingTransition(R.anim.fxcrop_enter_from_bottom, R.anim.fxcrop_fade_out);
            SUY.A01("ON_SHOWN_CROPPER");
            i = -48590405;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return null;
    }
}
