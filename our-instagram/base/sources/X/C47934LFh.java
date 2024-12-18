package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.backupmessagepayload.ReverbBackupMessagePayload$BackupMessage;
import com.instagram.direct.armadilloexpress.transportpayload.DeleteMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;

/* renamed from: X.LFh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47934LFh {
    public final UserSession A00;

    public C47934LFh(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final void A00(C47934LFh c47934LFh, String str, String str2, byte[] bArr, int i, long j, long j2, long j3) {
        long A05;
        AbstractC64538TIu abstractC64538TIu;
        byte[] A052;
        int i2;
        int i3;
        UserSession userSession;
        int i4;
        int i5;
        String str3;
        long j4;
        String str4;
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                return;
            }
            C45383K6q c45383K6q = (C45383K6q) TransportPayload.DEFAULT_INSTANCE.A0I();
            K6H k6h = (K6H) DeleteMessagePayload.DEFAULT_INSTANCE.A0I();
            DeleteMessagePayload deleteMessagePayload = (DeleteMessagePayload) AbstractC43592JPx.A0K(k6h);
            str2.getClass();
            deleteMessagePayload.bitField0_ |= 1;
            deleteMessagePayload.messageOtid_ = str2;
            c45383K6q.A06(k6h);
            A052 = c45383K6q.A02().A0H();
            userSession = c47934LFh.A00;
            i4 = 5;
            i5 = 15;
            i3 = 0;
            Long BTC = AbstractC166987dD.A10(userSession).BTC();
            if (BTC != null) {
                A05 = BTC.longValue();
                str3 = null;
                C14360o3.A0A(A052);
                i2 = 3;
                j4 = -1;
                str4 = "0";
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else if (bArr != null) {
            ReverbBackupMessagePayload$BackupMessage reverbBackupMessagePayload$BackupMessage = (ReverbBackupMessagePayload$BackupMessage) RYn.A04(ReverbBackupMessagePayload$BackupMessage.DEFAULT_INSTANCE, bArr);
            C14360o3.A07(reverbBackupMessagePayload$BackupMessage);
            ReverbBackupMessagePayload$BackupMessage.Metadata metadata = reverbBackupMessagePayload$BackupMessage.metadata_;
            if (metadata == null) {
                metadata = ReverbBackupMessagePayload$BackupMessage.Metadata.DEFAULT_INSTANCE;
            }
            A05 = AbstractC43592JPx.A05(metadata.senderId_);
            if (reverbBackupMessagePayload$BackupMessage.payloadCase_ == 2) {
                abstractC64538TIu = (AbstractC64538TIu) reverbBackupMessagePayload$BackupMessage.payload_;
            } else {
                abstractC64538TIu = AbstractC64538TIu.A01;
            }
            A052 = abstractC64538TIu.A05();
            ReverbBackupMessagePayload$BackupMessage.Metadata metadata2 = reverbBackupMessagePayload$BackupMessage.metadata_;
            if (metadata2 == null) {
                metadata2 = ReverbBackupMessagePayload$BackupMessage.Metadata.DEFAULT_INSTANCE;
            }
            i2 = metadata2.payloadVersion_;
            i3 = metadata2.threadTypeTag_;
            userSession = c47934LFh.A00;
            i4 = 5;
            i5 = 15;
            str3 = null;
            C14360o3.A0A(A052);
            j4 = -1;
            str4 = str;
        } else {
            throw AbstractC166987dD.A14("Required value was null.");
        }
        LJg.A01(userSession, str4, str3, A052, i4, i5, i3, i2, j, j2, A05, j3, j4);
    }

    public final void A01(long j) {
        MailboxFeature mailboxFeature = new MailboxFeature(JVC.A00.A00(this.A00));
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(mailboxFeature);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0H);
        AbstractC43594JPz.A1G(A0H, new LVG(j, mailboxFeature, 8, A0D), A0D);
        A0D.addResultCallback(new LU8(this, j, 1));
    }
}
