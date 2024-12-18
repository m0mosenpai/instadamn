package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.contacts.ccu.intf.CCUJobService;

/* renamed from: X.Fxb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36161Fxb implements InterfaceC12870lZ, InterfaceC13000lm {
    public final Context A00;
    public final UserSession A01;

    private final void A00(String str) {
        UserSession userSession = this.A01;
        "continuous_contact_upload_job_scheduled".getClass();
        C19280xC A01 = C19280xC.A01("continuous_contact_upload_job_scheduled", null);
        A01.A0C(CacheBehaviorLogger.SOURCE, str);
        C19U A012 = AbstractC31172DnG.A0P(userSession).A01(C19T.A1R);
        if (A012 != null) {
            A01.A0C("phone_id", A012.A01);
        }
        AbstractC31173DnH.A1S(A01, userSession);
        C40Y.A00(this.A00, userSession).A04(new C902040d(new C901940c(CCUJobService.class, R.id.ccu_job_scheduler_id)));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A00("user_switch");
        C218914p.A06(this);
    }

    public C36161Fxb(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int i;
        int A03 = C0f9.A03(-478459038);
        UserSession userSession = this.A01;
        if (C18U.A06(C06090Tz.A05, userSession, 36311972802790223L)) {
            F14.A00(userSession);
            Context context = this.A00;
            C40Y A00 = C40Y.A00(context, userSession);
            C901940c c901940c = new C901940c(CCUJobService.class, R.id.ccu_job_scheduler_id);
            c901940c.A02 = 500L;
            A00.A03(context, userSession, new C902040d(c901940c));
            i = -1709967773;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
            String A002 = MSV.A00(497);
            if (currentTimeMillis - AbstractC31175DnJ.A03(A0x, A002) < 86400000) {
                i = 692654858;
            } else if (!AbstractC31172DnG.A1a(AbstractC166987dD.A0x(userSession), "allow_contacts_sync")) {
                i = 801816520;
            } else {
                Context context2 = this.A00;
                if (!C54P.A01(context2, userSession)) {
                    i = 1233289960;
                } else {
                    C23031Ai A003 = AbstractC23021Ah.A00(userSession);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    InterfaceC19610xo A0w = AbstractC166987dD.A0w(A003);
                    A0w.E7G(A002, currentTimeMillis2);
                    A0w.apply();
                    F14.A00(userSession);
                    C40Y A004 = C40Y.A00(context2, userSession);
                    C901940c c901940c2 = new C901940c(CCUJobService.class, R.id.ccu_job_scheduler_id);
                    c901940c2.A02 = 500L;
                    A004.A03(context2, userSession, new C902040d(c901940c2));
                    i = 1658942203;
                }
            }
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1042005621);
        A00(AbstractC43591JPw.A00(754));
        C0f9.A0A(-799065619, A03);
    }
}
