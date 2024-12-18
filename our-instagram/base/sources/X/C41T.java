package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.tagging.widget.MediaTagHintsLayout;
import com.instagram.tagging.widget.TagsLayout;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.Map;

/* renamed from: X.41T, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41T {
    /* JADX WARN: Type inference failed for: r2v7, types: [X.4gC, java.lang.Object] */
    public static final C905741s A00(View view, UserSession userSession, ReboundViewPager reboundViewPager, C41R c41r) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(userSession, 2);
        View requireViewById = view.requireViewById(R.id.zoomable_view_container);
        C14360o3.A07(requireViewById);
        View requireViewById2 = view.requireViewById(R.id.carousel_image_media_group);
        C14360o3.A07(requireViewById2);
        View requireViewById3 = view.requireViewById(R.id.carousel_image);
        C14360o3.A07(requireViewById3);
        IgProgressImageView igProgressImageView = (IgProgressImageView) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.odml_test_imageview_overlay);
        C14360o3.A07(requireViewById4);
        View requireViewById5 = view.requireViewById(R.id.row_feed_photo_tags);
        C14360o3.A07(requireViewById5);
        C3YH c3yh = new C3YH((TagsLayout) requireViewById5);
        View requireViewById6 = view.requireViewById(R.id.row_feed_photo_media_tag_hints);
        C14360o3.A07(requireViewById6);
        C3YG c3yg = new C3YG(userSession, (MediaTagHintsLayout) requireViewById6);
        C3YD c3yd = new C3YD(view, userSession, R.id.row_feed_media_tag_indicator_stub);
        C3YD c3yd2 = new C3YD(view, userSession, R.id.row_feed_media_secondary_tag_indicator_stub);
        C3YD c3yd3 = new C3YD(view, userSession, R.id.feed_media_top_start_tag_indicator_stub);
        C3YC c3yc = new C3YC(view);
        C86073se A00 = AbstractC86053sc.A00((ViewStub) view.findViewById(R.id.media_cover_view_stub));
        C3YI c3yi = new C3YI(view);
        C905441p c905441p = new C905441p(view);
        C100934g9 c100934g9 = new C100934g9(view);
        C100944gA c100944gA = new C100944gA(view);
        C905541q c905541q = new C905541q(view);
        C100954gB c100954gB = new C100954gB(view);
        View requireViewById7 = view.requireViewById(R.id.open_carousel_prompt_redesign_view_stub);
        C14360o3.A07(requireViewById7);
        C905641r c905641r = new C905641r((ViewStub) requireViewById7);
        C3YD c3yd4 = new C3YD(view, userSession, R.id.row_feed_media_open_carousel_add_button);
        C3YD c3yd5 = new C3YD(view, userSession, R.id.row_feed_media_per_media_like_button);
        View requireViewById8 = view.requireViewById(R.id.larger_cta_top_buffer);
        C14360o3.A07(requireViewById8);
        C86043sb c86043sb = new C86043sb(requireViewById8);
        ?? obj = new Object();
        obj.A02 = AbstractC56372iV.A01(view.requireViewById(R.id.feed_carousel_showcase_card_stub), false, false);
        obj.A01 = AbstractC25651Mw.A00(userSession);
        C100974gD c100974gD = new C100974gD(view);
        return new C905741s(requireViewById4, reboundViewPager, AbstractC56372iV.A01(view.requireViewById(R.id.carousel_peak_scrim_overlay), false, false), (SimpleZoomableViewContainer) requireViewById, c100944gA, c100954gB, c100934g9, obj, c905641r, c905541q, c41r, c100974gD, c905441p, c3yc, c86043sb, A00, igProgressImageView, c3yg, c3yd, c3yd2, c3yd3, c3yd4, c3yd5, c3yh, c3yi, (MediaFrameLayout) requireViewById2);
    }

    public static final void A01(final Context context, final UserSession userSession, final C4hj c4hj, final InterfaceC101004gG interfaceC101004gG, final C101044gK c101044gK, final C905741s c905741s, final InterfaceC60442pS interfaceC60442pS, final C75113Zb c75113Zb) {
        C69114Vi4 c69114Vi4;
        IgProgressImageView igProgressImageView = c905741s.A0F;
        boolean A0G = igProgressImageView.getIgImageView().A0G();
        igProgressImageView.A06(R.id.listener_id_for_media_tag_indicator);
        boolean z = false;
        if (c101044gK.A0V && !c101044gK.A0W && c4hj != null) {
            C3YJ c3yj = c905741s.A0I;
            C3YD c3yd = c3yj.A01;
            if (c3yd != null) {
                c3yd.A0A();
                C3YI c3yi = c3yj.A05;
                if (c3yi != null) {
                    C57012jc c57012jc = c3yi.A00;
                    c57012jc.A01().setVisibility(0);
                    View A01 = c57012jc.A01();
                    C14360o3.A07(A01);
                    boolean z2 = c101044gK.A0c;
                    String str = c101044gK.A0J;
                    Map map = c101044gK.A0P;
                    Map map2 = c101044gK.A0Q;
                    Map map3 = c101044gK.A0O;
                    OWJ owj = OWJ.A00;
                    String str2 = c101044gK.A0L;
                    C38321qM c38321qM = c101044gK.A0A;
                    if (c38321qM != null && c38321qM.A5P()) {
                        z = true;
                    }
                    AbstractC55181Odm.A01(A01, userSession, c4hj, c101044gK.A0D, str, map, map2, map3, z2, owj.A01(userSession, str2, z));
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            C3YJ c3yj2 = c905741s.A0I;
            C3YI c3yi2 = c3yj2.A05;
            if (c3yi2 != null) {
                c3yi2.A00();
                if (AbstractC75103Za.A0G(userSession, c101044gK.A0A, c75113Zb)) {
                    VTH.A00(c905741s.A0A);
                } else {
                    C100974gD c100974gD = c905741s.A0A;
                    if (c100974gD.A01.CWW() && (c69114Vi4 = c100974gD.A00) != null) {
                        c69114Vi4.A01.setVisibility(8);
                        c69114Vi4.A00.setVisibility(8);
                    }
                    C3YD c3yd2 = c3yj2.A01;
                    if (c3yd2 != null) {
                        C9BU c9bu = c101044gK.A04;
                        InterfaceC86283sz interfaceC86283sz = (InterfaceC86283sz) ((InterfaceC16820sZ) c9bu.A02).invoke();
                        InterfaceC86303t2 BRj = interfaceC101004gG.BRj();
                        InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) c9bu.A0C;
                        C3YD c3yd3 = c3yj2.A01;
                        if (c3yd3 != null) {
                            AbstractC86373tA.A00((View.OnClickListener) interfaceC16620sF.invoke(c3yd3, c75113Zb), BRj, (C3t9) ((InterfaceC16620sF) c9bu.A0D).invoke(context, c75113Zb), interfaceC86283sz, c3yd2);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                AbstractC906341y.A00(c101044gK.A05, c75113Zb, interfaceC101004gG.BRj(), c3yj2.A02, !C18U.A06(C06090Tz.A05, userSession, 36319854068244181L));
                C3YD c3yd4 = c905741s.A0G;
                InterfaceC86303t2 BRj2 = interfaceC101004gG.BRj();
                AnonymousClass421 BZ3 = interfaceC101004gG.BZ3();
                C9BU c9bu2 = c101044gK.A04;
                AnonymousClass423.A00((C9C3) ((InterfaceC16660sJ) c9bu2.A0E).invoke(context), userSession, BZ3, c75113Zb, BRj2, c3yd4);
                AnonymousClass425.A00(context, (C206199Bc) ((InterfaceC16660sJ) c9bu2.A0F).invoke(context), interfaceC101004gG.BRj(), c905741s.A0H);
                if (((Boolean) ((InterfaceC16820sZ) c9bu2.A0G).invoke()).booleanValue()) {
                    C101734hi c101734hi = (C101734hi) ((InterfaceC16660sJ) c9bu2.A0B).invoke(c75113Zb);
                    C3YG c3yg = c3yj2.A00;
                    if (c3yg != null) {
                        AbstractC86383tB.A01(c101734hi, c3yg, A0G);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    C3YG c3yg2 = c3yj2.A00;
                    if (c3yg2 != null) {
                        AbstractC86383tB.A00(c75113Zb, c3yg2, false);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (!A0G && c101044gK.A0R) {
            igProgressImageView.A0A(new InterfaceC80653iu() { // from class: X.5kx
                @Override // X.InterfaceC80653iu
                public final /* synthetic */ void DFp() {
                }

                @Override // X.InterfaceC80653iu
                public final void DPX(C73083Pj c73083Pj) {
                    C905741s c905741s2 = c905741s;
                    c905741s2.A0F.A06(R.id.listener_id_for_media_tag_indicator);
                    C75113Zb c75113Zb2 = c75113Zb;
                    C101044gK c101044gK2 = c101044gK;
                    InterfaceC60442pS interfaceC60442pS2 = interfaceC60442pS;
                    UserSession userSession2 = userSession;
                    C41T.A01(context, userSession2, c4hj, interfaceC101004gG, c101044gK2, c905741s2, interfaceC60442pS2, c75113Zb2);
                }
            }, R.id.listener_id_for_media_tag_indicator);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:97|98|99|(1:103)|105|106|107|(2:111|(6:113|114|115|116|(1:120)|122))|125|114|115|116|(2:118|120)|122) */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0703, code lost:
    
        if (r12 <= 0.0f) goto L281;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025b  */
    /* JADX WARN: Type inference failed for: r0v296, types: [java.lang.Object, X.Tpt] */
    /* JADX WARN: Type inference failed for: r12v19, types: [X.TiA, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.content.Context r44, android.view.View r45, X.C5H8 r46, final com.instagram.common.session.UserSession r47, X.C4hj r48, X.InterfaceC101004gG r49, final X.C101044gK r50, X.InterfaceC60442pS r51, X.InterfaceC60442pS r52, final X.C75113Zb r53) {
        /*
            Method dump skipped, instructions count: 2636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41T.A02(android.content.Context, android.view.View, X.5H8, com.instagram.common.session.UserSession, X.4hj, X.4gG, X.4gK, X.2pS, X.2pS, X.3Zb):void");
    }
}
