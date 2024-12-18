package X;

/* renamed from: X.1wQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41761wQ {
    public final C41781wS A00 = new Object();
    public final C5Fn A01;

    @Deprecated
    public static C41761wQ A00() {
        return new C41761wQ(AbstractC142856cl.A01);
    }

    public final void A01() {
        C41781wS c41781wS = this.A00;
        if (!c41781wS.A01) {
            synchronized (c41781wS) {
                if (c41781wS.A01) {
                    return;
                }
                C42651xt c42651xt = c41781wS.A00;
                c41781wS.A00 = null;
                C41781wS.A00(c42651xt);
            }
        }
    }

    public final void A02(C42221xC c42221xC, InterfaceC42241xE interfaceC42241xE) {
        A03(c42221xC, interfaceC42241xE, AbstractC42481xc.A00);
    }

    public final void A03(C42221xC c42221xC, final InterfaceC42241xE interfaceC42241xE, final Runnable runnable) {
        C5Fn c5Fn = this.A01;
        if (c5Fn != null) {
            c42221xC = c42221xC.A0O(c5Fn);
        }
        c42221xC.A0U(new InterfaceC42561xk(interfaceC42241xE, runnable) { // from class: X.1xj
            public final InterfaceC42241xE A00;
            public final Runnable A01;

            {
                this.A00 = interfaceC42241xE;
                this.A01 = runnable;
            }

            @Override // X.InterfaceC42561xk
            public final void DVo(Object obj) {
                this.A00.accept(obj);
            }

            @Override // X.InterfaceC42561xk
            public final void Dpb(C42631xr c42631xr) {
                C41761wQ.this.A00.A7o(c42631xr.A00);
            }

            @Override // X.InterfaceC42561xk
            public final void onComplete() {
                this.A01.run();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("LambdaObserver{consumer=");
                sb.append(this.A00);
                sb.append(", onComplete=");
                sb.append(this.A01);
                sb.append('}');
                return sb.toString();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.1wS] */
    public C41761wQ(C5Fn c5Fn) {
        this.A01 = c5Fn;
    }
}
