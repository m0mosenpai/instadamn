package X;

import android.content.ComponentName;
import android.content.Intent;
import android.os.MessageQueue;
import com.facebook.analytics.appstatelogger.foregroundstate.EntityAppState$ForegroundInit;
import com.facebook.perf.background.BackgroundStartupDetector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0AM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AM implements InterfaceC06220Um {
    public static final List A02 = new ArrayList();
    public C03V A00;
    public final boolean A01;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0038, code lost:
    
        if (r6 != X.C05F.A0N) goto L39;
     */
    @Override // X.InterfaceC06220Um
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void D5i(int r9, boolean r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            X.03V r0 = r8.A00     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L82
            java.lang.Integer r4 = X.C05F.A1I     // Catch: java.lang.Throwable -> L84
            X.01x r2 = r0.A00     // Catch: java.lang.Throwable -> L84
            java.lang.Object r3 = r2.A0O     // Catch: java.lang.Throwable -> L84
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L84
            X.0AM r7 = r2.A0B     // Catch: java.lang.Throwable -> L7f
            if (r7 != 0) goto L1a
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "AppStartModeBridge not initialized"
            X.C0K8.A0D(r1, r0)     // Catch: java.lang.Throwable -> L7f
        L18:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7f
            goto L82
        L1a:
            java.lang.Integer r6 = r7.A00()     // Catch: java.lang.Throwable -> L7f
            r2.A02 = r6     // Catch: java.lang.Throwable -> L7f
            java.lang.Integer r5 = X.C05F.A01     // Catch: java.lang.Throwable -> L7f
            if (r6 == r5) goto L18
            java.lang.Integer r1 = X.C05F.A0j     // Catch: java.lang.Throwable -> L7f
            if (r6 == r1) goto L3d
            java.lang.Integer r0 = X.C05F.A0Y     // Catch: java.lang.Throwable -> L7f
            if (r6 == r0) goto L3d
            java.lang.Integer r0 = X.C05F.A0N     // Catch: java.lang.Throwable -> L7f
            if (r6 == r0) goto L34
            java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.Throwable -> L7f
            if (r6 != r0) goto L3e
        L34:
            java.lang.Integer r4 = X.C05F.A15     // Catch: java.lang.Throwable -> L7f
        L36:
            java.lang.Integer r0 = X.C05F.A0N     // Catch: java.lang.Throwable -> L7f
            if (r6 != r0) goto L51
        L3a:
            r1 = 0
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L7f
            goto L41
        L3d:
            r4 = r5
        L3e:
            if (r6 == r1) goto L3a
            goto L36
        L41:
            X.03V r0 = r7.A00     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L4a
            java.util.concurrent.CopyOnWriteArraySet r0 = com.facebook.perf.background.BackgroundStartupDetector.A0C     // Catch: java.lang.Throwable -> L4d
            r0.remove(r7)     // Catch: java.lang.Throwable -> L4d
        L4a:
            r7.A00 = r1     // Catch: java.lang.Throwable -> L4d
            goto L50
        L4d:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7f
            throw r0     // Catch: java.lang.Throwable -> L7f
        L50:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7f
        L51:
            java.lang.Integer r0 = r2.A02     // Catch: java.lang.Throwable -> L7f
            char r1 = X.AbstractC04260Ks.A00(r0)     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7f
            boolean r0 = r2.A0Q     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L6e
            if (r4 != r5) goto L5f
            goto L69
        L5f:
            java.lang.Integer r0 = X.C05F.A15     // Catch: java.lang.Throwable -> L84
            if (r4 != r0) goto L6e
            java.lang.Object r0 = X.C0AI.A01     // Catch: java.lang.Throwable -> L84
            X.C0AI.A01(r0)     // Catch: java.lang.Throwable -> L84
            goto L6e
        L69:
            java.lang.Object r0 = X.C0AI.A01     // Catch: java.lang.Throwable -> L84
            X.C0AI.A00(r0)     // Catch: java.lang.Throwable -> L84
        L6e:
            X.01d r0 = r2.A00     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto L7b
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "AppStateLogFile not initialized."
            X.C0K8.A0D(r1, r0)     // Catch: java.lang.Throwable -> L84
            goto L82
        L7b:
            r0.A05(r1)     // Catch: java.lang.Throwable -> L84
            goto L82
        L7f:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7f
            throw r0     // Catch: java.lang.Throwable -> L84
        L82:
            monitor-exit(r8)
            return
        L84:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0AM.D5i(int, boolean):void");
    }

    @Override // X.InterfaceC06220Um
    public final void DN9(Boolean bool) {
    }

    public final Integer A00() {
        if (this.A01) {
            ((EntityAppState$ForegroundInit) C0AI.A01).A00 = true;
            return C05F.A0j;
        }
        int i = BackgroundStartupDetector.A0D;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return C05F.A0Y;
                    }
                    return C05F.A0j;
                }
                return C05F.A0C;
            }
            return C05F.A0N;
        }
        return C05F.A01;
    }

    public C0AM(MessageQueue messageQueue) {
        boolean z;
        List list = A02;
        if (list.isEmpty()) {
            list.addAll(AbstractC12840lW.A00(messageQueue));
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                ComponentName component = ((Intent) it.next()).getComponent();
                if (component != null && component.getClassName().endsWith("Activity")) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        this.A01 = z;
    }

    public C0AM() {
        this.A01 = false;
    }
}
