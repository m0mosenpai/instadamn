package X;

import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import java.io.IOException;

/* renamed from: X.4zV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC111144zV {
    public static ProductImageContainerImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ImageInfoImpl imageInfoImpl = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("image_versions2".equals(A0q)) {
                    imageInfoImpl = AbstractC39101rj.parseFromJson(c16l);
                } else if ("preview".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (imageInfoImpl == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("image_versions2", "ProductImageContainerImpl");
                throw C00O.createAndThrow();
            }
            return new ProductImageContainerImpl(imageInfoImpl, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ProductImageContainerImpl productImageContainerImpl) {
        anonymousClass182.A0d();
        ImageInfo imageInfo = productImageContainerImpl.A00;
        if (imageInfo != null) {
            anonymousClass182.A0r("image_versions2");
            AbstractC39101rj.A00(anonymousClass182, imageInfo.F5B());
        }
        String str = productImageContainerImpl.A01;
        if (str != null) {
            anonymousClass182.A0S("preview", str);
        }
        anonymousClass182.A0a();
    }
}
