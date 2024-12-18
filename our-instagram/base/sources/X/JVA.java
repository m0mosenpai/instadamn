package X;

import com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* loaded from: classes8.dex */
public final class JVA implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ K3Y A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ C46101Kb1 A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ List A08;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        AbstractC1346866s.A04("MailboxInstagramReverb", "loadMessageList", this.A00);
        String A0u = AbstractC43592JPx.A0u(K3Y.A00, 10);
        NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 33);
        this.A03.setNotification(A0u, A00);
        MailboxInstagramReverbJNI.dispatchVIOOOOOOO(0, this.A01, accountSession, this.A06, this.A05, this.A08, this.A07, this.A04.mNativeHolder, A00);
    }

    public JVA(K3Y k3y, MailboxFutureImpl mailboxFutureImpl, C46101Kb1 c46101Kb1, Number number, String str, List list, List list2, int i, int i2) {
        this.A02 = k3y;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A01 = i2;
        this.A06 = str;
        this.A05 = number;
        this.A08 = list;
        this.A07 = list2;
        this.A04 = c46101Kb1;
    }
}
