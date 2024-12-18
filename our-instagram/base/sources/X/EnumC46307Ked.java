package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ked, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46307Ked implements InterfaceC50385MMn {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46307Ked[] A01;
    public static final EnumC46307Ked A02;
    public static final EnumC46307Ked A03;
    public static final EnumC46307Ked A04;
    public static final EnumC46307Ked A05;
    public static final EnumC46307Ked A06;
    public static final EnumC46307Ked A07;
    public static final EnumC46307Ked A08;
    public static final EnumC46307Ked A09;
    public static final EnumC46307Ked A0A;

    static {
        EnumC46307Ked enumC46307Ked = new EnumC46307Ked("REACTION", 0);
        A06 = enumC46307Ked;
        EnumC46307Ked enumC46307Ked2 = new EnumC46307Ked("COMMENT", 1);
        A02 = enumC46307Ked2;
        EnumC46307Ked enumC46307Ked3 = new EnumC46307Ked("LOCAL_COMMENT", 2);
        A05 = enumC46307Ked3;
        EnumC46307Ked enumC46307Ked4 = new EnumC46307Ked("TIPS", 3);
        A07 = enumC46307Ked4;
        EnumC46307Ked enumC46307Ked5 = new EnumC46307Ked("VIEWER_STAT", 4);
        A0A = enumC46307Ked5;
        EnumC46307Ked enumC46307Ked6 = new EnumC46307Ked("USER_ENGAGEMENT_RESPONSE", 5);
        A08 = enumC46307Ked6;
        EnumC46307Ked enumC46307Ked7 = new EnumC46307Ked("FIRST_PERSON_JOINS", 6);
        A03 = enumC46307Ked7;
        EnumC46307Ked enumC46307Ked8 = new EnumC46307Ked("LAST_PERSON_LEAVES", 7);
        A04 = enumC46307Ked8;
        EnumC46307Ked enumC46307Ked9 = new EnumC46307Ked("USER_ENGAGEMENT_STATUS_UPDATE", 8);
        A09 = enumC46307Ked9;
        EnumC46307Ked[] enumC46307KedArr = {enumC46307Ked, enumC46307Ked2, enumC46307Ked3, enumC46307Ked4, enumC46307Ked5, enumC46307Ked6, enumC46307Ked7, enumC46307Ked8, enumC46307Ked9};
        A01 = enumC46307KedArr;
        A00 = AbstractC12190kN.A00(enumC46307KedArr);
    }

    public static EnumC46307Ked valueOf(String str) {
        return (EnumC46307Ked) Enum.valueOf(EnumC46307Ked.class, str);
    }

    public static EnumC46307Ked[] values() {
        return (EnumC46307Ked[]) A01.clone();
    }

    public EnumC46307Ked(String str, int i) {
    }
}
