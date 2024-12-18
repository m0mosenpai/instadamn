package X;

import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.StoryTemplateMusicAssetInfoDict;
import com.instagram.api.schemas.StoryTemplateMusicStickerDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.4vz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109324vz {
    public static StoryTemplateMusicStickerDict parseFromJson(C16L c16l) {
        C0KX c0kx;
        String str;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Float f = null;
            Lyrics lyrics = null;
            StoryTemplateMusicAssetInfoDict storyTemplateMusicAssetInfoDict = null;
            Integer num3 = null;
            Float f2 = null;
            Float f3 = null;
            Float f4 = null;
            Float f5 = null;
            Integer num4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("attribution".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("audio_asset_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("audio_asset_start_time_in_ms".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("audio_cluster_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("derived_content_start_time_in_ms".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("display_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    f = Float.valueOf((float) c16l.A0U());
                } else if ("lyrics".equals(A0q)) {
                    lyrics = AbstractC84393pY.parseFromJson(c16l);
                } else if ("music_asset_info".equals(A0q)) {
                    storyTemplateMusicAssetInfoDict = AbstractC40334Hue.parseFromJson(c16l);
                } else if ("overlap_duration_in_ms".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("rotation".equals(A0q)) {
                    f2 = Float.valueOf((float) c16l.A0U());
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    f3 = Float.valueOf((float) c16l.A0U());
                } else if ("x".equals(A0q)) {
                    f4 = Float.valueOf((float) c16l.A0U());
                } else if ("y".equals(A0q)) {
                    f5 = Float.valueOf((float) c16l.A0U());
                } else if ("z_index".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("attribution", "StoryTemplateMusicStickerDict");
            } else if (str3 != null || !(c16l instanceof C07950bF)) {
                if (num == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("audio_asset_start_time_in_ms", "StoryTemplateMusicStickerDict");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("audio_cluster_id", "StoryTemplateMusicStickerDict");
                } else if (str5 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("color", "StoryTemplateMusicStickerDict");
                } else if (num2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("derived_content_start_time_in_ms", "StoryTemplateMusicStickerDict");
                } else if (str6 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("display_type", "StoryTemplateMusicStickerDict");
                } else if (f == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(IgReactMediaPickerNativeModule.HEIGHT, "StoryTemplateMusicStickerDict");
                } else if (num3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("overlap_duration_in_ms", "StoryTemplateMusicStickerDict");
                } else if (f2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("rotation", "StoryTemplateMusicStickerDict");
                } else if (f3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(IgReactMediaPickerNativeModule.WIDTH, "StoryTemplateMusicStickerDict");
                } else if (f4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("x", "StoryTemplateMusicStickerDict");
                } else {
                    if (f5 == null && (c16l instanceof C07950bF)) {
                        c0kx = ((C07950bF) c16l).A03;
                        str = "y";
                    } else if (num4 == null && (c16l instanceof C07950bF)) {
                        c0kx = ((C07950bF) c16l).A03;
                        str = "z_index";
                    } else {
                        return new StoryTemplateMusicStickerDict(lyrics, storyTemplateMusicAssetInfoDict, str2, str3, str4, str5, str6, f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue(), f5.floatValue(), num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                    }
                    c0kx.A00(str, "StoryTemplateMusicStickerDict");
                }
            } else {
                ((C07950bF) c16l).A03.A00("audio_asset_id", "StoryTemplateMusicStickerDict");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
