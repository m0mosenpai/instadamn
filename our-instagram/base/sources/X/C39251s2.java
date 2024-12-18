package X;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* renamed from: X.1s2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39251s2 {
    public static C39251s2 A09;
    public final Context A07;
    public final ArrayList A03 = new ArrayList();
    public final ArrayList A08 = new ArrayList();
    public final ArrayList A05 = new ArrayList();
    public final ArrayList A04 = new ArrayList();
    public final ArrayList A06 = new ArrayList();
    public final ArrayList A01 = new ArrayList();
    public final ArrayList A00 = new ArrayList();
    public final ArrayList A02 = new ArrayList();

    public static synchronized Object A01(C39251s2 c39251s2, String str, ArrayList arrayList) {
        Object obj;
        synchronized (c39251s2) {
            try {
                obj = c39251s2.A03(Class.forName(str), arrayList);
            } catch (ClassNotFoundException e) {
                C0K8.A0N("ContextConstructorHelper", "Cannot find class: %s", e, str);
                obj = null;
            }
        }
        return obj;
    }

    public static synchronized Object A02(C39251s2 c39251s2, String str, ArrayList arrayList) {
        Object obj;
        synchronized (c39251s2) {
            try {
                try {
                    try {
                        try {
                            try {
                                obj = c39251s2.A03(Class.forName(str), arrayList);
                            } catch (ClassNotFoundException e) {
                                C0K8.A0L("ContextConstructorHelper", "Cannot find class: %s", e, str);
                                obj = null;
                                return obj;
                            }
                        } catch (InstantiationException e2) {
                            C0K8.A0K("ContextConstructorHelper", "InstantiationException", e2);
                            obj = null;
                            return obj;
                        }
                    } catch (ClassCastException e3) {
                        C0K8.A0N("ContextConstructorHelper", "ClassCastException, existingInstances size: %d, className: %s", e3, Integer.valueOf(arrayList.size()), str);
                        obj = null;
                        return obj;
                    }
                } catch (IllegalAccessException e4) {
                    C0K8.A0K("ContextConstructorHelper", "IllegalAccessException", e4);
                    obj = null;
                    return obj;
                }
            } catch (NoSuchMethodException e5) {
                C0K8.A0K("ContextConstructorHelper", "NoSuchMethodException", e5);
                obj = null;
                return obj;
            } catch (InvocationTargetException e6) {
                C0K8.A0K("ContextConstructorHelper", "InvocationTargetException", e6);
                obj = null;
                return obj;
            }
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        r1 = r5.getConstructor(android.content.Context.class).newInstance(r4.A07);
        r6.add(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.lang.Object A03(java.lang.Class r5, java.util.ArrayList r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r3 = r6.size()     // Catch: java.lang.Throwable -> L32
            r2 = 0
        L6:
            if (r2 >= r3) goto L19
            java.lang.Object r1 = r6.get(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> L32
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L30
            int r2 = r2 + 1
            goto L6
        L19:
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r5.getConstructor(r0)     // Catch: java.lang.Throwable -> L32
            android.content.Context r0 = r4.A07     // Catch: java.lang.Throwable -> L32
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L32
            r6.add(r1)     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r4)
            return r1
        L32:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39251s2.A03(java.lang.Class, java.util.ArrayList):java.lang.Object");
    }

    public static synchronized C39251s2 A00(Context context) {
        C39251s2 c39251s2;
        synchronized (C39251s2.class) {
            c39251s2 = A09;
            if (c39251s2 == null) {
                c39251s2 = new C39251s2(context.getApplicationContext());
                A09 = c39251s2;
            }
        }
        return c39251s2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, X.1pG] */
    public final InterfaceC37781pG A04(String str) {
        InterfaceC37781pG interfaceC37781pG = (InterfaceC37781pG) A02(this, str, this.A08);
        if (interfaceC37781pG == null) {
            ?? obj = new Object();
            C0K8.A0E("ContextConstructorHelper", "Unable to create instance for HandlerThreadFactory");
            return obj;
        }
        return interfaceC37781pG;
    }

    public C39251s2(Context context) {
        this.A07 = context;
    }
}
