package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3pX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84383pX {
    public static TrackDataImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            SimpleImageUrl simpleImageUrl = null;
            SimpleImageUrl simpleImageUrl2 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Integer num = null;
            String str7 = null;
            Boolean bool3 = null;
            ArrayList arrayList = null;
            String str8 = null;
            String str9 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Lyrics lyrics = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("allows_saving".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("artist_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("audio_asset_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("audio_cluster_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("cover_artwork_thumbnail_uri".equals(A0q)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if ("cover_artwork_uri".equals(A0q)) {
                    simpleImageUrl2 = AbstractC222616c.A00(c16l);
                } else if ("dark_message".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("dash_manifest".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("display_artist".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("duration_in_ms".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("fast_start_progressive_download_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("has_lyrics".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("highlight_start_times_in_ms".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Integer valueOf = Integer.valueOf(c16l.A1D());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("ig_username".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("is_eligible_for_audio_effects".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("is_eligible_for_vinyl_sticker".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("is_explicit".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("lyrics".equals(A0q)) {
                    lyrics = AbstractC84393pY.parseFromJson(c16l);
                } else if ("progressive_download_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("reactive_audio_download_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("sanitized_title".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str13 = null;
                    } else {
                        str13 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str14 = null;
                    } else {
                        str14 = c16l.A1P();
                    }
                } else if ("web_30s_preview_download_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str15 = null;
                    } else {
                        str15 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("allows_saving", "TrackDataImpl");
            } else if (simpleImageUrl2 != null || !(c16l instanceof C07950bF)) {
                if (str8 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "TrackDataImpl");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_explicit", "TrackDataImpl");
                } else {
                    return new TrackDataImpl(lyrics, simpleImageUrl, simpleImageUrl2, bool3, bool4, bool5, num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, arrayList, bool.booleanValue(), bool2.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("cover_artwork_uri", "TrackDataImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, TrackDataImpl trackDataImpl) {
        anonymousClass182.A0d();
        anonymousClass182.A0T("allows_saving", trackDataImpl.A0N);
        String str = trackDataImpl.A07;
        if (str != null) {
            anonymousClass182.A0S("artist_id", str);
        }
        String str2 = trackDataImpl.A08;
        if (str2 != null) {
            anonymousClass182.A0S("audio_asset_id", str2);
        }
        String str3 = trackDataImpl.A09;
        if (str3 != null) {
            anonymousClass182.A0S("audio_cluster_id", str3);
        }
        ImageUrl imageUrl = trackDataImpl.A01;
        if (imageUrl != null) {
            anonymousClass182.A0r("cover_artwork_thumbnail_uri");
            AbstractC222616c.A01(anonymousClass182, imageUrl);
        }
        ImageUrl imageUrl2 = trackDataImpl.A02;
        if (imageUrl2 != null) {
            anonymousClass182.A0r("cover_artwork_uri");
            AbstractC222616c.A01(anonymousClass182, imageUrl2);
        }
        String str4 = trackDataImpl.A0A;
        if (str4 != null) {
            anonymousClass182.A0S("dark_message", str4);
        }
        String str5 = trackDataImpl.A0B;
        if (str5 != null) {
            anonymousClass182.A0S("dash_manifest", str5);
        }
        String str6 = trackDataImpl.A0C;
        if (str6 != null) {
            anonymousClass182.A0S("display_artist", str6);
        }
        Integer num = trackDataImpl.A06;
        if (num != null) {
            anonymousClass182.A0Q("duration_in_ms", num.intValue());
        }
        String str7 = trackDataImpl.A0D;
        if (str7 != null) {
            anonymousClass182.A0S("fast_start_progressive_download_url", str7);
        }
        Boolean bool = trackDataImpl.A03;
        if (bool != null) {
            anonymousClass182.A0T("has_lyrics", bool.booleanValue());
        }
        List<Number> list = trackDataImpl.A0M;
        if (list != null) {
            C16V.A03(anonymousClass182, "highlight_start_times_in_ms");
            for (Number number : list) {
                if (number != null) {
                    anonymousClass182.A0h(number.intValue());
                }
            }
            anonymousClass182.A0Z();
        }
        String str8 = trackDataImpl.A0E;
        if (str8 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str8);
        }
        String str9 = trackDataImpl.A0F;
        if (str9 != null) {
            anonymousClass182.A0S("ig_username", str9);
        }
        Boolean bool2 = trackDataImpl.A04;
        if (bool2 != null) {
            anonymousClass182.A0T("is_eligible_for_audio_effects", bool2.booleanValue());
        }
        Boolean bool3 = trackDataImpl.A05;
        if (bool3 != null) {
            anonymousClass182.A0T("is_eligible_for_vinyl_sticker", bool3.booleanValue());
        }
        anonymousClass182.A0T("is_explicit", trackDataImpl.A0O);
        Lyrics lyrics = trackDataImpl.A00;
        if (lyrics != null) {
            anonymousClass182.A0r("lyrics");
            AbstractC84393pY.A00(anonymousClass182, lyrics);
        }
        String str10 = trackDataImpl.A0G;
        if (str10 != null) {
            anonymousClass182.A0S("progressive_download_url", str10);
        }
        String str11 = trackDataImpl.A0H;
        if (str11 != null) {
            anonymousClass182.A0S("reactive_audio_download_url", str11);
        }
        String str12 = trackDataImpl.A0I;
        if (str12 != null) {
            anonymousClass182.A0S("sanitized_title", str12);
        }
        String str13 = trackDataImpl.A0J;
        if (str13 != null) {
            anonymousClass182.A0S("subtitle", str13);
        }
        String str14 = trackDataImpl.A0K;
        if (str14 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str14);
        }
        String str15 = trackDataImpl.A0L;
        if (str15 != null) {
            anonymousClass182.A0S("web_30s_preview_download_url", str15);
        }
        anonymousClass182.A0a();
    }
}
