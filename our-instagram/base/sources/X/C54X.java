package X;

import com.instagram.common.typedurl.GifUrlLoggingExtras;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.54X, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C54X {
    /* JADX WARN: Type inference failed for: r4v0, types: [com.instagram.model.mediasize.GifUrlImpl, java.lang.Object] */
    public static GifUrlImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    obj.A03 = new Float(c16l.A0U());
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    obj.A02 = new Float(c16l.A0U());
                } else {
                    Long l = null;
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    if ("url".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        obj.A09 = str;
                    } else if ("webp".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        obj.A0A = str2;
                    } else if ("mp4".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        obj.A08 = str3;
                    } else if ("url_expiration_timestamp_us".equals(A0q)) {
                        if (c16l.A11() == C16R.A0I) {
                            l = Long.valueOf(c16l.A0y());
                        }
                        obj.A07 = l;
                    } else if ("url_fallback".equals(A0q)) {
                        obj.A01 = parseFromJson(c16l);
                    } else if ("logging_extras".equals(A0q)) {
                        obj.A00 = AbstractC46672Kkp.parseFromJson(c16l);
                    } else if ("size".equals(A0q)) {
                        obj.A05 = Integer.valueOf(c16l.A1D());
                    } else if ("webp_size".equals(A0q)) {
                        obj.A06 = Integer.valueOf(c16l.A1D());
                    } else if ("mp4_size".equals(A0q)) {
                        obj.A04 = Integer.valueOf(c16l.A1D());
                    }
                }
                c16l.A0z();
            }
            if (obj.A09 == null) {
                obj.A09 = "";
                boolean z = true;
                boolean z2 = false;
                if (obj.A0A == null) {
                    z2 = true;
                }
                if (obj.A08 != null) {
                    z = false;
                }
                C0w9.A03("GifUrlImpl", AnonymousClass001.A1C("url is null, isWebpUrlNull = ", ", isMp4UrlNull = ", z2, z));
            }
            GifUrlImpl gifUrlImpl = obj.A01;
            if (gifUrlImpl != null) {
                if (gifUrlImpl.A02 == null) {
                    gifUrlImpl.A02 = obj.A02;
                }
                if (gifUrlImpl.A03 == null) {
                    gifUrlImpl.A03 = obj.A03;
                    return obj;
                }
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, GifUrlImpl gifUrlImpl) {
        anonymousClass182.A0d();
        Float f = gifUrlImpl.A03;
        if (f != null) {
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, f.floatValue());
        }
        Float f2 = gifUrlImpl.A02;
        if (f2 != null) {
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, f2.floatValue());
        }
        String str = gifUrlImpl.A09;
        if (str != null) {
            anonymousClass182.A0S("url", str);
        }
        String str2 = gifUrlImpl.A0A;
        if (str2 != null) {
            anonymousClass182.A0S("webp", str2);
        }
        String str3 = gifUrlImpl.A08;
        if (str3 != null) {
            anonymousClass182.A0S("mp4", str3);
        }
        Long l = gifUrlImpl.A07;
        if (l != null) {
            anonymousClass182.A0R("url_expiration_timestamp_us", l.longValue());
        }
        if (gifUrlImpl.A01 != null) {
            anonymousClass182.A0r("url_fallback");
            A00(anonymousClass182, gifUrlImpl.A01);
        }
        if (gifUrlImpl.A00 != null) {
            anonymousClass182.A0r("logging_extras");
            GifUrlLoggingExtras gifUrlLoggingExtras = gifUrlImpl.A00;
            anonymousClass182.A0d();
            Long l2 = gifUrlLoggingExtras.A00;
            if (l2 != null) {
                anonymousClass182.A0R("a_pk", l2.longValue());
            }
            String str4 = gifUrlLoggingExtras.A01;
            if (str4 != null) {
                anonymousClass182.A0S("m_pk", str4);
            }
            String str5 = gifUrlLoggingExtras.A02;
            if (str5 != null) {
                anonymousClass182.A0S("tracking_token", str5);
            }
            anonymousClass182.A0a();
        }
        Integer num = gifUrlImpl.A05;
        if (num != null) {
            anonymousClass182.A0Q("size", num.intValue());
        }
        Integer num2 = gifUrlImpl.A06;
        if (num2 != null) {
            anonymousClass182.A0Q("webp_size", num2.intValue());
        }
        Integer num3 = gifUrlImpl.A04;
        if (num3 != null) {
            anonymousClass182.A0Q("mp4_size", num3.intValue());
        }
        anonymousClass182.A0a();
    }
}
