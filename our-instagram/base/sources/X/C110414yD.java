package X;

import com.instagram.api.schemas.DemarcatorActionType;
import com.instagram.api.schemas.DemarcatorStyleEnum;
import com.instagram.api.schemas.FeedItemType;

/* renamed from: X.4yD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110414yD extends C0T6 {
    public final DemarcatorActionType A00;
    public final DemarcatorActionType A01;
    public final DemarcatorStyleEnum A02;
    public final FeedItemType A03;
    public final InterfaceC39571se A04;
    public final InterfaceC110404yC A05;
    public final InterfaceC110384yA A06;
    public final Boolean A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final Boolean A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C110414yD) {
                C110414yD c110414yD = (C110414yD) obj;
                if (!C14360o3.A0K(this.A08, c110414yD.A08) || !C14360o3.A0K(this.A09, c110414yD.A09) || !C14360o3.A0K(this.A06, c110414yD.A06) || !C14360o3.A0K(this.A05, c110414yD.A05) || !C14360o3.A0K(this.A0B, c110414yD.A0B) || !C14360o3.A0K(this.A0G, c110414yD.A0G) || !C14360o3.A0K(this.A04, c110414yD.A04) || !C14360o3.A0K(this.A07, c110414yD.A07) || !C14360o3.A0K(this.A0C, c110414yD.A0C) || this.A00 != c110414yD.A00 || !C14360o3.A0K(this.A0D, c110414yD.A0D) || this.A01 != c110414yD.A01 || this.A02 != c110414yD.A02 || !C14360o3.A0K(this.A0E, c110414yD.A0E) || !C14360o3.A0K(this.A0F, c110414yD.A0F) || this.A03 != c110414yD.A03 || !C14360o3.A0K(this.A0A, c110414yD.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A08;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.A09;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        InterfaceC110384yA interfaceC110384yA = this.A06;
        int hashCode3 = (hashCode2 + (interfaceC110384yA == null ? 0 : interfaceC110384yA.hashCode())) * 31;
        InterfaceC110404yC interfaceC110404yC = this.A05;
        int hashCode4 = (hashCode3 + (interfaceC110404yC == null ? 0 : interfaceC110404yC.hashCode())) * 31;
        String str = this.A0B;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.A0G;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        InterfaceC39571se interfaceC39571se = this.A04;
        int hashCode7 = (hashCode6 + (interfaceC39571se == null ? 0 : interfaceC39571se.hashCode())) * 31;
        Boolean bool2 = this.A07;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.A0C;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DemarcatorActionType demarcatorActionType = this.A00;
        int hashCode10 = (hashCode9 + (demarcatorActionType == null ? 0 : demarcatorActionType.hashCode())) * 31;
        String str3 = this.A0D;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DemarcatorActionType demarcatorActionType2 = this.A01;
        int hashCode12 = (hashCode11 + (demarcatorActionType2 == null ? 0 : demarcatorActionType2.hashCode())) * 31;
        DemarcatorStyleEnum demarcatorStyleEnum = this.A02;
        int hashCode13 = (hashCode12 + (demarcatorStyleEnum == null ? 0 : demarcatorStyleEnum.hashCode())) * 31;
        String str4 = this.A0E;
        int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0F;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        FeedItemType feedItemType = this.A03;
        int hashCode16 = (hashCode15 + (feedItemType == null ? 0 : feedItemType.hashCode())) * 31;
        Integer num3 = this.A0A;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    public C110414yD(DemarcatorActionType demarcatorActionType, DemarcatorActionType demarcatorActionType2, DemarcatorStyleEnum demarcatorStyleEnum, FeedItemType feedItemType, InterfaceC39571se interfaceC39571se, InterfaceC110404yC interfaceC110404yC, InterfaceC110384yA interfaceC110384yA, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5) {
        this.A08 = num;
        this.A09 = num2;
        this.A06 = interfaceC110384yA;
        this.A05 = interfaceC110404yC;
        this.A0B = str;
        this.A0G = bool;
        this.A04 = interfaceC39571se;
        this.A07 = bool2;
        this.A0C = str2;
        this.A00 = demarcatorActionType;
        this.A0D = str3;
        this.A01 = demarcatorActionType2;
        this.A02 = demarcatorStyleEnum;
        this.A0E = str4;
        this.A0F = str5;
        this.A03 = feedItemType;
        this.A0A = num3;
    }
}
