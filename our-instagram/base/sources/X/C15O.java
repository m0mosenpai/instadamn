package X;

import android.os.DVFSHelper;
import java.lang.reflect.Method;

/* renamed from: X.15O, reason: invalid class name */
/* loaded from: classes.dex */
public final class C15O {
    public static C15N A00;
    public static C15M A01;
    public static C15N A02;

    static {
        C15M c15m = new C15M("android.os.DVFSHelper");
        A01 = c15m;
        Class cls = Boolean.TYPE;
        A02 = c15m.A02("onScrollEvent", cls);
        A00 = A01.A03("onSmoothScrollEvent", cls);
    }

    public static final void A00(boolean z) {
        if (A01.A03) {
            DVFSHelper.onScrollEvent(z);
            return;
        }
        C15N c15n = A02;
        Object[] objArr = {Boolean.valueOf(z)};
        Method method = c15n.A00;
        if (method == null) {
            return;
        }
        try {
            method.invoke(null, objArr);
        } catch (Exception unused) {
        }
    }

    public static final void A01(boolean z) {
        if (A01.A03) {
            DVFSHelper.onSmoothScrollEvent(z);
            return;
        }
        C15N c15n = A00;
        Object[] objArr = {Boolean.valueOf(z)};
        Method method = c15n.A00;
        if (method == null) {
            return;
        }
        try {
            method.invoke(null, objArr);
        } catch (Exception unused) {
        }
    }
}
