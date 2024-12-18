package X;

import com.instagram.api.schemas.AppstoreMetadataDictImpl;
import com.instagram.api.schemas.IGAdScreenshotURLDataDict;
import com.instagram.api.schemas.IGAdScreenshotURLDataDictImpl;
import com.instagram.api.schemas.IGProjectPortalInfoDict;
import com.instagram.api.schemas.IGProjectPortalInfoDictImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3vj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87753vj {
    public static AppstoreMetadataDictImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f = null;
            String str = null;
            Integer num = null;
            String str2 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("average_rating".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("install_count".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("num_reviews".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("num_reviews_human_readable".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("screenshots".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            IGAdScreenshotURLDataDictImpl parseFromJson = Ho4.parseFromJson(c16l);
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
            return new AppstoreMetadataDictImpl(f, num, str, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, AppstoreMetadataDictImpl appstoreMetadataDictImpl) {
        anonymousClass182.A0d();
        Float f = appstoreMetadataDictImpl.A00;
        if (f != null) {
            anonymousClass182.A0P("average_rating", f.floatValue());
        }
        String str = appstoreMetadataDictImpl.A02;
        if (str != null) {
            anonymousClass182.A0S("install_count", str);
        }
        Integer num = appstoreMetadataDictImpl.A01;
        if (num != null) {
            anonymousClass182.A0Q("num_reviews", num.intValue());
        }
        String str2 = appstoreMetadataDictImpl.A03;
        if (str2 != null) {
            anonymousClass182.A0S("num_reviews_human_readable", str2);
        }
        List<IGAdScreenshotURLDataDict> list = appstoreMetadataDictImpl.A04;
        if (list != null) {
            C16V.A03(anonymousClass182, "screenshots");
            for (IGAdScreenshotURLDataDict iGAdScreenshotURLDataDict : list) {
                if (iGAdScreenshotURLDataDict != null) {
                    IGAdScreenshotURLDataDictImpl EuL = iGAdScreenshotURLDataDict.EuL();
                    anonymousClass182.A0d();
                    String str3 = EuL.A03;
                    if (str3 != null) {
                        anonymousClass182.A0S("dominant_color", str3);
                    }
                    Integer num2 = EuL.A01;
                    if (num2 != null) {
                        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, num2.intValue());
                    }
                    IGProjectPortalInfoDict iGProjectPortalInfoDict = EuL.A00;
                    if (iGProjectPortalInfoDict != null) {
                        anonymousClass182.A0r("media_background");
                        IGProjectPortalInfoDictImpl EvQ = iGProjectPortalInfoDict.EvQ();
                        anonymousClass182.A0d();
                        String str4 = EvQ.A00;
                        if (str4 != null) {
                            anonymousClass182.A0S("bottomColor", str4);
                        }
                        String str5 = EvQ.A01;
                        if (str5 != null) {
                            anonymousClass182.A0S("captionBackgroundColor", str5);
                        }
                        String str6 = EvQ.A02;
                        if (str6 != null) {
                            anonymousClass182.A0S("captionBackgroundColorAlpha", str6);
                        }
                        String str7 = EvQ.A03;
                        if (str7 != null) {
                            anonymousClass182.A0S("captionColor", str7);
                        }
                        String str8 = EvQ.A04;
                        if (str8 != null) {
                            anonymousClass182.A0S("templateId", str8);
                        }
                        String str9 = EvQ.A05;
                        if (str9 != null) {
                            anonymousClass182.A0S("topColor", str9);
                        }
                        anonymousClass182.A0a();
                    }
                    String str10 = EuL.A04;
                    if (str10 != null) {
                        anonymousClass182.A0S("url", str10);
                    }
                    Integer num3 = EuL.A02;
                    if (num3 != null) {
                        anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, num3.intValue());
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
