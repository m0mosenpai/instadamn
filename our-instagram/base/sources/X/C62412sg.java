package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.systrace.Systrace;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62412sg implements InterfaceC018507f {
    public final int A00;
    public final AbstractC018607g A01;
    public final C11R A02;
    public final AtomicBoolean A03;
    public final Context A04;
    public final Integer A05;

    @Override // X.InterfaceC018507f
    public final AbstractC019307n D8C(Bundle bundle, int i) {
        if (Systrace.A0E(1L)) {
            C0fO.A01(AnonymousClass001.A0R(this.A02.getName(), " LoaderScheduler::onCreateLoader()"), -744555307);
        }
        try {
            final C11R c11r = this.A02;
            c11r.onStart();
            if (Systrace.A0E(1L)) {
                C0fO.A00(535286275);
            }
            final Context context = this.A04;
            final AtomicBoolean atomicBoolean = this.A03;
            final Integer num = this.A05;
            return new AbstractC62432si(context, c11r, num, atomicBoolean) { // from class: X.2sh
                public final C11R A00;
                public final Integer A01;
                public final AtomicBoolean A02;

                {
                    C14360o3.A0B(atomicBoolean, 3);
                    if (this.A07) {
                        A09();
                    } else {
                        this.A04 = true;
                    }
                    this.A00 = c11r;
                    this.A02 = atomicBoolean;
                    this.A01 = num;
                }

                @Override // X.AbstractC019307n
                public final void A00() {
                    if (!this.A02.get()) {
                        this.A00.onCancel();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
                @Override // X.AbstractC62442sj
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* bridge */ /* synthetic */ java.lang.Object A06() {
                    /*
                        r7 = this;
                        r5 = 1
                        boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
                        if (r0 == 0) goto L1a
                        java.lang.String r1 = "run "
                        X.11R r0 = r7.A00
                        java.lang.String r0 = r0.getName()
                        java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
                        r0 = -1566362997(0xffffffffa2a3328b, float:-4.4234753E-18)
                        X.C0fO.A01(r1, r0)
                    L1a:
                        java.lang.Integer r4 = r7.A01     // Catch: java.lang.Throwable -> L8c
                        if (r4 == 0) goto L32
                        int r0 = android.os.Process.myTid()     // Catch: java.lang.Throwable -> L8c
                        int r3 = android.os.Process.getThreadPriority(r0)     // Catch: java.lang.Throwable -> L8c
                        int r2 = r4.intValue()     // Catch: java.lang.Throwable -> L8c
                        if (r2 < r3) goto L35
                        X.11R r0 = r7.A00     // Catch: java.lang.Throwable -> L8c
                    L2e:
                        r0.run()     // Catch: java.lang.Throwable -> L8c
                        goto L69
                    L32:
                        X.11R r0 = r7.A00     // Catch: java.lang.Throwable -> L8c
                        goto L2e
                    L35:
                        boolean r0 = com.facebook.systrace.Systrace.A0E(r5)     // Catch: java.lang.Throwable -> L8c
                        if (r0 == 0) goto L52
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
                        r1.<init>()     // Catch: java.lang.Throwable -> L8c
                        java.lang.String r0 = "ScopedBoost priority="
                        r1.append(r0)     // Catch: java.lang.Throwable -> L8c
                        r1.append(r4)     // Catch: java.lang.Throwable -> L8c
                        java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L8c
                        r0 = 1135469940(0x43ade574, float:347.7926)
                        X.C0fO.A01(r1, r0)     // Catch: java.lang.Throwable -> L8c
                    L52:
                        android.os.Process.setThreadPriority(r2)     // Catch: java.lang.Throwable -> L8c
                        X.11R r0 = r7.A00     // Catch: java.lang.Throwable -> L7b
                        r0.run()     // Catch: java.lang.Throwable -> L7b
                        android.os.Process.setThreadPriority(r3)     // Catch: java.lang.Throwable -> L8c
                        boolean r0 = com.facebook.systrace.Systrace.A0E(r5)     // Catch: java.lang.Throwable -> L8c
                        if (r0 == 0) goto L69
                        r0 = 544955576(0x207b5cb8, float:2.1291205E-19)
                        X.C0fO.A00(r0)     // Catch: java.lang.Throwable -> L8c
                    L69:
                        boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
                        if (r0 == 0) goto L75
                        r0 = 1950779151(0x7446870f, float:6.29159E31)
                        X.C0fO.A00(r0)
                    L75:
                        r0 = 1
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    L7b:
                        r1 = move-exception
                        android.os.Process.setThreadPriority(r3)     // Catch: java.lang.Throwable -> L8c
                        boolean r0 = com.facebook.systrace.Systrace.A0E(r5)     // Catch: java.lang.Throwable -> L8c
                        if (r0 == 0) goto L8b
                        r0 = 669753256(0x27eb9fa8, float:6.5398702E-15)
                        X.C0fO.A00(r0)     // Catch: java.lang.Throwable -> L8c
                    L8b:
                        throw r1     // Catch: java.lang.Throwable -> L8c
                    L8c:
                        r1 = move-exception
                        boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
                        if (r0 == 0) goto L99
                        r0 = -1741425537(0xffffffff9833f47f, float:-2.3258647E-24)
                        X.C0fO.A00(r0)
                    L99:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C62422sh.A06():java.lang.Object");
                }
            };
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1739609889);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC018507f
    public final /* bridge */ /* synthetic */ void DPn(AbstractC019307n abstractC019307n, Object obj) {
        if (Systrace.A0E(1L)) {
            C0fO.A01(AnonymousClass001.A0R(this.A02.getName(), " onFinish"), -1589647225);
        }
        try {
            this.A02.onFinish();
            if (Systrace.A0E(1L)) {
                C0fO.A00(-652942653);
            }
            this.A03.set(true);
            this.A01.A03(this.A00);
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-494679964);
            }
            throw th;
        }
    }

    public C62412sg(Context context, AbstractC018607g abstractC018607g, C11R c11r, Integer num, int i) {
        this.A01 = abstractC018607g;
        this.A00 = i;
        this.A02 = c11r;
        this.A05 = num;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        this.A04 = applicationContext;
        this.A03 = new AtomicBoolean(false);
    }
}
