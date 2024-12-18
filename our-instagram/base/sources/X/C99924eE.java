package X;

import android.iawareperf.UniPerf;
import java.lang.reflect.Method;

/* renamed from: X.4eE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99924eE {
    public static C15M A02;
    public static C15N A03;
    public static C15N A04;
    public final UniPerf A00;
    public final Object A01;

    static {
        C15M c15m = new C15M("android.iawareperf.UniPerf");
        A02 = c15m;
        A03 = c15m.A02("getInstance", new Class[0]);
        A04 = A02.A02("uniPerfEvent", Integer.TYPE, String.class, int[].class);
    }

    public final int A00(int i, int... iArr) {
        UniPerf uniPerf = this.A00;
        if (uniPerf != null) {
            return uniPerf.uniPerfEvent(i, "", iArr);
        }
        return A04.A00(new Object[]{Integer.valueOf(i), "", iArr}, this.A01);
    }

    public C99924eE() {
        if (A02.A03) {
            this.A00 = UniPerf.getInstance();
            return;
        }
        Object[] objArr = new Object[0];
        Method method = A03.A00;
        Object obj = null;
        if (method != null) {
            try {
                obj = method.invoke(null, objArr);
            } catch (Exception unused) {
            }
        }
        this.A01 = obj;
    }
}
