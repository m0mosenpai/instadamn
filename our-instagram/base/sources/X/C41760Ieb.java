package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ClipsMashupType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ieb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41760Ieb {
    public static final C41760Ieb A00 = new Object();

    public static final void A01(FragmentActivity fragmentActivity, C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, UserSession userSession, InterfaceC60442pS interfaceC60442pS, EnumC65855TvH enumC65855TvH, C37540Gfw c37540Gfw, ILW ilw, C37560GgG c37560GgG, String str) {
        String str2;
        String str3;
        C9C1 A0E;
        if (c37560GgG != null && (A0E = c37560GgG.A0E()) != null) {
            str2 = A0E.A02;
        } else {
            str2 = null;
        }
        User A09 = c120985dq.A09(userSession);
        C39457Hbj c39457Hbj = new C39457Hbj(2, c120985dq, interfaceC31077DlK, c37540Gfw, ilw);
        WEz A01 = AbstractC69993VzD.A01(fragmentActivity, interfaceC60442pS, userSession, enumC65855TvH, VG2.A0d, str);
        A01.A01 = A09;
        A01.A09("ranking_info_token", c120985dq.A0Q);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            str3 = c38321qM.A0C.Bl8();
        } else {
            str3 = null;
        }
        A01.A09("recommendation_data", str3);
        C38321qM c38321qM2 = c120985dq.A02;
        A01.A09("inventory_source", c38321qM2 != null ? AbstractC37300Gc1.A0S(c38321qM2) : null);
        A01.A09("translation_data", str2);
        AbstractC37301Gc2.A1R(A01, c39457Hbj);
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM) {
        C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
        A0H.A0A(2131952391);
        A0H.A0r(AnonymousClass001.A0g(fragmentActivity.getString(2131952389), "\n\n", fragmentActivity.getString(2131952390)));
        A0H.A0Z(new DialogInterfaceOnClickListenerC41805IfL(9, fragmentActivity, userSession, c38321qM), EnumC193348hE.A03, AbstractC166997dE.A0p(fragmentActivity, 2131952393), true);
        A0H.A06();
        AbstractC166987dD.A1W(A0H);
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [X.0ps, java.lang.Object] */
    public static final void A00(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, ClipsViewerConfig clipsViewerConfig, ClipsViewerSource clipsViewerSource, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, IG5 ig5) {
        C4GI BZr;
        String pk;
        InterfaceC84163p3 A1P;
        C4GI BZr2;
        C14360o3.A0B(clipsViewerSource, 9);
        InterfaceC84163p3 A1P2 = c38321qM.A1P();
        if (A1P2 != null && (BZr = A1P2.BZr()) != null) {
            ?? obj = new Object();
            if (clipsViewerSource == ClipsViewerSource.A29 && (A1P = c38321qM.A1P()) != null && (BZr2 = A1P.BZr()) != null && AbstractC166997dE.A1Z(BZr2.CXM(), true)) {
                String A2u = c38321qM.A2u();
                if (A2u != null) {
                    obj.A00 = C41738IeA.A02(abstractC59962oe.getViewLifecycleOwner(), userSession, A2u, "try_remix");
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            if (C18U.A06(C06090Tz.A05, userSession, 36327387440364078L)) {
                pk = AnonymousClass001.A0T(BZr.getPk(), BZr.CDj().getId(), '_');
            } else {
                pk = BZr.getPk();
            }
            FVK.A01(userSession, C1GJ.A01(), new C42532IsB(fragmentActivity, abstractC59962oe, clipsViewerConfig, clipsViewerSource, c120985dq, c37644Ghd, interfaceC11380iw, userSession, c38321qM, ig5, obj), pk);
            return;
        }
        C0f5 AEp = C18950wb.A01.AEp("ClipsOrganicMoreOptionsActionUtil", 817902720);
        AEp.ABW(DialogModule.KEY_MESSAGE, "No original media found for Remix passthrough.");
        AEp.report();
    }

    public static final void A03(AbstractC59962oe abstractC59962oe, ClipsViewerSource clipsViewerSource) {
        ClipsMashupType clipsMashupType;
        String str;
        int i;
        if (clipsViewerSource != ClipsViewerSource.A2F && clipsViewerSource != ClipsViewerSource.A2H) {
            clipsMashupType = ClipsMashupType.A0B;
        } else {
            clipsMashupType = ClipsMashupType.A0A;
        }
        ClipsMashupType clipsMashupType2 = ClipsMashupType.A0A;
        Context context = abstractC59962oe.getContext();
        if (clipsMashupType == clipsMashupType2) {
            str = "sequencing_unavailable";
            i = 2131956201;
        } else {
            str = "remix_unavailable";
            i = 2131956197;
        }
        C9GR.A0F(context, str, i);
    }

    public static final void A04(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        F7S.A00(abstractC59962oe, userSession, c38321qM, interfaceC11380iw.getModuleName());
        if (AbstractC166987dD.A10(userSession).equals(c38321qM.A2E(userSession))) {
            AbstractC37303Gc4.A1C(AbstractC12220kQ.A02(userSession), "instagram_feed_overflow_menu_insights_option_tap");
        }
    }
}
