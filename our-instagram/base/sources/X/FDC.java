package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* loaded from: classes6.dex */
public abstract class FDC {
    public static final void A00(AbstractC12990ll abstractC12990ll, EnumC33445EqI enumC33445EqI, String str) {
        String str2;
        AbstractC167017dG.A1N(abstractC12990ll, str);
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "switch_to_log_in");
        AbstractC31172DnG.A1O(A0f);
        AbstractC31177DnL.A1B(A0f, A01, A00);
        AbstractC31179DnN.A1A(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str, A00);
        AbstractC35274Fh9.A09(A0f, abstractC12990ll);
        if (enumC33445EqI != null) {
            str2 = enumC33445EqI.A00;
        } else {
            str2 = null;
        }
        AbstractC31171DnF.A19(A0f, str2);
        A0f.Cht();
    }
}
