package X;

/* renamed from: X.Mxi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51960Mxi extends C0T6 implements Cloneable {
    public EnumC53325Ni3 A00;
    public Integer A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51960Mxi) {
                C51960Mxi c51960Mxi = (C51960Mxi) obj;
                if (this.A00 != c51960Mxi.A00 || this.A06 != c51960Mxi.A06 || this.A05 != c51960Mxi.A05 || this.A04 != c51960Mxi.A04 || this.A07 != c51960Mxi.A07 || !C14360o3.A0K(this.A02, c51960Mxi.A02) || this.A03 != c51960Mxi.A03 || !C14360o3.A0K(this.A01, c51960Mxi.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, (AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A06, AbstractC166987dD.A0G(this.A00))))) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C51960Mxi(EnumC53325Ni3 enumC53325Ni3, Integer num, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = enumC53325Ni3;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = z3;
        this.A07 = z4;
        this.A02 = str;
        this.A03 = z5;
        this.A01 = num;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        Object clone = super.clone();
        C14360o3.A0C(clone, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsTimelineActionBarViewModel.ButtonState");
        return clone;
    }
}
