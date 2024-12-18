package X;

import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.reels.ReelViewerConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Zm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28511Zm {
    public final Bundle A02(Capabilities capabilities, InterfaceC83733oI interfaceC83733oI, Integer num, int i, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(interfaceC83733oI, 0);
        Bundle bundle = new Bundle();
        AbstractC35077Fco.A02(bundle, interfaceC83733oI, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        bundle.putBoolean("DirectThreadDetailFragment.IS_PERMISSIONS_THREAD", z);
        bundle.putBoolean("DirectThreadDetailFragment.SHOULD_ALLOW_LEAVE_CONVERSATION", z2);
        bundle.putBoolean("DirectThreadDetailFragment.SET_MANUAL_ACTION_BAR_VERTICAL_OFFSET", false);
        bundle.putInt("DirectThreadDetailFragment.THREAD_SUBTYPE", i);
        if (num != null) {
            bundle.putInt("DirectFragment.DIRECT_FRAGMENT_THREAD_POSITION", num.intValue());
        }
        bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES", capabilities);
        bundle.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME_ID", 0);
        bundle.putBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_ELIGIBLE_FOR_DMM", z3);
        return bundle;
    }

    public final Bundle A03(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, int i, int i2) {
        C14360o3.A0B(str, 0);
        Bundle bundle = new Bundle();
        bundle.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_TITLE", str);
        bundle.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION", i);
        bundle.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", str2);
        bundle.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MNET_REQUEST_ID", str3);
        bundle.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX", i2);
        bundle.putParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_FACEBOOK_FRIENDS", arrayList);
        bundle.putParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_FACEBOOK_NON_FRIENDS", arrayList2);
        bundle.putParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_INSTAGRAM_NON_CONTACTS", arrayList3);
        bundle.putParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_INSTAGRAM_BUSINESSES_ONLY_NON_CONTACTS", arrayList4);
        bundle.putParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CHANNELS", arrayList5);
        bundle.putParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_AI_AGENTS", arrayList6);
        return bundle;
    }

    public final Bundle A00(RectF rectF, RectF rectF2, C22P c22p, ImageUrl imageUrl, AnonymousClass442 anonymousClass442, DirectCameraViewModel directCameraViewModel, C3o9 c3o9, String str, String str2, String str3, String str4, ArrayList arrayList, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(c22p, 8);
        AbstractC189688an.A00(c22p);
        Bundle bundle = new Bundle();
        bundle.putParcelable("DirectReplyCameraFragments.ARG_REPLY_VIEW_MODEL", directCameraViewModel);
        AbstractC43826JZo.A01(bundle, c3o9, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        bundle.putString("DirectStoryViewerFragment.ARGUMENTS_MESSAGE_ID", str);
        bundle.putString("DirectStoryViewerFragment.ARGUMENTS_MESSAGE_CLIENT_CONTEXT", str2);
        bundle.putBoolean("DirectStoryViewerFragment.IS_SHH_MODE_MESSAGE", z);
        bundle.putParcelable("DirectStoryViewerFragment.THUMBNAIL_IMAGE_URL", imageUrl);
        bundle.putString("DirectStoryViewerFragment.VIEW_MODE", str3);
        bundle.putString("DirectVisualReplyFragment.REPLY_CAM_ARG_REPLY_TYPE", str4);
        bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ENTRY_VIEW_BOUNDS", rectF);
        bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_EXIT_VIEW_BOUNDS", rectF2);
        bundle.putSerializable("DirectReplyCameraFragments.ARG_REPLY_ENTRY_POINT", c22p);
        bundle.putIntegerArrayList("DirectVisualReplyFragment.REPLY_CAM_ARG_MANUAL_RECIPIENT_VIEW_MODES", arrayList);
        bundle.putBoolean("DirectQuickReplyCameraFragment.REPLY_CAM_ARG_IS_REPLY_TO_SELFIE_REACTION", z2);
        bundle.putBoolean("DirectReplyCameraFragments.REPLY_CAM_ARG_SHOULD_FORCE_DISABLE_VIDEO", z3);
        if (anonymousClass442 != null) {
            try {
                bundle.putString("DirectReplyCameraFragments.REPLY_CAM_ARG_REPLIED_TO_MESSAGE", AbstractC43642JSa.A00(anonymousClass442));
                return bundle;
            } catch (IOException e) {
                C0w9.A02(EnumC12410kj.A05, "serialize_replied_to_message", "Failed", e);
            }
        }
        return bundle;
    }

    public final Bundle A01(RectF rectF, C3o9 c3o9, ReelViewerConfig reelViewerConfig, Boolean bool, String str, String str2, String str3, String str4, String str5, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C14360o3.A0B(str4, 10);
        C14360o3.A0B(reelViewerConfig, 14);
        Bundle bundle = new Bundle();
        AbstractC43826JZo.A01(bundle, c3o9, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        bundle.putString("DirectStoryViewerFragment.ARGUMENTS_MESSAGE_ID", str);
        bundle.putString("DirectStoryViewerFragment.ARGUMENTS_MESSAGE_CLIENT_CONTEXT", str2);
        if (list != null) {
            bundle.putStringArrayList("DirectStoryViewerFragment.ARGUMENTS_RECIPIENT_IDS", new ArrayList<>(list));
        }
        bundle.putString("DirectStoryViewerFragment.ARGUMENTS_THREAD_TITLE", str3);
        bundle.putBoolean("DirectStoryViewerFragment.ARGUMENTS_IS_REPLAY", z);
        bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ENTRY_VIEW_BOUNDS", rectF);
        bundle.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_FRAGMENT_ENTER_ANIMATION", 0);
        bundle.putString("DirectVisualMessageViewerFragment.REPLAY_SESSION_ID", str4);
        bundle.putString("DirectFragment.ENTRY_POINT", str5);
        bundle.putBoolean("DirectVisualMessageViewerFragment.NEEDS_THUMBNAIL_ANIMATION", z3);
        bundle.putBoolean("DirectVisualMessageViewerFragment.VISUAL_REPLIES_ENABLED", z4);
        bundle.putBoolean("DirectVisualMessageViewerFragment.COMPOSER_ENABLED", z5);
        bundle.putParcelable("DirectVisualMessageViewerFragment.VISUAL_MESSAGE_VIEWER_ARGUMENT_REEL_VIEWER_CONFIG", reelViewerConfig);
        bundle.putBoolean("DirectVisualMessageViewerFragment.SKIP_ENTRY_ANIMATION", false);
        bundle.putBoolean("DirectVisualMessageViewerFragment.USE_DIRECT_VISUAL_MESSAGE_ITEM_MODEL", z6);
        bundle.putBoolean("DirectStoryViewerFragment.IS_SHH_MODE_MESSAGE", z2);
        if (list2 != null) {
            bundle.putParcelableArrayList("DirectVisualMessageViewerFragment.VISUAL_MESSAGE_ITEMS", new ArrayList<>(list2));
        }
        if (bool != null) {
            bundle.putBoolean("DirectVisualMessageViewerFragment.IS_OPEN_MESSAGE", bool.booleanValue());
        }
        return bundle;
    }
}
