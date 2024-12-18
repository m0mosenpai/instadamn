package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4ij, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102134ij extends C0T6 implements InterfaceC102144ik {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    @Override // X.InterfaceC102144ik
    public final C102134ij ErA() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C102134ij) {
                C102134ij c102134ij = (C102134ij) obj;
                if (!C14360o3.A0K(this.A01, c102134ij.A01) || !C14360o3.A0K(this.A02, c102134ij.A02) || !C14360o3.A0K(this.A03, c102134ij.A03) || !C14360o3.A0K(this.A04, c102134ij.A04) || !C14360o3.A0K(this.A05, c102134ij.A05) || !C14360o3.A0K(this.A06, c102134ij.A06) || !C14360o3.A0K(this.A07, c102134ij.A07) || !C14360o3.A0K(this.A00, c102134ij.A00) || !C14360o3.A0K(this.A08, c102134ij.A08) || !C14360o3.A0K(this.A09, c102134ij.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A04;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A05;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A06;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A07;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.A08;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.A09;
        return hashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    @Override // X.InterfaceC102144ik
    public final String AXy() {
        return this.A01;
    }

    @Override // X.InterfaceC102144ik
    public final String AeU() {
        return this.A02;
    }

    @Override // X.InterfaceC102144ik
    public final String AeW() {
        return this.A03;
    }

    @Override // X.InterfaceC102144ik
    public final String Aed() {
        return this.A04;
    }

    @Override // X.InterfaceC102144ik
    public final String Aei() {
        return this.A05;
    }

    @Override // X.InterfaceC102144ik
    public final String AvE() {
        return this.A06;
    }

    @Override // X.InterfaceC102144ik
    public final String B3Q() {
        return this.A07;
    }

    @Override // X.InterfaceC102144ik
    public final Boolean BB8() {
        return this.A00;
    }

    @Override // X.InterfaceC102144ik
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAvatarStickerDict", AbstractC39765Hkb.A00(this));
    }

    @Override // X.InterfaceC102144ik
    public final String getMediaType() {
        return this.A08;
    }

    @Override // X.InterfaceC102144ik
    public final String getUserId() {
        return this.A09;
    }

    public C102134ij(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A00 = bool;
        this.A08 = str8;
        this.A09 = str9;
    }
}
