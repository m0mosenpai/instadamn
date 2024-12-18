package X;

import com.facebook.instagramuser.mca.MailboxInstagramUserJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.Map;

/* renamed from: X.5qk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128155qk implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C133255zr A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ boolean A03;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        final String str = (String) C133255zr.A00.A00(2);
        NotificationScope ED9 = accountSession.getSessionedNotificationCenterCallbackManager().ED9(new InterfaceC124965l1() { // from class: X.5ql
            @Override // X.InterfaceC124965l1
            public final void Dh3(Map map) {
                map.getClass();
                C128155qk.this.A02.setResult(MailboxFeature.getNonNullNotificationValue(C133255zr.A00, map, str, 4));
            }
        }, str, 1);
        this.A02.setNotification(str, ED9);
        MailboxInstagramUserJNI.dispatchVJOOZ(2, this.A00, accountSession, ED9, this.A03);
    }

    public C128155qk(C133255zr c133255zr, MailboxFutureImpl mailboxFutureImpl, long j, boolean z) {
        this.A01 = c133255zr;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A03 = z;
    }
}
