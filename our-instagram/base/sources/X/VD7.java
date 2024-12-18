package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VD7 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VD7[] A01;
    public static final VD7 A02;
    public static final VD7 A03;
    public static final VD7 A04;
    public static final VD7 A05;
    public static final VD7 A06;
    public static final VD7 A07;
    public static final VD7 A08;

    static {
        VD7 vd7 = new VD7("REQUEST_PAYER_NAME", 0);
        A04 = vd7;
        VD7 vd72 = new VD7("REQUEST_PAYER_EMAIL", 1);
        A03 = vd72;
        VD7 vd73 = new VD7("REQUEST_PAYER_PHONE", 2);
        A05 = vd73;
        VD7 vd74 = new VD7("REQUEST_BILLING_ADDRESS", 3);
        A02 = vd74;
        VD7 vd75 = new VD7("REQUEST_PICKUP_NAME", 4);
        A07 = vd75;
        VD7 vd76 = new VD7("REQUEST_PICKUP_EMAIL", 5);
        A06 = vd76;
        VD7 vd77 = new VD7("REQUEST_PICKUP_PHONE", 6);
        A08 = vd77;
        VD7[] vd7Arr = {vd7, vd72, vd73, vd74, vd75, vd76, vd77};
        A01 = vd7Arr;
        A00 = AbstractC12190kN.A00(vd7Arr);
    }

    public static VD7 valueOf(String str) {
        return (VD7) Enum.valueOf(VD7.class, str);
    }

    public static VD7[] values() {
        return (VD7[]) A01.clone();
    }

    public VD7(String str, int i) {
    }
}
