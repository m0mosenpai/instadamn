package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.direct.msys.reverb.ReverbMessage;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LUh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48183LUh implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Integer num;
        if (this.A00 != 0) {
            List list = ((C47493KyM) obj).A00;
            ArrayList A1E = AbstractC166987dD.A1E();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.msys.reverb.ReverbMessage");
                L9R l9r = ((C47743L6k) this.A05).A00;
                long j = this.A01;
                Object obj3 = l9r.A00((C7OH) this.A04, (ReverbMessage) obj2, j, false).A00;
                if (obj3 != null) {
                    A1E.add(obj3);
                }
            }
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
            if (A1E.size() < ((List) this.A03).size()) {
                num = 10028;
            } else {
                num = null;
            }
            interfaceC16660sJ.invoke(AbstractC166987dD.A1L(A1E, num));
            return;
        }
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
        JRF A00 = JRF.A00(this, 47);
        AbstractC1345065z abstractC1345065z = K3Z.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxShim", "SHIMTransportHybridMoveIgFolder", A00);
    }

    public C48183LUh(int i, long j, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj;
        this.A01 = j;
        this.A05 = obj3;
        this.A04 = obj4;
    }
}
