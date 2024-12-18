package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.notificationengineinstagramintegrator.mca.MailboxNotificationEngineInstagramIntegratorJNI;

/* loaded from: classes8.dex */
public final class LV6 implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ K3S A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ Number A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;
    public final /* synthetic */ boolean A0J;
    public final /* synthetic */ boolean A0K;

    public LV6(MailboxFutureImpl mailboxFutureImpl, K3S k3s, Number number, Number number2, Number number3, Number number4, Number number5, Number number6, Number number7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = k3s;
        this.A00 = mailboxFutureImpl;
        this.A0A = str;
        this.A0F = str2;
        this.A08 = number;
        this.A0B = str3;
        this.A03 = number2;
        this.A0G = str4;
        this.A07 = number3;
        this.A06 = number4;
        this.A0E = str5;
        this.A0C = str6;
        this.A0D = str7;
        this.A04 = number5;
        this.A09 = str8;
        this.A05 = number6;
        this.A02 = number7;
        this.A0H = z;
        this.A0K = z2;
        this.A0I = z3;
        this.A0J = z4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(K3S.A00, 0);
        NotificationScope A01 = LVN.A01(AbstractC43592JPx.A0E(accountSession), this, A0u, 34);
        this.A00.setNotification(A0u, A01);
        MailboxNotificationEngineInstagramIntegratorJNI.dispatchVOOOOOOOOOOOOOOOOOOZZZZ(0, accountSession, this.A0A, this.A0F, this.A08, this.A0B, this.A03, this.A0G, this.A07, this.A06, this.A0E, this.A0C, this.A0D, this.A04, this.A09, null, this.A05, this.A02, A01, this.A0H, this.A0K, this.A0I, this.A0J);
    }
}
