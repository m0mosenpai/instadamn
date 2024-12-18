package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MZu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50699MZu implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "CreationLogger";
    public C22P A00 = C22P.A5N;
    public AnonymousClass249 A01 = AnonymousClass249.OTHER;
    public String A02;
    public boolean A03;
    public final C18920wW A04;
    public final UserSession A05;

    public final void A07(C22P c22p) {
        C14360o3.A0B(c22p, 0);
        if (this.A03) {
            String str = this.A02;
            if (str != null) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("sessionId: ");
                A1C.append(str);
                AbstractC12120kG.A08("CreationLogger#duplicateStartGallerySession", AbstractC167017dG.A0n(c22p, " entryPoint: ", A1C), null);
            }
            UserSession userSession = this.A05;
            String A0t = AbstractC166997dE.A0t(userSession);
            this.A02 = A0t;
            if (A0t == null) {
                this.A02 = AbstractC193278h7.A00(userSession).A00();
            }
            this.A00 = c22p;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A04, "ig_feed_gallery_start_session");
            if (A0f.isSampled()) {
                AbstractC166987dD.A1S(A0f, A03(this));
                A0f.A8R(this.A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                AbstractC166997dE.A1N(A0f, "event_type", 1);
                A0f.AAP("gallery_type", "old_gallery");
                AbstractC31171DnF.A1D(A0f, "ig_creation_client_events");
                AbstractC167017dG.A1C(A0f);
            }
        }
    }

    public final void A0E(String str, int i, int i2, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A04, "instagram_tag_limit_reached");
        MSW.A1U(A0f, A02(A0f, this, "session_instance_id", A02(A0f, this, "prior_module", str)));
        A0f.A7v("is_organic_product_tagging", AbstractC31173DnH.A0e(A0f, "usage", "feed_sharing", z));
        A0f.A9K("products_tagged_count", MSX.A0a(A0f, AbstractC31171DnF.A0V(i), "users_tagged_count", i2));
        A0f.AAP("prior_submodule", null);
        A0f.Cht();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_creation_client_events";
    }

    public static InterfaceC02590Ai A01(InterfaceC02530Ab interfaceC02530Ab, C50699MZu c50699MZu) {
        C18920wW c18920wW = c50699MZu.A04;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_ads_conversion_funnel");
        A00.A8R(interfaceC02530Ab, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A00.AAP("seller_igid", c50699MZu.A05.userId);
        return A00;
    }

    public static String A03(C50699MZu c50699MZu) {
        String str = c50699MZu.A02;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static final void A04(C50699MZu c50699MZu, String str) {
        C22C A01 = AnonymousClass229.A01(c50699MZu.A05);
        String A03 = A03(c50699MZu);
        C22P c22p = c50699MZu.A00;
        AnonymousClass249 anonymousClass249 = c50699MZu.A01;
        C448724r c448724r = A01.A0F;
        AbstractC167007dF.A1E(c22p, 2, anonymousClass249);
        InterfaceC02590Ai A0M = MSZ.A0M(c448724r);
        if (A0M.isSampled()) {
            MSW.A1N(C81X.A0P, A0M);
            A0M.AAP("camera_session_id", AbstractC50522MSa.A0i(A0M, c448724r, "IG_FEED_GALLERY_ASPECT_RATIO_TOGGLE"));
            A0M.AAP("camera_session_id", A03);
            A0M.AAP("crop_action", str);
            AbstractC50522MSa.A16(c22p, A0M, 2);
            A0M.AAP("gallery_type", "old_gallery");
            MSW.A1O(anonymousClass249, A0M);
            AbstractC167017dG.A1B(A0M);
            AbstractC167017dG.A1C(A0M);
        }
    }

    public final void A05() {
        String str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A04, "ig_camera_invite_collaborator_person_removed");
        if (A0f.isSampled() && (str = this.A02) != null) {
            AbstractC166987dD.A1S(A0f, str);
            MSX.A1E(A0f);
            A0f.A8R(EnumC193318hB.A03, "capture_type");
            AbstractC167017dG.A1A(this.A00, A0f);
            MSW.A1O(this.A01, A0f);
            AbstractC31171DnF.A1D(A0f, "ig_creation_client_events");
            MSW.A1M(EnumC50631MWs.A0L, A0f);
            AbstractC167017dG.A1C(A0f);
        }
    }

    public final void A06(EnumC114925Hg enumC114925Hg, AnonymousClass249 anonymousClass249, List list, List list2, List list3, List list4, int i) {
        if (this.A00 == C22P.A5N) {
            this.A00 = ((C22F) AnonymousClass229.A01(this.A05)).A04.A09;
        }
        this.A01 = anonymousClass249;
        UserSession userSession = this.A05;
        String A0t = AbstractC166997dE.A0t(userSession);
        if (A0t != null) {
            this.A02 = A0t;
        }
        C449124v c449124v = AnonymousClass229.A01(userSession).A0A;
        String A03 = A03(this);
        C22P c22p = this.A00;
        boolean A1V = AbstractC167007dF.A1V(c22p);
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(((C22F) c449124v).A01, "ig_camera_start_post_capture_session"), 206);
        if (AbstractC25226BEj.A1Z(A0A)) {
            EnumC114925Hg enumC114925Hg2 = EnumC114925Hg.FEED;
            A0A.A0a(enumC114925Hg2);
            A0A.A0S("camera_tools_struct", C16930sl.A00);
            A0A.A0V(3);
            A0A.A0R("camera_session_id", A03);
            A0A.A0Q("capture_format_index", AbstractC167007dF.A0d());
            A0A.A0M(EnumC193318hB.A03, "capture_type");
            A0A.A0M(c22p, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0A.A0W(A1V ? 1 : 0);
            A0A.A0c(anonymousClass249);
            AbstractC167007dF.A13(A0A);
            MSW.A1P(EnumC50631MWs.A0I, A0A);
            A0A.A0R("composition_str_id", "");
            A0A.A0M(null, "composition_media_type");
            A0A.A0O("is_panavision", false);
            A0A.A0O("is_feed_fork", false);
            MSY.A1A(A0A);
            A0A.A0Q(AbstractC111324zv.A00(4894), AbstractC31171DnF.A0V(i));
            A0A.A0S("height_width", list);
            A0A.A0S("original_height_width", list2);
            A0A.A0S("bitrate_list", list3);
            if (enumC114925Hg == null) {
                enumC114925Hg = enumC114925Hg2;
            }
            A0A.A0M(enumC114925Hg, "bottom_camera_dial_selected");
            if (AbstractC199368rd.A00(((C22F) c449124v).A03).booleanValue()) {
                C14120nc.A00().ATO(new V6Z(A0A, c449124v, list4));
            } else {
                A0A.Cht();
            }
        }
    }

    public final void A08(AnonymousClass249 anonymousClass249) {
        C22C A01 = AnonymousClass229.A01(this.A05);
        C22P c22p = this.A00;
        String A03 = A03(this);
        C448024k c448024k = A01.A07;
        C14360o3.A0B(c22p, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448024k.A01, "ig_camera_end_session");
        if (A0f.isSampled()) {
            MSW.A1R(A0f, "POST_CAPTURE");
            A0f.AAP("camera_session_id", AbstractC50522MSa.A0i(A0f, c448024k, "IG_CAMERA_END_POST_CAPTURE_SESSION"));
            MSX.A1E(A0f);
            A0f.AAk("camera_tools_struct", Collections.emptyList());
            AbstractC166997dE.A1N(A0f, "camera_position", 3);
            A0f.AAP("camera_session_id", A03);
            A0f.A9K("capture_format_index", AbstractC167007dF.A0d());
            A0f.A8R(EnumC193318hB.A03, "capture_type");
            AbstractC50522MSa.A16(c22p, A0f, 1);
            MSW.A1O(anonymousClass249, A0f);
            AbstractC167017dG.A1B(A0f);
            MSX.A1C(A0f);
            A0f.AAP("composition_str_id", "");
            A0f.A8R(AnonymousClass249.NONE, "composition_media_type");
            A0f.A7v("is_panavision", false);
            AbstractC37302Gc3.A0t(A0f);
            AbstractC25234BEr.A11(A0f, "device_aspect_ratio_category", AbstractC82663mU.A00);
            A0f.Cht();
        }
    }

    public final void A09(AnonymousClass249 anonymousClass249, int i) {
        C22C A01 = AnonymousClass229.A01(this.A05);
        if (anonymousClass249 == null) {
            anonymousClass249 = this.A01;
        }
        String A03 = A03(this);
        C22P c22p = this.A00;
        C448024k c448024k = A01.A07;
        C14360o3.A0B(c22p, 3);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448024k.A01, "ig_camera_end_session");
        if (A0f.isSampled()) {
            MSW.A1R(A0f, "GALLERY_FEED_TEMP");
            MSW.A1V(A0f, "IG_FEED_GALLERY_END_SESSION");
            C22M c22m = c448024k.A04;
            A0f.AAP("camera_session_id", MSX.A0f(c22m));
            A0f.AAP("camera_session_id", A03);
            A0f.A8R(c22p, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            AbstractC166997dE.A1N(A0f, "exit_point", i);
            AbstractC166997dE.A1N(A0f, "event_type", 1);
            A0f.AAP("gallery_type", "old_gallery");
            if (anonymousClass249 == null) {
                anonymousClass249 = c22m.A0A;
            }
            MSW.A1O(anonymousClass249, A0f);
            AbstractC25233BEq.A17(A0f, "module", C22F.A08.getModuleName());
            AbstractC25234BEr.A11(A0f, "device_aspect_ratio_category", AbstractC82663mU.A00);
            A0f.Cht();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x015d, code lost:
    
        if (r67.A0L() != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(X.AnonymousClass249 r66, com.instagram.reels.prompt.model.PromptStickerModel r67, java.util.List r68) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50699MZu.A0A(X.249, com.instagram.reels.prompt.model.PromptStickerModel, java.util.List):void");
    }

    public final void A0B(EnumC39584Hdu enumC39584Hdu, String str, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A04, "instagram_shopping_product_tagging_row_impression");
        MSW.A1U(A0f, A02(A0f, this, "session_instance_id", A02(A0f, this, "prior_module", str)));
        AbstractC50523MSb.A0x(A0f, AbstractC31173DnH.A0e(A0f, "usage", enumC39584Hdu.A00, z));
    }

    public final void A0C(EnumC39584Hdu enumC39584Hdu, String str, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A04, "instagram_shopping_product_tagging_row_tap");
        MSW.A1U(A0f, A02(A0f, this, "session_instance_id", A02(A0f, this, "prior_module", str)));
        AbstractC50523MSb.A0x(A0f, AbstractC31173DnH.A0e(A0f, "usage", enumC39584Hdu.A00, z));
    }

    public final void A0D(String str) {
        String str2 = this.A02;
        if (str2 != null) {
            AnonymousClass229.A01(this.A05).A0F.A0T(this.A00, str2, str);
        }
    }

    public final void A0F(List list) {
        C22C A01 = AnonymousClass229.A01(this.A05);
        String A03 = A03(this);
        C22P c22p = this.A00;
        C448724r c448724r = A01.A0F;
        C14360o3.A0B(c22p, 2);
        InterfaceC02590Ai A0M = MSZ.A0M(c448724r);
        if (A0M.isSampled()) {
            MSW.A1N(C81X.A2j, A0M);
            A0M.AAP("camera_session_id", AbstractC50522MSa.A0i(A0M, c448724r, "IG_FEED_GALLERY_SELECT_ALBUM"));
            A0M.AAP("camera_session_id", A03);
            AbstractC50522MSa.A16(c22p, A0M, 2);
            A0M.AAP("gallery_type", "old_gallery");
            AbstractC25233BEq.A17(A0M, "module", C22F.A08.getModuleName());
            A0M.A7v("has_rbs_folder", Boolean.valueOf(C22F.A0H(list)));
            A0M.Cht();
        }
    }

    public final void A0G(List list) {
        C22C A01 = AnonymousClass229.A01(this.A05);
        C22P c22p = this.A00;
        String A03 = A03(this);
        C448724r c448724r = A01.A0F;
        C14360o3.A0B(c22p, 1);
        InterfaceC02590Ai A0M = MSZ.A0M(c448724r);
        if (A0M.isSampled()) {
            MSW.A1N(C81X.A2k, A0M);
            A0M.AAP("camera_session_id", AbstractC50522MSa.A0i(A0M, c448724r, "IG_FEED_GALLERY_TAP_ALBUM_PICKER"));
            AbstractC50522MSa.A16(c22p, A0M, 2);
            A0M.AAP("camera_session_id", A03);
            AbstractC167017dG.A1B(A0M);
            AbstractC25233BEq.A17(A0M, "gallery_type", "old_gallery");
            A0M.A7v("has_rbs_folder", Boolean.valueOf(C22F.A0H(list)));
            A0M.Cht();
        }
    }

    public C50699MZu(UserSession userSession) {
        this.A05 = userSession;
        this.A04 = AbstractC12220kQ.A01(this, userSession);
    }

    public static final Pair A00(C47Z c47z) {
        C5QK c5qk;
        int i;
        String str;
        C217899kM c217899kM;
        List list;
        List list2;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (c47z != null) {
            C5QB c5qb = c47z.A18;
            if (c5qb != null && (list2 = c5qb.A02) != null) {
                A1E.addAll(list2);
            }
            List A0K = c47z.A0K();
            if (A0K != null && AbstractC166987dD.A1b(A0K)) {
                Iterator A0o = MSX.A0o(c47z);
                while (A0o.hasNext()) {
                    C5QB c5qb2 = AbstractC43592JPx.A0l(A0o).A18;
                    if (c5qb2 != null && (list = c5qb2.A02) != null) {
                        A1E.addAll(list);
                    }
                }
            }
        }
        if (!AbstractC25226BEj.A1b(A1E)) {
            return null;
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        ArrayList A1E3 = AbstractC166987dD.A1E();
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            C203318yo c203318yo = (C203318yo) it.next();
            C5NM c5nm = c203318yo.A00;
            if (c5nm != null && (c217899kM = c5nm.A0E) != null) {
                String A00 = c217899kM.BlQ().A00();
                C14360o3.A07(A00);
                A1E2.add(A00);
                A1E3.add("local_image_sticker");
            }
            C5NM c5nm2 = c203318yo.A00;
            if (c5nm2 != null && (c5qk = c5nm2.A0X) != null) {
                C5QL c5ql = c5qk.A0D;
                if (c5ql != null && (str = c5ql.A00) != null) {
                    i = str.hashCode();
                } else {
                    i = 0;
                }
                A1E2.add(AnonymousClass001.A0O("text_sticker_", i));
                A1E3.add(AbstractC111324zv.A00(273));
            }
        }
        return new Pair(A1E2, A1E3);
    }

    public static String A02(InterfaceC02590Ai interfaceC02590Ai, C50699MZu c50699MZu, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        String str3 = c50699MZu.A02;
        if (str3 == null) {
            return "";
        }
        return str3;
    }
}
