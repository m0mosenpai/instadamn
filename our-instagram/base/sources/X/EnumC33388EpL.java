package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33388EpL {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33388EpL[] A02;
    public static final EnumC33388EpL A03;
    public static final EnumC33388EpL A04;
    public static final EnumC33388EpL A05;
    public final String A00;

    static {
        EnumC33388EpL enumC33388EpL = new EnumC33388EpL("FACEBOOK", 0, "facebook");
        A03 = enumC33388EpL;
        EnumC33388EpL enumC33388EpL2 = new EnumC33388EpL("GOOGLE", 1, "google");
        A04 = enumC33388EpL2;
        EnumC33388EpL enumC33388EpL3 = new EnumC33388EpL("UNKNOWN", 2, "unknown");
        A05 = enumC33388EpL3;
        EnumC33388EpL[] enumC33388EpLArr = {enumC33388EpL, enumC33388EpL2, enumC33388EpL3};
        A02 = enumC33388EpLArr;
        A01 = AbstractC12190kN.A00(enumC33388EpLArr);
    }

    public static EnumC33388EpL valueOf(String str) {
        return (EnumC33388EpL) Enum.valueOf(EnumC33388EpL.class, str);
    }

    public static EnumC33388EpL[] values() {
        return (EnumC33388EpL[]) A02.clone();
    }

    public EnumC33388EpL(String str, int i, String str2) {
        this.A00 = str2;
    }
}
