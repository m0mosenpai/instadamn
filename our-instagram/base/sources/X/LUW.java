package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: classes8.dex */
public final class LUW implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C125815mW A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ byte[] A05;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        JRF A00 = JRF.A00(this, 3);
        AbstractC1345065z abstractC1345065z = C125815mW.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxAdvancedCryptoTransport", "SecureMessageUpsertICDCMetadata", A00);
    }

    public LUW(C125815mW c125815mW, MailboxFutureImpl mailboxFutureImpl, byte[] bArr, int i, long j, boolean z) {
        this.A02 = c125815mW;
        this.A03 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = j;
        this.A05 = bArr;
        this.A04 = z;
    }
}
