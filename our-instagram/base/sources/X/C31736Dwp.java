package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: X.Dwp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31736Dwp extends BroadcastReceiver implements InterfaceC37102GWm {
    public GZE A00;
    public String A01;
    public final Context A02;
    public final AtomicBoolean A03 = new AtomicBoolean(true);

    public static void A00(C31736Dwp c31736Dwp) {
        if (c31736Dwp.A03.getAndSet(false)) {
            c31736Dwp.A02.unregisterReceiver(c31736Dwp);
        }
    }

    public C31736Dwp(Context context) {
        this.A02 = context;
        C0DJ.A03(this, context, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), true);
    }

    public static void A01(C31736Dwp c31736Dwp, final String str) {
        A00(c31736Dwp);
        final GZE gze = c31736Dwp.A00;
        if (gze != null) {
            AbstractC167007dF.A0J().post(new Runnable() { // from class: X.GOK
                @Override // java.lang.Runnable
                public final void run() {
                    GZE.this.onFail(new C115095Ie(new RuntimeException(str)));
                }
            });
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        int A01 = C0f9.A01(-709490868);
        C0fM.A01(this, context, intent);
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            parcelableExtra.getClass();
            int i = ((Status) parcelableExtra).A00;
            if (i != 0) {
                if (i != 10) {
                    if (i != 15) {
                        str = "unknown";
                    } else {
                        str = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
                    }
                } else {
                    str = "dev_error";
                }
                A01(this, str);
            } else {
                final String stringExtra = intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                Pattern pattern = AbstractC13670mt.A01;
                if (stringExtra == null) {
                    stringExtra = "";
                }
                A00(this);
                this.A01 = stringExtra;
                final GZE gze = this.A00;
                if (gze != null) {
                    AbstractC167007dF.A0J().post(new Runnable() { // from class: X.GOL
                        @Override // java.lang.Runnable
                        public final void run() {
                            GZE.this.DqC(stringExtra);
                        }
                    });
                }
            }
        }
        C0f9.A0E(1550764851, A01, intent);
    }
}
