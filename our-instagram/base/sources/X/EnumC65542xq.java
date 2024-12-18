package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2xq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC65542xq {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC65542xq[] A01;
    public static final EnumC65542xq A02;
    public static final EnumC65542xq A03;
    public static final EnumC65542xq A04;
    public static final EnumC65542xq A05;
    public static final EnumC65542xq A06;
    public static final EnumC65542xq A07;
    public static final EnumC65542xq A08;
    public static final EnumC65542xq A09;
    public static final EnumC65542xq A0A;
    public static final EnumC65542xq A0B;

    static {
        EnumC65542xq enumC65542xq = new EnumC65542xq("MEDIA_UFI", 0);
        A0B = enumC65542xq;
        EnumC65542xq enumC65542xq2 = new EnumC65542xq("MEDIA_HEADER", 1);
        A0A = enumC65542xq2;
        EnumC65542xq enumC65542xq3 = new EnumC65542xq("AD_CTA", 2);
        A02 = enumC65542xq3;
        EnumC65542xq enumC65542xq4 = new EnumC65542xq("COALESCED_MEDIA", 3);
        A06 = enumC65542xq4;
        EnumC65542xq enumC65542xq5 = new EnumC65542xq("COALESCED_HEADER", 4);
        A05 = enumC65542xq5;
        EnumC65542xq enumC65542xq6 = new EnumC65542xq("COALESCED_FOOTER", 5);
        A04 = enumC65542xq6;
        EnumC65542xq enumC65542xq7 = new EnumC65542xq("FULL_HEIGHT_SINGLE_MEDIA", 6);
        A07 = enumC65542xq7;
        EnumC65542xq enumC65542xq8 = new EnumC65542xq("HYBRID_FULL_HEIGHT_SINGLE_MEDIA", 7);
        A08 = enumC65542xq8;
        EnumC65542xq enumC65542xq9 = new EnumC65542xq("MEDIA_CONTENT", 8);
        A09 = enumC65542xq9;
        EnumC65542xq enumC65542xq10 = new EnumC65542xq("CAROUSEL_CONTENT", 9);
        A03 = enumC65542xq10;
        EnumC65542xq[] enumC65542xqArr = {enumC65542xq, enumC65542xq2, enumC65542xq3, enumC65542xq4, enumC65542xq5, enumC65542xq6, enumC65542xq7, enumC65542xq8, enumC65542xq9, enumC65542xq10};
        A01 = enumC65542xqArr;
        A00 = AbstractC12190kN.A00(enumC65542xqArr);
    }

    public static EnumC65542xq valueOf(String str) {
        return (EnumC65542xq) Enum.valueOf(EnumC65542xq.class, str);
    }

    public static EnumC65542xq[] values() {
        return (EnumC65542xq[]) A01.clone();
    }

    public EnumC65542xq(String str, int i) {
    }
}
