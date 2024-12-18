package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;

/* renamed from: X.OXn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55030OXn {
    public static final void A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C448124l A0S = MSW.A0S(userSession);
        C25531Mh A0G = MSW.A0G(A0S);
        EnumC114925Hg A0J = A0S.A0J();
        C22M c22m = A0S.A04;
        String str = c22m.A0L;
        if (AbstractC25226BEj.A1Z(A0G) && A0J != null && str != null) {
            MSW.A1W(A0G);
            A0G.A0q("SUGGESTED_AUDIO_PILL_DISMISSED");
            C448124l.A00(A0G, A0S);
            A0G.A0a(A0J);
            A0G.A0b(c22m.A09);
            A0G.A0U();
            A0G.A0M(EnumC203578zI.SUGGESTED_AUDIO_PILL, "surface_element");
            A0G.A0R("camera_session_id", str);
            AbstractC167007dF.A13(A0G);
            A0G.A0c(c22m.A0A);
            MSY.A1A(A0G);
            A0G.A0R("composition_str_id", c22m.A0M);
            A0G.A0M(c22m.A0A, "composition_media_type");
            A0G.Cht();
        }
    }

    public static final void A01(UserSession userSession, JIN jin, String str) {
        C14360o3.A0B(userSession, 0);
        C22C A01 = AnonymousClass229.A01(userSession);
        C448824s c448824s = A01.A0G;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448824s.A01, "ig_camera_ui_tool_impression");
        if (A0f.isSampled()) {
            MSW.A1N(C81X.A2a, A0f);
            AbstractC166987dD.A1S(A0f, MSX.A0f(c448824s.A04));
            MSX.A1E(A0f);
            MSX.A1C(A0f);
            A0f.A8R(EnumC203578zI.SUGGESTED_AUDIO_PILL, "surface_element");
            MSY.A13(A0f, MusicProduct.A0G);
            A0f.A8R(C8BN.NO_MUSIC_BROWSER, "music_browser_entry_point");
            AbstractC31175DnJ.A15(A0f, "CREATE");
        }
        InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(((C22F) A01).A01, "ig_camera_music_browse_song_impression");
        if (A0f2.isSampled()) {
            Long A0d = AbstractC167007dF.A0d();
            try {
                A0d = Long.valueOf(Long.parseLong(jin.BgD()));
            } catch (NumberFormatException e) {
                AbstractC12120kG.A0H("IgCameraLoggerImpl", e);
            }
            A0f2.A9K("audio_asset_id", A0d);
            MSX.A1E(A0f2);
            MSY.A15(A0f2, jin);
            AbstractC50522MSa.A1B(A0f2, jin);
            MSY.A14(A0f2, jin);
            AbstractC167007dF.A11(A0f2, A01);
            C22M c22m = ((C22F) A01).A04;
            MSX.A1F(A0f2, c22m);
            AbstractC166987dD.A1S(A0f2, c22m.A0L);
            AbstractC50522MSa.A1C(A0f2, jin);
            MSZ.A1F(A0f2, jin, "browse_session_id", str);
            A0f2.A8R(C8BN.NO_MUSIC_BROWSER, "music_browser_entry_point");
            AbstractC25233BEq.A17(A0f2, "product", AbstractC65993Txo.A00(MusicProduct.A0G));
            MSX.A1C(A0f2);
            A0f2.A8R(EnumC203578zI.SUGGESTED_AUDIO_PILL, "surface_element");
            A0f2.Cht();
        }
    }

    public static final void A02(UserSession userSession, JIN jin, String str, String str2, boolean z) {
        AbstractC25233BEq.A0v(0, userSession, str, str2);
        C55175Ode c55175Ode = new C55175Ode();
        MusicBrowseCategory A01 = C50535MSo.A01("feed_browse");
        MusicProduct musicProduct = MusicProduct.A0G;
        EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0I;
        EnumC203578zI enumC203578zI = EnumC203578zI.SUGGESTED_AUDIO_PILL;
        C8BN c8bn = C8BN.NO_MUSIC_BROWSER;
        c55175Ode.A05(c8bn, enumC203578zI, enumC50631MWs, musicProduct, userSession, jin, A01, 0, "2282005535164995", "unknown", "preview", null, str, str2, null);
        C22C A012 = AnonymousClass229.A01(userSession);
        if (z) {
            C448624q c448624q = A012.A0E;
            C25531Mh A0A = C25531Mh.A0A(c448624q.A01);
            if (AbstractC25226BEj.A1Z(A0A)) {
                A0A.A0M(C81X.A2b, "tool_type");
                C448624q.A00(A0A, c448624q);
                AbstractC167007dF.A14(A0A, c448624q.A04);
                MSW.A1P(enumC50631MWs, A0A);
                A0A.A0M(enumC203578zI, "surface_element");
                A0A.A0M(c8bn, "music_browser_entry_point");
                AbstractC167007dF.A13(A0A);
                A0A.A0a(EnumC114925Hg.FEED);
                AbstractC167017dG.A1D(A0A);
                return;
            }
            return;
        }
        C448724r c448724r = A012.A0F;
        InterfaceC02590Ai A0M = MSZ.A0M(c448724r);
        if (!A0M.isSampled()) {
            return;
        }
        MSW.A1N(C81X.A2a, A0M);
        C22M c22m = c448724r.A04;
        MSZ.A1E(A0M, c22m, "camera_session_id", MSX.A0f(c22m));
        AbstractC50522MSa.A1E(A0M, "action", "CREATE");
        MSW.A1M(enumC50631MWs, A0M);
        A0M.A8R(enumC203578zI, "surface_element");
        A0M.A8R(c8bn, "music_browser_entry_point");
        AbstractC167017dG.A1B(A0M);
        MSX.A1E(A0M);
        AbstractC167017dG.A1C(A0M);
    }
}
