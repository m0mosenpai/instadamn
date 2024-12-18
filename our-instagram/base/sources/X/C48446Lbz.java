package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Lbz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48446Lbz implements InterfaceC1345866i {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Mailbox A01;
    public final /* synthetic */ String A02;

    public C48446Lbz(Mailbox mailbox, String str, int i) {
        this.A01 = mailbox;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        Mailbox mailbox = this.A01;
        if (!mailbox.isValid()) {
            c1346766r.A02(EnumC46176KcE.A04);
            c1346766r.A00();
            return;
        }
        AbstractC1345065z abstractC1345065z = K3S.A00;
        MailboxFeature mailboxFeature = new MailboxFeature(new C137266Jf(mailbox));
        String str = this.A02;
        int i = this.A00;
        JVL jvl = new JVL(c1346766r, 31);
        InterfaceExecutorC135866Co ASj = mailboxFeature.mMailboxApiHandleMetaProvider.ASj(0);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(ASj, jvl);
        AbstractC25231BEo.A1C(ASj, new LUS(mailboxFeature, A0I, str, i, 1), A0I);
    }
}
