package X;

import com.facebook.instagramuser.mca.MailboxInstagramUserJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.Map;

/* renamed from: X.5zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133265zs implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C133255zr A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String str = (String) C133255zr.A00.A00(0);
        NotificationScope ED9 = accountSession.getSessionedNotificationCenterCallbackManager().ED9(new InterfaceC124965l1() { // from class: X.5zu
            @Override // X.InterfaceC124965l1
            public final void Dh3(Map map) {
                map.getClass();
                C133265zs.this.A02.setResult(new MailboxNullable(map.get(C133255zr.A00.A00(5))));
            }
        }, str, 1);
        this.A02.setNotification(str, ED9);
        MailboxInstagramUserJNI.dispatchVIIJOOOOOZ(0, 0, 0, this.A00, accountSession, this.A04, null, this.A03, ED9, true);
    }

    public C133265zs(C133255zr c133255zr, MailboxFutureImpl mailboxFutureImpl, String str, String str2, long j) {
        this.A01 = c133255zr;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A04 = str;
        this.A03 = str2;
    }
}
