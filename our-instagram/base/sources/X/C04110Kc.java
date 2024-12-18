package X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0Kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04110Kc extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04110Kc(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A01.appContext;
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(context, c211211o) { // from class: X.14h
            public final Context A00;
            public final C211211o A01;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
                this.A01 = c211211o;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "BackgroundColdStartInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                UserSession userSession;
                AbstractC12990ll A08 = ((AnonymousClass122) this.A01.A00()).A08();
                if ((A08 instanceof UserSession) && (userSession = (UserSession) A08) != null) {
                    if (!AbstractC23021Ah.A00(AbstractC51082We.A00(userSession).A00).A01.getBoolean("mobile_config_has_pending_update", false)) {
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (!C18U.A06(c06090Tz, userSession, 36328151945657597L) && !C18U.A06(C06090Tz.A06, userSession, 36331012393682043L) && !C18U.A06(c06090Tz, userSession, 36319562009943573L) && !C18U.A06(c06090Tz, userSession, 36328508426894925L) && !C18U.A06(c06090Tz, userSession, 36320897744774120L)) {
                            return;
                        }
                    }
                    InterfaceC24811Iz interfaceC24811Iz = AbstractC24641Ih.A02;
                    C14360o3.A07(interfaceC24811Iz);
                    final C100134eb c100134eb = new C100134eb(this.A00, userSession);
                    interfaceC24811Iz.Ep8(new AbstractC18280vF() { // from class: X.4ec
                        {
                            super("BackgrounColdStartScheduler", 1912120985, 3, false, false);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            C1KX c1kx = C226218q.A01(AbstractC12960li.A00).A04;
                            if (c1kx != null && c1kx.A0O == C1CA.A03 && !c1kx.A0E) {
                                C100134eb c100134eb2 = C100134eb.this;
                                long j = C23051Ak.A02;
                                UserSession userSession2 = c100134eb2.A01;
                                C23061Al.A00(userSession2);
                                if ((SystemClock.elapsedRealtime() - C23051Ak.A02) / 1000 < 300) {
                                    C100134eb.A00(c100134eb2);
                                } else {
                                    AbstractC1118452w.A00(userSession2, new C73483YFg(c100134eb2));
                                }
                            }
                        }
                    });
                }
            }
        };
    }
}
