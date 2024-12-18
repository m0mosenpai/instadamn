package X;

import com.instagram.api.schemas.UrpRendererType;
import com.instagram.model.showreel.IgShowreelCompositionAssetInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HwM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40431HwM {
    public static C38807H6x parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            UrpRendererType urpRendererType = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("asset_infos".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            IgShowreelCompositionAssetInfo parseFromJson = AbstractC105414p7.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("logging_info".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("renderer_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    urpRendererType = (UrpRendererType) UrpRendererType.A01.get(A1P);
                    if (urpRendererType == null) {
                        urpRendererType = UrpRendererType.A06;
                    }
                } else if ("rendering_spec".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("template_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (urpRendererType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("renderer_type", c16l, "UrpMediaComposition");
            } else if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("rendering_spec", c16l, "UrpMediaComposition");
            } else {
                return new C38807H6x(urpRendererType, str, str2, str3, arrayList);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
