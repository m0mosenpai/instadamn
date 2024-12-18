package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.File;

/* renamed from: X.SvU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63896SvU implements InterfaceC40591uS {
    public long A00;
    public File A01;
    public File A02;
    public File A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07 = false;
    public final int A08;
    public final Context A09;
    public final C40401u8 A0A;
    public final C39111rk A0B;
    public final C39111rk A0C;
    public final Class A0D;
    public final boolean A0E;
    public final InterfaceC38191q6 A0F;
    public final C38951rU A0G;

    private synchronized void A00(long j, long j2) {
        if (!this.A06) {
            Context context = this.A09;
            InterfaceC37781pG A04 = C39251s2.A00(context).A04(this.A0D.getName());
            int i = 19;
            if (this.A0A.A03 == C05F.A01) {
                i = 18;
            }
            AbstractC42721y0.A00(new Q1d(this), context, MSY.A09(A04.ALb("JobRanReceiver", i)));
            this.A06 = true;
        }
        if (this.A04 == null) {
            if (!this.A05) {
                this.A05 = true;
                this.A00 = AbstractC40481uH.A00(this.A09).A01(this.A08);
            }
            if (this.A00 > j) {
                if (j == 0 && j2 == 0) {
                    A02();
                } else {
                    AbstractC40481uH.A00(this.A09).A02(this.A0A, null, this.A08, j, j2);
                    this.A00 = j;
                }
            }
        }
    }

    public static synchronized void A01(C63896SvU c63896SvU) {
        synchronized (c63896SvU) {
            c63896SvU.A00 = Long.MAX_VALUE;
        }
    }

    @Override // X.InterfaceC40591uS
    public final void Ct2() {
        C39111rk c39111rk;
        C39111rk c39111rk2;
        synchronized (this) {
            this.A02 = this.A01;
        }
        if (C218914p.A08()) {
            c39111rk = this.A0B;
        } else {
            c39111rk = this.A0C;
        }
        long j = c39111rk.A02;
        if (C218914p.A08()) {
            c39111rk2 = this.A0B;
        } else {
            c39111rk2 = this.A0C;
        }
        A00(j, c39111rk2.A00);
    }

    @Override // X.InterfaceC40591uS
    public final void Ct6() {
        C39111rk c39111rk;
        C39111rk c39111rk2;
        synchronized (this) {
            this.A03 = this.A01;
        }
        if (C218914p.A08()) {
            c39111rk = this.A0B;
        } else {
            c39111rk = this.A0C;
        }
        long j = c39111rk.A03;
        if (C218914p.A08()) {
            c39111rk2 = this.A0B;
        } else {
            c39111rk2 = this.A0C;
        }
        A00(j, c39111rk2.A01);
    }

    @Override // X.InterfaceC40591uS
    public final synchronized void F8b() {
        A02();
    }

    public final synchronized void A02() {
        Context context = this.A09;
        AbstractC40481uH A00 = AbstractC40481uH.A00(context);
        int i = this.A08;
        ((C88603xK) A00).A01.cancel(i);
        A01(this);
        try {
            this.A04 = "com.facebook.analytics2.logger.UPLOAD_NOW";
            if (!C39981tM.A00(context).A01()) {
                C88613xM.A01().A02(context, null, this.A0A, new C88623xN(0L, 0L, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", i);
            } else {
                try {
                    C88613xM A01 = C88613xM.A01();
                    C40401u8 c40401u8 = this.A0A;
                    A01.A03(context, c40401u8, "com.facebook.analytics2.logger.UPLOAD_NOW", i, 300000L, this.A0E);
                    this.A07 = true;
                    C88643xQ.A00(context).A05(new C88633xO(context, null, null, c40401u8, new C88623xN(0L, 0L, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", i), "com.facebook.analytics2.logger.UPLOAD_NOW");
                } catch (IllegalArgumentException e) {
                    throw AbstractC58318PtA.A0f(e);
                }
            }
        } catch (Throwable th) {
        }
    }

    @Override // X.InterfaceC40591uS
    public final synchronized void CtY(String str) {
        try {
            this.A02 = null;
            this.A03 = null;
            Context context = this.A09;
            AbstractC40481uH A00 = AbstractC40481uH.A00(context);
            int i = this.A08;
            ((C88603xK) A00).A01.cancel(i);
            A01(this);
            this.A04 = "com.facebook.analytics2.logger.USER_LOGOUT";
            if (!C39981tM.A00(context).A01()) {
                C88613xM A01 = C88613xM.A01();
                C40401u8 c40401u8 = this.A0A;
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
                A01.A02(context, A0b, c40401u8, null, "com.facebook.analytics2.logger.USER_LOGOUT", i);
            } else {
                try {
                    C88643xQ A002 = C88643xQ.A00(context);
                    Bundle A0b2 = AbstractC166987dD.A0b();
                    A0b2.putString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
                    A002.A05(new C88633xO(context, A0b2, null, this.A0A, null, "com.facebook.analytics2.logger.USER_LOGOUT", i), "com.facebook.analytics2.logger.USER_LOGOUT");
                } catch (IllegalArgumentException e) {
                    throw AbstractC58318PtA.A0f(e);
                }
            }
        } catch (Throwable th) {
        }
    }

    @Override // X.InterfaceC40591uS
    public final /* bridge */ /* synthetic */ void EWx(Object obj) {
        File file = (File) obj;
        synchronized (this) {
            this.A01 = file;
        }
    }

    public C63896SvU(Context context, InterfaceC38191q6 interfaceC38191q6, C40401u8 c40401u8, C39111rk c39111rk, C39111rk c39111rk2, C38951rU c38951rU, Class cls, int i, boolean z) {
        this.A09 = context;
        this.A08 = i;
        this.A0A = c40401u8;
        this.A0F = interfaceC38191q6;
        this.A0D = cls;
        this.A0C = c39111rk;
        this.A0B = c39111rk2;
        A01(this);
        this.A0E = z;
        this.A0G = c38951rU;
    }

    @Override // X.InterfaceC40591uS
    public final void Ct7(long j) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC40591uS
    public final void Ct8(long[] jArr, int i, int i2) {
        throw C00O.createAndThrow();
    }
}
