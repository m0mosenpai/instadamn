package X;

import com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerBinaryMessageTopicHandlerHybrid;
import com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerTopicHandlerHybrid;
import com.facebook.cameracore.mediapipeline.services.participant.implementation.ParticipantUpdateHandlerHybrid;
import com.facebook.cameracore.mediapipeline.services.participant.interfaces.ParticipantData;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.rsys.videoeffectcommunication.gen.GetGroupEffectConfirmationCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.GroupEffectConfirmationPromptCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.PeerConsentVideoEffectAlertCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.UnapprovedEffectAlertCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationParticipant;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationSharedEffectInfo;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class N04 extends VideoEffectCommunicationProxy {
    public VideoEffectCommunicationApi A00;
    public LS4 A01;
    public LS5 A02;
    public Long A03;
    public Long A04;
    public String A05;
    public List A06 = AbstractC166987dD.A1E();
    public final C23324AVj A07;
    public final UserSession A08;
    public final C54453O4h A09;

    @Override // com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy
    public final void getGroupEffectConfirmationPromptState(GetGroupEffectConfirmationCompletion getGroupEffectConfirmationCompletion) {
    }

    @Override // com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy
    public final void onActiveCallLayoutChanged(long j, long j2) {
    }

    @Override // com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy
    public final void onCallLayoutRemoved(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, String str, boolean z) {
    }

    @Override // com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy
    public final void onReadyForSplitScreenChanged(boolean z) {
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    @Override // com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceiveGroupEffect(com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationSharedEffectInfo r43) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N04.onReceiveGroupEffect(com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationSharedEffectInfo):void");
    }

    @Override // com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy
    public final void onVideoFrameUpdated(RSVideoFrame rSVideoFrame, String str) {
    }

    @Override // com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy
    public final void setApi(VideoEffectCommunicationApi videoEffectCommunicationApi) {
        C14360o3.A0B(videoEffectCommunicationApi, 0);
        this.A00 = videoEffectCommunicationApi;
    }

    @Override // com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy
    public final void showGroupEffectConfirmationPrompt(GroupEffectConfirmationPromptCompletion groupEffectConfirmationPromptCompletion) {
    }

    @Override // com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy
    public final void showPeerConsentVideoEffectAlert(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, PeerConsentVideoEffectAlertCompletion peerConsentVideoEffectAlertCompletion) {
    }

    @Override // com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy
    public final void showUnapprovedVideoEffectAlert(UnapprovedEffectAlertCompletion unapprovedEffectAlertCompletion) {
    }

    public N04(C23324AVj c23324AVj, UserSession userSession, C54453O4h c54453O4h) {
        this.A08 = userSession;
        this.A07 = c23324AVj;
        this.A09 = c54453O4h;
    }

    @Override // com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy
    public final void onEffectParticipantsUpdated(VideoEffectCommunicationParticipant videoEffectCommunicationParticipant, ArrayList arrayList, long j) {
        ParticipantUpdateHandlerHybrid participantUpdateHandlerHybrid;
        boolean A1a = AbstractC167017dG.A1a(videoEffectCommunicationParticipant, arrayList);
        Long l = this.A04;
        if (l != null && j == l.longValue()) {
            this.A05 = videoEffectCommunicationParticipant.participantId;
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                VideoEffectCommunicationParticipant videoEffectCommunicationParticipant2 = (VideoEffectCommunicationParticipant) it.next();
                String str = videoEffectCommunicationParticipant2.participantId;
                boolean z = videoEffectCommunicationParticipant2.isActiveInCall;
                boolean z2 = videoEffectCommunicationParticipant2.isActiveInSameEffect;
                int i = videoEffectCommunicationParticipant2.loadStatus;
                int i2 = 2;
                if (i != 0 && i != A1a && i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            i2 = 3;
                        }
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = 0;
                }
                A1E.add(new ParticipantData(str, z, z2, i2));
            }
            this.A06 = A1E;
            LS5 ls5 = this.A02;
            if (ls5 != null && (participantUpdateHandlerHybrid = ls5.A00) != null) {
                participantUpdateHandlerHybrid.onParticipantDataUpdateNative(A1E);
            }
        }
    }

    @Override // com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy
    public final void onMultipeerBinaryMessage(String str, byte[] bArr) {
        MultipeerBinaryMessageTopicHandlerHybrid multipeerBinaryMessageTopicHandlerHybrid;
        AbstractC167017dG.A1N(str, bArr);
        LS4 ls4 = this.A01;
        if (ls4 != null && (multipeerBinaryMessageTopicHandlerHybrid = (MultipeerBinaryMessageTopicHandlerHybrid) ls4.A00.get(str)) != null) {
            multipeerBinaryMessageTopicHandlerHybrid.onMessageNative(bArr);
        }
    }

    @Override // com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationProxy
    public final void onMultipeerMessage(String str, String str2) {
        MultipeerTopicHandlerHybrid multipeerTopicHandlerHybrid;
        AbstractC167017dG.A1N(str, str2);
        LS4 ls4 = this.A01;
        if (ls4 != null && (multipeerTopicHandlerHybrid = (MultipeerTopicHandlerHybrid) ls4.A01.get(str)) != null) {
            multipeerTopicHandlerHybrid.onMessageNative(str2);
        }
    }
}
