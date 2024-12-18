package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3le, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC82173le {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC82173le[] A01;
    public static final EnumC82173le A02;
    public static final EnumC82173le A03;
    public static final EnumC82173le A04;

    static {
        EnumC82173le enumC82173le = new EnumC82173le("LOAD_CANCELLED", 0);
        A02 = enumC82173le;
        EnumC82173le enumC82173le2 = new EnumC82173le("LOAD_FAILURE", 1);
        A03 = enumC82173le2;
        EnumC82173le enumC82173le3 = new EnumC82173le("NULL_URL", 2);
        A04 = enumC82173le3;
        EnumC82173le[] enumC82173leArr = {enumC82173le, enumC82173le2, enumC82173le3};
        A01 = enumC82173leArr;
        A00 = AbstractC12190kN.A00(enumC82173leArr);
    }

    public static EnumC82173le valueOf(String str) {
        return (EnumC82173le) Enum.valueOf(EnumC82173le.class, str);
    }

    public static EnumC82173le[] values() {
        return (EnumC82173le[]) A01.clone();
    }

    public EnumC82173le(String str, int i) {
    }
}
