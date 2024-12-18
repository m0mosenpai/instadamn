package com.android.billingclient.api;

import X.AbstractC31171DnF;
import X.AbstractC58318PtA;
import X.AbstractC58321PtD;
import X.AbstractC63227Sfe;
import X.AbstractC63398SjT;
import X.C0f9;
import X.EnumC61081Rev;
import X.InterfaceC65616To7;
import X.RO3;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes10.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver A00;
    public ResultReceiver A01;
    public boolean A02;
    public boolean A03;

    private Intent A00() {
        Intent A0E = AbstractC58318PtA.A0E("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        A0E.setPackage(getApplicationContext().getPackageName());
        String action = A0E.getAction();
        AbstractC63227Sfe abstractC63227Sfe = AbstractC63227Sfe.$redex_init_class;
        A0E.putExtra("BROADCAST_RECEIVER_LOGGING_PAYLOAD", AbstractC63227Sfe.A02(RO3.A01(InterfaceC65616To7.A00.getOrDefault(action, EnumC61081Rev.BROADCAST_ACTION_UNSPECIFIED))).A0J());
        return A0E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            super.onActivityResult(r10, r11, r12)
            r5 = 0
            r3 = 0
            r6 = 110(0x6e, float:1.54E-43)
            java.lang.String r2 = "ProxyBillingActivity"
            r0 = 100
            if (r10 == r0) goto L36
            if (r10 == r6) goto L36
            r0 = 101(0x65, float:1.42E-43)
            if (r10 != r0) goto L2a
            int r4 = X.AbstractC63398SjT.A00(r12)
            android.os.ResultReceiver r0 = r9.A00
            if (r0 == 0) goto L24
        L1b:
            if (r12 == 0) goto L21
            android.os.Bundle r5 = r12.getExtras()
        L21:
            r0.send(r4, r5)
        L24:
            r9.A03 = r3
            r9.finish()
            return
        L2a:
            java.lang.String r1 = "Got onActivityResult with wrong requestCode: "
            java.lang.String r0 = "; skipping..."
            java.lang.String r0 = X.AnonymousClass001.A0c(r1, r0, r10)
            X.AbstractC63398SjT.A0A(r2, r0)
            goto L24
        L36:
            X.SYG r0 = X.AbstractC63398SjT.A04(r12, r2)
            int r4 = r0.A00
            r0 = -1
            if (r11 != r0) goto L42
            if (r4 == 0) goto Le5
            r11 = -1
        L42:
            java.lang.String r1 = "Activity finished with resultCode "
            java.lang.String r0 = " and billing's responseCode: "
            java.lang.String r0 = X.AnonymousClass001.A02(r11, r4, r1, r0)
            X.AbstractC63398SjT.A0A(r2, r0)
        L4d:
            android.os.ResultReceiver r0 = r9.A01
            if (r0 != 0) goto L1b
            if (r12 == 0) goto Le0
            android.os.Bundle r0 = r12.getExtras()
            java.lang.String r7 = "LAUNCH_BILLING_FLOW"
            java.lang.String r5 = "INTENT_SOURCE"
            if (r0 == 0) goto Lb8
            android.os.Bundle r0 = r12.getExtras()
            java.lang.String r2 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA"
            java.lang.String r1 = r0.getString(r2)
            if (r1 == 0) goto Lac
            java.lang.String r0 = "com.android.vending.billing.ALTERNATIVE_BILLING"
            android.content.Intent r4 = X.AbstractC58318PtA.A0E(r0)
            android.content.Context r0 = r9.getApplicationContext()
            java.lang.String r0 = r0.getPackageName()
            r4.setPackage(r0)
            r4.putExtra(r2, r1)
            java.lang.String r2 = r4.getAction()
            X.Sfe r0 = X.AbstractC63227Sfe.$redex_init_class
            X.TTj r1 = X.InterfaceC65616To7.A00
            X.Rev r0 = X.EnumC61081Rev.BROADCAST_ACTION_UNSPECIFIED
            java.lang.Object r0 = r1.getOrDefault(r2, r0)
            X.RO3 r0 = X.RO3.A01(r0)
            X.ROa r0 = X.AbstractC63227Sfe.A02(r0)
            byte[] r1 = r0.A0J()
            java.lang.String r0 = "BROADCAST_RECEIVER_LOGGING_PAYLOAD"
        L99:
            r4.putExtra(r0, r1)
        L9c:
            r4.putExtra(r5, r7)
        L9f:
            if (r10 != r6) goto La7
            r1 = 1
            java.lang.String r0 = "IS_FIRST_PARTY_PURCHASE"
            r4.putExtra(r0, r1)
        La7:
            r9.sendBroadcast(r4)
            goto L24
        Lac:
            android.content.Intent r4 = r9.A00()
            android.os.Bundle r0 = r12.getExtras()
            r4.putExtras(r0)
            goto L9c
        Lb8:
            android.content.Intent r4 = r9.A00()
            java.lang.String r0 = "Got null bundle!"
            X.AbstractC63398SjT.A0A(r2, r0)
            java.lang.String r0 = "RESPONSE_CODE"
            r8 = 6
            r4.putExtra(r0, r8)
            java.lang.String r1 = "DEBUG_MESSAGE"
            java.lang.String r0 = "An internal error occurred."
            r4.putExtra(r1, r0)
            r2 = 22
            r1 = 2
            X.SYG r0 = X.SYG.A00(r0, r8)
            X.ROY r0 = X.AbstractC63227Sfe.A00(r0, r2, r1)
            byte[] r1 = r0.A0J()
            java.lang.String r0 = "FAILURE_LOGGING_PAYLOAD"
            goto L99
        Le0:
            android.content.Intent r4 = r9.A00()
            goto L9f
        Le5:
            r4 = 0
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        PendingIntent pendingIntent;
        int i2;
        int A09 = AbstractC58321PtD.A09(this, -1052723710);
        super.onCreate(bundle);
        if (bundle == null) {
            AbstractC63398SjT.A09("ProxyBillingActivity", "Launching Play Store billing flow");
            boolean hasExtra = getIntent().hasExtra("BUY_INTENT");
            Intent intent = getIntent();
            if (hasExtra) {
                pendingIntent = (PendingIntent) intent.getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.A02 = true;
                    i2 = 110;
                }
                i2 = 100;
            } else {
                boolean hasExtra2 = intent.hasExtra("SUBS_MANAGEMENT_INTENT");
                Intent intent2 = getIntent();
                if (hasExtra2) {
                    pendingIntent = (PendingIntent) intent2.getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                    this.A01 = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                } else if (intent2.hasExtra("IN_APP_MESSAGE_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                    this.A00 = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                    i2 = 101;
                } else {
                    pendingIntent = null;
                }
                i2 = 100;
            }
            try {
                this.A03 = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i2, AbstractC31171DnF.A04(), 0, 0, 0);
                i = 164295875;
            } catch (IntentSender.SendIntentException e) {
                AbstractC63398SjT.A0B("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
                ResultReceiver resultReceiver = this.A01;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    ResultReceiver resultReceiver2 = this.A00;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, null);
                    } else {
                        Intent A00 = A00();
                        if (this.A02) {
                            A00.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        A00.putExtra("RESPONSE_CODE", 6);
                        A00.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(A00);
                    }
                }
                this.A03 = false;
                finish();
                i = 1330266237;
            }
        } else {
            AbstractC63398SjT.A09("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.A03 = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.A01 = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.A00 = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.A02 = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            i = 2129764559;
        }
        C0f9.A07(i, A09);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        int i;
        int A00 = C0f9.A00(-354970116);
        super.onDestroy();
        if (isFinishing() && this.A03) {
            Intent A002 = A00();
            A002.putExtra("RESPONSE_CODE", 1);
            A002.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(A002);
            i = -1791009161;
        } else {
            i = 447854104;
        }
        C0f9.A07(i, A00);
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.A01;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.A00;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.A03);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.A02);
    }
}
