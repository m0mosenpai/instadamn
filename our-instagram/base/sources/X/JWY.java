package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: classes8.dex */
public final class JWY implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (this.A00 != 0) {
            if (AbstractC31177DnL.A1b(obj)) {
                ((C132065xh) this.A03).A01.A00(this.A01, this.A04);
            }
            C1346766r c1346766r = (C1346766r) this.A02;
            c1346766r.A02(obj);
            c1346766r.A00();
            return;
        }
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", "loadTop20TamThreads", this.A01);
        MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
        MailboxNullable A0J = AbstractC43593JPy.A0J();
        JRF A00 = JRF.A00(this, 35);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0J, 0, 0, "MCAMailboxInstagramSecureMessage", "Top20TamThreads", A00);
    }

    public JWY(int i, int i2, Object obj, Object obj2, boolean z) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = obj2;
        this.A04 = z;
    }
}
