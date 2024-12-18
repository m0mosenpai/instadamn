package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.0u9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17720u9 extends C011304b {
    public static Class A05;
    public static Field A06;
    public static Field A07;
    public static Method A08;
    public static boolean A09;
    public C02I A00;
    public C011504d A01;
    public C02I A02;
    public C02I[] A03;
    public final WindowInsets A04;

    @Override // X.C011304b
    public C02I A05(int i) {
        C02I c02i = C02I.A04;
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                c02i = C02I.A02(c02i, A0J(i2, false));
            }
            i2 <<= 1;
        } while (i2 <= 256);
        return c02i;
    }

    @Override // X.C011304b
    public C02I A06(int i) {
        C02I c02i = C02I.A04;
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                c02i = C02I.A02(c02i, A0J(i2, true));
            }
            i2 <<= 1;
        } while (i2 <= 256);
        return c02i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0015, code lost:
    
        if (r2 != 128) goto L15;
     */
    @Override // X.C011304b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A0I(int r5) {
        /*
            r4 = this;
            r3 = 1
            r2 = 1
        L2:
            r0 = r5 & r2
            if (r0 == 0) goto L17
            r1 = 0
            if (r2 == r3) goto L1e
            r0 = 2
            if (r2 == r0) goto L1e
            r0 = 4
            if (r2 == r0) goto L2c
            r0 = 8
            if (r2 == r0) goto L1e
            r0 = 128(0x80, float:1.8E-43)
            if (r2 == r0) goto L1e
        L17:
            int r2 = r2 << 1
            r0 = 256(0x100, float:3.59E-43)
            if (r2 > r0) goto L2d
            goto L2
        L1e:
            X.02I r1 = r4.A0J(r2, r1)
            X.02I r0 = X.C02I.A04
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L17
        L2c:
            r3 = 0
        L2d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC17720u9.A0I(int):boolean");
    }

    public final C02I A0J(int i, boolean z) {
        C02I c02i;
        C02I c02i2;
        C02I c02i3;
        C02I c02i4;
        C02I c02i5;
        C007402o A072;
        if (i != 1) {
            C02I c02i6 = null;
            if (i != 2) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                if (i == 128) {
                                    C011504d c011504d = this.A01;
                                    if (c011504d != null) {
                                        A072 = c011504d.A00.A07();
                                    } else {
                                        A072 = A07();
                                    }
                                    if (A072 != null) {
                                        DisplayCutout displayCutout = A072.A00;
                                        return C02I.A00(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                                    }
                                }
                            } else {
                                return A04();
                            }
                        } else {
                            return A00();
                        }
                    } else {
                        return A02();
                    }
                } else {
                    C02I[] c02iArr = this.A03;
                    if (c02iArr != null && (c02i5 = c02iArr[3]) != null) {
                        return c02i5;
                    }
                    C02I A03 = A03();
                    C011504d c011504d2 = this.A01;
                    if (c011504d2 != null) {
                        c02i3 = c011504d2.A00.A01();
                    } else {
                        c02i3 = C02I.A04;
                    }
                    int i2 = A03.A00;
                    int i3 = c02i3.A00;
                    if (i2 > i3 || ((c02i4 = this.A00) != null && !c02i4.equals(C02I.A04) && (i2 = c02i4.A00) > i3)) {
                        return C02I.A00(0, 0, 0, i2);
                    }
                }
                return C02I.A04;
            }
            if (z) {
                C011504d c011504d3 = this.A01;
                if (c011504d3 != null) {
                    c02i2 = c011504d3.A00.A01();
                } else {
                    c02i2 = C02I.A04;
                }
                C02I A01 = A01();
                return C02I.A00(Math.max(c02i2.A01, A01.A01), 0, Math.max(c02i2.A02, A01.A02), Math.max(c02i2.A00, A01.A00));
            }
            C02I A032 = A03();
            C011504d c011504d4 = this.A01;
            if (c011504d4 != null) {
                c02i6 = c011504d4.A00.A01();
            }
            int i4 = A032.A00;
            if (c02i6 != null) {
                i4 = Math.min(i4, c02i6.A00);
            }
            return C02I.A00(A032.A01, 0, A032.A02, i4);
        }
        if (z) {
            C011504d c011504d5 = this.A01;
            if (c011504d5 != null) {
                c02i = c011504d5.A00.A01();
            } else {
                c02i = C02I.A04;
            }
            return C02I.A00(0, Math.max(c02i.A03, A03().A03), 0, 0);
        }
        return C02I.A00(0, A03().A03, 0, 0);
    }

    @Override // X.C011304b
    public final C02I A03() {
        C02I c02i = this.A02;
        if (c02i == null) {
            WindowInsets windowInsets = this.A04;
            C02I A00 = C02I.A00(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            this.A02 = A00;
            return A00;
        }
        return c02i;
    }

    @Override // X.C011304b
    public C011504d A0B(int i, int i2, int i3, int i4) {
        C04Z c04z = new C04Z(new C011504d(this.A04));
        C02I A00 = C011504d.A00(A03(), i, i2, i3, i4);
        AbstractC011204a abstractC011204a = c04z.A00;
        abstractC011204a.A06(A00);
        abstractC011204a.A05(C011504d.A00(A01(), i, i2, i3, i4));
        return abstractC011204a.A00();
    }

    @Override // X.C011304b
    public void A0C(View view) {
        C02I c02i;
        Object invoke;
        if (Build.VERSION.SDK_INT < 30) {
            if (!A09) {
                try {
                    A08 = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                    Class<?> cls = Class.forName("android.view.View$AttachInfo");
                    A05 = cls;
                    A07 = cls.getDeclaredField("mVisibleInsets");
                    A06 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                    A07.setAccessible(true);
                    A06.setAccessible(true);
                } catch (ReflectiveOperationException e) {
                    android.util.Log.e("WindowInsetsCompat", AnonymousClass001.A0R("Failed to get visible insets. (Reflection error). ", e.getMessage()), e);
                }
                A09 = true;
            }
            Method method = A08;
            if (method != null && A05 != null && A07 != null) {
                try {
                    invoke = method.invoke(view, new Object[0]);
                } catch (ReflectiveOperationException e2) {
                    android.util.Log.e("WindowInsetsCompat", AnonymousClass001.A0R("Failed to get visible insets. (Reflection error). ", e2.getMessage()), e2);
                }
                if (invoke == null) {
                    android.util.Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                } else {
                    Rect rect = (Rect) A07.get(A06.get(invoke));
                    if (rect != null) {
                        c02i = C02I.A00(rect.left, rect.top, rect.right, rect.bottom);
                        this.A00 = c02i;
                        return;
                    }
                }
            }
            c02i = C02I.A04;
            this.A00 = c02i;
            return;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @Override // X.C011304b
    public final void A0E(C011504d c011504d) {
        this.A01 = c011504d;
    }

    @Override // X.C011304b
    public final void A0F(C02I[] c02iArr) {
        this.A03 = c02iArr;
    }

    @Override // X.C011304b
    public final boolean A0H() {
        return this.A04.isRound();
    }

    public AbstractC17720u9(C011504d c011504d, WindowInsets windowInsets) {
        super(c011504d);
        this.A02 = null;
        this.A04 = windowInsets;
    }
}
