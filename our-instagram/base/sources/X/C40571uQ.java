package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.R;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.1uQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40571uQ implements InterfaceC40591uS {
    public long A00;
    public HandlerThread A01;
    public C42131x3 A02;
    public C42171x7 A03;
    public AbstractC40481uH A04;
    public File A05;
    public File A06;
    public File A07;
    public String A08;
    public Executor A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E;
    public final Context A0F;
    public final C40401u8 A0G;
    public final Class A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final long A0K;
    public final C39921tG A0L;
    public final C38951rU A0M;

    private synchronized void A00(C42131x3 c42131x3) {
        long j;
        if (!this.A0B) {
            Context context = this.A0F;
            InterfaceC37781pG A04 = C39251s2.A00(context).A04(this.A0H.getName());
            int i = 19;
            if (this.A0G.A03 == C05F.A01) {
                i = 18;
            }
            this.A03 = new C42171x7(this);
            HandlerThread ALb = A04.ALb("JobRanReceiver", i);
            this.A01 = ALb;
            if (this.A0I) {
                this.A03.A00 = new Handler(ALb.getLooper());
                C019707r.A00(context).A01(this.A03, new IntentFilter("com.facebook.analytics2.action.UPLOAD_JOB_RAN"));
                AbstractC42721y0.A00 = true;
            } else {
                AbstractC42721y0.A00(this.A03, context, new Handler(ALb.getLooper()));
            }
            this.A0B = true;
        }
        if (this.A08 == null) {
            AbstractC40481uH abstractC40481uH = this.A04;
            if (abstractC40481uH != null) {
                j = abstractC40481uH.A01(R.id.jobscheduler_analytics2_micro_batch);
            } else {
                if (!this.A0A) {
                    this.A0A = true;
                    this.A00 = AbstractC40481uH.A00(this.A0F).A01(R.id.jobscheduler_analytics2_micro_batch);
                }
                j = this.A00;
            }
            long j2 = c42131x3.A01;
            if (j > j2) {
                long j3 = c42131x3.A00;
                if (j2 == 0 && j3 == 0) {
                    A04();
                } else {
                    if (abstractC40481uH != null) {
                        abstractC40481uH.A02(this.A0G, null, R.id.jobscheduler_analytics2_micro_batch, j2, j3);
                    } else {
                        AbstractC40481uH.A00(this.A0F).A02(this.A0G, null, R.id.jobscheduler_analytics2_micro_batch, j2, j3);
                    }
                    this.A00 = j2;
                }
            }
        }
    }

    private synchronized void A01(C42131x3 c42131x3) {
        this.A07 = this.A05;
        A02(c42131x3);
    }

    private synchronized void A02(C42131x3 c42131x3) {
        C42131x3 c42131x32 = this.A02;
        if (c42131x32 == null || c42131x3.A01 < c42131x32.A01) {
            this.A02 = c42131x3;
        }
    }

    public static synchronized void A03(C40571uQ c40571uQ) {
        synchronized (c40571uQ) {
            c40571uQ.A00 = Long.MAX_VALUE;
        }
    }

    @Override // X.InterfaceC40591uS
    public final synchronized void F8b() {
        A04();
    }

    public final synchronized void A04() {
        Context context = this.A0F;
        ((C88603xK) AbstractC40481uH.A00(context)).A01.cancel(R.id.jobscheduler_analytics2_micro_batch);
        A03(this);
        try {
            this.A08 = "com.facebook.analytics2.logger.UPLOAD_NOW";
            if (!C39981tM.A00(context).A01()) {
                C88613xM.A01().A02(context, null, this.A0G, new C88623xN(0L, 0L, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", R.id.jobscheduler_analytics2_micro_batch);
            } else {
                try {
                    C88613xM A01 = C88613xM.A01();
                    C40401u8 c40401u8 = this.A0G;
                    A01.A03(context, c40401u8, "com.facebook.analytics2.logger.UPLOAD_NOW", R.id.jobscheduler_analytics2_micro_batch, this.A0K, this.A0J);
                    this.A0C = true;
                    C88643xQ.A00(context).A05(new C88633xO(context, null, null, c40401u8, new C88623xN(0L, 0L, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", R.id.jobscheduler_analytics2_micro_batch), "com.facebook.analytics2.logger.UPLOAD_NOW");
                } catch (IllegalArgumentException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Throwable th) {
        }
    }

    @Override // X.InterfaceC40591uS
    public final void Ct2() {
        C42131x3 c42131x3 = this.A02;
        synchronized (this) {
            this.A06 = this.A05;
            A02(c42131x3);
        }
        A00(this.A02);
    }

    @Override // X.InterfaceC40591uS
    public final void Ct6() {
        A01(this.A02);
        A00(this.A02);
    }

    @Override // X.InterfaceC40591uS
    public final void Ct7(long j) {
        C42131x3 A01 = this.A0L.A01(j);
        A01(A01);
        A00(A01);
    }

    @Override // X.InterfaceC40591uS
    public final void Ct8(long[] jArr, int i, int i2) {
        C39921tG c39921tG = this.A0L;
        C42131x3 A00 = C39921tG.A00(c39921tG);
        long j = A00.A01;
        long j2 = A00.A00;
        while (i < i2) {
            C42131x3 A01 = c39921tG.A01(jArr[i]);
            j = Math.min(j, A01.A01);
            j2 = Math.min(j2, A01.A00);
            i++;
        }
        C42131x3 c42131x3 = new C42131x3(j, j2);
        A01(c42131x3);
        A00(c42131x3);
    }

    @Override // X.InterfaceC40591uS
    public final synchronized void CtY(String str) {
        try {
            this.A06 = null;
            this.A07 = null;
            this.A02 = null;
            Context context = this.A0F;
            ((C88603xK) AbstractC40481uH.A00(context)).A01.cancel(R.id.jobscheduler_analytics2_micro_batch);
            A03(this);
            this.A08 = "com.facebook.analytics2.logger.USER_LOGOUT";
            if (!C39981tM.A00(context).A01()) {
                C88613xM A01 = C88613xM.A01();
                C40401u8 c40401u8 = this.A0G;
                Bundle bundle = new Bundle();
                bundle.putString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
                A01.A02(context, bundle, c40401u8, null, "com.facebook.analytics2.logger.USER_LOGOUT", R.id.jobscheduler_analytics2_micro_batch);
            } else {
                try {
                    C88643xQ A00 = C88643xQ.A00(context);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
                    A00.A05(new C88633xO(context, bundle2, null, this.A0G, null, "com.facebook.analytics2.logger.USER_LOGOUT", R.id.jobscheduler_analytics2_micro_batch), "com.facebook.analytics2.logger.USER_LOGOUT");
                } catch (IllegalArgumentException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Throwable th) {
        }
    }

    @Override // X.InterfaceC40591uS
    public final /* bridge */ /* synthetic */ void EWx(Object obj) {
        File file = (File) obj;
        synchronized (this) {
            this.A05 = file;
        }
    }

    public C40571uQ(Context context, C39921tG c39921tG, C40401u8 c40401u8, AbstractC40481uH abstractC40481uH, C38951rU c38951rU, Class cls, Executor executor, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0F = context;
        this.A0G = c40401u8;
        this.A0H = cls;
        this.A0L = c39921tG;
        A03(this);
        this.A0J = z;
        this.A0K = j;
        this.A04 = abstractC40481uH;
        this.A0D = z2;
        this.A0I = z3;
        this.A0M = c38951rU;
        this.A0E = z4;
        this.A09 = executor;
    }
}
