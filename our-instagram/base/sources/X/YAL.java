package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.forker.Process;
import com.facebook.rsys.tslog.gen.TslogStreamApi;
import com.facebook.rsys.video.gen.MediaProcessor;
import com.facebook.rsys.video.gen.ProcessedFrameCallbacks;
import com.facebook.rsys.videoeffectcommunication.gen.GetGroupEffectConfirmationCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.GroupEffectConfirmationPromptCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.PeerConsentVideoEffectAlertCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.UnapprovedEffectAlertCompletion;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationAdditionalEffectInfo;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationMultipeerMessage;
import com.facebook.rsys.videorender.gen.VideoRenderFrameCallback;
import com.facebook.rsys.videorender.gen.VideoRenderItem;
import com.facebook.rsys.videorender.gen.VideoRenderSurface;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptions;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.rtc.rsys.models.DismissNotification;
import com.instagram.rtc.rsys.models.HttpRequestFile;
import com.instagram.rtc.rsys.models.ParsedMwsBinaryMessage;

/* loaded from: classes12.dex */
public final class YAL implements C2N9 {
    public final int A00;

    public YAL(int i) {
        this.A00 = i;
    }

    @Override // X.C2N9
    public final /* bridge */ /* synthetic */ Object AJz(McfReference mcfReference) {
        switch (this.A00) {
            case 0:
                return TslogStreamApi.CProxy.createFromMcfType(mcfReference);
            case 1:
                return MediaProcessor.CProxy.createFromMcfType(mcfReference);
            case 2:
                return ProcessedFrameCallbacks.CProxy.createFromMcfType(mcfReference);
            case 3:
                return GetGroupEffectConfirmationCompletion.CProxy.createFromMcfType(mcfReference);
            case 4:
                return GroupEffectConfirmationPromptCompletion.CProxy.createFromMcfType(mcfReference);
            case 5:
                return PeerConsentVideoEffectAlertCompletion.CProxy.createFromMcfType(mcfReference);
            case 6:
                return UnapprovedEffectAlertCompletion.CProxy.createFromMcfType(mcfReference);
            case 7:
                return VideoEffectCommunicationAdditionalEffectInfo.createFromMcfType(mcfReference);
            case 8:
                return VideoEffectCommunicationMultipeerMessage.createFromMcfType(mcfReference);
            case 9:
                return VideoRenderFrameCallback.CProxy.createFromMcfType(mcfReference);
            case 10:
                return VideoRenderItem.createFromMcfType(mcfReference);
            case 11:
                return VideoRenderSurface.CProxy.createFromMcfType(mcfReference);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return VideoSubscriptions.createFromMcfType(mcfReference);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return VideoSubscriptionsModel.createFromMcfType(mcfReference);
            case 14:
                return DismissNotification.createFromMcfType(mcfReference);
            case Process.SIGTERM /* 15 */:
                return HttpRequestFile.createFromMcfType(mcfReference);
            default:
                return ParsedMwsBinaryMessage.createFromMcfType(mcfReference);
        }
    }

    @Override // X.C2N9
    public final Class BUQ() {
        switch (this.A00) {
            case 0:
                return TslogStreamApi.class;
            case 1:
                return MediaProcessor.class;
            case 2:
                return ProcessedFrameCallbacks.class;
            case 3:
                return GetGroupEffectConfirmationCompletion.class;
            case 4:
                return GroupEffectConfirmationPromptCompletion.class;
            case 5:
                return PeerConsentVideoEffectAlertCompletion.class;
            case 6:
                return UnapprovedEffectAlertCompletion.class;
            case 7:
                return VideoEffectCommunicationAdditionalEffectInfo.class;
            case 8:
                return VideoEffectCommunicationMultipeerMessage.class;
            case 9:
                return VideoRenderFrameCallback.class;
            case 10:
                return VideoRenderItem.class;
            case 11:
                return VideoRenderSurface.class;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return VideoSubscriptions.class;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return VideoSubscriptionsModel.class;
            case 14:
                return DismissNotification.class;
            case Process.SIGTERM /* 15 */:
                return HttpRequestFile.class;
            default:
                return ParsedMwsBinaryMessage.class;
        }
    }

    @Override // X.C2N9
    public final long CBx() {
        switch (this.A00) {
            case 0:
                long j = TslogStreamApi.CProxy.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long nativeGetMcfTypeId = TslogStreamApi.CProxy.nativeGetMcfTypeId();
                TslogStreamApi.CProxy.sMcfTypeId = nativeGetMcfTypeId;
                return nativeGetMcfTypeId;
            case 1:
                long j2 = MediaProcessor.CProxy.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long nativeGetMcfTypeId2 = MediaProcessor.CProxy.nativeGetMcfTypeId();
                MediaProcessor.CProxy.sMcfTypeId = nativeGetMcfTypeId2;
                return nativeGetMcfTypeId2;
            case 2:
                long j3 = ProcessedFrameCallbacks.CProxy.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long nativeGetMcfTypeId3 = ProcessedFrameCallbacks.CProxy.nativeGetMcfTypeId();
                ProcessedFrameCallbacks.CProxy.sMcfTypeId = nativeGetMcfTypeId3;
                return nativeGetMcfTypeId3;
            case 3:
                long j4 = GetGroupEffectConfirmationCompletion.CProxy.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long nativeGetMcfTypeId4 = GetGroupEffectConfirmationCompletion.CProxy.nativeGetMcfTypeId();
                GetGroupEffectConfirmationCompletion.CProxy.sMcfTypeId = nativeGetMcfTypeId4;
                return nativeGetMcfTypeId4;
            case 4:
                long j5 = GroupEffectConfirmationPromptCompletion.CProxy.sMcfTypeId;
                if (j5 != 0) {
                    return j5;
                }
                long nativeGetMcfTypeId5 = GroupEffectConfirmationPromptCompletion.CProxy.nativeGetMcfTypeId();
                GroupEffectConfirmationPromptCompletion.CProxy.sMcfTypeId = nativeGetMcfTypeId5;
                return nativeGetMcfTypeId5;
            case 5:
                long j6 = PeerConsentVideoEffectAlertCompletion.CProxy.sMcfTypeId;
                if (j6 != 0) {
                    return j6;
                }
                long nativeGetMcfTypeId6 = PeerConsentVideoEffectAlertCompletion.CProxy.nativeGetMcfTypeId();
                PeerConsentVideoEffectAlertCompletion.CProxy.sMcfTypeId = nativeGetMcfTypeId6;
                return nativeGetMcfTypeId6;
            case 6:
                long j7 = UnapprovedEffectAlertCompletion.CProxy.sMcfTypeId;
                if (j7 != 0) {
                    return j7;
                }
                long nativeGetMcfTypeId7 = UnapprovedEffectAlertCompletion.CProxy.nativeGetMcfTypeId();
                UnapprovedEffectAlertCompletion.CProxy.sMcfTypeId = nativeGetMcfTypeId7;
                return nativeGetMcfTypeId7;
            case 7:
                long j8 = VideoEffectCommunicationAdditionalEffectInfo.sMcfTypeId;
                if (j8 != 0) {
                    return j8;
                }
                long nativeGetMcfTypeId8 = VideoEffectCommunicationAdditionalEffectInfo.nativeGetMcfTypeId();
                VideoEffectCommunicationAdditionalEffectInfo.sMcfTypeId = nativeGetMcfTypeId8;
                return nativeGetMcfTypeId8;
            case 8:
                long j9 = VideoEffectCommunicationMultipeerMessage.sMcfTypeId;
                if (j9 != 0) {
                    return j9;
                }
                long nativeGetMcfTypeId9 = VideoEffectCommunicationMultipeerMessage.nativeGetMcfTypeId();
                VideoEffectCommunicationMultipeerMessage.sMcfTypeId = nativeGetMcfTypeId9;
                return nativeGetMcfTypeId9;
            case 9:
                long j10 = VideoRenderFrameCallback.CProxy.sMcfTypeId;
                if (j10 != 0) {
                    return j10;
                }
                long nativeGetMcfTypeId10 = VideoRenderFrameCallback.CProxy.nativeGetMcfTypeId();
                VideoRenderFrameCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId10;
                return nativeGetMcfTypeId10;
            case 10:
                long j11 = VideoRenderItem.sMcfTypeId;
                if (j11 != 0) {
                    return j11;
                }
                long nativeGetMcfTypeId11 = VideoRenderItem.nativeGetMcfTypeId();
                VideoRenderItem.sMcfTypeId = nativeGetMcfTypeId11;
                return nativeGetMcfTypeId11;
            case 11:
                long j12 = VideoRenderSurface.CProxy.sMcfTypeId;
                if (j12 != 0) {
                    return j12;
                }
                long nativeGetMcfTypeId12 = VideoRenderSurface.CProxy.nativeGetMcfTypeId();
                VideoRenderSurface.CProxy.sMcfTypeId = nativeGetMcfTypeId12;
                return nativeGetMcfTypeId12;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                long j13 = VideoSubscriptions.sMcfTypeId;
                if (j13 != 0) {
                    return j13;
                }
                long nativeGetMcfTypeId13 = VideoSubscriptions.nativeGetMcfTypeId();
                VideoSubscriptions.sMcfTypeId = nativeGetMcfTypeId13;
                return nativeGetMcfTypeId13;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                long j14 = VideoSubscriptionsModel.sMcfTypeId;
                if (j14 != 0) {
                    return j14;
                }
                long nativeGetMcfTypeId14 = VideoSubscriptionsModel.nativeGetMcfTypeId();
                VideoSubscriptionsModel.sMcfTypeId = nativeGetMcfTypeId14;
                return nativeGetMcfTypeId14;
            case 14:
                long j15 = DismissNotification.sMcfTypeId;
                if (j15 != 0) {
                    return j15;
                }
                long nativeGetMcfTypeId15 = DismissNotification.nativeGetMcfTypeId();
                DismissNotification.sMcfTypeId = nativeGetMcfTypeId15;
                return nativeGetMcfTypeId15;
            case Process.SIGTERM /* 15 */:
                long j16 = HttpRequestFile.sMcfTypeId;
                if (j16 != 0) {
                    return j16;
                }
                long nativeGetMcfTypeId16 = HttpRequestFile.nativeGetMcfTypeId();
                HttpRequestFile.sMcfTypeId = nativeGetMcfTypeId16;
                return nativeGetMcfTypeId16;
            default:
                long j17 = ParsedMwsBinaryMessage.sMcfTypeId;
                if (j17 == 0) {
                    long nativeGetMcfTypeId17 = ParsedMwsBinaryMessage.nativeGetMcfTypeId();
                    ParsedMwsBinaryMessage.sMcfTypeId = nativeGetMcfTypeId17;
                    return nativeGetMcfTypeId17;
                }
                return j17;
        }
    }
}
