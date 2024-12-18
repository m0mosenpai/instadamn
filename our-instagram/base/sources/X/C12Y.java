package X;

import com.instagram.common.session.UserSession;
import com.instagram.screentime.IGScreenTimeApi;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.12Y, reason: invalid class name */
/* loaded from: classes.dex */
public final class C12Y implements InterfaceC13000lm {
    public static final C99004cK A0A = new Object() { // from class: X.4cK
    };
    public final int A00;
    public final int A01;
    public final int A02;
    public final IGScreenTimeApi A03;
    public final AtomicBoolean A04;
    public final boolean A05;
    public final UserSession A06;
    public final AtomicReference A07;
    public final C19L A08;
    public final C19L A09;

    public C12Y(UserSession userSession, IGScreenTimeApi iGScreenTimeApi) {
        C14360o3.A0B(iGScreenTimeApi, 2);
        this.A06 = userSession;
        this.A03 = iGScreenTimeApi;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A05 = C18U.A06(c06090Tz, userSession, 36324973668741751L);
        int A01 = (int) C18U.A01(c06090Tz, userSession, 36606448645838289L);
        this.A00 = A01 < 3 ? 3 : A01;
        int A012 = (int) C18U.A01(c06090Tz, userSession, 36606448645641679L);
        this.A01 = A012 < 60 ? 60 : A012;
        int A013 = (int) C18U.A01(c06090Tz, userSession, 36606448645772752L);
        this.A02 = A013 < 30 ? 30 : A013;
        C12L c12l = C12L.A00;
        this.A09 = AnonymousClass194.A02(c12l.CPG(487035921, 3));
        this.A08 = AnonymousClass194.A02(c12l.AOT(487035921, 3));
        this.A04 = new AtomicBoolean(false);
        this.A07 = new AtomicReference();
    }

    public static final void A00(C12Y c12y) {
        try {
            if (c12y.A05 && !c12y.A04.get()) {
                AtomicReference atomicReference = c12y.A07;
                AnonymousClass195 anonymousClass195 = (AnonymousClass195) atomicReference.get();
                if (anonymousClass195 != null && anonymousClass195.isActive()) {
                    return;
                }
                synchronized (c12y) {
                    AnonymousClass195 anonymousClass1952 = (AnonymousClass195) atomicReference.get();
                    if (anonymousClass1952 == null || !anonymousClass1952.isActive()) {
                        C19L c19l = c12y.A08;
                        C206649Cv c206649Cv = new C206649Cv(c12y, null, 33);
                        atomicReference.set(AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, c19l));
                    }
                }
            }
        } catch (Exception e) {
            C0K8.A0F("IgScreenTimeSyncListener", "Error in ensureJobRunning", e);
        }
    }

    public static final void A01(C12Y c12y, String str) {
        if (!c12y.A04.get()) {
            C19L c19l = c12y.A09;
            C9DZ c9dz = new C9DZ(c12y, str, null, 6);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dz, c19l);
        }
    }

    public static final void A02(C12Y c12y, boolean z, boolean z2) {
        try {
            c12y.A03.A00.A02(z, z2);
        } catch (Exception e) {
            C0K8.A0F("IgScreenTimeSyncListener", "Error on notifyForegroundTracker", e);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (this.A05) {
            try {
                boolean z = false;
                if (C65705Tsd.A08.A05.A07() == C07S.RESUMED) {
                    z = true;
                }
                A02(this, z, false);
                this.A04.set(true);
                A01(this, "LOGOUT");
                C1EM.A00(this, null, C11V.A01);
                UserSession userSession = this.A06;
                userSession.A03(C12Y.class);
                userSession.A03(IGScreenTimeApi.class);
                C0K8.A01(4, "IgScreenTimeSyncListener", "Session ended");
            } catch (Exception e) {
                C0K8.A0F("IgScreenTimeSyncListener", "Error on onSessionWillEnd", e);
            }
        }
    }
}
