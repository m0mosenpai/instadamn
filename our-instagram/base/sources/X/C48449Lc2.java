package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.Lc2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48449Lc2 implements InterfaceC1345866i {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C48449Lc2(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        K3a k3a;
        String str;
        long longValue;
        boolean z;
        InterfaceExecutorC135866Co ASj;
        MailboxFutureImpl A0D;
        String str2;
        String str3;
        int A00;
        TraceInfo A0F;
        int i;
        switch (this.A00) {
            case 0:
                k3a = (K3a) this.A01;
                Number number = (Number) this.A02;
                str = this.A03;
                C137766Ly c137766Ly = C137766Ly.A0L;
                longValue = number.longValue();
                JRS A002 = JRS.A00(c1346766r, 48);
                z = false;
                ASj = k3a.mMailboxApiHandleMetaProvider.ASj(0);
                A0D = AbstractC43592JPx.A0D(ASj);
                str2 = "MailboxTam";
                str3 = "runTamClientThreadSessionActivate";
                A00 = AbstractC1346866s.A00(A0D);
                A0F = AbstractC43592JPx.A0F(A002, A0D, "MailboxTam", "runTamClientThreadSessionActivate");
                i = 3;
                break;
            case 1:
                k3a = (K3a) this.A01;
                Number number2 = (Number) this.A02;
                str = this.A03;
                C137766Ly c137766Ly2 = C137766Ly.A0L;
                longValue = number2.longValue();
                JRS A003 = JRS.A00(c1346766r, 49);
                z = false;
                ASj = k3a.mMailboxApiHandleMetaProvider.ASj(0);
                A0D = AbstractC43592JPx.A0D(ASj);
                str2 = "MailboxTam";
                str3 = "runTamClientThreadSessionDeactivate";
                A00 = AbstractC1346866s.A00(A0D);
                A0F = AbstractC43592JPx.A0F(A003, A0D, "MailboxTam", "runTamClientThreadSessionDeactivate");
                i = 4;
                break;
            case 2:
                k3a = (K3a) this.A01;
                MsysThreadId msysThreadId = (MsysThreadId) this.A02;
                str = this.A03;
                longValue = msysThreadId.A00;
                C48169LTt c48169LTt = new C48169LTt(c1346766r);
                z = false;
                ASj = AbstractC43592JPx.A0C(k3a, 0);
                A0D = AbstractC43592JPx.A0D(ASj);
                str2 = "MailboxTam";
                str3 = "runTamClientThreadSaveDraftMessage";
                A00 = AbstractC1346866s.A00(A0D);
                A0F = AbstractC43592JPx.A0F(c48169LTt, A0D, "MailboxTam", "runTamClientThreadSaveDraftMessage");
                i = 1;
                break;
            default:
                C14360o3.A0B(c1346766r, 0);
                MailboxFeature mailboxFeature = (MailboxFeature) this.A02;
                String str4 = this.A03;
                LUF luf = new LUF(this.A01, c1346766r, str4, 8);
                InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(mailboxFeature, 0);
                MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0C, luf);
                AbstractC25231BEo.A1C(A0C, new LUF(mailboxFeature, A0I, str4, 7), A0I);
                return;
        }
        if (!ASj.ELJ(new LVI(A0D, k3a, str, A00, i, longValue))) {
            A0D.cancel(z);
            AbstractC1346866s.A02(A00);
            AbstractC1346866s.A03(A0F, str2, str3);
        }
        PlatformLogger.platformEventLog(5);
    }
}
