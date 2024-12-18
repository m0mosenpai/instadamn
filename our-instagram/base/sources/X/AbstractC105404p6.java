package X;

import com.instagram.model.showreel.IgShowreelCompositionAssetInfo;
import com.instagram.model.showreel.IgShowreelCompositionImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4p6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC105404p6 {
    public static IgShowreelCompositionImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("assets_info".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            IgShowreelCompositionAssetInfo parseFromJson = AbstractC105414p7.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("client_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("content".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("template_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("client_name", "IgShowreelCompositionImpl");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (str3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("template_name", "IgShowreelCompositionImpl");
                } else {
                    return new IgShowreelCompositionImpl(str, str2, str3, arrayList);
                }
            } else {
                ((C07950bF) c16l).A03.A00("content", "IgShowreelCompositionImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, IgShowreelCompositionImpl igShowreelCompositionImpl) {
        anonymousClass182.A0d();
        List<IgShowreelCompositionAssetInfo> list = igShowreelCompositionImpl.A03;
        if (list != null) {
            C16V.A03(anonymousClass182, "assets_info");
            for (IgShowreelCompositionAssetInfo igShowreelCompositionAssetInfo : list) {
                if (igShowreelCompositionAssetInfo != null) {
                    AbstractC105414p7.A00(anonymousClass182, igShowreelCompositionAssetInfo);
                }
            }
            anonymousClass182.A0Z();
        }
        String str = igShowreelCompositionImpl.A00;
        if (str != null) {
            anonymousClass182.A0S("client_name", str);
        }
        String str2 = igShowreelCompositionImpl.A01;
        if (str2 != null) {
            anonymousClass182.A0S("content", str2);
        }
        String str3 = igShowreelCompositionImpl.A02;
        if (str3 != null) {
            anonymousClass182.A0S("template_name", str3);
        }
        anonymousClass182.A0a();
    }
}
