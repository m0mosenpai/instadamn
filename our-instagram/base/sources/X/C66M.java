package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.Map;

/* renamed from: X.66M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C66M implements MailboxCallback {
    public final /* synthetic */ C1344865x A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ String A02;

    public C66M(C1344865x c1344865x, MailboxFutureImpl mailboxFutureImpl, String str) {
        this.A00 = c1344865x;
        this.A01 = mailboxFutureImpl;
        this.A02 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        final String str = (String) C1344865x.A00.A00(46);
        NotificationScope ED9 = accountSession.getSessionedNotificationCenterCallbackManager().ED9(new InterfaceC124965l1() { // from class: X.66N
            @Override // X.InterfaceC124965l1
            public final void Dh3(Map map) {
                map.getClass();
                C66M.this.A01.setResult(MailboxFeature.getNonNullNotificationValue(C1344865x.A00, map, str, 66));
            }
        }, str, 1);
        this.A01.setNotification(str, ED9);
        MailboxCoreJNI.dispatchVOOO(2, accountSession, this.A02, ED9);
    }
}
