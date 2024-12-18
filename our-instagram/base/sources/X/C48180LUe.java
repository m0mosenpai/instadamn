package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.LUe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48180LUe implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Object A04;
    public final Object A05;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        int i;
        boolean z;
        JRF A00;
        String str;
        String str2;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        int i3 = this.A01;
        if (i2 != 0) {
            AbstractC1346866s.A04("MailboxTam", "runTamClientMessageRangeLoadMoreBefore", i3);
            mailboxFutureImpl = (MailboxFutureImpl) this.A05;
            i = 0;
            z = false;
            A00 = JRF.A00(this, 69);
            str = "MCAMailboxTam";
            str2 = "TamClientMessageRangeLoadMoreBefore";
        } else {
            AbstractC1346866s.A04("MailboxTam", "runTamTransportHybridThreadMuteUntil", i3);
            mailboxFutureImpl = (MailboxFutureImpl) this.A05;
            i = 0;
            z = false;
            A00 = JRF.A00(this, 61);
            str = "MCAMailboxTam";
            str2 = "TamTransportHybridThreadMuteUntil";
        }
        AbstractC1345065z abstractC1345065z = K3a.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, z, i, 1, str, str2, A00);
    }

    public C48180LUe(MailboxFutureImpl mailboxFutureImpl, K3a k3a, int i, int i2, long j, long j2) {
        this.A00 = i2;
        this.A04 = k3a;
        this.A01 = i;
        this.A05 = mailboxFutureImpl;
        if (i2 != 0) {
            this.A03 = j;
            this.A02 = j2;
        } else {
            this.A02 = j;
            this.A03 = j2;
        }
    }
}
