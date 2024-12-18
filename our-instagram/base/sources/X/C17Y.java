package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.17Y, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C17Y {
    public static ExtendedImageUrl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Long l = null;
            ExtendedImageUrl extendedImageUrl = null;
            Integer num = null;
            Integer num2 = null;
            String str2 = null;
            ArrayList arrayList = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("url_expiration_timestamp_us".equals(A0q)) {
                    if (c16l.A11() == C16R.A0I) {
                        l = Long.valueOf(c16l.A0y());
                    } else {
                        l = null;
                    }
                } else if ("fallback".equals(A0q)) {
                    extendedImageUrl = parseFromJson(c16l);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("scans_profile".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("estimated_scans_sizes".equals(A0q)) {
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
                } else if ("color_preview_hex".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null) {
                return null;
            }
            ExtendedImageUrl extendedImageUrl2 = new ExtendedImageUrl(extendedImageUrl, num, num2, l, str, str2, str3, arrayList);
            extendedImageUrl2.A01();
            return extendedImageUrl2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ExtendedImageUrl extendedImageUrl) {
        anonymousClass182.A0d();
        String str = extendedImageUrl.A0A;
        if (str != null) {
            anonymousClass182.A0S("url", str);
        }
        Long l = extendedImageUrl.A05;
        if (l != null) {
            anonymousClass182.A0R("url_expiration_timestamp_us", l.longValue());
        }
        ExtendedImageUrl extendedImageUrl2 = extendedImageUrl.A01;
        if (extendedImageUrl2 != null) {
            anonymousClass182.A0r("fallback");
            A00(anonymousClass182, extendedImageUrl2);
        }
        Integer num = extendedImageUrl.A04;
        if (num != null) {
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, num.intValue());
        }
        Integer num2 = extendedImageUrl.A03;
        if (num2 != null) {
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, num2.intValue());
        }
        String str2 = extendedImageUrl.A07;
        if (str2 != null) {
            anonymousClass182.A0S("scans_profile", str2);
        }
        if (extendedImageUrl.A08 != null) {
            C16V.A03(anonymousClass182, "estimated_scans_sizes");
            for (Number number : extendedImageUrl.A08) {
                if (number != null) {
                    anonymousClass182.A0h(number.intValue());
                }
            }
            anonymousClass182.A0Z();
        }
        String str3 = extendedImageUrl.A06;
        if (str3 != null) {
            anonymousClass182.A0S("color_preview_hex", str3);
        }
        anonymousClass182.A0a();
    }
}
