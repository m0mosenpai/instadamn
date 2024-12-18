package X;

/* loaded from: classes10.dex */
public final class SPJ {
    public final float A00;
    public final float A01;
    public final Boolean A02;
    public final Float A03;
    public final Float A04;
    public final Integer A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SPJ) {
                SPJ spj = (SPJ) obj;
                if (Float.compare(this.A00, spj.A00) != 0 || Float.compare(this.A01, spj.A01) != 0 || !C14360o3.A0K(this.A05, spj.A05) || !C14360o3.A0K(this.A03, spj.A03) || !C14360o3.A0K(this.A04, spj.A04) || !C14360o3.A0K(this.A02, spj.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A00(Float.floatToIntBits(this.A00) * 31, this.A01) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public SPJ(Boolean bool, Float f, Float f2, Integer num, float f3, float f4) {
        this.A00 = f3;
        this.A01 = f4;
        this.A05 = num;
        this.A03 = f;
        this.A04 = f2;
        this.A02 = bool;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BoxShadow(offsetX=");
        A1C.append(this.A00);
        A1C.append(", offsetY=");
        A1C.append(this.A01);
        A1C.append(MSV.A00(128));
        A1C.append(this.A05);
        A1C.append(AbstractC111324zv.A00(3351));
        A1C.append(this.A03);
        A1C.append(", spreadDistance=");
        A1C.append(this.A04);
        A1C.append(", inset=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
