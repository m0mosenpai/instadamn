package com.instagram.arlink.fragment;

import X.AbstractC018607g;
import X.AbstractC08820cl;
import X.AbstractC13620mo;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC23021Ah;
import X.AbstractC23451Ch;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC43594JPz;
import X.AbstractC59962oe;
import X.AbstractC60592pi;
import X.AnonymousClass001;
import X.C05F;
import X.C08790ch;
import X.C0YR;
import X.C0w9;
import X.C1GJ;
import X.C1ON;
import X.C23031Ai;
import X.C2n2;
import X.C3I9;
import X.C3P9;
import X.C45543KEi;
import X.C45547KEm;
import X.C47955LGq;
import X.C48213LVn;
import X.C55982hj;
import X.C60462pV;
import X.C66305U8d;
import X.C69422Vn7;
import X.C81I;
import X.C85J;
import X.EnumC46213Kcp;
import X.FB1;
import X.HJ9;
import X.InterfaceC11380iw;
import X.InterfaceC16530ry;
import X.InterfaceC1829689r;
import X.JQ0;
import X.KFB;
import X.KFD;
import X.KFE;
import X.KKj;
import X.KKk;
import X.KKp;
import X.KZz;
import X.L5R;
import X.LGZ;
import X.LIC;
import X.LQ0;
import X.Lf8;
import X.ViewOnTouchListenerC48085LQk;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.arlink.ui.CoachMarkOverlay;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.widget.nametag.NametagCardView;
import com.instagram.user.model.User;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class NametagController extends AbstractC60592pi implements InterfaceC1829689r {
    public User A00;
    public Integer A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Activity A06;
    public final Context A07;
    public final Handler A08;
    public final KFE A09;
    public final L5R A0A;
    public final AbstractC59962oe A0B;
    public final InterfaceC11380iw A0C;
    public final UserSession A0D;
    public final C85J A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final KFB A0I;
    public final KFD A0J;
    public View mBackgroundModeButton;
    public View mBottomBar;
    public NametagCardView mCardView;
    public View mGradientOverlay;
    public View mProfileShareCardView;
    public ViewGroup mRootView;
    public View mTopBar;
    public ImageView mTopBarCloseButton;
    public View mTopBarGalleryButton;
    public View mTopBarScanQRButton;

    @Override // X.InterfaceC1829689r
    public final /* synthetic */ void DHW(MotionEvent motionEvent, float f, float f2, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC1829689r
    public final /* synthetic */ void Du2(float f, float f2) {
    }

    public NametagController(Activity activity, RectF rectF, ViewGroup viewGroup, C47955LGq c47955LGq, LGZ lgz, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3I9 c3i9, C81I c81i, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        String str4;
        int i;
        C1ON A00;
        Integer num = C05F.A00;
        this.A01 = num;
        this.A08 = AbstractC167007dF.A0J();
        this.A05 = true;
        AbstractC23021Ah.A00(userSession).A0f(System.currentTimeMillis());
        NametagCardView nametagCardView = (NametagCardView) viewGroup.requireViewById(R.id.card_view);
        this.mCardView = nametagCardView;
        nametagCardView.setName(str, str2);
        this.A0G = str3;
        this.A0H = str;
        this.mProfileShareCardView = viewGroup.requireViewById(R.id.profile_share_card);
        this.A06 = activity;
        this.A0B = abstractC59962oe;
        Context requireContext = abstractC59962oe.requireContext();
        this.A07 = requireContext;
        this.A0E = new C85J(requireContext);
        C60462pV c60462pV = c81i.A00;
        c60462pV.A0E(this);
        this.mRootView = viewGroup;
        this.A0D = userSession;
        abstractC59962oe.getModuleName();
        this.A0C = interfaceC11380iw;
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        this.A03 = AbstractC167017dG.A1b(A002, A002.A1z, C23031Ai.A8c, 100);
        this.mGradientOverlay = viewGroup.requireViewById(R.id.gradient_overlay);
        this.mTopBar = viewGroup.requireViewById(R.id.top_bar);
        this.mTopBarCloseButton = AbstractC31173DnH.A0I(viewGroup, R.id.close_button);
        this.mBackgroundModeButton = viewGroup.requireViewById(R.id.background_mode_button);
        View requireViewById = viewGroup.requireViewById(R.id.bottom_bar);
        this.mBottomBar = requireViewById;
        requireViewById.setImportantForAccessibility(2);
        boolean A1Z = AbstractC31172DnG.A1Z(userSession, str3);
        if (A1Z) {
            str4 = "self_profile_nametag_view";
        } else {
            str4 = "other_profile_nametag_view";
        }
        this.A0F = str4;
        C3P9 A0s = AbstractC166987dD.A0s(this.mTopBarCloseButton);
        A0s.A04 = new HJ9(0, this, z2);
        A0s.A00();
        this.mTopBarScanQRButton = this.mRootView.requireViewById(R.id.qr_scan_button);
        this.mTopBarGalleryButton = this.mRootView.requireViewById(R.id.gallery_button);
        if (!A1Z) {
            this.mTopBarScanQRButton.setVisibility(8);
            this.mBackgroundModeButton.setVisibility(8);
            this.mBottomBar.setVisibility(8);
        }
        C3P9 A0s2 = AbstractC166987dD.A0s(this.mTopBarScanQRButton);
        A0s2.A04 = new KKp(this, 2);
        A0s2.A07 = true;
        A0s2.A0D = true;
        A0s2.A00();
        C3P9 A0s3 = AbstractC166987dD.A0s(this.mRootView.requireViewById(R.id.profile_share_card_copy_link_button));
        A0s3.A04 = new KKj(str, this, 0);
        A0s3.A00();
        C3P9 A0s4 = AbstractC166987dD.A0s(this.mRootView.requireViewById(R.id.profile_share_card_share_button));
        A0s4.A04 = new KKj(str, this, 1);
        A0s4.A00();
        if (z3) {
            View requireViewById2 = this.mRootView.requireViewById(R.id.profile_share_card_download_button);
            View requireViewById3 = this.mRootView.requireViewById(R.id.profile_share_card_download_button_spacer);
            requireViewById2.setVisibility(0);
            requireViewById3.setVisibility(0);
            KZz kZz = new KZz();
            kZz.A00 = this;
            C3P9 A0s5 = AbstractC166987dD.A0s(this.mRootView.requireViewById(R.id.profile_share_card_download_button));
            A0s5.A04 = new KKk(0, activity, kZz, this, userSession);
            A0s5.A00();
        }
        this.mBottomBar = viewGroup.requireViewById(R.id.bottom_bar);
        Drawable drawable = activity.getDrawable(R.drawable.instagram_camera_pano_outline_24);
        AbstractC166997dE.A0T(viewGroup, R.id.selfie_button_bottom).setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        AbstractC166997dE.A0T(viewGroup, R.id.background_image_button_bottom).setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        L5R l5r = new L5R(activity, (TouchInterceptorFrameLayout) viewGroup);
        this.A0A = l5r;
        AbstractC43594JPz.A1Q(this, l5r.A0G);
        l5r.A0F.A00(l5r.A0E, l5r.A0D);
        KFE kfe = new KFE(activity, viewGroup, c47955LGq, l5r, lgz, abstractC59962oe, userSession, c3i9, str3, str);
        this.A09 = kfe;
        c60462pV.A0E(kfe);
        KFD kfd = new KFD(activity, viewGroup, this, l5r, abstractC59962oe, interfaceC11380iw, userSession);
        this.A0J = kfd;
        c60462pV.A0E(kfd);
        KFB kfb = new KFB(activity, rectF, rectF, this, abstractC59962oe);
        this.A0I = kfb;
        c60462pV.A0E(kfb);
        if (z2 || z) {
            this.A01 = C05F.A0C;
        }
        Integer num2 = this.A01;
        if (num2 == null || (num2 == C05F.A0Y && this.A00 == null)) {
            this.A01 = num;
            num2 = num;
        }
        if (num2 == C05F.A01 || num2 == C05F.A0C || num2 == C05F.A0Y) {
            this.A05 = false;
            this.mCardView.setVisibility(8);
            ImageView imageView = this.mTopBarCloseButton;
            View view = this.mProfileShareCardView;
            if (view != null && imageView != null) {
                view.setVisibility(8);
                Activity activity2 = this.A06;
                if (z2) {
                    i = R.drawable.nav_close;
                } else {
                    boolean A02 = AbstractC13620mo.A02(activity2);
                    i = R.drawable.instagram_chevron_left_pano_outline_24;
                    if (A02) {
                        i = R.drawable.instagram_chevron_right_pano_outline_24;
                    }
                }
                AbstractC166997dE.A19(activity2, imageView, i);
            }
            this.A09.A09(0.0f);
        }
        A04(this.A01, null);
        if (!z2 && (A00 = FB1.A00(userSession, C05F.A0A, str, interfaceC11380iw.getModuleName())) != null) {
            C08790ch A003 = AbstractC018607g.A00(abstractC59962oe);
            A00.A00 = new C45547KEm(viewGroup, this, str, 0);
            C1GJ.A00(activity, A003, A00);
            return;
        }
        A01(viewGroup, this);
    }

    public static String A00(NametagController nametagController, String str) {
        String str2 = nametagController.A02;
        if (str2 == null) {
            str2 = StringFormatUtil.formatStrLocaleSafe("https://www.instagram.com/%s/?r=nametag", str);
        }
        try {
            Uri A03 = AbstractC08820cl.A03(str2);
            Uri.Builder builder = new Uri.Builder();
            Iterator it = JQ0.A0o(builder, A03).iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                builder.appendQueryParameter(A1B, A03.getQueryParameter(A1B));
            }
            str2 = URLDecoder.decode(builder.build().toString(), ReactWebViewManager.HTML_ENCODING);
            return str2;
        } catch (UnsupportedEncodingException | RuntimeException unused) {
            C0w9.A03("QRCodeDialogParseError", AnonymousClass001.A0R("failed url: ", str2));
            return str2;
        }
    }

    public static void A01(ViewGroup viewGroup, NametagController nametagController) {
        Integer num = nametagController.A01;
        Integer num2 = C05F.A00;
        if (num == num2) {
            UserSession userSession = nametagController.A0D;
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            InterfaceC16530ry interfaceC16530ry = A00.A44;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 102)) {
                LIC lic = new LIC(viewGroup);
                if (lic.A03 == null) {
                    ViewGroup viewGroup2 = (ViewGroup) lic.A09.inflate();
                    lic.A03 = viewGroup2;
                    lic.A06 = (CoachMarkOverlay) viewGroup2.requireViewById(R.id.coach_mark_overlay);
                    lic.A02 = lic.A03.requireViewById(R.id.tutorial_text_arrow_container);
                    lic.A04 = AbstractC166997dE.A0T(lic.A03, R.id.tutorial_step_text);
                    lic.A05 = AbstractC166997dE.A0T(lic.A03, R.id.tutorial_title_text);
                    lic.A01 = lic.A03.requireViewById(R.id.tutorial_arrow_up);
                    lic.A00 = lic.A03.requireViewById(R.id.tutorial_arrow_down);
                    LQ0.A02(lic.A03, 48, lic);
                    LIC.A00(lic, num2);
                    lic.A0A.A06(1.0d);
                    lic.A0B.A08(1.0d, true);
                }
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                AbstractC167007dF.A1L(A002, A002.A44, c0yrArr, 102, true);
            }
        }
        AbstractC31176DnK.A1D(viewGroup, R.id.loading_view);
    }

    public static void A02(C2n2 c2n2, NametagController nametagController, Integer num, String str) {
        C1ON A00 = FB1.A00(nametagController.A0D, num, str, nametagController.A0C.getModuleName());
        if (A00 != null) {
            Activity activity = nametagController.A06;
            C08790ch A002 = AbstractC018607g.A00(nametagController.A0B);
            A00.A00 = new C45543KEi(0, nametagController, c2n2);
            C1GJ.A00(activity, A002, A00);
        }
    }

    public static void A03(NametagController nametagController, Integer num) {
        Integer num2 = nametagController.A01;
        if (num2 != num) {
            nametagController.A01 = num;
            nametagController.A04(num, num2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x003c, code lost:
    
        if (r8.A05() != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05() {
        /*
            r9 = this;
            java.lang.Integer r1 = r9.A01
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L8
            r8 = 0
        L7:
            return r8
        L8:
            X.KFE r5 = r9.A09
            X.LQk r8 = r5.A0J
            boolean r0 = r8.A05()
            r7 = 1
            if (r0 == 0) goto L3f
            X.KKq r6 = r8.A05
            if (r6 == 0) goto L35
            X.2hj r0 = r6.A00
            double r3 = r0.A01
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L35
            r6.A00()
        L24:
            r0 = 1
        L25:
            r8 = 1
            if (r0 != 0) goto L7
            X.KFD r2 = r9.A0J
            X.8lR r0 = r2.A07
            if (r0 == 0) goto L5f
            r0.A00()
            r0 = 0
            r2.A07 = r0
            return r8
        L35:
            r8.A03(r7)
            boolean r0 = r8.A05()
            if (r0 == 0) goto L3f
            goto L24
        L3f:
            X.LO8 r2 = r5.A0K
            android.view.ViewGroup r0 = r2.A03
            if (r0 == 0) goto L5d
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L5d
            r1 = 0
            X.LGZ r0 = r5.A0L
            boolean r0 = r0.A02()
            if (r0 == 0) goto L5d
            X.KFE.A03(r5)
            r2.A05(r7)
            r5.A07 = r1
            goto L24
        L5d:
            r0 = 0
            goto L25
        L5f:
            X.WXc r1 = r2.A0T
            boolean r0 = r1.A03()
            if (r0 == 0) goto L6b
            r1.A01()
            return r8
        L6b:
            boolean r0 = X.KFD.A03(r2)
            if (r0 == 0) goto L75
            X.KFD.A02(r2)
            return r8
        L75:
            X.KFB r1 = r9.A0I
            boolean r0 = r1.A00
            if (r0 != 0) goto L7
            r0 = 0
            X.Jdq r6 = new X.Jdq
            r6.<init>(r1, r0)
            X.2oe r0 = r1.A08
            android.view.View r5 = r0.mView
            if (r5 == 0) goto Lc9
            android.graphics.RectF r4 = r1.A06
            if (r4 == 0) goto Lc9
            r1.A00 = r7
            float r3 = r4.width()
            int r0 = r1.A03
            float r0 = (float) r0
            float r3 = r3 / r0
            X.2hf r0 = X.C150956qv.A02
            X.5le r2 = X.AbstractC43592JPx.A0n(r5)
            float r1 = r5.getScaleX()
            float r0 = r4.centerX()
            r2.A0U(r1, r3, r0)
            float r1 = r5.getScaleY()
            float r0 = r4.centerY()
            r2.A0V(r1, r3, r0)
            r0 = 0
            r2.A0K(r0)
            r0 = 8
            r2.A03 = r0
            X.5le r1 = r2.A0F(r7)
            r1.A05 = r6
            X.2hf r0 = X.AbstractC43599JQf.A00
            X.5le r0 = r1.A0E(r0)
            r0.A0H()
            return r8
        Lc9:
            r6.onFinish()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arlink.fragment.NametagController.A05():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r7 > X.AbstractC166987dD.A02(r5)) goto L17;
     */
    @Override // X.InterfaceC1829689r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DJG(float r10, float r11, float r12, float r13, float r14, boolean r15, boolean r16) {
        /*
            r9 = this;
            if (r16 == 0) goto L4d
            java.lang.Integer r1 = r9.A01
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L53
            X.KFD r0 = r9.A0J
            X.LVn r2 = r0.A04
            if (r2 == 0) goto L4d
            X.8i5 r0 = r2.A05
            boolean r0 = r0.CVK()
            if (r0 == 0) goto L4d
            float r8 = -r11
            X.2hj r6 = r2.A04
            X.2hk r0 = r6.A09
            double r0 = r0.A00
            float r7 = (float) r0
            double r0 = (double) r8
            r6.A07(r0)
            android.view.ViewGroup r0 = r2.A01
            int r5 = r0.getHeight()
            r4 = 1
            r3 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            boolean r2 = X.AbstractC167007dF.A1O(r0)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            boolean r1 = X.AbstractC25230BEn.A1P(r0)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto L3b
            r4 = 0
        L3b:
            if (r2 != 0) goto L49
            if (r1 != 0) goto L4f
            if (r4 != 0) goto L4d
            float r0 = X.AbstractC166987dD.A02(r5)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4f
        L49:
            double r0 = (double) r5
            r6.A06(r0)
        L4d:
            r0 = 0
            return r0
        L4f:
            r6.A04()
            goto L4d
        L53:
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L4d
            X.KFE r2 = r9.A09
            X.Kcp r1 = r2.A03
            X.Kcp r0 = X.EnumC46213Kcp.A08
            if (r1 != r0) goto L4d
            X.LQk r1 = r2.A0J
            r0 = 1
            boolean r0 = r1.A06(r11, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arlink.fragment.NametagController.DJG(float, float, float, float, float, boolean, boolean):boolean");
    }

    @Override // X.InterfaceC1829689r
    public final void Dir(float f, float f2, float f3, float f4, boolean z, boolean z2) {
        if (z2) {
            Integer num = this.A01;
            if (num == C05F.A01) {
                C48213LVn c48213LVn = this.A0J.A04;
                if (c48213LVn != null && c48213LVn.A05.CVK()) {
                    C55982hj c55982hj = c48213LVn.A04;
                    c55982hj.A08(c55982hj.A09.A00 - (-f2), true);
                    return;
                }
                return;
            }
            if (num != C05F.A00) {
                return;
            }
            KFE kfe = this.A09;
            if (kfe.A03 != EnumC46213Kcp.A08) {
                return;
            }
            ViewOnTouchListenerC48085LQk viewOnTouchListenerC48085LQk = kfe.A0J;
            if (!viewOnTouchListenerC48085LQk.A05() && f2 > 0.0f) {
                viewOnTouchListenerC48085LQk.A04(true);
            } else {
                if (!viewOnTouchListenerC48085LQk.A05()) {
                    return;
                }
                ViewOnTouchListenerC48085LQk.A01(viewOnTouchListenerC48085LQk, f2);
            }
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A0A.A0F.COs(null);
        NametagControllerLifecycleUtil.cleanupReferences(this);
    }

    private void A04(Integer num, Integer num2) {
        User user;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                if (intValue != 1) {
                    if (intValue == 4 && (user = this.A00) != null) {
                        KFD kfd = this.A0J;
                        kfd.A08(false);
                        ViewGroup viewGroup = kfd.A01;
                        if (KFD.A03(kfd) && kfd.A06 == null && viewGroup != null) {
                            C69422Vn7 c69422Vn7 = new C69422Vn7(kfd.A0L, "ScanCameraController", kfd.A0J, viewGroup);
                            c69422Vn7.A02 = 15;
                            c69422Vn7.A00 = 6;
                            c69422Vn7.A03 = kfd.A0K.getContext().getColor(R.color.primary_text_disabled_material_dark);
                            C66305U8d c66305U8d = new C66305U8d(c69422Vn7);
                            kfd.A06 = c66305U8d;
                            c66305U8d.setVisible(true, false);
                        }
                        kfd.A0T.A02(user);
                        return;
                    }
                    return;
                }
                Activity activity = this.A06;
                if (AbstractC23451Ch.A07(activity, "android.permission.CAMERA")) {
                    KFD kfd2 = this.A0J;
                    if (!kfd2.A08) {
                        kfd2.A08 = true;
                        kfd2.A05();
                        Lf8 lf8 = kfd2.A03;
                        if (lf8 != null) {
                            lf8.A03 = true;
                        }
                    }
                    if (num2 == C05F.A00) {
                        ImageView imageView = this.mTopBarCloseButton;
                        boolean A02 = AbstractC13620mo.A02(activity);
                        int i = R.drawable.instagram_chevron_left_pano_outline_24;
                        if (A02) {
                            i = R.drawable.instagram_chevron_right_pano_outline_24;
                        }
                        AbstractC166997dE.A19(activity, imageView, i);
                    }
                } else {
                    if (num2 == null || num2 == C05F.A0C) {
                        num2 = C05F.A0N;
                    }
                    this.A01 = num2;
                    this.A0J.A05();
                    this.mTopBarScanQRButton.setEnabled(true);
                }
            } else {
                this.mGradientOverlay.setVisibility(0);
                return;
            }
        } else {
            AbstractC166997dE.A19(this.A06, this.mTopBarCloseButton, R.drawable.nav_close);
            if (num2 == C05F.A01) {
                this.A0J.A08(true);
            }
        }
        this.A00 = null;
    }
}
