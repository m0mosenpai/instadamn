package X;

import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.VideoVersion;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IRM {
    public static UpcomingEventMediaImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str2 = null;
            ProductImageContainerImpl productImageContainerImpl = null;
            ImageInfoImpl imageInfoImpl = null;
            String str3 = null;
            Double d = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("accessibility_caption".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("explore_pivot_grid".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("has_audio".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("image".equals(A0s)) {
                    productImageContainerImpl = AbstractC111144zV.parseFromJson(c16l);
                } else if ("image_versions2".equals(A0s)) {
                    imageInfoImpl = AbstractC39101rj.parseFromJson(c16l);
                } else if ("product_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("video_duration".equals(A0s)) {
                    d = Double.valueOf(c16l.A0U());
                } else if ("video_versions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            VideoVersion parseFromJson = AbstractC40001tP.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new UpcomingEventMediaImpl(imageInfoImpl, productImageContainerImpl, bool, bool2, d, str, str2, str3, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, UpcomingEventMediaImpl upcomingEventMediaImpl) {
        anonymousClass182.A0d();
        String str = upcomingEventMediaImpl.A05;
        if (str != null) {
            anonymousClass182.A0S("accessibility_caption", str);
        }
        Boolean bool = upcomingEventMediaImpl.A02;
        if (bool != null) {
            anonymousClass182.A0T("explore_pivot_grid", bool.booleanValue());
        }
        Boolean bool2 = upcomingEventMediaImpl.A03;
        if (bool2 != null) {
            anonymousClass182.A0T("has_audio", bool2.booleanValue());
        }
        AbstractC37301Gc2.A1D(anonymousClass182, upcomingEventMediaImpl.A06);
        ProductImageContainer productImageContainer = upcomingEventMediaImpl.A01;
        if (productImageContainer != null) {
            anonymousClass182.A0r("image");
            AbstractC111144zV.A00(anonymousClass182, productImageContainer.F6D());
        }
        AbstractC37303Gc4.A13(anonymousClass182, upcomingEventMediaImpl.A00);
        String str2 = upcomingEventMediaImpl.A07;
        if (str2 != null) {
            anonymousClass182.A0S("product_type", str2);
        }
        Double d = upcomingEventMediaImpl.A04;
        if (d != null) {
            anonymousClass182.A0O("video_duration", d.doubleValue());
        }
        List list = upcomingEventMediaImpl.A08;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "video_versions", list);
            while (A0q.hasNext()) {
                VideoVersion videoVersion = (VideoVersion) A0q.next();
                if (videoVersion != null) {
                    AbstractC40001tP.A00(anonymousClass182, videoVersion);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
