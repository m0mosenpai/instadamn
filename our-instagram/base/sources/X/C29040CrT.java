package X;

/* renamed from: X.CrT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29040CrT implements C2YT {
    public final C6AY A00;
    public final C6FG A01;

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C135266Ab c135266Ab;
        C14360o3.A0B(c2yr, 0);
        Object obj = c2yr.A01;
        if (obj instanceof C135266Ab) {
            c135266Ab = (C135266Ab) obj;
        } else {
            c135266Ab = null;
        }
        C135276Ac c135276Ac = C135266Ab.A04;
        C6FG c6fg = this.A01;
        C135266Ab A02 = c135276Ac.A02(c6fg.A00, c135266Ab, this.A00, c6fg, AbstractC135256Aa.A00(c6fg), -1, j);
        C79243gV c79243gV = A02.A01;
        return new C2YU(A02, c79243gV.A01(), c79243gV.A00());
    }

    public C29040CrT(C6AY c6ay, C6FG c6fg) {
        AbstractC167017dG.A1P(c6fg, c6ay);
        this.A01 = c6fg;
        this.A00 = c6ay;
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
