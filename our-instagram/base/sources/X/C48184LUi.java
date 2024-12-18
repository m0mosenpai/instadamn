package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.secureauthplatformpake.mca.MailboxSecureAuthPlatformPakeJNI;

/* renamed from: X.LUi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48184LUi implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        if (this.A00 != 0) {
            String A0u = AbstractC43592JPx.A0u(K3T.A00, 1);
            NotificationScope ED9 = AbstractC43592JPx.A0E(accountSession).ED9(new C43725JVk(A0u, this, 46), A0u, 1);
            AbstractC43592JPx.A1P(ED9, this.A03, A0u);
            MailboxSecureAuthPlatformPakeJNI.dispatchVOOOOO(3, accountSession, this.A05, this.A02, this.A04, ED9);
            return;
        }
        String A0u2 = AbstractC43592JPx.A0u(K3X.A00, 51);
        NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u2, 24);
        AbstractC43592JPx.A1P(A00, this.A02, A0u2);
        MailboxInstagramMemJNI.dispatchVOOOOOO(15, accountSession, this.A05, this.A03, this.A04, "logid", A00);
    }

    public C48184LUi(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A05 = str;
        this.A03 = obj3;
        this.A04 = str2;
    }
}
