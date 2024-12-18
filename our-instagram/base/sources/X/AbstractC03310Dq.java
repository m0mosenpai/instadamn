package X;

import android.os.Binder;
import android.os.Build;
import com.facebook.common.binderhooker.BinderHook;
import com.facebook.common.binderhooker.NativeBinderHooker;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0Dq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03310Dq {
    public static final C03720In A00 = new C03720In("BinderHooker");
    public static final boolean A01 = AbstractC03320Dr.A00;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (r3 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A01(java.lang.Class r5, java.util.Set r6) {
        /*
            r4 = 0
            if (r5 == 0) goto L3c
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L3c
            java.lang.Class<android.os.IInterface> r0 = android.os.IInterface.class
            boolean r1 = r0.equals(r5)
            r0 = 1
            if (r1 == 0) goto L15
            return r0
        L15:
            java.lang.Class r0 = r5.getSuperclass()
            boolean r3 = A01(r0, r6)
            java.lang.Class[] r2 = r5.getInterfaces()
            r1 = 0
        L22:
            int r0 = r2.length
            if (r1 >= r0) goto L31
            if (r3 != 0) goto L33
            r0 = r2[r1]
            boolean r0 = A01(r0, r6)
            r3 = r3 | r0
            int r1 = r1 + 1
            goto L22
        L31:
            if (r3 == 0) goto L3c
        L33:
            boolean r0 = r5.isInterface()
            if (r0 == 0) goto L3c
            r6.add(r5)
        L3c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC03310Dq.A01(java.lang.Class, java.util.Set):boolean");
    }

    public static C03300Dp A00(Binder binder, BinderHook binderHook) {
        boolean z;
        if (binderHook != null) {
            if (!A01) {
                A00.A08("Cannot hook a binder since Android %d is not currently supported", Integer.valueOf(Build.VERSION.SDK_INT));
                return null;
            }
            Class<?> cls = binder.getClass();
            Class<?> cls2 = binderHook.getClass();
            HashSet hashSet = new HashSet();
            A01(cls, hashSet);
            hashSet.toString();
            HashSet hashSet2 = new HashSet();
            A01(cls2, hashSet2);
            hashSet2.toString();
            HashSet hashSet3 = new HashSet(hashSet.size());
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!hashSet2.contains(next)) {
                    hashSet3.add(next);
                }
            }
            if (hashSet3.size() > 0) {
                z = true;
                hashSet3.size();
                hashSet3.toString();
            } else {
                z = false;
                hashSet.toString();
            }
            int A03 = C0f9.A03(1589894280);
            binderHook.mShouldTransparentlyConvert = z;
            C0f9.A0A(-944215316, A03);
            if (!NativeBinderHooker.PLATFORM_SUPPORTED) {
                return null;
            }
            long nativeHookBinder = NativeBinderHooker.nativeHookBinder(binder, binderHook);
            if (nativeHookBinder == 0) {
                return null;
            }
            return new C03300Dp(nativeHookBinder);
        }
        throw new IllegalArgumentException("neither binder nor binder hook can be null");
    }
}
