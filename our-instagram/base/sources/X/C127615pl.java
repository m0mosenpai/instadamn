package X;

import com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.5pl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127615pl implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ C1345666g A06;
    public final /* synthetic */ MailboxFutureImpl A07;
    public final /* synthetic */ LoggingOption A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    public C127615pl(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, LoggingOption loggingOption, Number number, int i, int i2, int i3, int i4, int i5, long j, boolean z, boolean z2) {
        this.A06 = c1345666g;
        this.A01 = i;
        this.A07 = mailboxFutureImpl;
        this.A02 = i2;
        this.A00 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A05 = j;
        this.A09 = number;
        this.A08 = loggingOption;
        this.A0A = z;
        this.A0B = z2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", "loadThreadListData", this.A01);
        String str = (String) C1345666g.A00.A00(6);
        NotificationScope ED9 = accountSession.getSessionedNotificationCenterCallbackManager().ED9(new C43653JSl(this), str, 1);
        this.A07.setNotification(str, ED9);
        MailboxInstagramSecureMessageJNI.dispatchVIIIIJOOOOZZZZZZ(1, this.A02, this.A00, this.A04, this.A03, this.A05, accountSession, this.A09, this.A08, ED9, this.A0A, false, this.A0B, false, false, false);
    }
}
