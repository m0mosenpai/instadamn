package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;

/* renamed from: X.Idn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41717Idn {
    public final UserSession A00;

    public static final void A00(Activity activity, UserSession userSession, C38321qM c38321qM) {
        String str;
        String id = c38321qM.getId();
        if (id != null && (str = (String) AbstractC001800i.A0J(AbstractC001900j.A0R(id, new String[]{"_"}, 0))) != null) {
            new C41627IbI(userSession).A02(new C39028HGe(activity, userSession, c38321qM, id, 0), EnumC46210Kcm.A04, str, null);
        }
    }

    public static final void A01(Activity activity, C41717Idn c41717Idn, String str, String str2, String str3, ArrayList arrayList) {
        if (arrayList == null) {
            new C41627IbI(c41717Idn.A00).A02(new C52221N9k(activity, c41717Idn, str, str2, 0), EnumC46210Kcm.A04, str, null);
        } else {
            A02(activity, c41717Idn, str, str2, str3, arrayList, false);
        }
        String str4 = (String) AbstractC001800i.A0J(AbstractC167007dF.A0m(str, "_", 0));
        if (str4 != null) {
            C55101ObE c55101ObE = new C55101ObE(c41717Idn.A00, activity);
            UserSession userSession = c55101ObE.A07;
            InterfaceC11380iw interfaceC11380iw = c55101ObE.A05;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC111324zv.A00(1023));
            if (A0f.isSampled()) {
                AbstractC25225BEi.A1M(EnumC39652Hih.A0l, A0f);
                AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
                Long l = null;
                try {
                    l = AbstractC166997dE.A0j(str4);
                } catch (NumberFormatException unused) {
                }
                AbstractC37300Gc1.A0h(A0f, l);
                AbstractC25225BEi.A1N(A0f, c55101ObE.A08);
                A0f.Cht();
            }
        }
    }

    public static final void A02(Activity activity, C41717Idn c41717Idn, String str, String str2, String str3, ArrayList arrayList, boolean z) {
        Class<ModalActivity> cls;
        Bundle bundle;
        int i;
        UserSession userSession = c41717Idn.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36320244912431299L)) {
            String str4 = (String) AbstractC001800i.A0J(AbstractC167007dF.A0m(str, "_", 0));
            cls = ModalActivity.class;
            String A0j = AbstractC167017dG.A0j();
            bundle = AbstractC166987dD.A0b();
            bundle.putStringArrayList("initial_media_id_list", AbstractC166987dD.A1F(arrayList));
            bundle.putString("parent_media_id", str4);
            bundle.putString("next_max_id", str3);
            bundle.putString("viewer_session_id", A0j);
            i = 2828;
        } else {
            String A0n = AbstractC166997dE.A0n();
            ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
            contextualFeedFragment.setArguments(C31569Dtv.A00(null, null, null, null, null, null, "open_carousel_review_page", null, null, null, "open_carousel_review_page", str3, null, str, str2, null, null, null, A0n, null, arrayList, 0, false, false, z, false, false, false, false, false, true, false));
            cls = ModalActivity.class;
            bundle = contextualFeedFragment.mArguments;
            i = 848;
        }
        AbstractC31177DnL.A0n(activity, bundle, userSession, cls, AbstractC111324zv.A00(i));
    }

    public C41717Idn(UserSession userSession) {
        this.A00 = userSession;
    }
}
