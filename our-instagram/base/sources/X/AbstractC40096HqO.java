package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HqO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40096HqO {
    public static H4M parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            Boolean bool2 = null;
            SimpleImageUrl simpleImageUrl = null;
            SimpleImageUrl simpleImageUrl2 = null;
            String str4 = null;
            Integer num = null;
            Integer num2 = null;
            String str5 = null;
            Long l = null;
            Integer num3 = null;
            Boolean bool3 = null;
            ArrayList arrayList2 = null;
            String str6 = null;
            User user = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            Boolean bool9 = null;
            Long l2 = null;
            String str11 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("alacorn_session_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("allows_saving".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("artist_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("audio_cluster_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("beats".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Long A0h = AbstractC31173DnH.A0h(c16l);
                            if (A0h != null) {
                                arrayList.add(A0h);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("can_remix_be_shared_to_fb".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("cover_artwork_thumbnail_uri".equals(A0s)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if ("cover_artwork_uri".equals(A0s)) {
                    simpleImageUrl2 = AbstractC222616c.A00(c16l);
                } else if ("dash_manifest".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("delay_in_ms_at_start".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("delay_in_ms_on_loop".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("display_artist".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("duration".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("duration_in_ms".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("has_lyrics".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("highlight_start_times_in_ms".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Integer A0h2 = AbstractC166997dE.A0h(c16l);
                            if (A0h2 != null) {
                                arrayList2.add(A0h2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("ig_artist".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("is_bookmarked".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("is_explicit".equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                } else if ("is_local_audio".equals(A0s)) {
                    bool6 = AbstractC166997dE.A0d(c16l);
                } else if ("is_loop_disabled".equals(A0s)) {
                    bool7 = AbstractC166997dE.A0d(c16l);
                } else if ("is_original_sound".equals(A0s)) {
                    bool8 = AbstractC166997dE.A0d(c16l);
                } else if ("local_audio_file_path".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("original_sound_media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("progressive_download_fast_start_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("progressive_download_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("server_side_audio_status".equals(A0s)) {
                    bool9 = AbstractC166997dE.A0d(c16l);
                } else if ("starting_point".equals(A0s)) {
                    l2 = AbstractC31173DnH.A0h(c16l);
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new H4M(simpleImageUrl, simpleImageUrl2, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, num2, num3, l, l2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
