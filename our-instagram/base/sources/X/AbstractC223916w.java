package X;

import com.instagram.api.schemas.CreatorSegmentation;
import java.io.IOException;

/* renamed from: X.16w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC223916w {
    public static C224016y parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            CreatorSegmentation creatorSegmentation = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("creator_segmentation".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    creatorSegmentation = (CreatorSegmentation) CreatorSegmentation.A01.get(A1P);
                    if (creatorSegmentation == null) {
                        creatorSegmentation = CreatorSegmentation.A0A;
                    }
                } else if ("is_creator".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            return new C224016y(creatorSegmentation, bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C224016y c224016y) {
        anonymousClass182.A0d();
        CreatorSegmentation creatorSegmentation = c224016y.A00;
        if (creatorSegmentation != null) {
            anonymousClass182.A0S("creator_segmentation", creatorSegmentation.A00);
        }
        Boolean bool = c224016y.A01;
        if (bool != null) {
            anonymousClass182.A0T("is_creator", bool.booleanValue());
        }
        anonymousClass182.A0a();
    }
}
