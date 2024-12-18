package X;

import android.app.Activity;
import android.content.Context;
import android.webkit.URLUtil;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicConsumptionModel;

/* loaded from: classes9.dex */
public abstract class OXs {
    public static final void A00(Activity activity, Context context, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, boolean z) {
        String str;
        AbstractC167017dG.A1O(context, userSession);
        C14360o3.A0B(interfaceC11380iw, 4);
        if (A02(userSession, c38321qM)) {
            String A04 = C18U.A04(C06090Tz.A05, userSession, 36886484808172252L);
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            A0I.A0A(2131962503);
            A0I.A09(2131962502);
            A0I.A0J(new DialogInterfaceOnClickListenerC55318Ogg(1, context, fragment, interfaceC11380iw, userSession, c38321qM), 2131962505);
            if (URLUtil.isValidUrl(A04)) {
                A0I.A0H(new DialogInterfaceOnClickListenerC35352FiT(activity, interfaceC11380iw, userSession, A04, 2), 2131962504);
            }
            String str2 = null;
            AbstractC31176DnK.A16(null, A0I, 2131960994);
            C22C A01 = AnonymousClass229.A01(userSession);
            if (c38321qM != null) {
                str2 = c38321qM.A2u();
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, "ig_camera_notification_impression");
            if (A0f.isSampled()) {
                if (z) {
                    str = "NOTIFICATION_AUDIO_REPLACE";
                } else {
                    str = "FEED_EDIT_AUDIO_REPLACE";
                }
                MSX.A1E(A0f);
                C22M c22m = ((C22F) A01).A04;
                AbstractC166987dD.A1S(A0f, c22m.A0L);
                AbstractC166997dE.A1N(A0f, "entity_type", 50);
                AbstractC167017dG.A1B(A0f);
                AbstractC43594JPz.A1B(A0f, c22m);
                A0f.AAP("interest_topic_pick_session_id", "");
                MSW.A1M(EnumC50631MWs.A07, A0f);
                AbstractC37302Gc3.A0t(A0f);
                AbstractC37300Gc1.A0h(A0f, C22F.A0F(str2));
                A0f.AAP("dialog_entry_point", str);
                A0f.Cht();
            }
        }
    }

    public static final boolean A01(UserSession userSession, C38321qM c38321qM) {
        boolean A05;
        C14360o3.A0B(userSession, 1);
        if (c38321qM != null && !c38321qM.A4z()) {
            if (!c38321qM.A5M() && c38321qM.A5x()) {
                A05 = C36A.A09(userSession);
            } else if (c38321qM.A5M() && !c38321qM.A4i()) {
                A05 = C36A.A04(userSession);
            } else if (c38321qM.A5M() && c38321qM.A4i()) {
                A05 = C36A.A05(userSession);
            } else {
                return false;
            }
            if (A05 && C18U.A06(C06090Tz.A05, userSession, 36323534854827356L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, C38321qM c38321qM) {
        C3XR musicMetadata;
        MusicInfo BVc;
        MusicConsumptionModel BVa;
        C14360o3.A0B(userSession, 1);
        if (c38321qM != null && (musicMetadata = c38321qM.A0C.getMusicMetadata()) != null && (BVc = musicMetadata.BVc()) != null && (BVa = BVc.BVa()) != null && AbstractC166997dE.A1Z(BVa.Buu(), true) && C18U.A06(C06090Tz.A05, userSession, 36323534854696283L)) {
            return true;
        }
        return false;
    }
}
