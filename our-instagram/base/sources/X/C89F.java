package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.89F, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89F implements C89G, C89H {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public Drawable A08;
    public C210399Se A09;
    public EnumC1828489f A0A;
    public C25892Bct A0B;
    public C38321qM A0C;
    public String A0D;
    public boolean A0E;
    public final Context A0F;
    public final TextureView A0G;
    public final View A0H;
    public final TextView A0I;
    public final RecyclerView A0J;
    public final UserSession A0K;
    public final IgTextView A0L;
    public final IgTextView A0M;
    public final CircularImageView A0N;
    public final C1810981l A0O;
    public final C89K A0P;
    public final C89L A0Q;
    public final AnonymousClass874 A0R;
    public final C89P A0S;
    public final SimpleVideoLayout A0T;
    public final RoundedCornerFrameLayout A0U;
    public final C89N A0V;
    public final BroadcastReceiver A0W;
    public final TouchInterceptorFrameLayout A0X;
    public final C89I A0Y;

    public final void A09(Context context, FrameLayout.LayoutParams layoutParams, C210399Se c210399Se, float f, float f2, float f3, float f4, float f5, float f6, int i, boolean z) {
        int i2;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c210399Se, 1);
        Medium medium = c210399Se.A0B;
        float f7 = this.A04;
        Integer valueOf = Integer.valueOf(i);
        if (valueOf != null && !(this.A0O.A08.A00 instanceof C81V)) {
            i2 = valueOf.intValue();
        } else {
            i2 = 0;
        }
        C22915A8l c22915A8l = new C22915A8l(medium, f7, i2, z);
        AAN aan = new AAN(layoutParams, c210399Se.A03, f, f2, f3, f4, f5, f6, c210399Se.A06);
        this.A09 = c210399Se;
        AnonymousClass874 anonymousClass874 = this.A0R;
        if (!anonymousClass874.A04) {
            anonymousClass874.A04 = true;
            AnonymousClass874.A00(anonymousClass874, false);
        }
        Cy8(anonymousClass874.A01(), false);
        c210399Se.A00 = c22915A8l.A00;
        c210399Se.A05 = this;
        SimpleVideoLayout simpleVideoLayout = this.A0T;
        ViewGroup.LayoutParams layoutParams2 = simpleVideoLayout.getLayoutParams();
        if (layoutParams2 != null) {
            Rect bounds = c210399Se.getBounds();
            C14360o3.A07(bounds);
            int width = bounds.width();
            int height = bounds.height();
            layoutParams2.width = width;
            layoutParams2.height = height;
            simpleVideoLayout.setLayoutParams(layoutParams2);
            A04(this, aan);
            this.A0U.setVisibility(0);
            simpleVideoLayout.setVisibility(0);
            this.A0G.setVisibility(8);
            this.A0I.setVisibility(8);
            this.A0H.setVisibility(8);
            this.A0P.A03(context, c22915A8l, simpleVideoLayout);
        }
    }

    public final void A0A(Context context, C210399Se c210399Se, float f, float f2, int i) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c210399Se, 1);
        A09(context, null, c210399Se, c210399Se.getBounds().left, c210399Se.getBounds().top, f, 0.0f, f2, 0.0f, i, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r1.A05 == false) goto L19;
     */
    @Override // X.C89H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cy8(java.lang.Integer r4, boolean r5) {
        /*
            r3 = this;
            r1 = 0
            X.C14360o3.A0B(r4, r1)
            X.81l r0 = r3.A0O
            X.81v r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.C81V
            if (r0 != 0) goto L32
            r0 = 1
            int r2 = r4.intValue()
            if (r2 == r0) goto L36
            r0 = 3
            if (r2 == r0) goto L39
            r0 = 4
            if (r2 == r0) goto L39
            r0 = 2
            if (r2 == r0) goto L43
            if (r2 == r1) goto L43
            java.lang.String r1 = "Unknown audio state: "
            int r2 = 1 - r2
            if (r2 == 0) goto L33
            java.lang.String r0 = "NO_AUDIO"
        L28:
            java.lang.String r2 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.String r1 = "VideoStickerController"
            r0 = 0
            X.AbstractC12120kG.A0E(r1, r2, r0)
        L32:
            return
        L33:
            java.lang.String r0 = "AUDIO_ON"
            goto L28
        L36:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L39:
            X.874 r1 = r3.A0R
            boolean r0 = r1.A00
            if (r0 != 0) goto L43
            boolean r0 = r1.A05
            if (r0 == 0) goto L36
        L43:
            r0 = 0
        L44:
            r3.A04 = r0
            r3.A08()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89F.Cy8(java.lang.Integer, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [X.89L] */
    public C89F(AbstractC59962oe abstractC59962oe, UserSession userSession, TouchInterceptorFrameLayout touchInterceptorFrameLayout, final C1810981l c1810981l, AnonymousClass874 anonymousClass874) {
        this.A0K = userSession;
        this.A0X = touchInterceptorFrameLayout;
        this.A0O = c1810981l;
        this.A0R = anonymousClass874;
        final C89I c89i = new C89I(this);
        this.A0Y = c89i;
        this.A0W = new BroadcastReceiver() { // from class: X.89J
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                int A01 = C0f9.A01(-1580498794);
                C0fM.A01(this, context, intent);
                C14360o3.A0B(context, 0);
                C14360o3.A0B(intent, 1);
                C89F c89f = C89F.this;
                c89f.Cy8(c89f.A0R.A01(), false);
                C0f9.A0E(36263776, A01, intent);
            }
        };
        this.A0F = abstractC59962oe.requireContext();
        this.A0P = new C89K(abstractC59962oe, userSession);
        View findViewById = touchInterceptorFrameLayout.findViewById(R.id.video_sticker_media_layout);
        C14360o3.A07(findViewById);
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) findViewById;
        this.A0U = roundedCornerFrameLayout;
        View findViewById2 = roundedCornerFrameLayout.findViewById(R.id.video_container);
        C14360o3.A07(findViewById2);
        this.A0T = (SimpleVideoLayout) findViewById2;
        View findViewById3 = roundedCornerFrameLayout.findViewById(R.id.vvp_video_container);
        C14360o3.A07(findViewById3);
        this.A0G = (TextureView) findViewById3;
        View findViewById4 = roundedCornerFrameLayout.findViewById(R.id.template_preview_sticker_clip_index_label);
        C14360o3.A07(findViewById4);
        this.A0I = (TextView) findViewById4;
        View findViewById5 = roundedCornerFrameLayout.findViewById(R.id.template_landing_page_attribution_container);
        C14360o3.A07(findViewById5);
        this.A0H = findViewById5;
        View findViewById6 = roundedCornerFrameLayout.findViewById(R.id.template_creator_username);
        C14360o3.A07(findViewById6);
        this.A0M = (IgTextView) findViewById6;
        View findViewById7 = roundedCornerFrameLayout.findViewById(R.id.template_creator_profile_image);
        C14360o3.A07(findViewById7);
        this.A0N = (CircularImageView) findViewById7;
        View findViewById8 = roundedCornerFrameLayout.findViewById(R.id.original_template_creator_attribution);
        C14360o3.A07(findViewById8);
        this.A0L = (IgTextView) findViewById8;
        View findViewById9 = roundedCornerFrameLayout.findViewById(R.id.template_landing_page_metadata_pills);
        C14360o3.A07(findViewById9);
        this.A0J = (RecyclerView) findViewById9;
        this.A0D = "";
        this.A04 = c1810981l.A08.A00 instanceof C81V ? 0.0f : 1.0f;
        this.A0Q = new C87B(c1810981l, c89i) { // from class: X.89L
            public final C1810981l A00;
            public final C89I A01;

            @Override // X.C87B
            public final boolean AG5(InterfaceC185968Mq interfaceC185968Mq) {
                return true;
            }

            @Override // X.C87B
            public final void Dl9(int i) {
            }

            @Override // X.C87B
            public final void Dp5() {
            }

            @Override // X.C87B
            public final /* synthetic */ void Dzd() {
            }

            @Override // X.C87B
            public final /* synthetic */ void Dzf() {
            }

            @Override // X.C87B
            public final void DOs() {
                if (this.A00.A08.A00 instanceof C81V) {
                    this.A01.A00.A0P.A04("user_paused_video");
                }
            }

            @Override // X.C87B
            public final void DOt() {
                if (this.A00.A08.A00 instanceof C81V) {
                    C89F c89f = this.A01.A00;
                    C210399Se c210399Se = c89f.A09;
                    if (c210399Se != null && c210399Se.A0C == EnumC222999se.A06) {
                        return;
                    }
                    c89f.A0P.A05("start");
                }
            }

            @Override // X.C87B
            public final void DzD() {
                if (this.A00.A08.A00 instanceof C81V) {
                    this.A01.A00.A0P.A01();
                }
            }

            @Override // X.C87B
            public final void Dzq(int i) {
                C89K c89k;
                if (this.A00.A08.A00 instanceof C81V) {
                    C89F c89f = this.A01.A00;
                    C210399Se c210399Se = c89f.A09;
                    if (c210399Se != null && c210399Se.A0C == EnumC222999se.A06) {
                        if (c89f.A0U.getVisibility() == 0) {
                            c89k = c89f.A0P;
                            i -= c89f.A07;
                            if (i < 0) {
                                i = 0;
                            }
                        } else {
                            return;
                        }
                    } else {
                        c89k = c89f.A0P;
                    }
                    c89k.A02(i);
                }
            }

            @Override // X.C87B
            public final void E03() {
                if (this.A00.A08.A00 instanceof C81V) {
                    C89F c89f = this.A01.A00;
                    C210399Se c210399Se = c89f.A09;
                    if (c210399Se != null && c210399Se.A0C == EnumC222999se.A06) {
                        return;
                    }
                    c89f.A0P.A05("start");
                }
            }

            @Override // X.C87B
            public final void E0B() {
                if (this.A00.A08.A00 instanceof C81V) {
                    this.A01.A00.A0P.A04("user_paused_video");
                }
            }

            {
                this.A01 = c89i;
                this.A00 = c1810981l;
            }
        };
        this.A05 = -1;
        C89N c89n = (C89N) new C52942bb(new C89M(userSession), abstractC59962oe.requireActivity()).A00(C89N.class);
        C14360o3.A07(c89n);
        this.A0V = c89n;
        C89P c89p = (C89P) new C52942bb(new C89O(abstractC59962oe.requireActivity(), userSession), abstractC59962oe.requireActivity()).A00(C89P.class);
        this.A0S = c89p;
        Cy8(anonymousClass874.A01(), false);
        anonymousClass874.A0C.add(this);
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        ClipsCreationViewModel clipsCreationViewModel = (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, requireActivity), requireActivity).A00(ClipsCreationViewModel.class);
        C1828389e c1828389e = (C1828389e) new C52942bb(new C89d(userSession), requireActivity).A00(C1828389e.class);
        this.A0A = c1828389e.A00();
        clipsCreationViewModel.A0G.A06(abstractC59962oe, new C1828589g(new C9EB(this, 18)));
        c1828389e.A00.A06(abstractC59962oe, new C1828589g(new C9EB(this, 17)));
        c89p.A0G.A06(abstractC59962oe, new C1828589g(new C9F3(49, this, c89p)));
        AbstractC18560vj.A03(AbstractC57302k5.A00(abstractC59962oe.getLifecycle()), new C15340po(new C9DL(c89p, abstractC59962oe, this, null, 0), c89p.A0S));
        AbstractC18560vj.A03(AbstractC57302k5.A00(abstractC59962oe.getLifecycle()), new C15340po(new C9DD(this, c89p, null, 2), c89p.A0O));
        AbstractC18560vj.A03(AbstractC57302k5.A00(abstractC59962oe.getLifecycle()), new C15340po(new C9DQ(this, c89n, abstractC59962oe, c89p, null, 1), c89n.A07));
    }

    public static final void A01(C89F c89f) {
        C3Q0 c3q0;
        C89K c89k = c89f.A0P;
        C4QW c4qw = c89k.A01;
        if (c4qw == null || (c3q0 = ((C4QT) c4qw).A0M) == null) {
            c3q0 = C3Q0.IDLE;
        }
        if (c3q0 == C3Q0.PLAYING) {
            c89k.A04("user_paused_video");
        }
        c89k.A02(c89f.A06);
    }

    public static final void A02(C89F c89f) {
        C89K c89k;
        C4QW c4qw;
        if ((c89f.A0O.A08.A00 instanceof C81V) && (c4qw = (c89k = c89f.A0P).A01) != null) {
            float f = 1.0f;
            if (c89f.A0E) {
                f = 1.0f / c89f.A0A.A00;
            }
            if (f != c89k.A00) {
                c89k.A00 = f;
                C95334Qt c95334Qt = ((C4QT) c4qw).A0K;
                if (c95334Qt != null) {
                    c95334Qt.A07(f);
                }
            }
        }
    }

    public static final void A03(C89F c89f) {
        c89f.A0U.setVisibility(0);
        int i = 8;
        c89f.A0T.setVisibility(8);
        c89f.A0G.setVisibility(0);
        TextView textView = c89f.A0I;
        if (C18U.A06(C06090Tz.A05, c89f.A0K, 36322108925749251L)) {
            i = 4;
        }
        textView.setVisibility(i);
        c89f.A0H.setVisibility(0);
    }

    public static final void A04(C89F c89f, AAN aan) {
        Rect bounds;
        float f = aan.A04;
        c89f.A02 = f;
        float f2 = aan.A05;
        c89f.A03 = f2;
        float f3 = aan.A00;
        c89f.A00 = f3;
        float f4 = aan.A01;
        c89f.A01 = f4;
        RoundedCornerFrameLayout roundedCornerFrameLayout = c89f.A0U;
        roundedCornerFrameLayout.setX(f);
        roundedCornerFrameLayout.setY(f2);
        Drawable drawable = c89f.A08;
        if (drawable != null && (bounds = drawable.getBounds()) != null) {
            roundedCornerFrameLayout.setPivotX(bounds.exactCenterX() - c89f.A02);
            roundedCornerFrameLayout.setPivotY(bounds.exactCenterY() - c89f.A03);
        }
        roundedCornerFrameLayout.setTranslationX(f + f3);
        roundedCornerFrameLayout.setTranslationY(f2 + f4);
        roundedCornerFrameLayout.setRotation(aan.A02);
        boolean z = aan.A08;
        float f5 = aan.A03;
        float f6 = f5;
        if (z) {
            f6 = -f5;
        }
        roundedCornerFrameLayout.setScaleX(f6);
        roundedCornerFrameLayout.setScaleY(f5);
        C206169Az c206169Az = aan.A07;
        roundedCornerFrameLayout.A01(c206169Az.A02, c206169Az.A03, c206169Az.A00, c206169Az.A01);
        FrameLayout.LayoutParams layoutParams = aan.A06;
        if (layoutParams != null) {
            roundedCornerFrameLayout.setLayoutParams(layoutParams);
        }
    }

    public static final void A05(C89F c89f, C89P c89p) {
        int i = 0;
        c89f.A0U.setVisibility(0);
        c89f.A0T.setVisibility(0);
        int i2 = 8;
        c89f.A0G.setVisibility(8);
        TextView textView = c89f.A0I;
        if (c89p.A0M()) {
            if (C18U.A06(C06090Tz.A05, c89f.A0K, 36322108925749251L)) {
                i2 = 4;
            }
        }
        textView.setVisibility(i2);
        View view = c89f.A0H;
        if (!c89p.A0M()) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void A06() {
        C89K c89k = this.A0P;
        C4QW c4qw = c89k.A01;
        if (c4qw != null) {
            c4qw.E3d("hide");
        }
        C4QW c4qw2 = c89k.A01;
        if (c4qw2 != null) {
            c4qw2.EE4("hide");
        }
        c89k.A01 = null;
        this.A0V.A00();
        this.A09 = null;
        RoundedCornerFrameLayout roundedCornerFrameLayout = this.A0U;
        roundedCornerFrameLayout.setTranslationX(0.0f);
        roundedCornerFrameLayout.setTranslationY(0.0f);
        roundedCornerFrameLayout.setScaleX(1.0f);
        roundedCornerFrameLayout.setScaleY(1.0f);
        roundedCornerFrameLayout.setRotation(0.0f);
        roundedCornerFrameLayout.setVisibility(8);
    }

    public final void A07() {
        int i;
        C89K c89k = this.A0P;
        c89k.A04("hide");
        if (this.A0O.A08.A00 instanceof C81V) {
            i = this.A06;
        } else {
            i = 0;
        }
        c89k.A02(i);
    }

    public final void A08() {
        C210399Se c210399Se = this.A09;
        if (c210399Se != null) {
            c210399Se.A00 = this.A04;
        }
        C4QW c4qw = this.A0P.A01;
        if (c4qw != null) {
            c4qw.EhI(this.A04, 0);
        }
    }

    public final boolean A0B() {
        if (this.A0U.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    @Override // X.C89G
    public final void DWV(float f) {
        this.A00 = f;
        this.A0U.setTranslationX(this.A02 + f);
    }

    @Override // X.C89G
    public final void DWW(float f) {
        this.A01 = f;
        this.A0U.setTranslationY(this.A03 + f);
    }

    @Override // X.C89G
    public final void DhY(float f) {
        this.A0U.setRotation(f);
    }

    @Override // X.C89G
    public final void DiN(float f) {
        RoundedCornerFrameLayout roundedCornerFrameLayout = this.A0U;
        roundedCornerFrameLayout.setScaleX(f);
        roundedCornerFrameLayout.setScaleY(f);
    }

    public static final void A00(final AbstractC59962oe abstractC59962oe, final C89F c89f, final C89P c89p, boolean z) {
        if (c89p.A0K()) {
            if (!z) {
                c89f.A0X.A00(null, null);
                return;
            }
            GestureDetector gestureDetector = new GestureDetector(c89f.A0F, new GestureDetector.SimpleOnGestureListener() { // from class: X.9TG
                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    Integer num;
                    Integer num2 = null;
                    if (motionEvent != null) {
                        num = Integer.valueOf((int) motionEvent.getX());
                        num2 = Integer.valueOf((int) motionEvent.getY());
                    } else {
                        num = null;
                    }
                    int[] iArr = {-1, -1};
                    RecyclerView recyclerView = c89f.A0J;
                    recyclerView.getLocationOnScreen(iArr);
                    int width = recyclerView.getWidth();
                    int height = recyclerView.getHeight();
                    if (num != null && num2 != null) {
                        int intValue = num.intValue();
                        int intValue2 = num2.intValue();
                        int i = iArr[0];
                        int i2 = iArr[1];
                        if (i != -1 && i2 != -1 && intValue >= i && intValue <= i + width && intValue2 >= i2 && intValue2 <= i2 + height) {
                            recyclerView.scrollBy((int) f, 0);
                        }
                    }
                    return true;
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
                
                    if (r13 > (r2 + r6)) goto L13;
                 */
                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean onSingleTapUp(android.view.MotionEvent r22) {
                    /*
                        Method dump skipped, instructions count: 782
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C9TG.onSingleTapUp(android.view.MotionEvent):boolean");
                }
            });
            c89f.A0X.A00(new AT8(gestureDetector), new AT9(gestureDetector));
        }
    }

    @Override // X.C89G
    public final void DM8(int i) {
        this.A05 = i;
    }
}
