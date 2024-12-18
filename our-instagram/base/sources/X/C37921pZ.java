package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.reels.netego.BloksStoryNetegoCTAStyle;

/* renamed from: X.1pZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37921pZ extends C0T6 implements InterfaceC37931pa {
    public final int A00;
    public final C38687GzS A01;
    public final BloksStoryNetegoCTAStyle A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public C37921pZ(C38687GzS c38687GzS, BloksStoryNetegoCTAStyle bloksStoryNetegoCTAStyle, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(bloksStoryNetegoCTAStyle, 3);
        C14360o3.A0B(str3, 6);
        C14360o3.A0B(c38687GzS, 8);
        C14360o3.A0B(str5, 10);
        this.A03 = str;
        this.A04 = str2;
        this.A02 = bloksStoryNetegoCTAStyle;
        this.A00 = i;
        this.A08 = z;
        this.A05 = str3;
        this.A09 = z2;
        this.A01 = c38687GzS;
        this.A06 = str4;
        this.A07 = str5;
    }

    @Override // X.InterfaceC37931pa
    public final C37921pZ F5Y() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37921pZ) {
                C37921pZ c37921pZ = (C37921pZ) obj;
                if (!C14360o3.A0K(this.A03, c37921pZ.A03) || !C14360o3.A0K(this.A04, c37921pZ.A04) || this.A02 != c37921pZ.A02 || this.A00 != c37921pZ.A00 || this.A08 != c37921pZ.A08 || !C14360o3.A0K(this.A05, c37921pZ.A05) || this.A09 != c37921pZ.A09 || !C14360o3.A0K(this.A01, c37921pZ.A01) || !C14360o3.A0K(this.A06, c37921pZ.A06) || !C14360o3.A0K(this.A07, c37921pZ.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37931pa
    public final String AgP() {
        return this.A03;
    }

    @Override // X.InterfaceC37931pa
    public final String Ata() {
        return this.A04;
    }

    @Override // X.InterfaceC37931pa
    public final BloksStoryNetegoCTAStyle Atn() {
        return this.A02;
    }

    @Override // X.InterfaceC37931pa
    public final boolean B7p() {
        return this.A08;
    }

    @Override // X.InterfaceC37931pa
    public final C38687GzS Bbj() {
        return this.A01;
    }

    @Override // X.InterfaceC37931pa
    public final String CAR() {
        return this.A07;
    }

    @Override // X.InterfaceC37931pa
    public final boolean CS6() {
        return this.A09;
    }

    @Override // X.InterfaceC37931pa
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTBloksStoryNetegoDict", AbstractC40714I2u.A00(this));
    }

    @Override // X.InterfaceC37931pa
    public final int getDuration() {
        return this.A00;
    }

    @Override // X.InterfaceC37931pa
    public final String getId() {
        return this.A05;
    }

    @Override // X.InterfaceC37931pa
    public final String getTitle() {
        return this.A06;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A03.hashCode() * 31;
        String str = this.A04;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((hashCode2 + hashCode) * 31) + this.A02.hashCode()) * 31) + this.A00) * 31;
        int i2 = 1237;
        if (this.A08) {
            i2 = 1231;
        }
        int hashCode4 = (((hashCode3 + i2) * 31) + this.A05.hashCode()) * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        int hashCode5 = (((hashCode4 + i3) * 31) + this.A01.hashCode()) * 31;
        String str2 = this.A06;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode5 + i) * 31) + this.A07.hashCode();
    }
}
