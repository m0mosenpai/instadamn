package X;

import com.facebook.instagrammem.mca.MailboxInstagramMem$BytesAvailableHandlerCallback;
import com.facebook.instagrammem.mca.MailboxInstagramMem$StreamingDownloadCompletionHandlerCallback;
import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* loaded from: classes8.dex */
public final class LV5 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ android.net.Uri A04;
    public final /* synthetic */ MailboxInstagramMem$BytesAvailableHandlerCallback A05;
    public final /* synthetic */ MailboxInstagramMem$StreamingDownloadCompletionHandlerCallback A06;
    public final /* synthetic */ K3X A07;
    public final /* synthetic */ MailboxFutureImpl A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ byte[] A0B;
    public final /* synthetic */ byte[] A0C;
    public final /* synthetic */ byte[] A0D;
    public final /* synthetic */ byte[] A0E;

    public LV5(android.net.Uri uri, MailboxInstagramMem$BytesAvailableHandlerCallback mailboxInstagramMem$BytesAvailableHandlerCallback, MailboxInstagramMem$StreamingDownloadCompletionHandlerCallback mailboxInstagramMem$StreamingDownloadCompletionHandlerCallback, K3X k3x, MailboxFutureImpl mailboxFutureImpl, String str, List list, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, int i2, int i3, long j) {
        this.A07 = k3x;
        this.A08 = mailboxFutureImpl;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = j;
        this.A0C = bArr;
        this.A0B = bArr2;
        this.A0D = bArr3;
        this.A09 = str;
        this.A04 = uri;
        this.A0E = bArr4;
        this.A0A = list;
        this.A05 = mailboxInstagramMem$BytesAvailableHandlerCallback;
        this.A06 = mailboxInstagramMem$StreamingDownloadCompletionHandlerCallback;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(K3X.A00, 56);
        NotificationScope A01 = LVN.A01(AbstractC43592JPx.A0E(accountSession), this, A0u, 21);
        this.A08.setNotification(A0u, A01);
        MailboxInstagramMemJNI.dispatchVIIIJOOOOOOOOOOO(7, this.A01, this.A02, this.A00, this.A03, accountSession, this.A0C, this.A0B, this.A0D, this.A09, this.A04, this.A0E, this.A0A, this.A05, this.A06, A01);
    }
}
