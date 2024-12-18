package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IQF {
    @Deprecated
    public static void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
            C19280xC A00 = C19280xC.A00(interfaceC11380iw, AbstractC111324zv.A00(4296));
            A00.A0C("pk", str);
            A00.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directShareTarget.A08());
            if (Collections.unmodifiableList(directShareTarget.A0Q).size() == 1) {
                A00.A0C("a_pk", ((PendingRecipient) AbstractC166987dD.A16(Collections.unmodifiableList(directShareTarget.A0Q))).getId());
            }
            AbstractC31173DnH.A1S(A00, userSession);
        }
    }

    public static void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, C141596ac c141596ac, SearchContext searchContext, Double d, Integer num, Integer num2, String str, String str2, int i) {
        C11520jB c11520jB;
        Long l;
        Long l2;
        String str3;
        String str4;
        Long l3;
        String str5;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        String str6;
        String str7;
        C0Zx c0Zx;
        double d2;
        C4GI BZr;
        User CDj;
        C4GI BZr2;
        String pk;
        String id;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC111324zv.A00(109));
        if (A0f.isSampled()) {
            Hashtag B7K = c38321qM.A0C.B7K();
            if (interfaceC11380iw instanceof AnonymousClass309) {
                c11520jB = ((AnonymousClass309) interfaceC11380iw).E6Q(c38321qM);
            } else {
                c11520jB = null;
            }
            if (c38321qM.A0C.C6Y() != null && c38321qM.A0C.C6Y().BoO() != null && C18U.A06(C06090Tz.A05, userSession, 36328272203824541L)) {
                l = AbstractC25229BEm.A0n(c38321qM.A0C.C6Y().BoO());
            } else {
                l = null;
            }
            if (c38321qM.A2E(userSession) == null) {
                C0f5 AEp = C18950wb.A01.AEp("reportMediaPrivateShareButtonClick: Media Author is null so Apk cannot be set.", 817891009);
                AEp.ABW("Media Id", c38321qM.getId());
                AEp.report();
                return;
            }
            Integer valueOf = Integer.valueOf(i);
            String A05 = C38801rC.A05(AbstractC128985sJ.A0B(c38321qM, valueOf));
            AbstractC37300Gc1.A0s(A0f, null);
            A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
            A0f.A7v("is_checkout_enabled", null);
            A0f.AAP("inventory_source", AbstractC37300Gc1.A0S(c38321qM));
            AbstractC37300Gc1.A0l(A0f, AbstractC128985sJ.A09(c38321qM));
            A0f.A9K("merchant_id", null);
            AbstractC37300Gc1.A0n(A0f, null);
            AbstractC37300Gc1.A0i(A0f, null);
            A0f.AAk("product_ids", null);
            AbstractC37300Gc1.A0o(A0f, c38321qM.CAR());
            UpcomingEvent A2B = c38321qM.A2B(userSession);
            if (A2B != null && (id = A2B.getId()) != null) {
                l2 = AbstractC166997dE.A0j(id);
            } else {
                l2 = null;
            }
            A0f.A9K("upcoming_event_id", l2);
            A0f.A9K("a_pk", Long.valueOf(AbstractC128985sJ.A00(userSession, c38321qM)));
            if (c11520jB != null) {
                str3 = AbstractC37300Gc1.A0R(C5I8.A6U, c11520jB);
            } else {
                str3 = null;
            }
            A0f.AAP("parent_m_pk", str3);
            A0f.A9K("m_t", AbstractC37302Gc3.A0U(c38321qM));
            A0f.AAP(AbstractC31670Dva.A00(), str);
            A0f.AAP("hashtag_follow_status", AbstractC1120253r.A02(B7K));
            if (B7K != null) {
                str4 = B7K.getName();
            } else {
                str4 = null;
            }
            A0f.AAP("hashtag_name", str4);
            if (B7K != null && B7K.getId() != null) {
                l3 = AbstractC25228BEl.A13(B7K.getId());
            } else {
                l3 = null;
            }
            A0f.A9K("hashtag_id", l3);
            if (c11520jB != null) {
                str5 = AbstractC37300Gc1.A0R(AbstractC129005sL.A00, c11520jB);
            } else {
                str5 = null;
            }
            A0f.AAP("hashtag_feed_type", str5);
            InterfaceC84163p3 A1P = c38321qM.A1P();
            if (A1P != null && (BZr2 = A1P.BZr()) != null && (pk = BZr2.getPk()) != null) {
                l4 = AbstractC166997dE.A0j(pk);
            } else {
                l4 = null;
            }
            A0f.A9K("chaining_seed_media_id", l4);
            InterfaceC84163p3 A1P2 = c38321qM.A1P();
            if (A1P2 != null && (BZr = A1P2.BZr()) != null && (CDj = BZr.CDj()) != null) {
                l5 = AbstractC25231BEo.A0k(CDj);
            } else {
                l5 = null;
            }
            A0f.A9K("chaining_seed_author_id", l5);
            AbstractC37302Gc3.A0y(A0f, c38321qM);
            AbstractC37302Gc3.A0z(A0f, c38321qM);
            if (num2 != null) {
                l6 = Long.valueOf(num2.longValue());
            } else {
                l6 = null;
            }
            A0f.A9K("recs_ix", l6);
            if (num != null) {
                l7 = Long.valueOf(num.longValue());
            } else {
                l7 = null;
            }
            A0f.A9K("m_ix", l7);
            A0f.AAP("tray_session_id", null);
            A0f.AAP(AbstractC111324zv.A00(5315), null);
            A0f.AAP("comment_id", null);
            A0f.AAP("rank_token", searchContext != null ? searchContext.A03 : null);
            if (searchContext != null) {
                str6 = searchContext.A02;
            } else {
                str6 = null;
            }
            A0f.AAP("query_text", str6);
            if (searchContext != null) {
                str7 = searchContext.A05;
            } else {
                str7 = null;
            }
            A0f.AAP("search_session_id", str7);
            A0f.AAP("serp_session_id", searchContext != null ? searchContext.A06 : null);
            A0f.A9K("carousel_index", AbstractC128985sJ.A03(c38321qM, valueOf));
            A0f.AAP("carousel_media_id", A05);
            A0f.A9K("carousel_media_id_int", AbstractC82733mb.A00(A05));
            A0f.AAP("carousel_cover_media_id", AbstractC128985sJ.A0A(c38321qM, valueOf));
            A0f.A8I(AbstractC111324zv.A00(1100), d);
            A0f.A9K("reshare_count", l);
            if (AbstractC75373a4.A07(userSession) && c38321qM.A0C.CAf() != null && !c38321qM.A0C.CAf().isEmpty()) {
                List CAf = c38321qM.A0C.CAf();
                CAf.getClass();
                A0f.AAP("translated_language", ((InterfaceC105674pe) CAf.get(0)).BL7());
                A0f.AAk("translation_delivery_method", Collections.singletonList(EnumC37904Gm1.CLOSED_CAPTION));
            }
            if (C18U.A06(C06090Tz.A06, userSession, 36324776101556685L)) {
                if (c75113Zb != null && interfaceC11380iw.getModuleName().equals("feed_timeline")) {
                    c0Zx = new C0Zx();
                    c0Zx.A03("is_delayed_skip_ad", Boolean.valueOf(c75113Zb.A2r));
                    c0Zx.A03("is_action_on_unskippable", Boolean.valueOf(c75113Zb.A0b > 0));
                    d2 = c75113Zb.A0b;
                } else if (c141596ac != null && interfaceC11380iw.getModuleName().equals("reel_feed_timeline")) {
                    c0Zx = new C0Zx();
                    c0Zx.A03("is_delayed_skip_ad", Boolean.valueOf(c141596ac.A0r));
                    c0Zx.A03("is_action_on_unskippable", Boolean.valueOf(c141596ac.A0K > 0));
                    d2 = c141596ac.A0K;
                }
                c0Zx.A04("remaining_time", Double.valueOf(d2));
                A0f.AAQ(c0Zx, AbstractC111324zv.A00(203));
            }
            AbstractC31176DnK.A1I(A0f);
        }
    }
}
