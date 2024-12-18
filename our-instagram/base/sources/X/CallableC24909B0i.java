package X;

import java.util.concurrent.Callable;

/* renamed from: X.B0i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC24909B0i implements Callable {
    public final /* synthetic */ C175307r4 A00;

    public CallableC24909B0i(C175307r4 c175307r4) {
        this.A00 = c175307r4;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C175307r4 c175307r4;
        try {
            c175307r4 = this.A00;
            InterfaceC177197uF interfaceC177197uF = c175307r4.A09;
            if (interfaceC177197uF != null) {
                interfaceC177197uF.A73();
            } else {
                c175307r4.A0M.A01.A01();
            }
        } catch (Exception unused) {
            c175307r4 = this.A00;
            c175307r4.A0M.A01.A01();
        }
        return c175307r4.A0M;
    }
}
