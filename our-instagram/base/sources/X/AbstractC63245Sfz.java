package X;

/* renamed from: X.Sfz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63245Sfz {
    public static final C60623REi A02(C1N8 c1n8, C63174SeZ c63174SeZ, C58443PvM c58443PvM, SXG sxg) {
        AbstractC167027dH.A12(c58443PvM, c1n8, c63174SeZ);
        C14360o3.A0B(sxg, 3);
        return new C60623REi(c1n8, c63174SeZ, c58443PvM, sxg, 1);
    }

    public static final C60623REi A03(C63174SeZ c63174SeZ, C58443PvM c58443PvM, SXG sxg) {
        AbstractC167027dH.A12(c58443PvM, c63174SeZ, sxg);
        return new C60623REi(C63579Spm.A00, c63174SeZ, c58443PvM, sxg, 0);
    }

    public static Q8J A00(C1N8 c1n8, C62962SZf c62962SZf, C58443PvM c58443PvM, SXG sxg) {
        C63174SeZ c63174SeZ = c62962SZf.A00;
        C60623REi A02 = A02(c1n8, c63174SeZ, c58443PvM, sxg);
        AbstractC63144Sdq.A02(A02);
        Q8J q8j = ((AbstractC63144Sdq) A02).A03;
        C62962SZf.A00(q8j, c63174SeZ);
        return q8j;
    }

    public static Q8J A01(SXG sxg) {
        C58443PvM A06 = C2FP.A06();
        C14360o3.A07(A06);
        C63174SeZ A04 = C2FP.A04();
        C14360o3.A07(A04);
        C60623REi A03 = A03(A04, A06, sxg);
        AbstractC63144Sdq.A02(A03);
        return ((AbstractC63144Sdq) A03).A03;
    }
}
