package X;

import com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.simplejni.NativeHolder;
import java.util.List;

/* renamed from: X.LUt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48195LUt implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ K3Y A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ C46101Kb1 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        NativeHolder nativeHolder;
        AccountSession accountSession = (AccountSession) obj;
        AbstractC1346866s.A04("MailboxInstagramReverb", "loadMessagesByOTIDs", this.A00);
        String A0u = AbstractC43592JPx.A0u(K3Y.A00, 12);
        NotificationScope ED9 = AbstractC43592JPx.A0E(accountSession).ED9(new C43725JVk(A0u, this, 34), A0u, 1);
        this.A02.setNotification(A0u, ED9);
        String str = this.A04;
        List list = this.A06;
        List list2 = this.A05;
        C46101Kb1 c46101Kb1 = this.A03;
        if (c46101Kb1 == null) {
            nativeHolder = null;
        } else {
            nativeHolder = c46101Kb1.mNativeHolder;
        }
        MailboxInstagramReverbJNI.dispatchVOOOOOOZ(1, accountSession, str, list, list2, nativeHolder, ED9, this.A07);
    }

    public C48195LUt(K3Y k3y, MailboxFutureImpl mailboxFutureImpl, C46101Kb1 c46101Kb1, String str, List list, List list2, int i, boolean z) {
        this.A01 = k3y;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A04 = str;
        this.A06 = list;
        this.A05 = list2;
        this.A03 = c46101Kb1;
        this.A07 = z;
    }
}
