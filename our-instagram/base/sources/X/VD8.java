package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VD8 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VD8[] A01;
    public static final VD8 A02;
    public static final VD8 A03;
    public static final VD8 A04;
    public static final VD8 A05;
    public static final VD8 A06;
    public static final VD8 A07;
    public static final VD8 A08;

    static {
        VD8 vd8 = new VD8("USER_INFO_PAYER_NAME", 0);
        A04 = vd8;
        VD8 vd82 = new VD8("USER_INFO_PAYER_EMAIL", 1);
        A03 = vd82;
        VD8 vd83 = new VD8("USER_INFO_PAYER_PHONE", 2);
        A05 = vd83;
        VD8 vd84 = new VD8("USER_INFO_PAYER_ADDRESS", 3);
        A02 = vd84;
        VD8 vd85 = new VD8("USER_INFO_PAYMENT_METHODS", 4);
        A06 = vd85;
        VD8 vd86 = new VD8("USER_INFO_PAYMENT_METHODS_BASIC_CARDS", 5);
        A07 = vd86;
        VD8 vd87 = new VD8("USER_INFO_PAYMENT_METHODS_TOKENIZED_CARDS", 6);
        A08 = vd87;
        VD8[] vd8Arr = {vd8, vd82, vd83, vd84, vd85, vd86, vd87};
        A01 = vd8Arr;
        A00 = AbstractC12190kN.A00(vd8Arr);
    }

    public static VD8 valueOf(String str) {
        return (VD8) Enum.valueOf(VD8.class, str);
    }

    public static VD8[] values() {
        return (VD8[]) A01.clone();
    }

    public VD8(String str, int i) {
    }
}
