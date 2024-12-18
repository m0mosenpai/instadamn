package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.LRa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48100LRa implements InterfaceC09670ek {
    public final /* synthetic */ C07S A00;
    public final /* synthetic */ C07T A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ InterfaceC24901Jp A03;

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        InterfaceC24901Jp interfaceC24901Jp;
        Object c09540e5;
        C14360o3.A0B(c07r, 1);
        if (c07r == C07P.A01(this.A00)) {
            this.A01.A0A(this);
            interfaceC24901Jp = this.A03;
            try {
                c09540e5 = this.A02.invoke();
            } catch (Throwable th) {
                c09540e5 = new C09540e5(th);
            }
        } else if (c07r == C07R.ON_DESTROY) {
            this.A01.A0A(this);
            interfaceC24901Jp = this.A03;
            CancellationException cancellationException = new CancellationException(null);
            C14360o3.A0B(cancellationException, 0);
            c09540e5 = new C09540e5(cancellationException);
        } else {
            return;
        }
        interfaceC24901Jp.resumeWith(c09540e5);
    }

    public C48100LRa(C07S c07s, C07T c07t, InterfaceC16820sZ interfaceC16820sZ, InterfaceC24901Jp interfaceC24901Jp) {
        this.A00 = c07s;
        this.A01 = c07t;
        this.A03 = interfaceC24901Jp;
        this.A02 = interfaceC16820sZ;
    }
}
