package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4nH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC104514nH {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC104514nH[] A01;
    public static final EnumC104514nH A02;
    public static final EnumC104514nH A03;
    public static final EnumC104514nH A04;
    public static final EnumC104514nH A05;
    public static final EnumC104514nH A06;
    public static final EnumC104514nH A07;
    public static final EnumC104514nH A08;
    public static final EnumC104514nH A09;
    public static final EnumC104514nH A0A;
    public static final EnumC104514nH A0B;

    static {
        EnumC104514nH enumC104514nH = new EnumC104514nH("EXPLORE", 0);
        A07 = enumC104514nH;
        EnumC104514nH enumC104514nH2 = new EnumC104514nH("DISCOVERY_CHAIN", 1);
        A06 = enumC104514nH2;
        EnumC104514nH enumC104514nH3 = new EnumC104514nH("SHOPPING", 2);
        A0A = enumC104514nH3;
        EnumC104514nH enumC104514nH4 = new EnumC104514nH("ACTIVITY_FEED", 3);
        A02 = enumC104514nH4;
        EnumC104514nH enumC104514nH5 = new EnumC104514nH("CLIPS", 4);
        A03 = enumC104514nH5;
        EnumC104514nH enumC104514nH6 = new EnumC104514nH("IG_FEED_TIMELINE", 5);
        A08 = enumC104514nH6;
        EnumC104514nH enumC104514nH7 = new EnumC104514nH("TEST", 6);
        A0B = enumC104514nH7;
        EnumC104514nH enumC104514nH8 = new EnumC104514nH("PROFILE", 7);
        A09 = enumC104514nH8;
        EnumC104514nH enumC104514nH9 = new EnumC104514nH("DIRECT_INBOX", 8);
        A05 = enumC104514nH9;
        EnumC104514nH enumC104514nH10 = new EnumC104514nH("CONTEXTUAL_FEED", 9);
        A04 = enumC104514nH10;
        EnumC104514nH[] enumC104514nHArr = {enumC104514nH, enumC104514nH2, enumC104514nH3, enumC104514nH4, enumC104514nH5, enumC104514nH6, enumC104514nH7, enumC104514nH8, enumC104514nH9, enumC104514nH10};
        A01 = enumC104514nHArr;
        A00 = AbstractC12190kN.A00(enumC104514nHArr);
    }

    public static EnumC104514nH valueOf(String str) {
        return (EnumC104514nH) Enum.valueOf(EnumC104514nH.class, str);
    }

    public static EnumC104514nH[] values() {
        return (EnumC104514nH[]) A01.clone();
    }

    public EnumC104514nH(String str, int i) {
    }
}
