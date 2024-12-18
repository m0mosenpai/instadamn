package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.LcL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48468LcL implements InterfaceC1345866i {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C48468LcL(Object obj, Object obj2, String str, String str2, String str3, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        String str;
        String str2;
        int A00;
        TraceInfo A0F;
        Long l;
        int i = this.A00;
        C1345666g c1345666g = (C1345666g) this.A02;
        if (i != 0) {
            long j = this.A01;
            String str3 = this.A04;
            Boolean bool = (Boolean) this.A03;
            String str4 = this.A05;
            String str5 = this.A06;
            boolean booleanValue = bool.booleanValue();
            if (str5 != null && str5.length() != 0) {
                l = AbstractC25228BEl.A13(str5);
            } else {
                l = null;
            }
            C48169LTt c48169LTt = new C48169LTt(c1346766r);
            InterfaceExecutorC135866Co ASj = c1345666g.mMailboxApiHandleMetaProvider.ASj(0);
            MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
            str = "MailboxInstagramSecureMessage";
            str2 = "runInstagramReactionSetOptimistic";
            A00 = AbstractC1346866s.A00(A0D);
            A0F = AbstractC43592JPx.A0F(c48169LTt, A0D, "MailboxInstagramSecureMessage", "runInstagramReactionSetOptimistic");
            if (!ASj.ELJ(new C48196LUu(c1345666g, A0D, l, str3, str4, A00, booleanValue ? 1 : 0, j))) {
                A0D.cancel(false);
                AbstractC1346866s.A02(A00);
                AbstractC1346866s.A03(A0F, str, str2);
            }
        } else {
            InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) this.A03;
            long j2 = this.A01;
            String str6 = this.A04;
            String str7 = this.A05;
            String str8 = this.A06;
            long A09 = JQ0.A09(interfaceC132965zL);
            if (AbstractC116315Ok.A00(str6)) {
                str6 = null;
            }
            JRS A002 = JRS.A00(c1346766r, 69);
            InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(c1345666g);
            MailboxFutureImpl A0D2 = AbstractC43592JPx.A0D(A0H);
            str = "MailboxInstagramSecureMessage";
            str2 = "forward";
            A00 = AbstractC1346866s.A00(A0D2);
            A0F = AbstractC43592JPx.A0F(A002, A0D2, "MailboxInstagramSecureMessage", "forward");
            if (!A0H.ELJ(new C48198LUw(c1345666g, A0D2, str6, str7, str8, A00, A09, j2))) {
                A0D2.cancel(false);
                AbstractC1346866s.A02(A00);
                AbstractC1346866s.A03(A0F, str, str2);
            }
        }
        PlatformLogger.platformEventLog(5);
    }
}
