package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.R;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class Q4V extends ViewGroup implements InterfaceC65542TmH {
    public Dialog A00;
    public DialogInterface.OnShowListener A01;
    public InterfaceC65230TgM A02;
    public boolean A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final R6X A08;

    @Override // android.view.ViewGroup, android.view.View
    public final void addChildrenForAccessibility(ArrayList arrayList) {
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        C14360o3.A0B(viewStructure, 0);
        this.A08.dispatchProvideStructure(viewStructure);
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostPause() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    private final void A00() {
        ViewOnApplyWindowInsetsListenerC63495SoA viewOnApplyWindowInsetsListenerC63495SoA;
        Dialog dialog = this.A00;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                Activity currentActivity = getCurrentActivity();
                if (currentActivity != null && !currentActivity.isFinishing() && !currentActivity.isDestroyed()) {
                    try {
                        Window window2 = currentActivity.getWindow();
                        if (window2 != null) {
                            if ((window2.getAttributes().flags & 1024) != 0) {
                                window.addFlags(1024);
                            } else {
                                window.clearFlags(1024);
                            }
                        }
                        boolean z = this.A07;
                        View decorView = window.getDecorView();
                        if (z) {
                            viewOnApplyWindowInsetsListenerC63495SoA = ViewOnApplyWindowInsetsListenerC63495SoA.A00;
                        } else {
                            viewOnApplyWindowInsetsListenerC63495SoA = null;
                        }
                        decorView.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC63495SoA);
                        window.getDecorView().requestApplyInsets();
                        if (this.A03) {
                            window.clearFlags(2);
                            return;
                        } else {
                            window.setDimAmount(0.5f);
                            window.setFlags(2, 2);
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        C0I2.A08("ReactNative", "ReactModalHostView: error while setting window flags: ", AbstractC58319PtB.A1Z(e));
                        return;
                    }
                }
                return;
            }
            throw AbstractC166987dD.A14("dialog must have window when we call updateProperties");
        }
        throw AbstractC166987dD.A14("dialog must exist when we call updateProperties");
    }

    public static final void A01(Q4V q4v) {
        ViewGroup viewGroup;
        Context context;
        Dialog dialog = q4v.A00;
        if (dialog != null) {
            if (dialog.isShowing()) {
                Context context2 = dialog.getContext();
                while (true) {
                    Context context3 = context2;
                    if (!Activity.class.isInstance(context2)) {
                        context = null;
                        if (!(context2 instanceof ContextWrapper) || context3 == (context2 = ((ContextWrapper) context2).getBaseContext())) {
                            break;
                        }
                    } else {
                        context = context2;
                        break;
                    }
                }
                Activity activity = (Activity) context;
                if (activity == null || !activity.isFinishing()) {
                    dialog.dismiss();
                }
            }
            q4v.A00 = null;
            q4v.A05 = true;
            ViewParent parent = q4v.A08.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.removeViewAt(0);
            }
        }
    }

    public final void A02() {
        int i;
        Context context;
        Window window;
        if (this.A05) {
            A01(this);
            this.A05 = false;
            String str = this.A04;
            if (C14360o3.A0K(str, "fade")) {
                i = R.style.Theme_FullScreenDialogAnimatedFade;
            } else {
                boolean A0K = C14360o3.A0K(str, "slide");
                i = R.style.Theme_FullScreenDialog;
                if (A0K) {
                    i = R.style.Theme_FullScreenDialogAnimatedSlide;
                }
            }
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                context = currentActivity;
            } else {
                context = getContext();
            }
            Dialog dialog = new Dialog(context, i);
            this.A00 = dialog;
            Window window2 = dialog.getWindow();
            window2.getClass();
            window2.setFlags(8, 8);
            dialog.setContentView(getContentView());
            A00();
            dialog.setOnShowListener(this.A01);
            dialog.setOnKeyListener(new DialogInterfaceOnKeyListenerC63430Sk9(this, 0));
            Window window3 = dialog.getWindow();
            if (window3 != null) {
                window3.setSoftInputMode(16);
            }
            if (this.A06 && (window = dialog.getWindow()) != null) {
                window.addFlags(16777216);
            }
            if (currentActivity != null && !currentActivity.isFinishing()) {
                C0fJ.A00(dialog);
                Activity currentActivity2 = getCurrentActivity();
                if (currentActivity2 != null) {
                    Dialog dialog2 = this.A00;
                    if (dialog2 != null) {
                        Window window4 = dialog2.getWindow();
                        if (window4 != null) {
                            Window window5 = currentActivity2.getWindow();
                            if (Build.VERSION.SDK_INT > 30) {
                                WindowInsetsController insetsController = window5.getInsetsController();
                                if (insetsController != null) {
                                    int systemBarsAppearance = insetsController.getSystemBarsAppearance() & 8;
                                    WindowInsetsController insetsController2 = window4.getInsetsController();
                                    if (insetsController2 != null) {
                                        insetsController2.setSystemBarsAppearance(systemBarsAppearance, 8);
                                    }
                                } else {
                                    throw AbstractC166997dE.A0g();
                                }
                            } else {
                                window4.getDecorView().setSystemUiVisibility(window5.getDecorView().getSystemUiVisibility());
                            }
                        } else {
                            throw AbstractC166987dD.A14("dialog must have window when we call updateProperties");
                        }
                    } else {
                        throw AbstractC166987dD.A14("dialog must exist when we call updateProperties");
                    }
                }
                Window window6 = dialog.getWindow();
                if (window6 != null) {
                    window6.clearFlags(8);
                    return;
                }
                return;
            }
            return;
        }
        A00();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        this.A08.addView(view, i);
    }

    public final String getAnimationType() {
        return this.A04;
    }

    @Override // android.view.ViewGroup
    public final View getChildAt(int i) {
        return this.A08.getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.A08.getChildCount();
    }

    public final Dialog getDialog() {
        return this.A00;
    }

    public final X9J getEventDispatcher() {
        return this.A08.A03;
    }

    public final boolean getHardwareAccelerated() {
        return this.A06;
    }

    public final InterfaceC65230TgM getOnRequestCloseListener() {
        return this.A02;
    }

    public final DialogInterface.OnShowListener getOnShowListener() {
        return this.A01;
    }

    public final InterfaceC65225TgH getStateWrapper() {
        return null;
    }

    public final boolean getStatusBarTranslucent() {
        return this.A07;
    }

    public final boolean getTransparent() {
        return this.A03;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view != null) {
            this.A08.removeView(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        R6X r6x = this.A08;
        r6x.removeView(r6x.getChildAt(i));
    }

    public final void setAnimationType(String str) {
        this.A04 = str;
        this.A05 = true;
    }

    public final void setEventDispatcher(X9J x9j) {
        this.A08.A03 = x9j;
    }

    public final void setHardwareAccelerated(boolean z) {
        this.A06 = z;
        this.A05 = true;
    }

    public final void setStateWrapper(InterfaceC65225TgH interfaceC65225TgH) {
        this.A08.A02 = interfaceC65225TgH;
    }

    public final void setStatusBarTranslucent(boolean z) {
        this.A07 = z;
        this.A05 = true;
    }

    public Q4V(R3N r3n) {
        super(r3n);
        this.A08 = new R6X(r3n);
    }

    private final View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.A08);
        return frameLayout;
    }

    private final Activity getCurrentActivity() {
        Context context = getContext();
        C14360o3.A0C(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return ((Q21) context).A01();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(653204925);
        super.onAttachedToWindow();
        Context context = getContext();
        C14360o3.A0C(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((Q21) context).A0A(this);
        C0f9.A0D(1305026298, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-1638196554);
        super.onDetachedFromWindow();
        Context context = getContext();
        C14360o3.A0C(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((Q21) context).A0B(this);
        A01(this);
        C0f9.A0D(618305628, A06);
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostDestroy() {
        Context context = getContext();
        C14360o3.A0C(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((Q21) context).A0B(this);
        A01(this);
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostResume() {
        A02();
    }

    @Override // android.view.View
    public void setId(int i) {
        super.setId(i);
        this.A08.setId(i);
    }

    public final void setOnRequestCloseListener(InterfaceC65230TgM interfaceC65230TgM) {
        this.A02 = interfaceC65230TgM;
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.A01 = onShowListener;
    }

    public final void setTransparent(boolean z) {
        this.A03 = z;
    }
}
