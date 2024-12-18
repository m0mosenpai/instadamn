package X;

/* loaded from: classes5.dex */
public abstract class CXP {
    public static final void A00(C5Tl c5Tl, C26017Bf6 c26017Bf6, C28370CfW c28370CfW, int i, int i2) {
        AbstractC167017dG.A1O(c28370CfW, c26017Bf6);
        if (AbstractC25235BEs.A1W(c5Tl, 1337401572)) {
            C0fH.A01(-1685033196, "com.instagram.aistudio.home.view.launchedeffect.SearchResultImpressionEvent (AiSearchImpressionEvent.kt:10)");
        }
        C5UX.A04(c5Tl, C0eB.A00, new MCH(c26017Bf6, c28370CfW, (InterfaceC23621Ds) null, i));
        if (C0fH.A02()) {
            C0fH.A00(-597281428);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(c28370CfW, c26017Bf6, i, i2, 7);
        }
    }

    public static final void A01(C5Tl c5Tl, C28370CfW c28370CfW, String str, int i) {
        boolean A1a = AbstractC167017dG.A1a(c28370CfW, str);
        if (AbstractC25235BEs.A1W(c5Tl, 923418535)) {
            C0fH.A01(-1157160471, "com.instagram.aistudio.home.view.launchedeffect.SearchBarImpressionEvent (AiSearchImpressionEvent.kt:18)");
        }
        C5UX.A04(c5Tl, C0eB.A00, new MCF(c28370CfW, str, null, 6));
        if (C0fH.A02()) {
            C0fH.A00(2138863443);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30503Dbm.A01(ASZ, c28370CfW, str, i, A1a ? 1 : 0);
        }
    }
}
