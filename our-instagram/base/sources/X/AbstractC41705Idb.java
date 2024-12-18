package X;

import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.MediaControlSurfaceEnum;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* renamed from: X.Idb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41705Idb {
    public static final void A02(MediaControlEventSourceEnum mediaControlEventSourceEnum, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, boolean z) {
        AbstractC167027dH.A12(userSession, interfaceC11380iw, c38321qM);
        C14360o3.A0B(str, 3);
        AbstractC40625Hzj.A00(mediaControlEventSourceEnum, MediaControlSurfaceEnum.A06, interfaceC11380iw, userSession, c38321qM, str, z);
    }

    public static final void A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, Long l, String str, String str2, List list, long j, boolean z, boolean z2) {
        String str3;
        String str4;
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        C14360o3.A0B(str, 3);
        String str5 = "on_impression";
        if (!C14360o3.A0K(str2, "on_impression")) {
            str5 = "sfplt_in_menu";
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36312170372400065L)) {
            String B3P = c38321qM.A0C.B3P();
            C14360o3.A0B(interfaceC11380iw, 1);
            if (z) {
                str4 = "explore_see_less";
            } else {
                str4 = "explore_see_less_undo";
            }
            C41771Ien.A08(interfaceC11380iw, userSession, null, c38321qM.BRp(), l, str4, c38321qM.getId(), AbstractC37303Gc4.A0T(userSession, c38321qM), str5, str, B3P, AbstractC25226BEj.A1G(c38321qM), AbstractC37300Gc1.A0S(c38321qM), null, null, c38321qM.A0C.Bl8(), str2, null, null, list, (int) j, true, z2);
            return;
        }
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            String Bl8 = c38321qM.A0C.Bl8();
            String Bu3 = c38321qM.A0C.Bu3();
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            if (z) {
                str3 = "clips/hide/";
            } else {
                str3 = "clips/unhide/";
            }
            A0c.A0E = str3;
            A0c.A9s("clips_media_id", A2u);
            A0c.A0H("recommendation_data", Bl8);
            A0c.A0H("sfplt_token", Bu3);
            C1GJ.A03(AbstractC31177DnL.A0Q(A0c));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final C25621Ms A00(UserSession userSession, String str) {
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/trend/");
        AbstractC37304Gc5.A1A(A0c, C124275jh.class, C37410Gdq.class, str);
        return A0c;
    }

    public static final C1ON A01(ClipsViewerSource clipsViewerSource, UserSession userSession, String str, String str2) {
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        Integer num = C05F.A01;
        A0q.A09(num);
        A0q.A0B("clips/playlist_clips/");
        AbstractC37301Gc2.A1N(A0q, "playlist_id", str, str2);
        A0q.A0H(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, clipsViewerSource.A00);
        A0q.A0A = "clips/playlist_clips/";
        A0q.A08(num);
        AbstractC37302Gc3.A1M(A0q, userSession, C37410Gdq.class);
        return A0q.A0N();
    }
}
