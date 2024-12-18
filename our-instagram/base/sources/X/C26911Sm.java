package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AndroidRuntimeException;
import java.lang.reflect.Constructor;

/* renamed from: X.1Sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26911Sm extends C0R8 implements InterfaceC03430Gv {
    public long A00;
    public StackTraceElement[] A01;
    public final Context A02;
    public final AbstractC04410Lh A03;
    public final boolean A04;

    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "BadNotificationDebugger";
    }

    @Override // X.InterfaceC03430Gv
    public final int handleUncaughtException(Thread thread, Throwable th, C0Gl c0Gl) {
        AndroidRuntimeException androidRuntimeException;
        if (th != null && th.getMessage() != null && th.getMessage().startsWith("Bad notification posted")) {
            String message = th.getMessage();
            long uptimeMillis = SystemClock.uptimeMillis();
            StackTraceElement[] stackTraceElementArr = this.A01;
            if (stackTraceElementArr != null) {
                long j = this.A00;
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
                        sb.append("\nLast UptimeMs for enqueueNotificationWithTag=");
                        sb.append(j);
                        sb.append("(+");
                        sb.append(j2);
                        sb.append("ms)");
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

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        if (this.A04) {
            C0HU.A03(this.A03);
            C0HU.A02(this.A02, "notification");
            C03400Gs.A03(this, 100);
            A08();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003c, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103107160481L)) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26911Sm(X.C0Rw r3) {
        /*
            r2 = this;
            r2.<init>(r3)
            r0 = 0
            r2.A01 = r0
            r0 = 0
            r2.A00 = r0
            X.1Sn r0 = new X.1Sn
            r0.<init>()
            r2.A03 = r0
            X.0RK r3 = (X.C0RK) r3
            android.content.Context r0 = r3.A01
            r2.A02 = r0
            java.lang.Class<X.0hA> r0 = X.C10420hA.class
            X.0Rw r0 = r2.A05(r0)
            if (r0 == 0) goto L3e
            r0 = 36314103106636188(0x81037c0002099c, double:3.0285232575685326E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r0 = X.C20150ym.A07(r0)
            if (r0 == 0) goto L3e
            r0 = 36314103107160481(0x81037c000a09a1, double:3.0285232579000976E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r1 = X.C20150ym.A07(r0)
            r0 = 1
            if (r1 != 0) goto L3f
        L3e:
            r0 = 0
        L3f:
            r2.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26911Sm.<init>(X.0Rw):void");
    }
}
