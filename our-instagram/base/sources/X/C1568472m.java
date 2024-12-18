package X;

import android.content.res.Resources;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.emitter.PulseEmitter;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.72m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1568472m implements InterfaceC1568572n {
    public View A00;
    public ConstraintLayout A01;
    public ShimmerFrameLayout A02;
    public IgSimpleImageView A04;
    public IgTextView A05;
    public CircularImageView A06;
    public IgImageView A07;
    public IgImageView A08;
    public C57012jc A09;
    public C57012jc A0A;
    public C57012jc A0B;
    public NoteBubbleView A0C;
    public EnumC1569072t A0D;
    public PulseEmitter A0E;
    public PulsingMultiImageView A0F;
    public Runnable A0G;
    public boolean A0I;
    public final ViewGroup A0J;
    public final ViewStub A0K;
    public final ViewStub A0L;
    public final ViewStub A0M;
    public final IgImageView A0N;
    public final C57012jc A0O;
    public final C57012jc A0P;
    public final C57012jc A0Q;
    public final C57012jc A0R;
    public final C57012jc A0S;
    public final C57012jc A0T;
    public final C57012jc A0U;
    public final GradientSpinner A0V;
    public C74H A03 = null;
    public boolean A0H = true;

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    public static void A00(C1568472m c1568472m) {
        PulseEmitter pulseEmitter = c1568472m.A0E;
        if (pulseEmitter != null && c1568472m.A0F != null) {
            pulseEmitter.A02();
            c1568472m.A0E.setVisibility(8);
            c1568472m.A0F.A0I();
            c1568472m.A0F.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r1.A01() != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r6.A05(r5) != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A01(com.instagram.common.session.UserSession r5, X.C154536x3 r6, com.instagram.user.model.User r7, boolean r8) {
        /*
            r4 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r6 == 0) goto Le
            boolean r1 = r6.A05(r5)
            r0 = 1
            if (r1 == 0) goto Lf
        Le:
            r0 = 0
        Lf:
            boolean r0 = X.AbstractC1568972s.A03(r5, r7, r8, r0)
            if (r0 == 0) goto L1e
            X.2jc r0 = r4.A0O
            android.view.View r0 = r0.A01()
            r2.add(r0)
        L1e:
            if (r6 == 0) goto L49
            com.instagram.model.reels.Reel r0 = r6.A00()
            X.1qk r0 = r0.A0C(r5)
            if (r0 == 0) goto L49
            X.2jc r1 = r4.A0P
        L2c:
            android.view.View r0 = r1.A01()
            r2.add(r0)
        L33:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            X.72t r0 = r4.A0D
            r0.getClass()
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.C05F.A0j
            if (r1 == r0) goto L48
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r4.A0V
            r3.add(r0)
        L48:
            return r3
        L49:
            X.72t r0 = r4.A0D
            r0.getClass()
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.C05F.A0Y
            if (r1 == r0) goto L33
            X.72t r0 = r4.A0D
            r0.getClass()
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L68
            X.2jc r1 = r4.A0S
            android.view.View r0 = r1.A01()
            if (r0 == 0) goto L33
            goto L2c
        L68:
            X.72t r0 = r4.A0D
            r0.getClass()
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L33
            X.2jc r0 = r4.A09
            if (r0 == 0) goto L7e
            android.view.View r0 = r0.A01()
            r2.add(r0)
        L7e:
            X.2jc r1 = r4.A0Q
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1568472m.A01(com.instagram.common.session.UserSession, X.6x3, com.instagram.user.model.User, boolean):java.util.ArrayList");
    }

    public final void A02() {
        this.A0P.A03(8);
        C57012jc c57012jc = this.A09;
        if (c57012jc != null) {
            c57012jc.A03(8);
        }
        this.A0Q.A03(8);
        this.A0S.A03(8);
        this.A0U.A03(8);
        this.A0T.A03(8);
    }

    @Override // X.C3Ow
    public final View Aek() {
        C57012jc c57012jc;
        PulsingMultiImageView pulsingMultiImageView;
        if (this.A0I) {
            c57012jc = this.A0A;
        } else {
            EnumC1569072t enumC1569072t = this.A0D;
            enumC1569072t.getClass();
            if (enumC1569072t.A02 == C05F.A00 && (pulsingMultiImageView = this.A0F) != null) {
                return pulsingMultiImageView;
            }
            c57012jc = this.A0R;
            if (c57012jc.A00 == null || c57012jc.A01().getVisibility() == 8) {
                return this.A0N;
            }
        }
        return c57012jc.A01();
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A0V;
    }

    public C1568472m(ViewGroup viewGroup, UserSession userSession) {
        int i;
        this.A0J = viewGroup;
        IgImageView igImageView = (IgImageView) viewGroup.requireViewById(R.id.row_profile_header_imageview);
        this.A0N = igImageView;
        this.A0A = new C57012jc((ViewStub) viewGroup.findViewById(R.id.profile_picture_updating_shimmer_stub));
        this.A0L = (ViewStub) viewGroup.requireViewById(R.id.pulse_emitter_stub);
        this.A0M = (ViewStub) viewGroup.requireViewById(R.id.pulsing_image_view_stub);
        GradientSpinner gradientSpinner = (GradientSpinner) viewGroup.requireViewById(R.id.reel_ring);
        this.A0V = gradientSpinner;
        this.A0R = new C57012jc((ViewStub) viewGroup.findViewById(R.id.avatar_on_profile_view_stub));
        this.A0K = (ViewStub) viewGroup.requireViewById(R.id.birthday_confetti_animation_stub);
        this.A0P = new C57012jc((ViewStub) viewGroup.findViewById(R.id.reel_glyph_stub));
        this.A0Q = new C57012jc((ViewStub) viewGroup.findViewById(R.id.live_badge_view_stub));
        C57012jc c57012jc = new C57012jc((ViewStub) viewGroup.findViewById(R.id.new_badge_view_stub));
        this.A0S = c57012jc;
        c57012jc.A02 = new InterfaceC69513Al() { // from class: X.72o
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                AbstractC14680og.A02(view, C05F.A01, true);
            }
        };
        C57012jc c57012jc2 = new C57012jc((ViewStub) viewGroup.findViewById(R.id.profile_pic_creation_nudge_overlay));
        this.A0U = c57012jc2;
        this.A0T = new C57012jc((ViewStub) viewGroup.findViewById(R.id.profile_pic_creation_nudge_badge));
        this.A0O = new C57012jc((ViewStub) viewGroup.requireViewById(R.id.empty_badge_stub));
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.live_badge_margin_spacer_stub);
        if (viewStub != null) {
            this.A09 = new C57012jc(viewStub);
        }
        Resources resources = viewGroup.getResources();
        ViewGroup.LayoutParams layoutParams = gradientSpinner.getLayoutParams();
        C14360o3.A0B(resources, 2);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36327700973501226L);
        int intValue = AbstractC1568772p.A02(viewGroup).intValue();
        if (A06) {
            if (intValue != 0) {
                if (intValue != 1) {
                    i = R.dimen.album_thumbnail_image_size;
                    if (intValue != 2) {
                        i = R.dimen.ad_not_delivering_thumbnail_height;
                    }
                } else {
                    i = R.dimen.achievements_achievement_image_size;
                }
            } else {
                i = R.dimen.avatar_reel_ring_size_xxxxlarge;
            }
        } else if (intValue != 0) {
            i = R.dimen.prism_avatar_story_ring_size_medium_device;
            if (intValue != 1) {
                i = R.dimen.album_preview_add_item_circle_size;
            }
        } else {
            i = R.dimen.audition_flow_footer_text_button_min_width;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = dimensionPixelSize;
        gradientSpinner.setActiveStrokeWidth(AbstractC1568772p.A00(resources, viewGroup));
        gradientSpinner.setInactiveStrokeWidth(AbstractC1568772p.A00(resources, viewGroup));
        gradientSpinner.requestLayout();
        ViewGroup.LayoutParams layoutParams2 = igImageView.getLayoutParams();
        int A01 = AbstractC1568772p.A01(resources, viewGroup, userSession);
        layoutParams2.height = A01;
        layoutParams2.width = A01;
        igImageView.requestLayout();
        View A012 = c57012jc2.A01();
        if (A012 != null) {
            ViewGroup.LayoutParams layoutParams3 = A012.getLayoutParams();
            layoutParams3.height = A01;
            layoutParams3.width = A01;
            c57012jc2.A01().requestLayout();
        }
        if (AbstractC82073lT.A01(userSession)) {
            this.A01 = (ConstraintLayout) viewGroup.findViewById(R.id.pog_note_bubble_container);
            this.A0C = (NoteBubbleView) viewGroup.findViewById(R.id.pog_note_bubble_view);
            this.A07 = (IgImageView) viewGroup.findViewById(R.id.filled_like_view);
            this.A04 = (IgSimpleImageView) viewGroup.findViewById(R.id.note_custom_activation_view);
        }
        if (C18U.A06(c06090Tz, userSession, 36322151875487771L)) {
            this.A0B = new C57012jc((ViewStub) viewGroup.findViewById(R.id.video_on_profile_picture_stub));
        }
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(Aek());
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(Aek());
    }

    @Override // X.C3Ow
    public final void CMM() {
        Aek().setVisibility(4);
        ViewStub viewStub = this.A0K;
        if (viewStub != null && this.A06 != null) {
            viewStub.setVisibility(8);
            this.A06.setVisibility(8);
        }
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        View Aek = Aek();
        IgImageView igImageView = this.A0N;
        if (Aek == igImageView) {
            A00(this);
            ShimmerFrameLayout shimmerFrameLayout = this.A02;
            if (shimmerFrameLayout != null) {
                C57012jc c57012jc = this.A0A;
                shimmerFrameLayout.A03();
                c57012jc.A03(8);
                this.A02.setVisibility(8);
            }
            igImageView.setVisibility(0);
            EnumC1569072t enumC1569072t = this.A0D;
            enumC1569072t.getClass();
            igImageView.setScaleX(enumC1569072t.A00());
            EnumC1569072t enumC1569072t2 = this.A0D;
            enumC1569072t2.getClass();
            igImageView.setScaleY(enumC1569072t2.A00());
            return;
        }
        C57012jc c57012jc2 = this.A0R;
        if (Aek == c57012jc2.A01()) {
            if (igImageView != null) {
                igImageView.setVisibility(4);
            }
            A00(this);
            ShimmerFrameLayout shimmerFrameLayout2 = this.A02;
            if (shimmerFrameLayout2 != null) {
                C57012jc c57012jc3 = this.A0A;
                shimmerFrameLayout2.A03();
                c57012jc3.A03(8);
                this.A02.setVisibility(8);
            }
            this.A0U.A03(8);
            this.A0T.A03(8);
            EnumC152426tV enumC152426tV = ((ProfileCoinFlipView) c57012jc2.A01()).A01;
            EnumC152426tV enumC152426tV2 = EnumC152426tV.A02;
            View A01 = c57012jc2.A01();
            EnumC1569072t enumC1569072t3 = this.A0D;
            enumC1569072t3.getClass();
            float A00 = enumC1569072t3.A00();
            if (enumC152426tV == enumC152426tV2) {
                A00 *= -1.0f;
            }
            A01.setScaleX(A00);
            View A012 = c57012jc2.A01();
            EnumC1569072t enumC1569072t4 = this.A0D;
            enumC1569072t4.getClass();
            A012.setScaleY(enumC1569072t4.A00());
            ProfileCoinFlipView profileCoinFlipView = (ProfileCoinFlipView) c57012jc2.A01();
            EnumC1569072t enumC1569072t5 = this.A0D;
            enumC1569072t5.getClass();
            profileCoinFlipView.A00 = enumC1569072t5.A00();
            c57012jc2.A01().setVisibility(0);
            return;
        }
        if (this.A0I) {
            C57012jc c57012jc4 = this.A0A;
            if (c57012jc4.A01() == Aek) {
                this.A02 = (ShimmerFrameLayout) Aek;
                A00(this);
                if (this.A02 == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = igImageView.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = this.A02.getLayoutParams();
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.A02.A02();
                c57012jc4.A03(0);
                this.A02.setVisibility(0);
                igImageView.setVisibility(4);
                c57012jc2.A01().setVisibility(4);
                return;
            }
        }
        PulsingMultiImageView pulsingMultiImageView = this.A0F;
        boolean z = false;
        if (Aek == pulsingMultiImageView) {
            z = true;
        }
        C18C.A0F(z);
        pulsingMultiImageView.getClass();
        pulsingMultiImageView.setVisibility(0);
        igImageView.setVisibility(4);
    }
}
