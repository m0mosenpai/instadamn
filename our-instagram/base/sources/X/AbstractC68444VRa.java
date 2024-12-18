package X;

import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromotionMetric;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VRa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68444VRa {
    public static C70653WeZ parseFromJson(C16L c16l) {
        String A1P;
        InstagramMediaProductType instagramMediaProductType;
        C14360o3.A0B(c16l, 0);
        try {
            C70653WeZ c70653WeZ = new C70653WeZ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("draft_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c70653WeZ.A06 = A0m;
                } else if ("organic_media_igid".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c70653WeZ.A0A = A0m2;
                } else if ("organic_media_fbid".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c70653WeZ.A09 = A0m3;
                } else if ("thumbnail_url".equals(A0s)) {
                    SimpleImageUrl A00 = AbstractC222616c.A00(c16l);
                    C14360o3.A0B(A00, 0);
                    c70653WeZ.A04 = A00;
                } else if ("media_product_type".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    InstagramMediaProductType[] values = InstagramMediaProductType.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            instagramMediaProductType = values[i];
                            if (AbstractC002300n.A0g(instagramMediaProductType.toString(), A1Q, true)) {
                                break;
                            }
                            i++;
                        } else {
                            instagramMediaProductType = InstagramMediaProductType.A08;
                            break;
                        }
                    }
                    c70653WeZ.A02 = instagramMediaProductType;
                } else if ("instagram_positions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        ArrayList arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            arrayList2.add(AbstractC68362VNw.A00(A1P));
                        }
                        arrayList = arrayList2;
                    }
                    C14360o3.A0B(arrayList, 0);
                    c70653WeZ.A0C = arrayList;
                } else if ("political_ad_byline_text".equals(A0s)) {
                    c70653WeZ.A0B = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(945).equals(A0s)) {
                    c70653WeZ.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("formatted_spent_budget".equals(A0s)) {
                    c70653WeZ.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("destination".equals(A0s)) {
                    c70653WeZ.A01 = VPS.A00(AbstractC167017dG.A0m(c16l));
                } else if ("call_to_action".equals(A0s)) {
                    c70653WeZ.A00 = XIGIGBoostCallToAction.valueOf(c16l.A1Q());
                } else if ("regulated_categories".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            arrayList.add(AbstractC68456VRm.A00(c16l.A1Q()));
                        }
                    }
                    c70653WeZ.A0D = arrayList;
                } else if ("audience_id".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("audience_name".equals(A0s)) {
                    c70653WeZ.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("metric".equals(A0s)) {
                    PromotionMetric parseFromJson = AbstractC68451VRh.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c70653WeZ.A03 = parseFromJson;
                }
                c16l.A0z();
            }
            return c70653WeZ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
