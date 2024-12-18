package X;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: X.0MS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0MS {
    public static Class A05;
    public static Method A06;
    public static boolean A07;
    public static boolean A08;
    public static final Method A09;
    public static final Method A0A;
    public static final Method A0B;
    public static final Method A0C;
    public static final Method A0D;
    public static final Method A0E;
    public static final boolean A0F;
    public static final boolean A0G;
    public static final boolean A0H;
    public static final Method A0I;
    public static final Map A0J;
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final List A04;

    public static Method A02(Class cls, String str, Class... clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            return declaredMethod;
        } catch (Exception unused) {
            String.format("Could not get %s.%s (%s)", cls, str, Arrays.toString(clsArr));
            return null;
        }
    }

    public static String A01(Class cls) {
        String str;
        String A00;
        if (cls != null) {
            if (Void.TYPE.equals(cls)) {
                return "V";
            }
            if (cls.isArray()) {
                cls = cls.getComponentType();
                str = "[";
                if (cls == null) {
                    throw new IllegalStateException();
                }
            } else {
                str = "";
            }
            if (!cls.isPrimitive() || (A00 = (String) A0J.get(cls)) == null) {
                A00 = A00(cls);
            }
            return AnonymousClass001.A0R(str, A00);
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MS.A03():boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(1:3)|4|5|6|7|8|(3:10|11|12)|13|14|15|16|(1:31)|19|(1:21)(1:30)|22|(1:24)|(1:26)|27|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        android.util.Log.w("ApiBlockListExemption", X.AnonymousClass001.A0R("Could not get Class.forName with CL. Msg: ", r0.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0116  */
    static {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MS.<clinit>():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (X.C0MS.A0G != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0MS(int r5, boolean r6) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.A02 = r0
            boolean r0 = X.C0MS.A0F
            if (r0 != 0) goto Lf
            boolean r1 = X.C0MS.A0G
            r0 = 0
            if (r1 == 0) goto L10
        Lf:
            r0 = 1
        L10:
            r4.A01 = r0
            boolean r0 = X.C0MS.A0G
            r4.A00 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.A04 = r0
            r4.A03 = r5
            r4.A02 = r6
            java.lang.Class r0 = r4.getClass()
            java.lang.String r3 = r0.getName()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r6 == 0) goto L41
            java.lang.String r0 = ""
        L37:
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r1, r0}
            java.lang.String r0 = "Creating %s for target sdk version %d [OS: %d] we will%s try to enable hidden api access if needed."
            java.lang.String.format(r0, r1)
            return
        L41:
            java.lang.String r0 = " NOT"
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MS.<init>(int, boolean):void");
    }

    public static String A00(Class cls) {
        String name;
        String str;
        Class<?> enclosingClass = cls.getEnclosingClass();
        if (enclosingClass != null) {
            name = enclosingClass.getName();
            str = cls.getSimpleName();
        } else {
            name = cls.getName();
            str = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('L');
        sb.append(name.replace('.', '/'));
        if (str != null) {
            sb.append('$');
            sb.append(str);
        }
        sb.append(';');
        return sb.toString();
    }

    public final boolean A04(String... strArr) {
        boolean A03 = A03();
        String arrays = Arrays.toString(strArr);
        if (!A03) {
            String.format("Cannot exempt these hiddden apis: %s", arrays);
            return false;
        }
        String.format("Exemption of %s is not supported", arrays);
        return false;
    }
}
