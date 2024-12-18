package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.io.Serializable;
import java.util.Map;

/* renamed from: X.NvM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54062NvM {
    public static final MYT A00(C8BN c8bn, EnumC50631MWs enumC50631MWs, ImmutableList immutableList, ImmutableList immutableList2, MusicProduct musicProduct, UserSession userSession, MusicAttributionConfig musicAttributionConfig, MusicBrowseCategory musicBrowseCategory, MusicOverlaySearchTab musicOverlaySearchTab, EnumC1810381f enumC1810381f, String str, String str2, String str3, Map map, int i, boolean z, boolean z2) {
        AbstractC167007dF.A1E(userSession, 0, musicProduct);
        AbstractC25234BEr.A0k(4, immutableList, str, enumC1810381f, enumC50631MWs);
        MYT myt = new MYT();
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putParcelable("MusicOverlayBrowseResultsFragment.music_browse_category", musicBrowseCategory);
        A05.putParcelable("MusicOverlayBrowseResultsFragment.music_overlay_search_tab", musicOverlaySearchTab);
        A05.putParcelable("MusicOverlayBrowseResultsFragment.music_attribution_config", musicAttributionConfig);
        A05.putSerializable("music_product", musicProduct);
        A05.putParcelableArrayList("audio_type_to_exclude", AbstractC166987dD.A1F(immutableList));
        A05.putString("browse_session_full_id", str);
        A05.putSerializable("capture_state", enumC1810381f);
        A05.putSerializable("camera_surface_type", enumC50631MWs);
        A05.putSerializable("camera_music_browser_entry_point", c8bn);
        A05.putSerializable("camera_already_attached_tracks", immutableList2);
        A05.putBoolean("MusicOverlayBrowseResultsFragment.is_tabbed_fragment", z);
        A05.putInt("list_bottom_padding_px", i);
        A05.putString("media_id", str2);
        A05.putBoolean("MusicOverlayBrowseResultsFragment.should_use_light_mode", z2);
        A05.putSerializable("visual_features", (Serializable) map);
        A05.putString("MusicOverlayBrowseResultsFragment.audio_browser_surface", str3);
        myt.setArguments(A05);
        return myt;
    }
}
