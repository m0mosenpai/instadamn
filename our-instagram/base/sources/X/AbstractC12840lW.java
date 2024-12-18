package X;

import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;

/* renamed from: X.0lW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12840lW {
    public static final C12830lV A00;

    static {
        Field field;
        Field field2;
        C12830lV c12830lV;
        try {
            field = MessageQueue.class.getDeclaredField("mMessages");
            try {
                field.setAccessible(true);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            field = null;
        }
        try {
            field2 = Message.class.getDeclaredField("next");
            try {
                field2.setAccessible(true);
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            field2 = null;
        }
        if (field != null && field2 != null) {
            c12830lV = new C12830lV(field, field2);
        } else {
            c12830lV = null;
        }
        A00 = c12830lV;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:27:0x001c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public static final java.util.ArrayList A00(android.os.MessageQueue r9) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.0lV r3 = X.AbstractC12840lW.A00
            if (r3 == 0) goto Lcb
            X.C14360o3.A0A(r9)
            monitor-enter(r9)
            java.lang.reflect.Field r0 = r3.A00     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r0.get(r9)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = "null cannot be cast to non-null type android.os.Message"
            X.C14360o3.A0C(r2, r0)     // Catch: java.lang.Throwable -> L1c
            android.os.Message r2 = (android.os.Message) r2     // Catch: java.lang.Throwable -> L1c
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto Lb6
            int r0 = r2.what     // Catch: java.lang.Throwable -> Lc8
            r5 = 159(0x9f, float:2.23E-43)
            if (r0 == r5) goto L2c
            int r1 = r2.what     // Catch: java.lang.Throwable -> Lc8
            r0 = 100
            r8 = 0
            if (r1 != r0) goto L2d
        L2c:
            r8 = 1
        L2d:
            int r0 = r2.what     // Catch: java.lang.Throwable -> Lc8
            if (r0 != r5) goto L8a
            java.lang.Object r6 = r2.obj     // Catch: java.lang.Throwable -> Lc8
            boolean r0 = r6 instanceof android.app.servertransaction.ClientTransaction     // Catch: java.lang.Throwable -> Lc8
            r5 = 0
            if (r0 == 0) goto Laf
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = "mActivityCallbacks"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L48
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L49
            goto L49
        L48:
            r1 = 0
        L49:
            if (r1 == 0) goto Laf
            java.lang.Object r7 = r1.get(r6)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<*>"
            X.C14360o3.A0C(r7, r0)     // Catch: java.lang.Throwable -> Laf
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> Laf
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Throwable -> Laf
            if (r0 != 0) goto Laf
            r6 = 0
            java.lang.Object r0 = r7.get(r6)     // Catch: java.lang.Throwable -> Laf
            X.C14360o3.A0A(r0)     // Catch: java.lang.Throwable -> Laf
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = "mIntent"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L75
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L76
            goto L76
        L75:
            r1 = 0
        L76:
            if (r1 == 0) goto Laf
            java.lang.Object r0 = r7.get(r6)     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = "null cannot be cast to non-null type android.content.Intent"
            X.C14360o3.A0C(r1, r0)     // Catch: java.lang.Throwable -> Laf
            android.content.Intent r1 = (android.content.Intent) r1     // Catch: java.lang.Throwable -> Laf
            r5 = r1
            goto Laf
        L8a:
            java.lang.Object r6 = r2.obj     // Catch: java.lang.Throwable -> Lc8
            r5 = 0
            if (r6 == 0) goto Laf
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = "intent"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L9f
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> La0
            goto La0
        L9f:
            r1 = 0
        La0:
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = "null cannot be cast to non-null type android.content.Intent"
            X.C14360o3.A0C(r1, r0)     // Catch: java.lang.Throwable -> Laf
            android.content.Intent r1 = (android.content.Intent) r1     // Catch: java.lang.Throwable -> Laf
            r5 = r1
        Laf:
            if (r5 == 0) goto Lb8
            r4.add(r5)     // Catch: java.lang.Throwable -> Lc8
            if (r8 == 0) goto Lb8
        Lb6:
            monitor-exit(r9)
            return r4
        Lb8:
            java.lang.reflect.Field r0 = r3.A01     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = "null cannot be cast to non-null type android.os.Message"
            X.C14360o3.A0C(r2, r0)     // Catch: java.lang.Throwable -> L1c
            android.os.Message r2 = (android.os.Message) r2     // Catch: java.lang.Throwable -> L1c
            goto L1d
        Lc8:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        Lcb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC12840lW.A00(android.os.MessageQueue):java.util.ArrayList");
    }
}
