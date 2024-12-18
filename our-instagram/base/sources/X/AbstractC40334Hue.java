package X;

import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.StoryTemplateMusicAssetInfoDict;
import java.io.IOException;

/* renamed from: X.Hue, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40334Hue {
    public static StoryTemplateMusicAssetInfoDict parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            MusicCanonicalType musicCanonicalType = null;
            String str = null;
            String str2 = null;
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str3 = null;
            String str4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("audio_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    musicCanonicalType = AbstractC84073or.A00(A1P);
                } else if ("cover_artwork_thumbnail_uri".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("cover_artwork_uri".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("duration_in_ms".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("has_lyrics".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("is_explicit".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("progressive_download_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new StoryTemplateMusicAssetInfoDict(musicCanonicalType, bool, bool2, num, str, str2, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
