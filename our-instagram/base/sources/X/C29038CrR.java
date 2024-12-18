package X;

/* renamed from: X.CrR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29038CrR implements C2YT {
    public final int A00;
    public final C169277h1 A01;

    public C29038CrR(C169277h1 c169277h1, int i) {
        C14360o3.A0B(c169277h1, 1);
        this.A01 = c169277h1;
        this.A00 = i;
    }

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        C74V A00 = AbstractC46667Kkk.A00(c2yr.A00.A04, this.A01, this.A00);
        return new C2YU(null, A00.A02, A00.A00);
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
