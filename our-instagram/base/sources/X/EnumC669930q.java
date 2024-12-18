package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.30q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC669930q {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC669930q[] A01;
    public static final EnumC669930q A02;
    public static final EnumC669930q A03;
    public static final EnumC669930q A04;
    public static final EnumC669930q A05;
    public static final EnumC669930q A06;
    public static final EnumC669930q A07;
    public static final EnumC669930q A08;
    public static final EnumC669930q A09;
    public static final EnumC669930q A0A;
    public static final EnumC669930q A0B;
    public static final EnumC669930q A0C;
    public static final EnumC669930q A0D;
    public static final EnumC669930q A0E;

    static {
        EnumC669930q enumC669930q = new EnumC669930q(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A07 = enumC669930q;
        EnumC669930q enumC669930q2 = new EnumC669930q("UNDEFINED", 1);
        A0E = enumC669930q2;
        EnumC669930q enumC669930q3 = new EnumC669930q("DEMO_MULTI_ADS", 2);
        A02 = enumC669930q3;
        EnumC669930q enumC669930q4 = new EnumC669930q("FEED_STANDALONE_MULTI_ADS", 3);
        A06 = enumC669930q4;
        EnumC669930q enumC669930q5 = new EnumC669930q("FEED_POST_AD_CLICK_MULTI_ADS", 4);
        A03 = enumC669930q5;
        EnumC669930q enumC669930q6 = new EnumC669930q("FEED_POST_AD_CLICK_SINGLE_AD", 5);
        A04 = enumC669930q6;
        EnumC669930q enumC669930q7 = new EnumC669930q("FEED_POST_ORGANIC_ENGAGEMENT_MULTI_ADS", 6);
        A05 = enumC669930q7;
        EnumC669930q enumC669930q8 = new EnumC669930q("STORIES_POST_AD_ENGAGEMENT_MULTI_ADS", 7);
        A0B = enumC669930q8;
        EnumC669930q enumC669930q9 = new EnumC669930q("STORIES_STANDALONE_MULTI_ADVERTISER_CAROUSEL", 8);
        A0D = enumC669930q9;
        EnumC669930q enumC669930q10 = new EnumC669930q("STORIES_POST_AD_ENGAGEMENT_MULTI_ADVERTISER_CAROUSEL", 9);
        A0C = enumC669930q10;
        EnumC669930q enumC669930q11 = new EnumC669930q("REELS_POST_AD_ENGAGEMENT_MULTI_ADS", 10);
        A08 = enumC669930q11;
        EnumC669930q enumC669930q12 = new EnumC669930q("REELS_POST_AD_ENGAGEMENT_SINGLE_AD", 11);
        A09 = enumC669930q12;
        EnumC669930q enumC669930q13 = new EnumC669930q("REELS_STANDALONE_MULTI_ADS", 12);
        A0A = enumC669930q13;
        EnumC669930q[] enumC669930qArr = {enumC669930q, enumC669930q2, enumC669930q3, enumC669930q4, enumC669930q5, enumC669930q6, enumC669930q7, enumC669930q8, enumC669930q9, enumC669930q10, enumC669930q11, enumC669930q12, enumC669930q13};
        A01 = enumC669930qArr;
        A00 = AbstractC12190kN.A00(enumC669930qArr);
    }

    public static EnumC669930q valueOf(String str) {
        return (EnumC669930q) Enum.valueOf(EnumC669930q.class, str);
    }

    public static EnumC669930q[] values() {
        return (EnumC669930q[]) A01.clone();
    }

    public EnumC669930q(String str, int i) {
    }
}
