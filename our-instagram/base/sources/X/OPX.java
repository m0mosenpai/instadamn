package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class OPX {
    public static final C52166N6v A01(C8BN c8bn, ImmutableList immutableList, MusicProduct musicProduct, UserSession userSession, MusicOverlaySearchTab musicOverlaySearchTab, EnumC1810381f enumC1810381f, String str, Map map) {
        return A00(null, c8bn, null, immutableList, null, musicProduct, userSession, null, musicOverlaySearchTab, enumC1810381f, str, null, null, map, false, false, false);
    }

    public static final C52166N6v A00(EnumC46263Kdv enumC46263Kdv, C8BN c8bn, EnumC203578zI enumC203578zI, ImmutableList immutableList, ImmutableList immutableList2, MusicProduct musicProduct, UserSession userSession, MusicAttributionConfig musicAttributionConfig, MusicOverlaySearchTab musicOverlaySearchTab, EnumC1810381f enumC1810381f, String str, String str2, String str3, Map map, boolean z, boolean z2, boolean z3) {
        AbstractC43594JPz.A1P(str, immutableList);
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("music_browse_session_id", str);
        A05.putSerializable("music_product", musicProduct);
        A05.putSerializable("capture_state", enumC1810381f);
        A05.putBoolean("is_from_share_sheet", z);
        A05.putParcelableArrayList("audio_track_type_to_exclude", AbstractC166987dD.A1F(immutableList));
        if (musicOverlaySearchTab != null) {
            A05.putParcelable("default_focused_tab", musicOverlaySearchTab);
        }
        if (musicAttributionConfig != null) {
            A05.putParcelable("preload_music_attribution_config", musicAttributionConfig);
        }
        A05.putSerializable("music_browser_entry_point", c8bn);
        A05.putSerializable("attached_tracks", immutableList2);
        A05.putString("media_id", str2);
        A05.putString("args_pre_filled_search_term", str3);
        A05.putSerializable("surface_element", enumC203578zI);
        A05.putSerializable("audio_editor_entry_point", enumC46263Kdv);
        A05.putBoolean("should_use_light_mode", z2);
        A05.putSerializable("visual_features", (Serializable) map);
        A05.putBoolean("enable_share_from_spotify", z3);
        C52166N6v c52166N6v = new C52166N6v();
        c52166N6v.setArguments(A05);
        return c52166N6v;
    }
}
