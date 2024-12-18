package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes8.dex */
public final class LUO implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public LUO(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = z;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                AccountSession accountSession = (AccountSession) obj;
                String A0u = AbstractC43592JPx.A0u(K3X.A00, 29);
                NotificationScope A00 = C43725JVk.A00((C124935ky) accountSession.getNotificationCenterCallbackManager(), this, A0u, 20);
                AbstractC43592JPx.A1P(A00, this.A02, A0u);
                MailboxInstagramMemJNI.dispatchVOOOZ(10, accountSession, this.A03, A00, this.A04);
                return;
            case 1:
                C1346766r c1346766r = (C1346766r) this.A01;
                List list = (List) this.A02;
                K3Z k3z = (K3Z) this.A03;
                boolean z = this.A04;
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                Object obj2 = mailboxNullable.value;
                if (obj2 != null && AbstractC43592JPx.A02((AbstractC1351869s) obj2) != 0) {
                    HashSet hashSet = new HashSet(list);
                    ArrayList A0q = AbstractC25230BEn.A0q(list);
                    ArrayList A0q2 = AbstractC25230BEn.A0q(list);
                    for (int i = 0; i < AbstractC43592JPx.A02((AbstractC1351869s) mailboxNullable.value); i++) {
                        long j = ((AbstractC1351869s) mailboxNullable.value).mResultSet.getLong(i, 1);
                        Long nullableLong = ((AbstractC1351869s) mailboxNullable.value).mResultSet.getNullableLong(i, 2);
                        if (hashSet.contains(((AbstractC1351869s) mailboxNullable.value).mResultSet.getString(i, 0)) && nullableLong != null) {
                            AbstractC166997dE.A1X(A0q, j);
                            A0q2.add(nullableLong);
                        }
                    }
                    JRS A002 = JRS.A00(c1346766r, 67);
                    InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(k3z, 0);
                    MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0C, A002);
                    AbstractC25231BEo.A1C(A0C, new LUV(A0I, k3z, A0q, A0q2, z), A0I);
                    return;
                }
                c1346766r.A02(false);
                c1346766r.A00();
                return;
            default:
                C11T.A02(new M6U((KWi) this.A03, (MsysThreadId) this.A01, (C3o9) this.A02, this.A04));
                return;
        }
    }
}
