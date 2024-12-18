package X;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: X.04h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C011904h {
    public final AbstractC011704f A00;

    public C011904h(View view, final Window window) {
        AbstractC011704f c0u4;
        final C03U c03u = new C03U(view);
        if (Build.VERSION.SDK_INT >= 30) {
            c0u4 = new AbstractC011704f(window, c03u, this) { // from class: X.0tm
                public Window A00;
                public final WindowInsetsController A01;
                public final C005001p A02;
                public final C03U A03;
                public final C011904h A04;

                @Override // X.AbstractC011704f
                public final int A00() {
                    return this.A01.getSystemBarsBehavior();
                }

                @Override // X.AbstractC011704f
                public final void A01(int i) {
                    if ((i & 8) != 0) {
                        this.A03.A00.A01();
                    }
                    this.A01.hide(i & (-9));
                }

                @Override // X.AbstractC011704f
                public final void A02(int i) {
                    this.A01.setSystemBarsBehavior(i);
                }

                @Override // X.AbstractC011704f
                public final void A03(int i) {
                    if ((i & 8) != 0) {
                        this.A03.A00.A02();
                    }
                    this.A01.show(i & (-9));
                }

                @Override // X.AbstractC011704f
                public final void A04(boolean z) {
                    Window window2 = this.A00;
                    if (z) {
                        if (window2 != null) {
                            View decorView = window2.getDecorView();
                            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                        }
                        this.A01.setSystemBarsAppearance(16, 16);
                        return;
                    }
                    if (window2 != null) {
                        View decorView2 = window2.getDecorView();
                        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
                    }
                    this.A01.setSystemBarsAppearance(0, 16);
                }

                @Override // X.AbstractC011704f
                public final void A05(boolean z) {
                    Window window2 = this.A00;
                    if (z) {
                        if (window2 != null) {
                            View decorView = window2.getDecorView();
                            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
                        }
                        this.A01.setSystemBarsAppearance(8, 8);
                        return;
                    }
                    if (window2 != null) {
                        View decorView2 = window2.getDecorView();
                        decorView2.setSystemUiVisibility((-8193) & decorView2.getSystemUiVisibility());
                    }
                    this.A01.setSystemBarsAppearance(0, 8);
                }

                @Override // X.AbstractC011704f
                public final boolean A06() {
                    WindowInsetsController windowInsetsController = this.A01;
                    windowInsetsController.setSystemBarsAppearance(0, 0);
                    if ((windowInsetsController.getSystemBarsAppearance() & 16) == 0) {
                        return false;
                    }
                    return true;
                }

                @Override // X.AbstractC011704f
                public final boolean A07() {
                    WindowInsetsController windowInsetsController = this.A01;
                    windowInsetsController.setSystemBarsAppearance(0, 0);
                    if ((windowInsetsController.getSystemBarsAppearance() & 8) == 0) {
                        return false;
                    }
                    return true;
                }

                {
                    WindowInsetsController insetsController = window.getInsetsController();
                    this.A02 = new C005001p(0);
                    this.A01 = insetsController;
                    this.A04 = this;
                    this.A03 = c03u;
                    this.A00 = window;
                }
            };
        } else {
            c0u4 = new C0u4(window, c03u);
        }
        this.A00 = c0u4;
    }
}
