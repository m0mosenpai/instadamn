package X;

import android.content.Context;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;

/* renamed from: X.1CL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CL {
    public final Context A00;
    public final UserSession A01;
    public final C23491Cl A02;
    public final C23481Ck A03;
    public final C1CM A04;

    public /* synthetic */ C1CL(UserSession userSession) {
        Context context = AbstractC12290kX.A00;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        C1CM c1cm = new C1CM(applicationContext);
        C23481Ck c23481Ck = new C23481Ck(context, userSession, c1cm);
        C23491Cl c23491Cl = new C23491Cl(context, userSession, c1cm);
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A04 = c1cm;
        this.A03 = c23481Ck;
        this.A02 = c23491Cl;
        Context applicationContext2 = context.getApplicationContext();
        C14360o3.A07(applicationContext2);
        this.A00 = applicationContext2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1I0 A00(C1EU c1eu, int i) {
        C23701Ea c23701Ea;
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36320511197848176L);
        String A04 = C18U.A04(c06090Tz, userSession, 36883461151326741L);
        boolean z = false;
        if ((A06 && !AbstractC16960so.A1Q("unknown", "feed_timeline").contains(C226218q.A01(AbstractC12960li.A00).A08)) || AbstractC001900j.A0R(A04, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0).contains(C226218q.A01(AbstractC12960li.A00).A08)) {
            z = true;
        }
        C1EN c1en = c1eu.A04;
        if (C1EV.A01(userSession, c1en) && !z) {
            C23481Ck c23481Ck = this.A03;
            UserSession userSession2 = c23481Ck.A01;
            C1EY A01 = C1EW.A01(userSession2, c1eu.A02());
            C14360o3.A0B(A01, 1);
            if (c1en == C1EN.A06) {
                c23701Ea = new Object();
            } else {
                c23701Ea = null;
            }
            C23711Eb c23711Eb = new C23711Eb(userSession2, 1957781489, 1, true);
            c23711Eb.A03 = -4;
            c23711Eb.A09(C05F.A01);
            c23711Eb.A0B("feed/timeline/");
            c23711Eb.A02 = c23701Ea;
            c23711Eb.A01 = new C23751Eh(new C07510aQ(userSession2), A01, C23741Eg.class, true, false);
            AbstractC23771Ej.A02(c23481Ck.A00, c23711Eb, userSession2, c1eu, c23481Ck.A02);
            return new C24561Hz(c23711Eb.A0N(), c1eu);
        }
        return new C62272sS(C23491Cl.A00(c1eu, this.A02, new C207179Ew(40, c1eu, this), i, 10), c1eu);
    }
}
