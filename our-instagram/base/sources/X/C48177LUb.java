package X;

import com.facebook.messengerencryptedbackupsdirect.mca.MailboxMessengerEncryptedBackupsDirectJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* renamed from: X.LUb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48177LUb implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ K3Q A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(K3Q.A00, 6);
        NotificationScope A01 = LVN.A01(AbstractC43592JPx.A0E(accountSession), this, A0u, 29);
        this.A02.setNotification(A0u, A01);
        MailboxMessengerEncryptedBackupsDirectJNI.dispatchVIOOOOZ(6, this.A00, accountSession, this.A04, this.A03, A01, this.A05);
    }

    public C48177LUb(K3Q k3q, MailboxFutureImpl mailboxFutureImpl, List list, List list2, int i, boolean z) {
        this.A01 = k3q;
        this.A02 = mailboxFutureImpl;
        this.A00 = i;
        this.A04 = list;
        this.A03 = list2;
        this.A05 = z;
    }
}
