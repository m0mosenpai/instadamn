package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.Lc1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48448Lc1 implements InterfaceC1345866i {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final String A03;

    public C48448Lc1(Object obj, String str, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
        this.A03 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        InterfaceExecutorC135866Co ASj;
        MailboxFutureImpl A0I;
        MailboxCallback luh;
        switch (this.A00) {
            case 0:
                K3a k3a = (K3a) this.A02;
                String str = this.A03;
                long j = this.A01;
                C137766Ly c137766Ly = C137766Ly.A0L;
                JRS A00 = JRS.A00(c1346766r, 55);
                InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(k3a, 0);
                MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0C);
                int A002 = AbstractC1346866s.A00(A0D);
                TraceInfo A0F = AbstractC43592JPx.A0F(A00, A0D, "MailboxTam", "mCATamAttachmentManagerResolveContentToken");
                if (!A0C.ELJ(new LVI(A0D, k3a, str, A002, 6, j))) {
                    A0D.cancel(false);
                    AbstractC1346866s.A02(A002);
                    AbstractC1346866s.A03(A0F, "MailboxTam", "mCATamAttachmentManagerResolveContentToken");
                }
                PlatformLogger.platformEventLog(5);
                return;
            case 1:
                K3M k3m = (K3M) this.A02;
                String str2 = this.A03;
                long j2 = this.A01;
                C137766Ly c137766Ly2 = C137766Ly.A0L;
                JRS A003 = JRS.A00(c1346766r, 45);
                ASj = k3m.mMailboxApiHandleMetaProvider.ASj(0);
                A0I = AbstractC43593JPy.A0I(ASj, A003);
                luh = new LUH(A0I, k3m, str2, j2);
                AbstractC25231BEo.A1C(ASj, luh, A0I);
                return;
            default:
                MailboxFeature mailboxFeature = (MailboxFeature) this.A02;
                long j3 = this.A01;
                long parseLong = Long.parseLong(this.A03);
                PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "FBLegacyBroker", Long.toString(681066249448173L));
                C48169LTt c48169LTt = new C48169LTt(c1346766r);
                ASj = mailboxFeature.mMailboxApiHandleMetaProvider.ASj(0);
                A0I = AbstractC43593JPy.A0I(ASj, c48169LTt);
                luh = new C48182LUg(0, j3, parseLong, A0I, newPrivacyContextNative, mailboxFeature);
                AbstractC25231BEo.A1C(ASj, luh, A0I);
                return;
        }
    }
}
