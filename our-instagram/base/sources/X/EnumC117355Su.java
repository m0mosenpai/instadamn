package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5Su, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC117355Su {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC117355Su[] A02;
    public static final EnumC117355Su A03;
    public static final EnumC117355Su A04;
    public static final EnumC117355Su A05;
    public static final EnumC117355Su A06;
    public static final EnumC117355Su A07;
    public static final EnumC117355Su A08;
    public final int A00;

    static {
        EnumC117355Su enumC117355Su = new EnumC117355Su("UNKNOWN", 0, -1);
        A07 = enumC117355Su;
        EnumC117355Su enumC117355Su2 = new EnumC117355Su("TEXT_MESSAGE", 1, 0);
        A06 = enumC117355Su2;
        EnumC117355Su enumC117355Su3 = new EnumC117355Su("UNSEND_MESSAGE", 2, 2);
        A08 = enumC117355Su3;
        EnumC117355Su enumC117355Su4 = new EnumC117355Su("EXPIRE_MESSAGE", 3, 14);
        A04 = enumC117355Su4;
        EnumC117355Su enumC117355Su5 = new EnumC117355Su("IG_STORY_REPLY", 4, 1002);
        A05 = enumC117355Su5;
        EnumC117355Su enumC117355Su6 = new EnumC117355Su("AE_REACTION_ADDED", 5, 8001);
        A03 = enumC117355Su6;
        EnumC117355Su[] enumC117355SuArr = {enumC117355Su, enumC117355Su2, enumC117355Su3, enumC117355Su4, enumC117355Su5, enumC117355Su6};
        A02 = enumC117355SuArr;
        A01 = AbstractC12190kN.A00(enumC117355SuArr);
    }

    public static EnumC117355Su valueOf(String str) {
        return (EnumC117355Su) Enum.valueOf(EnumC117355Su.class, str);
    }

    public static EnumC117355Su[] values() {
        return (EnumC117355Su[]) A02.clone();
    }

    public EnumC117355Su(String str, int i, int i2) {
        this.A00 = i2;
    }
}
