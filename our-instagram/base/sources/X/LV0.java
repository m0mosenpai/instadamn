package X;

import com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* loaded from: classes8.dex */
public final class LV0 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1345666g A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ LoggingOption A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", "createOptimisticThread", this.A00);
        String A0u = AbstractC43592JPx.A0u(C1345666g.A00, 4);
        NotificationScope A01 = LVN.A01(AbstractC43592JPx.A0E(accountSession), this, A0u, 22);
        this.A03.setNotification(A0u, A01);
        MailboxInstagramSecureMessageJNI.dispatchVIOOOOOZZZ(3, this.A01, accountSession, this.A06, this.A05, this.A04, A01, this.A07, this.A08, false);
    }

    public LV0(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, LoggingOption loggingOption, String str, List list, int i, int i2, boolean z, boolean z2) {
        this.A02 = c1345666g;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A01 = i2;
        this.A06 = list;
        this.A05 = str;
        this.A04 = loggingOption;
        this.A07 = z;
        this.A08 = z2;
    }
}
