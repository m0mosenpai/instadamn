package X;

import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import com.facebook.common.hiddenapis2.ApiExemption;
import com.facebook.endtoend.EndToEnd;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1T3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1T3 extends C0R8 implements InvocationHandler {
    public static Thread A03;
    public static final ConcurrentSkipListSet A04;
    public static final AtomicInteger A05;
    public static final boolean A06;
    public final double A00;
    public final Random A01;
    public final boolean A02;

    private SX1 A00(IBinder iBinder, int i, int i2) {
        if ((i2 & 1) == 1) {
            return null;
        }
        try {
            int incrementAndGet = A05.incrementAndGet();
            ConcurrentSkipListSet concurrentSkipListSet = A04;
            concurrentSkipListSet.add(Integer.valueOf(incrementAndGet));
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (interfaceDescriptor == null) {
                interfaceDescriptor = "null";
            }
            return new SX1(incrementAndGet, interfaceDescriptor, i, concurrentSkipListSet.size());
        } catch (Exception e) {
            A0C(e);
            return null;
        }
    }

    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "MainThreadIpcMonitor";
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String str;
        int length = objArr.length;
        if (length >= 2) {
            if (method.getParameterTypes()[0] == IBinder.class) {
                Class<?> cls = method.getParameterTypes()[1];
                Class<?> cls2 = Integer.TYPE;
                if (cls == cls2 && method.getName().equals("onTransactStarted")) {
                    if (length >= 3 && method.getParameterTypes()[2] == cls2) {
                        return A00((IBinder) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    }
                    return A00((IBinder) objArr[0], ((Number) objArr[1]).intValue(), 0);
                }
            }
        } else if (length < 1) {
            return null;
        }
        if (method.getName().equals("onTransactEnded")) {
            Object obj2 = objArr[0];
            if (obj2 instanceof SX1) {
                SX1 sx1 = (SX1) obj2;
                A04.remove(Integer.valueOf(sx1.A02));
                if (EndToEnd.A05()) {
                    double d = this.A00;
                    if (d == 0.0d || this.A01.nextInt() % d != 0.0d) {
                        return null;
                    }
                }
                C0f6 A07 = A07();
                if (A07 == null) {
                    return null;
                }
                Thread thread = A03;
                if (thread == null) {
                    thread = Looper.getMainLooper().getThread();
                    A03 = thread;
                }
                Thread currentThread = Thread.currentThread();
                int i = 69402626;
                if (currentThread == thread) {
                    i = 69402625;
                }
                C0f5 AEq = A07.AEq(true, "MainThreadIpcMonitor", i);
                if (!AEq.isSampled()) {
                    return null;
                }
                AEq.ABV("duration_ns", System.nanoTime() - sx1.A03);
                AEq.ERI(SX1.A00(sx1));
                AEq.ABW(DevServerEntity.COLUMN_DESCRIPTION, sx1.A04);
                AEq.ABU("concurrent_ipcs", sx1.A01);
                StackTraceElement[] stackTrace = SX1.A00(sx1).getStackTrace();
                int i2 = 1;
                while (true) {
                    if (i2 < stackTrace.length) {
                        StackTraceElement stackTraceElement = stackTrace[i2];
                        if (stackTraceElement.getClassName().endsWith("$Stub$Proxy")) {
                            str = stackTraceElement.getMethodName();
                            break;
                        }
                        i2++;
                    } else {
                        str = "unknown";
                        break;
                    }
                }
                AEq.ABW("method", str);
                AEq.ABW("thread", currentThread.getName());
                AEq.ABX("app_in_foreground_v2", C0L6.A07());
                AEq.ABX("during_startup", false);
                AEq.report();
                return null;
            }
            return null;
        }
        return null;
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        A06 = z;
        A05 = new AtomicInteger();
        A04 = new ConcurrentSkipListSet();
    }

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        if (this.A02) {
            if (!ApiExemption.removeRestriction_DO_NOT_USE()) {
                A09("Hidden apis are not accessible");
                return;
            }
            try {
                Class<?> cls = Class.forName("android.os.Binder$ProxyTransactListener");
                Object newProxyInstance = Proxy.newProxyInstance(C0HX.class.getClassLoader(), new Class[]{cls}, this);
                Method declaredMethod = Binder.class.getDeclaredMethod("setProxyTransactListener", cls);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, newProxyInstance);
            } catch (Throwable th) {
                A0C(th);
            }
            A08();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103110371776L)) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1T3(X.C0Rw r4) {
        /*
            r3 = this;
            r3.<init>(r4)
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r3.A01 = r0
            java.lang.Class<X.0hA> r0 = X.C10420hA.class
            X.0Rw r2 = r3.A05(r0)
            boolean r0 = X.C1T3.A06
            if (r0 == 0) goto L26
            if (r2 == 0) goto L26
            r0 = 36314103110371776(0x81037c003b09c0, double:3.0285232599309335E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r1 = X.C20150ym.A07(r0)
            r0 = 1
            if (r1 != 0) goto L27
        L26:
            r0 = 0
        L27:
            r3.A02 = r0
            if (r2 == 0) goto L3d
            r0 = 36595578088130756(0x82037c004b08c4, double:3.206529169274474E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            long r1 = X.C20150ym.A01(r0)
            int r0 = (int) r1
            double r0 = (double) r0
        L3a:
            r3.A00 = r0
            return
        L3d:
            r0 = 0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1T3.<init>(X.0Rw):void");
    }
}
