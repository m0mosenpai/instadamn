package X;

import com.instagram.api.schemas.CornerStyle;
import com.instagram.model.androidlink.AndroidLinkImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102654jz {
    public static C102664k1 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            CornerStyle cornerStyle = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("android_links".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AndroidLinkImpl parseFromJson = AbstractC87683va.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("corner_style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    cornerStyle = (CornerStyle) CornerStyle.A01.get(A1P);
                    if (cornerStyle == null) {
                        cornerStyle = CornerStyle.A07;
                    }
                } else if ("ios_links".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AndroidLinkImpl parseFromJson2 = AbstractC87683va.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("links".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AndroidLinkImpl parseFromJson3 = AbstractC87683va.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("product".equals(A0q)) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                } else if ("product_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C102664k1(cornerStyle, productDetailsProductItemDict, str, arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
