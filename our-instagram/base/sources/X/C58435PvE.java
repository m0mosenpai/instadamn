package X;

/* renamed from: X.PvE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58435PvE extends AbstractC29571bY {
    public final /* synthetic */ C1120653v A00;

    @Override // X.AbstractC29601bb
    public final String createQuery() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58435PvE(final C1YP this$0, C1120653v database) {
        super(this$0);
        this.A00 = database;
    }

    @Override // X.AbstractC29571bY
    public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot stmt, Object value) {
        C1120753w c1120753w = (C1120753w) value;
        stmt.ADp(1, c1120753w.A00);
        stmt.ADp(2, c1120753w.A01);
    }
}
