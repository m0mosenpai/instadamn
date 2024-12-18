package X;

import java.lang.reflect.Method;

/* renamed from: X.15N, reason: invalid class name */
/* loaded from: classes.dex */
public final class C15N {
    public Method A00;
    public final String A01;
    public final boolean A02;
    public final Class[] A03;
    public final /* synthetic */ C15M A04;

    public C15N(C15M c15m, String str, Class[] clsArr, boolean z) {
        this.A04 = c15m;
        this.A01 = str;
        this.A02 = z;
        this.A03 = clsArr;
    }

    public final int A00(Object[] objArr, Object obj) {
        Method method = this.A00;
        Object obj2 = null;
        if (method != null && obj != null) {
            try {
                obj2 = method.invoke(obj, objArr);
            } catch (Exception unused) {
            }
            if (obj2 != null) {
                try {
                    return ((Integer) Integer.class.cast(obj2)).intValue();
                } catch (Exception unused2) {
                    return -1;
                }
            }
            return -1;
        }
        return -1;
    }
}
