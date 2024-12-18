package X;

import com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;
import java.util.Map;

/* renamed from: X.LUk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48186LUk implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ K3Y A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ C46101Kb1 A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ Map A06;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        AbstractC1346866s.A04("MailboxInstagramReverb", "loadMessageListForThreads", this.A00);
        String A0u = AbstractC43592JPx.A0u(K3Y.A00, 11);
        NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 32);
        this.A02.setNotification(A0u, A00);
        MailboxInstagramReverbJNI.dispatchVOOOOOO(9, accountSession, this.A06, this.A04, this.A05, this.A03.mNativeHolder, A00);
    }

    public C48186LUk(K3Y k3y, MailboxFutureImpl mailboxFutureImpl, C46101Kb1 c46101Kb1, Number number, List list, Map map, int i) {
        this.A01 = k3y;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A06 = map;
        this.A04 = number;
        this.A05 = list;
        this.A03 = c46101Kb1;
    }
}
