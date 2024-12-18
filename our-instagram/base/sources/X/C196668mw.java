package X;

/* renamed from: X.8mw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196668mw {
    public final /* synthetic */ C196658mv A00;

    public C196668mw(C196658mv c196658mv) {
        this.A00 = c196658mv;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.7uA, java.lang.RuntimeException] */
    public final void A00(C196698mz c196698mz) {
        C196658mv c196658mv;
        if (c196698mz.A04 == null && c196698mz.A01 == null) {
            c196658mv = this.A00;
            c196658mv.A09 = false;
            c196658mv.A07 = new RuntimeException("Could not retrieve data from photo processor.");
        } else {
            c196658mv = this.A00;
            c196658mv.A09 = true;
            c196658mv.A08 = c196698mz;
            if (c196658mv.A05) {
                if (c196658mv.A02.A01[((r2.A00 + 3) - 1) % 3] == null) {
                    return;
                }
            }
        }
        c196658mv.A03.A01();
    }
}
