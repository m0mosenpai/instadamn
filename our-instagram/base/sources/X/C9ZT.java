package X;

/* renamed from: X.9ZT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZT extends C0T6 {
    public final float A00;
    public final long A01;
    public final C211729Zg A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZT) {
                C9ZT c9zt = (C9ZT) obj;
                if (!C14360o3.A0K(this.A03, c9zt.A03) || !C14360o3.A0K(this.A02, c9zt.A02) || this.A01 != c9zt.A01 || Float.compare(this.A00, c9zt.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A07(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A03))) + Float.floatToIntBits(this.A00);
    }

    public C9ZT(C211729Zg c211729Zg, String str, float f, long j) {
        AbstractC167017dG.A1P(str, c211729Zg);
        this.A03 = str;
        this.A02 = c211729Zg;
        this.A01 = j;
        this.A00 = f;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ClipsSoundEffect(effectName=");
        A1C.append(this.A03);
        A1C.append(", effectAudio=");
        A1C.append(this.A02);
        A1C.append(", startTimeMs=");
        A1C.append(this.A01);
        A1C.append(", volume=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
