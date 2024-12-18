package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2Wg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51102Wg {
    public final UserSession A00;
    public final long A01;
    public final long A02;
    public final boolean A03;
    public final boolean A04;

    private final void A00() {
        C18V c18v = C18V.A01;
        UserSession userSession = this.A00;
        AbstractC23021Ah.A00(userSession);
        if (c18v != null) {
            c18v.A03(userSession);
            c18v.A06(userSession, false);
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.4HO
                {
                    super(88983322, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UserSession userSession2 = C51102Wg.this.A00;
                    if (userSession2 != null) {
                        C23031Ai A00 = AbstractC23021Ah.A00(userSession2);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        InterfaceC19610xo ARD = A00.A01.ARD();
                        ARD.E7G("mobile_config_last_sync_time_peak", elapsedRealtime);
                        ARD.apply();
                    }
                }
            });
        }
    }

    public final void A01() {
        C18V c18v = C18V.A01;
        UserSession userSession = this.A00;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (c18v != null) {
            InterfaceC19630xq interfaceC19630xq = A00.A01;
            long elapsedRealtime = SystemClock.elapsedRealtime() - interfaceC19630xq.getLong("mobile_config_last_sync_time_peak", 0L);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            boolean z = false;
            if (elapsedRealtime > timeUnit.convert(this.A01, TimeUnit.HOURS)) {
                z = true;
            }
            boolean z2 = false;
            if (elapsedRealtime < timeUnit.convert(this.A02, TimeUnit.MINUTES)) {
                z2 = true;
            }
            boolean z3 = C23051Ak.A05;
            boolean A002 = C23061Al.A00(userSession).A00(EnumC23071Am.A0I);
            if ((!A002 || !this.A03 || z) && !z2) {
                if (this.A04) {
                    if (A002 && this.A03 && !interfaceC19630xq.getBoolean("mobile_config_has_pending_update", false)) {
                        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                        ARD.E77("mobile_config_has_pending_update", true);
                        ARD.apply();
                        synchronized (C23061Al.A00(userSession)) {
                            C23051Ak.A09.addIfAbsent(this);
                        }
                        return;
                    }
                    A00();
                    InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                    ARD2.E77("mobile_config_has_pending_update", false);
                    ARD2.apply();
                    return;
                }
                A00();
            }
        }
    }

    public final void A02() {
        if (this.A04) {
            InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(this.A00).A01;
            if (interfaceC19630xq.getBoolean("mobile_config_has_pending_update", false)) {
                A00();
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E77("mobile_config_has_pending_update", false);
                ARD.apply();
            }
        }
    }

    public C51102Wg(UserSession userSession) {
        this.A00 = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A04 = C18U.A06(c06090Tz, userSession, 36325815482398097L);
        this.A01 = C18U.A01(c06090Tz, userSession, 36607290459166286L);
        this.A02 = C18U.A01(c06090Tz, userSession, 36607290459231823L);
        this.A03 = C18U.A06(c06090Tz, userSession, 36325815482660243L);
    }
}
