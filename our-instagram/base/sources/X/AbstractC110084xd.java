package X;

import com.instagram.model.mediasize.ImageInfoImpl;
import java.io.IOException;

/* renamed from: X.4xd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC110084xd {
    public static C110094xe parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ImageInfoImpl imageInfoImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("image_versions2".equals(A0q)) {
                    imageInfoImpl = AbstractC39101rj.parseFromJson(c16l);
                } else if ("owner_username".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("template_media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("owner_username", "ClipsTemplateAttributionInfo");
            } else if (str2 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("template_media_id", "ClipsTemplateAttributionInfo");
            } else {
                return new C110094xe(imageInfoImpl, str, str2);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
