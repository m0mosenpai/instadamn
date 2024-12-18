package X;

/* loaded from: classes12.dex */
public final class XQT extends AbstractC29571bY {
    public final /* synthetic */ C164457Xk A00;

    @Override // X.AbstractC29601bb
    public final String createQuery() {
        return "INSERT OR REPLACE INTO `user_impression_tracker` (`intervention_type`,`user_id`,`total_impressions`,`last_impression_timestamp`) VALUES (?,?,?,?)";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XQT(C1YP c1yp, C164457Xk c164457Xk) {
        super(c1yp);
        this.A00 = c164457Xk;
    }

    @Override // X.AbstractC29571bY
    public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
        XVX xvx = (XVX) obj;
        interfaceC37561ot.ADp(1, xvx.A02);
        interfaceC37561ot.ADp(2, xvx.A03);
        interfaceC37561ot.ADi(3, xvx.A01);
        interfaceC37561ot.ADi(4, xvx.A00);
    }
}
