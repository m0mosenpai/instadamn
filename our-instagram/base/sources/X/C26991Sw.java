package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.AndroidRuntimeException;
import java.lang.reflect.Constructor;

/* renamed from: X.1Sw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26991Sw extends C0R8 implements InterfaceC03430Gv {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public Intent A04;
    public StackTraceElement[] A05;
    public final Context A06;
    public final AbstractC04410Lh A07;
    public final boolean A08;

    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "ForegroundServiceDebugger";
    }

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        if (this.A08) {
            C0HU.A03(this.A07);
            C0HU.A02(this.A06, "activity");
            C03400Gs.A03(this, 100);
            A08();
        }
    }

    @Override // X.InterfaceC03430Gv
    public final int handleUncaughtException(Thread thread, Throwable th, C0Gl c0Gl) {
        AndroidRuntimeException androidRuntimeException;
        if (th != null && th.getMessage() != null && th.getMessage().startsWith("Context.startForegroundService()")) {
            String message = th.getMessage();
            long uptimeMillis = SystemClock.uptimeMillis();
            StackTraceElement[] stackTraceElementArr = this.A05;
            if (stackTraceElementArr != null) {
                long j = this.A03;
                long j2 = uptimeMillis - j;
                if (j2 <= 120000) {
                    int length = stackTraceElementArr.length;
                    int i = 6;
                    int i2 = length - 6;
                    if (i2 > 0) {
                        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i2];
                        int i3 = 0;
                        while (i < length) {
                            stackTraceElementArr2[i3] = stackTraceElementArr[i];
                            i++;
                            i3++;
                        }
                        StringBuilder sb = new StringBuilder(message);
                        sb.append("\nCurrent UptimeMs=");
                        sb.append(uptimeMillis);
                        sb.append("\nLast UptimeMs for startService=");
                        sb.append(j);
                        sb.append("(+");
                        sb.append(j2);
                        sb.append("ms)");
                        long j3 = this.A00;
                        if (j3 > j) {
                            sb.append(", onCreate=");
                            sb.append(j3);
                            sb.append("(+");
                            sb.append(uptimeMillis - j3);
                            sb.append("ms)");
                        }
                        long j4 = this.A01;
                        if (j4 > j) {
                            sb.append(", onStartCommand=");
                            sb.append(j4);
                            sb.append("(+");
                            sb.append(uptimeMillis - j4);
                            sb.append("ms)");
                        }
                        long j5 = this.A02;
                        if (j5 > j) {
                            sb.append(", setServiceForeground=");
                            sb.append(j5);
                            sb.append("(+");
                            sb.append(uptimeMillis - j5);
                            sb.append("ms)");
                        }
                        Intent intent = this.A04;
                        if (intent != null) {
                            sb.append("\nIntent action=");
                            sb.append(intent.getAction());
                            sb.append(", component=");
                            sb.append(this.A04.getComponent());
                        }
                        C62464SCr c62464SCr = C62464SCr.A01;
                        if (c62464SCr == null) {
                            c62464SCr = new C62464SCr();
                            C62464SCr.A01 = c62464SCr;
                        }
                        String obj = sb.toString();
                        Constructor constructor = c62464SCr.A00;
                        if (constructor == null) {
                            androidRuntimeException = new AndroidRuntimeException(obj);
                        } else {
                            try {
                                androidRuntimeException = (AndroidRuntimeException) constructor.newInstance(obj);
                            } catch (Throwable unused) {
                                androidRuntimeException = new AndroidRuntimeException(obj);
                            }
                        }
                        androidRuntimeException.setStackTrace(stackTraceElementArr2);
                        Intent intent2 = this.A04;
                        if (intent2 != null && intent2.getComponent() != null) {
                            ComponentName component = this.A04.getComponent();
                            RuntimeException runtimeException = new RuntimeException();
                            String className = component.getClassName();
                            String shortClassName = component.getShortClassName();
                            int lastIndexOf = shortClassName.lastIndexOf(46);
                            if (lastIndexOf != -1) {
                                shortClassName = shortClassName.substring(lastIndexOf + 1);
                            }
                            runtimeException.setStackTrace(new StackTraceElement[]{new StackTraceElement(className, "startForeground", AnonymousClass001.A0R(shortClassName, ".java"), -1)});
                            androidRuntimeException.initCause(runtimeException);
                        }
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            androidRuntimeException.initCause(cause);
                        }
                        th.initCause(androidRuntimeException);
                        return 0;
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103107094944L)) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26991Sw(X.C0Rw r4) {
        /*
            r3 = this;
            r3.<init>(r4)
            r2 = 0
            r3.A05 = r2
            r0 = 0
            r3.A03 = r0
            r3.A02 = r0
            r3.A00 = r0
            r3.A01 = r0
            r3.A04 = r2
            X.1Sx r0 = new X.1Sx
            r0.<init>()
            r3.A07 = r0
            X.0RK r4 = (X.C0RK) r4
            android.content.Context r0 = r4.A01
            r3.A06 = r0
            java.lang.Class<X.0hA> r0 = X.C10420hA.class
            X.0Rw r0 = r3.A05(r0)
            if (r0 == 0) goto L46
            r0 = 36314103106636188(0x81037c0002099c, double:3.0285232575685326E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r0 = X.C20150ym.A07(r0)
            if (r0 == 0) goto L46
            r0 = 36314103107094944(0x81037c000909a0, double:3.028523257858652E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r1 = X.C20150ym.A07(r0)
            r0 = 1
            if (r1 != 0) goto L47
        L46:
            r0 = 0
        L47:
            r3.A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26991Sw.<init>(X.0Rw):void");
    }
}
