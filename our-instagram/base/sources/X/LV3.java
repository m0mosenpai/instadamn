package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* loaded from: classes8.dex */
public final class LV3 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ K3X A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ byte[] A09;

    public LV3(K3X k3x, MailboxFutureImpl mailboxFutureImpl, Number number, String str, byte[] bArr, int i, int i2, long j, boolean z, boolean z2) {
        this.A03 = k3x;
        this.A04 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A06 = str;
        this.A09 = bArr;
        this.A05 = number;
        this.A08 = z;
        this.A07 = z2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(K3X.A00, 54);
        NotificationScope ED9 = AbstractC43592JPx.A0E(accountSession).ED9(new C43725JVk(A0u, this, 26), A0u, 1);
        this.A04.setNotification(A0u, ED9);
        MailboxInstagramMemJNI.dispatchVIIIIJOOOOOZZ(1, this.A00, 0, this.A01, 2, this.A02, accountSession, this.A06, this.A09, this.A05, ED9, this.A08, this.A07);
    }
}
