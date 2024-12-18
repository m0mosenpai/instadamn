package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39551HdN {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39551HdN[] A01;
    public static final EnumC39551HdN A02;
    public static final EnumC39551HdN A03;
    public static final EnumC39551HdN A04;
    public static final EnumC39551HdN A05;
    public static final EnumC39551HdN A06;
    public static final EnumC39551HdN A07;
    public static final EnumC39551HdN A08;

    static {
        EnumC39551HdN enumC39551HdN = new EnumC39551HdN("COLLECTION_FEED", 0);
        A06 = enumC39551HdN;
        EnumC39551HdN enumC39551HdN2 = new EnumC39551HdN("COLLECTION_FEED_PREVIEW", 1);
        A07 = enumC39551HdN2;
        EnumC39551HdN enumC39551HdN3 = new EnumC39551HdN("SELECT_COVER_PHOTO", 2);
        A08 = enumC39551HdN3;
        EnumC39551HdN enumC39551HdN4 = new EnumC39551HdN("ADD_TO_NEW_COLLECTION", 3);
        A05 = enumC39551HdN4;
        EnumC39551HdN enumC39551HdN5 = new EnumC39551HdN("ADD_TO_EXISTING_COLLECTION", 4);
        A03 = enumC39551HdN5;
        EnumC39551HdN enumC39551HdN6 = new EnumC39551HdN("ADD_AND_CREATE_COLLECTION", 5);
        A02 = enumC39551HdN6;
        EnumC39551HdN enumC39551HdN7 = new EnumC39551HdN("ADD_TO_FAVORITES_COLLECTION", 6);
        A04 = enumC39551HdN7;
        EnumC39551HdN[] enumC39551HdNArr = {enumC39551HdN, enumC39551HdN2, enumC39551HdN3, enumC39551HdN4, enumC39551HdN5, enumC39551HdN6, enumC39551HdN7};
        A01 = enumC39551HdNArr;
        A00 = AbstractC12190kN.A00(enumC39551HdNArr);
    }

    public static EnumC39551HdN valueOf(String str) {
        return (EnumC39551HdN) Enum.valueOf(EnumC39551HdN.class, str);
    }

    public static EnumC39551HdN[] values() {
        return (EnumC39551HdN[]) A01.clone();
    }

    public EnumC39551HdN(String str, int i) {
    }
}
