package X;

/* loaded from: classes12.dex */
public final class XQS extends AbstractC29571bY {
    public final /* synthetic */ C164457Xk A00;

    @Override // X.AbstractC29601bb
    public final String createQuery() {
        return "INSERT OR REPLACE INTO `global_impression_tracker` (`intervention_type`,`total_impressions`,`last_impression_timestamp`) VALUES (?,?,?)";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XQS(C1YP c1yp, C164457Xk c164457Xk) {
        super(c1yp);
        this.A00 = c164457Xk;
    }

    @Override // X.AbstractC29571bY
    public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
        XVW xvw = (XVW) obj;
        interfaceC37561ot.ADp(1, xvw.A02);
        interfaceC37561ot.ADi(2, xvw.A01);
        interfaceC37561ot.ADi(3, xvw.A00);
    }
}
