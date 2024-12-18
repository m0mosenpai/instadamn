package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.Mva, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51832Mva extends C0T6 implements InterfaceC58166PqW {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C51756Mtf A06;
    public final C50679MYx A07;
    public final C51676Ms7 A08;
    public final EnumC53185Nfh A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final int A0E;

    public final C51832Mva A02(int i, int i2, int i3, int i4) {
        return A00(null, null, null, this, null, null, i, i2, i3, i4, 32647, false);
    }

    public final C51832Mva A03(boolean z) {
        Integer num;
        EnumC53185Nfh enumC53185Nfh;
        if (!z && this.A0A != C05F.A15 && (enumC53185Nfh = this.A09) != EnumC53185Nfh.A06 && enumC53185Nfh != EnumC53185Nfh.A0A) {
            num = C05F.A00;
        } else {
            num = this.A0A;
        }
        return A00(null, null, null, this, num, null, 0, 0, 0, 0, 32383, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51832Mva) {
                C51832Mva c51832Mva = (C51832Mva) obj;
                if (!C14360o3.A0K(this.A0B, c51832Mva.A0B) || this.A09 != c51832Mva.A09 || !C14360o3.A0K(this.A0C, c51832Mva.A0C) || this.A05 != c51832Mva.A05 || this.A02 != c51832Mva.A02 || this.A04 != c51832Mva.A04 || this.A03 != c51832Mva.A03 || this.A0D != c51832Mva.A0D || this.A0A != c51832Mva.A0A || this.A0E != c51832Mva.A0E || this.A01 != c51832Mva.A01 || this.A00 != c51832Mva.A00 || !C14360o3.A0K(this.A07, c51832Mva.A07) || !C14360o3.A0K(this.A06, c51832Mva.A06) || !C14360o3.A0K(this.A08, c51832Mva.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C51832Mva A00(C51756Mtf c51756Mtf, C50679MYx c50679MYx, C51676Ms7 c51676Ms7, C51832Mva c51832Mva, Integer num, String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        String str2;
        int i6;
        boolean z2;
        int i7;
        C51676Ms7 c51676Ms72 = c51676Ms7;
        C51756Mtf c51756Mtf2 = c51756Mtf;
        C50679MYx c50679MYx2 = c50679MYx;
        Integer num2 = num;
        boolean z3 = z;
        int i8 = i4;
        int i9 = i3;
        int i10 = i2;
        int i11 = i;
        String str3 = str;
        EnumC53185Nfh enumC53185Nfh = null;
        if ((i5 & 1) != 0) {
            str2 = c51832Mva.A0B;
        } else {
            str2 = null;
        }
        if ((i5 & 2) != 0) {
            enumC53185Nfh = c51832Mva.A09;
        }
        if ((i5 & 4) != 0) {
            str3 = c51832Mva.A0C;
        }
        if ((i5 & 8) != 0) {
            i11 = c51832Mva.A05;
        }
        if ((i5 & 16) != 0) {
            i10 = c51832Mva.A02;
        }
        if ((i5 & 32) != 0) {
            i9 = c51832Mva.A04;
        }
        if ((i5 & 64) != 0) {
            i8 = c51832Mva.A03;
        }
        if ((i5 & 128) != 0) {
            z3 = c51832Mva.A0D;
        }
        if ((i5 & 256) != 0) {
            num2 = c51832Mva.A0A;
        }
        if ((i5 & 512) != 0) {
            i6 = c51832Mva.A0E;
        } else {
            i6 = 0;
        }
        if ((i5 & 1024) != 0) {
            z2 = c51832Mva.A01;
        } else {
            z2 = false;
        }
        if ((i5 & C3OO.FLAG_MOVED) != 0) {
            i7 = c51832Mva.A00;
        } else {
            i7 = 0;
        }
        if ((i5 & 4096) != 0) {
            c50679MYx2 = c51832Mva.A07;
        }
        if ((i5 & 8192) != 0) {
            c51756Mtf2 = c51832Mva.A06;
        }
        if ((i5 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            c51676Ms72 = c51832Mva.A08;
        }
        AbstractC167027dH.A12(str2, enumC53185Nfh, str3);
        C14360o3.A0B(num2, 8);
        return new C51832Mva(c51756Mtf2, c50679MYx2, c51676Ms72, enumC53185Nfh, num2, str2, str3, i11, i10, i9, i8, i6, i7, z3, z2);
    }

    @Override // X.InterfaceC58166PqW
    public final /* synthetic */ boolean AzK() {
        return AbstractC167007dF.A1X(this.A0A, C05F.A01);
    }

    @Override // X.InterfaceC58166PqW
    public final boolean BsU() {
        return this.A0D;
    }

    @Override // X.InterfaceC58166PqW
    public final EnumC53185Nfh CBd() {
        return this.A09;
    }

    @Override // X.InterfaceC58166PqW
    public final Integer CGw() {
        return this.A0A;
    }

    @Override // X.InterfaceC58166PqW
    public final String getTitle() {
        return this.A0C;
    }

    public final int hashCode() {
        int A0D = AbstractC167007dF.A0D(this.A0D, (((((((AbstractC166997dE.A0K(this.A0C, AbstractC166997dE.A0J(this.A09, AbstractC166987dD.A0J(this.A0B))) + this.A05) * 31) + this.A02) * 31) + this.A04) * 31) + this.A03) * 31);
        Integer num = this.A0A;
        return ((((((AbstractC167007dF.A0D(this.A01, (AbstractC167017dG.A0L(num, AbstractC53903Nsc.A00(num), A0D) + this.A0E) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC166997dE.A0I(this.A08);
    }

    public C51832Mva(C51756Mtf c51756Mtf, C50679MYx c50679MYx, C51676Ms7 c51676Ms7, EnumC53185Nfh enumC53185Nfh, Integer num, String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        AbstractC167027dH.A13(str, enumC53185Nfh, str2);
        this.A0B = str;
        this.A09 = enumC53185Nfh;
        this.A0C = str2;
        this.A05 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A0D = z;
        this.A0A = num;
        this.A0E = i5;
        this.A01 = z2;
        this.A00 = i6;
        this.A07 = c50679MYx;
        this.A06 = c51756Mtf;
        this.A08 = c51676Ms7;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TimedElementModel(id=");
        A1C.append(this.A0B);
        A1C.append(", type=");
        A1C.append(this.A09);
        A1C.append(", title=");
        A1C.append(this.A0C);
        A1C.append(", startTimeMs=");
        A1C.append(this.A05);
        A1C.append(", endTimeMs=");
        A1C.append(this.A02);
        A1C.append(", originalStartTimeMs=");
        A1C.append(this.A04);
        A1C.append(", originalEndTimeMs=");
        A1C.append(this.A03);
        A1C.append(", selected=");
        A1C.append(this.A0D);
        A1C.append(", visualState=");
        Integer num = this.A0A;
        if (num != null) {
            str = AbstractC53903Nsc.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", z=");
        A1C.append(this.A0E);
        A1C.append(", hiddenRefactor=");
        A1C.append(this.A01);
        A1C.append(", textTracktitleViewExtraFrontPadding=");
        A1C.append(this.A00);
        A1C.append(", voiceMetadata=");
        A1C.append(this.A07);
        A1C.append(", drawableMetadata=");
        A1C.append(this.A06);
        A1C.append(", audioTrackMetadata=");
        return AbstractC167017dG.A0o(this.A08, A1C);
    }
}
