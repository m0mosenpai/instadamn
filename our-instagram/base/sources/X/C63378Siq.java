package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Siq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63378Siq {
    public static final C63378Siq A00 = new Object();

    public static final void A00(Status status, AbstractC12990ll abstractC12990ll, String str, int i, boolean z) {
        Boolean bool;
        Long l;
        Boolean bool2;
        Boolean bool3;
        C14360o3.A0B(abstractC12990ll, 0);
        double currentTimeMillis = System.currentTimeMillis();
        double A002 = C1Q9.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "ig_android_smart_lock_account_dialog_displayed");
        AbstractC31179DnN.A15(A0f);
        AbstractC31179DnN.A17(A0f, currentTimeMillis, A002);
        AbstractC35274Fh9.A0D(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        Boolean bool4 = null;
        String str2 = null;
        A0f.AAP("flow", null);
        A0f.A7v("has_status", Boolean.valueOf(AbstractC167007dF.A1W(status)));
        if (status != null) {
            bool = Boolean.valueOf(AbstractC167007dF.A1W(status.A01));
        } else {
            bool = null;
        }
        A0f.A7v("has_resolution", bool);
        if (status != null) {
            l = AbstractC31171DnF.A0V(status.A00);
        } else {
            l = null;
        }
        A0f.A9K(TraceFieldType.StatusCode, l);
        if (status != null) {
            str2 = status.A03;
        }
        A0f.AAP(TraceFieldType.StatusMessage, str2);
        if (status != null) {
            bool2 = Boolean.valueOf(AbstractC167007dF.A1P(status.A00, 16));
        } else {
            bool2 = null;
        }
        A0f.A7v("status_is_cancelled", bool2);
        if (status != null) {
            bool3 = Boolean.valueOf(AbstractC31175DnJ.A1S(status.A00));
        } else {
            bool3 = null;
        }
        A0f.A7v("status_is_success", bool3);
        if (status != null) {
            bool4 = Boolean.valueOf(AbstractC167007dF.A1P(status.A00, 14));
        }
        A0f.A7v("status_is_interrupted", bool4);
        A0f.A9K("num_one_tap_accounts", AbstractC31171DnF.A0V(i));
        A0f.A7v("is_internal_build", false);
        A0f.A7v("is_auto_login_enable", Boolean.valueOf(z));
        A0f.Cht();
    }

    public static final void A01(AbstractC12990ll abstractC12990ll, String str) {
        double currentTimeMillis = System.currentTimeMillis();
        double A002 = C1Q9.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "ig_android_smart_lock_account_dialog_dismissed");
        AbstractC31179DnN.A15(A0f);
        AbstractC31179DnN.A17(A0f, currentTimeMillis, A002);
        AbstractC35274Fh9.A0D(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A0f.A7v("is_internal_build", false);
        A0f.AAP("flow", null);
        A0f.Cht();
    }

    public static final void A02(AbstractC12990ll abstractC12990ll, String str) {
        double currentTimeMillis = System.currentTimeMillis();
        double A002 = C1Q9.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "ig_android_smart_lock_dialog_account_selected");
        AbstractC31179DnN.A15(A0f);
        AbstractC31179DnN.A17(A0f, currentTimeMillis, A002);
        AbstractC35274Fh9.A0D(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A0f.A7v("is_internal_build", false);
        A0f.Cht();
    }

    public static final void A03(AbstractC12990ll abstractC12990ll, String str) {
        double currentTimeMillis = System.currentTimeMillis();
        double A002 = C1Q9.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "ig_android_smart_lock_dialog_no_account_selected");
        AbstractC31179DnN.A15(A0f);
        AbstractC31179DnN.A17(A0f, currentTimeMillis, A002);
        AbstractC35274Fh9.A0D(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A0f.A7v("is_internal_build", false);
        A0f.AAP("flow", null);
        A0f.Cht();
    }

    public final void A06(Status status, AbstractC12990ll abstractC12990ll, String str, String str2, String str3, int i, boolean z) {
        C14360o3.A0B(abstractC12990ll, 0);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "ig_android_smart_lock_error");
        AbstractC31179DnN.A15(A0f);
        AbstractC31178DnM.A15(A0f, currentTimeMillis, C1Q9.A00());
        AbstractC31176DnK.A1J(A0f, C1Q9.A00());
        A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        AbstractC31178DnM.A13(A0f);
        A0f.AAP("action", str2);
        A0f.AAP("error", str3);
        A0f.A9K("num_one_tap_accounts", AbstractC31171DnF.A0V(i));
        A0f.A7v("is_auto_login_enable", Boolean.valueOf(z));
        A0f.A7v("has_status", Boolean.valueOf(AbstractC167007dF.A1W(status)));
        if (status != null) {
            A0f.A7v("has_resolution", Boolean.valueOf(AbstractC167007dF.A1W(status.A01)));
            int i2 = status.A00;
            A0f.A9K(TraceFieldType.StatusCode, AbstractC31171DnF.A0V(i2));
            A0f.AAP(TraceFieldType.StatusMessage, status.A03);
            A0f.A7v("status_is_cancelled", Boolean.valueOf(AbstractC167007dF.A1P(i2, 16)));
            A0f.A7v("status_is_success", Boolean.valueOf(AbstractC31175DnJ.A1S(i2)));
            A0f.A7v("status_is_interrupted", Boolean.valueOf(AbstractC167007dF.A1P(i2, 14)));
        }
        A0f.Cht();
    }

    public static final void A04(AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "ig_android_smart_lock_error");
        AbstractC31179DnN.A15(A0f);
        AbstractC31178DnM.A15(A0f, currentTimeMillis, C1Q9.A00());
        AbstractC31176DnK.A1J(A0f, C1Q9.A00());
        A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        AbstractC31178DnM.A13(A0f);
        A0f.AAP("action", str2);
        A0f.AAP("error", str3);
        A0f.Cht();
    }

    public static final void A05(AbstractC12990ll abstractC12990ll, String str, String str2, boolean z, boolean z2) {
        long currentTimeMillis = System.currentTimeMillis();
        long A002 = C1Q9.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "ig_android_smart_lock_save_password");
        AbstractC31179DnN.A15(A0f);
        AbstractC31178DnM.A15(A0f, currentTimeMillis, A002);
        AbstractC31176DnK.A1J(A0f, A002);
        A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        AbstractC31178DnM.A13(A0f);
        A0f.A7v("success", Boolean.valueOf(z));
        A0f.A7v(MSV.A00(1123), Boolean.valueOf(z2));
        if (str2 != null) {
            A0f.AAP("error", str2);
        }
        A0f.Cht();
    }
}
