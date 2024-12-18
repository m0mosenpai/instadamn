package X;

/* renamed from: X.Y9o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73358Y9o implements YNY {
    public final C005001p A00;

    @Override // X.YNY
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C72177XRn BTc() {
        C72177XRn c72177XRn = new C72177XRn();
        C005001p c005001p = this.A00;
        int size = c005001p.size();
        for (int i = 0; i < size; i++) {
            Object A05 = c005001p.A05(i);
            Object A06 = c005001p.A06(i);
            A06.getClass();
            c72177XRn.A00.put(A05, ((YNY) A06).BTc());
        }
        return c72177XRn;
    }

    public C73358Y9o(C005001p c005001p) {
        C005001p c005001p2 = new C005001p(0);
        this.A00 = c005001p2;
        c005001p2.A09(c005001p);
    }
}
