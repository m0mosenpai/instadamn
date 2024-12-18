package com.facebook.rsys.videoeffectcommunication.gen;

import com.facebook.rsys.rtc.RSVideoFrame;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public abstract class VideoEffectCommunicationProxy {
    public abstract void getGroupEffectConfirmationPromptState(GetGroupEffectConfirmationCompletion getGroupEffectConfirmationCompletion);

    public abstract void onActiveCallLayoutChanged(long j, long j2);

    public abstract void onCallLayoutRemoved(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, String str, boolean z);

    public abstract void onEffectParticipantsUpdated(VideoEffectCommunicationParticipant videoEffectCommunicationParticipant, ArrayList arrayList, long j);

    public abstract void onMultipeerBinaryMessage(String str, byte[] bArr);

    public abstract void onMultipeerMessage(String str, String str2);

    public abstract void onReadyForSplitScreenChanged(boolean z);

    public abstract void onReceiveGroupEffect(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo);

    public abstract void onVideoFrameUpdated(RSVideoFrame rSVideoFrame, String str);

    public abstract void setApi(VideoEffectCommunicationApi videoEffectCommunicationApi);

    public abstract void showGroupEffectConfirmationPrompt(GroupEffectConfirmationPromptCompletion groupEffectConfirmationPromptCompletion);

    public abstract void showPeerConsentVideoEffectAlert(VideoEffectCommunicationSharedEffectInfo videoEffectCommunicationSharedEffectInfo, PeerConsentVideoEffectAlertCompletion peerConsentVideoEffectAlertCompletion);

    public abstract void showUnapprovedVideoEffectAlert(UnapprovedEffectAlertCompletion unapprovedEffectAlertCompletion);
}
