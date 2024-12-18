package X;

/* renamed from: X.ACl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23011ACl {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final EnumC222589rz A04;
    public final String A05;

    public C23011ACl(EnumC222589rz enumC222589rz, String str, float f, int i, int i2, int i3) {
        C14360o3.A0B(enumC222589rz, 2);
        this.A05 = str;
        this.A04 = enumC222589rz;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23011ACl) {
                C23011ACl c23011ACl = (C23011ACl) obj;
                if (!C14360o3.A0K(this.A05, c23011ACl.A05) || this.A04 != c23011ACl.A04 || this.A02 != c23011ACl.A02 || this.A01 != c23011ACl.A01 || this.A03 != c23011ACl.A03 || Float.compare(this.A00, c23011ACl.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0J(this.A05)) + this.A02) * 31) + this.A01) * 31) + this.A03) * 31) + Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DetectionResultData(videoPath=");
        A1C.append(this.A05);
        A1C.append(", type=");
        A1C.append(this.A04);
        A1C.append(", videoSegmentId=");
        A1C.append(this.A02);
        A1C.append(AbstractC111324zv.A00(3443));
        A1C.append(this.A01);
        A1C.append(", durationInMs=");
        A1C.append(this.A03);
        A1C.append(", rating=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
