package X;

import com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.LUj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48185LUj implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ K3Y A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        AbstractC1346866s.A04("MailboxInstagramReverb", "loadMessagesForReporting", this.A00);
        String A0u = AbstractC43592JPx.A0u(K3Y.A00, 13);
        NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 31);
        this.A02.setNotification(A0u, A00);
        MailboxInstagramReverbJNI.dispatchVOOOOOOZ(8, accountSession, this.A05, this.A04, this.A03, null, A00, this.A06);
    }

    public C48185LUj(K3Y k3y, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, String str, int i, boolean z) {
        this.A01 = k3y;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A05 = str;
        this.A04 = number;
        this.A03 = number2;
        this.A06 = z;
    }
}
