package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* loaded from: classes8.dex */
public final class LV2 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ K3X A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ byte[] A09;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(K3X.A00, 53);
        NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 25);
        this.A03.setNotification(A0u, A00);
        MailboxInstagramMemJNI.dispatchVIIIJOOOOOOZZ(0, 0, this.A00, 2, this.A01, accountSession, this.A06, this.A05, this.A09, this.A04, A00, this.A08, this.A07);
    }

    public LV2(K3X k3x, MailboxFutureImpl mailboxFutureImpl, Number number, String str, List list, byte[] bArr, int i, long j, boolean z, boolean z2) {
        this.A02 = k3x;
        this.A03 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = j;
        this.A06 = list;
        this.A05 = str;
        this.A09 = bArr;
        this.A04 = number;
        this.A08 = z;
        this.A07 = z2;
    }
}
