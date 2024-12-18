package X;

import com.instagram.api.schemas.StoryTemplateAssetDict;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import java.io.IOException;

/* renamed from: X.5Iy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115275Iy {
    public static StoryTemplateAssetDict parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ImageInfoImpl imageInfoImpl = null;
            ImageInfoImpl imageInfoImpl2 = null;
            Boolean bool = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("background_pk".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("background_versions2".equals(A0q)) {
                    imageInfoImpl = AbstractC39101rj.parseFromJson(c16l);
                } else if (AbstractC58317Pt9.A00(107).equals(A0q)) {
                    imageInfoImpl2 = AbstractC39101rj.parseFromJson(c16l);
                } else if ("is_pinned_gallery_opaque".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("pinned_gallery_opaque_percentage".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("pk".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("template_sticker_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("z_index".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new StoryTemplateAssetDict(imageInfoImpl, imageInfoImpl2, bool, num, num2, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, StoryTemplateAssetDict storyTemplateAssetDict) {
        anonymousClass182.A0d();
        String str = storyTemplateAssetDict.A05;
        if (str != null) {
            anonymousClass182.A0S("background_pk", str);
        }
        ImageInfo imageInfo = storyTemplateAssetDict.A00;
        if (imageInfo != null) {
            anonymousClass182.A0r("background_versions2");
            AbstractC39101rj.A00(anonymousClass182, imageInfo.F5B());
        }
        ImageInfo imageInfo2 = storyTemplateAssetDict.A01;
        if (imageInfo2 != null) {
            anonymousClass182.A0r(AbstractC58317Pt9.A00(107));
            AbstractC39101rj.A00(anonymousClass182, imageInfo2.F5B());
        }
        Boolean bool = storyTemplateAssetDict.A02;
        if (bool != null) {
            anonymousClass182.A0T("is_pinned_gallery_opaque", bool.booleanValue());
        }
        Integer num = storyTemplateAssetDict.A03;
        if (num != null) {
            anonymousClass182.A0Q("pinned_gallery_opaque_percentage", num.intValue());
        }
        String str2 = storyTemplateAssetDict.A06;
        if (str2 != null) {
            anonymousClass182.A0S("pk", str2);
        }
        String str3 = storyTemplateAssetDict.A07;
        if (str3 != null) {
            anonymousClass182.A0S("template_sticker_id", str3);
        }
        Integer num2 = storyTemplateAssetDict.A04;
        if (num2 != null) {
            anonymousClass182.A0Q("z_index", num2.intValue());
        }
        anonymousClass182.A0a();
    }
}
