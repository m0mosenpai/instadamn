package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: classes8.dex */
public final class LUI implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ K3D A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ String A04;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A02, AbstractC43593JPy.A0J(), 0, 1, "MCAMailboxFTS", "MessengerFTSACTQueryMessages", JRF.A00(this, 11));
    }

    public LUI(K3D k3d, MailboxFutureImpl mailboxFutureImpl, Number number, String str, long j) {
        this.A01 = k3d;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A04 = str;
        this.A03 = number;
    }
}
