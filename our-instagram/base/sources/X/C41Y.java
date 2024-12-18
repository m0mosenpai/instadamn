package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.41Y, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41Y {
    public static final C105184oY A00(Context context, View view, UserSession userSession, ReboundViewPager reboundViewPager, C41R c41r) {
        C86083sf c86083sf;
        C14360o3.A0B(view, 0);
        C14360o3.A0B(userSession, 1);
        View requireViewById = view.requireViewById(R.id.zoomable_view_container);
        C14360o3.A07(requireViewById);
        SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.carousel_video_media_group);
        C14360o3.A07(requireViewById2);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.carousel_video_image);
        C14360o3.A07(requireViewById3);
        IgProgressImageView igProgressImageView = (IgProgressImageView) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.odml_test_imageview_overlay);
        C14360o3.A07(requireViewById4);
        View requireViewById5 = view.requireViewById(R.id.carousel_video_media_actions);
        C14360o3.A07(requireViewById5);
        MediaActionsView mediaActionsView = (MediaActionsView) requireViewById5;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.media_subtitle_view_stub);
        C06090Tz c06090Tz = C06090Tz.A05;
        C86013sY c86013sY = new C86013sY(viewStub, C18U.A06(c06090Tz, userSession, 36324630071488810L));
        C3YC c3yc = new C3YC(view);
        C86073se A00 = AbstractC86053sc.A00((ViewStub) view.findViewById(R.id.media_cover_view_stub));
        C3Y8 c3y8 = new C3Y8((ViewStub) view.findViewById(R.id.zero_rating_video_play_button_stub));
        C3YD c3yd = new C3YD(view, userSession, R.id.row_feed_media_tag_indicator_stub);
        C3YD c3yd2 = new C3YD(view, userSession, R.id.row_feed_media_secondary_tag_indicator_stub);
        C3YD c3yd3 = new C3YD(view, userSession, R.id.feed_media_top_start_tag_indicator_stub);
        C905441p c905441p = new C905441p(view);
        C3YI c3yi = new C3YI(view);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.feed_fullscreen_hint_stub);
        boolean A06 = C18U.A06(c06090Tz, userSession, 36324630071488810L);
        if (viewStub2 == null) {
            c86083sf = null;
        } else {
            c86083sf = new C86083sf(context, viewStub2, A06);
        }
        View requireViewById6 = view.requireViewById(R.id.open_carousel_prompt_redesign_view_stub);
        C14360o3.A07(requireViewById6);
        C905641r c905641r = new C905641r((ViewStub) requireViewById6);
        C905541q c905541q = new C905541q(view);
        C3YD c3yd4 = new C3YD(view, userSession, R.id.row_feed_media_open_carousel_add_button);
        C3YD c3yd5 = new C3YD(view, userSession, R.id.row_feed_media_per_media_like_button);
        View requireViewById7 = view.requireViewById(R.id.larger_cta_top_buffer);
        C14360o3.A07(requireViewById7);
        return new C105184oY(requireViewById4, c86013sY, reboundViewPager, AbstractC56372iV.A01(view.requireViewById(R.id.carousel_peak_scrim_overlay), false, false), simpleZoomableViewContainer, c905641r, c905541q, c41r, c905441p, c3yc, new C86043sb(requireViewById7), c86083sf, c3y8, A00, igProgressImageView, c3yd, c3yd2, c3yd3, c3yd4, c3yd5, c3yi, mediaActionsView, mediaFrameLayout);
    }

    public static final void A01(final Context context, final UserSession userSession, final C105224oc c105224oc, final C41V c41v, final C105184oY c105184oY, final InterfaceC60442pS interfaceC60442pS, final C75113Zb c75113Zb) {
        IgProgressImageView igProgressImageView = c105184oY.A0E;
        boolean A0G = igProgressImageView.getIgImageView().A0G();
        igProgressImageView.A06(R.id.listener_id_for_media_tag_indicator);
        C3YJ c3yj = c105184oY.A0H;
        C3YD c3yd = c3yj.A01;
        if (c3yd != null) {
            InterfaceC86283sz interfaceC86283sz = new InterfaceC86283sz() { // from class: X.5KI
                @Override // X.InterfaceC86283sz
                public final void Ds1() {
                }

                @Override // X.InterfaceC86283sz
                public final void Ds2() {
                }

                @Override // X.InterfaceC86283sz
                public final void Ds3() {
                    C75113Zb.this.A0c(false);
                }

                @Override // X.InterfaceC86283sz
                public final void Ds4() {
                    C75113Zb.this.A0c(true);
                }
            };
            InterfaceC86303t2 BRj = c41v.BRj();
            C9BU c9bu = c105224oc.A03;
            AbstractC86373tA.A00((View.OnClickListener) ((InterfaceC16660sJ) c9bu.A0B).invoke(c3yd), BRj, c105224oc.A0A, interfaceC86283sz, c3yd);
            AbstractC906341y.A00(c105224oc.A04, c75113Zb, c41v.BRj(), c3yj.A02, !C18U.A06(C06090Tz.A05, userSession, 36319854068244181L));
            C3YD c3yd2 = c105184oY.A0F;
            AnonymousClass423.A00((C9C3) ((InterfaceC16660sJ) c9bu.A0C).invoke(context), userSession, c41v.BZ3(), c75113Zb, c41v.BRj(), c3yd2);
            AnonymousClass425.A00(context, (C206199Bc) ((InterfaceC16660sJ) c9bu.A0D).invoke(context), c41v.BRj(), c105184oY.A0G);
            if (!A0G) {
                igProgressImageView.A0A(new InterfaceC80653iu() { // from class: X.5KJ
                    @Override // X.InterfaceC80653iu
                    public final /* synthetic */ void DFp() {
                    }

                    @Override // X.InterfaceC80653iu
                    public final void DPX(C73083Pj c73083Pj) {
                        C105184oY c105184oY2 = c105184oY;
                        c105184oY2.A0E.A06(R.id.listener_id_for_media_tag_indicator);
                        C105224oc c105224oc2 = c105224oc;
                        C75113Zb c75113Zb2 = c75113Zb;
                        InterfaceC60442pS interfaceC60442pS2 = interfaceC60442pS;
                        C41V c41v2 = c41v;
                        C41Y.A01(context, userSession, c105224oc2, c41v2, c105184oY2, interfaceC60442pS2, c75113Zb2);
                    }
                }, R.id.listener_id_for_media_tag_indicator);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.content.Context r32, android.view.View r33, X.C3W4 r34, final com.instagram.common.session.UserSession r35, X.C4hj r36, final X.C105224oc r37, X.C41V r38, X.InterfaceC60442pS r39, final X.C75113Zb r40, boolean r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 1071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41Y.A02(android.content.Context, android.view.View, X.3W4, com.instagram.common.session.UserSession, X.4hj, X.4oc, X.41V, X.2pS, X.3Zb, boolean, boolean):void");
    }
}
