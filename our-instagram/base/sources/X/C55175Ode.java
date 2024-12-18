package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicSearchPlaylistType;
import java.util.List;

/* renamed from: X.Ode, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55175Ode {
    public JIN A00;
    public C54690ODq A01;
    public final java.util.Set A04 = AbstractC166987dD.A1H();
    public final java.util.Set A03 = AbstractC166987dD.A1H();
    public final List A02 = AbstractC166987dD.A1E();

    public static final void A00(EnumC50631MWs enumC50631MWs, MusicProduct musicProduct, UserSession userSession, JIN jin, MusicBrowseCategory musicBrowseCategory, String str, String str2, String str3) {
        String str4;
        AbstractC167007dF.A1F(userSession, 0, str2);
        C14360o3.A0B(musicBrowseCategory, 6);
        AbstractC25233BEq.A0y(7, str3, musicProduct, enumC50631MWs);
        if (str.length() == 0) {
            str = "unknown";
        }
        C24U c24u = AnonymousClass229.A01(userSession).A03;
        C24Q c24q = c24u.A0E;
        long A03 = c24q.A03(17645025, c24u.A0D);
        c24u.A04 = A03;
        c24q.A09(A03, "use_case", "music_overlay_results_play_icon");
        C22C A01 = AnonymousClass229.A01(userSession);
        musicBrowseCategory.A00();
        String str5 = musicBrowseCategory.A04;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, "ig_camera_music_browse_song_preview");
        if (A0f.isSampled()) {
            C22M c22m = ((C22F) A01).A04;
            String str6 = c22m.A0L;
            if (str6 != null && c22m.A0C != null) {
                MSY.A15(A0f, jin);
                AbstractC166987dD.A1S(A0f, str6);
                AbstractC50522MSa.A16(c22m.A09, A0f, 2);
                AbstractC167017dG.A1B(A0f);
                MSY.A13(A0f, musicProduct);
                A0f.AAP("section_name", str);
                MSZ.A1F(A0f, jin, "song_name", jin.getTitle());
                A0f.A9K("audio_asset_id", AbstractC25228BEl.A13(jin.getId()));
                A0f.A9K("audio_cluster_id", AbstractC449424y.A08(jin.getAudioClusterId()));
                String str7 = jin.CBi().A00;
                A0f.AAP("audio_type", str7);
                A0f.AAP("browse_session_id", str3);
                AbstractC167007dF.A10(A0f, A01);
                AbstractC50522MSa.A17(A0f, MSZ.A05(c22m));
                AbstractC167007dF.A11(A0f, A01);
                A0f.AAP("category", str7);
                A0f.AAP("discovery_session_id", c22m.A0O);
                A0f.AAP("search_text", null);
                AbstractC50522MSa.A1C(A0f, jin);
                MSW.A1O(AnonymousClass249.ALBUM, A0f);
                A0f.AAP("search_session_id", c22m.A0P);
                A0f.AAP("subcategory", str5);
                MSW.A1M(enumC50631MWs, A0f);
                AbstractC37302Gc3.A0t(A0f);
                AbstractC50522MSa.A19(A0f, A01);
                A0f.Cht();
                return;
            }
            String str8 = "";
            if (str6 != null) {
                str4 = "";
            } else {
                str4 = "mCameraSession";
            }
            if (c22m.A0C == null) {
                str8 = "mSurface";
            }
            AbstractC12120kG.A01("IgCameraLoggerImpl", String.format("logMusicPreviewTrack() %s %s null", str4, str8));
        }
    }

    public static final void A01(EnumC50631MWs enumC50631MWs, MusicProduct musicProduct, UserSession userSession, JIN jin, String str, String str2, String str3, String str4, int i) {
        C14360o3.A0B(userSession, 0);
        AbstractC25234BEr.A0k(3, str2, str3, str4, musicProduct);
        C14360o3.A0B(enumC50631MWs, 8);
        C22C A01 = AnonymousClass229.A01(userSession);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, "ig_camera_music_browse_song_impression");
        if (A0f.isSampled()) {
            A0f.A9K("audio_asset_id", AbstractC25228BEl.A13(jin.getId()));
            AbstractC167007dF.A10(A0f, A01);
            MSY.A15(A0f, jin);
            A0f.AAP("audio_type", jin.CBi().A00);
            MSY.A14(A0f, jin);
            AbstractC167007dF.A11(A0f, A01);
            A0f.AAP("category", "artist_spotlight");
            A0f.AAP("subcategory", null);
            C22M c22m = ((C22F) A01).A04;
            MSX.A1F(A0f, c22m);
            AbstractC50522MSa.A1E(A0f, "camera_session_id", c22m.A0L);
            AbstractC50522MSa.A1C(A0f, jin);
            AbstractC31171DnF.A1D(A0f, str3);
            MSW.A1M(enumC50631MWs, A0f);
            MSZ.A1F(A0f, jin, "browse_session_id", str4);
            MSY.A13(A0f, musicProduct);
            Long A0d = AbstractC167007dF.A0d();
            A0f.A9K("capture_format_index", A0d);
            A0f.A9K("section_id", C22F.A0F(str));
            A0f.A9K("section_index", A0d);
            A0f.AAP("section_name", str2);
            MSZ.A1D(A0f, i);
            A0f.AAP("audio_browser_surface", "preview");
            AbstractC43594JPz.A1B(A0f, c22m);
            AbstractC167017dG.A1C(A0f);
        }
    }

    public static final void A02(EnumC50631MWs enumC50631MWs, MusicProduct musicProduct, UserSession userSession, JIN jin, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        AbstractC167007dF.A1F(userSession, 0, str2);
        AbstractC25233BEq.A0y(7, str5, musicProduct, enumC50631MWs);
        if (str.length() == 0) {
            str = "unknown";
        }
        C22C A01 = AnonymousClass229.A01(userSession);
        if (str4 == null) {
            str4 = "";
        }
        C448124l c448124l = A01.A09;
        C25531Mh A0G = MSW.A0G(c448124l);
        if (AbstractC25226BEj.A1Z(A0G)) {
            A0G.A0s("IG_CAMERA_MUSIC_BROWSE_SONG_PREVIEW_PAUSE");
            A0G.A0q("MUSIC_BROWSE_SONG_PREVIEW_PAUSE");
            C448124l.A00(A0G, c448124l);
            A0G.A0R("artist_name", jin.getDisplayArtist());
            A0G.A0Q("audio_asset_id", AbstractC25231BEo.A0j(0, jin.getId()));
            A0G.A0Q("audio_cluster_id", AbstractC449424y.A08(jin.getAudioClusterId()));
            A0G.A0Q("audio_index", AbstractC31171DnF.A0V(i));
            A0G.A0R("song_name", jin.getTitle());
            MSY.A19(A0G, c448124l);
            A0G.A0R("category", str3);
            A0G.A0R("subcategory", str4);
            C22M c22m = c448124l.A04;
            A0G.A0b(c22m.A09);
            A0G.A0W(2);
            A0G.A0R("browse_session_id", str5);
            AbstractC167007dF.A13(A0G);
            A0G.A0R("section_name", str);
            Long A0d = AbstractC167007dF.A0d();
            A0G.A0Q("section_index", A0d);
            A0G.A0R("audio_browser_surface", str2);
            A0G.A0R("audio_type", jin.CBi().A00);
            A0G.A0a(c448124l.A0J());
            A0G.A0V(MSZ.A05(c22m));
            A0G.A0Q("capture_format_index", A0d);
            MSW.A1P(enumC50631MWs, A0G);
            A0G.A0c(c22m.A0A);
            A0G.A0O("is_bookmarked", Boolean.valueOf(z));
            AbstractC167017dG.A1D(A0G);
        }
    }

    public static final void A03(EnumC50631MWs enumC50631MWs, UserSession userSession, String str, String str2, String str3) {
        AbstractC167027dH.A0a(0, userSession, str2, str3, enumC50631MWs);
        C448124l A0S = MSW.A0S(userSession);
        C25531Mh A0G = MSW.A0G(A0S);
        if (AbstractC25226BEj.A1Z(A0G)) {
            A0G.A0q("MUSIC_BROWSE_SEE_MORE");
            C448124l.A00(A0G, A0S);
            MSY.A19(A0G, A0S);
            A0G.A0R("category", str);
            C22M c22m = A0S.A04;
            A0G.A0b(c22m.A09);
            A0G.A0W(2);
            A0G.A0R("browse_session_id", str3);
            AbstractC167007dF.A13(A0G);
            A0G.A0R("section_name", str2);
            A0G.A0V(MSZ.A05(c22m));
            A0G.A0Q("capture_format_index", AbstractC167007dF.A0d());
            MSW.A1P(enumC50631MWs, A0G);
            A0G.A0c(c22m.A0A);
            AbstractC167017dG.A1D(A0G);
        }
    }

    public final void A04(EnumC46263Kdv enumC46263Kdv, C8BN c8bn, EnumC203578zI enumC203578zI, EnumC50631MWs enumC50631MWs, MusicProduct musicProduct, UserSession userSession, String str, String str2, String str3) {
        C55U c55u;
        C14360o3.A0B(userSession, 0);
        AbstractC167027dH.A13(str, str2, musicProduct);
        C22C A01 = AnonymousClass229.A01(userSession);
        if (enumC50631MWs == EnumC50631MWs.A0G) {
            int ordinal = musicProduct.ordinal();
            if (ordinal != 15) {
                if (ordinal != 13) {
                    c55u = null;
                } else {
                    c55u = C128535rM.A00;
                }
            } else {
                c55u = C1811581r.A00;
            }
            C22M c22m = ((C22F) A01).A04;
            c22m.A0C = enumC50631MWs;
            UserSession userSession2 = ((C22F) A01).A03;
            c22m.A0L = AbstractC193278h7.A00(userSession2).A00();
            if (c55u != null) {
                C82X.A00(userSession2).A00 = c55u;
                c22m.A08 = c55u.A00;
            }
        }
        C448724r c448724r = A01.A0F;
        InterfaceC02590Ai A0M = MSZ.A0M(c448724r);
        if (A0M.isSampled()) {
            MSW.A1N(C81X.A1f, A0M);
            MSW.A1V(A0M, "IG_CAMERA_MUSIC_BROWSE_OPEN");
            C22M c22m2 = c448724r.A04;
            AbstractC166987dD.A1S(A0M, MSX.A0f(c22m2));
            AbstractC50522MSa.A16(c22m2.A09, A0M, 1);
            MSW.A1M(enumC50631MWs, A0M);
            A0M.A8R(enumC203578zI, "surface_element");
            A0M.AAP("browse_session_id", str2);
            AbstractC31171DnF.A1D(A0M, str);
            MSX.A1G(A0M, c22m2);
            AbstractC167007dF.A11(A0M, c448724r);
            MSY.A13(A0M, musicProduct);
            AbstractC167007dF.A10(A0M, c448724r);
            A0M.A8R(c22m2.A0A, "composition_media_type");
            A0M.A8R(c8bn, "music_browser_entry_point");
            A0M.A8R(enumC46263Kdv, "audio_editor_entry_point");
            AbstractC37302Gc3.A0t(A0M);
            A0M.A7v("is_panavision", Boolean.valueOf(c22m2.A0W));
            AbstractC37300Gc1.A0h(A0M, C22F.A0F(str3));
            A0M.Cht();
        }
    }

    public final void A06(C8BN c8bn, EnumC50631MWs enumC50631MWs, MusicProduct musicProduct, UserSession userSession, JIN jin, MusicBrowseCategory musicBrowseCategory, C54690ODq c54690ODq, String str, String str2, String str3) {
        String A00;
        C14360o3.A0B(userSession, 0);
        AbstractC25234BEr.A0k(3, musicBrowseCategory, str, musicProduct, str2);
        C14360o3.A0B(enumC50631MWs, 8);
        if (this.A04.add(jin.getId())) {
            C22C A01 = AnonymousClass229.A01(userSession);
            if (!"server_loaded".equals(musicBrowseCategory.A00()) || (A00 = musicBrowseCategory.A03) == null) {
                A00 = musicBrowseCategory.A00();
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, "ig_camera_music_browse_song_impression");
            if (A0f.isSampled()) {
                Long A0d = AbstractC167007dF.A0d();
                try {
                    A0d = Long.valueOf(Long.parseLong(jin.getId()));
                } catch (NumberFormatException unused) {
                }
                A0f.A9K("audio_asset_id", A0d);
                AbstractC167007dF.A10(A0f, A01);
                MSY.A15(A0f, jin);
                AbstractC50522MSa.A1B(A0f, jin);
                MSY.A14(A0f, jin);
                AbstractC167007dF.A11(A0f, A01);
                A0f.AAP("category", A00);
                C22M c22m = ((C22F) A01).A04;
                MSX.A1F(A0f, c22m);
                AbstractC50522MSa.A1E(A0f, "camera_session_id", c22m.A0L);
                AbstractC50522MSa.A1C(A0f, jin);
                AbstractC31171DnF.A1D(A0f, str2);
                MSW.A1M(enumC50631MWs, A0f);
                MSZ.A1F(A0f, jin, "browse_session_id", str);
                MSY.A13(A0f, musicProduct);
                A0f.A9K("capture_format_index", A0d);
                A0f.AAP("section_name", c54690ODq.A05);
                A0f.A9K("section_index", AbstractC31171DnF.A0V(c54690ODq.A01));
                MSZ.A1D(A0f, c54690ODq.A00);
                A0f.AAP("audio_browser_surface", c54690ODq.A03);
                A0f.A9K("section_id", C22F.A0F(c54690ODq.A04));
                AbstractC43594JPz.A1B(A0f, c22m);
                A0f.AAP("search_text", null);
                AbstractC37302Gc3.A0t(A0f);
                A0f.A8R(c8bn, "music_browser_entry_point");
                AbstractC37300Gc1.A0h(A0f, C22F.A0F(str3));
                A0f.Cht();
            }
        }
    }

    public final void A05(C8BN c8bn, EnumC203578zI enumC203578zI, EnumC50631MWs enumC50631MWs, MusicProduct musicProduct, UserSession userSession, JIN jin, MusicBrowseCategory musicBrowseCategory, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Long l;
        String A00;
        String str8 = str2;
        String str9 = str;
        AbstractC167007dF.A1G(userSession, 0, str3);
        AbstractC25233BEq.A0y(7, musicBrowseCategory, str5, musicProduct);
        AbstractC25229BEm.A1L(enumC50631MWs, 10, str6);
        String str10 = "";
        String str11 = "";
        if (str == null) {
            str9 = "";
        }
        if (str9.length() == 0) {
            str9 = musicBrowseCategory.A04;
        }
        if (str8.length() == 0) {
            String str12 = musicBrowseCategory.A06;
            if (str12 != null) {
                str10 = str12;
            }
            if (str10.length() == 0) {
                str10 = "unknown";
            }
            str8 = str10;
        }
        int A03 = AbstractC31177DnL.A03(num);
        if (musicProduct == MusicProduct.A06) {
            l = Long.valueOf(AbstractC31177DnL.A06());
        } else {
            l = null;
        }
        C54690ODq c54690ODq = new C54690ODq(l, str9, str8, str3, 0, A03);
        this.A02.add(AbstractC166987dD.A1L(jin, c54690ODq));
        if (musicBrowseCategory.A01 == MusicSearchPlaylistType.A06) {
            A00 = "spotify_playlist";
        } else if (!"server_loaded".equals(musicBrowseCategory.A00()) || (A00 = musicBrowseCategory.A03) == null) {
            A00 = musicBrowseCategory.A00();
        }
        C22C A01 = AnonymousClass229.A01(userSession);
        String str13 = musicBrowseCategory.A04;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, "ig_camera_music_browse_song_select");
        if (A0f.isSampled()) {
            C22M c22m = ((C22F) A01).A04;
            if (c22m.A0C != null) {
                MSY.A15(A0f, jin);
                A0f.AAP("browse_session_id", str5);
                AbstractC167007dF.A10(A0f, A01);
                AbstractC166987dD.A1S(A0f, c22m.A0L);
                AbstractC167007dF.A11(A0f, A01);
                A0f.AAP("category", A00);
                AbstractC166997dE.A1N(A0f, "event_type", 2);
                AbstractC31171DnF.A1D(A0f, str6);
                MSZ.A1F(A0f, jin, "song_name", jin.getTitle());
                MSZ.A1D(A0f, c54690ODq.A00);
                A0f.A9K("audio_asset_id", AbstractC25228BEl.A13(jin.getId()));
                A0f.AAP("audio_browser_surface", c54690ODq.A03);
                AbstractC50522MSa.A1B(A0f, jin);
                AbstractC50522MSa.A17(A0f, MSZ.A05(c22m));
                MSX.A1F(A0f, c22m);
                A0f.AAP("search_text", str4);
                AbstractC50522MSa.A1C(A0f, jin);
                MSW.A1O(AnonymousClass249.ALBUM, A0f);
                MSY.A13(A0f, musicProduct);
                A0f.AAP("section_name", c54690ODq.A05);
                A0f.A9K("section_id", C22F.A0F(c54690ODq.A04));
                A0f.AAP("subcategory", str13);
                MSW.A1M(enumC50631MWs, A0f);
                A0f.A8R(enumC203578zI, "surface_element");
                AbstractC37302Gc3.A0t(A0f);
                AbstractC50522MSa.A19(A0f, A01);
                A0f.A8R(c8bn, "music_browser_entry_point");
                AbstractC37300Gc1.A0h(A0f, C22F.A0F(str7));
                A0f.Cht();
                return;
            }
            if (c22m.A0L == null) {
                str11 = "mCameraSession";
            }
            AbstractC12120kG.A01("IgCameraLoggerImpl", String.format("logMusicSelectTrack() %s %s null", str11, "mSurface"));
        }
    }

    public final void A07(UserSession userSession, JIN jin, String str, String str2, int i) {
        AbstractC167007dF.A1F(userSession, 0, str2);
        this.A00 = jin;
        this.A01 = new C54690ODq(null, str, str2, "preview", 0, i);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) AnonymousClass229.A01(userSession)).A01, AbstractC43591JPw.A00(81));
        if (A0f.isSampled()) {
            A0f.AAP("containermodule", HMW.__redex_internal_original_name);
            A0f.AAP("media_compound_key", jin.getId());
            AbstractC25225BEi.A1M(EnumC39652Hih.A05, A0f);
            A0f.A9K("target_id", AbstractC25228BEl.A13(jin.getId()));
            A0f.AAP("media_tap_token", AbstractC166997dE.A0n());
            A0f.A9K(AbstractC43591JPw.A00(36), null);
            AbstractC25230BEn.A1C(A0f, i);
            AbstractC25225BEi.A1P(A0f, null);
            A0f.AAP("viewer_init_media_compound_key", null);
            A0f.AAP(AbstractC111324zv.A00(125), null);
            A0f.AAP("ranking_info_token", null);
            A0f.A9K("is_trending_label", null);
            A0f.AAP("audio_sub_type", null);
            A0f.A9K(AbstractC43591JPw.A00(447), C22F.A0F(str));
            A0f.AAP("playlist_name", str2);
            AbstractC25232BEp.A1L(A0f, "nav_chain", AbstractC25225BEi.A14());
        }
    }
}
