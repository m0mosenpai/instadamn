package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.FbQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34993FbQ {
    public static final C34993FbQ A00 = new Object();

    public final void A00(AbstractC12990ll abstractC12990ll, String str, String str2, String str3, String str4, int i) {
        double A01 = AbstractC31171DnF.A01();
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "ig_aymh_password_input_result");
        AbstractC31179DnN.A15(A0f);
        AbstractC31177DnL.A1B(A0f, A01, A002);
        A0f.AAP("originating_source", str2);
        A0f.AAP("outcome", str3);
        A0f.A9K(AbstractC111324zv.A00(3966), AbstractC31171DnF.A0V(i));
        AbstractC31177DnL.A1G(A0f, "error", str4, A002);
        AbstractC35274Fh9.A0D(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A0f.Cht();
    }
}
