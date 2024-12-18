package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33378EpB {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33378EpB[] A02;
    public static final EnumC33378EpB A03;
    public static final EnumC33378EpB A04;
    public final String A00;

    static {
        EnumC33378EpB enumC33378EpB = new EnumC33378EpB("TEXT", 0, "text");
        A04 = enumC33378EpB;
        EnumC33378EpB enumC33378EpB2 = new EnumC33378EpB("MEDIA", 1, "photo");
        A03 = enumC33378EpB2;
        EnumC33378EpB[] enumC33378EpBArr = {enumC33378EpB, enumC33378EpB2};
        A02 = enumC33378EpBArr;
        A01 = AbstractC12190kN.A00(enumC33378EpBArr);
    }

    public static EnumC33378EpB valueOf(String str) {
        return (EnumC33378EpB) Enum.valueOf(EnumC33378EpB.class, str);
    }

    public static EnumC33378EpB[] values() {
        return (EnumC33378EpB[]) A02.clone();
    }

    public EnumC33378EpB(String str, int i, String str2) {
        this.A00 = str2;
    }
}
