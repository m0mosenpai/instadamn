package X;

import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.smartcapture.ui.ResourcesProgressBar;
import com.facebook.smartcapture.ui.view.ArrowHintView;
import com.facebook.smartcapture.ui.view.FaceCaptureProgressView;
import com.facebook.smartcapture.view.HelpButton;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class K5V extends K5W implements InterfaceC11380iw {
    public static final Interpolator A0Q = new AccelerateInterpolator();
    public static final String __redex_internal_original_name = "IgSelfieCaptureOverlayFragment";
    public View A00;
    public FrameLayout A01;
    public ImageView A02;
    public LinearLayout A03;
    public TextView A04;
    public TextView A05;
    public EnumC61156RgH A06;
    public ResourcesProgressBar A07;
    public ArrowHintView A08;
    public FaceCaptureProgressView A09;
    public HelpButton A0A;
    public UserSession A0B;
    public Integer A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public View A0H;
    public AbstractC12990ll A0I;
    public boolean A0J;
    public final Handler A0L = AbstractC167007dF.A0J();
    public final RectF A0K = AbstractC166987dD.A0X();
    public final float[] A0O = new float[4];
    public final float[] A0P = new float[4];
    public final C47502KyV A0M = new C47502KyV(this);
    public final C48224LVy A0N = new C48224LVy(new C47236Ku9(this));

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.EnumC61156RgH r11, X.K5V r12, java.lang.Integer r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5V.A02(X.RgH, X.K5V, java.lang.Integer):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "selfie_capture";
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        if (((com.facebook.smartcapture.view.BaseSelfieCaptureActivity) r1).A05 != null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5V.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(EnumC61156RgH enumC61156RgH, K5V k5v) {
        RectF rectF;
        float f;
        float f2;
        float centerY;
        ArrowHintView arrowHintView = k5v.A08;
        if (arrowHintView == null) {
            C14360o3.A0F("arrowHintView");
            throw C00O.createAndThrow();
        }
        Resources A0M = AbstractC25228BEl.A0M(arrowHintView);
        int A02 = AbstractC31171DnF.A02(A0M, R.dimen.alert_dialog_button_cell_height) / 2;
        int A022 = AbstractC31171DnF.A02(A0M, R.dimen.abc_button_inset_vertical_material);
        ViewGroup.LayoutParams layoutParams = arrowHintView.getLayoutParams();
        C14360o3.A0C(layoutParams, AbstractC111324zv.A00(5));
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 3;
        int ordinal = enumC61156RgH.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        RectF rectF2 = k5v.A0K;
                        float f3 = A02;
                        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) (rectF2.centerX() - f3);
                        centerY = (rectF2.bottom - f3) + A022;
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    rectF = k5v.A0K;
                    f = A02;
                    f2 = (rectF.right - f) + A022;
                }
            } else {
                RectF rectF3 = k5v.A0K;
                float f4 = A02;
                ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) (rectF3.centerX() - f4);
                centerY = (rectF3.top - f4) - A022;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) centerY;
            arrowHintView.requestLayout();
        }
        rectF = k5v.A0K;
        f = A02;
        f2 = (rectF.left - f) - A022;
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) f2;
        centerY = rectF.centerY() - f;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) centerY;
        arrowHintView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.EnumC61156RgH r3, X.K5V r4, java.lang.Integer r5) {
        /*
            X.LVy r0 = r4.A0N
            boolean r0 = r0.A00
            if (r0 == 0) goto L6a
            java.lang.Integer r0 = X.C05F.A0Y
            java.lang.String r2 = "titleView"
            if (r5 == r0) goto L17
            android.widget.TextView r1 = r4.A05
            if (r1 == 0) goto L29
            r0 = 2131951816(0x7f1300c8, float:1.9540057E38)
            r1.setText(r0)
            return
        L17:
            if (r3 != 0) goto L31
            android.widget.TextView r1 = r4.A05
            if (r1 == 0) goto L29
            r0 = 2131951840(0x7f1300e0, float:1.9540106E38)
        L20:
            r1.setText(r0)
            android.widget.LinearLayout r0 = r4.A03
            if (r0 != 0) goto L61
            java.lang.String r2 = "messageContainer"
        L29:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L31:
            int r1 = r3.ordinal()
            r0 = 0
            if (r1 == r0) goto L59
            r0 = 1
            if (r1 == r0) goto L51
            r0 = 2
            if (r1 == r0) goto L49
            r0 = 3
            if (r1 != r0) goto L65
            android.widget.TextView r1 = r4.A05
            if (r1 == 0) goto L29
            r0 = 2131951841(0x7f1300e1, float:1.9540108E38)
            goto L20
        L49:
            android.widget.TextView r1 = r4.A05
            if (r1 == 0) goto L29
            r0 = 2131951843(0x7f1300e3, float:1.9540112E38)
            goto L20
        L51:
            android.widget.TextView r1 = r4.A05
            if (r1 == 0) goto L29
            r0 = 2131951844(0x7f1300e4, float:1.9540114E38)
            goto L20
        L59:
            android.widget.TextView r1 = r4.A05
            if (r1 == 0) goto L29
            r0 = 2131951842(0x7f1300e2, float:1.954011E38)
            goto L20
        L61:
            android.transition.TransitionManager.beginDelayedTransition(r0)
            return
        L65:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L6a:
            A02(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5V.A01(X.RgH, X.K5V, java.lang.Integer):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        UserSession userSession;
        int A02 = C0f9.A02(-948039736);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A0D = requireArguments.getString("challenge_use_case");
        requireArguments.getString("av_session_id");
        requireArguments.getString("flow_id");
        this.A0E = requireArguments.getString("product_surface");
        AbstractC18680vv A04 = C023409i.A0A.A04(requireArguments);
        this.A0I = A04;
        if (A04 instanceof UserSession) {
            userSession = (UserSession) A04;
        } else {
            userSession = null;
        }
        this.A0B = userSession;
        C0f9.A09(1740144422, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1860421809);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.default_selfie_capture_overlay_fragment, viewGroup, false);
        C0f9.A09(868207351, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1983779464);
        super.onDestroyView();
        ArrowHintView arrowHintView = this.A08;
        if (arrowHintView == null) {
            C14360o3.A0F("arrowHintView");
            throw C00O.createAndThrow();
        }
        C47597L0h c47597L0h = arrowHintView.A03;
        if (c47597L0h != null) {
            c47597L0h.A00 = true;
            c47597L0h.A01.cancel();
            arrowHintView.A03 = null;
        }
        C0f9.A09(-909288777, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-687530861);
        HelpButton helpButton = this.A0A;
        if (helpButton == null) {
            C14360o3.A0F("helpButton");
            throw C00O.createAndThrow();
        }
        helpButton.A04.removeCallbacks(helpButton.A05);
        super.onPause();
        C0f9.A09(1368212883, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1400895987);
        super.onResume();
        A04(null);
        FaceCaptureProgressView faceCaptureProgressView = this.A09;
        String str = "captureProgressView";
        if (faceCaptureProgressView != null) {
            faceCaptureProgressView.A03();
            FaceCaptureProgressView faceCaptureProgressView2 = this.A09;
            if (faceCaptureProgressView2 != null) {
                faceCaptureProgressView2.setDrawingAlpha(0.0f);
                ArrowHintView arrowHintView = this.A08;
                if (arrowHintView == null) {
                    str = "arrowHintView";
                } else {
                    arrowHintView.setAlpha(0.0f);
                    View view = this.A00;
                    if (view == null) {
                        str = "rootView";
                    } else {
                        View A00 = AbstractC47961LGz.A00(view, R.id.placeholder);
                        A00.setAlpha(1.0f);
                        AbstractC31174DnI.A1C(A00, AbstractC47994LKy.A01(AbstractC166997dE.A0L(A00), R.attr.selfie_capture_placeholder));
                        C0f9.A09(-139467836, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
