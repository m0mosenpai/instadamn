package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.LUn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48189LUn implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        NotificationScope A01;
        int i;
        Object obj2;
        Object obj3;
        Object obj4;
        int i2;
        AccountSession accountSession = (AccountSession) obj;
        switch (this.A00) {
            case 0:
                String A0u = AbstractC43592JPx.A0u(K3X.A00, 39);
                A01 = LVN.A01(AbstractC43592JPx.A0E(accountSession), this, A0u, 18);
                AbstractC43592JPx.A1P(A01, this.A03, A0u);
                i = this.A01;
                obj2 = this.A04;
                obj3 = this.A05;
                obj4 = this.A06;
                i2 = 3;
                break;
            case 1:
                String A0u2 = AbstractC43592JPx.A0u(K3X.A00, 57);
                A01 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u2, 28);
                AbstractC43592JPx.A1P(A01, this.A03, A0u2);
                i = this.A01;
                obj2 = this.A05;
                obj3 = this.A06;
                obj4 = this.A04;
                i2 = 5;
                break;
            default:
                AbstractC1346866s.A04("MailboxInstagramReverb", "deleteSeenShhMessages", this.A01);
                String A0u3 = AbstractC43592JPx.A0u(K3Y.A00, 3);
                NotificationScope A00 = C43725JVk.A00(AbstractC43592JPx.A0E(accountSession), this, A0u3, 36);
                AbstractC43592JPx.A1P(A00, this.A04, A0u3);
                MailboxInstagramReverbJNI.dispatchVOOOOO(3, accountSession, this.A06, this.A05, this.A03, A00);
                return;
        }
        MailboxInstagramMemJNI.dispatchVIOOOOO(i2, i, accountSession, obj2, obj3, obj4, A01);
    }

    public C48189LUn(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A01 = i;
        this.A04 = obj;
        this.A05 = obj2;
        this.A06 = str;
    }
}
