package com.android.billingclient.api;

import X.AbstractC63398SjT;
import X.C00V;
import X.C00X;
import X.C0f9;
import X.C14360o3;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import com.android.billingclient.api.ProxyBillingActivityV2;

/* loaded from: classes10.dex */
public class ProxyBillingActivityV2 extends ComponentActivity {
    public ResultReceiver A00;
    public ResultReceiver A01;
    public C00X A02;
    public C00X A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.00g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.00g] */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(1286759594);
        super.onCreate(bundle);
        this.A02 = registerForActivityResult(new Object(), new C00V() { // from class: X.Sp4
            @Override // X.C00V
            public final void Cv1(Object obj) {
                Bundle extras;
                ProxyBillingActivityV2 proxyBillingActivityV2 = ProxyBillingActivityV2.this;
                ActivityResult activityResult = (ActivityResult) obj;
                Intent intent = activityResult.A01;
                int i2 = AbstractC63398SjT.A04(intent, "ProxyBillingActivityV2").A00;
                ResultReceiver resultReceiver = proxyBillingActivityV2.A00;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i2, extras);
                }
                int i3 = activityResult.A00;
                if (i3 != -1 || i2 != 0) {
                    AbstractC63398SjT.A0A("ProxyBillingActivityV2", AnonymousClass001.A02(i3, i2, "Alternative billing only dialog finished with resultCode ", " and billing's responseCode: "));
                }
                proxyBillingActivityV2.finish();
            }
        });
        this.A03 = registerForActivityResult(new Object(), new C00V() { // from class: X.Sp5
            @Override // X.C00V
            public final void Cv1(Object obj) {
                Bundle extras;
                ProxyBillingActivityV2 proxyBillingActivityV2 = ProxyBillingActivityV2.this;
                ActivityResult activityResult = (ActivityResult) obj;
                Intent intent = activityResult.A01;
                int i2 = AbstractC63398SjT.A04(intent, "ProxyBillingActivityV2").A00;
                ResultReceiver resultReceiver = proxyBillingActivityV2.A01;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i2, extras);
                }
                int i3 = activityResult.A00;
                if (i3 != -1 || i2 != 0) {
                    AbstractC63398SjT.A0A("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", AbstractC25228BEl.A1Z(Integer.valueOf(i3), i2)));
                }
                proxyBillingActivityV2.finish();
            }
        });
        if (bundle == null) {
            AbstractC63398SjT.A09("ProxyBillingActivityV2", "Launching Play Store billing dialog");
            boolean hasExtra = getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            Intent intent = getIntent();
            if (hasExtra) {
                PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                this.A00 = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                C00X c00x = this.A02;
                C14360o3.A0B(pendingIntent, 1);
                IntentSender intentSender = pendingIntent.getIntentSender();
                C14360o3.A07(intentSender);
                c00x.A02(new IntentSenderRequest(null, intentSender, 0, 0));
                i = -863450788;
            } else {
                if (intent.hasExtra("external_payment_dialog_pending_intent")) {
                    PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
                    this.A01 = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                    C00X c00x2 = this.A03;
                    C14360o3.A0B(pendingIntent2, 1);
                    IntentSender intentSender2 = pendingIntent2.getIntentSender();
                    C14360o3.A07(intentSender2);
                    c00x2.A02(new IntentSenderRequest(null, intentSender2, 0, 0));
                    i = -1290233678;
                }
                i = 1305111881;
            }
        } else if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
            this.A00 = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            i = 963749339;
        } else {
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.A01 = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                i = -2097673036;
            }
            i = 1305111881;
        }
        C0f9.A07(i, A00);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.A00;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.A01;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
