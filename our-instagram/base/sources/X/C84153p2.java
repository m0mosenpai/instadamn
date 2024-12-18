package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsMashupType;

/* renamed from: X.3p2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84153p2 extends C0T6 implements InterfaceC84163p3 {
    public final ClipsMashupType A00;
    public final C4GH A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    @Override // X.InterfaceC84163p3
    public final InterfaceC84163p3 EBH(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC84163p3
    public final C84153p2 F4G(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC84163p3
    public final C84153p2 F4H(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C84153p2) {
                C84153p2 c84153p2 = (C84153p2) obj;
                if (this.A09 != c84153p2.A09 || !C14360o3.A0K(this.A08, c84153p2.A08) || this.A0A != c84153p2.A0A || !C14360o3.A0K(this.A02, c84153p2.A02) || this.A0B != c84153p2.A0B || !C14360o3.A0K(this.A03, c84153p2.A03) || !C14360o3.A0K(this.A04, c84153p2.A04) || this.A0C != c84153p2.A0C || !C14360o3.A0K(this.A05, c84153p2.A05) || this.A00 != c84153p2.A00 || this.A0D != c84153p2.A0D || !C14360o3.A0K(this.A06, c84153p2.A06) || !C14360o3.A0K(this.A01, c84153p2.A01) || !C14360o3.A0K(this.A07, c84153p2.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC84163p3
    public final /* bridge */ /* synthetic */ IMZ AKf() {
        return new IMZ(this);
    }

    @Override // X.InterfaceC84163p3
    public final String B8F() {
        return this.A08;
    }

    @Override // X.InterfaceC84163p3
    public final Boolean BCG() {
        return this.A02;
    }

    @Override // X.InterfaceC84163p3
    public final ClipsMashupType BPi() {
        return this.A00;
    }

    @Override // X.InterfaceC84163p3
    public final Integer BXE() {
        return this.A06;
    }

    @Override // X.InterfaceC84163p3
    public final /* bridge */ /* synthetic */ C4GI BZr() {
        return this.A01;
    }

    @Override // X.InterfaceC84163p3
    public final Integer Bgd() {
        return this.A07;
    }

    @Override // X.InterfaceC84163p3
    public final Boolean CXM() {
        return this.A03;
    }

    @Override // X.InterfaceC84163p3
    public final Boolean CXN() {
        return this.A04;
    }

    @Override // X.InterfaceC84163p3
    public final Boolean Cc6() {
        return this.A05;
    }

    @Override // X.InterfaceC84163p3
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMashupInfo", AbstractC37355Gcx.A00(this));
    }

    @Override // X.InterfaceC84163p3
    public final boolean getCanToggleMashupsAllowed() {
        return this.A09;
    }

    @Override // X.InterfaceC84163p3
    public final boolean getHasBeenMashedUp() {
        return this.A0A;
    }

    @Override // X.InterfaceC84163p3
    public final boolean getMashupsAllowed() {
        return this.A0D;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int i = 1237;
        if (this.A09) {
            i = 1231;
        }
        int i2 = i * 31;
        String str = this.A08;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        int i5 = 1237;
        if (this.A0A) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        Boolean bool = this.A02;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i7 = (i6 + hashCode2) * 31;
        int i8 = 1237;
        if (this.A0B) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        Boolean bool2 = this.A03;
        if (bool2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool2.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        Boolean bool3 = this.A04;
        if (bool3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool3.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        int i12 = 1237;
        if (this.A0C) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        Boolean bool4 = this.A05;
        if (bool4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool4.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        ClipsMashupType clipsMashupType = this.A00;
        if (clipsMashupType == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = clipsMashupType.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        int i16 = 1237;
        if (this.A0D) {
            i16 = 1231;
        }
        int i17 = (i15 + i16) * 31;
        Integer num = this.A06;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        C4GH c4gh = this.A01;
        if (c4gh == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = c4gh.hashCode();
        }
        int i19 = (i18 + hashCode8) * 31;
        Integer num2 = this.A07;
        if (num2 != null) {
            i3 = num2.hashCode();
        }
        return i19 + i3;
    }

    @Override // X.InterfaceC84163p3
    public final boolean isCreatorRequestingMashup() {
        return this.A0B;
    }

    @Override // X.InterfaceC84163p3
    public final boolean isPivotPageAvailable() {
        return this.A0C;
    }

    public C84153p2(ClipsMashupType clipsMashupType, C4GH c4gh, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A09 = z;
        this.A08 = str;
        this.A0A = z2;
        this.A02 = bool;
        this.A0B = z3;
        this.A03 = bool2;
        this.A04 = bool3;
        this.A0C = z4;
        this.A05 = bool4;
        this.A00 = clipsMashupType;
        this.A0D = z5;
        this.A06 = num;
        this.A01 = c4gh;
        this.A07 = num2;
    }
}
