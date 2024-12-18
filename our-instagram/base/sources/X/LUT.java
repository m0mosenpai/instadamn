package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.tam.mca.MailboxTamJNI;

/* loaded from: classes8.dex */
public final class LUT implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public LUT(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A04 = str2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (this.A00 != 0) {
            ((MailboxObservableImpl) this.A02).setResult(MailboxTamJNI.dispatchOOOO(10, obj, this.A03, this.A04));
            return;
        }
        AccountSession accountSession = (AccountSession) obj;
        String A0u = AbstractC43592JPx.A0u(K3X.A00, 45);
        NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u, 21);
        AbstractC43592JPx.A1P(A00, this.A02, A0u);
        MailboxInstagramMemJNI.dispatchVOOOO(11, accountSession, this.A03, this.A04, A00);
    }
}
