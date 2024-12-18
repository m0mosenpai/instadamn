package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.forker.Process;
import com.facebook.rsys.audio.gen.PlaybackVolumeParametersDeprecated;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.cowatch.gen.CowatchLoggingModel;
import com.facebook.rsys.cowatch.gen.CowatchPlayerInternalModel;
import com.facebook.rsys.cowatch.gen.CowatchReelsMediaInfoModel;
import com.facebook.rsys.grid.gen.GridDisplayEligibleStates;
import com.facebook.rsys.grid.gen.GridModel;
import com.facebook.rsys.grid.gen.GridOrderingParameters;
import com.facebook.rsys.livevideo.gen.LiveVideoApi;
import com.facebook.rsys.messagequeue.gen.MessageQueue;
import com.facebook.rsys.moderator.gen.ModeratorModel;
import com.facebook.rsys.polls.gen.PollOptionModel;
import com.facebook.rsys.polls.gen.PollOptionPermissionsModel;
import com.facebook.rsys.polls.gen.PollsFeatureModel;
import com.facebook.rsys.polls.gen.PollsFeaturePermissionsModel;
import com.facebook.rsys.realtimesession.gen.RealtimeSessionCreateParams;
import com.facebook.rsys.roomslobby.gen.LobbyModel;
import com.facebook.rsys.screenshare.gen.PeerScreenShareStates;
import com.facebook.rsys.stream.gen.CustomVideoCodecInfo;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationCallLayoutRemovingState;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationGroupEffectSharingState;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationModel;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes8.dex */
public final class LSW implements C2N9 {
    public final int A00;

    public LSW(int i) {
        this.A00 = i;
    }

    @Override // X.C2N9
    public final /* bridge */ /* synthetic */ Object AJz(McfReference mcfReference) {
        switch (this.A00) {
            case 0:
                return PlaybackVolumeParametersDeprecated.createFromMcfType(mcfReference);
            case 1:
                return CallContext.createFromMcfType(mcfReference);
            case 2:
                return CowatchLoggingModel.createFromMcfType(mcfReference);
            case 3:
                return CowatchPlayerInternalModel.createFromMcfType(mcfReference);
            case 4:
                return CowatchReelsMediaInfoModel.createFromMcfType(mcfReference);
            case 5:
                return GridDisplayEligibleStates.createFromMcfType(mcfReference);
            case 6:
                return GridModel.createFromMcfType(mcfReference);
            case 7:
                return GridOrderingParameters.createFromMcfType(mcfReference);
            case 8:
                return LiveVideoApi.CProxy.createFromMcfType(mcfReference);
            case 9:
                return MessageQueue.createFromMcfType(mcfReference);
            case 10:
                return ModeratorModel.createFromMcfType(mcfReference);
            case 11:
                return PollOptionModel.createFromMcfType(mcfReference);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return PollOptionPermissionsModel.createFromMcfType(mcfReference);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return PollsFeatureModel.createFromMcfType(mcfReference);
            case 14:
                return PollsFeaturePermissionsModel.createFromMcfType(mcfReference);
            case Process.SIGTERM /* 15 */:
                return RealtimeSessionCreateParams.createFromMcfType(mcfReference);
            case 16:
                return LobbyModel.createFromMcfType(mcfReference);
            case 17:
                return PeerScreenShareStates.createFromMcfType(mcfReference);
            case 18:
                return CustomVideoCodecInfo.createFromMcfType(mcfReference);
            case Process.SIGSTOP /* 19 */:
                return VideoEffectCommunicationApi.CProxy.createFromMcfType(mcfReference);
            case 20:
                return VideoEffectCommunicationCallLayoutRemovingState.createFromMcfType(mcfReference);
            case 21:
                return VideoEffectCommunicationGroupEffectSharingState.createFromMcfType(mcfReference);
            default:
                return VideoEffectCommunicationModel.createFromMcfType(mcfReference);
        }
    }

    @Override // X.C2N9
    public final Class BUQ() {
        switch (this.A00) {
            case 0:
                return PlaybackVolumeParametersDeprecated.class;
            case 1:
                return CallContext.class;
            case 2:
                return CowatchLoggingModel.class;
            case 3:
                return CowatchPlayerInternalModel.class;
            case 4:
                return CowatchReelsMediaInfoModel.class;
            case 5:
                return GridDisplayEligibleStates.class;
            case 6:
                return GridModel.class;
            case 7:
                return GridOrderingParameters.class;
            case 8:
                return LiveVideoApi.class;
            case 9:
                return MessageQueue.class;
            case 10:
                return ModeratorModel.class;
            case 11:
                return PollOptionModel.class;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return PollOptionPermissionsModel.class;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return PollsFeatureModel.class;
            case 14:
                return PollsFeaturePermissionsModel.class;
            case Process.SIGTERM /* 15 */:
                return RealtimeSessionCreateParams.class;
            case 16:
                return LobbyModel.class;
            case 17:
                return PeerScreenShareStates.class;
            case 18:
                return CustomVideoCodecInfo.class;
            case Process.SIGSTOP /* 19 */:
                return VideoEffectCommunicationApi.class;
            case 20:
                return VideoEffectCommunicationCallLayoutRemovingState.class;
            case 21:
                return VideoEffectCommunicationGroupEffectSharingState.class;
            default:
                return VideoEffectCommunicationModel.class;
        }
    }

    @Override // X.C2N9
    public final long CBx() {
        switch (this.A00) {
            case 0:
                long j = PlaybackVolumeParametersDeprecated.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long nativeGetMcfTypeId = PlaybackVolumeParametersDeprecated.nativeGetMcfTypeId();
                PlaybackVolumeParametersDeprecated.sMcfTypeId = nativeGetMcfTypeId;
                return nativeGetMcfTypeId;
            case 1:
                long j2 = CallContext.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long nativeGetMcfTypeId2 = CallContext.nativeGetMcfTypeId();
                CallContext.sMcfTypeId = nativeGetMcfTypeId2;
                return nativeGetMcfTypeId2;
            case 2:
                long j3 = CowatchLoggingModel.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long nativeGetMcfTypeId3 = CowatchLoggingModel.nativeGetMcfTypeId();
                CowatchLoggingModel.sMcfTypeId = nativeGetMcfTypeId3;
                return nativeGetMcfTypeId3;
            case 3:
                long j4 = CowatchPlayerInternalModel.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long nativeGetMcfTypeId4 = CowatchPlayerInternalModel.nativeGetMcfTypeId();
                CowatchPlayerInternalModel.sMcfTypeId = nativeGetMcfTypeId4;
                return nativeGetMcfTypeId4;
            case 4:
                long j5 = CowatchReelsMediaInfoModel.sMcfTypeId;
                if (j5 != 0) {
                    return j5;
                }
                long nativeGetMcfTypeId5 = CowatchReelsMediaInfoModel.nativeGetMcfTypeId();
                CowatchReelsMediaInfoModel.sMcfTypeId = nativeGetMcfTypeId5;
                return nativeGetMcfTypeId5;
            case 5:
                long j6 = GridDisplayEligibleStates.sMcfTypeId;
                if (j6 != 0) {
                    return j6;
                }
                long nativeGetMcfTypeId6 = GridDisplayEligibleStates.nativeGetMcfTypeId();
                GridDisplayEligibleStates.sMcfTypeId = nativeGetMcfTypeId6;
                return nativeGetMcfTypeId6;
            case 6:
                long j7 = GridModel.sMcfTypeId;
                if (j7 != 0) {
                    return j7;
                }
                long nativeGetMcfTypeId7 = GridModel.nativeGetMcfTypeId();
                GridModel.sMcfTypeId = nativeGetMcfTypeId7;
                return nativeGetMcfTypeId7;
            case 7:
                long j8 = GridOrderingParameters.sMcfTypeId;
                if (j8 != 0) {
                    return j8;
                }
                long nativeGetMcfTypeId8 = GridOrderingParameters.nativeGetMcfTypeId();
                GridOrderingParameters.sMcfTypeId = nativeGetMcfTypeId8;
                return nativeGetMcfTypeId8;
            case 8:
                long j9 = LiveVideoApi.CProxy.sMcfTypeId;
                if (j9 != 0) {
                    return j9;
                }
                long nativeGetMcfTypeId9 = LiveVideoApi.CProxy.nativeGetMcfTypeId();
                LiveVideoApi.CProxy.sMcfTypeId = nativeGetMcfTypeId9;
                return nativeGetMcfTypeId9;
            case 9:
                long j10 = MessageQueue.sMcfTypeId;
                if (j10 != 0) {
                    return j10;
                }
                long nativeGetMcfTypeId10 = MessageQueue.nativeGetMcfTypeId();
                MessageQueue.sMcfTypeId = nativeGetMcfTypeId10;
                return nativeGetMcfTypeId10;
            case 10:
                long j11 = ModeratorModel.sMcfTypeId;
                if (j11 != 0) {
                    return j11;
                }
                long nativeGetMcfTypeId11 = ModeratorModel.nativeGetMcfTypeId();
                ModeratorModel.sMcfTypeId = nativeGetMcfTypeId11;
                return nativeGetMcfTypeId11;
            case 11:
                long j12 = PollOptionModel.sMcfTypeId;
                if (j12 != 0) {
                    return j12;
                }
                long nativeGetMcfTypeId12 = PollOptionModel.nativeGetMcfTypeId();
                PollOptionModel.sMcfTypeId = nativeGetMcfTypeId12;
                return nativeGetMcfTypeId12;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                long j13 = PollOptionPermissionsModel.sMcfTypeId;
                if (j13 != 0) {
                    return j13;
                }
                long nativeGetMcfTypeId13 = PollOptionPermissionsModel.nativeGetMcfTypeId();
                PollOptionPermissionsModel.sMcfTypeId = nativeGetMcfTypeId13;
                return nativeGetMcfTypeId13;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                long j14 = PollsFeatureModel.sMcfTypeId;
                if (j14 != 0) {
                    return j14;
                }
                long nativeGetMcfTypeId14 = PollsFeatureModel.nativeGetMcfTypeId();
                PollsFeatureModel.sMcfTypeId = nativeGetMcfTypeId14;
                return nativeGetMcfTypeId14;
            case 14:
                long j15 = PollsFeaturePermissionsModel.sMcfTypeId;
                if (j15 != 0) {
                    return j15;
                }
                long nativeGetMcfTypeId15 = PollsFeaturePermissionsModel.nativeGetMcfTypeId();
                PollsFeaturePermissionsModel.sMcfTypeId = nativeGetMcfTypeId15;
                return nativeGetMcfTypeId15;
            case Process.SIGTERM /* 15 */:
                long j16 = RealtimeSessionCreateParams.sMcfTypeId;
                if (j16 != 0) {
                    return j16;
                }
                long nativeGetMcfTypeId16 = RealtimeSessionCreateParams.nativeGetMcfTypeId();
                RealtimeSessionCreateParams.sMcfTypeId = nativeGetMcfTypeId16;
                return nativeGetMcfTypeId16;
            case 16:
                long j17 = LobbyModel.sMcfTypeId;
                if (j17 != 0) {
                    return j17;
                }
                long nativeGetMcfTypeId17 = LobbyModel.nativeGetMcfTypeId();
                LobbyModel.sMcfTypeId = nativeGetMcfTypeId17;
                return nativeGetMcfTypeId17;
            case 17:
                long j18 = PeerScreenShareStates.sMcfTypeId;
                if (j18 != 0) {
                    return j18;
                }
                long nativeGetMcfTypeId18 = PeerScreenShareStates.nativeGetMcfTypeId();
                PeerScreenShareStates.sMcfTypeId = nativeGetMcfTypeId18;
                return nativeGetMcfTypeId18;
            case 18:
                long j19 = CustomVideoCodecInfo.sMcfTypeId;
                if (j19 != 0) {
                    return j19;
                }
                long nativeGetMcfTypeId19 = CustomVideoCodecInfo.nativeGetMcfTypeId();
                CustomVideoCodecInfo.sMcfTypeId = nativeGetMcfTypeId19;
                return nativeGetMcfTypeId19;
            case Process.SIGSTOP /* 19 */:
                long j20 = VideoEffectCommunicationApi.CProxy.sMcfTypeId;
                if (j20 != 0) {
                    return j20;
                }
                long nativeGetMcfTypeId20 = VideoEffectCommunicationApi.CProxy.nativeGetMcfTypeId();
                VideoEffectCommunicationApi.CProxy.sMcfTypeId = nativeGetMcfTypeId20;
                return nativeGetMcfTypeId20;
            case 20:
                long j21 = VideoEffectCommunicationCallLayoutRemovingState.sMcfTypeId;
                if (j21 != 0) {
                    return j21;
                }
                long nativeGetMcfTypeId21 = VideoEffectCommunicationCallLayoutRemovingState.nativeGetMcfTypeId();
                VideoEffectCommunicationCallLayoutRemovingState.sMcfTypeId = nativeGetMcfTypeId21;
                return nativeGetMcfTypeId21;
            case 21:
                long j22 = VideoEffectCommunicationGroupEffectSharingState.sMcfTypeId;
                if (j22 != 0) {
                    return j22;
                }
                long nativeGetMcfTypeId22 = VideoEffectCommunicationGroupEffectSharingState.nativeGetMcfTypeId();
                VideoEffectCommunicationGroupEffectSharingState.sMcfTypeId = nativeGetMcfTypeId22;
                return nativeGetMcfTypeId22;
            default:
                long j23 = VideoEffectCommunicationModel.sMcfTypeId;
                if (j23 == 0) {
                    long nativeGetMcfTypeId23 = VideoEffectCommunicationModel.nativeGetMcfTypeId();
                    VideoEffectCommunicationModel.sMcfTypeId = nativeGetMcfTypeId23;
                    return nativeGetMcfTypeId23;
                }
                return j23;
        }
    }
}
