package com.facebook.browser.lite.views;

import X.AbstractC166997dE;
import X.AbstractC56402iY;
import X.AbstractC58317Pt9;
import X.C44290Jhg;
import X.C55942hf;
import X.C55952hg;
import X.C55982hj;
import X.C668630d;
import X.InterfaceC172717mh;
import X.InterfaceC172727mi;
import X.InterfaceC65594Tnc;
import X.QF6;
import X.SUV;
import X.Ut2;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.webview.SystemWebView;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public class BrowserLiteWrapperView extends FrameLayout {
    public int A00;
    public int A01;
    public ArgbEvaluator A02;
    public View A03;
    public View A04;
    public InterfaceC172717mh A05;
    public InterfaceC65594Tnc A06;
    public C55982hj A07;
    public boolean A08;
    public int A09;
    public InterfaceC172727mi A0A;
    public final C668630d A0B;
    public static final C55942hf A0D = C55942hf.A04(30.0d, 7.0d);
    public static final C55942hf A0C = C55942hf.A04(50.0d, 5.0d);

    private void A00() {
        int i;
        FragmentActivity activity = this.A05.getActivity();
        Pattern pattern = SUV.A01;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.A09 = displayMetrics.heightPixels;
        if (!this.A05.getIntent().getBooleanExtra(AbstractC58317Pt9.A00(781), false)) {
            int i2 = this.A09;
            FragmentActivity activity2 = this.A05.getActivity();
            int identifier = activity2.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = AbstractC166997dE.A04(activity2, identifier);
            } else {
                i = 0;
            }
            this.A09 = i2 - i;
        }
        ViewGroup.LayoutParams layoutParams = this.A03.getLayoutParams();
        layoutParams.height = -1;
        this.A03.setLayoutParams(layoutParams);
    }

    private void setStatusBarColor(int i) {
        AbstractC56402iY.A02(this.A05.getActivity(), i);
    }

    private void setupBackgroundProtectionAlpha(float f) {
        this.A03.setAlpha(f);
    }

    public final void A04(InterfaceC172717mh interfaceC172717mh, InterfaceC65594Tnc interfaceC65594Tnc, InterfaceC172727mi interfaceC172727mi) {
        this.A0A = interfaceC172727mi;
        this.A04 = findViewById(R.id.browser_container);
        this.A05 = interfaceC172717mh;
        this.A06 = interfaceC65594Tnc;
        this.A02 = new ArgbEvaluator();
        this.A01 = this.A05.getActivity().getColor(R.color.fds_transparent);
        this.A00 = AbstractC56402iY.A00(this.A05.getActivity());
        this.A03 = findViewById(R.id.browser_background_protection);
        A00();
        setupBackgroundProtectionAlpha(0.0f);
        C55982hj A02 = C55952hg.A00().A02();
        A02.A09(A0D);
        A02.A06 = true;
        A02.A0A(this.A0B);
        this.A07 = A02;
    }

    public final void A05(Runnable runnable, double d, float f, boolean z) {
        if (!this.A08) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > getHeight()) {
                f = getHeight();
            }
            C55982hj c55982hj = this.A07;
            if (!z) {
                c55982hj.A08(f, true);
            } else {
                c55982hj.A07(d);
                this.A07.A06(f);
            }
            setStatusBarColor(((Number) this.A02.evaluate(f / getHeight(), Integer.valueOf(this.A00), Integer.valueOf(this.A01))).intValue());
            if (runnable != null) {
                this.A07.A0A(new C44290Jhg(0, runnable, this));
            }
        }
    }

    public int getChromeContainerHeight() {
        return this.A06.getHeightPx();
    }

    public int[] getChromeContainerLocationInWindow() {
        View view = ((BrowserLiteFragment) this.A05).A0A;
        if (view == null) {
            return null;
        }
        Pattern pattern = SUV.A01;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr;
    }

    public int getUsableScreenHeight() {
        return this.A09;
    }

    public int getWebViewScrollY() {
        QF6 C9a = this.A0A.C9a();
        if (C9a == null) {
            return -1;
        }
        return ((SystemWebView) C9a).A04.getScrollY();
    }

    public void setWebViewScrollY(int i) {
        QF6 C9a = this.A0A.C9a();
        if (C9a != null) {
            ((SystemWebView) C9a).A04.setScrollY(i);
        }
    }

    public BrowserLiteWrapperView(Context context) {
        super(context);
        this.A0B = new Ut2(this, 2);
    }

    public final void A01() {
        A00();
        this.A08 = false;
        setStatusBarColor(this.A00);
        this.A07.A04();
    }

    public final void A02() {
        A00();
        setupBackgroundProtectionAlpha(0.7f);
    }

    public final void A03() {
        A00();
        setupBackgroundProtectionAlpha(0.7f);
    }

    public BrowserLiteWrapperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0B = new Ut2(this, 2);
    }
}
