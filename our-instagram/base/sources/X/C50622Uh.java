package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.2Uh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50622Uh implements InterfaceC11380iw, InterfaceC13000lm, InterfaceC13060ls {
    public static final String __redex_internal_original_name = "QuietModeServiceHandler";
    public final UserSession A00;

    public final void A00(UserSession userSession, C71603Jf c71603Jf) {
        C65761Ttc A00;
        C69436VnL A03;
        Boolean valueOf;
        Map A0M;
        String str;
        long j;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36315980008394598L)) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            boolean A07 = c71603Jf.A07(currentTimeMillis);
            User user = c71603Jf.A01;
            boolean A1W = user.A1W();
            if (A07) {
                AbstractC24321Hb.A00(userSession).A00(false);
                C65761Ttc.A01(FDN.A00(this, userSession), c71603Jf.A03(0L), Boolean.valueOf(user.A1W()), null, null, null, null, null, null, null, "ig_quiet_mode_sound_turned_off", "service_handler", null, null);
                long A002 = c71603Jf.A00();
                long A003 = C123815iv.A00() / 1000;
                if ((System.currentTimeMillis() / 1000) - A003 <= A002) {
                    j = A003 + A002;
                } else {
                    if (c71603Jf.A06()) {
                        A003 += A002;
                    }
                    j = A003 + SandboxRepository.CACHE_TTL;
                }
                long j2 = (j - currentTimeMillis) + 1;
                C1GJ.A05(new C67995V5k(this), 1039187132, 3, (int) (j2 * 1000), false, true);
                A00 = FDN.A00(this, userSession);
                A03 = c71603Jf.A03(0L);
                valueOf = Boolean.valueOf(user.A1W());
                A0M = AbstractC16850sd.A0M(new C09530e4("seconds_till_next_quiet_mode_end", String.valueOf((int) j2)));
                str = "ig_quiet_mode_schedule_sound_turn_on";
            } else if (A1W) {
                long A01 = c71603Jf.A01();
                long A004 = C123815iv.A00() / 1000;
                if ((System.currentTimeMillis() / 1000) - A004 > A01) {
                    A004 += A01;
                    A01 = SandboxRepository.CACHE_TTL;
                }
                long currentTimeMillis2 = ((A004 + A01) - (System.currentTimeMillis() / 1000)) + 1;
                C1GJ.A05(new C67995V5k(this), 1039187132, 3, (int) (currentTimeMillis2 * 1000), false, true);
                A00 = FDN.A00(this, userSession);
                A03 = c71603Jf.A03(0L);
                valueOf = Boolean.valueOf(user.A1W());
                A0M = AbstractC16850sd.A0M(new C09530e4("seconds_till_quiet_mode_start", String.valueOf((int) currentTimeMillis2)));
                str = "ig_quiet_mode_schedule_sound_turn_off";
            } else {
                C65761Ttc.A01(FDN.A00(this, userSession), c71603Jf.A03(0L), Boolean.valueOf(user.A1W()), null, null, null, null, null, null, null, "ig_quiet_mode_sound_turn_off_no_scheduling", "service_handler", null, null);
                return;
            }
            C65761Ttc.A01(A00, A03, valueOf, null, null, null, null, null, null, null, str, "service_handler", null, A0M);
        }
    }

    @Override // X.InterfaceC13060ls
    public final void Cww(AbstractC12990ll abstractC12990ll) {
    }

    @Override // X.InterfaceC13060ls
    public final void Cwy(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        if (abstractC12990ll instanceof UserSession) {
            UserSession userSession = (UserSession) abstractC12990ll;
            C71603Jf c71603Jf = new C71603Jf(userSession);
            if (c71603Jf.A01.A1W() && C18U.A06(C06090Tz.A05, userSession, 36315980008394598L)) {
                A00(userSession, c71603Jf);
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "quiet_mode_service_handler";
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (AbstractC201688vy.A01(this.A00, C05F.A05)) {
            C24231Gs.A00().A02(this);
        }
    }

    public C50622Uh(UserSession userSession) {
        this.A00 = userSession;
    }
}
