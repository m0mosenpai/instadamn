package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OnImpressionStyle;

/* renamed from: X.51L, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C51L extends C0T6 implements InterfaceC104934o6 {
    public final OnImpressionStyle A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    @Override // X.InterfaceC104934o6
    public final C51L ExV() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51L) {
                C51L c51l = (C51L) obj;
                if (!C14360o3.A0K(this.A01, c51l.A01) || !C14360o3.A0K(this.A02, c51l.A02) || !C14360o3.A0K(this.A03, c51l.A03) || !C14360o3.A0K(this.A04, c51l.A04) || !C14360o3.A0K(this.A05, c51l.A05) || !C14360o3.A0K(this.A06, c51l.A06) || !C14360o3.A0K(this.A07, c51l.A07) || !C14360o3.A0K(this.A08, c51l.A08) || !C14360o3.A0K(this.A09, c51l.A09) || !C14360o3.A0K(this.A0A, c51l.A0A) || !C14360o3.A0K(this.A0B, c51l.A0B) || !C14360o3.A0K(this.A0C, c51l.A0C) || !C14360o3.A0K(this.A0D, c51l.A0D) || this.A00 != c51l.A00 || !C14360o3.A0K(this.A0E, c51l.A0E) || !C14360o3.A0K(this.A0F, c51l.A0F)) {
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
        String str8 = this.A08;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.A09;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.A0A;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.A0B;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.A0C;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.A0D;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        OnImpressionStyle onImpressionStyle = this.A00;
        int hashCode14 = (hashCode13 + (onImpressionStyle == null ? 0 : onImpressionStyle.hashCode())) * 31;
        String str14 = this.A0E;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.A0F;
        return hashCode15 + (str15 != null ? str15.hashCode() : 0);
    }

    @Override // X.InterfaceC104934o6
    public final String AyO() {
        return this.A01;
    }

    @Override // X.InterfaceC104934o6
    public final String BWP() {
        return this.A02;
    }

    @Override // X.InterfaceC104934o6
    public final String BWQ() {
        return this.A03;
    }

    @Override // X.InterfaceC104934o6
    public final String BWR() {
        return this.A04;
    }

    @Override // X.InterfaceC104934o6
    public final String BWS() {
        return this.A05;
    }

    @Override // X.InterfaceC104934o6
    public final String BWT() {
        return this.A06;
    }

    @Override // X.InterfaceC104934o6
    public final String BWU() {
        return this.A07;
    }

    @Override // X.InterfaceC104934o6
    public final String Beh() {
        return this.A08;
    }

    @Override // X.InterfaceC104934o6
    public final String Bei() {
        return this.A09;
    }

    @Override // X.InterfaceC104934o6
    public final String Bej() {
        return this.A0A;
    }

    @Override // X.InterfaceC104934o6
    public final String Bek() {
        return this.A0B;
    }

    @Override // X.InterfaceC104934o6
    public final String Bel() {
        return this.A0C;
    }

    @Override // X.InterfaceC104934o6
    public final String Bem() {
        return this.A0D;
    }

    @Override // X.InterfaceC104934o6
    public final OnImpressionStyle C35() {
        return this.A00;
    }

    @Override // X.InterfaceC104934o6
    public final String C3Z() {
        return this.A0E;
    }

    @Override // X.InterfaceC104934o6
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTOnImpressionControlDict", CDQ.A00(this));
    }

    @Override // X.InterfaceC104934o6
    public final String getText() {
        return this.A0F;
    }

    public C51L(OnImpressionStyle onImpressionStyle, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A08 = str8;
        this.A09 = str9;
        this.A0A = str10;
        this.A0B = str11;
        this.A0C = str12;
        this.A0D = str13;
        this.A00 = onImpressionStyle;
        this.A0E = str14;
        this.A0F = str15;
    }
}
