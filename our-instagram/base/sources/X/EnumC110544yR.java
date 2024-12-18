package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4yR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC110544yR {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC110544yR[] A01;
    public static final EnumC110544yR A02;
    public static final EnumC110544yR A03;
    public static final EnumC110544yR A04;
    public static final EnumC110544yR A05;

    static {
        EnumC110544yR enumC110544yR = new EnumC110544yR("NO_SET", 0);
        A02 = enumC110544yR;
        EnumC110544yR enumC110544yR2 = new EnumC110544yR("PRIMARY", 1);
        A03 = enumC110544yR2;
        EnumC110544yR enumC110544yR3 = new EnumC110544yR("SECONDARY", 2);
        A04 = enumC110544yR3;
        EnumC110544yR enumC110544yR4 = new EnumC110544yR("SECONDAY_ALWAYS_LIGHT_AVOID_USING", 3);
        A05 = enumC110544yR4;
        EnumC110544yR[] enumC110544yRArr = {enumC110544yR, enumC110544yR2, enumC110544yR3, enumC110544yR4};
        A01 = enumC110544yRArr;
        A00 = AbstractC12190kN.A00(enumC110544yRArr);
    }

    public static EnumC110544yR valueOf(String str) {
        return (EnumC110544yR) Enum.valueOf(EnumC110544yR.class, str);
    }

    public static EnumC110544yR[] values() {
        return (EnumC110544yR[]) A01.clone();
    }

    public EnumC110544yR(String str, int i) {
    }
}
