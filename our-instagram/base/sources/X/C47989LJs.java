package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.LJs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47989LJs {
    public static final C47989LJs A00 = new Object();

    public final void A03(AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        AbstractC167007dF.A1K(abstractC12990ll, str);
        A00(abstractC12990ll, false, str, str2, str3, null, null, null, null, null, null);
    }

    public final void A04(AbstractC12990ll abstractC12990ll, String str, String str2, String str3, String str4, String str5) {
        AbstractC167007dF.A1K(abstractC12990ll, str);
        A00(abstractC12990ll, false, str, str2, str3, str4, str5, null, null, null, null);
    }

    public static final void A01(AbstractC12990ll abstractC12990ll, String str, String str2, String str3, String str4) {
        A00(abstractC12990ll, Boolean.FALSE, str, str2, null, str3, str4, null, null, null, null);
    }

    public static final void A00(AbstractC12990ll abstractC12990ll, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AbstractC167017dG.A1N(abstractC12990ll, str);
        double currentTimeMillis = System.currentTimeMillis();
        double A002 = C1Q9.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "ig_autoconf_account_recovery");
        A0f.AAP("waterfall_id", C1Q9.A01());
        A0f.A8I("elapsed_time", Double.valueOf(currentTimeMillis - A002));
        A0f.A8I(TraceFieldType.StartTime, Double.valueOf(A002));
        A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A0f.AAP("event_name", str2);
        A0f.AAP("event_info", str3);
        A0f.AAP("exception_message", str6);
        A0f.AAP(AbstractC58317Pt9.A00(100), str7);
        A0f.AAP(TraceFieldType.FailureReason, str8);
        A0f.AAP("flow_type", str4);
        A0f.AAP("flow", str5);
        A0f.AAP(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str9);
        A0f.A7v("is_caa", bool);
        A0f.Cht();
    }

    public final void A02(AbstractC12990ll abstractC12990ll, String str, String str2) {
        AbstractC167017dG.A1N(abstractC12990ll, str);
        A01(abstractC12990ll, str, str2, null, null);
    }
}
