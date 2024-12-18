package com.instagram.rtc.rsys.models;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C2N9;
import X.C55647OnY;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationModel;
import com.facebook.rsys.crypto.gen.CryptoE2eeModel;
import com.facebook.rsys.dominantspeaker.gen.DominantSpeakerModel;
import com.facebook.rsys.grid.gen.GridModel;
import com.facebook.rsys.livevideo.gen.LiveVideoModel;
import com.facebook.rsys.moderator.gen.ModeratorSoftMuteModel;
import com.facebook.rsys.mosaicgrid.gen.MosaicGridModel;
import com.facebook.rsys.photobooth.gen.PhotoboothModel;
import com.facebook.rsys.reactions.gen.EmojiReactionsModel;
import com.facebook.rsys.rooms.gen.RoomModel;
import com.facebook.rsys.roomslobby.gen.LobbyModel;
import com.facebook.rsys.screenshare.gen.ScreenShareModel;
import java.util.Map;

/* loaded from: classes9.dex */
public class EngineModel {
    public static C2N9 CONVERTER = new C55647OnY(8);
    public static long sMcfTypeId;
    public final AvatarCommunicationModel avatarCommunicationModel;
    public final CallEndedModel callEndedModel;
    public final IgCallModel callModel;
    public final CryptoE2eeModel cryptoE2eeModel;
    public final DominantSpeakerModel dominantSpeakerModel;
    public final EmojiReactionsModel emojiReactionsModel;
    public final GridModel gridModel;
    public final LiveVideoModel liveVideoModel;
    public final LobbyModel lobbyModel;
    public final ModeratorSoftMuteModel moderatorSoftMuteModel;
    public final MosaicGridModel mosaicGridModel;
    public final PhotoboothModel photoboothModel;
    public final Map rawModels;
    public final RoomModel roomModel;
    public final ScreenShareModel screenShareModel;
    public final int state;

    public static native EngineModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EngineModel)) {
                return false;
            }
            EngineModel engineModel = (EngineModel) obj;
            if (this.state == engineModel.state) {
                IgCallModel igCallModel = this.callModel;
                IgCallModel igCallModel2 = engineModel.callModel;
                if (igCallModel == null) {
                    if (igCallModel2 != null) {
                        return false;
                    }
                } else if (!igCallModel.equals(igCallModel2)) {
                    return false;
                }
                RoomModel roomModel = this.roomModel;
                RoomModel roomModel2 = engineModel.roomModel;
                if (roomModel == null) {
                    if (roomModel2 != null) {
                        return false;
                    }
                } else if (!roomModel.equals(roomModel2)) {
                    return false;
                }
                LobbyModel lobbyModel = this.lobbyModel;
                LobbyModel lobbyModel2 = engineModel.lobbyModel;
                if (lobbyModel == null) {
                    if (lobbyModel2 != null) {
                        return false;
                    }
                } else if (!lobbyModel.equals(lobbyModel2)) {
                    return false;
                }
                LiveVideoModel liveVideoModel = this.liveVideoModel;
                LiveVideoModel liveVideoModel2 = engineModel.liveVideoModel;
                if (liveVideoModel == null) {
                    if (liveVideoModel2 != null) {
                        return false;
                    }
                } else if (!liveVideoModel.equals(liveVideoModel2)) {
                    return false;
                }
                MosaicGridModel mosaicGridModel = this.mosaicGridModel;
                MosaicGridModel mosaicGridModel2 = engineModel.mosaicGridModel;
                if (mosaicGridModel == null) {
                    if (mosaicGridModel2 != null) {
                        return false;
                    }
                } else if (!mosaicGridModel.equals(mosaicGridModel2)) {
                    return false;
                }
                CallEndedModel callEndedModel = this.callEndedModel;
                CallEndedModel callEndedModel2 = engineModel.callEndedModel;
                if (callEndedModel == null) {
                    if (callEndedModel2 != null) {
                        return false;
                    }
                } else if (!callEndedModel.equals(callEndedModel2)) {
                    return false;
                }
                GridModel gridModel = this.gridModel;
                GridModel gridModel2 = engineModel.gridModel;
                if (gridModel == null) {
                    if (gridModel2 != null) {
                        return false;
                    }
                } else if (!gridModel.equals(gridModel2)) {
                    return false;
                }
                ModeratorSoftMuteModel moderatorSoftMuteModel = this.moderatorSoftMuteModel;
                ModeratorSoftMuteModel moderatorSoftMuteModel2 = engineModel.moderatorSoftMuteModel;
                if (moderatorSoftMuteModel == null) {
                    if (moderatorSoftMuteModel2 != null) {
                        return false;
                    }
                } else if (!moderatorSoftMuteModel.equals(moderatorSoftMuteModel2)) {
                    return false;
                }
                PhotoboothModel photoboothModel = this.photoboothModel;
                PhotoboothModel photoboothModel2 = engineModel.photoboothModel;
                if (photoboothModel == null) {
                    if (photoboothModel2 != null) {
                        return false;
                    }
                } else if (!photoboothModel.equals(photoboothModel2)) {
                    return false;
                }
                CryptoE2eeModel cryptoE2eeModel = this.cryptoE2eeModel;
                CryptoE2eeModel cryptoE2eeModel2 = engineModel.cryptoE2eeModel;
                if (cryptoE2eeModel == null) {
                    if (cryptoE2eeModel2 != null) {
                        return false;
                    }
                } else if (!cryptoE2eeModel.equals(cryptoE2eeModel2)) {
                    return false;
                }
                AvatarCommunicationModel avatarCommunicationModel = this.avatarCommunicationModel;
                AvatarCommunicationModel avatarCommunicationModel2 = engineModel.avatarCommunicationModel;
                if (avatarCommunicationModel == null) {
                    if (avatarCommunicationModel2 != null) {
                        return false;
                    }
                } else if (!avatarCommunicationModel.equals(avatarCommunicationModel2)) {
                    return false;
                }
                ScreenShareModel screenShareModel = this.screenShareModel;
                ScreenShareModel screenShareModel2 = engineModel.screenShareModel;
                if (screenShareModel == null) {
                    if (screenShareModel2 != null) {
                        return false;
                    }
                } else if (!screenShareModel.equals(screenShareModel2)) {
                    return false;
                }
                EmojiReactionsModel emojiReactionsModel = this.emojiReactionsModel;
                EmojiReactionsModel emojiReactionsModel2 = engineModel.emojiReactionsModel;
                if (emojiReactionsModel == null) {
                    if (emojiReactionsModel2 != null) {
                        return false;
                    }
                } else if (!emojiReactionsModel.equals(emojiReactionsModel2)) {
                    return false;
                }
                DominantSpeakerModel dominantSpeakerModel = this.dominantSpeakerModel;
                DominantSpeakerModel dominantSpeakerModel2 = engineModel.dominantSpeakerModel;
                if (dominantSpeakerModel != null) {
                    if (!dominantSpeakerModel.equals(dominantSpeakerModel2)) {
                        return false;
                    }
                } else if (dominantSpeakerModel2 != null) {
                    return false;
                }
                if (!this.rawModels.equals(engineModel.rawModels)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((JQ0.A01(this.state) + AbstractC167017dG.A0M(this.callModel)) * 31) + AbstractC167017dG.A0M(this.roomModel)) * 31) + AbstractC167017dG.A0M(this.lobbyModel)) * 31) + AbstractC167017dG.A0M(this.liveVideoModel)) * 31) + AbstractC167017dG.A0M(this.mosaicGridModel)) * 31) + AbstractC167017dG.A0M(this.callEndedModel)) * 31) + AbstractC167017dG.A0M(this.gridModel)) * 31) + AbstractC167017dG.A0M(this.moderatorSoftMuteModel)) * 31) + AbstractC167017dG.A0M(this.photoboothModel)) * 31) + AbstractC167017dG.A0M(this.cryptoE2eeModel)) * 31) + AbstractC167017dG.A0M(this.avatarCommunicationModel)) * 31) + AbstractC167017dG.A0M(this.screenShareModel)) * 31) + AbstractC167017dG.A0M(this.emojiReactionsModel)) * 31) + AbstractC166997dE.A0I(this.dominantSpeakerModel)) * 31) + this.rawModels.hashCode();
    }

    public EngineModel(int i, IgCallModel igCallModel, RoomModel roomModel, LobbyModel lobbyModel, LiveVideoModel liveVideoModel, MosaicGridModel mosaicGridModel, CallEndedModel callEndedModel, GridModel gridModel, ModeratorSoftMuteModel moderatorSoftMuteModel, PhotoboothModel photoboothModel, CryptoE2eeModel cryptoE2eeModel, AvatarCommunicationModel avatarCommunicationModel, ScreenShareModel screenShareModel, EmojiReactionsModel emojiReactionsModel, DominantSpeakerModel dominantSpeakerModel, Map map) {
        map.getClass();
        this.state = i;
        this.callModel = igCallModel;
        this.roomModel = roomModel;
        this.lobbyModel = lobbyModel;
        this.liveVideoModel = liveVideoModel;
        this.mosaicGridModel = mosaicGridModel;
        this.callEndedModel = callEndedModel;
        this.gridModel = gridModel;
        this.moderatorSoftMuteModel = moderatorSoftMuteModel;
        this.photoboothModel = photoboothModel;
        this.cryptoE2eeModel = cryptoE2eeModel;
        this.avatarCommunicationModel = avatarCommunicationModel;
        this.screenShareModel = screenShareModel;
        this.emojiReactionsModel = emojiReactionsModel;
        this.dominantSpeakerModel = dominantSpeakerModel;
        this.rawModels = map;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EngineModel{state=");
        A1C.append(this.state);
        A1C.append(",callModel=");
        A1C.append(this.callModel);
        A1C.append(",roomModel=");
        A1C.append(this.roomModel);
        A1C.append(",lobbyModel=");
        A1C.append(this.lobbyModel);
        A1C.append(",liveVideoModel=");
        A1C.append(this.liveVideoModel);
        A1C.append(",mosaicGridModel=");
        A1C.append(this.mosaicGridModel);
        A1C.append(",callEndedModel=");
        A1C.append(this.callEndedModel);
        A1C.append(",gridModel=");
        A1C.append(this.gridModel);
        A1C.append(",moderatorSoftMuteModel=");
        A1C.append(this.moderatorSoftMuteModel);
        A1C.append(",photoboothModel=");
        A1C.append(this.photoboothModel);
        A1C.append(",cryptoE2eeModel=");
        A1C.append(this.cryptoE2eeModel);
        A1C.append(",avatarCommunicationModel=");
        A1C.append(this.avatarCommunicationModel);
        A1C.append(",screenShareModel=");
        A1C.append(this.screenShareModel);
        A1C.append(",emojiReactionsModel=");
        A1C.append(this.emojiReactionsModel);
        A1C.append(",dominantSpeakerModel=");
        A1C.append(this.dominantSpeakerModel);
        A1C.append(",rawModels=");
        return JQ0.A0l(this.rawModels, A1C);
    }
}
