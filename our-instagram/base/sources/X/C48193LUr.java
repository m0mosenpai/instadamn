package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* renamed from: X.LUr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48193LUr implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ K3X A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(K3X.A00, 48);
        NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 22);
        this.A02.setNotification(A0u, A00);
        MailboxInstagramMemJNI.dispatchVJOOOOOOO(13, this.A00, accountSession, this.A03, this.A07, this.A06, this.A04, this.A05, A00);
    }

    public C48193LUr(K3X k3x, MailboxFutureImpl mailboxFutureImpl, String str, String str2, String str3, List list, List list2, long j) {
        this.A01 = k3x;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A03 = str;
        this.A07 = list;
        this.A06 = list2;
        this.A04 = str2;
        this.A05 = str3;
    }
}
