package X;

import android.content.Context;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.search.MusicOverlayResultsListController;

/* renamed from: X.Pbq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57268Pbq extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ JIN A01;
    public final /* synthetic */ MusicOverlayResultsListController A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57268Pbq(JIN jin, MusicOverlayResultsListController musicOverlayResultsListController, String str, int i, boolean z, boolean z2) {
        super(0);
        this.A05 = z;
        this.A03 = str;
        this.A00 = i;
        this.A02 = musicOverlayResultsListController;
        this.A01 = jin;
        this.A04 = z2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        if (this.A05) {
            String str2 = this.A03;
            if (str2.length() == 0) {
                str2 = "unknown";
            }
            int i = this.A00;
            MusicOverlayResultsListController musicOverlayResultsListController = this.A02;
            String str3 = musicOverlayResultsListController.A0H;
            C14360o3.A0B(str3, 5);
            UserSession userSession = musicOverlayResultsListController.A0A;
            JIN jin = this.A01;
            String A00 = musicOverlayResultsListController.A02.A00();
            String str4 = musicOverlayResultsListController.A02.A06;
            String str5 = musicOverlayResultsListController.A0I;
            EnumC50631MWs enumC50631MWs = musicOverlayResultsListController.A07;
            MusicProduct musicProduct = musicOverlayResultsListController.A08;
            boolean z = this.A04;
            String str6 = musicOverlayResultsListController.A0F.A04;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(str5, 5);
            AbstractC167017dG.A1U(enumC50631MWs, musicProduct);
            C449024u c449024u = AnonymousClass229.A01(userSession).A0I;
            if (str4 == null) {
                str4 = "";
            }
            if (str6 != null && str6.length() != 0) {
                str = AnonymousClass229.A01(userSession).A03.A07;
            } else {
                str = "not_search";
            }
            C14360o3.A0B(str, 8);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c449024u.A01, "ig_camera_ui_tool_save");
            if (A0f.isSampled()) {
                MSW.A1N(C81X.A1i, A0f);
                MSW.A1V(A0f, "IG_CAMERA_MUSIC_BROWSE_SONG_SAVE");
                C22M c22m = c449024u.A04;
                MSZ.A1E(A0f, c22m, "camera_session_id", MSX.A0f(c22m));
                AbstractC25233BEq.A17(A0f, "module", C22F.A08.getModuleName());
                MSY.A15(A0f, jin);
                A0f.A9K("audio_asset_id", AbstractC25231BEo.A0j(0, jin.getId()));
                A0f.A9K("audio_cluster_id", AbstractC449424y.A08(jin.getAudioClusterId()));
                MSZ.A1D(A0f, i);
                MSY.A14(A0f, jin);
                AbstractC167007dF.A11(A0f, c449024u);
                A0f.AAP("category", A00);
                A0f.AAP("subcategory", str4);
                AbstractC166997dE.A1N(A0f, "event_type", 2);
                A0f.AAP("browse_session_id", str5);
                A0f.AAP("section_name", str2);
                Long A0d = AbstractC167007dF.A0d();
                A0f.A9K("section_index", A0d);
                A0f.AAP("save_method", "swipe");
                A0f.AAP("audio_browser_surface", str3);
                A0f.AAP("audio_type", jin.CBi().A00);
                AbstractC166997dE.A1N(A0f, "camera_position", MSZ.A05(c22m));
                A0f.A9K("capture_format_index", A0d);
                MSW.A1M(enumC50631MWs, A0f);
                MSX.A1G(A0f, c22m);
                A0f.A7v("is_bookmarked", Boolean.valueOf(z));
                AbstractC50522MSa.A19(A0f, c449024u);
                A0f.AAP("search_session_id", str);
                A0f.Cht();
            }
        }
        MusicOverlayResultsListController musicOverlayResultsListController2 = this.A02;
        UserSession userSession2 = musicOverlayResultsListController2.A0A;
        if (C18U.A06(AbstractC166997dE.A0U(userSession2), userSession2, 36325733877953849L)) {
            C50669MYn c50669MYn = musicOverlayResultsListController2.A0G;
            Context requireContext = musicOverlayResultsListController2.A09.requireContext();
            boolean z2 = !this.A04;
            ImageUrl AsT = this.A01.AsT();
            MTX A1F = MSW.A1F(musicOverlayResultsListController2, 26);
            C31349DqE c31349DqE = c50669MYn.A00;
            if (c31349DqE != null) {
                AbstractC31177DnL.A1L(c31349DqE);
            }
            C31349DqE A01 = AbstractC76643c9.A01(requireContext, userSession2, AsT, new J8Z(new ICW(A1F), 38), z2);
            c50669MYn.A00 = A01;
            AbstractC166997dE.A1O(C41451vu.A01, A01);
        }
        return C0eB.A00;
    }
}
