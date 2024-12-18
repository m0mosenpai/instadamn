package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebookpay.widget.navibar.NavigationBar;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class WOE implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;

    public WOE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Animatable animatable;
        String str;
        FrameLayout.LayoutParams layoutParams;
        ViewTreeObserver viewTreeObserver;
        View view;
        switch (this.A00) {
            case 0:
                UDJ udj = (UDJ) this.A01;
                if (!udj.CdI()) {
                    return;
                }
                List list = udj.A0M;
                if (list.size() <= 0 || ((VgZ) AbstractC166987dD.A16(list)).A02.A0D) {
                    return;
                }
                View view2 = udj.A06;
                if (view2 != null && view2.isShown()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((VgZ) it.next()).A02.show();
                    }
                    return;
                }
                udj.dismiss();
                return;
            case 1:
                UDK udk = (UDK) this.A01;
                if (!udk.CdI()) {
                    return;
                }
                C66371UDt c66371UDt = udk.A0G;
                if (c66371UDt.A0D) {
                    return;
                }
                View view3 = udk.A03;
                if (view3 != null && view3.isShown()) {
                    c66371UDt.show();
                    return;
                } else {
                    udk.dismiss();
                    return;
                }
            case 2:
                UCx uCx = (UCx) this.A01;
                InterfaceC71999XEn interfaceC71999XEn = uCx.A02;
                if (!interfaceC71999XEn.CdI()) {
                    interfaceC71999XEn.Ek9(uCx.getTextDirection(), uCx.getTextAlignment());
                }
                viewTreeObserver = uCx.getViewTreeObserver();
                if (viewTreeObserver == null) {
                    return;
                }
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                return;
            case 3:
                UDs uDs = (UDs) this.A01;
                UCx uCx2 = uDs.A04;
                if (uCx2.isAttachedToWindow() && uCx2.getGlobalVisibleRect(uDs.A03)) {
                    uDs.A01();
                    uDs.show();
                    return;
                } else {
                    uDs.dismiss();
                    return;
                }
            case 4:
                C66351UBk c66351UBk = (C66351UBk) this.A01;
                if (c66351UBk.A09) {
                    int i = c66351UBk.A02;
                    Animator.AnimatorListener animatorListener = c66351UBk.A0G;
                    c66351UBk.clearAnimation();
                    c66351UBk.setScaleX(1.5f);
                    c66351UBk.setScaleY(1.5f);
                    c66351UBk.animate().setDuration(i).setInterpolator(c66351UBk.A04).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setListener(animatorListener);
                } else {
                    boolean equals = c66351UBk.A07.equals(C05F.A00);
                    int height = c66351UBk.getHeight();
                    if (equals) {
                        height = -height;
                    }
                    c66351UBk.setTranslationY(height);
                    c66351UBk.A04(c66351UBk.A0G, c66351UBk.A02);
                }
                C66351UBk.A00(c66351UBk);
                view = c66351UBk;
                viewTreeObserver = view.getViewTreeObserver();
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                return;
            case 5:
                VJL vjl = (VJL) this.A01;
                Rect rect = new Rect();
                vjl.A01.getWindowVisibleDisplayFrame(rect);
                int i2 = rect.bottom - rect.top;
                if (i2 == vjl.A00) {
                    return;
                }
                View view4 = vjl.A01;
                int height2 = view4.getRootView().getHeight();
                int i3 = height2 - i2;
                if (i3 > height2 / 4) {
                    layoutParams = vjl.A02;
                    height2 -= i3;
                } else {
                    layoutParams = vjl.A02;
                }
                ((ViewGroup.LayoutParams) layoutParams).height = height2;
                view4.requestLayout();
                vjl.A00 = i2;
                return;
            case 6:
                NavigationBar navigationBar = (NavigationBar) this.A01;
                AbstractC166997dE.A1K(navigationBar, this);
                LinearLayout linearLayout = navigationBar.A07;
                str = "navbarCenterContainer";
                if (linearLayout != null) {
                    if (linearLayout.getMeasuredWidth() == navigationBar.A00) {
                        return;
                    }
                    NavigationBar.A01(navigationBar);
                    navigationBar.A00 = linearLayout.getMeasuredWidth();
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 7:
                NavigationBar navigationBar2 = (NavigationBar) this.A01;
                AbstractC166997dE.A1K(navigationBar2, this);
                LinearLayout linearLayout2 = navigationBar2.A08;
                str = "navbarLeftContainer";
                if (linearLayout2 != null) {
                    if (linearLayout2.getMeasuredWidth() == navigationBar2.A01) {
                        return;
                    }
                    NavigationBar.A01(navigationBar2);
                    navigationBar2.A01 = linearLayout2.getMeasuredWidth();
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 8:
                NavigationBar navigationBar3 = (NavigationBar) this.A01;
                AbstractC166997dE.A1K(navigationBar3, this);
                LinearLayout linearLayout3 = navigationBar3.A09;
                str = "navbarRightContainer";
                if (linearLayout3 != null) {
                    if (linearLayout3.getMeasuredWidth() == navigationBar3.A02) {
                        return;
                    }
                    NavigationBar.A01(navigationBar3);
                    navigationBar3.A02 = linearLayout3.getMeasuredWidth();
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 9:
                ProgressBar progressBar = (ProgressBar) this.A01;
                AbstractC166997dE.A1K(progressBar, this);
                Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                C14360o3.A0C(indeterminateDrawable, AbstractC111324zv.A00(28));
                Object findDrawableByLayerId = ((LayerDrawable) indeterminateDrawable).findDrawableByLayerId(R.id.layer_item_icon);
                if (!(findDrawableByLayerId instanceof Animatable) || (animatable = (Animatable) findDrawableByLayerId) == null) {
                    return;
                }
                animatable.start();
                return;
            case 10:
                WEV wev = (WEV) this.A01;
                View view5 = wev.A04;
                if (view5 == null) {
                    return;
                }
                int[] iArr = wev.A09;
                view5.getLocationOnScreen(iArr);
                int height3 = view5.getHeight();
                int i4 = iArr[1] + height3;
                int i5 = wev.A02;
                if (i5 == -1) {
                    wev.A02 = i4;
                    wev.A00 = i4;
                    wev.A01 = height3;
                    if (wev.A08.isEmpty()) {
                        return;
                    }
                    WEV.A02(wev, 0);
                    return;
                }
                if (wev.A00 != i4 && wev.A01 != height3) {
                    if (i5 < i4) {
                        wev.A02 = i4;
                        i5 = i4;
                    }
                    int max = Math.max(i5 - i4, 0);
                    if (!wev.A08.isEmpty()) {
                        WEV.A02(wev, max);
                    }
                }
                wev.A00 = i4;
                wev.A01 = height3;
                return;
            case 11:
                Handler handler = AbstractC70175WEx.A0D;
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r = (ViewOnKeyListenerC67976V4r) this.A01;
                viewOnKeyListenerC67976V4r.A0B = true;
                ViewOnKeyListenerC67976V4r.A00(viewOnKeyListenerC67976V4r);
                C006802i.A0p.markerEnd(373302739, viewOnKeyListenerC67976V4r.A0D, (short) 2);
                View view6 = viewOnKeyListenerC67976V4r.A01;
                view = view6;
                if (view6 == null) {
                    str = "recyclerView";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                viewTreeObserver = view.getViewTreeObserver();
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C67880V0l c67880V0l = (C67880V0l) this.A01;
                AbstractC166997dE.A1K(c67880V0l.A00, this);
                InputMethodManager inputMethodManager = (InputMethodManager) c67880V0l.getRootActivity().getSystemService("input_method");
                if (inputMethodManager == null) {
                    return;
                }
                inputMethodManager.showSoftInput(c67880V0l.A00, 0);
                return;
            case 14:
                W9B w9b = (W9B) this.A01;
                LinearLayout linearLayout4 = w9b.A04;
                linearLayout4.getClass();
                AbstractC166997dE.A1K(linearLayout4, this);
                Context context = w9b.A0I;
                float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top);
                w9b.A07 = new C124385ju(context, dimensionPixelSize, R.color.grey_2, 80);
                w9b.A08 = new C124385ju(context, dimensionPixelSize, R.color.red_5, 80);
                LinearLayout linearLayout5 = w9b.A04;
                linearLayout5.getClass();
                linearLayout5.setBackgroundDrawable(w9b.A07);
                return;
            default:
                W9B w9b2 = (W9B) this.A01;
                V00 v00 = w9b2.A0M;
                ScrollView scrollView = v00.A02;
                scrollView.getClass();
                scrollView.smoothScrollTo(0, v00.A02.getChildAt(0).getBottom());
                View view7 = w9b2.A06;
                view7.getClass();
                view = view7;
                viewTreeObserver = view.getViewTreeObserver();
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                return;
        }
    }
}
