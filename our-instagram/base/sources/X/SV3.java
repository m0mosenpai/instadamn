package X;

import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class SV3 {
    public static final C62238S3j A00;
    public static final C62238S3j A01;
    public static final C62238S3j A02;
    public static final Class A03;

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:1|2)|3|(2:4|5)|(8:7|8|9|10|(3:12|13|14)|17|13|14)|20|8|9|10|(0)|17|13|14) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:10:0x0031, B:12:0x0039), top: B:9:0x0031 }] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.S3j] */
    static {
        /*
            java.lang.String r0 = "com.google.repack.protobuf.GeneratedMessageV3"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            X.SV3.A03 = r0
            r2 = 0
            r3 = 0
            java.lang.String r0 = "com.google.repack.protobuf.UnknownFieldSetSchema"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L2d
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L2d
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L2d
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L2d
            X.S3j r0 = (X.C62238S3j) r0     // Catch: java.lang.Throwable -> L2d
            goto L2e
        L2d:
            r0 = r3
        L2e:
            X.SV3.A00 = r0
            r2 = 1
            java.lang.String r0 = "com.google.repack.protobuf.UnknownFieldSetSchema"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L52
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L52
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L52
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L52
            X.S3j r0 = (X.C62238S3j) r0     // Catch: java.lang.Throwable -> L52
            goto L53
        L52:
            r0 = r3
        L53:
            X.SV3.A01 = r0
            X.S3j r0 = new X.S3j
            r0.<init>()
            X.SV3.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SV3.<clinit>():void");
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [X.SZh, java.lang.Object] */
    public static void A00(Object obj, Object obj2) {
        RaB raB = (RaB) obj;
        C62964SZh c62964SZh = raB.unknownFields;
        C62964SZh c62964SZh2 = ((RaB) obj2).unknownFields;
        C62964SZh c62964SZh3 = c62964SZh;
        if (!c62964SZh2.equals(C62964SZh.A03)) {
            int i = c62964SZh.A00;
            int i2 = c62964SZh2.A00;
            int i3 = i + i2;
            int[] copyOf = Arrays.copyOf(c62964SZh.A01, i3);
            System.arraycopy(c62964SZh2.A01, 0, copyOf, i, i2);
            Object[] copyOf2 = Arrays.copyOf(c62964SZh.A02, i3);
            System.arraycopy(c62964SZh2.A02, 0, copyOf2, i, i2);
            ?? obj3 = new Object();
            obj3.A00 = i3;
            obj3.A01 = copyOf;
            obj3.A02 = copyOf2;
            c62964SZh3 = obj3;
        }
        raB.unknownFields = c62964SZh3;
    }
}
