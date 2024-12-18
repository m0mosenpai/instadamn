package X;

import android.content.Context;
import com.mediatek.perfservice.PerfServiceWrapper;
import java.lang.reflect.Constructor;

/* renamed from: X.49x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C919349x {
    public static C15M A02;
    public static C84203pC A03;
    public static C15N A04;
    public static C15N A05;
    public static C15N A06;
    public static C15N A07;
    public final PerfServiceWrapper A00;
    public final Object A01;

    static {
        C15M c15m = new C15M("com.mediatek.perfservice.PerfServiceWrapper");
        A02 = c15m;
        A03 = C15M.A00(c15m, new Class[]{Context.class}, false);
        C15M c15m2 = A02;
        Class cls = Integer.TYPE;
        A05 = c15m2.A02("userEnable", cls);
        A04 = A02.A02("userDisable", cls);
        A07 = A02.A02("userReg", cls, cls);
        A06 = A02.A03("userRegBigLittle", cls, cls, cls, cls);
    }

    public static boolean A00() {
        if (A06.A00 == null) {
            return false;
        }
        return true;
    }

    public static boolean A01() {
        return A02.A05(null);
    }

    public final int A02(int i, int i2) {
        PerfServiceWrapper perfServiceWrapper = this.A00;
        if (perfServiceWrapper != null) {
            return perfServiceWrapper.userReg(i, i2);
        }
        return A07.A00(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this.A01);
    }

    public final int A03(int i, int i2, int i3, int i4) {
        PerfServiceWrapper perfServiceWrapper = this.A00;
        if (perfServiceWrapper != null) {
            return perfServiceWrapper.userRegBigLittle(i, i2, i3, i4);
        }
        return A06.A00(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this.A01);
    }

    public final void A04(int i) {
        PerfServiceWrapper perfServiceWrapper = this.A00;
        if (perfServiceWrapper != null) {
            perfServiceWrapper.userDisable(i);
            return;
        }
        A04.A00(new Object[]{Integer.valueOf(i)}, this.A01);
    }

    public final void A05(int i) {
        PerfServiceWrapper perfServiceWrapper = this.A00;
        if (perfServiceWrapper != null) {
            perfServiceWrapper.userEnable(i);
            return;
        }
        A05.A00(new Object[]{Integer.valueOf(i)}, this.A01);
    }

    public C919349x() {
        if (A02.A03) {
            this.A00 = new PerfServiceWrapper((Context) null);
            return;
        }
        Object[] objArr = {null};
        Constructor constructor = A03.A00;
        Object obj = null;
        if (constructor != null) {
            try {
                obj = constructor.newInstance(objArr);
            } catch (Exception unused) {
            }
        }
        this.A01 = obj;
    }
}
