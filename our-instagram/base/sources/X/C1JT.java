package X;

/* renamed from: X.1JT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JT implements InterfaceC06820Xy {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0o4, X.0lj] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.0YA] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0kL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0o4, X.0lj] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0lj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0lj, java.lang.Object] */
    @Override // X.InterfaceC06820Xy
    public final C0Xz AN5() {
        return new C0Xz("ig_android_thread_based_touch_responsiveness", new int[]{566768946}, new C0Y3[]{new C0Y3(new Object()), new C0Y3(new C08980d2(new Object())), new C0Y3(new InterfaceC12170kL() { // from class: X.0d3
            public final InterfaceC12170kL A00 = new Object();

            @Override // X.InterfaceC12170kL
            public final long CEQ(C0XX c0xx) {
                long CEQ = this.A00.CEQ(c0xx);
                if (CEQ > 30000) {
                    return 30000L;
                }
                if (CEQ < 500) {
                    return 0L;
                }
                return CEQ;
            }

            @Override // X.C0YA
            public final String getName() {
                return AnonymousClass001.A0e("durations_more_than_", "_capped", 500L);
            }
        })}, new InterfaceC12970lj[]{new Object(), new Object(), new AbstractC14370o4("endpoint"), new AbstractC14370o4("completion_endpoint")});
    }

    @Override // X.InterfaceC06820Xy
    public final boolean isEnabled() {
        return C20150ym.A07(AbstractC20100yh.A00(36320914924708852L));
    }
}
