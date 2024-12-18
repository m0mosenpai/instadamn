package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4nJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC104534nJ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC104534nJ[] A01;
    public static final EnumC104534nJ A02;
    public static final EnumC104534nJ A03;
    public static final EnumC104534nJ A04;
    public static final EnumC104534nJ A05;

    static {
        EnumC104534nJ enumC104534nJ = new EnumC104534nJ("USER_SEE_TAIL_LOAD_SPINNER", 0);
        A05 = enumC104534nJ;
        EnumC104534nJ enumC104534nJ2 = new EnumC104534nJ("USER_SEE_MEDIA", 1);
        A04 = enumC104534nJ2;
        EnumC104534nJ enumC104534nJ3 = new EnumC104534nJ("TAIL_LOAD_RESPONSE_RECEIVED", 2);
        A02 = enumC104534nJ3;
        EnumC104534nJ enumC104534nJ4 = new EnumC104534nJ("USER_DID_NAVIGATE", 3);
        A03 = enumC104534nJ4;
        EnumC104534nJ[] enumC104534nJArr = {enumC104534nJ, enumC104534nJ2, enumC104534nJ3, enumC104534nJ4};
        A01 = enumC104534nJArr;
        A00 = AbstractC12190kN.A00(enumC104534nJArr);
    }

    public static EnumC104534nJ valueOf(String str) {
        return (EnumC104534nJ) Enum.valueOf(EnumC104534nJ.class, str);
    }

    public static EnumC104534nJ[] values() {
        return (EnumC104534nJ[]) A01.clone();
    }

    public EnumC104534nJ(String str, int i) {
    }
}
