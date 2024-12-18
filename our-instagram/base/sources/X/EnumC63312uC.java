package X;

import kotlin.Deprecated;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated(message = "Duplicated from API model {fbandroid/java/com/instagram/api/schemas/MonetizationEligibilityDecision/MonetizationEligibilityDecision.kt}")
/* renamed from: X.2uC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC63312uC {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC63312uC[] A01;
    public static final EnumC63312uC A02;
    public static final EnumC63312uC A03;
    public static final EnumC63312uC A04;
    public static final EnumC63312uC A05;
    public static final EnumC63312uC A06;
    public static final EnumC63312uC A07;

    static {
        EnumC63312uC enumC63312uC = new EnumC63312uC("ELIGIBLE", 0);
        A03 = enumC63312uC;
        EnumC63312uC enumC63312uC2 = new EnumC63312uC("NOT_ELIGIBLE", 1);
        A07 = enumC63312uC2;
        EnumC63312uC enumC63312uC3 = new EnumC63312uC("AT_RISK_OF_BECOMING_INELIGIBLE", 2);
        A02 = enumC63312uC3;
        EnumC63312uC enumC63312uC4 = new EnumC63312uC("ELIGIBLE_PENDING_OPT_IN", 3);
        A04 = enumC63312uC4;
        EnumC63312uC enumC63312uC5 = new EnumC63312uC("ERROR", 4);
        A05 = enumC63312uC5;
        EnumC63312uC enumC63312uC6 = new EnumC63312uC("LOADING", 5);
        A06 = enumC63312uC6;
        EnumC63312uC[] enumC63312uCArr = {enumC63312uC, enumC63312uC2, enumC63312uC3, enumC63312uC4, enumC63312uC5, enumC63312uC6};
        A01 = enumC63312uCArr;
        A00 = AbstractC12190kN.A00(enumC63312uCArr);
    }

    public static EnumC63312uC valueOf(String str) {
        return (EnumC63312uC) Enum.valueOf(EnumC63312uC.class, str);
    }

    public static EnumC63312uC[] values() {
        return (EnumC63312uC[]) A01.clone();
    }

    public EnumC63312uC(String str, int i) {
    }
}
