package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDH {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VDH[] A01;
    public static final VDH A02;
    public static final VDH A03;
    public static final VDH A04;
    public static final VDH A05;
    public static final VDH A06;
    public static final VDH A07;
    public static final VDH A08;
    public static final VDH A09;
    public static final VDH A0A;
    public static final VDH A0B;
    public static final VDH A0C;
    public static final VDH A0D;
    public static final VDH A0E;
    public static final VDH A0F;
    public static final VDH A0G;
    public static final VDH A0H;
    public static final VDH A0I;
    public static final VDH A0J;
    public static final VDH A0K;
    public static final VDH A0L;
    public static final VDH A0M;
    public static final VDH A0N;
    public static final VDH A0O;

    static {
        VDH vdh = new VDH("CLIENT_LOAD_OFFSITEAVAILABILITY_INIT", 0);
        A09 = vdh;
        VDH vdh2 = new VDH("CLIENT_LOAD_OFFSITEAVAILABILITY_SUCCESS", 1);
        A0A = vdh2;
        VDH vdh3 = new VDH("CLIENT_LOAD_OFFSITEAVAILABILITY_FAIL", 2);
        A08 = vdh3;
        VDH vdh4 = new VDH("CLIENT_LOAD_OFFSITELOGINWITHAPP_INIT", 3);
        A0C = vdh4;
        VDH vdh5 = new VDH("CLIENT_LOAD_OFFSITELOGINWITHAPP_SUCCESS", 4);
        A0D = vdh5;
        VDH vdh6 = new VDH("CLIENT_LOAD_OFFSITELOGINWITHAPP_FAIL", 5);
        A0B = vdh6;
        VDH vdh7 = new VDH("CLIENT_LOAD_OFFSITEPAYMENTREQUEST_INIT", 6);
        A0L = vdh7;
        VDH vdh8 = new VDH("CLIENT_LOAD_OFFSITEPAYMENTREQUEST_SUCCESS", 7);
        A0M = vdh8;
        VDH vdh9 = new VDH("CLIENT_LOAD_OFFSITEPAYMENTREQUEST_FAIL", 8);
        A0K = vdh9;
        VDH vdh10 = new VDH("CLIENT_LOAD_OFFSITEPAYMENTHANDLED_INIT", 9);
        A0I = vdh10;
        VDH vdh11 = new VDH("CLIENT_LOAD_OFFSITEPAYMENTHANDLED_SUCCESS", 10);
        A0J = vdh11;
        VDH vdh12 = new VDH("CLIENT_LOAD_OFFSITEPAYMENTHANDLED_FAIL", 11);
        A0H = vdh12;
        VDH vdh13 = new VDH("CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_INIT", 12);
        A0F = vdh13;
        VDH vdh14 = new VDH("CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_SUCCESS", 13);
        A0G = vdh14;
        VDH vdh15 = new VDH("CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_FAIL", 14);
        A0E = vdh15;
        VDH vdh16 = new VDH("CLIENT_RENDER_OFFSITEFOOTER_DISPLAY", 15);
        A0N = vdh16;
        VDH vdh17 = new VDH("USER_CLICK_OFFSITEDISCLAIMER_ATOMIC", 16);
        A0O = vdh17;
        VDH vdh18 = new VDH("CLIENT_FETCH_OFFSITEMERCHANTJAVASCRIPT_INIT", 17);
        A06 = vdh18;
        VDH vdh19 = new VDH("CLIENT_FETCH_OFFSITEMERCHANTJAVASCRIPT_SUCCESS", 18);
        A07 = vdh19;
        VDH vdh20 = new VDH("CLIENT_FETCH_OFFSITEMERCHANTJAVASCRIPT_FAIL", 19);
        A05 = vdh20;
        VDH vdh21 = new VDH("CLIENT_EXECUTE_OFFSITEMERCHANTJAVASCRIPT_INIT", 20);
        A03 = vdh21;
        VDH vdh22 = new VDH("CLIENT_EXECUTE_OFFSITEMERCHANTJAVASCRIPT_SUCCESS", 21);
        A04 = vdh22;
        VDH vdh23 = new VDH("CLIENT_EXECUTE_OFFSITEMERCHANTJAVASCRIPT_FAIL", 22);
        A02 = vdh23;
        VDH[] vdhArr = {vdh, vdh2, vdh3, vdh4, vdh5, vdh6, vdh7, vdh8, vdh9, vdh10, vdh11, vdh12, vdh13, vdh14, vdh15, vdh16, vdh17, vdh18, vdh19, vdh20, vdh21, vdh22, vdh23};
        A01 = vdhArr;
        A00 = AbstractC12190kN.A00(vdhArr);
    }

    public static VDH valueOf(String str) {
        return (VDH) Enum.valueOf(VDH.class, str);
    }

    public static VDH[] values() {
        return (VDH[]) A01.clone();
    }

    public VDH(String str, int i) {
    }
}
