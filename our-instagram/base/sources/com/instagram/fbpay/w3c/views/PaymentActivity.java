package com.instagram.fbpay.w3c.views;

import X.AbstractC001800i;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AnonymousClass001;
import X.C023409i;
import X.C0K8;
import X.C14360o3;
import X.C2J7;
import X.C62968SZl;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class PaymentActivity extends IgFragmentActivity {
    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return C023409i.A0A.A08(this);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            setResult(i2, intent);
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        Object obj;
        String str;
        int i;
        Bundle extras;
        ArrayList<String> stringArrayList;
        String str2;
        Bundle extras2;
        ArrayList<String> stringArrayList2;
        super.onPostCreate(bundle);
        boolean A01 = ((C62968SZl) C2J7.A00().A03.getValue()).A01(this, getIntent());
        Intent intent = getIntent();
        if (intent != null && (extras2 = intent.getExtras()) != null && (stringArrayList2 = extras2.getStringArrayList("methodNames")) != null) {
            obj = AbstractC001800i.A0J(stringArrayList2);
        } else {
            obj = null;
        }
        if (C14360o3.A0K(obj, "https://www.facebook.com/basiccard") && A01) {
            Bundle extras3 = getIntent().getExtras();
            Integer num = null;
            if (extras3 != null) {
                str2 = extras3.getString("keyCredentialId");
            } else {
                str2 = null;
            }
            Bundle extras4 = getIntent().getExtras();
            if (extras4 != null) {
                num = Integer.valueOf(extras4.getInt("qplInstanceKey"));
            }
            i = 0;
            if (str2 != null && str2.length() != 0) {
                Intent intent2 = new Intent(this, (Class<?>) DemaskCardActivity.class);
                intent2.putExtra("keyCredentialId", str2);
                if (num != null) {
                    intent2.putExtra("qplInstanceKey", num.intValue());
                }
                startActivityForResult(intent2, 100);
                return;
            }
        } else {
            Intent intent3 = getIntent();
            if (intent3 != null && (extras = intent3.getExtras()) != null && (stringArrayList = extras.getStringArrayList("methodNames")) != null) {
                str = (String) AbstractC001800i.A0J(stringArrayList);
            } else {
                str = null;
            }
            C0K8.A0C("PaymentActivity", AnonymousClass001.A19("Cannot process card for Payment method ", str, ". isCallerAppTrusted = ", A01));
            i = 0;
        }
        finishActivity(i);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return C023409i.A0A.A08(this);
    }
}
