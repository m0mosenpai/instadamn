package X;

/* renamed from: X.AaI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23445AaI implements InterfaceC177137u9 {
    public final /* synthetic */ C23453AaQ A00;

    public C23445AaI(C23453AaQ c23453AaQ) {
        this.A00 = c23453AaQ;
    }

    @Override // X.InterfaceC177137u9
    public final void DIG(C177047u0 c177047u0) {
        C23453AaQ c23453AaQ = this.A00;
        c23453AaQ.A01 = c177047u0;
        C175227qw c175227qw = c23453AaQ.A02;
        if (c175227qw != null) {
            if (c175227qw.A09()) {
                C23453AaQ.A00(c23453AaQ);
            } else if (c23453AaQ.A00 != null) {
                try {
                    c23453AaQ.A02.A07("onFrameCaptured", c23453AaQ.A07);
                } catch (Exception unused) {
                }
            }
        }
    }
}
