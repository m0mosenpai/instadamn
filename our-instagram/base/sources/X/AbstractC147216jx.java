package X;

import android.os.Build;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.6jx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC147216jx {
    public static final C147236jz A00(Bundle bundle, UserSession userSession) {
        Serializable serializable;
        Serializable serializable2;
        Serializable serializable3;
        C14360o3.A0B(userSession, 0);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SELECTED_REEL_IDS");
        if (stringArrayList != null) {
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SOURCE_REEL_IDS");
            if (stringArrayList2 != null) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    serializable = bundle.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SOURCE_MODULE", C3G2.class);
                } else {
                    serializable = bundle.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SOURCE_MODULE");
                }
                C3G2 c3g2 = (C3G2) serializable;
                if (c3g2 != null) {
                    String string = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_TRAY_SESSION_ID");
                    if (string != null) {
                        int i2 = bundle.getInt("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_NEW_STORY_REEL_COUNT", -1);
                        Integer valueOf = Integer.valueOf(i2);
                        if (i2 != -1 && valueOf != null) {
                            int i3 = bundle.getInt("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_NEW_STORY_REEL_COUNT", -1);
                            Integer valueOf2 = Integer.valueOf(i3);
                            if (i3 != -1 && valueOf2 != null) {
                                Boolean A00 = AbstractC147226jy.A00(bundle, "ReelViewerFragment.ARGUMENTS_KEY_EXTRA_HAS_OWN_STORY_REEL");
                                if (A00 != null) {
                                    boolean booleanValue = A00.booleanValue();
                                    int i4 = bundle.getInt("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_LIVE_REEL_COUNT", -1);
                                    Integer valueOf3 = Integer.valueOf(i4);
                                    if (i4 != -1 && valueOf3 != null) {
                                        Long valueOf4 = Long.valueOf(bundle.getLong("ReelViewerFragment.ARGUMENTS_REEL_VIEWER_LAUNCH_START_TIMESTAMP", 0L));
                                        Boolean valueOf5 = Boolean.valueOf(bundle.getBoolean("ReelViewerFragment.ARGUMENTS_REEL_VIEWER_LAUNCH_PRELOAD_SUCCESS", false));
                                        Boolean valueOf6 = Boolean.valueOf(bundle.getBoolean("ReelViewerFragment.ARGUMENTS_KEY_REEL_VIEWER_RECENTLY_DELETED_MODE", false));
                                        String string2 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_REEL_VIEWER_ANIMATOR_HANDLE");
                                        String string3 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_REEL_VIEWER_HIDE_ANIMATION_COORDINATOR_HANDLE");
                                        String string4 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_DATA_CUT_FILTERING_TAG");
                                        Integer valueOf7 = Integer.valueOf(bundle.getInt("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_MID_FEED_TRAY_CLIENT_POSITION"));
                                        String string5 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_SERVER_INFO");
                                        String string6 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_RTC_MESSAGE");
                                        String string7 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_BLOKS_APP_ID");
                                        String string8 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_BLOKS_PARAMS");
                                        String string9 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_EMOJI_REACT");
                                        String string10 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_AVATAR_REACT");
                                        String string11 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_PUSH_NOTIF_TYPE");
                                        String string12 = bundle.getString("shopping_session_id");
                                        String string13 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_STORY_RANKING_TOKEN");
                                        Boolean valueOf8 = Boolean.valueOf(bundle.getBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_FORCE_LOAD_REELS"));
                                        String string14 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_OVERRIDE_STARTING_ITEM_ID_IN_FIRST_REEL");
                                        Integer valueOf9 = Integer.valueOf(bundle.getInt("ReelViewerFragment.ARGUMENTS_KEY_OVERRIDE_STARTING_INDEX_IN_FIRST_REEL", -1));
                                        Boolean valueOf10 = Boolean.valueOf(bundle.getBoolean("ReelViewerFragment.ARGUMENTS_KEY_STORY_INTERSTITIAL"));
                                        Integer valueOf11 = Integer.valueOf(bundle.getInt("ReelViewerFragment.ARGUMENTS_KEY_OVERRIDE_STARTING_INDEX_IN_FIRST_REEL", -1));
                                        Boolean valueOf12 = Boolean.valueOf(bundle.getBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SHOW_DASHBOARD"));
                                        Boolean valueOf13 = Boolean.valueOf(bundle.getBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SHOW_REPORT"));
                                        Boolean valueOf14 = Boolean.valueOf(bundle.getBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SHOW_MISINFORMATION_FACT_CHECK"));
                                        Boolean valueOf15 = Boolean.valueOf(bundle.getBoolean("ReelViewerFragment.ARGUMENTS_KEY_ANIMATE_INTERSTITIAL_OVERLAY"));
                                        if (i >= 33) {
                                            serializable2 = bundle.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_MEDIA_REQUEST_PARAMS", Object.class);
                                        } else {
                                            serializable2 = bundle.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_MEDIA_REQUEST_PARAMS");
                                        }
                                        Map map = (Map) serializable2;
                                        if (i >= 33) {
                                            serializable3 = bundle.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_TO_REEL_ITEM_IDS_FILTER", Object.class);
                                        } else {
                                            serializable3 = bundle.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_TO_REEL_ITEM_IDS_FILTER");
                                        }
                                        String string15 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_LAUNCHED_REEL_ID");
                                        String string16 = bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_VIEWER_BOTTOM_SHEET_MANAGER_HANDLE");
                                        SearchContext searchContext = (SearchContext) bundle.getParcelable("arguments_search_context");
                                        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EARNED_ACHIEVEMENT_IDS");
                                        return new C147236jz(c3g2, searchContext, valueOf5, valueOf6, valueOf8, valueOf10, valueOf12, valueOf13, valueOf14, valueOf15, valueOf7, valueOf9, valueOf11, valueOf4, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, bundle.getString("ReelViewerFragment.ARGUMENTS_KEY_ACHIEVEMENT_ENTRY_POINT"), stringArrayList, stringArrayList2, stringArrayList3, map, (Map) serializable3, i2, i3, i4, booleanValue);
                                    }
                                    throw new IllegalStateException("liveReelCount must not be null");
                                }
                                throw new IllegalStateException("hasOwnStoryReel must not be null");
                            }
                            throw new IllegalStateException("newStoryReelCount must not be null");
                        }
                        throw new IllegalStateException("viewedStoryReelCount must not be null");
                    }
                    throw new IllegalStateException("traySessioId must not be null");
                }
                throw new IllegalStateException("sourceModule must not be null");
            }
            throw new IllegalStateException("sourceReelIds must not be null");
        }
        throw new IllegalStateException("selectedReelIds must not be null");
    }
}
