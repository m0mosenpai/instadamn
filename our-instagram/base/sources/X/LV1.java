package X;

import com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LV1 implements MailboxCallback {
    public final /* synthetic */ K3W A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(K3W.A00, 354);
        NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 17);
        this.A01.setNotification(A0u, A00);
        MailboxEncryptedBackupsJNI.dispatchVOOOOOOOZZZ(53, accountSession, this.A02, this.A05, this.A04, this.A06, this.A03, A00, this.A08, this.A07, this.A09);
    }

    public LV1(K3W k3w, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, List list, List list2, Map map, boolean z, boolean z2, boolean z3) {
        this.A00 = k3w;
        this.A01 = mailboxFutureImpl;
        this.A02 = number;
        this.A05 = list;
        this.A04 = list2;
        this.A06 = map;
        this.A03 = number2;
        this.A08 = z;
        this.A07 = z2;
        this.A09 = z3;
    }
}
