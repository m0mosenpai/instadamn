package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

/* renamed from: X.LaX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48357LaX implements C6D2 {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C48357LaX(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        CompletableFuture A00;
        BQB bqb;
        int i;
        switch (this.A00) {
            case 0:
                C0K8.A0D("EncryptedBackupsOneTimeCodeEnterCodeViewModel", "sendOtcNotifications fetchingOtDevices");
                LFN lfn = LFN.A00;
                C44458JlQ c44458JlQ = (C44458JlQ) this.A01;
                A00 = lfn.A00(c44458JlQ.A04);
                bqb = new BQB(10, c44458JlQ, obj, this.A02);
                i = 9;
                break;
            case 1:
                C0K8.A0D("EncryptedBackupsOneTimeCodeWaitViewModel", "sendOtcNotifications fetchingOtDevices");
                LFN lfn2 = LFN.A00;
                C44457JlP c44457JlP = (C44457JlP) this.A01;
                A00 = lfn2.A00(c44457JlP.A06);
                bqb = new BQB(11, c44457JlP, obj, this.A02);
                i = 10;
                break;
            default:
                C46h c46h = (C46h) obj;
                C14360o3.A0B(c46h, 0);
                if ((c46h instanceof C4JL) && ((InterfaceC40801un) c46h.A03()).isOk()) {
                    C41698IdR c41698IdR = (C41698IdR) this.A01;
                    C18A c18a = c41698IdR.A04;
                    C08730cb c08730cb = C17060sy.A01;
                    UserSession userSession = c41698IdR.A03;
                    c18a.A03(c08730cb.A01(userSession));
                    C34932FaI.A01.A02(userSession);
                    return new C132955zK(C41698IdR.A00(c41698IdR));
                }
                C08730cb c08730cb2 = C17060sy.A01;
                C41698IdR c41698IdR2 = (C41698IdR) this.A01;
                User A01 = c08730cb2.A01(c41698IdR2.A03);
                A01.A03.Ege(AbstractC31172DnG.A0s(this.A02));
                C48496Lcn c48496Lcn = new C48496Lcn("error");
                c41698IdR2.A02.accept(C41698IdR.A00(c41698IdR2));
                return c48496Lcn;
        }
        return A00.thenAccept((Consumer) new M8M(i, bqb));
    }
}
