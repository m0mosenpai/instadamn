package X;

import android.os.Handler;
import android.util.Pair;
import java.util.UUID;

/* renamed from: X.7qx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175237qx {
    public InterfaceC175397rF A00;
    public String A01 = "";
    public final C175227qw A02;
    public volatile UUID A03;
    public volatile boolean A04;

    private void A00(final String str, final String str2) {
        android.util.Log.e("SessionManager", AnonymousClass001.A0u(str, " has been evicted. ", str2, " now owns the camera device"));
        int i = AbstractC175037qd.A00;
        AbstractC175037qd.A00(27, 0, new Pair(str, str2));
        final InterfaceC175397rF interfaceC175397rF = this.A00;
        if (interfaceC175397rF != null) {
            C175227qw c175227qw = this.A02;
            Runnable runnable = new Runnable() { // from class: X.AxN
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC175397rF.this.DQ9(str, str2);
                }
            };
            synchronized (c175227qw) {
                Handler handler = c175227qw.A00;
                if (handler != null) {
                    handler.post(runnable);
                } else {
                    C176567tE.A00(runnable);
                }
            }
            this.A00 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A01() {
        /*
            r7 = this;
            java.util.UUID r0 = r7.A03
            if (r0 == 0) goto L42
            X.7qw r6 = r7.A02
            java.util.UUID r5 = r7.A03
            monitor-enter(r6)
            java.util.UUID r0 = r6.A01     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            if (r0 != 0) goto L13
            goto L41
        L13:
            android.os.Handler r0 = r6.A03     // Catch: java.lang.Throwable -> L3e
            boolean r3 = r0.hasMessages(r4, r5)     // Catch: java.lang.Throwable -> L3e
            r0.removeCallbacksAndMessages(r5)     // Catch: java.lang.Throwable -> L3e
            android.os.Handler r0 = r6.A00     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L2b
            boolean r0 = r0.hasMessages(r4, r5)     // Catch: java.lang.Throwable -> L3e
            r3 = r3 | r0
            android.os.Handler r0 = r6.A00     // Catch: java.lang.Throwable -> L3e
            r0.removeCallbacksAndMessages(r5)     // Catch: java.lang.Throwable -> L3e
            goto L39
        L2b:
            java.lang.Class<X.7tE> r2 = X.C176567tE.class
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L3e
            android.os.Handler r1 = X.C176567tE.A00     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r1.hasMessages(r4, r5)     // Catch: java.lang.Throwable -> L3b
            r1.removeCallbacksAndMessages(r5)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3e
            r3 = r3 | r0
        L39:
            monitor-exit(r6)
            goto L43
        L3b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3e
            throw r0     // Catch: java.lang.Throwable -> L3e
        L3e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L41:
            monitor-exit(r6)
        L42:
            r3 = 0
        L43:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r7.A03 = r0
            X.7qw r1 = r7.A02
            java.util.UUID r0 = r7.A03
            monitor-enter(r1)
            r1.A01 = r0     // Catch: java.lang.Throwable -> L52
            monitor-exit(r1)
            return r3
        L52:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175237qx.A01():boolean");
    }

    public final String A02() {
        String str;
        synchronized (this.A02) {
            str = this.A01;
        }
        return str;
    }

    public final UUID A03(Handler handler, String str) {
        UUID uuid;
        C175227qw c175227qw = this.A02;
        synchronized (c175227qw) {
            if (this.A04) {
                A00(this.A01, str);
            }
            if (A01()) {
                A00(this.A01, str);
            }
            c175227qw.A00 = handler;
            this.A01 = str;
            this.A04 = true;
            uuid = this.A03;
        }
        return uuid;
    }

    public final void A04(InterfaceC175397rF interfaceC175397rF) {
        synchronized (this.A02) {
            this.A00 = interfaceC175397rF;
        }
    }

    public final boolean A05(UUID uuid) {
        C175227qw c175227qw = this.A02;
        synchronized (c175227qw) {
            if (uuid != null) {
                if (this.A03 != null && uuid.equals(this.A03)) {
                    A01();
                    c175227qw.A00 = null;
                    this.A00 = null;
                    this.A04 = false;
                    return true;
                }
            }
            return false;
        }
    }

    public C175237qx(C175227qw c175227qw) {
        this.A02 = c175227qw;
    }
}
