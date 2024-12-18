package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.common.session.UserSession;

/* renamed from: X.6DQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6DQ implements InterfaceC13000lm {
    public boolean A00;
    public final C42201xA A01;
    public final C41761wQ A02;
    public final UserSession A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16660sJ A05;
    public final InterfaceC16660sJ A06;

    public C6DQ(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = interfaceC16820sZ;
        this.A06 = interfaceC16660sJ;
        this.A02 = new C41761wQ(null);
        this.A01 = AbstractC42021ws.A00();
        this.A05 = new C9EL(this, 14);
    }

    public static final C42221xC A00(C6DQ c6dq, final C137766Ly c137766Ly) {
        return c137766Ly.A09.A0L(new C6D2() { // from class: X.6J0
            @Override // X.C6D2
            public final Object apply(Object obj) {
                final C137766Ly c137766Ly2 = C137766Ly.this;
                final C1345666g c1345666g = (C1345666g) obj;
                return C42221xC.A07(new InterfaceC1345866i() { // from class: X.Lbr
                    @Override // X.InterfaceC1345866i
                    public final void EpD(C1346766r c1346766r) {
                        C137766Ly c137766Ly3 = c137766Ly2;
                        C1345666g c1345666g2 = c1345666g;
                        boolean z = c137766Ly3.A0H;
                        JRS A00 = JRS.A00(c1346766r, 42);
                        InterfaceExecutorC135866Co ASj = c1345666g2.mMailboxApiHandleMetaProvider.ASj(0);
                        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
                        int A002 = AbstractC1346866s.A00(A0D);
                        TraceInfo A0F = AbstractC43592JPx.A0F(A00, A0D, "MailboxInstagramSecureMessage", "loadTop20TamThreads");
                        if (!ASj.ELJ(new JWY(A002, 0, c1345666g2, A0D, z))) {
                            A0D.cancel(false);
                            AbstractC1346866s.A02(A002);
                            AbstractC1346866s.A03(A0F, "MailboxInstagramSecureMessage", "loadTop20TamThreads");
                        }
                        PlatformLogger.platformEventLog(5);
                    }
                }, AbstractC137146It.A00("load_top_20_threads"));
            }
        }).A0M(new C6J4(C6J3.A00)).A0J(new C6J8(new C50370MLx(25, c137766Ly, c6dq)));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.A01();
    }
}
