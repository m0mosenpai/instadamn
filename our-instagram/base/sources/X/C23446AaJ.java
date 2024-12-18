package X;

/* renamed from: X.AaJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23446AaJ implements InterfaceC177137u9 {
    public final /* synthetic */ C23454AaR A00;

    public C23446AaJ(C23454AaR c23454AaR) {
        this.A00 = c23454AaR;
    }

    @Override // X.InterfaceC177137u9
    public final void DIG(C177047u0 c177047u0) {
        C23454AaR c23454AaR = this.A00;
        c23454AaR.A01 = c177047u0;
        C175227qw c175227qw = c23454AaR.A02;
        if (c175227qw != null) {
            if (c175227qw.A09()) {
                C23454AaR.A01(c23454AaR);
            } else if (c23454AaR.A00 != null) {
                try {
                    c23454AaR.A02.A07("onFrameCaptured", c23454AaR.A08);
                } catch (Exception unused) {
                }
            }
        }
    }
}
