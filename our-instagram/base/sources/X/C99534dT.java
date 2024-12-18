package X;

import com.instagram.api.schemas.FeedItemType;
import com.instagram.api.schemas.TIXUDesignTypeEnum;
import com.instagram.api.schemas.ThreadsInFeedUnitTypeEnum;
import java.util.List;

/* renamed from: X.4dT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99534dT extends C0T6 {
    public final FeedItemType A00;
    public final InterfaceC39571se A01;
    public final InterfaceC99474dM A02;
    public final InterfaceC99474dM A03;
    public final InterfaceC99524dS A04;
    public final TIXUDesignTypeEnum A05;
    public final ThreadsInFeedUnitTypeEnum A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final List A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C99534dT) {
                C99534dT c99534dT = (C99534dT) obj;
                if (!C14360o3.A0K(this.A02, c99534dT.A02) || !C14360o3.A0K(this.A04, c99534dT.A04) || this.A00 != c99534dT.A00 || !C14360o3.A0K(this.A07, c99534dT.A07) || !C14360o3.A0K(this.A03, c99534dT.A03) || !C14360o3.A0K(this.A09, c99534dT.A09) || !C14360o3.A0K(this.A01, c99534dT.A01) || !C14360o3.A0K(this.A0E, c99534dT.A0E) || !C14360o3.A0K(this.A0A, c99534dT.A0A) || !C14360o3.A0K(this.A0F, c99534dT.A0F) || !C14360o3.A0K(this.A0B, c99534dT.A0B) || this.A06 != c99534dT.A06 || !C14360o3.A0K(this.A0C, c99534dT.A0C) || !C14360o3.A0K(this.A0D, c99534dT.A0D) || this.A05 != c99534dT.A05 || !C14360o3.A0K(this.A08, c99534dT.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        InterfaceC99474dM interfaceC99474dM = this.A02;
        int hashCode = (interfaceC99474dM == null ? 0 : interfaceC99474dM.hashCode()) * 31;
        InterfaceC99524dS interfaceC99524dS = this.A04;
        int hashCode2 = (hashCode + (interfaceC99524dS == null ? 0 : interfaceC99524dS.hashCode())) * 31;
        FeedItemType feedItemType = this.A00;
        int hashCode3 = (hashCode2 + (feedItemType == null ? 0 : feedItemType.hashCode())) * 31;
        Integer num = this.A07;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        InterfaceC99474dM interfaceC99474dM2 = this.A03;
        int hashCode5 = (hashCode4 + (interfaceC99474dM2 == null ? 0 : interfaceC99474dM2.hashCode())) * 31;
        String str = this.A09;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC39571se interfaceC39571se = this.A01;
        int hashCode7 = (hashCode6 + (interfaceC39571se == null ? 0 : interfaceC39571se.hashCode())) * 31;
        List list = this.A0E;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.A0A;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.A0F;
        int hashCode10 = (hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.A0B;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ThreadsInFeedUnitTypeEnum threadsInFeedUnitTypeEnum = this.A06;
        int hashCode12 = (hashCode11 + (threadsInFeedUnitTypeEnum == null ? 0 : threadsInFeedUnitTypeEnum.hashCode())) * 31;
        String str4 = this.A0C;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0D;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        TIXUDesignTypeEnum tIXUDesignTypeEnum = this.A05;
        int hashCode15 = (hashCode14 + (tIXUDesignTypeEnum == null ? 0 : tIXUDesignTypeEnum.hashCode())) * 31;
        Integer num2 = this.A08;
        return hashCode15 + (num2 != null ? num2.hashCode() : 0);
    }

    public C99534dT(FeedItemType feedItemType, InterfaceC39571se interfaceC39571se, InterfaceC99474dM interfaceC99474dM, InterfaceC99474dM interfaceC99474dM2, InterfaceC99524dS interfaceC99524dS, TIXUDesignTypeEnum tIXUDesignTypeEnum, ThreadsInFeedUnitTypeEnum threadsInFeedUnitTypeEnum, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, List list2) {
        this.A02 = interfaceC99474dM;
        this.A04 = interfaceC99524dS;
        this.A00 = feedItemType;
        this.A07 = num;
        this.A03 = interfaceC99474dM2;
        this.A09 = str;
        this.A01 = interfaceC39571se;
        this.A0E = list;
        this.A0A = str2;
        this.A0F = list2;
        this.A0B = str3;
        this.A06 = threadsInFeedUnitTypeEnum;
        this.A0C = str4;
        this.A0D = str5;
        this.A05 = tIXUDesignTypeEnum;
        this.A08 = num2;
    }
}
