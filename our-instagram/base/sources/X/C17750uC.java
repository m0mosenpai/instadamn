package X;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: X.0uC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17750uC extends AbstractC011204a {
    public static Constructor A02;
    public static Field A03;
    public static boolean A04;
    public static boolean A05;
    public WindowInsets A00;
    public C02I A01;

    @Override // X.AbstractC011204a
    public final void A05(C02I c02i) {
        this.A01 = c02i;
    }

    @Override // X.AbstractC011204a
    public final void A06(C02I c02i) {
        WindowInsets windowInsets = this.A00;
        if (windowInsets != null) {
            this.A00 = windowInsets.replaceSystemWindowInsets(c02i.A01, c02i.A03, c02i.A02, c02i.A00);
        }
    }

    public C17750uC() {
        WindowInsets windowInsets;
        WindowInsets windowInsets2;
        if (!A05) {
            try {
                A03 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            A05 = true;
        }
        Field field = A03;
        if (field != null) {
            try {
                windowInsets = (WindowInsets) field.get(null);
            } catch (ReflectiveOperationException unused2) {
            }
            if (windowInsets != null) {
                windowInsets2 = new WindowInsets(windowInsets);
                this.A00 = windowInsets2;
            }
        }
        if (!A04) {
            try {
                A02 = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            A04 = true;
        }
        Constructor constructor = A02;
        if (constructor != null) {
            try {
                windowInsets2 = (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
            this.A00 = windowInsets2;
        }
        windowInsets2 = null;
        this.A00 = windowInsets2;
    }

    @Override // X.AbstractC011204a
    public final C011504d A00() {
        A01();
        WindowInsets windowInsets = this.A00;
        C011504d c011504d = C011504d.A01;
        windowInsets.getClass();
        C011504d c011504d2 = new C011504d(windowInsets);
        C02I[] c02iArr = super.A00;
        C011304b c011304b = c011504d2.A00;
        c011304b.A0F(c02iArr);
        c011304b.A0D(this.A01);
        return c011504d2;
    }
}
