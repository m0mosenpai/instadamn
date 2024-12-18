package X;

import java.util.concurrent.Callable;

/* renamed from: X.B0g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC24907B0g implements Callable {
    public final /* synthetic */ C175247qy A00;

    public CallableC24907B0g(C175247qy c175247qy) {
        this.A00 = c175247qy;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C175247qy c175247qy = this.A00;
        C175247qy.A02(c175247qy);
        C176647tM[] c176647tMArr = c175247qy.A05;
        c176647tMArr.getClass();
        return Integer.valueOf(c176647tMArr.length);
    }
}
