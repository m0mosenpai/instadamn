package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53220NgI {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53220NgI[] A02;
    public static final EnumC53220NgI A03;
    public static final EnumC53220NgI A04;
    public static final EnumC53220NgI A05;
    public static final EnumC53220NgI A06;
    public final String A00;

    static {
        EnumC53220NgI enumC53220NgI = new EnumC53220NgI("INCOMING_CALL", 0, "incoming_call");
        A04 = enumC53220NgI;
        EnumC53220NgI enumC53220NgI2 = new EnumC53220NgI("MISSED_CALL", 1, "missed_call");
        A05 = enumC53220NgI2;
        EnumC53220NgI enumC53220NgI3 = new EnumC53220NgI("DISMISS_CALL", 2, "dismiss_call");
        A03 = enumC53220NgI3;
        EnumC53220NgI enumC53220NgI4 = new EnumC53220NgI("UNSUPPORTED", 3, "unsupported");
        A06 = enumC53220NgI4;
        EnumC53220NgI[] enumC53220NgIArr = {enumC53220NgI, enumC53220NgI2, enumC53220NgI3, enumC53220NgI4};
        A02 = enumC53220NgIArr;
        A01 = AbstractC12190kN.A00(enumC53220NgIArr);
    }

    public static EnumC53220NgI valueOf(String str) {
        return (EnumC53220NgI) Enum.valueOf(EnumC53220NgI.class, str);
    }

    public static EnumC53220NgI[] values() {
        return (EnumC53220NgI[]) A02.clone();
    }

    public EnumC53220NgI(String str, int i, String str2) {
        this.A00 = str2;
    }
}
