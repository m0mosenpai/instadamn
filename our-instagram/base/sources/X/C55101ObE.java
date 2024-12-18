package X;

import android.content.Context;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Map;

/* renamed from: X.ObE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55101ObE {
    public String A00;
    public final Context A01;
    public final EnumC193318hB A02;
    public final EnumC114925Hg A03;
    public final EnumC50631MWs A04;
    public final InterfaceC11380iw A05;
    public final C18920wW A06;
    public final UserSession A07;
    public final String A08;

    public static final Long A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            return AbstractC166997dE.A0j(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final String A01(C22P c22p, C55101ObE c55101ObE, Long l, String str, Map map) {
        if (str == null) {
            str = AbstractC167017dG.A0j();
        }
        C43822JZk A00 = AbstractC208269Jl.A00(c55101ObE.A07);
        EnumC114925Hg enumC114925Hg = c55101ObE.A03;
        A00.A06(enumC114925Hg, c22p);
        C18920wW c18920wW = c55101ObE.A06;
        C12180kM c12180kM = c18920wW.A00;
        InterfaceC02590Ai A002 = c18920wW.A00(c12180kM, "ig_camera_start_camera_session");
        if (A002.isSampled()) {
            A002.A9K("ar_core_version", AbstractC167007dF.A0d());
            AbstractC37300Gc1.A0h(A002, l);
            AbstractC166987dD.A1S(A002, str);
            A002.A8R(enumC114925Hg, "camera_destination");
            A002.A8R(c22p, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            AbstractC167027dH.A0u(A002, "nav_chain", c55101ObE.A08);
        }
        InterfaceC02590Ai A003 = c18920wW.A00(c12180kM, "ig_camera_start_capture_format_session");
        if (A003.isSampled()) {
            AbstractC166997dE.A1N(A003, "camera_position", 3);
            AbstractC166987dD.A1S(A003, str);
            A003.A8R(enumC114925Hg, "camera_destination");
            A003.A9K("capture_format_index", AbstractC167007dF.A0d());
            A003.A8R(EnumC193318hB.A08, "capture_type");
            AbstractC167017dG.A1A(c22p, A003);
            MSW.A1O(AnonymousClass249.OTHER, A003);
            AbstractC31175DnJ.A14(A003, c55101ObE.A05);
            MSW.A1M(c55101ObE.A04, A003);
            AbstractC167027dH.A0u(A003, "nav_chain", c55101ObE.A08);
        }
        InterfaceC02590Ai A004 = c18920wW.A00(c12180kM, "ig_camera_end_camera_session");
        if (A004.isSampled()) {
            AbstractC166997dE.A1N(A004, "event_type", 2);
            AbstractC31175DnJ.A14(A004, c55101ObE.A05);
            A004.A8R(enumC114925Hg, "camera_destination");
            AbstractC166987dD.A1S(A004, str);
            AbstractC166997dE.A1N(A004, "exit_point", 15);
            A004.A8R(c22p, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            AbstractC50522MSa.A17(A004, 3);
            A004.AAP("discovery_session_id", "");
            A004.AAP("search_session_id", "");
            A004.A8R(c55101ObE.A02, "capture_type");
            AbstractC25225BEi.A1N(A004, c55101ObE.A08);
            A004.Cht();
        }
        InterfaceC02590Ai A005 = c18920wW.A00(c12180kM, "ig_camera_end_capture_format_session");
        if (A005.isSampled()) {
            A005.A8R(enumC114925Hg, "camera_destination");
            AbstractC166997dE.A1N(A005, "camera_position", 3);
            AbstractC166987dD.A1S(A005, str);
            C16930sl c16930sl = C16930sl.A00;
            A005.AAk("camera_tools", c16930sl);
            A005.AAk("camera_tools_struct", c16930sl);
            A005.A8R(c55101ObE.A02, "capture_type");
            AbstractC167017dG.A1A(c22p, A005);
            AbstractC31175DnJ.A14(A005, c55101ObE.A05);
            MSW.A1M(c55101ObE.A04, A005);
            AbstractC167027dH.A0u(A005, "nav_chain", c55101ObE.A08);
        }
        C25531Mh A0A = AbstractC31171DnF.A0A(c18920wW.A00(c12180kM, "ig_camera_publish_media"), 203);
        if (AbstractC25226BEj.A1Z(A0A)) {
            AbstractC50523MSb.A1A(A0A, enumC114925Hg);
            AbstractC50523MSb.A14(A0A, str);
            A0A.A0M(c55101ObE.A02, "capture_type");
            AbstractC50523MSb.A0t(c22p, A0A);
            A0A.A0c(AnonymousClass249.OTHER);
            A0A.A0m(c55101ObE.A05.getModuleName());
            A0A.A0S("share_destination_list", AbstractC166987dD.A1J(EnumC53371NjM.FEED));
            MSW.A1P(c55101ObE.A04, A0A);
            A0A.A0N(new C0Zx(), "input_metadata");
            A0A.A0R("product", "ig_open_carousel");
            A0A.A0t(c55101ObE.A08);
            ((AbstractC02600Aj) A0A).A00.A9M("open_carousel_review_page_selected_filter", map);
            A0A.Cht();
        }
        C25531Mh A09 = C25531Mh.A09(c18920wW);
        if (AbstractC25226BEj.A1Z(A09)) {
            AbstractC50523MSb.A1A(A09, enumC114925Hg);
            AbstractC50523MSb.A14(A09, str);
            A09.A0M(c55101ObE.A02, "capture_type");
            AbstractC50523MSb.A0t(c22p, A09);
            A09.A0c(AnonymousClass249.OTHER);
            InterfaceC11380iw interfaceC11380iw = c55101ObE.A05;
            A09.A0m(interfaceC11380iw.getModuleName());
            A09.A0M(EnumC53371NjM.FEED, "share_destination");
            MSW.A1P(c55101ObE.A04, A09);
            A09.A0N(new C0Zx(), "input_metadata");
            A09.A0R("product", interfaceC11380iw.getModuleName());
            A09.A0t(c55101ObE.A08);
            ((AbstractC02600Aj) A09).A00.A9M("open_carousel_review_page_selected_filter", map);
            A09.Cht();
        }
        return str;
    }

    public final void A02() {
        UserSession userSession = this.A07;
        AnonymousClass229.A01(userSession).A0Y();
        A03();
        AnonymousClass229.A01(userSession).A0W();
        AnonymousClass229.A02(userSession);
    }

    public final void A03() {
        AnonymousClass229.A01(this.A07).A0A.A0c(C128535rM.A00);
    }

    public final void A04(EnumC39652Hih enumC39652Hih, String str) {
        UserSession userSession = this.A07;
        InterfaceC11380iw interfaceC11380iw = this.A05;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC43591JPw.A00(398));
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1M(enumC39652Hih, A0f);
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            AbstractC25225BEi.A1N(A0f, this.A08);
            AbstractC37300Gc1.A0h(A0f, A00(str));
            A0f.Cht();
        }
    }

    public final void A06(boolean z) {
        UserSession userSession = this.A07;
        InterfaceC11380iw interfaceC11380iw = this.A05;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_camera_notification_impression");
        if (A0f.isSampled()) {
            int i = 43;
            if (z) {
                i = 44;
            }
            MSX.A1E(A0f);
            AbstractC166987dD.A1S(A0f, AbstractC166997dE.A0n());
            AbstractC166997dE.A1N(A0f, "entity_type", i);
            AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
            AbstractC25225BEi.A1N(A0f, this.A08);
            A0f.Cht();
        }
    }

    public final void A07(boolean z, String str) {
        UserSession userSession = this.A07;
        C22C A01 = AnonymousClass229.A01(userSession);
        if (z) {
            A01.A0z(EnumC114925Hg.FEED, AnonymousClass249.OTHER, null);
        } else {
            A01.A0Y();
        }
        if (str != null) {
            ((C22F) A01).A04.A0R = str;
        }
        A03();
        C449124v c449124v = A01.A0A;
        MYO myo = MYO.OTHER;
        AnonymousClass249 anonymousClass249 = AnonymousClass249.OTHER;
        C16930sl c16930sl = C16930sl.A00;
        C128535rM c128535rM = C128535rM.A00;
        C16920sk A0E = AbstractC06930Yk.A0E();
        EnumC50631MWs enumC50631MWs = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A05;
        String moduleName = interfaceC11380iw.getModuleName();
        EnumC53371NjM enumC53371NjM = EnumC53371NjM.FEED;
        c449124v.A0V(null, myo, anonymousClass249, enumC50631MWs, new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false), c128535rM, false, moduleName, null, null, c16930sl, c16930sl, c16930sl, c16930sl, AbstractC166987dD.A1J(enumC53371NjM), A0E, 1, 0, false);
        c449124v.A0U(null, myo, anonymousClass249, null, enumC53371NjM, enumC50631MWs, c128535rM, null, null, false, null, null, null, null, interfaceC11380iw.getModuleName(), null, null, null, null, null, c16930sl, c16930sl, c16930sl, c16930sl, null, null, null, null, AbstractC06930Yk.A0E(), -1, 1, 0, 0, 0, false, false, false, false);
        AnonymousClass229.A01(userSession).A0W();
        AnonymousClass229.A02(userSession);
    }

    public C55101ObE(UserSession userSession, Context context) {
        AbstractC167017dG.A1P(userSession, context);
        this.A07 = userSession;
        this.A01 = context;
        C19270xB A0D = AbstractC31171DnF.A0D("ig_open_carousel");
        this.A05 = A0D;
        this.A08 = AbstractC25225BEi.A14();
        this.A06 = AbstractC12220kQ.A01(A0D, userSession);
        this.A04 = EnumC50631MWs.A0H;
        this.A03 = EnumC114925Hg.FEED;
        this.A02 = EnumC193318hB.A08;
    }

    public final void A05(EnumC39652Hih enumC39652Hih, String str) {
        Long A00 = A00(str);
        UserSession userSession = this.A07;
        InterfaceC11380iw interfaceC11380iw = this.A05;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC43591JPw.A00(398));
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1M(enumC39652Hih, A0f);
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            AbstractC25225BEi.A1N(A0f, this.A08);
            AbstractC25225BEi.A1P(A0f, this.A00);
            AbstractC37300Gc1.A0h(A0f, A00);
            A0f.Cht();
        }
    }
}
