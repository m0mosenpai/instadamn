package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.forker.Process;
import com.facebook.rsys.mediastats.gen.MediaStatsListener;
import com.facebook.rsys.mediastats.gen.MediaStatsProxy;
import com.facebook.rsys.mediastats.gen.ScreenShareStats;
import com.facebook.rsys.messagequeue.gen.MessageQueueItem;
import com.facebook.rsys.metaaivoicestate.gen.CreatorBotClientReadyMessage;
import com.facebook.rsys.metaaivoicestate.gen.GenAiMediaStats;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiCaption;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiMediaStatsProxy;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy;
import com.facebook.rsys.moderator.gen.ModeratorApi;
import com.facebook.rsys.moderator.gen.ModeratorClientModel;
import com.facebook.rsys.moderator.gen.ModeratorShimAudioModel;
import com.facebook.rsys.mosaicgrid.gen.MosaicGridApi;
import com.facebook.rsys.mosaicgrid.gen.MosaicGridModel;
import com.facebook.rsys.netobject.gen.NetObjectApi;
import com.facebook.rsys.netobject.gen.NetObjectPeerMetadata;
import com.facebook.rsys.netobject.gen.NetObjectSession;
import com.facebook.rsys.netobject.gen.NetObjectSessionCallback;
import com.facebook.rsys.netobject.gen.NetObjectSessionCreationConfig;
import com.facebook.rsys.netobject.gen.NetObjectSessionListener;
import com.facebook.rsys.netobject.gen.RawDataListener;
import com.facebook.rsys.networkinfo.gen.NetworkInfoCallback;
import com.facebook.rsys.networktraffic.gen.HttpStats;
import com.facebook.rsys.networktraffic.gen.NetworkTrafficProxy;
import com.facebook.rsys.outgoingcallconfig.gen.OutgoingCallConfig;
import com.facebook.rsys.perf.holders.gen.PerfLoggerHolder;
import com.facebook.rsys.polls.gen.PollModel;
import com.facebook.rsys.polls.gen.PollOptionContentModel;
import com.facebook.rsys.polls.gen.PollParticipantModel;
import com.facebook.rsys.polls.gen.PollPermissionsModel;
import com.facebook.rsys.polls.gen.PollsApi;
import com.facebook.rsys.polls.gen.PollsCreateActionParams;
import com.facebook.rsys.polls.gen.PollsPendingActionModel;
import com.facebook.rsys.polls.gen.PollsRemoveActionParams;
import com.facebook.rsys.polls.gen.PollsRemoveVoteActionParams;
import com.facebook.rsys.polls.gen.PollsVoteActionParams;
import com.facebook.rsys.reactions.gen.EmojiModel;
import com.facebook.rsys.reactions.gen.EmojiReactionsModel;
import com.facebook.rsys.reactions.gen.EmojiReactionsParticipantModel;
import com.facebook.rsys.reactions.gen.PendingReactionModel;
import com.facebook.rsys.reactions.gen.ReactionModel;
import com.facebook.rsys.reactions.gen.ReactionsApi;
import com.facebook.rsys.reactions.gen.SendEmojiInputModel;
import com.facebook.rsys.realtimesession.gen.RealtimeSessionManagerApi;
import com.facebook.rsys.rooms.gen.RoomCapabilityModel;
import com.facebook.rsys.rooms.gen.RoomMetadataModel;
import com.facebook.rsys.rooms.gen.RoomModel;
import com.facebook.rsys.rooms.gen.RoomParticipantInfo;
import com.facebook.rsys.rooms.gen.RoomResolveConfig;
import com.facebook.rsys.roomslobby.gen.RinglistParticipantInfo;
import com.facebook.rsys.starrating.gen.StarRatingApi;
import com.facebook.rsys.starrating.gen.StarRatingModel;
import com.facebook.rsys.stream.gen.LocalVideoStream;
import com.facebook.rsys.stream.gen.StreamApi;
import com.facebook.rsys.stream.gen.StreamCallbacks;
import com.facebook.rsys.stream.gen.StreamModel;
import com.facebook.rsys.stream.gen.VideoCapturePropertiesListener;
import com.facebook.rsys.stream.gen.VideoStreamController;
import com.facebook.rsys.stream.gen.VideoStreamParams;
import com.facebook.rsys.stream.gen.VideoStreamSendParams;
import com.facebook.rsys.transport.gen.MessageReceiveCallbacks;
import com.facebook.rsys.transport.gen.MetricIdentifiers;
import com.facebook.rsys.transport.gen.SendMessageAttemptStats;
import com.facebook.rsys.transport.gen.SendMessageStats;
import com.facebook.rsys.transport.gen.SignalingMessage;
import com.facebook.rsys.transport.gen.SignalingMessageIncomingStats;
import com.facebook.rsys.transport.gen.SignalingTransportCallbackExt;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.rsys.transport.gen.SignalingTransportSink;
import com.facebook.rsys.transport.gen.StatusUpdate;
import com.facebook.rsys.tslog.gen.TslogCounterApi;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes12.dex */
public final class YAM implements C2N9 {
    public final int A00;

    public YAM(int i) {
        this.A00 = i;
    }

    public static YAM A00(int i) {
        return new YAM(i);
    }

    @Override // X.C2N9
    public final /* bridge */ /* synthetic */ Object AJz(McfReference mcfReference) {
        switch (this.A00) {
            case 0:
                return MediaStatsListener.CProxy.createFromMcfType(mcfReference);
            case 1:
                return MediaStatsProxy.CProxy.createFromMcfType(mcfReference);
            case 2:
                return ScreenShareStats.createFromMcfType(mcfReference);
            case 3:
                return MessageQueueItem.createFromMcfType(mcfReference);
            case 4:
                return CreatorBotClientReadyMessage.createFromMcfType(mcfReference);
            case 5:
                return GenAiMediaStats.createFromMcfType(mcfReference);
            case 6:
                return MetaAiCaption.createFromMcfType(mcfReference);
            case 7:
                return MetaAiMediaStatsProxy.CProxy.createFromMcfType(mcfReference);
            case 8:
                return MetaAiVoiceStateProxy.CProxy.createFromMcfType(mcfReference);
            case 9:
                return ModeratorApi.CProxy.createFromMcfType(mcfReference);
            case 10:
                return ModeratorClientModel.createFromMcfType(mcfReference);
            case 11:
                return ModeratorShimAudioModel.createFromMcfType(mcfReference);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return MosaicGridApi.CProxy.createFromMcfType(mcfReference);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return MosaicGridModel.createFromMcfType(mcfReference);
            case 14:
                return NetObjectApi.CProxy.createFromMcfType(mcfReference);
            case Process.SIGTERM /* 15 */:
                return NetObjectPeerMetadata.createFromMcfType(mcfReference);
            case 16:
                return NetObjectSession.CProxy.createFromMcfType(mcfReference);
            case 17:
                return NetObjectSessionCallback.CProxy.createFromMcfType(mcfReference);
            case 18:
                return NetObjectSessionCreationConfig.createFromMcfType(mcfReference);
            case Process.SIGSTOP /* 19 */:
                return NetObjectSessionListener.CProxy.createFromMcfType(mcfReference);
            case 20:
                return RawDataListener.CProxy.createFromMcfType(mcfReference);
            case 21:
                return NetworkInfoCallback.CProxy.createFromMcfType(mcfReference);
            case 22:
                return HttpStats.createFromMcfType(mcfReference);
            case 23:
                return NetworkTrafficProxy.CProxy.createFromMcfType(mcfReference);
            case 24:
                return OutgoingCallConfig.createFromMcfType(mcfReference);
            case 25:
                return PerfLoggerHolder.createFromMcfType(mcfReference);
            case 26:
                return PollModel.createFromMcfType(mcfReference);
            case 27:
                return PollOptionContentModel.createFromMcfType(mcfReference);
            case 28:
                return PollParticipantModel.createFromMcfType(mcfReference);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return PollPermissionsModel.createFromMcfType(mcfReference);
            case 30:
                return PollsApi.CProxy.createFromMcfType(mcfReference);
            case 31:
                return PollsCreateActionParams.createFromMcfType(mcfReference);
            case 32:
                return PollsPendingActionModel.createFromMcfType(mcfReference);
            case 33:
                return PollsRemoveActionParams.createFromMcfType(mcfReference);
            case 34:
                return PollsRemoveVoteActionParams.createFromMcfType(mcfReference);
            case 35:
                return PollsVoteActionParams.createFromMcfType(mcfReference);
            case 36:
                return EmojiModel.createFromMcfType(mcfReference);
            case 37:
                return EmojiReactionsModel.createFromMcfType(mcfReference);
            case 38:
                return EmojiReactionsParticipantModel.createFromMcfType(mcfReference);
            case 39:
                return PendingReactionModel.createFromMcfType(mcfReference);
            case 40:
                return ReactionModel.createFromMcfType(mcfReference);
            case Seq.NULL_REFNUM /* 41 */:
                return ReactionsApi.CProxy.createFromMcfType(mcfReference);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return SendEmojiInputModel.createFromMcfType(mcfReference);
            case 43:
                return RealtimeSessionManagerApi.CProxy.createFromMcfType(mcfReference);
            case 44:
                return RoomCapabilityModel.createFromMcfType(mcfReference);
            case 45:
                return RoomMetadataModel.createFromMcfType(mcfReference);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return RoomModel.createFromMcfType(mcfReference);
            case 47:
                return RoomParticipantInfo.createFromMcfType(mcfReference);
            case 48:
                return RoomResolveConfig.createFromMcfType(mcfReference);
            case 49:
                return RinglistParticipantInfo.createFromMcfType(mcfReference);
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return StarRatingApi.CProxy.createFromMcfType(mcfReference);
            case 51:
                return StarRatingModel.createFromMcfType(mcfReference);
            case 52:
                return LocalVideoStream.createFromMcfType(mcfReference);
            case 53:
                return StreamApi.CProxy.createFromMcfType(mcfReference);
            case 54:
                return StreamCallbacks.CProxy.createFromMcfType(mcfReference);
            case 55:
                return StreamModel.createFromMcfType(mcfReference);
            case 56:
                return VideoCapturePropertiesListener.CProxy.createFromMcfType(mcfReference);
            case 57:
                return VideoStreamController.CProxy.createFromMcfType(mcfReference);
            case 58:
                return VideoStreamParams.createFromMcfType(mcfReference);
            case 59:
                return VideoStreamSendParams.createFromMcfType(mcfReference);
            case 60:
                return MessageReceiveCallbacks.CProxy.createFromMcfType(mcfReference);
            case 61:
                return MetricIdentifiers.createFromMcfType(mcfReference);
            case 62:
                return SendMessageAttemptStats.createFromMcfType(mcfReference);
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return SendMessageStats.createFromMcfType(mcfReference);
            case 64:
                return SignalingMessage.createFromMcfType(mcfReference);
            case 65:
                return SignalingMessageIncomingStats.createFromMcfType(mcfReference);
            case 66:
                return SignalingTransportCallbackExt.CProxy.createFromMcfType(mcfReference);
            case 67:
                return SignalingTransportProxy.CProxy.createFromMcfType(mcfReference);
            case 68:
                return SignalingTransportSink.CProxy.createFromMcfType(mcfReference);
            case 69:
                return StatusUpdate.createFromMcfType(mcfReference);
            default:
                return TslogCounterApi.CProxy.createFromMcfType(mcfReference);
        }
    }

    @Override // X.C2N9
    public final Class BUQ() {
        switch (this.A00) {
            case 0:
                return MediaStatsListener.class;
            case 1:
                return MediaStatsProxy.class;
            case 2:
                return ScreenShareStats.class;
            case 3:
                return MessageQueueItem.class;
            case 4:
                return CreatorBotClientReadyMessage.class;
            case 5:
                return GenAiMediaStats.class;
            case 6:
                return MetaAiCaption.class;
            case 7:
                return MetaAiMediaStatsProxy.class;
            case 8:
                return MetaAiVoiceStateProxy.class;
            case 9:
                return ModeratorApi.class;
            case 10:
                return ModeratorClientModel.class;
            case 11:
                return ModeratorShimAudioModel.class;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return MosaicGridApi.class;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return MosaicGridModel.class;
            case 14:
                return NetObjectApi.class;
            case Process.SIGTERM /* 15 */:
                return NetObjectPeerMetadata.class;
            case 16:
                return NetObjectSession.class;
            case 17:
                return NetObjectSessionCallback.class;
            case 18:
                return NetObjectSessionCreationConfig.class;
            case Process.SIGSTOP /* 19 */:
                return NetObjectSessionListener.class;
            case 20:
                return RawDataListener.class;
            case 21:
                return NetworkInfoCallback.class;
            case 22:
                return HttpStats.class;
            case 23:
                return NetworkTrafficProxy.class;
            case 24:
                return OutgoingCallConfig.class;
            case 25:
                return PerfLoggerHolder.class;
            case 26:
                return PollModel.class;
            case 27:
                return PollOptionContentModel.class;
            case 28:
                return PollParticipantModel.class;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return PollPermissionsModel.class;
            case 30:
                return PollsApi.class;
            case 31:
                return PollsCreateActionParams.class;
            case 32:
                return PollsPendingActionModel.class;
            case 33:
                return PollsRemoveActionParams.class;
            case 34:
                return PollsRemoveVoteActionParams.class;
            case 35:
                return PollsVoteActionParams.class;
            case 36:
                return EmojiModel.class;
            case 37:
                return EmojiReactionsModel.class;
            case 38:
                return EmojiReactionsParticipantModel.class;
            case 39:
                return PendingReactionModel.class;
            case 40:
                return ReactionModel.class;
            case Seq.NULL_REFNUM /* 41 */:
                return ReactionsApi.class;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return SendEmojiInputModel.class;
            case 43:
                return RealtimeSessionManagerApi.class;
            case 44:
                return RoomCapabilityModel.class;
            case 45:
                return RoomMetadataModel.class;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return RoomModel.class;
            case 47:
                return RoomParticipantInfo.class;
            case 48:
                return RoomResolveConfig.class;
            case 49:
                return RinglistParticipantInfo.class;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return StarRatingApi.class;
            case 51:
                return StarRatingModel.class;
            case 52:
                return LocalVideoStream.class;
            case 53:
                return StreamApi.class;
            case 54:
                return StreamCallbacks.class;
            case 55:
                return StreamModel.class;
            case 56:
                return VideoCapturePropertiesListener.class;
            case 57:
                return VideoStreamController.class;
            case 58:
                return VideoStreamParams.class;
            case 59:
                return VideoStreamSendParams.class;
            case 60:
                return MessageReceiveCallbacks.class;
            case 61:
                return MetricIdentifiers.class;
            case 62:
                return SendMessageAttemptStats.class;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return SendMessageStats.class;
            case 64:
                return SignalingMessage.class;
            case 65:
                return SignalingMessageIncomingStats.class;
            case 66:
                return SignalingTransportCallbackExt.class;
            case 67:
                return SignalingTransportProxy.class;
            case 68:
                return SignalingTransportSink.class;
            case 69:
                return StatusUpdate.class;
            default:
                return TslogCounterApi.class;
        }
    }

    @Override // X.C2N9
    public final long CBx() {
        switch (this.A00) {
            case 0:
                long j = MediaStatsListener.CProxy.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long nativeGetMcfTypeId = MediaStatsListener.CProxy.nativeGetMcfTypeId();
                MediaStatsListener.CProxy.sMcfTypeId = nativeGetMcfTypeId;
                return nativeGetMcfTypeId;
            case 1:
                long j2 = MediaStatsProxy.CProxy.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long nativeGetMcfTypeId2 = MediaStatsProxy.CProxy.nativeGetMcfTypeId();
                MediaStatsProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId2;
                return nativeGetMcfTypeId2;
            case 2:
                long j3 = ScreenShareStats.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long nativeGetMcfTypeId3 = ScreenShareStats.nativeGetMcfTypeId();
                ScreenShareStats.sMcfTypeId = nativeGetMcfTypeId3;
                return nativeGetMcfTypeId3;
            case 3:
                long j4 = MessageQueueItem.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long nativeGetMcfTypeId4 = MessageQueueItem.nativeGetMcfTypeId();
                MessageQueueItem.sMcfTypeId = nativeGetMcfTypeId4;
                return nativeGetMcfTypeId4;
            case 4:
                long j5 = CreatorBotClientReadyMessage.sMcfTypeId;
                if (j5 != 0) {
                    return j5;
                }
                long nativeGetMcfTypeId5 = CreatorBotClientReadyMessage.nativeGetMcfTypeId();
                CreatorBotClientReadyMessage.sMcfTypeId = nativeGetMcfTypeId5;
                return nativeGetMcfTypeId5;
            case 5:
                long j6 = GenAiMediaStats.sMcfTypeId;
                if (j6 != 0) {
                    return j6;
                }
                long nativeGetMcfTypeId6 = GenAiMediaStats.nativeGetMcfTypeId();
                GenAiMediaStats.sMcfTypeId = nativeGetMcfTypeId6;
                return nativeGetMcfTypeId6;
            case 6:
                long j7 = MetaAiCaption.sMcfTypeId;
                if (j7 != 0) {
                    return j7;
                }
                long nativeGetMcfTypeId7 = MetaAiCaption.nativeGetMcfTypeId();
                MetaAiCaption.sMcfTypeId = nativeGetMcfTypeId7;
                return nativeGetMcfTypeId7;
            case 7:
                long j8 = MetaAiMediaStatsProxy.CProxy.sMcfTypeId;
                if (j8 != 0) {
                    return j8;
                }
                long nativeGetMcfTypeId8 = MetaAiMediaStatsProxy.CProxy.nativeGetMcfTypeId();
                MetaAiMediaStatsProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId8;
                return nativeGetMcfTypeId8;
            case 8:
                long j9 = MetaAiVoiceStateProxy.CProxy.sMcfTypeId;
                if (j9 != 0) {
                    return j9;
                }
                long nativeGetMcfTypeId9 = MetaAiVoiceStateProxy.CProxy.nativeGetMcfTypeId();
                MetaAiVoiceStateProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId9;
                return nativeGetMcfTypeId9;
            case 9:
                long j10 = ModeratorApi.CProxy.sMcfTypeId;
                if (j10 != 0) {
                    return j10;
                }
                long nativeGetMcfTypeId10 = ModeratorApi.CProxy.nativeGetMcfTypeId();
                ModeratorApi.CProxy.sMcfTypeId = nativeGetMcfTypeId10;
                return nativeGetMcfTypeId10;
            case 10:
                long j11 = ModeratorClientModel.sMcfTypeId;
                if (j11 != 0) {
                    return j11;
                }
                long nativeGetMcfTypeId11 = ModeratorClientModel.nativeGetMcfTypeId();
                ModeratorClientModel.sMcfTypeId = nativeGetMcfTypeId11;
                return nativeGetMcfTypeId11;
            case 11:
                long j12 = ModeratorShimAudioModel.sMcfTypeId;
                if (j12 != 0) {
                    return j12;
                }
                long nativeGetMcfTypeId12 = ModeratorShimAudioModel.nativeGetMcfTypeId();
                ModeratorShimAudioModel.sMcfTypeId = nativeGetMcfTypeId12;
                return nativeGetMcfTypeId12;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                long j13 = MosaicGridApi.CProxy.sMcfTypeId;
                if (j13 != 0) {
                    return j13;
                }
                long nativeGetMcfTypeId13 = MosaicGridApi.CProxy.nativeGetMcfTypeId();
                MosaicGridApi.CProxy.sMcfTypeId = nativeGetMcfTypeId13;
                return nativeGetMcfTypeId13;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                long j14 = MosaicGridModel.sMcfTypeId;
                if (j14 != 0) {
                    return j14;
                }
                long nativeGetMcfTypeId14 = MosaicGridModel.nativeGetMcfTypeId();
                MosaicGridModel.sMcfTypeId = nativeGetMcfTypeId14;
                return nativeGetMcfTypeId14;
            case 14:
                long j15 = NetObjectApi.CProxy.sMcfTypeId;
                if (j15 != 0) {
                    return j15;
                }
                long nativeGetMcfTypeId15 = NetObjectApi.CProxy.nativeGetMcfTypeId();
                NetObjectApi.CProxy.sMcfTypeId = nativeGetMcfTypeId15;
                return nativeGetMcfTypeId15;
            case Process.SIGTERM /* 15 */:
                long j16 = NetObjectPeerMetadata.sMcfTypeId;
                if (j16 != 0) {
                    return j16;
                }
                long nativeGetMcfTypeId16 = NetObjectPeerMetadata.nativeGetMcfTypeId();
                NetObjectPeerMetadata.sMcfTypeId = nativeGetMcfTypeId16;
                return nativeGetMcfTypeId16;
            case 16:
                long j17 = NetObjectSession.CProxy.sMcfTypeId;
                if (j17 != 0) {
                    return j17;
                }
                long nativeGetMcfTypeId17 = NetObjectSession.CProxy.nativeGetMcfTypeId();
                NetObjectSession.CProxy.sMcfTypeId = nativeGetMcfTypeId17;
                return nativeGetMcfTypeId17;
            case 17:
                long j18 = NetObjectSessionCallback.CProxy.sMcfTypeId;
                if (j18 != 0) {
                    return j18;
                }
                long nativeGetMcfTypeId18 = NetObjectSessionCallback.CProxy.nativeGetMcfTypeId();
                NetObjectSessionCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId18;
                return nativeGetMcfTypeId18;
            case 18:
                long j19 = NetObjectSessionCreationConfig.sMcfTypeId;
                if (j19 != 0) {
                    return j19;
                }
                long nativeGetMcfTypeId19 = NetObjectSessionCreationConfig.nativeGetMcfTypeId();
                NetObjectSessionCreationConfig.sMcfTypeId = nativeGetMcfTypeId19;
                return nativeGetMcfTypeId19;
            case Process.SIGSTOP /* 19 */:
                long j20 = NetObjectSessionListener.CProxy.sMcfTypeId;
                if (j20 != 0) {
                    return j20;
                }
                long nativeGetMcfTypeId20 = NetObjectSessionListener.CProxy.nativeGetMcfTypeId();
                NetObjectSessionListener.CProxy.sMcfTypeId = nativeGetMcfTypeId20;
                return nativeGetMcfTypeId20;
            case 20:
                long j21 = RawDataListener.CProxy.sMcfTypeId;
                if (j21 != 0) {
                    return j21;
                }
                long nativeGetMcfTypeId21 = RawDataListener.CProxy.nativeGetMcfTypeId();
                RawDataListener.CProxy.sMcfTypeId = nativeGetMcfTypeId21;
                return nativeGetMcfTypeId21;
            case 21:
                long j22 = NetworkInfoCallback.CProxy.sMcfTypeId;
                if (j22 != 0) {
                    return j22;
                }
                long nativeGetMcfTypeId22 = NetworkInfoCallback.CProxy.nativeGetMcfTypeId();
                NetworkInfoCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId22;
                return nativeGetMcfTypeId22;
            case 22:
                long j23 = HttpStats.sMcfTypeId;
                if (j23 != 0) {
                    return j23;
                }
                long nativeGetMcfTypeId23 = HttpStats.nativeGetMcfTypeId();
                HttpStats.sMcfTypeId = nativeGetMcfTypeId23;
                return nativeGetMcfTypeId23;
            case 23:
                long j24 = NetworkTrafficProxy.CProxy.sMcfTypeId;
                if (j24 != 0) {
                    return j24;
                }
                long nativeGetMcfTypeId24 = NetworkTrafficProxy.CProxy.nativeGetMcfTypeId();
                NetworkTrafficProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId24;
                return nativeGetMcfTypeId24;
            case 24:
                long j25 = OutgoingCallConfig.sMcfTypeId;
                if (j25 != 0) {
                    return j25;
                }
                long nativeGetMcfTypeId25 = OutgoingCallConfig.nativeGetMcfTypeId();
                OutgoingCallConfig.sMcfTypeId = nativeGetMcfTypeId25;
                return nativeGetMcfTypeId25;
            case 25:
                long j26 = PerfLoggerHolder.sMcfTypeId;
                if (j26 != 0) {
                    return j26;
                }
                long nativeGetMcfTypeId26 = PerfLoggerHolder.nativeGetMcfTypeId();
                PerfLoggerHolder.sMcfTypeId = nativeGetMcfTypeId26;
                return nativeGetMcfTypeId26;
            case 26:
                long j27 = PollModel.sMcfTypeId;
                if (j27 != 0) {
                    return j27;
                }
                long nativeGetMcfTypeId27 = PollModel.nativeGetMcfTypeId();
                PollModel.sMcfTypeId = nativeGetMcfTypeId27;
                return nativeGetMcfTypeId27;
            case 27:
                long j28 = PollOptionContentModel.sMcfTypeId;
                if (j28 != 0) {
                    return j28;
                }
                long nativeGetMcfTypeId28 = PollOptionContentModel.nativeGetMcfTypeId();
                PollOptionContentModel.sMcfTypeId = nativeGetMcfTypeId28;
                return nativeGetMcfTypeId28;
            case 28:
                long j29 = PollParticipantModel.sMcfTypeId;
                if (j29 != 0) {
                    return j29;
                }
                long nativeGetMcfTypeId29 = PollParticipantModel.nativeGetMcfTypeId();
                PollParticipantModel.sMcfTypeId = nativeGetMcfTypeId29;
                return nativeGetMcfTypeId29;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                long j30 = PollPermissionsModel.sMcfTypeId;
                if (j30 != 0) {
                    return j30;
                }
                long nativeGetMcfTypeId30 = PollPermissionsModel.nativeGetMcfTypeId();
                PollPermissionsModel.sMcfTypeId = nativeGetMcfTypeId30;
                return nativeGetMcfTypeId30;
            case 30:
                long j31 = PollsApi.CProxy.sMcfTypeId;
                if (j31 != 0) {
                    return j31;
                }
                long nativeGetMcfTypeId31 = PollsApi.CProxy.nativeGetMcfTypeId();
                PollsApi.CProxy.sMcfTypeId = nativeGetMcfTypeId31;
                return nativeGetMcfTypeId31;
            case 31:
                long j32 = PollsCreateActionParams.sMcfTypeId;
                if (j32 != 0) {
                    return j32;
                }
                long nativeGetMcfTypeId32 = PollsCreateActionParams.nativeGetMcfTypeId();
                PollsCreateActionParams.sMcfTypeId = nativeGetMcfTypeId32;
                return nativeGetMcfTypeId32;
            case 32:
                long j33 = PollsPendingActionModel.sMcfTypeId;
                if (j33 != 0) {
                    return j33;
                }
                long nativeGetMcfTypeId33 = PollsPendingActionModel.nativeGetMcfTypeId();
                PollsPendingActionModel.sMcfTypeId = nativeGetMcfTypeId33;
                return nativeGetMcfTypeId33;
            case 33:
                long j34 = PollsRemoveActionParams.sMcfTypeId;
                if (j34 != 0) {
                    return j34;
                }
                long nativeGetMcfTypeId34 = PollsRemoveActionParams.nativeGetMcfTypeId();
                PollsRemoveActionParams.sMcfTypeId = nativeGetMcfTypeId34;
                return nativeGetMcfTypeId34;
            case 34:
                long j35 = PollsRemoveVoteActionParams.sMcfTypeId;
                if (j35 != 0) {
                    return j35;
                }
                long nativeGetMcfTypeId35 = PollsRemoveVoteActionParams.nativeGetMcfTypeId();
                PollsRemoveVoteActionParams.sMcfTypeId = nativeGetMcfTypeId35;
                return nativeGetMcfTypeId35;
            case 35:
                long j36 = PollsVoteActionParams.sMcfTypeId;
                if (j36 != 0) {
                    return j36;
                }
                long nativeGetMcfTypeId36 = PollsVoteActionParams.nativeGetMcfTypeId();
                PollsVoteActionParams.sMcfTypeId = nativeGetMcfTypeId36;
                return nativeGetMcfTypeId36;
            case 36:
                long j37 = EmojiModel.sMcfTypeId;
                if (j37 != 0) {
                    return j37;
                }
                long nativeGetMcfTypeId37 = EmojiModel.nativeGetMcfTypeId();
                EmojiModel.sMcfTypeId = nativeGetMcfTypeId37;
                return nativeGetMcfTypeId37;
            case 37:
                long j38 = EmojiReactionsModel.sMcfTypeId;
                if (j38 != 0) {
                    return j38;
                }
                long nativeGetMcfTypeId38 = EmojiReactionsModel.nativeGetMcfTypeId();
                EmojiReactionsModel.sMcfTypeId = nativeGetMcfTypeId38;
                return nativeGetMcfTypeId38;
            case 38:
                long j39 = EmojiReactionsParticipantModel.sMcfTypeId;
                if (j39 != 0) {
                    return j39;
                }
                long nativeGetMcfTypeId39 = EmojiReactionsParticipantModel.nativeGetMcfTypeId();
                EmojiReactionsParticipantModel.sMcfTypeId = nativeGetMcfTypeId39;
                return nativeGetMcfTypeId39;
            case 39:
                long j40 = PendingReactionModel.sMcfTypeId;
                if (j40 != 0) {
                    return j40;
                }
                long nativeGetMcfTypeId40 = PendingReactionModel.nativeGetMcfTypeId();
                PendingReactionModel.sMcfTypeId = nativeGetMcfTypeId40;
                return nativeGetMcfTypeId40;
            case 40:
                long j41 = ReactionModel.sMcfTypeId;
                if (j41 != 0) {
                    return j41;
                }
                long nativeGetMcfTypeId41 = ReactionModel.nativeGetMcfTypeId();
                ReactionModel.sMcfTypeId = nativeGetMcfTypeId41;
                return nativeGetMcfTypeId41;
            case Seq.NULL_REFNUM /* 41 */:
                long j42 = ReactionsApi.CProxy.sMcfTypeId;
                if (j42 != 0) {
                    return j42;
                }
                long nativeGetMcfTypeId42 = ReactionsApi.CProxy.nativeGetMcfTypeId();
                ReactionsApi.CProxy.sMcfTypeId = nativeGetMcfTypeId42;
                return nativeGetMcfTypeId42;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                long j43 = SendEmojiInputModel.sMcfTypeId;
                if (j43 != 0) {
                    return j43;
                }
                long nativeGetMcfTypeId43 = SendEmojiInputModel.nativeGetMcfTypeId();
                SendEmojiInputModel.sMcfTypeId = nativeGetMcfTypeId43;
                return nativeGetMcfTypeId43;
            case 43:
                long j44 = RealtimeSessionManagerApi.CProxy.sMcfTypeId;
                if (j44 != 0) {
                    return j44;
                }
                long nativeGetMcfTypeId44 = RealtimeSessionManagerApi.CProxy.nativeGetMcfTypeId();
                RealtimeSessionManagerApi.CProxy.sMcfTypeId = nativeGetMcfTypeId44;
                return nativeGetMcfTypeId44;
            case 44:
                long j45 = RoomCapabilityModel.sMcfTypeId;
                if (j45 != 0) {
                    return j45;
                }
                long nativeGetMcfTypeId45 = RoomCapabilityModel.nativeGetMcfTypeId();
                RoomCapabilityModel.sMcfTypeId = nativeGetMcfTypeId45;
                return nativeGetMcfTypeId45;
            case 45:
                long j46 = RoomMetadataModel.sMcfTypeId;
                if (j46 != 0) {
                    return j46;
                }
                long nativeGetMcfTypeId46 = RoomMetadataModel.nativeGetMcfTypeId();
                RoomMetadataModel.sMcfTypeId = nativeGetMcfTypeId46;
                return nativeGetMcfTypeId46;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                long j47 = RoomModel.sMcfTypeId;
                if (j47 != 0) {
                    return j47;
                }
                long nativeGetMcfTypeId47 = RoomModel.nativeGetMcfTypeId();
                RoomModel.sMcfTypeId = nativeGetMcfTypeId47;
                return nativeGetMcfTypeId47;
            case 47:
                long j48 = RoomParticipantInfo.sMcfTypeId;
                if (j48 != 0) {
                    return j48;
                }
                long nativeGetMcfTypeId48 = RoomParticipantInfo.nativeGetMcfTypeId();
                RoomParticipantInfo.sMcfTypeId = nativeGetMcfTypeId48;
                return nativeGetMcfTypeId48;
            case 48:
                long j49 = RoomResolveConfig.sMcfTypeId;
                if (j49 != 0) {
                    return j49;
                }
                long nativeGetMcfTypeId49 = RoomResolveConfig.nativeGetMcfTypeId();
                RoomResolveConfig.sMcfTypeId = nativeGetMcfTypeId49;
                return nativeGetMcfTypeId49;
            case 49:
                long j50 = RinglistParticipantInfo.sMcfTypeId;
                if (j50 != 0) {
                    return j50;
                }
                long nativeGetMcfTypeId50 = RinglistParticipantInfo.nativeGetMcfTypeId();
                RinglistParticipantInfo.sMcfTypeId = nativeGetMcfTypeId50;
                return nativeGetMcfTypeId50;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                long j51 = StarRatingApi.CProxy.sMcfTypeId;
                if (j51 != 0) {
                    return j51;
                }
                long nativeGetMcfTypeId51 = StarRatingApi.CProxy.nativeGetMcfTypeId();
                StarRatingApi.CProxy.sMcfTypeId = nativeGetMcfTypeId51;
                return nativeGetMcfTypeId51;
            case 51:
                long j52 = StarRatingModel.sMcfTypeId;
                if (j52 != 0) {
                    return j52;
                }
                long nativeGetMcfTypeId52 = StarRatingModel.nativeGetMcfTypeId();
                StarRatingModel.sMcfTypeId = nativeGetMcfTypeId52;
                return nativeGetMcfTypeId52;
            case 52:
                long j53 = LocalVideoStream.sMcfTypeId;
                if (j53 != 0) {
                    return j53;
                }
                long nativeGetMcfTypeId53 = LocalVideoStream.nativeGetMcfTypeId();
                LocalVideoStream.sMcfTypeId = nativeGetMcfTypeId53;
                return nativeGetMcfTypeId53;
            case 53:
                long j54 = StreamApi.CProxy.sMcfTypeId;
                if (j54 != 0) {
                    return j54;
                }
                long nativeGetMcfTypeId54 = StreamApi.CProxy.nativeGetMcfTypeId();
                StreamApi.CProxy.sMcfTypeId = nativeGetMcfTypeId54;
                return nativeGetMcfTypeId54;
            case 54:
                long j55 = StreamCallbacks.CProxy.sMcfTypeId;
                if (j55 != 0) {
                    return j55;
                }
                long nativeGetMcfTypeId55 = StreamCallbacks.CProxy.nativeGetMcfTypeId();
                StreamCallbacks.CProxy.sMcfTypeId = nativeGetMcfTypeId55;
                return nativeGetMcfTypeId55;
            case 55:
                long j56 = StreamModel.sMcfTypeId;
                if (j56 != 0) {
                    return j56;
                }
                long nativeGetMcfTypeId56 = StreamModel.nativeGetMcfTypeId();
                StreamModel.sMcfTypeId = nativeGetMcfTypeId56;
                return nativeGetMcfTypeId56;
            case 56:
                long j57 = VideoCapturePropertiesListener.CProxy.sMcfTypeId;
                if (j57 != 0) {
                    return j57;
                }
                long nativeGetMcfTypeId57 = VideoCapturePropertiesListener.CProxy.nativeGetMcfTypeId();
                VideoCapturePropertiesListener.CProxy.sMcfTypeId = nativeGetMcfTypeId57;
                return nativeGetMcfTypeId57;
            case 57:
                long j58 = VideoStreamController.CProxy.sMcfTypeId;
                if (j58 != 0) {
                    return j58;
                }
                long nativeGetMcfTypeId58 = VideoStreamController.CProxy.nativeGetMcfTypeId();
                VideoStreamController.CProxy.sMcfTypeId = nativeGetMcfTypeId58;
                return nativeGetMcfTypeId58;
            case 58:
                long j59 = VideoStreamParams.sMcfTypeId;
                if (j59 != 0) {
                    return j59;
                }
                long nativeGetMcfTypeId59 = VideoStreamParams.nativeGetMcfTypeId();
                VideoStreamParams.sMcfTypeId = nativeGetMcfTypeId59;
                return nativeGetMcfTypeId59;
            case 59:
                long j60 = VideoStreamSendParams.sMcfTypeId;
                if (j60 != 0) {
                    return j60;
                }
                long nativeGetMcfTypeId60 = VideoStreamSendParams.nativeGetMcfTypeId();
                VideoStreamSendParams.sMcfTypeId = nativeGetMcfTypeId60;
                return nativeGetMcfTypeId60;
            case 60:
                long j61 = MessageReceiveCallbacks.CProxy.A00;
                if (j61 != 0) {
                    return j61;
                }
                long nativeGetMcfTypeId61 = MessageReceiveCallbacks.CProxy.nativeGetMcfTypeId();
                MessageReceiveCallbacks.CProxy.A00 = nativeGetMcfTypeId61;
                return nativeGetMcfTypeId61;
            case 61:
                long j62 = MetricIdentifiers.sMcfTypeId;
                if (j62 != 0) {
                    return j62;
                }
                long nativeGetMcfTypeId62 = MetricIdentifiers.nativeGetMcfTypeId();
                MetricIdentifiers.sMcfTypeId = nativeGetMcfTypeId62;
                return nativeGetMcfTypeId62;
            case 62:
                long j63 = SendMessageAttemptStats.sMcfTypeId;
                if (j63 != 0) {
                    return j63;
                }
                long nativeGetMcfTypeId63 = SendMessageAttemptStats.nativeGetMcfTypeId();
                SendMessageAttemptStats.sMcfTypeId = nativeGetMcfTypeId63;
                return nativeGetMcfTypeId63;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                long j64 = SendMessageStats.sMcfTypeId;
                if (j64 != 0) {
                    return j64;
                }
                long nativeGetMcfTypeId64 = SendMessageStats.nativeGetMcfTypeId();
                SendMessageStats.sMcfTypeId = nativeGetMcfTypeId64;
                return nativeGetMcfTypeId64;
            case 64:
                long j65 = SignalingMessage.sMcfTypeId;
                if (j65 != 0) {
                    return j65;
                }
                long nativeGetMcfTypeId65 = SignalingMessage.nativeGetMcfTypeId();
                SignalingMessage.sMcfTypeId = nativeGetMcfTypeId65;
                return nativeGetMcfTypeId65;
            case 65:
                long j66 = SignalingMessageIncomingStats.sMcfTypeId;
                if (j66 != 0) {
                    return j66;
                }
                long nativeGetMcfTypeId66 = SignalingMessageIncomingStats.nativeGetMcfTypeId();
                SignalingMessageIncomingStats.sMcfTypeId = nativeGetMcfTypeId66;
                return nativeGetMcfTypeId66;
            case 66:
                long j67 = SignalingTransportCallbackExt.CProxy.sMcfTypeId;
                if (j67 != 0) {
                    return j67;
                }
                long nativeGetMcfTypeId67 = SignalingTransportCallbackExt.CProxy.nativeGetMcfTypeId();
                SignalingTransportCallbackExt.CProxy.sMcfTypeId = nativeGetMcfTypeId67;
                return nativeGetMcfTypeId67;
            case 67:
                long j68 = SignalingTransportProxy.CProxy.sMcfTypeId;
                if (j68 != 0) {
                    return j68;
                }
                long nativeGetMcfTypeId68 = SignalingTransportProxy.CProxy.nativeGetMcfTypeId();
                SignalingTransportProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId68;
                return nativeGetMcfTypeId68;
            case 68:
                long j69 = SignalingTransportSink.CProxy.sMcfTypeId;
                if (j69 != 0) {
                    return j69;
                }
                long nativeGetMcfTypeId69 = SignalingTransportSink.CProxy.nativeGetMcfTypeId();
                SignalingTransportSink.CProxy.sMcfTypeId = nativeGetMcfTypeId69;
                return nativeGetMcfTypeId69;
            case 69:
                long j70 = StatusUpdate.sMcfTypeId;
                if (j70 != 0) {
                    return j70;
                }
                long nativeGetMcfTypeId70 = StatusUpdate.nativeGetMcfTypeId();
                StatusUpdate.sMcfTypeId = nativeGetMcfTypeId70;
                return nativeGetMcfTypeId70;
            default:
                long j71 = TslogCounterApi.CProxy.sMcfTypeId;
                if (j71 == 0) {
                    long nativeGetMcfTypeId71 = TslogCounterApi.CProxy.nativeGetMcfTypeId();
                    TslogCounterApi.CProxy.sMcfTypeId = nativeGetMcfTypeId71;
                    return nativeGetMcfTypeId71;
                }
                return j71;
        }
    }
}
