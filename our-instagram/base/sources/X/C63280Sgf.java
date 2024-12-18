package X;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.JavaModuleWrapper;
import java.lang.reflect.Method;

/* renamed from: X.Sgf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63280Sgf {
    public int A00;
    public String A01;
    public String A02;
    public boolean A03 = false;
    public AbstractC62632SJp[] A04;
    public Object[] A05;
    public final JavaModuleWrapper A06;
    public final Method A07;
    public final Class[] A08;
    public static final AbstractC62632SJp A0A = new R3F(1);
    public static final AbstractC62632SJp A0C = new R3F(2);
    public static final AbstractC62632SJp A0E = new R3F(3);
    public static final AbstractC62632SJp A0F = new R3F(4);
    public static final AbstractC62632SJp A0I = new R3F(5);
    public static final AbstractC62632SJp A09 = new R3F(6);
    public static final AbstractC62632SJp A0D = new R3F(7);
    public static final AbstractC62632SJp A0G = new R3F(8);
    public static final AbstractC62632SJp A0B = new R3F(9);
    public static final AbstractC62632SJp A0H = new R3F(0);

    public static char A00(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return 'Z';
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        if (cls != String.class) {
            return (char) 0;
        }
        return 'S';
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C63280Sgf r9) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63280Sgf.A01(X.Sgf):void");
    }

    public C63280Sgf(JavaModuleWrapper javaModuleWrapper, Method method, boolean z) {
        String str;
        this.A02 = BaseJavaModule.METHOD_TYPE_ASYNC;
        this.A06 = javaModuleWrapper;
        this.A07 = method;
        method.setAccessible(true);
        Class<?>[] parameterTypes = method.getParameterTypes();
        this.A08 = parameterTypes;
        int length = parameterTypes.length;
        if (z) {
            str = BaseJavaModule.METHOD_TYPE_SYNC;
        } else if (length <= 0 || parameterTypes[length - 1] != InterfaceC65622ToD.class) {
            return;
        } else {
            str = BaseJavaModule.METHOD_TYPE_PROMISE;
        }
        this.A02 = str;
    }
}
