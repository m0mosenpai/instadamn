package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4xR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109974xR extends C0T6 implements InterfaceC109984xS {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C109974xR(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = i;
    }

    @Override // X.InterfaceC109984xS
    public final C109974xR ExW() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109974xR) {
                C109974xR c109974xR = (C109974xR) obj;
                if (!C14360o3.A0K(this.A01, c109974xR.A01) || !C14360o3.A0K(this.A02, c109974xR.A02) || this.A05 != c109974xR.A05 || this.A06 != c109974xR.A06 || this.A07 != c109974xR.A07 || !C14360o3.A0K(this.A03, c109974xR.A03) || !C14360o3.A0K(this.A04, c109974xR.A04) || this.A00 != c109974xR.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC109984xS
    public final String Ag0() {
        return this.A01;
    }

    @Override // X.InterfaceC109984xS
    public final String Ag3() {
        return this.A02;
    }

    @Override // X.InterfaceC109984xS
    public final boolean Aqx() {
        return this.A05;
    }

    @Override // X.InterfaceC109984xS
    public final String Bhz() {
        return this.A04;
    }

    @Override // X.InterfaceC109984xS
    public final int BsV() {
        return this.A00;
    }

    @Override // X.InterfaceC109984xS
    public final boolean CPv() {
        return this.A06;
    }

    @Override // X.InterfaceC109984xS
    public final boolean CbD() {
        return this.A07;
    }

    @Override // X.InterfaceC109984xS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTOpalInfo", AbstractC53786Nqc.A00(this));
    }

    @Override // X.InterfaceC109984xS
    public final String getName() {
        return this.A03;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.A01;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = ((hashCode * 31) + this.A02.hashCode()) * 31;
        int i2 = 1237;
        if (this.A05) {
            i2 = 1231;
        }
        int i3 = (hashCode3 + i2) * 31;
        int i4 = 1237;
        if (this.A06) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A07) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        String str2 = this.A03;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i8 = (i7 + hashCode2) * 31;
        String str3 = this.A04;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((i8 + i) * 31) + this.A00;
    }
}
