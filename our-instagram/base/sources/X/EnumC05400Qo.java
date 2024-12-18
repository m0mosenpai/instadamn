package X;

import android.util.SparseArray;
import com.facebook.common.mindeputils.IVerboseDebuggable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.0Qo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC05400Qo implements IVerboseDebuggable {
    UNDEFINED(null, 0, -1),
    PRE_ON_CREATE(null, 1, 0),
    ON_CREATE(null, 2, 1),
    ON_START(null, 3, 2),
    ON_RESUME("android.app.servertransaction.ResumeActivityItem", 4, 3),
    ON_PAUSE("android.app.servertransaction.PauseActivityItem", 5, 4),
    ON_STOP("android.app.servertransaction.StopActivityItem", 6, 5),
    ON_DESTROY("android.app.servertransaction.DestroyActivityItem", 7, 6),
    ON_RESTART(null, 8, 7);

    public static int A05 = -1;
    public static SparseArray A06;
    public static Class A07;
    public static boolean A08;
    public static EnumC05400Qo[] A09;
    public static final C03720In A0A = new C03720In("AospActivityLifecycleItemInfo");
    public int A00;
    public boolean A01 = false;
    public final int A02;
    public final String A03;
    public final String A04;

    public final int A00(C0H5 c0h5) {
        int i;
        Object A0L;
        if (this.A01) {
            return this.A00;
        }
        String str = this.A04;
        if (str != null) {
            if (!A08) {
                Class A0I = c0h5.A0I("android.app.servertransaction.ActivityLifecycleItem");
                A07 = A0I;
                if (A0I == null) {
                    A0A.A08("Could not find base activity lifecycle android.app.servertransaction.ActivityLifecycleItem", new Object[0]);
                }
                A08 = true;
            }
            Class cls = A07;
            if (cls != null) {
                try {
                    Field A052 = C0H5.A05(C0H3.A02, cls, null, str);
                    if (A052 != null) {
                        A052.setAccessible(true);
                    }
                    i = A052.getInt(null);
                } catch (Exception e) {
                    e.getMessage();
                }
                if (Integer.valueOf(i) != null) {
                    this.A00 = i;
                    this.A01 = true;
                    return i;
                }
            }
        }
        String str2 = this.A03;
        if (str2 != null) {
            try {
                A0L = c0h5.A0L(str2, new Object[0], "android.app.servertransaction.ActivityLifecycleItem");
            } catch (Exception e2) {
                e2.getMessage();
            }
            if (A0L != null) {
                Method A072 = C0H5.A07(C0H3.A02, A0L.getClass(), Integer.TYPE, "getTargetState", new Class[0]);
                if (A072 != null) {
                    A072.setAccessible(true);
                }
                Integer num = (Integer) A072.invoke(A0L, new Object[0]);
                if (num != null) {
                    i = num.intValue();
                    this.A00 = i;
                    this.A01 = true;
                    return i;
                }
            }
        }
        i = this.A02;
        this.A00 = i;
        this.A01 = true;
        return i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        String str;
        if (this.A01) {
            str = Integer.toString(this.A00);
        } else {
            str = "not yet inited";
        }
        return AnonymousClass001.A11("Lifecycle ", name(), "(", str, ")");
    }

    EnumC05400Qo(String str, int i, int i2) {
        this.A02 = i2;
        this.A04 = r3;
        this.A03 = str;
        this.A00 = i2;
    }
}
