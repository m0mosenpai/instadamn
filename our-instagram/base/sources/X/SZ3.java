package X;

/* loaded from: classes10.dex */
public final class SZ3 {
    public static final SZ3 A05 = new SZ3(C913945y.A03, Object.class, null, null, false);
    public final C913945y A00;
    public final Class A01;
    public final Class A02;
    public final Class A03;
    public final boolean A04;

    public SZ3(C913945y c913945y, Class cls, Class cls2, Class cls3, boolean z) {
        this.A00 = c913945y;
        this.A03 = cls;
        this.A01 = cls2;
        this.A04 = z;
        this.A02 = cls3 == null ? T2Y.class : cls3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ObjectIdInfo: propName=");
        A1C.append(this.A00);
        A1C.append(", scope=");
        A1C.append(C914045z.A06(this.A03));
        A1C.append(", generatorType=");
        A1C.append(C914045z.A06(this.A01));
        A1C.append(", alwaysAsId=");
        A1C.append(this.A04);
        return A1C.toString();
    }
}
