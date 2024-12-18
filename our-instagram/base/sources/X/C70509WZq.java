package X;

/* renamed from: X.WZq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70509WZq implements YNw {
    public final FIA A00;

    @Override // X.YNw
    public final /* bridge */ /* synthetic */ void CuU(YNq yNq, Object obj) {
        AbstractC72503XfI abstractC72503XfI = (AbstractC72503XfI) obj;
        if (abstractC72503XfI instanceof XYV) {
            XYV xyv = (XYV) abstractC72503XfI;
            String A11 = AnonymousClass001.A11(xyv.A01.A02, "&ping_id=", xyv.A03, "&ping_group_id=", xyv.A02);
            FIA fia = this.A00;
            C69073VhO c69073VhO = new C69073VhO(yNq, xyv, this);
            C1ON A00 = SU9.A00(A11);
            A00.A00 = new C67954V3t(22, fia, c69073VhO);
            fia.A00.schedule(A00);
        }
    }

    public C70509WZq(FIA fia) {
        this.A00 = fia;
    }
}
