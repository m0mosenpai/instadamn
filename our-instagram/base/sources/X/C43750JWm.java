package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.facebook.R;
import java.util.List;

/* renamed from: X.JWm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43750JWm {
    public int A00;
    public C45036JwR A01;
    public boolean A02;
    public final Path A03 = AbstractC166987dD.A0T();
    public final AppCompatSeekBar A04;
    public final List A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    public static final void A00(Activity activity, FrameLayout frameLayout, C43750JWm c43750JWm, String str) {
        if (frameLayout.getWidth() > 0) {
            AppCompatSeekBar appCompatSeekBar = c43750JWm.A04;
            if (appCompatSeekBar.getWidth() > 0) {
                int[] iArr = new int[2];
                appCompatSeekBar.getLocationOnScreen(iArr);
                int height = iArr[1] + appCompatSeekBar.getHeight();
                frameLayout.getLocationOnScreen(new int[2]);
                frameLayout.setTranslationY(frameLayout.getTranslationY() + ((height - (r0[1] + AbstractC166987dD.A02(frameLayout.getHeight()))) - (AbstractC166997dE.A0D(appCompatSeekBar.getResources()) / 2)));
                List list = c43750JWm.A05;
                if (list.size() >= 1) {
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        C45036JwR c45036JwR = (C45036JwR) obj;
                        Object A0V = AnonymousClass001.A0V("ad_keyframe_marker_", str, '_', i);
                        if (frameLayout.findViewWithTag(A0V) == null) {
                            int paddingLeft = appCompatSeekBar.getPaddingLeft() + ((int) (AbstractC43594JPz.A08(appCompatSeekBar, appCompatSeekBar.getMeasuredWidth()) * c45036JwR.A03));
                            FrameLayout frameLayout2 = new FrameLayout(activity);
                            InterfaceC09390do interfaceC09390do = c43750JWm.A08;
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC167027dH.A01(interfaceC09390do), AbstractC167027dH.A01(interfaceC09390do));
                            layoutParams.gravity = 16;
                            frameLayout2.setLayoutParams(layoutParams);
                            frameLayout2.setTranslationX(paddingLeft - (AbstractC167027dH.A01(interfaceC09390do) / 2.0f));
                            C0fQ.A00(new ViewOnClickListenerC48073LPy(frameLayout2, 44), frameLayout2);
                            View view = new View(activity);
                            InterfaceC09390do interfaceC09390do2 = c43750JWm.A06;
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC167027dH.A01(interfaceC09390do2), AbstractC167027dH.A01(interfaceC09390do2));
                            layoutParams2.gravity = 16;
                            view.setLayoutParams(layoutParams2);
                            AbstractC31173DnH.A0z(activity, view, R.drawable.clips_keyframe_marker);
                            view.setVisibility(0);
                            view.setTranslationX((AbstractC167027dH.A01(interfaceC09390do) - AbstractC167027dH.A01(interfaceC09390do2)) / 2.0f);
                            view.setScaleX(0.0f);
                            view.setScaleY(0.0f);
                            view.setAlpha(0.0f);
                            view.setTag(A0V);
                            frameLayout2.addView(view);
                            frameLayout.addView(frameLayout2);
                            c45036JwR.A02 = AbstractC25225BEi.A16(view);
                            c45036JwR.A01 = AbstractC25225BEi.A16(frameLayout2);
                            A01(view, c43750JWm);
                        }
                        i = i2;
                    }
                    return;
                }
                return;
            }
        }
        if (frameLayout.getWidth() == 0) {
            frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC48097LQx(activity, frameLayout, c43750JWm, str, 0));
        }
        AppCompatSeekBar appCompatSeekBar2 = c43750JWm.A04;
        if (appCompatSeekBar2.getWidth() == 0) {
            appCompatSeekBar2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC48097LQx(activity, frameLayout, c43750JWm, str, 1));
        }
    }

    public static final void A02(C45036JwR c45036JwR, C43750JWm c43750JWm, int i, int i2) {
        View view = (View) c45036JwR.A02.get();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C14360o3.A0C(layoutParams, AbstractC111324zv.A00(5));
            float A07 = AbstractC166987dD.A07(view);
            float f = i;
            if (f == A07) {
                layoutParams.width = i;
                layoutParams.height = i;
                view.setLayoutParams(layoutParams);
            } else {
                float[] A1b = AbstractC43592JPx.A1b();
                A1b[0] = A07;
                A1b[1] = f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
                C44249Jgt.A00(ofFloat, layoutParams, view, 13);
                ofFloat.setDuration(125L);
                ofFloat.start();
            }
            Drawable background = view.getBackground();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(i2);
            }
            AppCompatSeekBar appCompatSeekBar = c43750JWm.A04;
            if (appCompatSeekBar.getMeasuredWidth() != 0) {
                int paddingLeft = appCompatSeekBar.getPaddingLeft() + ((int) (AbstractC43594JPz.A08(appCompatSeekBar, appCompatSeekBar.getMeasuredWidth()) * c45036JwR.A03));
                View view2 = (View) c45036JwR.A01.get();
                if (view2 != null) {
                    view2.setTranslationX(paddingLeft - (AbstractC167027dH.A01(c43750JWm.A08) / 2.0f));
                }
                view.setTranslationX((AbstractC167027dH.A01(c43750JWm.A08) - i) / 2.0f);
            }
        }
    }

    public C43750JWm(AppCompatSeekBar appCompatSeekBar) {
        this.A04 = appCompatSeekBar;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C57239PbN(this, 39));
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C57239PbN(this, 40));
        this.A08 = AbstractC09440dt.A00(enumC09460dv, new C57239PbN(this, 41));
        this.A05 = AbstractC166987dD.A1E();
        this.A0B = AbstractC09440dt.A00(enumC09460dv, new C57239PbN(this, 44));
        this.A0A = AbstractC09440dt.A00(enumC09460dv, new C57239PbN(this, 43));
        this.A09 = AbstractC09440dt.A00(enumC09460dv, new C57239PbN(this, 42));
    }

    public static final void A01(View view, C43750JWm c43750JWm) {
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            AbstractC43593JPy.A0E(view.animate(), 1.0f).alpha(1.0f).setInterpolator(new LinearInterpolator()).setDuration(500L).start();
        } else {
            view.requestLayout();
            view.post(new RunnableC49972M4n(view, c43750JWm));
        }
    }
}
