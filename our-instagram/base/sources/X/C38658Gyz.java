package X;

import com.instagram.model.showreel.IgShowreelComposition;

/* renamed from: X.Gyz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38658Gyz extends C0T6 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C9C6 A04;
    public final C51760Mtj A05;
    public final C6PT A06;
    public final InterfaceC43450JHo A07;
    public final C38321qM A08;
    public final C80143i3 A09;
    public final C75113Zb A0A;
    public final IgShowreelComposition A0B;
    public final C80243iD A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38658Gyz) {
                C38658Gyz c38658Gyz = (C38658Gyz) obj;
                if (!C14360o3.A0K(this.A08, c38658Gyz.A08) || Float.compare(this.A00, c38658Gyz.A00) != 0 || this.A01 != c38658Gyz.A01 || this.A02 != c38658Gyz.A02 || this.A03 != c38658Gyz.A03 || !C14360o3.A0K(this.A06, c38658Gyz.A06) || !C14360o3.A0K(this.A0B, c38658Gyz.A0B) || !C14360o3.A0K(this.A07, c38658Gyz.A07) || !C14360o3.A0K(this.A0A, c38658Gyz.A0A) || this.A0D != c38658Gyz.A0D || !C14360o3.A0K(this.A09, c38658Gyz.A09) || this.A0E != c38658Gyz.A0E || !C14360o3.A0K(this.A0C, c38658Gyz.A0C) || !C14360o3.A0K(this.A05, c38658Gyz.A05) || !C14360o3.A0K(this.A04, c38658Gyz.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A0C, AbstractC167007dF.A0D(this.A0E, AbstractC166997dE.A0J(this.A09, AbstractC167007dF.A0D(this.A0D, AbstractC166997dE.A0J(this.A0A, (((((((((((AbstractC166997dE.A00(AbstractC166987dD.A0G(this.A08), this.A00) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31)))))) + AbstractC166997dE.A0I(this.A04);
    }

    public C38658Gyz(C9C6 c9c6, C51760Mtj c51760Mtj, C6PT c6pt, InterfaceC43450JHo interfaceC43450JHo, C38321qM c38321qM, C80143i3 c80143i3, C75113Zb c75113Zb, IgShowreelComposition igShowreelComposition, C80243iD c80243iD, float f, int i, int i2, int i3, boolean z, boolean z2) {
        this.A08 = c38321qM;
        this.A00 = f;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A06 = c6pt;
        this.A0B = igShowreelComposition;
        this.A07 = interfaceC43450JHo;
        this.A0A = c75113Zb;
        this.A0D = z;
        this.A09 = c80143i3;
        this.A0E = z2;
        this.A0C = c80243iD;
        this.A05 = c51760Mtj;
        this.A04 = c9c6;
    }
}
