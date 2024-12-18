package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0HT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0HT implements Handler.Callback {
    public static Field A03;
    public Handler.Callback A00;
    public final Handler A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    static {
        try {
            Field declaredField = Handler.class.getDeclaredField("mCallback");
            A03 = declaredField;
            declaredField.setAccessible(true);
        } catch (Error | Exception unused) {
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<C0HV> list = C0HU.A00;
        boolean z = false;
        if (!list.isEmpty()) {
            for (C0HV c0hv : list) {
                if (c0hv.DSx(message, this, "ActivityThread") && !z) {
                    c0hv.A76(message, this, "ActivityThread");
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        }
        Handler.Callback callback = this.A00;
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }

    public C0HT(Handler handler) {
        this.A01 = handler;
        Runnable runnable = new Runnable() { // from class: X.0HS
            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:52:0x005a
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
                	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    r5 = this;
                    r4 = 1
                    java.lang.reflect.Field r3 = X.C0HT.A03     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L4c
                    if (r3 != 0) goto L15
                    X.0HT r1 = X.C0HT.this
                    java.util.concurrent.atomic.AtomicBoolean r0 = r1.A02
                    r0.set(r4)
                    monitor-enter(r1)
                    r1.notify()     // Catch: java.lang.Throwable -> L12
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
                    return
                L12:
                    r3 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
                    throw r3
                L15:
                    X.0HT r2 = X.C0HT.this     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L34 java.lang.Throwable -> L4c
                    android.os.Handler r1 = r2.A01     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L34 java.lang.Throwable -> L4c
                    java.lang.Object r0 = r3.get(r1)     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L34 java.lang.Throwable -> L4c
                    if (r0 == 0) goto L23
                    android.os.Handler$Callback r0 = (android.os.Handler.Callback) r0     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L34 java.lang.Throwable -> L4c
                    r2.A00 = r0     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L34 java.lang.Throwable -> L4c
                L23:
                    r3.set(r1, r2)     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L34 java.lang.Throwable -> L4c
                    java.util.concurrent.atomic.AtomicBoolean r0 = r2.A02
                    r0.set(r4)
                    monitor-enter(r2)
                    r2.notify()     // Catch: java.lang.Throwable -> L31
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
                    return
                L31:
                    r3 = move-exception
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
                    throw r3
                L34:
                    r2 = move-exception
                    java.lang.String r1 = "HandlerInterceptor"
                    java.lang.String r0 = "Install Handler Callback failed"
                    X.C0K8.A0F(r1, r0, r2)     // Catch: java.lang.Throwable -> L4c
                    X.0HT r1 = X.C0HT.this
                    java.util.concurrent.atomic.AtomicBoolean r0 = r1.A02
                    r0.set(r4)
                    monitor-enter(r1)
                    r1.notify()     // Catch: java.lang.Throwable -> L49
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
                    return
                L49:
                    r3 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L49
                    throw r3
                L4c:
                    r3 = move-exception
                    X.0HT r1 = X.C0HT.this
                    java.util.concurrent.atomic.AtomicBoolean r0 = r1.A02
                    r0.set(r4)
                    monitor-enter(r1)
                    r1.notify()     // Catch: java.lang.Throwable -> L5a
                L58:
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
                    goto L5c
                L5a:
                    r3 = move-exception
                    goto L58
                L5c:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0HS.run():void");
            }
        };
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(handler.getLooper()).post(runnable);
        }
    }
}
