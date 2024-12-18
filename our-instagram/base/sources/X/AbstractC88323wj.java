package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.SpritesheetInfoImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88323wj {
    public static SpritesheetInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            ArrayList arrayList = null;
            Integer num5 = null;
            Float f = null;
            Integer num6 = null;
            Integer num7 = null;
            Integer num8 = null;
            Integer num9 = null;
            Float f2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("file_size_kb".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("max_thumbnails_per_sprite".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("rendered_width".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("sprite_height".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("sprite_urls".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            SimpleImageUrl A00 = AbstractC222616c.A00(c16l);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("sprite_width".equals(A0q)) {
                    num5 = Integer.valueOf(c16l.A1D());
                } else if ("thumbnail_duration".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("thumbnail_height".equals(A0q)) {
                    num6 = Integer.valueOf(c16l.A1D());
                } else if ("thumbnail_width".equals(A0q)) {
                    num7 = Integer.valueOf(c16l.A1D());
                } else if ("thumbnails_per_row".equals(A0q)) {
                    num8 = Integer.valueOf(c16l.A1D());
                } else if ("total_thumbnail_num_per_sprite".equals(A0q)) {
                    num9 = Integer.valueOf(c16l.A1D());
                } else if ("video_length".equals(A0q)) {
                    f2 = new Float(c16l.A0U());
                }
                c16l.A0z();
            }
            return new SpritesheetInfoImpl(f, f2, num, num2, num3, num4, num5, num6, num7, num8, num9, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, SpritesheetInfoImpl spritesheetInfoImpl) {
        anonymousClass182.A0d();
        Integer num = spritesheetInfoImpl.A02;
        if (num != null) {
            anonymousClass182.A0Q("file_size_kb", num.intValue());
        }
        Integer num2 = spritesheetInfoImpl.A03;
        if (num2 != null) {
            anonymousClass182.A0Q("max_thumbnails_per_sprite", num2.intValue());
        }
        Integer num3 = spritesheetInfoImpl.A04;
        if (num3 != null) {
            anonymousClass182.A0Q("rendered_width", num3.intValue());
        }
        Integer num4 = spritesheetInfoImpl.A05;
        if (num4 != null) {
            anonymousClass182.A0Q("sprite_height", num4.intValue());
        }
        List<ImageUrl> list = spritesheetInfoImpl.A0B;
        if (list != null) {
            C16V.A03(anonymousClass182, "sprite_urls");
            for (ImageUrl imageUrl : list) {
                if (imageUrl != null) {
                    AbstractC222616c.A01(anonymousClass182, imageUrl);
                }
            }
            anonymousClass182.A0Z();
        }
        Integer num5 = spritesheetInfoImpl.A06;
        if (num5 != null) {
            anonymousClass182.A0Q("sprite_width", num5.intValue());
        }
        Float f = spritesheetInfoImpl.A00;
        if (f != null) {
            anonymousClass182.A0P("thumbnail_duration", f.floatValue());
        }
        Integer num6 = spritesheetInfoImpl.A07;
        if (num6 != null) {
            anonymousClass182.A0Q("thumbnail_height", num6.intValue());
        }
        Integer num7 = spritesheetInfoImpl.A08;
        if (num7 != null) {
            anonymousClass182.A0Q("thumbnail_width", num7.intValue());
        }
        Integer num8 = spritesheetInfoImpl.A09;
        if (num8 != null) {
            anonymousClass182.A0Q("thumbnails_per_row", num8.intValue());
        }
        Integer num9 = spritesheetInfoImpl.A0A;
        if (num9 != null) {
            anonymousClass182.A0Q("total_thumbnail_num_per_sprite", num9.intValue());
        }
        Float f2 = spritesheetInfoImpl.A01;
        if (f2 != null) {
            anonymousClass182.A0P("video_length", f2.floatValue());
        }
        anonymousClass182.A0a();
    }
}
