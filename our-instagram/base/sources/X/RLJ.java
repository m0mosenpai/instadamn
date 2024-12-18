package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class RLJ extends AbstractC64248T5x {
    public static final Map zzb = AbstractC58318PtA.A14();
    public int zzd = -1;
    public C63300Sh4 zzc = C63300Sh4.A04;

    public final Object A02(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return RLP.zzb;
                    }
                    return new RLI(RLP.zzb);
                }
                return new RLP();
            }
            return new C64244T5t(RLP.zzb, new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return SYV.A02.A00(cls).FGZ(this, obj);
    }

    public final int hashCode() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return SYV.A02.A00(getClass()).FFX(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int FFX = SYV.A02.A00(getClass()).FFX(this);
        this.zza = FFX;
        return FFX;
    }

    public static Object A00(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw AbstractC58318PtA.A0e("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    throw AbstractC58318PtA.A0e("Unexpected exception thrown by generated accessor method.", cause);
                }
                throw cause;
            }
            throw cause;
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC63096Scw.A00;
        StringBuilder A0u = AbstractC58323PtF.A0u(obj);
        AbstractC63096Scw.A00(this, A0u, 0);
        return A0u.toString();
    }
}
