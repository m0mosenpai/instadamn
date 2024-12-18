package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class ANV implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public ANV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new ANV(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        String str;
        int A02;
        switch (this.A00) {
            case 0:
                ((AND) this.A01).A00 = valueAnimator.getAnimatedFraction();
                return;
            case 1:
                C14360o3.A0B(valueAnimator, 0);
                C2XI c2xi = ((A87) this.A01).A02;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                c2xi.A00(animatedValue);
                return;
            case 2:
            case 3:
                ((AA1) this.A01).A02.invalidateSelf();
                return;
            case 4:
                C14360o3.A0B(valueAnimator, 0);
                float A00 = AbstractC167017dG.A00(valueAnimator);
                C9R5 c9r5 = (C9R5) this.A01;
                View view2 = c9r5.A05;
                view2.setRotationY(-A00);
                if (A00 <= 95.0f) {
                    float f = -AbstractC13600mm.A02(A00, 0.0f, 95.0f, -1.0f, -0.625f);
                    view2.setScaleX(f);
                    view2.setScaleY(f);
                    return;
                }
                view2.setVisibility(8);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setRotationY(0.0f);
                View view3 = c9r5.A04;
                view3.setVisibility(0);
                float A022 = AbstractC13600mm.A02(A00, 95.0f, 180.0f, 0.625f, 1.0f);
                view3.setScaleX(A022);
                view3.setScaleY(A022);
                C174757qB c174757qB = c9r5.A06;
                View view4 = c174757qB.A0F;
                view4.setScaleX(A022);
                view4.setScaleY(A022);
                c174757qB.A0H.A00().setVisibility(0);
                return;
            case 5:
                C14360o3.A0B(valueAnimator, 0);
                float A002 = AbstractC167017dG.A00(valueAnimator);
                View view5 = (View) this.A01;
                ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
                layoutParams.height = (int) A002;
                view5.setLayoutParams(layoutParams);
                return;
            case 6:
            case 7:
                C14360o3.A0B(valueAnimator, 0);
                view = ((C214759fD) this.A01).A0E;
                if (view == null) {
                    str = "ballView";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                view.setAlpha(AbstractC167017dG.A00(valueAnimator));
                return;
            case 8:
            case 10:
            default:
                C14360o3.A0B(valueAnimator, 0);
                Fragment fragment = (Fragment) this.A01;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                int A0H = AbstractC166987dD.A0H(animatedValue2);
                View view6 = fragment.mView;
                if (view6 != null) {
                    view6.setBackgroundColor(A0H);
                    return;
                }
                return;
            case 9:
                C14360o3.A0B(valueAnimator, 0);
                float A003 = AbstractC167017dG.A00(valueAnimator);
                TextView textView = ((C214759fD) this.A01).A0P;
                str = "projectileView";
                if (textView != null) {
                    textView.setY(textView.getY() + (10.0f * A003));
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 11:
                C14360o3.A0B(valueAnimator, 0);
                C214759fD c214759fD = (C214759fD) this.A01;
                float A004 = AbstractC167017dG.A00(valueAnimator);
                c214759fD.A03 = A004;
                View view7 = c214759fD.A06;
                str = "paddleView";
                if (view7 != null) {
                    view7.setX(A004 - (view7.getWidth() / 2));
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(valueAnimator, 0);
                AnonymousClass397 anonymousClass397 = (AnonymousClass397) this.A01;
                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                Context context = anonymousClass397.A02;
                Activity activity = anonymousClass397.A01;
                if (context == null || activity == null) {
                    return;
                }
                float A005 = AbstractC167017dG.A00(valueAnimator);
                Fragment fragment2 = anonymousClass397.A03;
                UserSession userSession = anonymousClass397.A05;
                boolean z = false;
                if (A005 < 0.6f) {
                    z = true;
                }
                boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36317534785705304L);
                int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_primary_background);
                int A092 = AbstractC167007dF.A09(AbstractC53172bz.A01(activity), R.attr.igds_color_primary_background);
                int A023 = AbstractC13950nL.A02(A005, A09, A092);
                int A024 = AbstractC13950nL.A02(A005, A092, A09);
                View findViewById = activity.findViewById(R.id.tab_bar);
                View findViewById2 = activity.findViewById(R.id.ls_nav_bar);
                if (findViewById != null) {
                    findViewById.setBackgroundColor(A023);
                }
                if (findViewById2 != null) {
                    findViewById2.setBackgroundColor(A023);
                }
                View findViewById3 = activity.findViewById(R.id.tab_bar_shadow);
                View findViewById4 = activity.findViewById(R.id.ls_nav_bar_shadow);
                if (findViewById3 != null) {
                    findViewById3.setBackgroundColor(A023);
                }
                if (findViewById4 != null) {
                    findViewById4.setBackgroundColor(A023);
                }
                Iterator it = AbstractC57322k7.A02(activity).iterator();
                while (it.hasNext()) {
                    ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) it.next();
                    colorFilterAlphaImageView.setActiveColor(A024);
                    colorFilterAlphaImageView.setNormalColor(A024);
                }
                C30D.A04(activity, A023);
                C30D.A06(activity, z);
                if (AbstractC145016gM.A06(activity)) {
                    Window window = activity.getWindow();
                    window.getClass();
                    window.getDecorView().setBackgroundColor(A023);
                } else {
                    AbstractC145016gM.A00(activity, A023);
                }
                if (A06) {
                    return;
                }
                AbstractC56402iY.A04(activity, fragment2, A023, AbstractC167007dF.A1O((A005 > 0.0f ? 1 : (A005 == 0.0f ? 0 : -1))));
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(valueAnimator, 0);
                view = (View) this.A01;
                view.setAlpha(AbstractC167017dG.A00(valueAnimator));
                return;
            case 14:
                C14360o3.A0B(valueAnimator, 0);
                InterfaceC09390do interfaceC09390do = ((C72993Pa) this.A01).A07;
                View A0L = AbstractC167007dF.A0L(interfaceC09390do);
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                A0L.setScaleX(AbstractC166987dD.A09(animatedValue3));
                View A0L2 = AbstractC167007dF.A0L(interfaceC09390do);
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                A0L2.setScaleY(AbstractC166987dD.A09(animatedValue4));
                return;
            case Process.SIGTERM /* 15 */:
                C14360o3.A0B(valueAnimator, 0);
                C6TY c6ty = (C6TY) this.A01;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction <= 0.0f) {
                    A02 = c6ty.A01;
                } else if (animatedFraction >= 1.0f) {
                    A02 = c6ty.A00;
                } else {
                    A02 = AbstractC13950nL.A02(animatedFraction, c6ty.A01, c6ty.A00);
                }
                ((TextView) c6ty.A05.getView()).setTextColor(A02);
                return;
        }
    }
}
