package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IgUserBioLinkTypeEnum;

/* renamed from: X.3l6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81863l6 extends C0T6 implements InterfaceC81873l7 {
    public final InterfaceC110294y0 A00;
    public final IgUserBioLinkTypeEnum A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;

    @Override // X.InterfaceC81873l7
    public final C81863l6 F3a() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C81863l6) {
                C81863l6 c81863l6 = (C81863l6) obj;
                if (!C14360o3.A0K(this.A03, c81863l6.A03) || !C14360o3.A0K(this.A00, c81863l6.A00) || !C14360o3.A0K(this.A04, c81863l6.A04) || !C14360o3.A0K(this.A05, c81863l6.A05) || !C14360o3.A0K(this.A06, c81863l6.A06) || this.A0B != c81863l6.A0B || this.A0C != c81863l6.A0C || !C14360o3.A0K(this.A07, c81863l6.A07) || this.A01 != c81863l6.A01 || !C14360o3.A0K(this.A08, c81863l6.A08) || !C14360o3.A0K(this.A02, c81863l6.A02) || !C14360o3.A0K(this.A09, c81863l6.A09) || !C14360o3.A0K(this.A0A, c81863l6.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public C81863l6(InterfaceC110294y0 interfaceC110294y0, IgUserBioLinkTypeEnum igUserBioLinkTypeEnum, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        C14360o3.A0B(str5, 8);
        C14360o3.A0B(igUserBioLinkTypeEnum, 9);
        C14360o3.A0B(str7, 12);
        C14360o3.A0B(str8, 13);
        this.A03 = str;
        this.A00 = interfaceC110294y0;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A0B = z;
        this.A0C = z2;
        this.A07 = str5;
        this.A01 = igUserBioLinkTypeEnum;
        this.A08 = str6;
        this.A02 = bool;
        this.A09 = str7;
        this.A0A = str8;
    }

    @Override // X.InterfaceC81873l7
    public final String Anl() {
        return this.A03;
    }

    @Override // X.InterfaceC81873l7
    public final InterfaceC110294y0 B4Y() {
        return this.A00;
    }

    @Override // X.InterfaceC81873l7
    public final String BAV() {
        return this.A04;
    }

    @Override // X.InterfaceC81873l7
    public final String BEy() {
        return this.A05;
    }

    @Override // X.InterfaceC81873l7
    public final String BGu() {
        return this.A06;
    }

    @Override // X.InterfaceC81873l7
    public final String BNQ() {
        return this.A07;
    }

    @Override // X.InterfaceC81873l7
    public final IgUserBioLinkTypeEnum BNW() {
        return this.A01;
    }

    @Override // X.InterfaceC81873l7
    public final String BPS() {
        return this.A08;
    }

    @Override // X.InterfaceC81873l7
    public final Boolean BZ9() {
        return this.A02;
    }

    @Override // X.InterfaceC81873l7
    public final boolean CaK() {
        return this.A0B;
    }

    @Override // X.InterfaceC81873l7
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUserBioLinkDict", AbstractC31244DoS.A00(this));
    }

    @Override // X.InterfaceC81873l7
    public final String getTitle() {
        return this.A09;
    }

    @Override // X.InterfaceC81873l7
    public final String getUrl() {
        return this.A0A;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        InterfaceC110294y0 interfaceC110294y0 = this.A00;
        if (interfaceC110294y0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = interfaceC110294y0.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.A04;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.A05;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str4 = this.A06;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        int i7 = 1237;
        if (this.A0B) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0C) {
            i9 = 1231;
        }
        int hashCode7 = (((((i8 + i9) * 31) + this.A07.hashCode()) * 31) + this.A01.hashCode()) * 31;
        String str5 = this.A08;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i10 = (hashCode7 + hashCode6) * 31;
        Boolean bool = this.A02;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((((i10 + i) * 31) + this.A09.hashCode()) * 31) + this.A0A.hashCode();
    }

    @Override // X.InterfaceC81873l7
    public final boolean isVerified() {
        return this.A0C;
    }
}
