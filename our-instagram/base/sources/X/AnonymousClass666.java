package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.Map;

/* renamed from: X.666, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass666 implements MailboxCallback {
    public final /* synthetic */ C1344865x A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    public AnonymousClass666(C1344865x c1344865x, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, Number number3, Number number4, Number number5, Number number6, Number number7, Number number8, String str, String str2) {
        this.A00 = c1344865x;
        this.A01 = mailboxFutureImpl;
        this.A05 = number;
        this.A04 = number2;
        this.A03 = number3;
        this.A02 = number4;
        this.A06 = number5;
        this.A08 = number6;
        this.A07 = number7;
        this.A0B = str;
        this.A0A = str2;
        this.A09 = number8;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        final String str = (String) C1344865x.A00.A00(49);
        NotificationScope ED9 = accountSession.getSessionedNotificationCenterCallbackManager().ED9(new InterfaceC124965l1() { // from class: X.66E
            @Override // X.InterfaceC124965l1
            public final void Dh3(Map map) {
                map.getClass();
                AnonymousClass666.this.A01.setResult(MailboxFeature.getNonNullNotificationValue(C1344865x.A00, map, str, 69));
            }
        }, str, 1);
        this.A01.setNotification(str, ED9);
        MailboxCoreJNI.dispatchVOOOOOOOOOOOOO(0, accountSession, this.A05, this.A04, this.A03, this.A02, this.A06, this.A08, this.A07, this.A0B, null, ED9, this.A0A, this.A09);
    }
}
