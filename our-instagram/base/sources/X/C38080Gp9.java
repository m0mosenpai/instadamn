package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.reels.viewer.common.ReelViewGroup;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.Gp9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38080Gp9 extends AbstractC143566dv implements InterfaceC143606dz, C6e1, InterfaceC143626e2, InterfaceC143636e3, InterfaceC143646e4 {
    public View A00;
    public C80673iw A01;
    public IgImageView A02;
    public InterfaceC59152nG A03;
    public C57012jc A04;
    public IgProgressImageView A05;
    public C41181vS A06;
    public C41551w4 A07;
    public C141596ac A08;
    public MediaFrameLayout A09;
    public MediaFrameLayout A0A;
    public final View A0B;
    public final ViewStub A0C;
    public final ViewStub A0D;
    public final UserSession A0E;
    public final IgView A0F;
    public final ReelViewGroup A0G;
    public final C6SK A0H;
    public final C6S8 A0I;
    public final C6SI A0J;
    public final C6SL A0K;
    public final C6SN A0L;
    public final C6SR A0M;
    public final C6SD A0N;
    public final C6RF A0O;
    public final C6S9 A0P;
    public final C6S7 A0Q;
    public final C6SP A0R;
    public final C6RG A0S;
    public final C6SB A0T;
    public final C6SF A0U;
    public final C6SE A0V;
    public final C6SQ A0W;
    public final C6SG A0X;
    public final C6SJ A0Y;
    public final RoundedCornerFrameLayout A0Z;
    public final SegmentedProgressBar A0a;
    public final IgView A0b;
    public final InterfaceC56392iX A0c;
    public final C143716eE A0d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.6SF] */
    public C38080Gp9(View view, UserSession userSession) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A0E = userSession;
        this.A0G = (ReelViewGroup) AbstractC166997dE.A0R(view, R.id.reel_view_group);
        this.A0b = (IgView) AbstractC166997dE.A0R(view, R.id.reel_viewer_top_shadow);
        this.A0a = (SegmentedProgressBar) AbstractC166997dE.A0R(view, R.id.reel_viewer_progress_bar);
        View requireViewById = view.requireViewById(R.id.back_shadow_affordance);
        IgView igView = (IgView) requireViewById;
        igView.setBackgroundResource(AbstractC13620mo.A02(view.getContext()) ? R.drawable.reel_viewer_shadow_right : R.drawable.reel_viewer_shadow_left);
        C14360o3.A07(requireViewById);
        this.A0F = igView;
        this.A0B = AbstractC166997dE.A0S(view, R.id.header_menu_button);
        this.A0Q = new C6S7(AbstractC31176DnK.A0C(view, R.id.netego_toolbar), userSession);
        this.A0C = AbstractC167007dF.A0M(view, R.id.reel_viewer_media_layout_stub);
        this.A0D = AbstractC167007dF.A0M(view, R.id.netego_background_stub);
        this.A0I = new C6S8(AbstractC167007dF.A0M(view, R.id.simple_action_stub));
        this.A0P = new C6S9(AbstractC167007dF.A0M(view, R.id.quality_survey_stub));
        this.A0T = new C6SB(AbstractC167007dF.A0M(view, R.id.story_creation_upsell_stub));
        this.A0N = new C6SD(AbstractC167007dF.A0M(view, R.id.new_ad4ad_overlay_stub));
        this.A0V = new C6SE(AbstractC31173DnH.A0G(view, R.id.netego_su_overlay_stub));
        final ViewStub A0M = AbstractC167007dF.A0M(view, R.id.reel_netego_suggested_clips_stub);
        this.A0U = new Object(A0M) { // from class: X.6SF
            public final ViewStub A00;

            {
                C14360o3.A0B(A0M, 1);
                this.A00 = A0M;
            }
        };
        this.A0X = new C6SG(AbstractC167007dF.A0M(view, R.id.reel_netego_trending_prompt_stub));
        this.A0O = new C6RF(AbstractC167007dF.A0M(view, R.id.netego_pfy_overlay_stub));
        View findViewById = view.findViewById(R.id.netego_sfy_overlay_stub);
        if (findViewById != null) {
            final ViewStub viewStub = (ViewStub) findViewById;
            this.A0S = new C6RG(viewStub) { // from class: X.6SH
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(viewStub);
                    C14360o3.A0B(viewStub, 1);
                    Integer[] numArr = {Integer.valueOf(R.id.reel_netego_sfy_item_top_left), Integer.valueOf(R.id.reel_netego_sfy_item_top_right), Integer.valueOf(R.id.reel_netego_sfy_item_bottom_left), Integer.valueOf(R.id.reel_netego_sfy_item_bottom_right)};
                }
            };
            View requireViewById2 = view.requireViewById(R.id.netego_continue_shopping_overlay_stub);
            C14360o3.A0C(requireViewById2, "null cannot be cast to non-null type android.view.ViewStub");
            this.A0J = new C6SI((ViewStub) requireViewById2);
            View requireViewById3 = view.requireViewById(R.id.netego_visit_these_shops_again_overlay_stub);
            C14360o3.A0C(requireViewById3, "null cannot be cast to non-null type android.view.ViewStub");
            this.A0Y = new C6SJ((ViewStub) requireViewById3);
            this.A0c = AbstractC56372iV.A00(view.requireViewById(R.id.reel_viewer_tall_android_top_bar_stub));
            this.A0Z = (RoundedCornerFrameLayout) AbstractC166997dE.A0R(view, R.id.rounded_frame_layout);
            this.A0H = new C6SK(AbstractC167007dF.A0M(view, R.id.reel_netego_bloks_stub));
            this.A0d = new C143716eE(AbstractC167007dF.A0M(view, R.id.reel_swipe_up_instructions_stub));
            this.A0K = new C6SL(AbstractC166997dE.A0S(view, R.id.ig_consent_growth_story_stub));
            this.A0L = new C6SN(AbstractC167007dF.A0M(view, R.id.reel_netego_ig_insights_tip_stub));
            this.A0R = new C6SP(AbstractC167007dF.A0M(view, R.id.reel_netego_share_comment_to_story_stub));
            this.A0W = new C6SQ(AbstractC167007dF.A0M(view, R.id.reel_netego_threads_in_stories_story_stub));
            this.A0M = new C6SR(AbstractC167007dF.A0M(view, R.id.reel_netego_meta_gallery_stories_netego_stub));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC143646e4
    public final void Dds(C141596ac c141596ac, int i) {
        C14360o3.A0B(c141596ac, 0);
        if (i != 1) {
            if (i == 7) {
                AbstractC40781I5j.A00(this.A0I);
                this.A0Q.A05.setVisibility(8);
                return;
            }
            return;
        }
        this.A0a.setProgress(c141596ac.A0B);
    }

    public final void A00() {
        InterfaceC11380iw interfaceC11380iw;
        C41181vS c41181vS;
        C104294ms c104294ms;
        boolean z;
        C6SE c6se = this.A0V;
        UserSession userSession = c6se.A06;
        if (userSession != null && (interfaceC11380iw = c6se.A05) != null && (c41181vS = c6se.A08) != null && (c104294ms = c41181vS.A09) != null && AbstractC31178DnM.A1X(C06090Tz.A05, userSession, 36325149762401059L)) {
            C141596ac c141596ac = c6se.A09;
            if (c141596ac != null) {
                z = c141596ac.A11;
            } else {
                z = false;
            }
            AbstractC139216Sc.A01(interfaceC11380iw, userSession, c104294ms, z);
        }
    }

    public final void A01() {
        String str;
        IgProgressImageView igProgressImageView = this.A05;
        if (igProgressImageView != null) {
            igProgressImageView.setVisibility(0);
            return;
        }
        C41181vS c41181vS = this.A06;
        if (c41181vS != null) {
            str = AnonymousClass001.A0R("ImegeView was null for Netego of type ", c41181vS.A0e.name());
        } else {
            str = "Both ImegeView and reelItem are null";
        }
        C0w9.A03("STORIES_NETEGO_ITEM_SHOW_COVER", str);
    }

    @Override // X.C6e1
    public final XEX AjV() {
        return this.A0Q.AjV();
    }

    @Override // X.InterfaceC143586dx
    public final IgProgressImageView BGy() {
        return this.A05;
    }

    @Override // X.AbstractC143566dv, X.InterfaceC143576dw
    public final RoundedCornerFrameLayout BRC() {
        return this.A0Z;
    }

    @Override // X.InterfaceC143596dy
    public final C41181vS Blb() {
        return this.A06;
    }

    @Override // X.AbstractC143566dv, X.InterfaceC143576dw
    public final ViewGroup Bld() {
        return this.A0G;
    }

    @Override // X.InterfaceC143586dx
    public final FrameLayout Blf() {
        return this.A09;
    }

    @Override // X.AbstractC143566dv, X.InterfaceC143576dw
    public final InterfaceC56392iX C5B() {
        return this.A0c;
    }

    @Override // X.InterfaceC143586dx
    public final ScalingTextureView C6w() {
        C57012jc c57012jc = this.A04;
        if (c57012jc != null) {
            return (ScalingTextureView) c57012jc.A01();
        }
        return null;
    }

    @Override // X.AbstractC143566dv, X.InterfaceC143576dw
    public final View C9H() {
        return this.A0Q.A05;
    }

    @Override // X.InterfaceC143606dz
    public final void DQl(boolean z) {
        this.A0d.A01(this.A0E, this.A06, this.A07, z);
    }

    @Override // X.InterfaceC143606dz
    public final void DQm() {
        this.A0d.A00();
    }

    @Override // X.InterfaceC143636e3
    public final void Ddv() {
        C6S7 c6s7 = this.A0Q;
        C141596ac c141596ac = c6s7.A01;
        if (c141596ac != null) {
            c141596ac.A0j = false;
        }
        XEX AjV = c6s7.AjV();
        if (AjV != null) {
            AbstractC65725Tsz.A00(AjV);
        }
        c6s7.A06.A00();
        C143746eH c143746eH = c6s7.A07;
        if (c143746eH.A04 != null) {
            TextView textView = c143746eH.A07;
            if (textView != null) {
                CharSequence text = textView.getText();
                if (text != null && text.length() != 0) {
                    View view = c143746eH.A02;
                    if (view != null) {
                        view.setAlpha(1.0f);
                        View view2 = c143746eH.A03;
                        if (view2 != null) {
                            view2.setAlpha(0.0f);
                            c143746eH.A02();
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        c143746eH.A0A = false;
        C6SE c6se = this.A0V;
        C6SZ c6sz = c6se.A07;
        if (c6sz != null) {
            ValueAnimator valueAnimator = c6sz.A03;
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            }
        }
        c6se.A00();
        A00();
    }

    @Override // X.InterfaceC143626e2
    public final void ERN(float f) {
        this.A0b.setAlpha(f);
        this.A0a.setAlpha(f);
        this.A0Q.A04.setAlpha(f);
        this.A0B.setAlpha(f);
    }

    @Override // X.AbstractC143566dv, X.InterfaceC143586dx
    public final void onSurfaceTextureDestroyed() {
        A01();
    }

    @Override // X.AbstractC143566dv, X.InterfaceC143586dx
    public final void D0K(boolean z) {
        A01();
    }
}
