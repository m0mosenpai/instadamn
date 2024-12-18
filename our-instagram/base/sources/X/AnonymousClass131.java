package X;

/* renamed from: X.131, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass131 {
    public static final AnonymousClass137 A00;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a0, code lost:
    
        if (r1.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a7, code lost:
    
        r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ae, code lost:
    
        if (r1.hasNext() != false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.android.AndroidDispatcherFactory] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            r1 = 1
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> Le
            if (r0 == 0) goto Le
            boolean r1 = java.lang.Boolean.parseBoolean(r0)
        Le:
            r2 = 0
            if (r1 == 0) goto L78
            java.lang.Class<kotlinx.coroutines.android.AndroidDispatcherFactory> r5 = kotlinx.coroutines.android.AndroidDispatcherFactory.class
            boolean r0 = X.AnonymousClass133.A00     // Catch: java.lang.Throwable -> Lc6
            if (r0 != 0) goto L20
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch: java.lang.Throwable -> Lc6
            java.util.List r3 = X.AbstractC62827SSz.A01(r0)     // Catch: java.lang.Throwable -> Lc6
            goto L8e
        L20:
            r0 = 2
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6f
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = "kotlinx.coroutines.android.AndroidDispatcherFactory"
            r4 = 0
            r7 = 1
            r6 = 0
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L4b java.lang.Throwable -> L6f
            java.lang.Class r1 = java.lang.Class.forName(r1, r7, r0)     // Catch: java.lang.ClassNotFoundException -> L4b java.lang.Throwable -> L6f
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch: java.lang.ClassNotFoundException -> L4b java.lang.Throwable -> L6f
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch: java.lang.ClassNotFoundException -> L4b java.lang.Throwable -> L6f
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch: java.lang.ClassNotFoundException -> L4b java.lang.Throwable -> L6f
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.ClassNotFoundException -> L4b java.lang.Throwable -> L6f
            java.lang.Object r0 = r5.cast(r0)     // Catch: java.lang.ClassNotFoundException -> L4b java.lang.Throwable -> L6f
            kotlinx.coroutines.android.AndroidDispatcherFactory r0 = (kotlinx.coroutines.android.AndroidDispatcherFactory) r0     // Catch: java.lang.ClassNotFoundException -> L4b java.lang.Throwable -> L6f
            if (r0 == 0) goto L4b
            r3.add(r0)     // Catch: java.lang.Throwable -> L6f
        L4b:
            java.lang.String r1 = "kotlinx.coroutines.test.internal.TestMainDispatcherFactory"
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.Throwable -> L6f
            java.lang.Class r1 = java.lang.Class.forName(r1, r7, r0)     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.Throwable -> L6f
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.Throwable -> L6f
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.Throwable -> L6f
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.Throwable -> L6f
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.Throwable -> L6f
            java.lang.Object r0 = r5.cast(r0)     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.Throwable -> L6f
            kotlinx.coroutines.android.AndroidDispatcherFactory r0 = (kotlinx.coroutines.android.AndroidDispatcherFactory) r0     // Catch: java.lang.ClassNotFoundException -> L69 java.lang.Throwable -> L6f
            r4 = r0
        L69:
            if (r4 == 0) goto L8e
            r3.add(r4)     // Catch: java.lang.Throwable -> L6f
            goto L8e
        L6f:
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch: java.lang.Throwable -> Lc6
            java.util.List r3 = X.AbstractC62827SSz.A01(r0)     // Catch: java.lang.Throwable -> Lc6
            goto L8e
        L78:
            java.lang.Class<kotlinx.coroutines.android.AndroidDispatcherFactory> r1 = kotlinx.coroutines.android.AndroidDispatcherFactory.class
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch: java.lang.Throwable -> Lc6
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r1, r0)     // Catch: java.lang.Throwable -> Lc6
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lc6
            X.2Z2 r0 = X.AbstractC224717j.A0A(r0)     // Catch: java.lang.Throwable -> Lc6
            java.util.List r3 = X.AbstractC224517h.A02(r0)     // Catch: java.lang.Throwable -> Lc6
        L8e:
            java.util.Iterator r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto La2
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc6
            if (r0 != 0) goto La7
        La2:
            kotlinx.coroutines.android.AndroidDispatcherFactory r2 = (kotlinx.coroutines.android.AndroidDispatcherFactory) r2     // Catch: java.lang.Throwable -> Lc6
            if (r2 == 0) goto Lbf
            goto Lb1
        La7:
            r1.next()     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc6
            if (r0 != 0) goto La7
            goto La2
        Lb1:
            X.137 r2 = r2.createDispatcher(r3)     // Catch: java.lang.Throwable -> Lb6
            goto Lcd
        Lb6:
            r1 = move-exception
            java.lang.String r0 = "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used"
            X.Pk7 r2 = new X.Pk7     // Catch: java.lang.Throwable -> Lc6
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> Lc6
            goto Lcd
        Lbf:
            r0 = 0
            X.Pk7 r2 = new X.Pk7     // Catch: java.lang.Throwable -> Lc6
            r2.<init>(r0, r0)     // Catch: java.lang.Throwable -> Lc6
            goto Lcd
        Lc6:
            r1 = move-exception
            r0 = 0
            X.Pk7 r2 = new X.Pk7
            r2.<init>(r1, r0)
        Lcd:
            X.AnonymousClass131.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass131.<clinit>():void");
    }
}
