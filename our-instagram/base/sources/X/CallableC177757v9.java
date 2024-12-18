package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.7v9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC177757v9 implements Callable {
    public final /* synthetic */ C175307r4 A00;

    public CallableC177757v9(C175307r4 c175307r4) {
        this.A00 = c175307r4;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C224139ux c224139ux;
        C175307r4 c175307r4 = this.A00;
        if (c175307r4.A0S) {
            List list = c175307r4.A0Q;
            if (!list.isEmpty() && (c224139ux = (C224139ux) list.remove(0)) != null) {
                c175307r4.A0P.A07("restart_preview_on_background_thread", new B1F(c175307r4, c224139ux.A00, c224139ux.A01));
            }
        }
        return null;
    }
}
