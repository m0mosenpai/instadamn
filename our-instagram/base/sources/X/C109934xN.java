package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GatingResponseType;
import java.util.List;

/* renamed from: X.4xN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109934xN extends C0T6 implements InterfaceC109944xO {
    public final GatingResponseType A00;
    public final Boolean A01;
    public final Integer A02;
    public final Long A03;
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
    public final List A0G;
    public final List A0H;

    @Override // X.InterfaceC109944xO
    public final C109934xN Etm() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109934xN) {
                C109934xN c109934xN = (C109934xN) obj;
                if (!C14360o3.A0K(this.A0G, c109934xN.A0G) || !C14360o3.A0K(this.A04, c109934xN.A04) || !C14360o3.A0K(this.A05, c109934xN.A05) || !C14360o3.A0K(this.A06, c109934xN.A06) || !C14360o3.A0K(this.A0H, c109934xN.A0H) || !C14360o3.A0K(this.A07, c109934xN.A07) || !C14360o3.A0K(this.A08, c109934xN.A08) || !C14360o3.A0K(this.A09, c109934xN.A09) || this.A00 != c109934xN.A00 || !C14360o3.A0K(this.A03, c109934xN.A03) || !C14360o3.A0K(this.A02, c109934xN.A02) || !C14360o3.A0K(this.A0A, c109934xN.A0A) || !C14360o3.A0K(this.A0B, c109934xN.A0B) || !C14360o3.A0K(this.A0C, c109934xN.A0C) || !C14360o3.A0K(this.A01, c109934xN.A01) || !C14360o3.A0K(this.A0D, c109934xN.A0D) || !C14360o3.A0K(this.A0E, c109934xN.A0E) || !C14360o3.A0K(this.A0F, c109934xN.A0F)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A0G;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.A04;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A05;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A06;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list2 = this.A0H;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.A07;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A08;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A09;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        GatingResponseType gatingResponseType = this.A00;
        int hashCode9 = (hashCode8 + (gatingResponseType == null ? 0 : gatingResponseType.hashCode())) * 31;
        Long l = this.A03;
        int hashCode10 = (hashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.A02;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.A0A;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A0B;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.A0C;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode15 = (hashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str10 = this.A0D;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.A0E;
        int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.A0F;
        return hashCode17 + (str12 != null ? str12.hashCode() : 0);
    }

    @Override // X.InterfaceC109944xO
    public final List Aam() {
        return this.A0G;
    }

    @Override // X.InterfaceC109944xO
    public final String Aan() {
        return this.A04;
    }

    @Override // X.InterfaceC109944xO
    public final String Aao() {
        return this.A05;
    }

    @Override // X.InterfaceC109944xO
    public final String AgN() {
        return this.A06;
    }

    @Override // X.InterfaceC109944xO
    public final List AjH() {
        return this.A0H;
    }

    @Override // X.InterfaceC109944xO
    public final String Ami() {
        return this.A07;
    }

    @Override // X.InterfaceC109944xO
    public final String Avq() {
        return this.A08;
    }

    @Override // X.InterfaceC109944xO
    public final GatingResponseType B9V() {
        return this.A00;
    }

    @Override // X.InterfaceC109944xO
    public final Long BR2() {
        return this.A03;
    }

    @Override // X.InterfaceC109944xO
    public final Integer BUD() {
        return this.A02;
    }

    @Override // X.InterfaceC109944xO
    public final String BaM() {
        return this.A0A;
    }

    @Override // X.InterfaceC109944xO
    public final String Bf5() {
        return this.A0B;
    }

    @Override // X.InterfaceC109944xO
    public final Boolean Bwd() {
        return this.A01;
    }

    @Override // X.InterfaceC109944xO
    public final String C8Q() {
        return this.A0D;
    }

    @Override // X.InterfaceC109944xO
    public final String CCO() {
        return this.A0F;
    }

    @Override // X.InterfaceC109944xO
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGatingDict", AbstractC39934HnP.A00(this));
    }

    @Override // X.InterfaceC109944xO
    public final String getDescription() {
        return this.A09;
    }

    @Override // X.InterfaceC109944xO
    public final String getSessionId() {
        return this.A0C;
    }

    @Override // X.InterfaceC109944xO
    public final String getTitle() {
        return this.A0E;
    }

    public C109934xN(GatingResponseType gatingResponseType, Boolean bool, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, List list2) {
        this.A0G = list;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A0H = list2;
        this.A07 = str4;
        this.A08 = str5;
        this.A09 = str6;
        this.A00 = gatingResponseType;
        this.A03 = l;
        this.A02 = num;
        this.A0A = str7;
        this.A0B = str8;
        this.A0C = str9;
        this.A01 = bool;
        this.A0D = str10;
        this.A0E = str11;
        this.A0F = str12;
    }
}
