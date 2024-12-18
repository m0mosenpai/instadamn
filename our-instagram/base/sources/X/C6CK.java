package X;

import com.facebook.msys.mci.AccountSession;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.6CK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6CK implements InterfaceC13050lr {
    public AccountSession A00;
    public C9AS A01;
    public final java.util.Set A02 = new LinkedHashSet();

    public final synchronized void A00(C9AS c9as) {
        if (this.A01 == null) {
            this.A01 = c9as;
        }
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(final boolean z) {
        C99Q.A01("AccountSessionInvalidator.onUserSessionWillEnd").execute(new Runnable() { // from class: X.8w0
            @Override // java.lang.Runnable
            public final void run() {
                C6CK c6ck = C6CK.this;
                java.util.Set set = c6ck.A02;
                boolean z2 = z;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((C9AS) it.next()).CuN(z2);
                }
                C9AS c9as = c6ck.A01;
                if (c9as != null) {
                    c9as.CuN(z2);
                    return;
                }
                AccountSession accountSession = c6ck.A00;
                if (accountSession == null) {
                    return;
                }
                accountSession.invalidate();
            }
        });
    }
}
