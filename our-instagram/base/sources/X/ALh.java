package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ALh {
    public static final Bundle A01(C22P c22p, C24H c24h, C110204xp c110204xp, C5JK c5jk, EnumC189548aZ enumC189548aZ, MusicAttributionConfig musicAttributionConfig, PendingRecipient pendingRecipient, String str, String str2, String str3, String str4, String str5, String str6, List list, java.util.Set set, boolean z, boolean z2, boolean z3) {
        return A00(c22p, c24h, null, null, null, EnumC185548Kw.A05, c110204xp, null, null, null, null, c5jk, enumC189548aZ, null, musicAttributionConfig, null, null, pendingRecipient, null, null, null, null, str, str2, null, null, null, null, null, null, str3, null, null, str4, str5, str6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, set, z, false, false, false, false, false, false, false, false, false, false, z2, false, false, false, false, z3);
    }

    public static final Bundle A02(C22P c22p, C8JW c8jw, C85B c85b, EnumC185548Kw enumC185548Kw, ImageUrl imageUrl, C5JK c5jk, EnumC189548aZ enumC189548aZ, DirectCameraViewModel directCameraViewModel, MusicAttributionConfig musicAttributionConfig, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, java.util.Set set, boolean z, boolean z2) {
        return A00(c22p, null, c8jw, null, c85b, enumC185548Kw, null, imageUrl, null, null, null, c5jk, enumC189548aZ, directCameraViewModel, musicAttributionConfig, null, null, null, null, null, bool, null, null, null, str, str2, str3, null, str4, str5, str6, null, null, str7, str8, str9, null, null, null, null, null, null, str10, str11, null, null, null, null, null, null, null, null, null, null, null, null, null, set, false, z, false, false, false, false, false, z2, false, false, false, true, false, false, false, false, true);
    }

    public static final Bundle A03(C22P c22p, C8JW c8jw, C110204xp c110204xp, C5JK c5jk, EnumC189548aZ enumC189548aZ, MusicAttributionConfig musicAttributionConfig, PendingRecipient pendingRecipient, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, java.util.Set set, boolean z, boolean z2) {
        return A00(c22p, null, c8jw, null, null, EnumC185548Kw.A05, c110204xp, null, null, null, null, c5jk, enumC189548aZ, null, musicAttributionConfig, null, null, pendingRecipient, null, null, null, null, str, str2, null, null, null, null, null, null, str3, null, null, str4, str5, str6, null, null, null, null, str7, null, null, null, str8, null, null, null, null, null, null, null, null, null, null, null, null, set, z, false, false, false, false, false, false, false, false, false, false, z2, false, false, false, false, true);
    }

    public static final Bundle A00(C22P c22p, C24H c24h, C8JW c8jw, ClipsCameraCommandAction clipsCameraCommandAction, C85B c85b, EnumC185548Kw enumC185548Kw, C110204xp c110204xp, ImageUrl imageUrl, C55U c55u, SharePlatformStickerClientModel sharePlatformStickerClientModel, ReelsVisualRepliesModel reelsVisualRepliesModel, C5JK c5jk, EnumC189548aZ enumC189548aZ, DirectCameraViewModel directCameraViewModel, MusicAttributionConfig musicAttributionConfig, AudioOverlayTrack audioOverlayTrack, InstagramAudioApplySource instagramAudioApplySource, PendingRecipient pendingRecipient, PromptStickerModel promptStickerModel, QuestionResponseReshareModel questionResponseReshareModel, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, List list, List list2, List list3, List list4, List list5, java.util.Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        ArrayList<String> A1F;
        ArrayList<? extends Parcelable> A1F2;
        ArrayList<? extends Parcelable> A1F3;
        C14360o3.A0B(enumC185548Kw, 52);
        AbstractC189688an.A00(c22p);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(MSV.A00(155), str);
        A0b.putString("ClipsConstants.ARG_CLIPS_DRAFT_COVER_PHOTO_FILE_URI", str2);
        A0b.putString(AbstractC111324zv.A00(80), null);
        A0b.putString(AbstractC111324zv.A00(1547), null);
        A0b.putStringArrayList(MSV.A00(151), null);
        A0b.putParcelable("ClipsConstants.ARG_CLIPS_AUTO_CREATED_CLIPS_SELECTED_AUDIO_TRACK", null);
        A0b.putString(AbstractC111324zv.A00(603), null);
        A0b.putString("ClipsConstants.ARG_PIVOT_PAGE_SESSION_ID", str23);
        A0b.putSerializable("ClipsConstants.ARG_PIVOT_PAGE_ENTRY_POINT", c8jw);
        A0b.putParcelable("ARGS_TARGET_GROUP_PROFILE", pendingRecipient);
        A0b.putParcelable("ARGS_MUSIC_ATTRIBUTION_CONFIG", musicAttributionConfig);
        A0b.putString("ARGS_SONG_ISRC", str10);
        A0b.putString("ARGS_AUDIO_PLATFORM_APP_ID", str11);
        A0b.putParcelable("ARGS_AUDIO_APPLY_SOURCE", instagramAudioApplySource);
        A0b.putString("ARGS_EFFECT_ID", str3);
        A0b.putString("ARGS_EFFECT_ATTRIBUTION_USER_ID", str4);
        if (bool != null) {
            A0b.putBoolean("ARGS_EFFECT_SUPPORTED", bool.booleanValue());
        }
        A0b.putString("ARGS_EFFECT_NAME", str5);
        A0b.putString("ARGS_EFFECT_AUTHOR_NAME", str6);
        A0b.putParcelable("ARGS_EFFECT_THUMBNAIL_URL", imageUrl);
        A0b.putString("ARGS_PRELOAD_EFFECT_COLLECTION_NAME", null);
        A0b.putString("ARGS_CAMERA_TOOL_NAME", str7);
        A0b.putString("ARGS_CAMERA_TOOL_ID", str8);
        A0b.putString("ARGS_AUDIO_ID", str9);
        A0b.putString("ARGS_AUDIO_OR_EFFECT_MEDIA_ID", str12);
        A0b.putString("ARGS_AUDIO_OR_EFFECT_MEDIA_RANKING_TOKEN", str13);
        A0b.putString("ARGS_SOURCE_MEDIA_USER_NAME", str17);
        A0b.putString("ARGS_SOURCE_MEDIA_ID", str18);
        A0b.putSerializable("ARGS_SUGGESTED_CAMERA_SETTINGS", enumC185548Kw);
        A0b.putSerializable("ARGS_CAMERA_ENTRY_POINT", c22p);
        A0b.putBoolean(AbstractC111324zv.A00(283), z);
        A0b.putString("ARGS_VISUAL_SOURCE_ORIGINAL_MEDIA_ID", str14);
        A0b.putSerializable("ARGS_VISUAL_SOURCE_CREATION_STATE", enumC189548aZ);
        A0b.putParcelable("ARGS_REELS_VISUAL_REPLIES", reelsVisualRepliesModel);
        if (list != null) {
            boolean z18 = list instanceof ArrayList;
            String A00 = MSV.A00(39);
            if (z18) {
                A1F3 = (ArrayList) list;
            } else {
                A1F3 = AbstractC166987dD.A1F(list);
            }
            A0b.putParcelableArrayList(A00, A1F3);
        }
        if (list2 != null) {
            boolean z19 = list2 instanceof ArrayList;
            String A002 = AbstractC111324zv.A00(602);
            if (z19) {
                A1F2 = (ArrayList) list2;
            } else {
                A1F2 = AbstractC166987dD.A1F(list2);
            }
            A0b.putParcelableArrayList(A002, A1F2);
        }
        A0b.putString(MSV.A00(322), str30);
        if (list3 != null) {
            if (list3 instanceof ArrayList) {
                A1F = (ArrayList) list3;
            } else {
                A1F = AbstractC166987dD.A1F(list3);
            }
            A0b.putStringArrayList("ClipsConstants.ARGS_PREFILL_MEDIA_ID_LIST", A1F);
        }
        A0b.putParcelable("ARGS_PREFILL_MEDIUM_CROP_INFO", null);
        A0b.putString("ARGS_LINKED_HIGHLIGHT_ID", str15);
        A0b.putString("ARGS_HIGHLIGHT_MEDIA_ID", str16);
        A0b.putString("ARGS_PRELOAD_CAPTION", str20);
        A0b.putBoolean("ARGS_HIDE_UNSAVED_DRAFT", z2);
        A0b.putBoolean("ARGS_AUTO_LOAD_UNSAVED_DRAFT", z3);
        A0b.putBoolean("ARGS_IS_EXCLUSIVE_BY_DEFAULT", z4);
        A0b.putBoolean("ARGS_IS_FAN_CLUB_PROMO_VIDEO", z5);
        A0b.putBoolean("ARGS_IS_FAN_CLUB_WELCOME_VIDEO", z6);
        A0b.putString("ARGS_SOURCE_AUDIO_TRACK", str19);
        A0b.putString("ARGS_MEDIA_PRIOR_TO_CAMERA_ID", str21);
        A0b.putString("ARGS_MEDIA_PRIOR_TO_CAMERA_RANKING_TOKEN", str22);
        A0b.putSerializable(MSV.A00(17), c5jk);
        A0b.putSerializable("ARGS_EFFECT_SOURCE", c85b);
        A0b.putBoolean("ARGS_IS_LOADED_FROM_DRAFT", z7);
        if (set != null) {
            ArrayList A0q = AbstractC167017dG.A0q(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                A0q.add(((C55U) it.next()).A02);
            }
            A0b.putStringArrayList("ARGS_ADDITIONAL_CAMERA_DESTINATION", AbstractC166987dD.A1F(A0q));
        }
        if (c55u != null) {
            A0b.putString("ARGS_CAMERA_CONFIGURATION_DESTINATION", c55u.A02);
        }
        if (num != null) {
            A0b.putInt("ARGS_CAMERA_SUB_SCREEN_DESTINATION", num.intValue());
        }
        if (c110204xp != null) {
            try {
                A0b.putString("ARGS_CLIPS_TEMPLATE_INFO", AbstractC88493x6.A00(c110204xp));
            } catch (IOException unused) {
                C0f5 AEp = C18950wb.A01.AEp(C9LP.__redex_internal_original_name, 817902720);
                AEp.ABW(DialogModule.KEY_MESSAGE, "Error setting json parameters");
                AEp.report();
            }
        }
        if (list4 != null) {
            ArrayList<String> A1E = AbstractC166987dD.A1E();
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                C93094Fl F4O = ((InterfaceC93104Fm) it2.next()).F4O();
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                AbstractC93044Fd.A00(A0A, F4O);
                A0A.close();
                AbstractC166997dE.A1S(stringWriter, A1E);
            }
            A0b.putStringArrayList("REUSABLE_TEXT_INFO", A1E);
        }
        if (c24h != null) {
            A0b.putSerializable("ARGS_TEMPLATE_BROWSER_ENTRY_POINT", c24h);
        }
        if (promptStickerModel != null) {
            A0b.putParcelable("ARGS_CLIPS_PROMP_STICKER", promptStickerModel.A02());
        }
        if (sharePlatformStickerClientModel != null) {
            A0b.putParcelable("ARGS_CLIPS_SHARE_PLATFORM_STICKER", sharePlatformStickerClientModel);
        }
        if (questionResponseReshareModel != null) {
            A0b.putParcelable("ARGS_CLIPS_QUESTION_RESPONSE_RESHARE_STICKER", questionResponseReshareModel);
        }
        A0b.putBoolean("ClipsConstants.ARG_SHOULD_RETAIN_AUDIO_AFTER_RESTART_CAPTURE", z8);
        A0b.putString("ARGS_APP_ATTRIBUTION_NAMESPACE", str24);
        A0b.putBoolean("ClipsConstants.ARG_CLIPS_IS_OPEN_FROM_CAMERA_GALLERY", z9);
        A0b.putBoolean(AbstractC111324zv.A00(604), z10);
        A0b.putBoolean("ClipsConstants.ARG_SHOULD_SKIP_TO_POST_CAPTURE", z11);
        if (directCameraViewModel != null) {
            A0b.putParcelable("DIRECT_CAMERA_VIEW_MODEL", directCameraViewModel);
        }
        if (audioOverlayTrack != null) {
            A0b.putParcelable("ClipsConstants.ARG_CLIPS_ATTRIBUTION_ONLY_AUDIO_OVERLAY_TRACK", audioOverlayTrack);
        }
        if (str25 != null) {
            A0b.putString("ARGS_DEFAULT_FOLDER_NAME", str25);
        }
        if (clipsCameraCommandAction != null) {
            A0b.putSerializable("ClipsConstants.ARGS_CLIPS_CAMERA_COMMAND_ACTION", clipsCameraCommandAction);
        }
        A0b.putBoolean("ClipsConstants.ARGS_REINITIALIZE_DRAFTS_REPOSITORY", z12);
        if (list5 != null) {
            A0b.putIntegerArrayList("ClipsConstants.ARGS_PREDEFINED_HIGHLIGHTS_START_TIME_IN_MS", AbstractC166987dD.A1F(list5));
        }
        A0b.putBoolean("ARGS_GALLERY_FIRST_ENABLED", z13);
        A0b.putString("ARGS_GALLERY_TITLE", str26);
        A0b.putString("ARGS_GALLERY_SUBTITLE", str27);
        A0b.putString("ARGS_HIGHLIGHTED_CREATION_TOOL", str28);
        A0b.putBoolean("ARGS_HIDE_GALLERY_DESTINATION_BAR", z14);
        A0b.putBoolean("ARGS_HIDE_CAMERA_DESTINATION_PICKER", z15);
        A0b.putBoolean("ARGS_SHOW_COLLAB_EDUCATION_FLOW", z16);
        if (str29 != null) {
            A0b.putString("ARGS_PRELOAD_CUTOUT_STICKER_SOURCE_MEDIA_ID", str29);
        }
        A0b.putBoolean("ARGS_SHOULD_EXIT_CREATION_AFTER_CLIPS_DRAFT_EDIT", z17);
        return A0b;
    }
}
