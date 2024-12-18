package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Shz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63344Shz {
    public long A00;
    public long A01;
    public boolean A03;
    public final int A04;
    public final long A05;
    public final AlarmManager A06;
    public final PendingIntent A07;
    public final PendingIntent A08;
    public final PendingIntent A09;
    public final BroadcastReceiver A0A;
    public final BroadcastReceiver A0B;
    public final BroadcastReceiver A0C;
    public final Context A0D;
    public final Handler A0E;
    public final RealtimeSinceBootClock A0F;
    public final C3UW A0G;
    public final C63306ShC A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final boolean A0M;
    public final AtomicInteger A0O;
    public volatile Runnable A0P;
    public static final String A0Q = AnonymousClass001.A0R("KeepaliveManager", ".ACTION_INEXACT_ALARM.");
    public static final List A0R = Collections.unmodifiableList(new C64903TZd(0));
    public static final String A0T = AnonymousClass001.A0R("KeepaliveManager", ".ACTION_EXACT_ALARM.");
    public static final String A0S = AnonymousClass001.A0R("KeepaliveManager", ".ACTION_BACKUP_ALARM.");
    public long A02 = -1;
    public final InterfaceC08100bW A0N = new C64154T1f(this, 0);

    private PendingIntent A00(Context context, Intent intent) {
        try {
            C04750Mt A0R2 = MSZ.A0R(context, intent);
            A0R2.A09();
            A0R2.A08 = this.A0N;
            return A0R2.A02(context, 0, 134217728);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public final synchronized void A03() {
        PendingIntent pendingIntent;
        if (this.A03) {
            this.A03 = false;
            PendingIntent pendingIntent2 = this.A09;
            if (pendingIntent2 != null) {
                this.A0G.A03(this.A06, pendingIntent2);
            }
            if (!this.A0M && (pendingIntent = this.A07) != null) {
                this.A0G.A03(this.A06, pendingIntent);
            }
            PendingIntent pendingIntent3 = this.A08;
            if (pendingIntent3 != null) {
                this.A0G.A03(this.A06, pendingIntent3);
            }
        }
        this.A00 = this.A05;
        this.A02 = -1L;
    }

    public final synchronized void A04() {
        A03();
        if (this.A0P != null) {
            C3UW c3uw = this.A0G;
            Context context = this.A0D;
            c3uw.A06(this.A0B, context);
            c3uw.A06(this.A0C, context);
            c3uw.A06(this.A0A, context);
        }
    }

    public final synchronized void A05() {
        long j;
        PendingIntent pendingIntent;
        long j2;
        PendingIntent pendingIntent2;
        long j3 = this.A0O.get() * 1000;
        long j4 = this.A05;
        if (j3 >= j4) {
            Iterator it = A0R.iterator();
            while (true) {
                if (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    if (j3 >= longValue) {
                        j3 = longValue;
                        break;
                    }
                } else {
                    j3 = j4;
                    break;
                }
            }
        }
        this.A00 = j3;
        this.A01 = SystemClock.elapsedRealtime() + j3;
        if (this.A03) {
            PendingIntent pendingIntent3 = this.A08;
            if (pendingIntent3 != null) {
                this.A0G.A03(this.A06, pendingIntent3);
            }
            if (!this.A0M && (pendingIntent2 = this.A07) != null) {
                this.A0G.A03(this.A06, pendingIntent2);
            }
        } else {
            this.A03 = true;
        }
        try {
            j = this.A00;
        } catch (Throwable th) {
            C0K8.A0M("KeepaliveManager", "keepalive/alarm_failed; intervalSec=%s", th, Long.valueOf(this.A00 / 1000));
            try {
                A03();
            } catch (Throwable unused) {
            }
        }
        if (j < j4) {
            pendingIntent = this.A08;
            j2 = this.A01;
        } else {
            if (this.A02 != j) {
                this.A02 = j;
                PendingIntent pendingIntent4 = this.A09;
                if (pendingIntent4 != null) {
                    this.A0G.A03(this.A06, pendingIntent4);
                }
                A02(pendingIntent4, this, this.A01);
            }
            if (!this.A0M) {
                pendingIntent = this.A07;
                j2 = this.A01 + 20000;
            }
        }
        A01(pendingIntent, this, j2);
    }

    public static void A01(PendingIntent pendingIntent, C63344Shz c63344Shz, long j) {
        String str;
        String str2;
        if (pendingIntent != null) {
            try {
                Context context = c63344Shz.A0D;
                AlarmManager alarmManager = c63344Shz.A06;
                if (AbstractC02620Al.A00(alarmManager, context)) {
                    if (c63344Shz.A0M) {
                        alarmManager.setExactAndAllowWhileIdle(2, j, pendingIntent);
                        return;
                    } else {
                        alarmManager.setExact(2, j, pendingIntent);
                        return;
                    }
                }
                A02(pendingIntent, c63344Shz, j);
            } catch (NullPointerException e) {
                e = e;
                str = "KeepaliveManager";
                str2 = "set alarm NullPointerException";
                C0K8.A0G(str, str2, e);
            } catch (SecurityException e2) {
                e = e2;
                str = "KeepaliveManager";
                str2 = "Failed to set alarm";
                C0K8.A0G(str, str2, e);
            } catch (RuntimeException e3) {
                e = e3;
                if (e.getCause() instanceof DeadObjectException) {
                    str = "KeepaliveManager";
                    str2 = "set alarm DeadObjectException";
                    C0K8.A0G(str, str2, e);
                }
                throw e;
            }
        }
    }

    public static void A02(PendingIntent pendingIntent, C63344Shz c63344Shz, long j) {
        String str;
        String str2;
        if (pendingIntent != null) {
            try {
                if (c63344Shz.A04 >= 23 && c63344Shz.A0M) {
                    c63344Shz.A0G.A02(c63344Shz.A06, 2, j, pendingIntent);
                } else {
                    c63344Shz.A06.set(2, j, pendingIntent);
                }
            } catch (NullPointerException e) {
                e = e;
                str = "KeepaliveManager";
                str2 = "set alarm NullPointerException";
                C0K8.A0G(str, str2, e);
            } catch (SecurityException e2) {
                e = e2;
                str = "KeepaliveManager";
                str2 = "Failed to set alarm";
                C0K8.A0G(str, str2, e);
            } catch (RuntimeException e3) {
                e = e3;
                if (e.getCause() instanceof DeadObjectException) {
                    str = "KeepaliveManager";
                    str2 = "set alarm DeadObjectException";
                    C0K8.A0G(str, str2, e);
                }
                throw e;
            }
        }
    }

    public C63344Shz(Context context, Handler handler, RealtimeSinceBootClock realtimeSinceBootClock, C3UW c3uw, C62670SLh c62670SLh, C63306ShC c63306ShC, String str, AtomicInteger atomicInteger, long j) {
        this.A0D = context;
        this.A0L = str;
        this.A0M = C3V2.A02(context.getPackageName());
        this.A0O = atomicInteger;
        this.A05 = j;
        AbstractC64515THi A00 = c62670SLh.A00(AlarmManager.class, "alarm");
        if (A00 instanceof C60546R6j) {
            throw AbstractC166987dD.A12("Cannot acquire Alarm service");
        }
        this.A06 = (AlarmManager) A00.A01();
        this.A0F = realtimeSinceBootClock;
        this.A04 = Build.VERSION.SDK_INT;
        this.A0E = handler;
        this.A0G = c3uw;
        this.A0H = c63306ShC;
        this.A0B = new Q1k(this, 8);
        StringBuilder A0s = AbstractC58318PtA.A0s(A0T);
        AbstractC58323PtF.A11(context, this.A0L, A0s);
        String obj = A0s.toString();
        this.A0J = obj;
        this.A08 = A00(context, AbstractC58318PtA.A0E(obj));
        this.A0C = new Q1k(this, 9);
        StringBuilder A0s2 = AbstractC58318PtA.A0s(A0Q);
        AbstractC58323PtF.A11(context, this.A0L, A0s2);
        String obj2 = A0s2.toString();
        this.A0K = obj2;
        this.A09 = A00(context, AbstractC58318PtA.A0E(obj2));
        this.A0A = new Q1k(this, 10);
        StringBuilder A0s3 = AbstractC58318PtA.A0s(A0S);
        AbstractC58323PtF.A11(context, this.A0L, A0s3);
        String obj3 = A0s3.toString();
        this.A0I = obj3;
        this.A07 = A00(context, AbstractC58318PtA.A0E(obj3));
    }
}
