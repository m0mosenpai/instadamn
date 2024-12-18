package X;

import android.view.Choreographer;
import java.lang.reflect.Method;

/* loaded from: classes12.dex */
public final class XPJ {
    public long A00 = -1;
    public long A01 = -1;
    public boolean A02 = false;
    public boolean A03;
    public final Choreographer A04;
    public final Y0z A05;
    public final Runnable A06;
    public final Method A07;
    public final Method A08;
    public final Method A09;
    public final C0Gd A0A;

    public final void A01() {
        this.A02 = false;
        try {
            this.A09.invoke(this.A04, 0, this.A06, null);
        } catch (Exception e) {
            A00(this, e);
        }
    }

    public final void A02() {
        if (!this.A02) {
            this.A00 = -1L;
        }
        this.A02 = true;
        A03(this.A06);
    }

    public static void A00(XPJ xpj, Exception exc) {
        xpj.A0A.EmX(AbstractC31173DnH.A0q(xpj), "Choreographer reflection failed.", exc);
        xpj.A03 = true;
    }

    public final void A03(Runnable runnable) {
        if (!this.A03) {
            try {
                this.A08.invoke(this.A04, 0, runnable, null);
            } catch (Exception e) {
                A00(this, e);
            }
        }
    }

    public XPJ(Choreographer choreographer, C0Gd c0Gd, Y0z y0z) {
        Method method;
        Method method2;
        Method method3;
        this.A05 = y0z;
        this.A04 = choreographer;
        this.A0A = c0Gd;
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
            method3 = Choreographer.class.getDeclaredMethod("getFrameTime", new Class[0]);
        } catch (NoSuchMethodException e3) {
            A00(this, e3);
            method3 = null;
        }
        this.A07 = method3;
        this.A06 = new XPK(this);
    }
}
