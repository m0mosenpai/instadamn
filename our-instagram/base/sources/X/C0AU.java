package X;

import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0AU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AU implements C0KF {
    public long A00 = -1;
    public long A01 = -1;
    public boolean A02 = false;
    public boolean A03;
    public final Choreographer A04;
    public final C0KE A05;
    public final Runnable A06;
    public final Method A07;
    public final Method A08;
    public final Method A09;

    @Override // X.C0KF
    public final void APM() {
        this.A02 = false;
        Runnable runnable = this.A06;
        Method method = this.A09;
        if (method != null) {
            try {
                method.invoke(this.A04, 0, runnable, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                A00(this, e);
            }
        }
    }

    @Override // X.C0KF
    public final void ARQ() {
        if (!this.A02) {
            this.A00 = -1L;
        }
        this.A02 = true;
        A01(this, this.A06);
    }

    public static void A01(C0AU c0au, Runnable runnable) {
        if (!c0au.A03) {
            try {
                Method method = c0au.A08;
                if (method != null) {
                    method.invoke(c0au.A04, 0, runnable, null);
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                A00(c0au, e);
            }
        }
    }

    public C0AU(Choreographer choreographer, C0KE c0ke) {
        Method method;
        Method method2;
        Method method3;
        this.A05 = c0ke;
        this.A04 = choreographer;
        try {
            method = Choreographer.class.getDeclaredMethod("postCallback", Integer.TYPE, Runnable.class, Object.class);
        } catch (NoSuchMethodException e) {
            A00(this, e);
            method = null;
        }
        this.A08 = method;
        try {
            method2 = Choreographer.class.getDeclaredMethod("removeCallbacks", Integer.TYPE, Runnable.class, Object.class);
        } catch (NoSuchMethodException e2) {
            A00(this, e2);
            method2 = null;
        }
        this.A09 = method2;
        try {
            method3 = Choreographer.class.getDeclaredMethod("getFrameTimeNanos", new Class[0]);
        } catch (NoSuchMethodException e3) {
            A00(this, e3);
            method3 = null;
        }
        this.A07 = method3;
        this.A06 = new Runnable() { // from class: X.0KG
            @Override // java.lang.Runnable
            public final void run() {
                C0AU c0au = C0AU.this;
                Method method4 = c0au.A07;
                long j = 0;
                if (method4 != null) {
                    try {
                        j = ((Number) method4.invoke(c0au.A04, new Object[0])).longValue();
                    } catch (IllegalAccessException | InvocationTargetException e4) {
                        C0AU.A00(c0au, e4);
                    }
                }
                if (c0au.A00 == -1) {
                    c0au.A00 = j;
                    c0au.A01 = j;
                } else {
                    long j2 = j - c0au.A01;
                    c0au.A01 = j;
                    c0au.A05.DIN(j2);
                }
                C0AU.A01(c0au, c0au.A06);
            }
        };
    }

    public static void A00(C0AU c0au, Exception exc) {
        android.util.Log.e(c0au.getClass().getSimpleName(), "Choreographer reflection failed.", exc);
        c0au.A03 = true;
    }
}
