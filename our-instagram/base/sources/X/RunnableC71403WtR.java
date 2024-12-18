package X;

import java.util.ArrayList;

/* renamed from: X.WtR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71403WtR implements Runnable {
    public final /* synthetic */ C6FQ A00;
    public final /* synthetic */ C102884kP A01;

    public RunnableC71403WtR(C6FQ c6fq, C102884kP c102884kP) {
        this.A01 = c102884kP;
        this.A00 = c6fq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC103384lE A0B;
        C102884kP c102884kP = this.A01;
        if (c102884kP != null && (A0B = c102884kP.A0B(38)) != null) {
            C131845xK.A00(this.A00, new C6FW(new ArrayList()), A0B);
        }
    }
}
