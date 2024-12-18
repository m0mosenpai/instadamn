package X;

@Deprecated(since = "We should use Ultralight static instead of using FBPay SDK .ref -  https://www.internalfb.com/intern/staticdocs/ultralight/docs/statics example D56740830")
/* renamed from: X.2FP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FP {
    public static volatile C2FP A02;
    public C2GK A00;
    public boolean A01;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.2FP] */
    public static C2FP A05() {
        if (A02 == null) {
            synchronized (C2FP.class) {
                if (A02 == null) {
                    A02 = new Object();
                }
            }
        }
        return A02;
    }

    public static XF5 A00() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A02, "BloksScreenConfigHelper Factory is not provided!");
        return (XF5) A05.A00.A02.get();
    }

    public static SPR A01() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A06, "ECPManager Factory is not provided!");
        return (SPR) A05.A00.A06.get();
    }

    public static WFY A02() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A0E, "MSCManager Factory is not provided!");
        return (WFY) A05.A00.A0E.get();
    }

    @Deprecated(since = "We should use Ultralight static instead of using FBPay SDK .ref -  https://www.internalfb.com/intern/staticdocs/ultralight/docs/statics example D56740830")
    public static SQ1 A03() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A01, "FBPayAuthManager Factory is not provided!");
        return (SQ1) A05.A00.A01.get();
    }

    @Deprecated(since = "We should use Ultralight static instead of using FBPay SDK .ref -  https://www.internalfb.com/intern/staticdocs/ultralight/docs/statics example D56740830")
    public static C63174SeZ A04() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A0F, "PttManager Factory is not provided!");
        return (C63174SeZ) A05.A00.A0F.get();
    }

    @Deprecated(since = "Use executors from here, since these executor are app specific executors.")
    public static C58443PvM A06() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A07, "Executors Factory is not provided!");
        return (C58443PvM) A05.A00.A07.get();
    }

    public static AbstractC61604RqT A07() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A0J, "FBPayUrlLauncher Factory is not provided!");
        return (AbstractC61604RqT) A05.A00.A0J.get();
    }

    public static C62520SEw A08() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A00, "AppInfo Factory is not provided!");
        return (C62520SEw) A05.A00.A00.get();
    }

    public static VTA A09() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A0G, "ResourcesManager Factory is not provided!");
        return (VTA) A05.A00.A0G.get();
    }

    public static W5t A0A() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A0I, "Theme Factory is not provided!");
        return (W5t) A05.A00.A0I.get();
    }

    public static SVZ A0B() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A04, "FBPayCoroutines Factory is not provided!");
        return (SVZ) A05.A00.A04.get();
    }

    @Deprecated
    public static SYL A0C() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A05, "DeviceInfo Factory is not provided!");
        return (SYL) A05.A00.A05.get();
    }

    @Deprecated(since = "We should use Ultralight static instead of using FBPay SDK .ref -  https://www.internalfb.com/intern/staticdocs/ultralight/docs/statics example D62598351")
    public static C70153WDa A0D() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A09, "FBPayGating Factory is not provided!");
        return (C70153WDa) A05.A00.A09.get();
    }

    public static C63307ShD A0E() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A0B, "FBPayHubManager Factory is not provided!");
        return (C63307ShD) A05.A00.A0B.get();
    }

    public static C62936SYe A0F() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A0D, "LocationAPI Factory is not provided");
        return (C62936SYe) A05.A00.A0D.get();
    }

    public static C69679VtP A0G() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A0C, "FBPayImageLoader Factory is not provided!");
        return (C69679VtP) A05.A00.A0C.get();
    }

    public static SNQ A0H() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A08, "FbPayUIHelper Factory is not provided!");
        return (SNQ) A05.A00.A08.get();
    }

    public static void A0I() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A03, "CardScanner Factory is not provided!");
        A05.A00.A03.get();
    }

    public static void A0J() {
        C2FP A05 = A05();
        A0K(A05);
        C02R.A03(A05.A00.A0A, "FBPayCoroutines Factory is not provided!");
        A05.A00.A0A.get();
    }

    public static void A0K(C2FP c2fp) {
        C02R.A06(A05().A01, "FBPay SDK has not been initialized");
        C02R.A03(c2fp.A00, "FBPay SDK has not been initialized");
    }
}
