package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0Mn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC04710Mn extends BroadcastReceiver implements InterfaceC08190bh {
    public C0OK A00;

    public abstract Object A03(String str);

    public final String A04(Context context) {
        return AnonymousClass001.A0T(context.getPackageName(), getClass().getName(), '/');
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C0OK c0ok;
        int A01 = C0f9.A01(-1791394330);
        C0fM.A01(this, context, intent);
        String action = intent.getAction();
        boolean z = false;
        if (action != null) {
            if (C08310bt.A02().A00(context, intent, A03(action)) && (c0ok = this.A00) != null && c0ok.A0B(this, context, intent, null) != null) {
                z = true;
            }
        }
        C07610aa c07610aa = AbstractC08070bT.A00;
        String A04 = A04(context);
        if (z) {
            c07610aa.A00(intent, A04, null, "allow");
            C0f9.A0E(2015919216, A01, intent);
        } else {
            c07610aa.A00(intent, A04, null, "deny");
            SecurityException securityException = new SecurityException("The received intent failed one or more security checks, so no further action is allowed.");
            C0f9.A0E(1434617652, A01, intent);
            throw securityException;
        }
    }
}
