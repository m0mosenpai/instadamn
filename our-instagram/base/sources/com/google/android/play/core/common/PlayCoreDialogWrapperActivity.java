package com.google.android.play.core.common;

import X.AbstractC166987dD;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC43592JPx;
import X.AbstractC58321PtD;
import X.C0f9;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes10.dex */
public class PlayCoreDialogWrapperActivity extends Activity {
    public ResultReceiver A00;

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.A00);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.A00) != null) {
            if (i2 == -1) {
                i3 = 1;
            } else if (i2 == 0) {
                i3 = 2;
            }
            resultReceiver.send(i3, AbstractC166987dD.A0b());
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        int i;
        int A09 = AbstractC58321PtD.A09(this, -924004523);
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            AbstractC43592JPx.A08(this).setSystemUiVisibility(intExtra);
            intent = AbstractC31171DnF.A04();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle == null) {
            this.A00 = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            Bundle A0A = AbstractC31173DnH.A0A(this);
            if (A0A == null) {
                ResultReceiver resultReceiver = this.A00;
                if (resultReceiver != null) {
                    resultReceiver.send(3, AbstractC166987dD.A0b());
                }
                finish();
                i = -1123026840;
            } else {
                try {
                    startIntentSenderForResult(((PendingIntent) A0A.get("confirmation_intent")).getIntentSender(), 0, intent, 0, 0, 0);
                    i = -1465725522;
                } catch (IntentSender.SendIntentException unused) {
                    ResultReceiver resultReceiver2 = this.A00;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(3, AbstractC166987dD.A0b());
                    }
                    finish();
                    i = -384836722;
                }
            }
        } else {
            this.A00 = (ResultReceiver) bundle.getParcelable("result_receiver");
            i = -458680952;
        }
        C0f9.A07(i, A09);
    }
}
