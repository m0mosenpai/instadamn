package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.ILm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41198ILm {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final JIB A02;
    public final Context A03;

    public final void A00() {
        JIB jib = this.A02;
        SavedCollection Ap1 = jib.Ap1();
        if (Ap1 != null) {
            Context context = this.A03;
            UserSession userSession = this.A01;
            C50674MYs c50674MYs = new C50674MYs(context, userSession);
            if (!Ap1.A07(userSession.userId) && Ap1.A05 == null && AbstractC35085Fcw.A00(userSession)) {
                HYQ hyq = new HYQ();
                c50674MYs.A01(new ViewOnClickListenerC42030Ijz(14, hyq, Ap1, this, jib), hyq.A00);
            } else if (Ap1.A07(userSession.userId)) {
                if (Ap1.A07 != EnumC33416Epn.A05) {
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36324170509856706L)) {
                        HYO hyo = new HYO();
                        c50674MYs.A01(new ViewOnClickListenerC42030Ijz(14, hyo, Ap1, this, jib), hyo.A00);
                    }
                    HYP hyp = new HYP();
                    c50674MYs.A03(new ViewOnClickListenerC42030Ijz(13, hyp, Ap1, this, jib), hyp.A00);
                    if (C18U.A06(c06090Tz, userSession, 36324170509922243L)) {
                        HYN hyn = new HYN();
                        c50674MYs.A03(new ViewOnClickListenerC42030Ijz(13, hyn, Ap1, this, jib), hyn.A00);
                    }
                }
                if (jib.CL7()) {
                    HYR hyr = new HYR();
                    c50674MYs.A03(new ViewOnClickListenerC42030Ijz(13, hyr, Ap1, this, jib), hyr.A00);
                }
            }
            if (AbstractC166987dD.A1b(c50674MYs.A09)) {
                new C31727DwY(c50674MYs).A05(AbstractC13330mJ.A00(context));
                return;
            }
            throw AbstractC31172DnG.A0u();
        }
    }

    public C41198ILm(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, JIB jib) {
        AbstractC167017dG.A1R(jib, userSession);
        this.A03 = context;
        this.A02 = jib;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }
}
