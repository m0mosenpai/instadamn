package X;

/* renamed from: X.WVn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70435WVn implements InterfaceC48212Jk {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70435WVn(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        if (this.A00 != 0) {
            C0w9.A06("attribution_sdk:GraphQLAttributionEventComplianceActionProvider", "GraphQL error", th);
            VgY vgY = (VgY) this.A01;
            C14360o3.A0B("GraphQL error", 0);
            C70151W8r.A01(C70151W8r.A00("get_compliance_action_failure", "GraphQL error", th, vgY.A00), "error", vgY.A01.A04);
            return;
        }
        C60622REh c60622REh = (C60622REh) this.A01;
        c60622REh.A00 = SSG.A01((Throwable) ((C2n2) this.A02).apply(th));
        c60622REh.A03(c60622REh.A00);
    }
}
