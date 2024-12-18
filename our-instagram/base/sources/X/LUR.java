package X;

import com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI;
import com.facebook.messengerencryptedbackupsdirect.mca.MailboxMessengerEncryptedBackupsDirectJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class LUR implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public LUR(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        boolean z;
        switch (this.A00) {
            case 0:
                AccountSession accountSession = (AccountSession) obj;
                String A0u = AbstractC43592JPx.A0u(K3W.A00, 338);
                NotificationScope A01 = LVN.A01(AbstractC43592JPx.A0E(accountSession), this, A0u, 7);
                AbstractC43592JPx.A1P(A01, this.A03, A0u);
                MailboxEncryptedBackupsJNI.dispatchVOOOOOOO(27, accountSession, this.A02, null, this.A04, null, null, A01);
                return;
            case 1:
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A03, false, 0, 1, null, (PrivacyContext) this.A04, "MCAMailboxInstagramPresence", "OnDemandFetchPresence", JRF.A00(this, 17));
                return;
            case 2:
                AccountSession accountSession2 = (AccountSession) obj;
                String A0u2 = AbstractC43592JPx.A0u(K3Q.A00, 5);
                NotificationScope A012 = LVN.A01(AbstractC43592JPx.A0E(accountSession2), this, A0u2, 28);
                AbstractC43592JPx.A1P(A012, this.A02, A0u2);
                MailboxMessengerEncryptedBackupsDirectJNI.dispatchVOOOO(2, accountSession2, this.A03, this.A04, A012);
                return;
            case 3:
                C1346766r c1346766r = (C1346766r) this.A02;
                L94 l94 = (L94) this.A03;
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                Object obj2 = mailboxNullable.value;
                if (obj2 != null && AbstractC43592JPx.A02((AbstractC1351869s) obj2) > 0) {
                    AbstractC1351869s abstractC1351869s = (AbstractC1351869s) mailboxNullable.value;
                    C14360o3.A0B(abstractC1351869s, 0);
                    ImmutableList.Builder builder = new ImmutableList.Builder();
                    int A02 = AbstractC43592JPx.A02(abstractC1351869s);
                    for (int i = 0; i < A02; i++) {
                        String A0v = AbstractC43592JPx.A0v(abstractC1351869s, i, 0);
                        C14360o3.A07(A0v);
                        builder.add((Object) new C47622L1h(A0v, abstractC1351869s.mResultSet.getNullableInteger(i, 2), abstractC1351869s.mResultSet.getString(i, 1)));
                    }
                    ImmutableList build = builder.build();
                    C14360o3.A07(build);
                    c1346766r.A02(new C132955zK(build));
                    if (l94 != null) {
                        z = true;
                        C006802i c006802i = l94.A01;
                        int i2 = l94.A00;
                        c006802i.markerPoint(20132336, i2, "preview_load_completed");
                        c006802i.markerAnnotate(20132336, i2, "preview_load_has_results", z);
                        c006802i.markerEnd(20132336, i2, (short) 2);
                    }
                    c1346766r.A00();
                    return;
                }
                C48496Lcn.A01(c1346766r, "Receiver fetch response not found");
                if (l94 != null) {
                    z = false;
                    C006802i c006802i2 = l94.A01;
                    int i22 = l94.A00;
                    c006802i2.markerPoint(20132336, i22, "preview_load_completed");
                    c006802i2.markerAnnotate(20132336, i22, "preview_load_has_results", z);
                    c006802i2.markerEnd(20132336, i22, (short) 2);
                }
                c1346766r.A00();
                return;
            case 4:
                C116155Nu c116155Nu = ((C49587Lvg) this.A04).A00;
                MRU A00 = JQX.A00(c116155Nu.A0j);
                Long l = c116155Nu.A0K;
                C14360o3.A07(l);
                A00.Cn5("handle_push_notification_with_configs", l.longValue());
                Long l2 = c116155Nu.A0K;
                C14360o3.A07(l2);
                A00.DW6(l2.longValue());
                int intValue = ((Number) obj).intValue();
                UserSession userSession = (UserSession) this.A03;
                C60J.A00(userSession).A03(intValue, false);
                if (intValue != 4) {
                    C129115sX.A00.A01(userSession, (HashMap) this.A02);
                }
                ((InterfaceC03960Jm) this.A01).AIn(null);
                return;
            default:
                return;
        }
    }
}
