package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.FOt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34660FOt {
    public final void A00(EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        EnumC33471Er6 enumC33471Er6;
        C25531Mh A0A;
        String str6;
        C18920wW A0Q = AbstractC31173DnH.A0Q(interfaceC11380iw, userSession, str3, 7);
        String A14 = AbstractC25225BEi.A14();
        if (i == 0) {
            enumC33471Er6 = EnumC33471Er6.INSTAGRAM;
        } else {
            enumC33471Er6 = EnumC33471Er6.FACEBOOK;
        }
        long j = 0;
        if (z) {
            A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(A0Q, "ig_block"), 197);
            if (num == null) {
                str6 = "";
            } else if (num.intValue() == 0) {
                str6 = "single";
            } else {
                str6 = "multi_future";
            }
        } else {
            A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(A0Q, "ig_unblock"), 275);
            str6 = "";
        }
        A0A.A0R("action_type", str6);
        A0A.A0R(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        Long A0j = AbstractC166997dE.A0j(str2);
        if (A0j != null) {
            j = A0j.longValue();
        }
        A0A.A0Q("target_user_id", Long.valueOf(j));
        A0A.A0M(enumC33471Er6, "target_user_type");
        A0A.A0R(TraceFieldType.RequestID, str3);
        A0A.A0R("click_point", str4);
        A0A.A0R("direct_thread_id", str5);
        A0A.A0M(enumC1579076z, "direct_source");
        A0A.A0M(enumC33464Eqz, "direct_source_type");
        A0A.A0t(A14);
        A0A.Cht();
    }
}
