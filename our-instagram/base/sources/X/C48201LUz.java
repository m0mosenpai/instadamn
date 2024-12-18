package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.LUz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48201LUz implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ android.net.Uri A02;
    public final /* synthetic */ K3X A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ byte[] A06;
    public final /* synthetic */ byte[] A07;
    public final /* synthetic */ byte[] A08;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(K3X.A00, 31);
        NotificationScope A01 = LVN.A01(AbstractC43592JPx.A0E(accountSession), this, A0u, 20);
        this.A04.setNotification(A0u, A01);
        MailboxInstagramMemJNI.dispatchVIJOOOOOOO(6, this.A00, this.A01, accountSession, this.A07, this.A06, this.A08, this.A05, this.A02, A01);
    }

    public C48201LUz(android.net.Uri uri, K3X k3x, MailboxFutureImpl mailboxFutureImpl, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, long j) {
        this.A03 = k3x;
        this.A04 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = j;
        this.A07 = bArr;
        this.A06 = bArr2;
        this.A08 = bArr3;
        this.A05 = str;
        this.A02 = uri;
    }
}
