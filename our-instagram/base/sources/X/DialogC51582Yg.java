package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.facebook.R;

/* renamed from: X.2Yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC51582Yg extends Dialog {
    public static C51562Ye A0L;
    public static final InterfaceC51602Yi A0M = new InterfaceC51602Yi() { // from class: X.2Yh
        @Override // X.InterfaceC51602Yi
        public final int BeY(View view, int i) {
            return 0;
        }
    };
    public static final InterfaceC51602Yi A0N = new InterfaceC51602Yi() { // from class: X.2Yj
        @Override // X.InterfaceC51602Yi
        public final int BeY(View view, int i) {
            View view2;
            if (view.getParent() instanceof View) {
                view2 = (View) view.getParent();
            } else {
                view2 = view;
            }
            return Math.min(view.getMeasuredHeight(), i - ((int) (Math.min(view2.getWidth(), view2.getHeight()) / 1.7777778f)));
        }
    };
    public float A00;
    public float A01;
    public int A02;
    public Context A03;
    public FrameLayout A04;
    public C68658VZr A05;
    public InterfaceC71885X8s A06;
    public InterfaceC51602Yi A07;
    public InterfaceC51602Yi A08;
    public C66242U5m A09;
    public Float A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public View A0I;
    public final Handler A0J;
    public final InterfaceC71941XBq A0K;

    @Override // android.app.Dialog
    public final void show() {
        InterfaceC51602Yi interfaceC51602Yi;
        AccessibilityManager accessibilityManager;
        this.A0F = false;
        C66242U5m c66242U5m = this.A09;
        c66242U5m.A05.A09();
        c66242U5m.A0A = true;
        super.show();
        Context context = this.A03;
        if ((!Boolean.getBoolean("is_accessibility_enabled") && (context == null || (accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility")) == null || !accessibilityManager.isTouchExplorationEnabled())) || (interfaceC51602Yi = this.A07) == null) {
            interfaceC51602Yi = this.A08;
        }
        c66242U5m.A02(interfaceC51602Yi, -1, this.A0G);
    }

    public static void A01(DialogC51582Yg dialogC51582Yg, float f) {
        float f2;
        ColorDrawable colorDrawable;
        Float f3 = dialogC51582Yg.A0A;
        if (f3 != null) {
            f2 = f3.floatValue();
        } else {
            f2 = f * dialogC51582Yg.A01;
        }
        Window window = dialogC51582Yg.getWindow();
        if (window != null) {
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            View childAt = viewGroup.getChildAt(0);
            View view = viewGroup;
            if (childAt != null) {
                view = childAt;
            }
            int A06 = AbstractC56842jH.A06(dialogC51582Yg.A02, (int) (Math.min(1.0f, Math.max(0.0f, f2)) * 255.0f));
            Drawable background = view.getBackground();
            if (background instanceof ColorDrawable) {
                colorDrawable = (ColorDrawable) background;
            } else {
                colorDrawable = new ColorDrawable();
                view.setBackground(colorDrawable);
            }
            colorDrawable.setColor(A06);
        }
    }

    public static InterfaceC51602Yi[] A02(InterfaceC51602Yi interfaceC51602Yi, InterfaceC51602Yi interfaceC51602Yi2) {
        InterfaceC51602Yi interfaceC51602Yi3 = A0M;
        if (interfaceC51602Yi == null) {
            if (interfaceC51602Yi2 == null) {
                return new InterfaceC51602Yi[]{interfaceC51602Yi3};
            }
            return new InterfaceC51602Yi[]{interfaceC51602Yi3, interfaceC51602Yi2};
        }
        if (interfaceC51602Yi2 == null) {
            return new InterfaceC51602Yi[]{interfaceC51602Yi3, interfaceC51602Yi};
        }
        return new InterfaceC51602Yi[]{interfaceC51602Yi3, interfaceC51602Yi, interfaceC51602Yi2};
    }

    public final void A04(float f) {
        if (this.A01 != f) {
            this.A01 = f;
            A01(this, this.A00);
        }
    }

    public final void A05(InterfaceC51602Yi interfaceC51602Yi) {
        this.A08 = interfaceC51602Yi;
        this.A09.A03(A02(interfaceC51602Yi, this.A07), isShowing());
    }

    public final void A06(Integer num) {
        InterfaceC71885X8s interfaceC71885X8s = this.A06;
        if (interfaceC71885X8s == null || interfaceC71885X8s.D1l(num)) {
            super.cancel();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        A06(C05F.A0Y);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (A0L != null) {
            C14360o3.A0B(motionEvent, 0);
            C1KM.A03(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.A0C) {
            A06(C05F.A01);
        }
    }

    public DialogC51582Yg(Context context) {
        super(context, R.style.Bloks_BottomSheetDialog);
        this.A0K = new C66244U5o(this);
        this.A08 = A0N;
        this.A07 = new InterfaceC51602Yi() { // from class: X.WTM
            @Override // X.InterfaceC51602Yi
            public final int BeY(View view, int i) {
                int measuredHeight;
                if (view == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = view.getMeasuredHeight();
                }
                return Math.min(measuredHeight, i);
            }
        };
        this.A0F = false;
        this.A0J = new Handler(Looper.getMainLooper());
        this.A0D = true;
        this.A0C = true;
        this.A0B = true;
        this.A0H = true;
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A0A = null;
        this.A02 = -16777216;
        this.A0G = false;
        this.A0E = false;
        Context context2 = getContext();
        this.A03 = context2;
        C66242U5m c66242U5m = new C66242U5m(context2);
        this.A09 = c66242U5m;
        c66242U5m.A0H.add(this.A0K);
        C66242U5m c66242U5m2 = this.A09;
        c66242U5m2.A00 = -1;
        c66242U5m2.A03(new InterfaceC51602Yi[]{A0M, this.A08, this.A07}, true);
        C66242U5m c66242U5m3 = this.A09;
        c66242U5m3.A03 = new VZs(this);
        c66242U5m3.A05.A09();
        FrameLayout frameLayout = new FrameLayout(this.A03);
        this.A04 = frameLayout;
        if (AbstractC61695RsC.A00(getContext())) {
            AbstractC008903d.A00(frameLayout, new C03L() { // from class: X.OlZ
                @Override // X.C03L
                public final C011504d Cx7(View view, C011504d c011504d) {
                    C02I A05 = c011504d.A00.A05(3);
                    if (view instanceof FrameLayout) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        marginLayoutParams.bottomMargin = A05.A00;
                        marginLayoutParams.topMargin = A05.A03;
                    }
                    return C011504d.A01;
                }
            });
        }
        this.A04.addView(this.A09);
        super.setContentView(this.A04);
        AbstractC010103p.A0B(this.A09, new UEN(this));
    }

    public static void A00(DialogC51582Yg dialogC51582Yg) {
        InputMethodManager inputMethodManager;
        Window window = dialogC51582Yg.getWindow();
        C66242U5m c66242U5m = dialogC51582Yg.A09;
        if (!c66242U5m.hasWindowFocus() || dialogC51582Yg.A0E) {
            dialogC51582Yg.A03();
        }
        if (window != null) {
            window.setFlags(8, 8);
        }
        dialogC51582Yg.A0F = true;
        if (!dialogC51582Yg.A0B) {
            dialogC51582Yg.A04(0.0f);
        }
        c66242U5m.A05.A09();
        c66242U5m.A02(A0M, -1, false);
        c66242U5m.setInteractable(false);
        View currentFocus = dialogC51582Yg.getCurrentFocus();
        if (currentFocus != null && (inputMethodManager = (InputMethodManager) currentFocus.getContext().getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public final void A03() {
        InputMethodManager inputMethodManager;
        View currentFocus = getCurrentFocus();
        if (currentFocus != null && (inputMethodManager = (InputMethodManager) currentFocus.getContext().getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0J;
        if (myLooper == handler.getLooper()) {
            A00(this);
        } else {
            handler.post(new Runnable() { // from class: X.WqQ
                @Override // java.lang.Runnable
                public final void run() {
                    DialogC51582Yg.A00(DialogC51582Yg.this);
                }
            });
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        this.A0C = z;
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.A0D = z;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        setContentView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.A09, false), null);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        View view2 = this.A0I;
        if (view2 != null) {
            this.A09.removeView(view2);
        }
        this.A0I = view;
        C66242U5m c66242U5m = this.A09;
        if (layoutParams == null) {
            c66242U5m.addView(view);
        } else {
            c66242U5m.addView(view, layoutParams);
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        setContentView(view, null);
    }
}
