package X;

/* renamed from: X.Sdj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63138Sdj {
    public final Object A00;
    public final AbstractC62441SBu A01;

    public C63138Sdj(AbstractC62441SBu abstractC62441SBu, Object obj) {
        this.A01 = abstractC62441SBu;
        this.A00 = obj;
    }

    public static C63138Sdj A00(int i, int i2) {
        return new C63138Sdj(new AbstractC62441SBu(Integer.valueOf(i2)), Integer.valueOf(i));
    }

    public static C63138Sdj A01(long j, long j2) {
        return new C63138Sdj(new AbstractC62441SBu(Long.valueOf(j2)), Long.valueOf(j));
    }
}
