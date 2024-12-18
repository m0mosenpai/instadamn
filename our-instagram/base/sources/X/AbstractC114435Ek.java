package X;

import android.os.Parcelable;
import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.OriginalAudioPartMetadata;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Ek, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC114435Ek {
    public static OriginalAudioPartMetadata parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Boolean bool = null;
            ArrayList arrayList = null;
            Boolean bool2 = null;
            MusicCanonicalType musicCanonicalType = null;
            String str = null;
            String str2 = null;
            Integer num3 = null;
            User user = null;
            Boolean bool3 = null;
            String str3 = null;
            SimpleImageUrl simpleImageUrl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("audio_filter_infos".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AudioFilterInfo parseFromJson = ADC.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("audio_start_time_in_ms".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("audio_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    musicCanonicalType = AbstractC84073or.A00(A1P);
                } else if ("display_artist".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("display_title".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("duration_in_ms".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("ig_artist".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("is_bookmarked".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("is_eligible_for_audio_effects".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("is_explicit".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("music_canonical_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("parent_start_time_in_ms".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("thumbnail_uri".equals(A0q)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("audio_start_time_in_ms", "OriginalAudioPartMetadata");
            } else if (musicCanonicalType != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("display_artist", "OriginalAudioPartMetadata");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("display_title", "OriginalAudioPartMetadata");
                } else if (num2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("duration_in_ms", "OriginalAudioPartMetadata");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_bookmarked", "OriginalAudioPartMetadata");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_explicit", "OriginalAudioPartMetadata");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("music_canonical_id", "OriginalAudioPartMetadata");
                } else if (num3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("parent_start_time_in_ms", "OriginalAudioPartMetadata");
                } else if (simpleImageUrl == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("thumbnail_uri", "OriginalAudioPartMetadata");
                } else {
                    return new OriginalAudioPartMetadata(musicCanonicalType, simpleImageUrl, user, bool3, str, str2, str3, arrayList, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue(), bool2.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("audio_type", "OriginalAudioPartMetadata");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, OriginalAudioPartMetadata originalAudioPartMetadata) {
        anonymousClass182.A0d();
        List<AudioFilterInfo> list = originalAudioPartMetadata.A0A;
        if (list != null) {
            C16V.A03(anonymousClass182, "audio_filter_infos");
            for (AudioFilterInfo audioFilterInfo : list) {
                if (audioFilterInfo != null) {
                    ADC.A00(anonymousClass182, audioFilterInfo);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0Q("audio_start_time_in_ms", originalAudioPartMetadata.A00);
        MusicCanonicalType musicCanonicalType = originalAudioPartMetadata.A03;
        if (musicCanonicalType != null) {
            anonymousClass182.A0S("audio_type", musicCanonicalType.A00);
        }
        String str = originalAudioPartMetadata.A07;
        if (str != null) {
            anonymousClass182.A0S("display_artist", str);
        }
        String str2 = originalAudioPartMetadata.A08;
        if (str2 != null) {
            anonymousClass182.A0S("display_title", str2);
        }
        anonymousClass182.A0Q("duration_in_ms", originalAudioPartMetadata.A01);
        User user = originalAudioPartMetadata.A05;
        if (user != null) {
            anonymousClass182.A0r("ig_artist");
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        anonymousClass182.A0T("is_bookmarked", originalAudioPartMetadata.A0B);
        Boolean bool = originalAudioPartMetadata.A06;
        if (bool != null) {
            anonymousClass182.A0T("is_eligible_for_audio_effects", bool.booleanValue());
        }
        anonymousClass182.A0T("is_explicit", originalAudioPartMetadata.A0C);
        String str3 = originalAudioPartMetadata.A09;
        if (str3 != null) {
            anonymousClass182.A0S("music_canonical_id", str3);
        }
        anonymousClass182.A0Q("parent_start_time_in_ms", originalAudioPartMetadata.A02);
        ImageUrl imageUrl = originalAudioPartMetadata.A04;
        if (imageUrl != null) {
            anonymousClass182.A0r("thumbnail_uri");
            AbstractC222616c.A01(anonymousClass182, imageUrl);
        }
        anonymousClass182.A0a();
    }
}
