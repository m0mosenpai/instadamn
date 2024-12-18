package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.facebook.msys.util.NotificationScope;
import com.facebook.urlblackholestandalone.mca.MailboxUrlBlackholeStandaloneJNI;

/* renamed from: X.91V, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C91V implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ C91S A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        StandaloneDatabaseHandle standaloneDatabaseHandle = (StandaloneDatabaseHandle) obj;
        String str = (String) C91S.A00.A00(4);
        NotificationScope ED9 = ((C124935ky) standaloneDatabaseHandle.getNotificationCenterCallbackManager()).ED9(new C23376AYa(this, str), str, 1);
        this.A00.setNotification(str, ED9);
        MailboxUrlBlackholeStandaloneJNI.dispatchVOOOOOOO(1, standaloneDatabaseHandle, this.A02, this.A03, this.A04, this.A05, this.A06, ED9);
    }

    public C91V(MailboxFutureImpl mailboxFutureImpl, C91S c91s, String str, String str2, String str3, String str4, String str5) {
        this.A01 = c91s;
        this.A00 = mailboxFutureImpl;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
    }
}
