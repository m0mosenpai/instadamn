package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.Lah, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C48367Lah implements C6D2 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ Long A04;

    public /* synthetic */ C48367Lah(Long l, Long l2, int i, int i2, long j) {
        this.A02 = j;
        this.A03 = l;
        this.A04 = l2;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.C6D2
    public final Object apply(Object obj) {
        final long j = this.A02;
        final Long l = this.A03;
        final Long l2 = this.A04;
        final int i = this.A00;
        final int i2 = this.A01;
        final C1345666g c1345666g = (C1345666g) obj;
        C137766Ly c137766Ly = C137766Ly.A0L;
        return C42221xC.A07(new InterfaceC1345866i() { // from class: X.LcF
            @Override // X.InterfaceC1345866i
            public final void EpD(C1346766r c1346766r) {
                long longValue;
                C1345666g c1345666g2 = C1345666g.this;
                long j2 = j;
                Long l3 = l;
                Long l4 = l2;
                int i3 = i;
                int i4 = i2;
                C137766Ly c137766Ly2 = C137766Ly.A0L;
                long j3 = 0;
                if (l3 == null) {
                    longValue = 0;
                } else {
                    longValue = l3.longValue();
                }
                if (l4 != null) {
                    j3 = l4.longValue();
                }
                JRS A00 = JRS.A00(c1346766r, 43);
                InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(c1345666g2);
                MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0H);
                int A002 = AbstractC1346866s.A00(A0D);
                TraceInfo A0F = AbstractC43592JPx.A0F(A00, A0D, "MailboxInstagramSecureMessage", "loadThreadViewDataWithOptions");
                if (!A0H.ELJ(new C48197LUv(c1345666g2, A0D, A002, i3, i4, j2, longValue, j3))) {
                    A0D.cancel(false);
                    AbstractC1346866s.A02(A002);
                    AbstractC1346866s.A03(A0F, "MailboxInstagramSecureMessage", "loadThreadViewDataWithOptions");
                }
                PlatformLogger.platformEventLog(5);
            }
        }, AbstractC137146It.A00("load_local_messages"));
    }
}
