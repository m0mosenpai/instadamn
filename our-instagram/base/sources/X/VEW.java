package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEW {
    public static final /* synthetic */ EnumEntries A05;
    public static final /* synthetic */ VEW[] A06;
    public static final VEW A07;
    public static final VEW A08;
    public static final VEW A09;
    public static final VEW A0A;
    public static final VEW A0B;
    public static final VEW A0C;
    public static final VEW A0D;
    public static final VEW A0E;
    public static final VEW A0F;
    public static final VEW A0G;
    public static final VEW A0H;
    public static final VEW A0I;
    public static final VEW A0J;
    public static final VEW A0K;
    public static final VEW A0L;
    public static final VEW A0M;
    public static final VEW A0N;
    public static final VEW A0O;
    public final VEP A00;
    public final VEP A01;
    public final VEP A02;
    public final VEP A03;
    public final VEP A04;

    static {
        VEP vep = VEP.A0Q;
        VEP vep2 = VEP.A14;
        VEP vep3 = VEP.A0Y;
        VEW vew = new VEW(vep, vep, vep, vep2, vep3, "INLINE_CELL", 0);
        A0B = vew;
        VEP vep4 = VEP.A0R;
        VEW vew2 = new VEW(vep4, vep2, vep2, vep2, vep3, "ITEM_CELL", 1);
        A0F = vew2;
        VEW vew3 = new VEW(vep4, vep4, vep4, vep4, vep3, "RESELLER_ITEM_CELL", 2);
        A0L = vew3;
        VEW vew4 = new VEW(VEP.A0d, vep2, vep2, vep2, vep3, "NUX_PRICE_TABLE_ITEM_CELL", 3);
        A0H = vew4;
        VEP vep5 = VEP.A0s;
        VEW vew5 = new VEW(vep5, vep2, vep2, vep2, vep3, "TEXT_CELL", 4);
        A0O = vew5;
        VEP vep6 = VEP.A0v;
        VEW vew6 = new VEW(vep6, vep2, vep2, vep2, vep3, "INLINE_CELL_WITH_TITLE", 5);
        A0D = vew6;
        VEW vew7 = new VEW(vep6, vep2, vep2, vep2, vep3, "INLINE_HEADER_CELL", 6);
        A0E = vew7;
        VEW vew8 = new VEW(vep5, vep2, vep2, vep2, vep3, "INLINE_CELL_BUTTON", 7);
        A0C = vew8;
        VEW vew9 = new VEW(VEP.A0x, vep2, vep2, vep2, vep3, "HEADER_CELL", 8);
        A0A = vew9;
        VEW vew10 = new VEW(VEP.A1G, vep2, vep2, vep2, vep3, "BUTTON_CELL", 9);
        A07 = vew10;
        VEW vew11 = new VEW(VEP.A04, vep2, vep2, vep2, vep3, "SELECTION_BUTTON_CELL", 10);
        A0N = vew11;
        VEW vew12 = new VEW(VEP.A0S, vep2, vep2, vep2, vep3, "LIST_SELECTION_CELL", 11);
        A0G = vew12;
        VEW vew13 = new VEW(vep, vep2, vep2, vep2, vep3, "CREDENTIAL_INLINE_CELL", 12);
        A08 = vew13;
        VEW vew14 = new VEW(vep, vep2, vep2, vep2, vep3, "PUX_INLINE_CELL", 13);
        A0I = vew14;
        VEW vew15 = new VEW(vep, vep, vep, vep, vep3, "RESELLER_PUX_INLINE_CELL", 14);
        A0M = vew15;
        VEW vew16 = new VEW(VEP.A0J, vep2, vep2, vep2, vep3, "DISABLED_CELL", 15);
        A09 = vew16;
        VEW vew17 = new VEW(VEP.A0e, VEP.A0g, vep2, vep2, vep3, "PUX_ORDER_SUMMARY_CELL", 16);
        A0J = vew17;
        VEW vew18 = new VEW(VEP.A0K, VEP.A15, vep2, vep2, vep3, "PUX_UNAVAILABLE_FULFILLMENT_OPTION_CELL", 17);
        A0K = vew18;
        VEW[] vewArr = {vew, vew2, vew3, vew4, vew5, vew6, vew7, vew8, vew9, vew10, vew11, vew12, vew13, vew14, vew15, vew16, vew17, vew18};
        A06 = vewArr;
        A05 = AbstractC12190kN.A00(vewArr);
    }

    public static VEW valueOf(String str) {
        return (VEW) Enum.valueOf(VEW.class, str);
    }

    public static VEW[] values() {
        return (VEW[]) A06.clone();
    }

    public VEW(VEP vep, VEP vep2, VEP vep3, VEP vep4, VEP vep5, String str, int i) {
        this.A01 = vep;
        this.A03 = vep2;
        this.A04 = vep3;
        this.A02 = vep4;
        this.A00 = vep5;
    }
}
