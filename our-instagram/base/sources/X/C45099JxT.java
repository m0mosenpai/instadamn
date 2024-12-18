package X;

/* renamed from: X.JxT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45099JxT extends C0T6 {
    public final C51755Mte A00;
    public final C51756Mtf A01;
    public final C45103JxX A02;
    public final C31200Dnj A03;
    public final C31200Dnj A04;
    public final C31200Dnj A05;
    public final C31200Dnj A06;
    public final MUD A07;
    public final C45100JxU A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45099JxT) {
                C45099JxT c45099JxT = (C45099JxT) obj;
                if (!C14360o3.A0K(this.A08, c45099JxT.A08) || !C14360o3.A0K(this.A05, c45099JxT.A05) || !C14360o3.A0K(this.A03, c45099JxT.A03) || !C14360o3.A0K(this.A06, c45099JxT.A06) || !C14360o3.A0K(this.A07, c45099JxT.A07) || !C14360o3.A0K(this.A02, c45099JxT.A02) || !C14360o3.A0K(this.A04, c45099JxT.A04) || !C14360o3.A0K(this.A00, c45099JxT.A00) || !C14360o3.A0K(this.A01, c45099JxT.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((AbstractC25225BEi.A05(AbstractC167017dG.A0M(this.A08) * 31, AbstractC167017dG.A0M(this.A05)) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C45099JxT(C51755Mte c51755Mte, C51756Mtf c51756Mtf, C45103JxX c45103JxX, C31200Dnj c31200Dnj, C31200Dnj c31200Dnj2, C31200Dnj c31200Dnj3, C31200Dnj c31200Dnj4, MUD mud, C45100JxU c45100JxU) {
        this.A08 = c45100JxU;
        this.A05 = c31200Dnj;
        this.A03 = c31200Dnj2;
        this.A06 = c31200Dnj3;
        this.A07 = mud;
        this.A02 = c45103JxX;
        this.A04 = c31200Dnj4;
        this.A00 = c51755Mte;
        this.A01 = c51756Mtf;
    }

    public C45099JxT() {
        this(null, null, null, null, null, null, null, null, null);
    }
}
