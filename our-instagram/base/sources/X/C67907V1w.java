package X;

/* renamed from: X.V1w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67907V1w extends AbstractC193088go {
    public final /* synthetic */ C62862tP A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ InterfaceC103384lE A03;
    public final /* synthetic */ String A04;

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        C14360o3.A0B(abstractC115105If, 0);
        C131845xK.A00(this.A01, C6FW.A01, this.A02);
        F0B.A00(abstractC115105If, "AsyncLoad", this.A04);
    }

    public C67907V1w(C62862tP c62862tP, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, String str) {
        this.A03 = interfaceC103384lE;
        this.A01 = c6fq;
        this.A00 = c62862tP;
        this.A02 = interfaceC103384lE2;
        this.A04 = str;
    }

    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C1338462s c1338462s = (C1338462s) obj;
        C14360o3.A0B(c1338462s, 0);
        C66246U5q c66246U5q = new C66246U5q(null, c1338462s.A01, this.A03, c1338462s.A03);
        C6FQ c6fq = this.A01;
        C6FG c6fg = c6fq.A03;
        C6FX c6fx = new C6FX();
        c6fx.A03(c1338462s.A02, 0);
        C6FW A00 = c6fx.A00();
        if (c6fg != null) {
            C131845xK.A00(C6FP.A00(c66246U5q, c6fg, AbstractC06930Yk.A0E()), A00, c66246U5q.A02);
        } else {
            C0w9.A03("bloks_async_load", "Async Load run with null context, this is legacy behavior");
            C6FP.A02(C6BQ.A03(C6BQ.A09(c6fq)), c66246U5q, this.A00, A00, AbstractC06930Yk.A0E());
        }
    }
}
