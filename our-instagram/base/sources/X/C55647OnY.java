package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.forker.Process;
import com.facebook.rsys.tslog.gen.TslogProxy;
import com.facebook.rsys.video.gen.VideoStream;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationParticipant;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationSharedEffectInfo;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsApi;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.rtc.rsys.models.AnalyticsEvent;
import com.instagram.rtc.rsys.models.CallEndedModel;
import com.instagram.rtc.rsys.models.EngineModel;
import com.instagram.rtc.rsys.models.HttpRequest;
import com.instagram.rtc.rsys.models.IgCallModel;
import com.instagram.rtc.rsys.models.ParticipantModel;
import com.instagram.rtc.rsys.models.RingNotification;
import com.instagram.rtc.rsys.proxies.IGRTCCallManager;
import com.instagram.rtc.rsys.proxies.IGRTCFeatureProvider;
import com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator;
import com.instagram.rtc.rsys.proxies.IGRTCSyncedClockHolder;
import com.instagram.rtc.rsys.proxies.SignalingHttpSenderCallback;

/* renamed from: X.OnY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55647OnY implements C2N9 {
    public final int A00;

    public C55647OnY(int i) {
        this.A00 = i;
    }

    @Override // X.C2N9
    public final /* bridge */ /* synthetic */ Object AJz(McfReference mcfReference) {
        switch (this.A00) {
            case 0:
                return TslogProxy.CProxy.createFromMcfType(mcfReference);
            case 1:
                return VideoStream.createFromMcfType(mcfReference);
            case 2:
                return VideoEffectCommunicationParticipant.createFromMcfType(mcfReference);
            case 3:
                return VideoEffectCommunicationSharedEffectInfo.createFromMcfType(mcfReference);
            case 4:
                return VideoRenderApi.CProxy.createFromMcfType(mcfReference);
            case 5:
                return VideoSubscriptionsApi.CProxy.createFromMcfType(mcfReference);
            case 6:
                return AnalyticsEvent.createFromMcfType(mcfReference);
            case 7:
                return CallEndedModel.createFromMcfType(mcfReference);
            case 8:
                return EngineModel.createFromMcfType(mcfReference);
            case 9:
                return HttpRequest.createFromMcfType(mcfReference);
            case 10:
                return IgCallModel.createFromMcfType(mcfReference);
            case 11:
                return ParticipantModel.createFromMcfType(mcfReference);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return RingNotification.createFromMcfType(mcfReference);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return IGRTCCallManager.CProxy.createFromMcfType(mcfReference);
            case 14:
                return IGRTCFeatureProvider.CProxy.createFromMcfType(mcfReference);
            case Process.SIGTERM /* 15 */:
                return IGRTCSignalingCoordinator.CProxy.createFromMcfType(mcfReference);
            case 16:
                return IGRTCSyncedClockHolder.CProxy.createFromMcfType(mcfReference);
            default:
                return SignalingHttpSenderCallback.CProxy.createFromMcfType(mcfReference);
        }
    }

    @Override // X.C2N9
    public final Class BUQ() {
        switch (this.A00) {
            case 0:
                return TslogProxy.class;
            case 1:
                return VideoStream.class;
            case 2:
                return VideoEffectCommunicationParticipant.class;
            case 3:
                return VideoEffectCommunicationSharedEffectInfo.class;
            case 4:
                return VideoRenderApi.class;
            case 5:
                return VideoSubscriptionsApi.class;
            case 6:
                return AnalyticsEvent.class;
            case 7:
                return CallEndedModel.class;
            case 8:
                return EngineModel.class;
            case 9:
                return HttpRequest.class;
            case 10:
                return IgCallModel.class;
            case 11:
                return ParticipantModel.class;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return RingNotification.class;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return IGRTCCallManager.class;
            case 14:
                return IGRTCFeatureProvider.class;
            case Process.SIGTERM /* 15 */:
                return IGRTCSignalingCoordinator.class;
            case 16:
                return IGRTCSyncedClockHolder.class;
            default:
                return SignalingHttpSenderCallback.class;
        }
    }

    @Override // X.C2N9
    public final long CBx() {
        switch (this.A00) {
            case 0:
                long j = TslogProxy.CProxy.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long nativeGetMcfTypeId = TslogProxy.CProxy.nativeGetMcfTypeId();
                TslogProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId;
                return nativeGetMcfTypeId;
            case 1:
                long j2 = VideoStream.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long nativeGetMcfTypeId2 = VideoStream.nativeGetMcfTypeId();
                VideoStream.sMcfTypeId = nativeGetMcfTypeId2;
                return nativeGetMcfTypeId2;
            case 2:
                long j3 = VideoEffectCommunicationParticipant.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long nativeGetMcfTypeId3 = VideoEffectCommunicationParticipant.nativeGetMcfTypeId();
                VideoEffectCommunicationParticipant.sMcfTypeId = nativeGetMcfTypeId3;
                return nativeGetMcfTypeId3;
            case 3:
                long j4 = VideoEffectCommunicationSharedEffectInfo.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long nativeGetMcfTypeId4 = VideoEffectCommunicationSharedEffectInfo.nativeGetMcfTypeId();
                VideoEffectCommunicationSharedEffectInfo.sMcfTypeId = nativeGetMcfTypeId4;
                return nativeGetMcfTypeId4;
            case 4:
                long j5 = VideoRenderApi.CProxy.sMcfTypeId;
                if (j5 != 0) {
                    return j5;
                }
                long nativeGetMcfTypeId5 = VideoRenderApi.CProxy.nativeGetMcfTypeId();
                VideoRenderApi.CProxy.sMcfTypeId = nativeGetMcfTypeId5;
                return nativeGetMcfTypeId5;
            case 5:
                long j6 = VideoSubscriptionsApi.CProxy.sMcfTypeId;
                if (j6 != 0) {
                    return j6;
                }
                long nativeGetMcfTypeId6 = VideoSubscriptionsApi.CProxy.nativeGetMcfTypeId();
                VideoSubscriptionsApi.CProxy.sMcfTypeId = nativeGetMcfTypeId6;
                return nativeGetMcfTypeId6;
            case 6:
                long j7 = AnalyticsEvent.sMcfTypeId;
                if (j7 != 0) {
                    return j7;
                }
                long nativeGetMcfTypeId7 = AnalyticsEvent.nativeGetMcfTypeId();
                AnalyticsEvent.sMcfTypeId = nativeGetMcfTypeId7;
                return nativeGetMcfTypeId7;
            case 7:
                long j8 = CallEndedModel.sMcfTypeId;
                if (j8 != 0) {
                    return j8;
                }
                long nativeGetMcfTypeId8 = CallEndedModel.nativeGetMcfTypeId();
                CallEndedModel.sMcfTypeId = nativeGetMcfTypeId8;
                return nativeGetMcfTypeId8;
            case 8:
                long j9 = EngineModel.sMcfTypeId;
                if (j9 != 0) {
                    return j9;
                }
                long nativeGetMcfTypeId9 = EngineModel.nativeGetMcfTypeId();
                EngineModel.sMcfTypeId = nativeGetMcfTypeId9;
                return nativeGetMcfTypeId9;
            case 9:
                long j10 = HttpRequest.sMcfTypeId;
                if (j10 != 0) {
                    return j10;
                }
                long nativeGetMcfTypeId10 = HttpRequest.nativeGetMcfTypeId();
                HttpRequest.sMcfTypeId = nativeGetMcfTypeId10;
                return nativeGetMcfTypeId10;
            case 10:
                long j11 = IgCallModel.sMcfTypeId;
                if (j11 != 0) {
                    return j11;
                }
                long nativeGetMcfTypeId11 = IgCallModel.nativeGetMcfTypeId();
                IgCallModel.sMcfTypeId = nativeGetMcfTypeId11;
                return nativeGetMcfTypeId11;
            case 11:
                long j12 = ParticipantModel.sMcfTypeId;
                if (j12 != 0) {
                    return j12;
                }
                long nativeGetMcfTypeId12 = ParticipantModel.nativeGetMcfTypeId();
                ParticipantModel.sMcfTypeId = nativeGetMcfTypeId12;
                return nativeGetMcfTypeId12;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                long j13 = RingNotification.sMcfTypeId;
                if (j13 != 0) {
                    return j13;
                }
                long nativeGetMcfTypeId13 = RingNotification.nativeGetMcfTypeId();
                RingNotification.sMcfTypeId = nativeGetMcfTypeId13;
                return nativeGetMcfTypeId13;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                long j14 = IGRTCCallManager.CProxy.sMcfTypeId;
                if (j14 != 0) {
                    return j14;
                }
                long nativeGetMcfTypeId14 = IGRTCCallManager.CProxy.nativeGetMcfTypeId();
                IGRTCCallManager.CProxy.sMcfTypeId = nativeGetMcfTypeId14;
                return nativeGetMcfTypeId14;
            case 14:
                long j15 = IGRTCFeatureProvider.CProxy.sMcfTypeId;
                if (j15 != 0) {
                    return j15;
                }
                long nativeGetMcfTypeId15 = IGRTCFeatureProvider.CProxy.nativeGetMcfTypeId();
                IGRTCFeatureProvider.CProxy.sMcfTypeId = nativeGetMcfTypeId15;
                return nativeGetMcfTypeId15;
            case Process.SIGTERM /* 15 */:
                long j16 = IGRTCSignalingCoordinator.CProxy.sMcfTypeId;
                if (j16 != 0) {
                    return j16;
                }
                long nativeGetMcfTypeId16 = IGRTCSignalingCoordinator.CProxy.nativeGetMcfTypeId();
                IGRTCSignalingCoordinator.CProxy.sMcfTypeId = nativeGetMcfTypeId16;
                return nativeGetMcfTypeId16;
            case 16:
                long j17 = IGRTCSyncedClockHolder.CProxy.sMcfTypeId;
                if (j17 != 0) {
                    return j17;
                }
                long nativeGetMcfTypeId17 = IGRTCSyncedClockHolder.CProxy.nativeGetMcfTypeId();
                IGRTCSyncedClockHolder.CProxy.sMcfTypeId = nativeGetMcfTypeId17;
                return nativeGetMcfTypeId17;
            default:
                long j18 = SignalingHttpSenderCallback.CProxy.sMcfTypeId;
                if (j18 == 0) {
                    long nativeGetMcfTypeId18 = SignalingHttpSenderCallback.CProxy.nativeGetMcfTypeId();
                    SignalingHttpSenderCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId18;
                    return nativeGetMcfTypeId18;
                }
                return j18;
        }
    }
}
