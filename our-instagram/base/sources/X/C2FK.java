package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2FK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FK implements InterfaceC41501vz, InterfaceC13000lm {
    public boolean A00;
    public final C25671My A01;
    public final UserSession A02;

    public C2FK(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AbstractC25651Mw.A00(userSession);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A02(this, C2FL.class);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-322309843);
        int A032 = C0f9.A03(-782360019);
        UserSession userSession = this.A02;
        C48082Iv A00 = AbstractC48072Iu.A00(userSession);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        boolean z = false;
        if (timeUnit.toDays(System.currentTimeMillis()) - timeUnit.toDays(A00.A00.getLong("last_used_time", 0L)) < 1) {
            z = true;
        }
        if (!this.A00) {
            if (C18U.A06(C06090Tz.A05, userSession, 36328186304412976L)) {
                AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.4tN
                    {
                        super("prefetchPresence", 1001645790, 3, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        UserSession userSession2 = C2FK.this.A02;
                        if (AbstractC23021Ah.A00(userSession2).A22()) {
                            AbstractC92924Ek.A00(userSession2).A06(C05F.A0C);
                        }
                    }
                });
            }
            if (z) {
                AbstractC24641Ih.A02.EpA(new AbstractC18280vF() { // from class: X.3Wl
                    {
                        super("warmDirectInboxCache", 367, 3, false, false);
                    }

                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C2FK c2fk = C2FK.this;
                        UserSession userSession2 = c2fk.A02;
                        C2JD.A00(C2DG.A00(userSession2).A09).CoR(true, "InitializerWarmCache");
                        if (C18U.A06(C06090Tz.A05, userSession2, 36328186304871734L)) {
                            ((C2DU) C2JD.A00(userSession2)).A01 = new C43990Jcd(null, new C37058GUs(c2fk, 32));
                        }
                    }
                });
            }
            this.A00 = true;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36328186304347439L)) {
            AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.4tY
                {
                    super("prefetchFriendsMapImage", 126519694, 3, false, false);
                }

                @Override // X.AbstractC18280vF
                public final void loggedRun() {
                    AbstractC37341oX A002 = C3L9.A00();
                    Context context = AbstractC12290kX.A00;
                    C14360o3.A07(context);
                    UserSession userSession2 = C2FK.this.A02;
                    A002.A02(context, userSession2, C05F.A00, new C206989Ed(userSession2, 40), context.getResources().getDimensionPixelSize(R.dimen.action_button_min_width));
                }
            });
        }
        if (C18U.A06(c06090Tz, userSession, 36329036707807206L) && (z || !C18U.A06(c06090Tz, userSession, 36329036707938280L))) {
            AbstractC24641Ih.A02.Ep8(new C45727KMe(this));
        }
        C0f9.A0A(-232666259, A032);
        C0f9.A0A(1637936923, A03);
    }
}
