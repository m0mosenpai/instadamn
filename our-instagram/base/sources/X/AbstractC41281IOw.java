package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IOw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41281IOw {
    public static C114615Fj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            H4M h4m = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "music_asset_info")) {
                    h4m = AbstractC40096HqO.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (h4m == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("music_asset_info", c16l, "SponsoredMusicInfo");
                throw C00O.createAndThrow();
            }
            return new C114615Fj(h4m);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C114615Fj c114615Fj) {
        anonymousClass182.A0d();
        H4M h4m = c114615Fj.A00;
        if (h4m != null) {
            anonymousClass182.A0r("music_asset_info");
            anonymousClass182.A0d();
            String str = h4m.A0H;
            if (str != null) {
                anonymousClass182.A0S("alacorn_session_id", str);
            }
            Boolean bool = h4m.A03;
            if (bool != null) {
                anonymousClass182.A0T("allows_saving", bool.booleanValue());
            }
            String str2 = h4m.A0I;
            if (str2 != null) {
                anonymousClass182.A0S("artist_id", str2);
            }
            String str3 = h4m.A0J;
            if (str3 != null) {
                anonymousClass182.A0S("audio_cluster_id", str3);
            }
            List list = h4m.A0S;
            if (list != null) {
                Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "beats", list);
                while (A0q.hasNext()) {
                    Number number = (Number) A0q.next();
                    if (number != null) {
                        anonymousClass182.A0i(number.longValue());
                    }
                }
                anonymousClass182.A0Z();
            }
            Boolean bool2 = h4m.A04;
            if (bool2 != null) {
                anonymousClass182.A0T("can_remix_be_shared_to_fb", bool2.booleanValue());
            }
            ImageUrl imageUrl = h4m.A00;
            if (imageUrl != null) {
                anonymousClass182.A0r("cover_artwork_thumbnail_uri");
                AbstractC222616c.A01(anonymousClass182, imageUrl);
            }
            ImageUrl imageUrl2 = h4m.A01;
            if (imageUrl2 != null) {
                anonymousClass182.A0r("cover_artwork_uri");
                AbstractC222616c.A01(anonymousClass182, imageUrl2);
            }
            String str4 = h4m.A0K;
            if (str4 != null) {
                anonymousClass182.A0S("dash_manifest", str4);
            }
            Integer num = h4m.A0C;
            if (num != null) {
                anonymousClass182.A0Q("delay_in_ms_at_start", num.intValue());
            }
            Integer num2 = h4m.A0D;
            if (num2 != null) {
                anonymousClass182.A0Q("delay_in_ms_on_loop", num2.intValue());
            }
            String str5 = h4m.A0L;
            if (str5 != null) {
                anonymousClass182.A0S("display_artist", str5);
            }
            Long l = h4m.A0F;
            if (l != null) {
                anonymousClass182.A0R("duration", l.longValue());
            }
            Integer num3 = h4m.A0E;
            if (num3 != null) {
                anonymousClass182.A0Q("duration_in_ms", num3.intValue());
            }
            Boolean bool3 = h4m.A05;
            if (bool3 != null) {
                anonymousClass182.A0T("has_lyrics", bool3.booleanValue());
            }
            List list2 = h4m.A0T;
            if (list2 != null) {
                Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "highlight_start_times_in_ms", list2);
                while (A0q2.hasNext()) {
                    Number number2 = (Number) A0q2.next();
                    if (number2 != null) {
                        anonymousClass182.A0h(number2.intValue());
                    }
                }
                anonymousClass182.A0Z();
            }
            AbstractC37301Gc2.A1D(anonymousClass182, h4m.A0M);
            User user = h4m.A02;
            if (user != null) {
                AbstractC37300Gc1.A0x(anonymousClass182, user, "ig_artist");
            }
            Boolean bool4 = h4m.A06;
            if (bool4 != null) {
                anonymousClass182.A0T("is_bookmarked", bool4.booleanValue());
            }
            Boolean bool5 = h4m.A07;
            if (bool5 != null) {
                anonymousClass182.A0T("is_explicit", bool5.booleanValue());
            }
            Boolean bool6 = h4m.A08;
            if (bool6 != null) {
                anonymousClass182.A0T("is_local_audio", bool6.booleanValue());
            }
            Boolean bool7 = h4m.A09;
            if (bool7 != null) {
                anonymousClass182.A0T("is_loop_disabled", bool7.booleanValue());
            }
            Boolean bool8 = h4m.A0A;
            if (bool8 != null) {
                anonymousClass182.A0T("is_original_sound", bool8.booleanValue());
            }
            String str6 = h4m.A0N;
            if (str6 != null) {
                anonymousClass182.A0S("local_audio_file_path", str6);
            }
            String str7 = h4m.A0O;
            if (str7 != null) {
                anonymousClass182.A0S("original_sound_media_id", str7);
            }
            String str8 = h4m.A0P;
            if (str8 != null) {
                anonymousClass182.A0S("progressive_download_fast_start_url", str8);
            }
            String str9 = h4m.A0Q;
            if (str9 != null) {
                anonymousClass182.A0S("progressive_download_url", str9);
            }
            Boolean bool9 = h4m.A0B;
            if (bool9 != null) {
                anonymousClass182.A0T("server_side_audio_status", bool9.booleanValue());
            }
            Long l2 = h4m.A0G;
            if (l2 != null) {
                anonymousClass182.A0R("starting_point", l2.longValue());
            }
            AbstractC37301Gc2.A1F(anonymousClass182, h4m.A0R);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
