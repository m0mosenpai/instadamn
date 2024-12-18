package X;

/* renamed from: X.UFp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66404UFp extends AbstractC70335WRp {
    public final /* synthetic */ InterfaceC71878X8l A00;
    public final /* synthetic */ C70332WRm A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66404UFp(InterfaceC71878X8l interfaceC71878X8l, InterfaceC71878X8l interfaceC71878X8l2, C70332WRm c70332WRm) {
        super(interfaceC71878X8l);
        this.A01 = c70332WRm;
        this.A00 = interfaceC71878X8l2;
    }

    @Override // X.InterfaceC71878X8l
    public final C69736VuW Bs4(long j) {
        C69736VuW Bs4 = this.A00.Bs4(j);
        W5N w5n = Bs4.A00;
        long j2 = w5n.A01;
        long j3 = w5n.A00;
        long j4 = this.A01.A00;
        W5N w5n2 = new W5N(j2, j3 + j4);
        W5N w5n3 = Bs4.A01;
        return new C69736VuW(w5n2, new W5N(w5n3.A01, w5n3.A00 + j4));
    }
}
