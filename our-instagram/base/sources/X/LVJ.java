package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.util.NotificationScope;
import com.facebook.tam.mca.MailboxTamJNI;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes8.dex */
public final class LVJ implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Mailbox mailbox;
        MailboxFutureImpl A00;
        MailboxNullable A0J;
        JRF A002;
        String str;
        String str2;
        Mailbox mailbox2;
        MailboxFutureImpl A003;
        MailboxNullable A0J2;
        JRF A004;
        String str3;
        String str4;
        int i;
        int i2;
        Mailbox mailbox3;
        MailboxFutureImpl A005;
        int i3;
        boolean z;
        MailboxFeature.DbConnectionResolutionCallback A006;
        String str5;
        String str6;
        AbstractC1351869s abstractC1351869s;
        switch (this.A00) {
            case 0:
                mailbox = (Mailbox) obj;
                A00 = A00(this, "MailboxInstagramSecureMessage", "loadInstagramSecureFetchThreadInfoWithFbid", this.A01);
                A0J = AbstractC43593JPy.A0J();
                A002 = JRF.A00(this, 22);
                str = "MCAMailboxInstagramSecureMessage";
                str2 = "InstagramSecureFetchThreadInfoWithFbid";
                AbstractC1345065z abstractC1345065z = C1345666g.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A00, A0J, 0, 0, str, str2, A002);
                return;
            case 1:
                mailbox = (Mailbox) obj;
                A00 = A00(this, "MailboxInstagramSecureMessage", "loadInstagramSecureMessagePollList", this.A01);
                A0J = AbstractC43593JPy.A0J();
                A002 = JRF.A00(this, 23);
                str = "MCAMailboxInstagramSecureMessage";
                str2 = "InstagramSecureMessagePollList";
                AbstractC1345065z abstractC1345065z2 = C1345666g.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A00, A0J, 0, 0, str, str2, A002);
                return;
            case 2:
                mailbox = (Mailbox) obj;
                A00 = A00(this, "MailboxInstagramSecureMessage", "loadInstagramIgThreadIdFromSecureThreadKey", this.A01);
                A0J = AbstractC43593JPy.A0J();
                A002 = JRF.A00(this, 25);
                str = "MCAMailboxInstagramSecureMessage";
                str2 = "InstagramIgThreadIdFromSecureThreadKey";
                AbstractC1345065z abstractC1345065z22 = C1345666g.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A00, A0J, 0, 0, str, str2, A002);
                return;
            case 3:
                mailbox = (Mailbox) obj;
                A00 = A00(this, "MailboxInstagramSecureMessage", "loadInstagramSecureParticipantList", this.A01);
                A0J = AbstractC43593JPy.A0J();
                A002 = JRF.A00(this, 28);
                str = "MCAMailboxInstagramSecureMessage";
                str2 = "InstagramSecureParticipantList";
                AbstractC1345065z abstractC1345065z222 = C1345666g.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A00, A0J, 0, 0, str, str2, A002);
                return;
            case 4:
                mailbox2 = (Mailbox) obj;
                A003 = A00(this, "MailboxInstagramSecureMessage", "loadInstagramSecureThreadModel", this.A01);
                A0J2 = AbstractC43593JPy.A0J();
                A004 = JRF.A00(this, 34);
                str3 = "MCAMailboxInstagramSecureMessage";
                str4 = "InstagramSecureThreadModel";
                i = 0;
                i2 = 1;
                AbstractC1345065z abstractC1345065z3 = C1345666g.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, A003, A0J2, i, i2, str3, str4, A004);
                return;
            case 5:
                mailbox = (Mailbox) obj;
                A00 = A00(this, "MailboxInstagramSecureMessage", "loadSHIMThreadInfoByFbId", this.A01);
                A0J = AbstractC43593JPy.A0J();
                A002 = JRF.A00(this, 37);
                str = "MCAMailboxInstagramSecureMessage";
                str2 = "SHIMThreadInfoByFbId";
                AbstractC1345065z abstractC1345065z2222 = C1345666g.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, A00, A0J, 0, 0, str, str2, A002);
                return;
            case 6:
                mailbox3 = (Mailbox) obj;
                A005 = A00(this, "MailboxTam", "runTamClientMessageUnsend", this.A01);
                i3 = 0;
                z = false;
                A006 = JRF.A00(this, 55);
                str5 = "MCAMailboxTam";
                str6 = "TamClientMessageUnsend";
                AbstractC1345065z abstractC1345065z4 = K3a.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, A005, z, i3, 1, str5, str6, A006);
                return;
            case 7:
                mailbox3 = (Mailbox) obj;
                A005 = A00(this, "MailboxTam", "runTamClientThreadMarkRead", this.A01);
                i3 = 0;
                z = false;
                A006 = JRF.A00(this, 58);
                str5 = "MCAMailboxTam";
                str6 = "TamClientThreadMarkRead";
                AbstractC1345065z abstractC1345065z42 = K3a.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, A005, z, i3, 1, str5, str6, A006);
                return;
            case 8:
                mailbox3 = (Mailbox) obj;
                A005 = A00(this, "MailboxTam", "runTamClientTypingIndicatorStart", this.A01);
                i3 = 0;
                z = false;
                A006 = JRF.A00(this, 59);
                str5 = "MCAMailboxTam";
                str6 = "TamClientTypingIndicatorStart";
                AbstractC1345065z abstractC1345065z422 = K3a.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, A005, z, i3, 1, str5, str6, A006);
                return;
            case 9:
                mailbox3 = (Mailbox) obj;
                A005 = A00(this, "MailboxTam", "runTamClientTypingIndicatorStop", this.A01);
                i3 = 0;
                z = false;
                A006 = JRF.A00(this, 60);
                str5 = "MCAMailboxTam";
                str6 = "TamClientTypingIndicatorStop";
                AbstractC1345065z abstractC1345065z4222 = K3a.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, A005, z, i3, 1, str5, str6, A006);
                return;
            case 10:
                mailbox3 = (Mailbox) obj;
                A005 = A00(this, "MailboxTam", "runTamClientMessageResendOptimistic", this.A01);
                i3 = 0;
                z = false;
                A006 = JRF.A00(this, 62);
                str5 = "MCAMailboxTam";
                str6 = "TamClientMessageResendOptimistic";
                AbstractC1345065z abstractC1345065z42222 = K3a.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, A005, z, i3, 1, str5, str6, A006);
                return;
            case 11:
                mailbox2 = (Mailbox) obj;
                A003 = A00(this, "MailboxTam", "runTamClientMessageDelete", this.A01);
                A0J2 = AbstractC43593JPy.A0J();
                A004 = JRF.A00(this, 63);
                str3 = "MCAMailboxTam";
                str4 = "TamClientMessageDelete";
                i = 0;
                i2 = 1;
                AbstractC1345065z abstractC1345065z5 = K3a.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox2, A003, A0J2, i, i2, str3, str4, A004);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                mailbox3 = (Mailbox) obj;
                A005 = A00(this, "MailboxTam", "runTamClientParticipantLeaveThread", this.A01);
                i3 = 0;
                z = false;
                A006 = JRF.A00(this, 64);
                str5 = "MCAMailboxTam";
                str6 = "TamClientParticipantLeaveThread";
                AbstractC1345065z abstractC1345065z422222 = K3a.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, A005, z, i3, 1, str5, str6, A006);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                mailbox3 = (Mailbox) obj;
                A005 = A00(this, "MailboxTam", "runTamClientThreadBannerRecordImpression", this.A01);
                i3 = 0;
                z = false;
                A006 = JRF.A00(this, 66);
                str5 = "MCAMailboxTam";
                str6 = "TamClientThreadBannerRecordImpression";
                AbstractC1345065z abstractC1345065z4222222 = K3a.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, A005, z, i3, 1, str5, str6, A006);
                return;
            case 14:
                mailbox3 = (Mailbox) obj;
                A005 = A00(this, "MailboxTam", "runTamClientThreadBannerDismiss", this.A01);
                i3 = 0;
                z = false;
                A006 = JRF.A00(this, 67);
                str5 = "MCAMailboxTam";
                str6 = "TamClientThreadBannerDismiss";
                AbstractC1345065z abstractC1345065z42222222 = K3a.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, A005, z, i3, 1, str5, str6, A006);
                return;
            case Process.SIGTERM /* 15 */:
                mailbox3 = (Mailbox) obj;
                A005 = A00(this, "MailboxTam", "runTamClientThreadBannerDismissProactiveWarnings", this.A01);
                i3 = 0;
                z = false;
                A006 = JRF.A00(this, 68);
                str5 = "MCAMailboxTam";
                str6 = "TamClientThreadBannerDismissProactiveWarnings";
                AbstractC1345065z abstractC1345065z422222222 = K3a.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, A005, z, i3, 1, str5, str6, A006);
                return;
            case 16:
                MailboxFutureImpl A007 = A00(this, "MailboxTam", "runTamClientThreadMarkUnread", this.A01);
                LVK lvk = new LVK(this, 1);
                AbstractC1345065z abstractC1345065z6 = K3a.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, A007, false, 0, 1, "MCAMailboxTam", "TamClientThreadMarkUnread", lvk);
                return;
            case 17:
                mailbox3 = (Mailbox) obj;
                A005 = A00(this, "MailboxTam", "runTamTransportHybridThreadMuteIndefinitely", this.A01);
                i3 = 0;
                z = false;
                A006 = new LVK(this, 3);
                str5 = "MCAMailboxTam";
                str6 = "TamTransportHybridThreadMuteIndefinitely";
                AbstractC1345065z abstractC1345065z4222222222 = K3a.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, A005, z, i3, 1, str5, str6, A006);
                return;
            case 18:
                mailbox3 = (Mailbox) obj;
                A005 = A00(this, "MailboxTam", "runTamTransportHybridThreadUnmute", this.A01);
                i3 = 0;
                z = false;
                A006 = new LVK(this, 4);
                str5 = "MCAMailboxTam";
                str6 = "TamTransportHybridThreadUnmute";
                AbstractC1345065z abstractC1345065z42222222222 = K3a.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, A005, z, i3, 1, str5, str6, A006);
                return;
            case Process.SIGSTOP /* 19 */:
                mailbox3 = (Mailbox) obj;
                A005 = A00(this, "MailboxTam", "runTamMarkMessageRequestAccepted", this.A01);
                i3 = 0;
                z = false;
                A006 = new LVK(this, 5);
                str5 = "MCAMailboxTam";
                str6 = "TamMarkMessageRequestAccepted";
                AbstractC1345065z abstractC1345065z422222222222 = K3a.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, A005, z, i3, 1, str5, str6, A006);
                return;
            case 20:
                mailbox3 = (Mailbox) obj;
                A005 = A00(this, "MailboxTam", "runTamClientVisualMessageOpened", this.A01);
                i3 = 0;
                z = false;
                A006 = new LVK(this, 6);
                str5 = "MCAMailboxTam";
                str6 = "TamClientVisualMessageOpened";
                AbstractC1345065z abstractC1345065z4222222222222 = K3a.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox3, A005, z, i3, 1, str5, str6, A006);
                return;
            case 21:
                Mailbox mailbox4 = (Mailbox) obj;
                AbstractC1346866s.A04("MailboxTam", "fetchMessageDataForExternalForward", this.A01);
                String A0u = AbstractC43592JPx.A0u(K3a.A00, 17);
                NotificationScope A008 = C43725JVk.A00((C124935ky) mailbox4.getAccountSession().getNotificationCenterCallbackManager(), this, A0u, 53);
                AbstractC43592JPx.A1P(A008, this.A04, A0u);
                MailboxTamJNI.dispatchVJOOOO(5, this.A02, mailbox4, null, null, A008);
                return;
            default:
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                C14360o3.A0B(mailboxNullable, 0);
                Object obj2 = mailboxNullable.value;
                if (obj2 == null || ((abstractC1351869s = (AbstractC1351869s) obj2) != null && AbstractC43592JPx.A02(abstractC1351869s) == 0)) {
                    C46053Ka8 c46053Ka8 = (C46053Ka8) this.A04;
                    c46053Ka8.requireActivity().runOnUiThread(new M4G(c46053Ka8, "Failed to retrieve ICDC metadata"));
                    return;
                }
                Object obj3 = mailboxNullable.value;
                C14360o3.A0C(obj3, "null cannot be cast to non-null type com.facebook.messengercorecryptocqljava.SecureMessageFetchICDCMetadata");
                AbstractC1351869s abstractC1351869s2 = (AbstractC1351869s) obj3;
                C125875mc c125875mc = (C125875mc) this.A03;
                long j = this.A02;
                int max = Math.max(1, abstractC1351869s2.mResultSet.getInteger(0, 0) + this.A01);
                byte[] blob = abstractC1351869s2.mResultSet.getBlob(0, 1);
                boolean z2 = abstractC1351869s2.mResultSet.getBoolean(0, 2);
                JRS A009 = JRS.A00(this.A04, 41);
                C125815mW c125815mW = c125875mc.A07;
                InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(c125815mW, 0);
                MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0C, A009);
                AbstractC25231BEo.A1C(A0C, new LUW(c125815mW, A0I, blob, max, j, z2), A0I);
                return;
        }
    }

    public LVJ(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = c1345666g;
        this.A01 = i;
        this.A04 = mailboxFutureImpl;
        this.A02 = j;
    }

    public static MailboxFutureImpl A00(LVJ lvj, String str, String str2, int i) {
        AbstractC1346866s.A04(str, str2, i);
        return (MailboxFutureImpl) lvj.A04;
    }

    public LVJ(C125875mc c125875mc, C46053Ka8 c46053Ka8, int i, long j) {
        this.A00 = 22;
        this.A04 = c46053Ka8;
        this.A03 = c125875mc;
        this.A02 = j;
        this.A01 = i;
    }

    public LVJ(MailboxFutureImpl mailboxFutureImpl, K3a k3a, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = k3a;
        this.A01 = i;
        this.A04 = mailboxFutureImpl;
        this.A02 = j;
    }
}
