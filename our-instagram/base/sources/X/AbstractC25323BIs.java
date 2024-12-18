package X;

/* renamed from: X.BIs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25323BIs {
    public static final DH1 A00(C5TM c5tm, C07T c07t) {
        if (c07t.A07().compareTo(C07S.DESTROYED) > 0) {
            MU2 mu2 = new MU2(c5tm, 0);
            c07t.A09(mu2);
            return new DH1(c07t, mu2, 22);
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Cannot configure ");
        A1C.append(c5tm);
        A1C.append(" to disposeComposition at Lifecycle ON_DESTROY: ");
        A1C.append(c07t);
        throw AbstractC166987dD.A14(AbstractC166997dE.A0x("is already destroyed", A1C));
    }
}
