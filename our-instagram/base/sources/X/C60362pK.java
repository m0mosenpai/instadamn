package X;

import android.content.Context;
import android.os.PersistableBundle;
import android.util.Range;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2pK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60362pK implements InterfaceC13000lm {
    public static final C60372pL A03 = new Object();
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC16820sZ A02;

    public C60362pK(Context context, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC16820sZ, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = interfaceC16820sZ;
    }

    public static final Range A00(C60362pK c60362pK, long j) {
        long millis = TimeUnit.MINUTES.toMillis(C18U.A01(C06090Tz.A05, c60362pK.A01, 36602600354878158L));
        long j2 = j - millis;
        long j3 = 0;
        if (0 < j2) {
            j3 = j2;
        }
        return new Range(Long.valueOf(j3), Long.valueOf(j + millis));
    }

    public final void A02() {
        PersistableBundle persistableBundle;
        UserSession userSession = this.A01;
        if (!AbstractC60392pN.A00(userSession).booleanValue() && !C18U.A06(C06090Tz.A05, userSession, 36321125378040987L)) {
            return;
        }
        if (AbstractC60392pN.A00(userSession).booleanValue() || C18U.A06(C06090Tz.A05, userSession, 36321125378303133L)) {
            try {
                C902040d A01 = C40Y.A00(this.A00, userSession).A01();
                if (A01 != null && (persistableBundle = A01.A05) != null) {
                    long j = persistableBundle.getLong("estimated_execution_time", -1L);
                    if (j >= 0) {
                        if (A00(this, TimeUnit.MINUTES.toMillis(C18U.A01(C06090Tz.A05, userSession, 36602600354812621L)) + ((Number) this.A02.invoke()).longValue()).contains((Range) Long.valueOf(j))) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                new C09540e5(th);
            }
        }
        A01(this);
    }

    public static final void A01(final C60362pK c60362pK) {
        try {
            InterfaceC14020nS A00 = C14120nc.A00();
            C14360o3.A07(A00);
            A00.ATO(new AbstractRunnableC14200nk() { // from class: X.4rJ
                /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
                
                    if (X.C18U.A06(r4, r6, 36321125378237596L) != false) goto L6;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r11 = this;
                        X.2pK r9 = X.C60362pK.this
                        com.instagram.common.session.UserSession r6 = r9.A01
                        android.content.Context r5 = r9.A00
                        X.40Y r7 = X.C40Y.A00(r5, r6)
                        java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
                        X.0Tz r4 = X.C06090Tz.A05
                        r0 = 36602600354812621(0x8209df000112cd, double:3.2109700790004836E-306)
                        long r0 = X.C18U.A01(r4, r6, r0)
                        long r2 = r2.toMillis(r0)
                        android.util.Range r10 = X.C60362pK.A00(r9, r2)
                        java.lang.Boolean r0 = X.AbstractC60392pN.A00(r6)
                        boolean r0 = r0.booleanValue()
                        if (r0 != 0) goto L35
                        r0 = 36321125378237596(0x8109df0003249c, double:3.032964170405681E-306)
                        boolean r0 = X.C18U.A06(r4, r6, r0)
                        r8 = 0
                        if (r0 == 0) goto L36
                    L35:
                        r8 = 1
                    L36:
                        X.0sZ r0 = r9.A02
                        java.lang.Object r0 = r0.invoke()
                        java.lang.Number r0 = (java.lang.Number) r0
                        long r0 = r0.longValue()
                        long r0 = r0 + r2
                        android.os.PersistableBundle r2 = new android.os.PersistableBundle
                        r2.<init>()
                        java.lang.String r3 = "estimated_execution_time"
                        r2.putLong(r3, r0)
                        r1 = 2131428570(0x7f0b04da, float:1.8478788E38)
                        java.lang.Class<com.instagram.backgroundsync.BackgroundSyncJobService> r0 = com.instagram.backgroundsync.BackgroundSyncJobService.class
                        X.40c r3 = new X.40c
                        r3.<init>(r0, r1)
                        r3.A05 = r8
                        r0 = 36602600355271375(0x8209df000812cf, double:3.2109700792906015E-306)
                        long r0 = X.C18U.A01(r4, r6, r0)
                        int r4 = (int) r0
                        r3.A00 = r4
                        java.lang.Comparable r0 = r10.getLower()
                        X.C14360o3.A07(r0)
                        java.lang.Number r0 = (java.lang.Number) r0
                        long r0 = r0.longValue()
                        r3.A02 = r0
                        java.lang.Comparable r0 = r10.getUpper()
                        X.C14360o3.A07(r0)
                        java.lang.Number r0 = (java.lang.Number) r0
                        long r0 = r0.longValue()
                        r3.A01 = r0
                        r3.A04 = r2
                        X.40d r0 = new X.40d
                        r0.<init>(r3)
                        r7.A03(r5, r6, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C106614rJ.run():void");
                }

                {
                    super(373673427, 3, false, false);
                }
            });
        } catch (Throwable th) {
            new C09540e5(th);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        try {
            InterfaceC14020nS A00 = C14120nc.A00();
            C14360o3.A07(A00);
            A00.ATO(new AbstractRunnableC14200nk() { // from class: X.9iP
                @Override // java.lang.Runnable
                public final void run() {
                    C60362pK c60362pK = C60362pK.this;
                    C40Y.A00(c60362pK.A00, c60362pK.A01).A02(R.id.background_sync_scheduler_job_id);
                }

                {
                    super(373673427, 3, false, false);
                }
            });
        } catch (Throwable th) {
            new C09540e5(th);
        }
    }
}
