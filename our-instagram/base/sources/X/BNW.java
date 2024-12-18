package X;

/* loaded from: classes5.dex */
public final class BNW implements C2YT {
    public static final BNW A00 = new Object();

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        if (C78613fT.A06(j) && C78613fT.A05(j)) {
            int A01 = C78613fT.A01(j);
            int A002 = C78613fT.A00(j);
            return new C2YU(AbstractC78673fZ.A00(A01, A002), AbstractC25225BEi.A0d(A01, A002, 26));
        }
        throw AbstractC166987dD.A12("Need bounded constraints");
    }
}
