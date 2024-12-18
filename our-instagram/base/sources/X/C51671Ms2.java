package X;

/* renamed from: X.Ms2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51671Ms2 extends C0T6 {
    public final float A00;
    public final float A01;
    public final AbstractC53632Nnd A02;
    public final AbstractC53632Nnd A03;
    public final AbstractC53632Nnd A04;
    public final AbstractC53632Nnd A05;
    public final Integer A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51671Ms2) {
                C51671Ms2 c51671Ms2 = (C51671Ms2) obj;
                if (this.A06 != c51671Ms2.A06 || Float.compare(this.A00, c51671Ms2.A00) != 0 || Float.compare(this.A01, c51671Ms2.A01) != 0 || !C14360o3.A0K(this.A03, c51671Ms2.A03) || !C14360o3.A0K(this.A05, c51671Ms2.A05) || !C14360o3.A0K(this.A04, c51671Ms2.A04) || !C14360o3.A0K(this.A02, c51671Ms2.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C51671Ms2(AbstractC53632Nnd abstractC53632Nnd, AbstractC53632Nnd abstractC53632Nnd2, AbstractC53632Nnd abstractC53632Nnd3, AbstractC53632Nnd abstractC53632Nnd4, Integer num, float f, int i) {
        f = (i & 2) != 0 ? 1.0f : f;
        float f2 = (i & 4) != 0 ? 0.25f : 0.0f;
        abstractC53632Nnd = (i & 8) != 0 ? AbstractC54335Nzt.A00 : abstractC53632Nnd;
        abstractC53632Nnd2 = (i & 16) != 0 ? AbstractC54335Nzt.A00 : abstractC53632Nnd2;
        abstractC53632Nnd3 = (i & 32) != 0 ? AbstractC54335Nzt.A00 : abstractC53632Nnd3;
        abstractC53632Nnd4 = (i & 64) != 0 ? AbstractC54335Nzt.A00 : abstractC53632Nnd4;
        AbstractC25234BEr.A0k(4, abstractC53632Nnd, abstractC53632Nnd2, abstractC53632Nnd3, abstractC53632Nnd4);
        this.A06 = num;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = abstractC53632Nnd;
        this.A05 = abstractC53632Nnd2;
        this.A04 = abstractC53632Nnd3;
        this.A02 = abstractC53632Nnd4;
    }

    public final int hashCode() {
        Integer num = this.A06;
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC25230BEn.A0C(num, AbstractC53745Npx.A00(num)) * 31, this.A00), this.A01)))));
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GridFloatingLayoutConfig(mode=");
        Integer num = this.A06;
        if (num != null) {
            str = AbstractC53745Npx.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(AbstractC43591JPw.A00(56));
        A1C.append(this.A00);
        A1C.append(", sizeRatio=");
        A1C.append(this.A01);
        A1C.append(", leftMargin=");
        A1C.append(this.A03);
        A1C.append(", topMargin=");
        A1C.append(this.A05);
        A1C.append(", rightMargin=");
        A1C.append(this.A04);
        A1C.append(", bottomMargin=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
