package X;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.Challenge;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.api.schemas.LinkAction;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.clips.model.ClipsCreationToolsResponse$ContentFundingDeal;
import com.instagram.clips.model.ClipsSpotlightData;
import com.instagram.clips.model.ClipsSpotlightModel;
import com.instagram.clips.model.ClipsTogetherData;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.clips.model.metadata.AudioPartType;
import com.instagram.clips.model.metadata.ClipsFanClubMetadata;
import com.instagram.clips.model.metadata.InteractionUpsellCTAType;
import com.instagram.clips.template.creation.model.ClipsTemplateModel;
import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import com.instagram.comments.model.ChannelCommentsData;
import com.instagram.comments.model.ChannelRepliesNotifData;
import com.instagram.common.clips.model.ClipSegment;
import com.instagram.common.clips.model.LayoutTransform;
import com.instagram.common.clips.model.VideoCropParams;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.FaceCenter;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.common.typedurl.GifUrlLoggingExtras;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;
import com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import com.instagram.compose.ui.gradientspinner.BezierControlPoints;
import com.instagram.compose.ui.gradientspinner.Segment;
import com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates;
import com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState;
import com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.directstack.DirectMessageEmojiInfo;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;
import com.instagram.contentnotes.domain.uistate.ContentNotesOverflowFragmentUiState;
import com.instagram.contentnotes.domain.uistate.NoteTextContent;
import com.instagram.contentnotes.domain.uistate.NoteTextStringLiteralContent;
import com.instagram.contentnotes.domain.uistate.NoteTextStringResourceContent;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker;
import com.instagram.creation.capture.assetpicker.model.ShoppingMultiProductConfig;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import com.instagram.creation.capture.gallery.GalleryPreviewInfo;
import com.instagram.creation.capture.gallery.ui.GalleryPickerView$SavedState;
import com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig;
import com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NoOpCreationLayoutConfig;
import com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.controller.visibility.VisibilityControllerComponentInterface$State;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.GalleryGridEditMediaSelectionFragment$Config;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo;
import com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.creation.capture.quickcapture.precapture.PreCaptureButtonManagerIntf$State;
import com.instagram.creation.capture.quickcapture.recipientpicker.GroupProfileStoryRecipient;
import com.instagram.creation.capture.quickcapture.sundial.edit.nux.EducationNuxType;
import com.instagram.creation.capture.quickcapture.sundial.remix.model.ClipsRemixControllerSavedState;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeNotifyToUsers;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import com.instagram.creation.channels.model.AddChannelsRowChannelInfo;
import com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetParams;
import com.instagram.creation.genai.contextualbackground.model.ContextualBackgroundSourceImage;
import com.instagram.creation.genai.magicmod.model.ExpanderConfig;
import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;
import com.instagram.creation.genai.magicmod.model.MagicModTopicInfo;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.effectfilter.UnifiedVideoCoverFrameFilter;
import com.instagram.creation.photo.edit.filter.UnifiedFilterParamCallbackImpl;
import com.instagram.creation.photo.util.ExifImageData;
import com.instagram.creation.sharesheet.advancedsettings.config.ClipsAdvancedSettingsConfig;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import com.instagram.creation.state.CreationState;
import com.instagram.creator.achievements.modules.models.Badge;
import com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext;
import com.instagram.creatormessaging.intf.CategorySelectionScreenArgs;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.creatortools.api.schemas.CreatorToolsComponent;
import com.instagram.creatortools.api.schemas.EligibilityCriteria;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.direct.appwidget.DirectThreadWidgetItem;
import com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.direct.emojipong.data.EmojiPongUser;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeAllWinnersShareInfo;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeOneWinnerShareInfo;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengePromptShareInfo;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.effect.AREffect;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
public final class LNM implements Parcelable.Creator {
    public final int A00;

    public LNM(int i) {
        this.A00 = i;
    }

    public static LNM A00(int i) {
        return new LNM(i);
    }

    /* JADX WARN: Type inference failed for: r7v100, types: [java.lang.Object, com.instagram.clips.model.ClipsCreationToolsResponse$ContentFundingDeal] */
    /* JADX WARN: Type inference failed for: r7v102, types: [android.view.View$BaseSavedState, com.instagram.creation.capture.gallery.ui.GalleryPickerView$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v43, types: [java.lang.Object, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo] */
    /* JADX WARN: Type inference failed for: r7v46, types: [com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v47, types: [com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v52, types: [com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v54, types: [com.instagram.creation.capture.gallery.GalleryPreviewInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v58, types: [android.view.View$BaseSavedState, java.lang.Object, com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker$SavedState] */
    /* JADX WARN: Type inference failed for: r7v75, types: [com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v76, types: [android.view.View$BaseSavedState, com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v81, types: [java.lang.Object, com.instagram.common.gallery.FaceCenter] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        EnumC46279KeB valueOf;
        Integer A0U;
        Integer A0U2;
        Boolean valueOf2;
        Object createFromParcel2;
        Object createFromParcel3;
        Integer num;
        Boolean valueOf3;
        Integer A0U3;
        Integer num2;
        Integer num3;
        Integer num4;
        Long valueOf4;
        Object createFromParcel4;
        Long valueOf5;
        ArrayList A17;
        ArrayList A172;
        ArrayList A173;
        Integer num5;
        Integer num6;
        Object createFromParcel5;
        C22P c22p;
        Double valueOf6;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(parcel, 0);
                ?? obj = new Object();
                obj.A00 = parcel.readLong();
                obj.A01 = parcel.readString();
                obj.A02 = parcel.readString();
                return obj;
            case 1:
                int A00 = AbstractC37304Gc5.A00(parcel);
                LinkedHashMap A18 = AbstractC25225BEi.A18(A00);
                for (int i = 0; i != A00; i++) {
                    A18.put(parcel.readString(), ClipsSpotlightModel.CREATOR.createFromParcel(parcel));
                }
                return new ClipsSpotlightData(A18);
            case 2:
                C14360o3.A0B(parcel, 0);
                return new ClipsSpotlightModel((User) AbstractC37304Gc5.A04(parcel, ClipsSpotlightModel.class), parcel.readLong());
            case 3:
                return new ClipsTogetherData(AbstractC37304Gc5.A0d(parcel), AbstractC37304Gc5.A1V(parcel));
            case 4:
                String A0d = AbstractC37304Gc5.A0d(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean A1V = AbstractC37304Gc5.A1V(parcel);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                ImageUrl imageUrl = (ImageUrl) AbstractC37304Gc5.A04(parcel, AudioPageMetadata.class);
                ImageUrl imageUrl2 = (ImageUrl) AbstractC37304Gc5.A04(parcel, AudioPageMetadata.class);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                AudioType audioType = (AudioType) AbstractC37304Gc5.A04(parcel, AudioPageMetadata.class);
                boolean A1V2 = AbstractC37304Gc5.A1V(parcel);
                String readString11 = parcel.readString();
                return new AudioPageMetadata((AudioFilterType) AbstractC37304Gc5.A04(parcel, AudioPageMetadata.class), imageUrl, imageUrl2, (MusicAttributionConfig) AbstractC37304Gc5.A04(parcel, AudioPageMetadata.class), audioType, (MusicDataSource) AbstractC37304Gc5.A04(parcel, AudioPageMetadata.class), A0d, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), A1V, A1V2, AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 5:
                C14360o3.A0B(parcel, 0);
                return AudioPartType.values()[parcel.readInt()];
            case 6:
                return new ClipsFanClubMetadata(EnumC31515Dsz.valueOf(parcel.readString()), AbstractC37304Gc5.A0d(parcel));
            case 7:
                C14360o3.A0B(parcel, 0);
                return InteractionUpsellCTAType.values()[parcel.readInt()];
            case 8:
                String A0d2 = AbstractC37304Gc5.A0d(parcel);
                String readString12 = parcel.readString();
                C110204xp parseFromJson = AbstractC88493x6.parseFromJson(C16V.A00(parcel.readString()));
                C14360o3.A07(parseFromJson);
                C22P[] values = C22P.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        c22p = values[i2];
                        long readLong = parcel.readLong();
                        long j = c22p.A00;
                        if (Long.valueOf(j) == null || readLong != j) {
                            i2++;
                        }
                    } else {
                        c22p = C22P.A5N;
                    }
                }
                return new ClipsTemplateModel(c22p, parseFromJson, (User) AbstractC37304Gc5.A04(parcel, ClipsTemplateModel.class), A0d2, readString12);
            case 9:
                String A0d3 = AbstractC37304Gc5.A0d(parcel);
                String readString13 = parcel.readString();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                ArrayList A174 = AbstractC25225BEi.A17(readInt2);
                for (int i3 = 0; i3 != readInt2; i3++) {
                    AbstractC37304Gc5.A0r(parcel, AudienceListViewModel.class, A174);
                }
                return new AudienceListViewModel(A0d3, readString13, A174, readInt, AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 10:
                return new ChannelCommentsData((MessageIdentifier) AbstractC37304Gc5.A04(parcel, ChannelCommentsData.class), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 11:
                return new ChannelRepliesNotifData(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                String A0d4 = AbstractC37304Gc5.A0d(parcel);
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                Integer num7 = null;
                if (parcel.readInt() == 0) {
                    createFromParcel5 = null;
                } else {
                    createFromParcel5 = LayoutTransform.CREATOR.createFromParcel(parcel);
                }
                LayoutTransform layoutTransform = (LayoutTransform) createFromParcel5;
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                Integer A0Y = AbstractC37304Gc5.A0Y(parcel);
                if (parcel.readInt() != 0) {
                    num7 = AbstractC37304Gc5.A0U(parcel);
                }
                return new ClipSegment.PhotoSegment(layoutTransform, A0Y, num7, A0d4, readString14, readString15, readInt3, readInt4, readInt5, readInt6, parcel.readInt(), AbstractC37304Gc5.A1V(parcel));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                String A0d5 = AbstractC37304Gc5.A0d(parcel);
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                Object obj2 = null;
                if (parcel.readInt() != 0) {
                    obj2 = LayoutTransform.CREATOR.createFromParcel(parcel);
                }
                ImmutableList immutableList = (ImmutableList) parcel.readSerializable();
                long readLong2 = parcel.readLong();
                int readInt10 = parcel.readInt();
                int readInt11 = parcel.readInt();
                int readInt12 = parcel.readInt();
                float readFloat = parcel.readFloat();
                float readFloat2 = parcel.readFloat();
                boolean A1V3 = AbstractC37304Gc5.A1V(parcel);
                return new ClipSegment.VideoSegment(immutableList, (LayoutTransform) obj2, AbstractC37304Gc5.A0Y(parcel), AbstractC37304Gc5.A0W(parcel), A0d5, parcel.readString(), parcel.readString(), readFloat, readFloat2, readInt7, readInt8, readInt9, readInt10, readInt11, readInt12, parcel.readInt(), readLong2, A1V3, AbstractC37304Gc5.A1V(parcel));
            case 14:
                C14360o3.A0B(parcel, 0);
                boolean A1V4 = AbstractC37304Gc5.A1V(parcel);
                float readFloat3 = parcel.readFloat();
                float readFloat4 = parcel.readFloat();
                float readFloat5 = parcel.readFloat();
                float readFloat6 = parcel.readFloat();
                String readString16 = parcel.readString();
                if (readString16.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
                    num6 = C05F.A00;
                } else if (readString16.equals("FILL_SCREEN")) {
                    num6 = C05F.A01;
                } else if (readString16.equals("SQUARE_CROP")) {
                    num6 = C05F.A0C;
                } else if (readString16.equals("CLIP_TRANSFORM")) {
                    num6 = C05F.A0N;
                } else {
                    throw AbstractC166987dD.A12(readString16);
                }
                return new LayoutTransform(num6, readFloat3, readFloat4, readFloat5, readFloat6, parcel.readInt(), parcel.readInt(), A1V4);
            case Process.SIGTERM /* 15 */:
                C14360o3.A0B(parcel, 0);
                return new VideoCropParams(parcel.readDouble(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
            case 16:
                C14360o3.A0B(parcel, 0);
                ?? obj3 = new Object();
                obj3.A01 = parcel.readFloat();
                obj3.A02 = parcel.readFloat();
                obj3.A00 = parcel.readFloat();
                return obj3;
            case 17:
                String A0d6 = AbstractC37304Gc5.A0d(parcel);
                if (A0d6 == null) {
                    A0d6 = AbstractC167017dG.A0j();
                }
                Medium medium = (Medium) AbstractC37304Gc5.A04(parcel, Medium.class);
                Draft draft = (Draft) AbstractC37304Gc5.A04(parcel, Draft.class);
                RemoteMedia remoteMedia = (RemoteMedia) AbstractC37304Gc5.A04(parcel, RemoteMedia.class);
                String readString17 = parcel.readString();
                if (readString17 != null) {
                    if (readString17.equals("LOCAL_GALLERY")) {
                        num5 = C05F.A00;
                    } else if (readString17.equals("DRAFT")) {
                        num5 = C05F.A01;
                    } else if (readString17.equals("REMOTE_MEDIA")) {
                        num5 = C05F.A0C;
                    } else if (readString17.equals("CAPTURE_NAVIGATION_ITEM")) {
                        num5 = C05F.A0N;
                    } else if (readString17.equals(AbstractC111324zv.A00(683))) {
                        num5 = C05F.A0Y;
                    } else if (readString17.equals("CAPTURED_PHOTO")) {
                        num5 = C05F.A0j;
                    } else if (readString17.equals("CAPTURED_VIDEO")) {
                        num5 = C05F.A0u;
                    } else if (readString17.equals("URL")) {
                        num5 = C05F.A15;
                    } else if (readString17.equals("EMPTY_SEGMENT")) {
                        num5 = C05F.A1F;
                    } else {
                        throw AbstractC166987dD.A12(readString17);
                    }
                    if (num5 == C05F.A00) {
                        if (medium != null) {
                            return new GalleryItem.LocalGalleryMedium(medium, A0d6);
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    return new GalleryItem(draft, null, medium, remoteMedia, null, null, null, null, num5, A0d6, -1);
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 18:
                Long l = null;
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    A17 = null;
                } else {
                    int readInt13 = parcel.readInt();
                    A17 = AbstractC25225BEi.A17(readInt13);
                    for (int i4 = 0; i4 != readInt13; i4++) {
                        AbstractC37304Gc5.A0r(parcel, TextWithEntities.class, A17);
                    }
                }
                if (parcel.readInt() == 0) {
                    A172 = null;
                } else {
                    int readInt14 = parcel.readInt();
                    A172 = AbstractC25225BEi.A17(readInt14);
                    for (int i5 = 0; i5 != readInt14; i5++) {
                        AbstractC37304Gc5.A0r(parcel, TextWithEntities.class, A172);
                    }
                }
                LinkAction linkAction = (LinkAction) AbstractC37304Gc5.A04(parcel, TextWithEntities.class);
                if (parcel.readInt() == 0) {
                    A173 = null;
                } else {
                    int readInt15 = parcel.readInt();
                    A173 = AbstractC25225BEi.A17(readInt15);
                    for (int i6 = 0; i6 != readInt15; i6++) {
                        AbstractC37304Gc5.A0r(parcel, TextWithEntities.class, A173);
                    }
                }
                String readString18 = parcel.readString();
                if (parcel.readInt() != 0) {
                    l = Long.valueOf(parcel.readLong());
                }
                return new TextWithEntities(linkAction, l, readString18, A17, A172, A173);
            case Process.SIGSTOP /* 19 */:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Long.valueOf(parcel.readLong());
                }
                return new GifUrlLoggingExtras(valueOf5, parcel.readString(), parcel.readString());
            case 20:
                C14360o3.A0B(parcel, 0);
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.A00 = AbstractC37304Gc5.A04(parcel, RefreshableRecyclerViewLayout.SavedState.class);
                return baseSavedState;
            case 21:
                ?? obj4 = new Object();
                obj4.A00 = parcel.readInt();
                return obj4;
            case 22:
                C14360o3.A0B(parcel, 0);
                return new BezierControlPoints(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
            case 23:
                return new Segment(AbstractC37304Gc5.A00(parcel), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
            case 24:
                return new ContentNotesCoordinates(AbstractC37304Gc5.A00(parcel), parcel.readInt());
            case 25:
                C14360o3.A0B(parcel, 0);
                boolean A1V5 = AbstractC37304Gc5.A1V(parcel);
                if (parcel.readInt() == 0) {
                    createFromParcel4 = null;
                } else {
                    createFromParcel4 = ContentNotesImmersiveMimicryParams.CREATOR.createFromParcel(parcel);
                }
                return new ContentNotesImmersiveCreationUiState((ContentNotesImmersiveMimicryParams) createFromParcel4, parcel.readString(), A1V5);
            case 26:
                C14360o3.A0B(parcel, 0);
                return new ContentNotesImmersiveMimicryParams((ContentNotesCoordinates) ContentNotesCoordinates.CREATOR.createFromParcel(parcel), parcel.readInt(), AbstractC37304Gc5.A1V(parcel));
            case 27:
                String A0d7 = AbstractC37304Gc5.A0d(parcel);
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                Integer num8 = null;
                if (parcel.readInt() != 0) {
                    num8 = AbstractC37304Gc5.A0U(parcel);
                }
                String readString24 = parcel.readString();
                return new ContentNoteMetadata((ImageUrl) AbstractC37304Gc5.A04(parcel, ContentNoteMetadata.class), (User) AbstractC37304Gc5.A04(parcel, ContentNoteMetadata.class), num8, AbstractC37304Gc5.A0W(parcel), A0d7, readString19, readString20, readString21, readString22, readString23, readString24, AbstractC37304Gc5.A1V(parcel));
            case 28:
                int A002 = AbstractC37304Gc5.A00(parcel);
                ArrayList A175 = AbstractC25225BEi.A17(A002);
                for (int i7 = 0; i7 != A002; i7++) {
                    AbstractC37304Gc5.A0r(parcel, DirectMessageEmojiInfo.class, A175);
                }
                String readString25 = parcel.readString();
                String readString26 = parcel.readString();
                String readString27 = parcel.readString();
                String readString28 = parcel.readString();
                String readString29 = parcel.readString();
                String readString30 = parcel.readString();
                String readString31 = parcel.readString();
                Integer num9 = null;
                if (parcel.readInt() != 0) {
                    num9 = AbstractC37304Gc5.A0U(parcel);
                }
                return new DirectMessageEmojiInfo((ImageUrl) AbstractC37304Gc5.A04(parcel, DirectMessageEmojiInfo.class), (User) AbstractC37304Gc5.A04(parcel, DirectMessageEmojiInfo.class), num9, AbstractC37304Gc5.A0W(parcel), readString25, readString26, readString27, readString28, readString29, readString30, readString31, parcel.readString(), parcel.readString(), A175, AbstractC37304Gc5.A1V(parcel));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                String A0d8 = AbstractC37304Gc5.A0d(parcel);
                String readString32 = parcel.readString();
                String readString33 = parcel.readString();
                String readString34 = parcel.readString();
                String readString35 = parcel.readString();
                NoteAudience noteAudience = (NoteAudience) AbstractC37304Gc5.A04(parcel, ContentNotesImmersiveReplyContent.class);
                String readString36 = parcel.readString();
                boolean A1V6 = AbstractC37304Gc5.A1V(parcel);
                ContentNoteMetadata contentNoteMetadata = (ContentNoteMetadata) AbstractC37304Gc5.A04(parcel, ContentNotesImmersiveReplyContent.class);
                boolean A1V7 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V8 = AbstractC37304Gc5.A1V(parcel);
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(parcel.readLong());
                }
                ContentNotesCoordinates contentNotesCoordinates = (ContentNotesCoordinates) AbstractC37304Gc5.A04(parcel, ContentNotesImmersiveReplyContent.class);
                boolean A1V9 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V10 = AbstractC37304Gc5.A1V(parcel);
                NoteCustomTheme noteCustomTheme = (NoteCustomTheme) AbstractC37304Gc5.A04(parcel, ContentNotesImmersiveReplyContent.class);
                boolean A1V11 = AbstractC37304Gc5.A1V(parcel);
                int readInt16 = parcel.readInt();
                ArrayList A176 = AbstractC25225BEi.A17(readInt16);
                for (int i8 = 0; i8 != readInt16; i8++) {
                    AbstractC37304Gc5.A0r(parcel, ContentNotesImmersiveReplyContent.class, A176);
                }
                return new ContentNotesImmersiveReplyContent(noteCustomTheme, contentNotesCoordinates, contentNoteMetadata, noteAudience, valueOf4, A0d8, readString32, readString33, readString34, readString35, readString36, A176, A1V6, A1V7, A1V8, A1V9, A1V10, A1V11);
            case 30:
                String A0d9 = AbstractC37304Gc5.A0d(parcel);
                int readInt17 = parcel.readInt();
                ArrayList A177 = AbstractC25225BEi.A17(readInt17);
                int i9 = 0;
                while (i9 != readInt17) {
                    i9 = AbstractC37304Gc5.A01(parcel, NotesPogThoughtBubbleUiState.CREATOR, A177, i9);
                }
                return new ContentNotesOverflowFragmentUiState(A0d9, A177);
            case 31:
                return new NoteTextStringLiteralContent(AbstractC37304Gc5.A0d(parcel));
            case 32:
                return new NoteTextStringResourceContent(AbstractC37304Gc5.A00(parcel));
            case 33:
                String A0d10 = AbstractC37304Gc5.A0d(parcel);
                NoteTextContent noteTextContent = (NoteTextContent) AbstractC37304Gc5.A04(parcel, NotesPogThoughtBubbleUiState.class);
                ImageUrl imageUrl3 = (ImageUrl) AbstractC37304Gc5.A04(parcel, NotesPogThoughtBubbleUiState.class);
                boolean A1V12 = AbstractC37304Gc5.A1V(parcel);
                String readString37 = parcel.readString();
                String readString38 = parcel.readString();
                Long l2 = null;
                if (parcel.readInt() == 0) {
                    A0U3 = null;
                } else {
                    A0U3 = AbstractC37304Gc5.A0U(parcel);
                }
                User user = (User) AbstractC37304Gc5.A04(parcel, NotesPogThoughtBubbleUiState.class);
                boolean A1V13 = AbstractC37304Gc5.A1V(parcel);
                if (parcel.readInt() != 0) {
                    l2 = Long.valueOf(parcel.readLong());
                }
                int readInt18 = parcel.readInt();
                String readString39 = parcel.readString();
                String readString40 = parcel.readString();
                if (readString40.equals("MEDIA_OVERLAY")) {
                    num2 = C05F.A00;
                } else if (readString40.equals("OVERFLOW_SHEET")) {
                    num2 = C05F.A01;
                } else if (readString40.equals("IMMERSIVE_REPLY_SHEET")) {
                    num2 = C05F.A0C;
                } else if (readString40.equals("IMMERSIVE_SELF_NOTE")) {
                    num2 = C05F.A0N;
                } else {
                    throw AbstractC166987dD.A12(readString40);
                }
                String readString41 = parcel.readString();
                String readString42 = parcel.readString();
                int readInt19 = parcel.readInt();
                ArrayList A178 = AbstractC25225BEi.A17(readInt19);
                for (int i10 = 0; i10 != readInt19; i10++) {
                    AbstractC37304Gc5.A0r(parcel, NotesPogThoughtBubbleUiState.class, A178);
                }
                int readInt20 = parcel.readInt();
                ArrayList A179 = AbstractC25225BEi.A17(readInt20);
                for (int i11 = 0; i11 != readInt20; i11++) {
                    AbstractC37304Gc5.A0r(parcel, NotesPogThoughtBubbleUiState.class, A179);
                }
                boolean A1V14 = AbstractC37304Gc5.A1V(parcel);
                boolean A1V15 = AbstractC37304Gc5.A1V(parcel);
                String readString43 = parcel.readString();
                if (readString43.equals("NOT_MIMICRY")) {
                    num3 = C05F.A00;
                } else if (readString43.equals("OVERFLOW_SHEET_MIMICRY")) {
                    num3 = C05F.A01;
                } else if (readString43.equals("COMMENT_SHEET_MIMICRY")) {
                    num3 = C05F.A0C;
                } else if (readString43.equals("NUX_ON_REC_MIMICRY")) {
                    num3 = C05F.A0N;
                } else if (readString43.equals("IMMERSIVE_REPLY_MIMICRY")) {
                    num3 = C05F.A0Y;
                } else if (readString43.equals("VIEWER_MIMICRY")) {
                    num3 = C05F.A0j;
                } else {
                    throw AbstractC166987dD.A12(readString43);
                }
                boolean A1V16 = AbstractC37304Gc5.A1V(parcel);
                String readString44 = parcel.readString();
                ImageUrl imageUrl4 = (ImageUrl) AbstractC37304Gc5.A04(parcel, NotesPogThoughtBubbleUiState.class);
                int readInt21 = parcel.readInt();
                boolean A1V17 = AbstractC37304Gc5.A1V(parcel);
                String readString45 = parcel.readString();
                if (readString45.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
                    num4 = C05F.A00;
                } else if (readString45.equals("DOUBLE_TAP_TO_LIKE")) {
                    num4 = C05F.A01;
                } else if (readString45.equals("TAP_TO_REPLY")) {
                    num4 = C05F.A0C;
                } else {
                    throw AbstractC166987dD.A12(readString45);
                }
                return new NotesPogThoughtBubbleUiState((NoteCustomTheme) AbstractC37304Gc5.A04(parcel, NotesPogThoughtBubbleUiState.class), imageUrl3, imageUrl4, noteTextContent, user, A0U3, num2, num3, num4, l2, A0d10, readString37, readString38, readString39, readString41, readString42, readString44, parcel.readString(), A178, A179, readInt18, readInt21, A1V12, A1V13, A1V14, A1V15, A1V16, A1V17, AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 34:
                C14360o3.A0B(parcel, 0);
                return new ContentNotesImmersiveSelfNoteContent((ContentNoteMetadata) AbstractC37304Gc5.A04(parcel, ContentNotesImmersiveSelfNoteContent.class), (NotesPogThoughtBubbleUiState) AbstractC37304Gc5.A04(parcel, ContentNotesImmersiveSelfNoteContent.class), AbstractC167007dF.A1M(parcel.readInt()), AbstractC37304Gc5.A1W(parcel));
            case 35:
                return new CreationSession(parcel);
            case 36:
                C14360o3.A0B(parcel, 0);
                return new PhotoSession(parcel);
            case 37:
                C14360o3.A0B(parcel, 0);
                return new VideoSession(parcel);
            case 38:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.A00 = parcel.readInt();
                return baseSavedState2;
            case 39:
                return new com.instagram.creation.base.ui.mediatabbar.Tab(AbstractC37304Gc5.A00(parcel), parcel.readInt());
            case 40:
                C14360o3.A0B(parcel, 0);
                return new ShoppingMultiProductConfig(parcel);
            case Seq.NULL_REFNUM /* 41 */:
                C14360o3.A0B(parcel, 0);
                return new SharePlatformStickerClientModel((MediaUploadMetadata) AbstractC37304Gc5.A04(parcel, SharePlatformStickerClientModel.class), EnumC222859sQ.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), AbstractC37304Gc5.A1V(parcel));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C14360o3.A0B(parcel, 0);
                float[] createFloatArray = parcel.createFloatArray();
                String readString46 = parcel.readString();
                CropInfo cropInfo = (CropInfo) AbstractC37304Gc5.A04(parcel, CropInfo.class);
                ExifImageData exifImageData = (ExifImageData) AbstractC37304Gc5.A04(parcel, ExifImageData.class);
                ?? obj5 = new Object();
                obj5.A03 = createFloatArray;
                obj5.A02 = readString46;
                obj5.A00 = cropInfo;
                obj5.A01 = exifImageData;
                return obj5;
            case 43:
                C14360o3.A0B(parcel, 0);
                ?? baseSavedState3 = new View.BaseSavedState(parcel);
                baseSavedState3.A06 = new float[9];
                baseSavedState3.A03 = AbstractC166987dD.A1G();
                baseSavedState3.A00 = parcel.readInt();
                baseSavedState3.A01 = parcel.readString();
                baseSavedState3.A02 = parcel.readString();
                boolean z = true;
                baseSavedState3.A04 = AbstractC167007dF.A1P(parcel.readInt(), 1);
                parcel.readFloatArray(baseSavedState3.A06);
                baseSavedState3.A07 = parcel.createStringArray();
                if (parcel.readInt() != 1) {
                    z = false;
                }
                baseSavedState3.A05 = z;
                int readInt22 = parcel.readInt();
                for (int i12 = 0; i12 < readInt22; i12++) {
                    baseSavedState3.A03.put(parcel.readString(), AbstractC37304Gc5.A04(parcel, GalleryPreviewInfo.class));
                }
                return baseSavedState3;
            case 44:
                return new OpenCarouselCaptureConfig(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readFloat(), AbstractC37304Gc5.A1V(parcel));
            case 45:
                C14360o3.A0B(parcel, 0);
                float readFloat7 = parcel.readFloat();
                float readFloat8 = parcel.readFloat();
                float readFloat9 = parcel.readFloat();
                float readFloat10 = parcel.readFloat();
                ?? obj6 = new Object();
                obj6.A01 = readFloat7;
                obj6.A02 = readFloat8;
                obj6.A03 = readFloat9;
                obj6.A00 = readFloat10;
                return obj6;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C14360o3.A0B(parcel, 0);
                return new ShareMediaLoggingInfo(parcel);
            case 47:
                JQ0.A0y(parcel);
                return new Object();
            case 48:
                C14360o3.A0B(parcel, 0);
                return new ReelsVisualRepliesModel((MediaVCRTappableData) AbstractC37304Gc5.A04(parcel, ReelsVisualRepliesModel.class), AbstractC37304Gc5.A1V(parcel));
            case 49:
                return new VisibilityControllerComponentInterface$State((Medium) AbstractC37304Gc5.A04(parcel, VisibilityControllerComponentInterface$State.class), AbstractC37304Gc5.A00(parcel), parcel.readInt(), parcel.readInt(), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                ?? obj7 = new Object();
                obj7.A02 = ImmutableList.of();
                C22P c22p2 = C22P.A5N;
                obj7.A01 = c22p2;
                ArrayList A1E = AbstractC166987dD.A1E();
                parcel.readTypedList(A1E, EffectInfoAttributionConfiguration.CREATOR);
                obj7.A02 = ImmutableList.copyOf((Collection) A1E);
                obj7.A00 = parcel.readInt();
                boolean z2 = true;
                obj7.A06 = AbstractC167007dF.A1M(parcel.readByte());
                C22P c22p3 = (C22P) parcel.readSerializable();
                if (c22p3 == null) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("unknown camera entry point");
                    AbstractC12120kG.A01("EffectInfoBottomSheetConfiguration", AbstractC166997dE.A0v(parcel.readSerializable(), A1C));
                    obj7.A01 = c22p2;
                } else {
                    obj7.A01 = c22p3;
                }
                obj7.A03 = parcel.readString();
                obj7.A05 = AbstractC37304Gc5.A1X(parcel);
                if (parcel.readByte() == 0) {
                    z2 = false;
                }
                obj7.A04 = z2;
                return obj7;
            case 51:
                ?? obj8 = new Object();
                Parcelable A04 = AbstractC37304Gc5.A04(parcel, AREffect.class);
                A04.getClass();
                obj8.A04 = (AREffect) A04;
                String readString47 = parcel.readString();
                readString47.getClass();
                obj8.A06 = readString47;
                obj8.A00 = (EffectAttribution) AbstractC37304Gc5.A04(parcel, EffectAttribution.class);
                obj8.A07 = parcel.readString();
                obj8.A09 = parcel.readString();
                obj8.A02 = EnumC138476Pd.A01.A00(parcel.readString());
                obj8.A05 = (ProductAREffectContainer) AbstractC37304Gc5.A04(parcel, ProductAREffectContainer.class);
                obj8.A08 = parcel.readString();
                obj8.A01 = (EffectInfoBottomSheetMode) AbstractC37304Gc5.A04(parcel, EffectInfoBottomSheetMode.class);
                obj8.A03 = (EnumC223179sw) parcel.readSerializable();
                boolean z3 = false;
                obj8.A0B = AbstractC167007dF.A1P(parcel.readByte(), 1);
                if (parcel.readByte() == 1) {
                    z3 = true;
                }
                obj8.A0A = z3;
                return obj8;
            case 52:
                String readString48 = parcel.readString();
                readString48.getClass();
                return EffectInfoBottomSheetMode.valueOf(readString48);
            case 53:
                String A0d11 = AbstractC37304Gc5.A0d(parcel);
                int readInt23 = parcel.readInt();
                ArrayList A1710 = AbstractC25225BEi.A17(readInt23);
                for (int i13 = 0; i13 != readInt23; i13++) {
                    AbstractC37304Gc5.A0r(parcel, GalleryGridEditMediaSelectionFragment$Config.class, A1710);
                }
                int readInt24 = parcel.readInt();
                ArrayList A1711 = AbstractC25225BEi.A17(readInt24);
                for (int i14 = 0; i14 != readInt24; i14++) {
                    AbstractC37304Gc5.A0r(parcel, GalleryGridEditMediaSelectionFragment$Config.class, A1711);
                }
                return new GalleryGridEditMediaSelectionFragment$Config(A1710, A1711, A0d11);
            case 54:
                String A0d12 = AbstractC37304Gc5.A0d(parcel);
                String readString49 = parcel.readString();
                int readInt25 = parcel.readInt();
                AbstractC167017dG.A1P(A0d12, readString49);
                ?? obj9 = new Object();
                obj9.A02 = A0d12;
                obj9.A01 = readString49;
                obj9.A00 = readInt25;
                return obj9;
            case 55:
                return new FundraiserSharedToLive(parcel);
            case 56:
                C14360o3.A0B(parcel, 0);
                return new IngestSessionShim(parcel.createStringArrayList());
            case 57:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                return new PreCaptureButtonManagerIntf$State(valueOf3);
            case 58:
                C14360o3.A0B(parcel, 0);
                return new GroupProfileStoryRecipient((PendingRecipient) AbstractC37304Gc5.A04(parcel, GroupProfileStoryRecipient.class), parcel.readInt(), AbstractC37304Gc5.A1V(parcel));
            case 59:
                return EducationNuxType.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 60:
                C14360o3.A0B(parcel, 0);
                return new ClipsRemixControllerSavedState(AbstractC37304Gc5.A1V(parcel), parcel.readString());
            case 61:
                return new ClipsCelebrationReshareViewModel(AbstractC37304Gc5.A0d(parcel), AbstractC37304Gc5.A1V(parcel));
            case 62:
                return new ClipsPreloadedSettingItem(EnumC185548Kw.valueOf(parcel.readString()), (ImageUrl) AbstractC37304Gc5.A04(parcel, ClipsPreloadedSettingItem.class), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new VoiceOption(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString());
            case 64:
                C14360o3.A0B(parcel, 0);
                return new SuperlativeMentionSticker((Rect) AbstractC37304Gc5.A04(parcel, SuperlativeMentionSticker.class), (User) AbstractC37304Gc5.A04(parcel, SuperlativeMentionSticker.class), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
            case 65:
                C14360o3.A0B(parcel, 0);
                return new SuperlativeNotifyToUsers((User) AbstractC37304Gc5.A04(parcel, SuperlativeNotifyToUsers.class));
            case 66:
                String A0d13 = AbstractC37304Gc5.A0d(parcel);
                String readString50 = parcel.readString();
                int readInt26 = parcel.readInt();
                ArrayList A1712 = AbstractC25225BEi.A17(readInt26);
                int i15 = 0;
                int i16 = 0;
                while (i16 != readInt26) {
                    i16 = AbstractC37304Gc5.A01(parcel, SuperlativeMentionSticker.CREATOR, A1712, i16);
                }
                EnumC46183KcL valueOf7 = EnumC46183KcL.valueOf(parcel.readString());
                int readInt27 = parcel.readInt();
                ArrayList A1713 = AbstractC25225BEi.A17(readInt27);
                while (i15 != readInt27) {
                    i15 = AbstractC37304Gc5.A01(parcel, SuperlativeNotifyToUsers.CREATOR, A1713, i15);
                }
                return new SuperlativeStickerClientModel(valueOf7, A0d13, readString50, A1712, A1713);
            case 67:
                return new AddChannelsRowChannelInfo(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readInt());
            case 68:
                String A0d14 = AbstractC37304Gc5.A0d(parcel);
                if (A0d14.equals("IMAGINE_ME")) {
                    num = C05F.A00;
                } else if (A0d14.equals("IMAGINE")) {
                    num = C05F.A01;
                } else if (A0d14.equals(AbstractC111324zv.A00(1480))) {
                    num = C05F.A0C;
                } else if (A0d14.equals("MEMU_IN_FEED")) {
                    num = C05F.A0N;
                } else {
                    throw AbstractC166987dD.A12(A0d14);
                }
                return new CreationGenAIAttributionBottomSheetParams(parcel.readString(), num, parcel.readString());
            case 69:
                return new ContextualBackgroundSourceImage((ImageUrl) AbstractC37304Gc5.A04(parcel, ContextualBackgroundSourceImage.class), AbstractC37304Gc5.A0d(parcel), parcel.readString());
            case 70:
                C14360o3.A0B(parcel, 0);
                return new ExpanderConfig((Rect) AbstractC37304Gc5.A04(parcel, ExpanderConfig.class));
            case 71:
                Object obj10 = null;
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    createFromParcel2 = null;
                } else {
                    createFromParcel2 = MagicModPostCaptureTransform.CREATOR.createFromParcel(parcel);
                }
                MagicModPostCaptureTransform magicModPostCaptureTransform = (MagicModPostCaptureTransform) createFromParcel2;
                CreationLayoutConfig creationLayoutConfig = (CreationLayoutConfig) AbstractC37304Gc5.A04(parcel, MagicModLaunchParams.class);
                if (parcel.readInt() == 0) {
                    createFromParcel3 = null;
                } else {
                    createFromParcel3 = MagicModTopicInfo.CREATOR.createFromParcel(parcel);
                }
                MagicModTopicInfo magicModTopicInfo = (MagicModTopicInfo) createFromParcel3;
                if (parcel.readInt() != 0) {
                    obj10 = ExpanderConfig.CREATOR.createFromParcel(parcel);
                }
                return new MagicModLaunchParams(creationLayoutConfig, (ExpanderConfig) obj10, magicModPostCaptureTransform, magicModTopicInfo);
            case 72:
                C14360o3.A0B(parcel, 0);
                return new MagicModPostCaptureTransform(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
            case 73:
                return new MagicModTopicInfo(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 74:
                return new PhotoFilter(parcel);
            case 75:
                JQ0.A0y(parcel);
                return new Object();
            case 76:
                C14360o3.A0B(parcel, 0);
                ExifImageData exifImageData2 = new ExifImageData();
                double readDouble = parcel.readDouble();
                Double d = null;
                if (readDouble > 180.0d) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Double.valueOf(readDouble);
                }
                exifImageData2.A01 = valueOf6;
                double readDouble2 = parcel.readDouble();
                if (readDouble2 <= 180.0d) {
                    d = Double.valueOf(readDouble2);
                }
                exifImageData2.A02 = d;
                exifImageData2.A00 = parcel.readInt();
                int readInt28 = parcel.readInt();
                for (int i17 = 0; i17 < readInt28; i17++) {
                    exifImageData2.A03.put(parcel.readString(), parcel.readString());
                }
                return exifImageData2;
            case 77:
                String A0d15 = AbstractC37304Gc5.A0d(parcel);
                String readString51 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(AbstractC37304Gc5.A1V(parcel));
                }
                boolean A1V18 = AbstractC37304Gc5.A1V(parcel);
                int readInt29 = parcel.readInt();
                ArrayList A1714 = AbstractC25225BEi.A17(readInt29);
                for (int i18 = 0; i18 != readInt29; i18++) {
                    AbstractC37304Gc5.A0r(parcel, ClipsAdvancedSettingsConfig.class, A1714);
                }
                return new ClipsAdvancedSettingsConfig((BrandedContentGatingInfo) AbstractC37304Gc5.A04(parcel, ClipsAdvancedSettingsConfig.class), (BrandedContentProjectMetadata) AbstractC37304Gc5.A04(parcel, ClipsAdvancedSettingsConfig.class), valueOf2, A0d15, readString51, A1714, A1V18, AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel), AbstractC37304Gc5.A1V(parcel));
            case 78:
                C14360o3.A0B(parcel, 0);
                return PublishScreenCategoryType.values()[parcel.readInt()];
            case 79:
                String readString52 = parcel.readString();
                readString52.getClass();
                return CreationState.valueOf(readString52);
            case 80:
                C14360o3.A0B(parcel, 0);
                long readLong3 = parcel.readLong();
                String readString53 = parcel.readString();
                String readString54 = parcel.readString();
                String readString55 = parcel.readString();
                String readString56 = parcel.readString();
                Integer num10 = null;
                if (parcel.readInt() == 0) {
                    A0U2 = null;
                } else {
                    A0U2 = AbstractC37304Gc5.A0U(parcel);
                }
                Integer A0Y2 = AbstractC37304Gc5.A0Y(parcel);
                if (parcel.readInt() != 0) {
                    num10 = AbstractC37304Gc5.A0U(parcel);
                }
                return new Badge.AchievementBadge((Achievement) AbstractC37304Gc5.A04(parcel, Badge.AchievementBadge.class), A0U2, A0Y2, num10, readString53, readString54, readString55, readString56, readLong3, AbstractC37304Gc5.A1V(parcel));
            case 81:
                C14360o3.A0B(parcel, 0);
                long readLong4 = parcel.readLong();
                String readString57 = parcel.readString();
                String readString58 = parcel.readString();
                String readString59 = parcel.readString();
                ArrayList arrayList = null;
                if (parcel.readInt() == 0) {
                    A0U = null;
                } else {
                    A0U = AbstractC37304Gc5.A0U(parcel);
                }
                int readInt30 = parcel.readInt();
                ArrayList A1715 = AbstractC25225BEi.A17(readInt30);
                int i19 = 0;
                int i20 = 0;
                while (i20 != readInt30) {
                    i20 = AbstractC37304Gc5.A01(parcel, Badge.AchievementBadge.CREATOR, A1715, i20);
                }
                if (parcel.readInt() != 0) {
                    int readInt31 = parcel.readInt();
                    arrayList = AbstractC25225BEi.A17(readInt31);
                    while (i19 != readInt31) {
                        i19 = AbstractC37304Gc5.A01(parcel, Badge.AchievementBadge.CREATOR, arrayList, i19);
                    }
                }
                return new Badge.AchievementTieredBadge(A0U, readString57, readString58, readString59, A1715, arrayList, readLong4);
            case 82:
                C14360o3.A0B(parcel, 0);
                long readLong5 = parcel.readLong();
                String readString60 = parcel.readString();
                String readString61 = parcel.readString();
                String readString62 = parcel.readString();
                String readString63 = parcel.readString();
                String readString64 = parcel.readString();
                String readString65 = parcel.readString();
                String readString66 = parcel.readString();
                Integer num11 = null;
                if (parcel.readInt() != 0) {
                    num11 = AbstractC37304Gc5.A0U(parcel);
                }
                Integer A0Y3 = AbstractC37304Gc5.A0Y(parcel);
                Integer A0W = AbstractC37304Gc5.A0W(parcel);
                boolean z4 = false;
                boolean A1M = AbstractC167007dF.A1M(parcel.readInt());
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                return new Badge.ChallengeBadge((Challenge) AbstractC37304Gc5.A04(parcel, Badge.ChallengeBadge.class), num11, A0Y3, A0W, readString60, readString61, readString62, readString63, readString64, readString65, readString66, parcel.readString(), parcel.readString(), readLong5, A1M, z4);
            case 83:
                C14360o3.A0B(parcel, 0);
                long readLong6 = parcel.readLong();
                String readString67 = parcel.readString();
                String readString68 = parcel.readString();
                String readString69 = parcel.readString();
                Integer A0V = AbstractC37304Gc5.A0V(parcel);
                int readInt32 = parcel.readInt();
                ArrayList A1716 = AbstractC25225BEi.A17(readInt32);
                int i21 = 0;
                while (i21 != readInt32) {
                    i21 = AbstractC37304Gc5.A01(parcel, Badge.ChallengeBadge.CREATOR, A1716, i21);
                }
                return new Badge.ChallengeTieredBadge(A0V, readString67, readString68, readString69, A1716, readLong6);
            case 84:
                String A0d16 = AbstractC37304Gc5.A0d(parcel);
                String readString70 = parcel.readString();
                String readString71 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = EnumC46279KeB.valueOf(parcel.readString());
                }
                return new SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext(valueOf, A0d16, readString70, readString71);
            case 85:
                C14360o3.A0B(parcel, 0);
                return new CategorySelectionScreenArgs((FanClubCategoryType) AbstractC37304Gc5.A04(parcel, CategorySelectionScreenArgs.class), parcel.readString());
            case 86:
                if (AbstractC37304Gc5.A00(parcel) == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = CategorySelectionScreenArgs.CREATOR.createFromParcel(parcel);
                }
                return new ChannelCreationFlowExtraArgs((CategorySelectionScreenArgs) createFromParcel, parcel.readString(), parcel.readString());
            case 87:
                C14360o3.A0B(parcel, 0);
                return CreatorToolsComponent.values()[parcel.readInt()];
            case 88:
                C14360o3.A0B(parcel, 0);
                return EligibilityCriteria.values()[parcel.readInt()];
            case 89:
                C14360o3.A0B(parcel, 0);
                return ValuePropsFlow.values()[parcel.readInt()];
            case 90:
                return new DirectThreadWidgetItem(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1V(parcel));
            case 91:
                JQ0.A0y(parcel);
                return DirectAvatarTrayFragmentConfig.NestedTray.A00;
            case 92:
                JQ0.A0y(parcel);
                return DirectAvatarTrayFragmentConfig.StandaloneNonDraggableTray.A00;
            case 93:
                JQ0.A0y(parcel);
                return DirectAvatarTrayFragmentConfig.StandaloneTray.A00;
            case 94:
                JQ0.A0y(parcel);
                return DirectAvatarTrayFragmentConfig.Tab.A00;
            case 95:
                return ChannelCreationSource.valueOf(AbstractC37304Gc5.A0d(parcel));
            case 96:
                return new EmojiPongUser(AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            case 97:
                String A0d17 = AbstractC37304Gc5.A0d(parcel);
                String readString72 = parcel.readString();
                String readString73 = parcel.readString();
                String readString74 = parcel.readString();
                String readString75 = parcel.readString();
                int readInt33 = parcel.readInt();
                ArrayList A1717 = AbstractC25225BEi.A17(readInt33);
                for (int i22 = 0; i22 != readInt33; i22++) {
                    AbstractC37304Gc5.A0r(parcel, ChannelChallengeAllWinnersShareInfo.class, A1717);
                }
                int readInt34 = parcel.readInt();
                ArrayList A1718 = AbstractC25225BEi.A17(readInt34);
                for (int i23 = 0; i23 != readInt34; i23++) {
                    AbstractC37304Gc5.A0r(parcel, ChannelChallengeAllWinnersShareInfo.class, A1718);
                }
                return new ChannelChallengeAllWinnersShareInfo(AbstractC37304Gc5.A0V(parcel), A0d17, readString72, readString73, readString74, readString75, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), A1717, A1718, parcel.readInt());
            case 98:
                return new ChannelChallengeOneWinnerShareInfo((ChannelChallengeStickerWinnerModel) AbstractC37304Gc5.A04(parcel, ChannelChallengeOneWinnerShareInfo.class), AbstractC37304Gc5.A0V(parcel), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                return new ChannelChallengePromptShareInfo(AbstractC37304Gc5.A0V(parcel), AbstractC37304Gc5.A0d(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ClipsCreationToolsResponse$ContentFundingDeal[i];
            case 1:
                return new ClipsSpotlightData[i];
            case 2:
                return new ClipsSpotlightModel[i];
            case 3:
                return new ClipsTogetherData[i];
            case 4:
                return new AudioPageMetadata[i];
            case 5:
                return new AudioPartType[i];
            case 6:
                return new ClipsFanClubMetadata[i];
            case 7:
                return new InteractionUpsellCTAType[i];
            case 8:
                return new ClipsTemplateModel[i];
            case 9:
                return new AudienceListViewModel[i];
            case 10:
                return new ChannelCommentsData[i];
            case 11:
                return new ChannelRepliesNotifData[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new ClipSegment.PhotoSegment[i];
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new ClipSegment.VideoSegment[i];
            case 14:
                return new LayoutTransform[i];
            case Process.SIGTERM /* 15 */:
                return new VideoCropParams[i];
            case 16:
                return new FaceCenter[i];
            case 17:
                return new GalleryItem[i];
            case 18:
                return new TextWithEntities[i];
            case Process.SIGSTOP /* 19 */:
                return new GifUrlLoggingExtras[i];
            case 20:
                return new RefreshableRecyclerViewLayout.SavedState[i];
            case 21:
                return new FlowingGridLayoutManager.SavedState[i];
            case 22:
                return new BezierControlPoints[i];
            case 23:
                return new Segment[i];
            case 24:
                return new ContentNotesCoordinates[i];
            case 25:
                return new ContentNotesImmersiveCreationUiState[i];
            case 26:
                return new ContentNotesImmersiveMimicryParams[i];
            case 27:
                return new ContentNoteMetadata[i];
            case 28:
                return new DirectMessageEmojiInfo[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new ContentNotesImmersiveReplyContent[i];
            case 30:
                return new ContentNotesOverflowFragmentUiState[i];
            case 31:
                return new NoteTextStringLiteralContent[i];
            case 32:
                return new NoteTextStringResourceContent[i];
            case 33:
                return new NotesPogThoughtBubbleUiState[i];
            case 34:
                return new ContentNotesImmersiveSelfNoteContent[i];
            case 35:
                return new CreationSession[i];
            case 36:
                return new PhotoSession[i];
            case 37:
                return new VideoSession[0];
            case 38:
                return new FeedColorFilterPicker.SavedState[i];
            case 39:
                return new com.instagram.creation.base.ui.mediatabbar.Tab[i];
            case 40:
                return new ShoppingMultiProductConfig[i];
            case Seq.NULL_REFNUM /* 41 */:
                return new SharePlatformStickerClientModel[i];
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new GalleryPreviewInfo[i];
            case 43:
                return new GalleryPickerView$SavedState[i];
            case 44:
                return new OpenCarouselCaptureConfig[i];
            case 45:
                return new MediaTransformation[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new ShareMediaLoggingInfo[i];
            case 47:
                return new NoOpCreationLayoutConfig[i];
            case 48:
                return new ReelsVisualRepliesModel[i];
            case 49:
                return new VisibilityControllerComponentInterface$State[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return new EffectInfoBottomSheetConfiguration[i];
            case 51:
                return new EffectInfoAttributionConfiguration[i];
            case 52:
                return new EffectInfoBottomSheetMode[i];
            case 53:
                return new GalleryGridEditMediaSelectionFragment$Config[i];
            case 54:
                return new GallerySuggestionsInfo[i];
            case 55:
                return new FundraiserSharedToLive[i];
            case 56:
                return new IngestSessionShim[i];
            case 57:
                return new PreCaptureButtonManagerIntf$State[i];
            case 58:
                return new GroupProfileStoryRecipient[i];
            case 59:
                return new EducationNuxType[i];
            case 60:
                return new ClipsRemixControllerSavedState[i];
            case 61:
                return new ClipsCelebrationReshareViewModel[i];
            case 62:
                return new ClipsPreloadedSettingItem[i];
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                return new VoiceOption[i];
            case 64:
                return new SuperlativeMentionSticker[i];
            case 65:
                return new SuperlativeNotifyToUsers[i];
            case 66:
                return new SuperlativeStickerClientModel[i];
            case 67:
                return new AddChannelsRowChannelInfo[i];
            case 68:
                return new CreationGenAIAttributionBottomSheetParams[i];
            case 69:
                return new ContextualBackgroundSourceImage[i];
            case 70:
                return new ExpanderConfig[i];
            case 71:
                return new MagicModLaunchParams[i];
            case 72:
                return new MagicModPostCaptureTransform[i];
            case 73:
                return new MagicModTopicInfo[i];
            case 74:
                return new UnifiedVideoCoverFrameFilter[i];
            case 75:
                return new UnifiedFilterParamCallbackImpl[i];
            case 76:
                return new ExifImageData[i];
            case 77:
                return new ClipsAdvancedSettingsConfig[i];
            case 78:
                return new PublishScreenCategoryType[i];
            case 79:
                return new CreationState[i];
            case 80:
                return new Badge.AchievementBadge[i];
            case 81:
                return new Badge.AchievementTieredBadge[i];
            case 82:
                return new Badge.ChallengeBadge[i];
            case 83:
                return new Badge.ChallengeTieredBadge[i];
            case 84:
                return new SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext[i];
            case 85:
                return new CategorySelectionScreenArgs[i];
            case 86:
                return new ChannelCreationFlowExtraArgs[i];
            case 87:
                return new CreatorToolsComponent[i];
            case 88:
                return new EligibilityCriteria[i];
            case 89:
                return new ValuePropsFlow[i];
            case 90:
                return new DirectThreadWidgetItem[i];
            case 91:
                return new DirectAvatarTrayFragmentConfig.NestedTray[i];
            case 92:
                return new DirectAvatarTrayFragmentConfig.StandaloneNonDraggableTray[i];
            case 93:
                return new DirectAvatarTrayFragmentConfig.StandaloneTray[i];
            case 94:
                return new DirectAvatarTrayFragmentConfig.Tab[i];
            case 95:
                return new ChannelCreationSource[i];
            case 96:
                return new EmojiPongUser[i];
            case 97:
                return new ChannelChallengeAllWinnersShareInfo[i];
            case 98:
                return new ChannelChallengeOneWinnerShareInfo[i];
            default:
                return new ChannelChallengePromptShareInfo[i];
        }
    }
}
