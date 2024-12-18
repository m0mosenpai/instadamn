package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46180KcI {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46180KcI[] A01;
    public static final EnumC46180KcI A02;
    public static final EnumC46180KcI A03;
    public static final EnumC46180KcI A04;
    public static final EnumC46180KcI A05;
    public static final EnumC46180KcI A06;
    public static final EnumC46180KcI A07;
    public static final EnumC46180KcI A08;

    static {
        EnumC46180KcI enumC46180KcI = new EnumC46180KcI("CREATE_NOTE", 0);
        A03 = enumC46180KcI;
        EnumC46180KcI enumC46180KcI2 = new EnumC46180KcI("DELETE_NOTE", 1);
        A05 = enumC46180KcI2;
        EnumC46180KcI enumC46180KcI3 = new EnumC46180KcI("MUTE_NOTE", 2);
        A06 = enumC46180KcI3;
        EnumC46180KcI enumC46180KcI4 = new EnumC46180KcI("CREATE_HIDDEN_PLACE", 3);
        A02 = enumC46180KcI4;
        EnumC46180KcI enumC46180KcI5 = new EnumC46180KcI("UPDATE_HIDDEN_PLACE", 4);
        A08 = enumC46180KcI5;
        EnumC46180KcI enumC46180KcI6 = new EnumC46180KcI("DELETE_HIDDEN_PLACE", 5);
        A04 = enumC46180KcI6;
        EnumC46180KcI enumC46180KcI7 = new EnumC46180KcI("UPDATE_AUDIENCE", 6);
        A07 = enumC46180KcI7;
        EnumC46180KcI[] enumC46180KcIArr = {enumC46180KcI, enumC46180KcI2, enumC46180KcI3, enumC46180KcI4, enumC46180KcI5, enumC46180KcI6, enumC46180KcI7};
        A01 = enumC46180KcIArr;
        A00 = AbstractC12190kN.A00(enumC46180KcIArr);
    }

    public static EnumC46180KcI valueOf(String str) {
        return (EnumC46180KcI) Enum.valueOf(EnumC46180KcI.class, str);
    }

    public static EnumC46180KcI[] values() {
        return (EnumC46180KcI[]) A01.clone();
    }

    public EnumC46180KcI(String str, int i) {
    }
}
