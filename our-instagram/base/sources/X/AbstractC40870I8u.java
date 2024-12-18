package X;

import com.instagram.api.schemas.ProductTaggingFeedComponentType;
import java.io.IOException;

/* renamed from: X.I8u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40870I8u {
    public static C38619GyM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38619GyM c38619GyM = new C38619GyM();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(194).equals(A0s)) {
                    ProductTaggingFeedComponentType productTaggingFeedComponentType = (ProductTaggingFeedComponentType) ProductTaggingFeedComponentType.A01.get(AbstractC167017dG.A0m(c16l));
                    if (productTaggingFeedComponentType == null) {
                        productTaggingFeedComponentType = ProductTaggingFeedComponentType.A0A;
                    }
                    c38619GyM.A02 = productTaggingFeedComponentType;
                } else if ("component_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c38619GyM.A03 = A0m;
                } else if ("section_num".equals(A0s)) {
                    c38619GyM.A00 = c16l.A1D();
                } else if ("meta".equals(A0s)) {
                    C38684GzP parseFromJson = AbstractC40869I8t.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c38619GyM.A01 = parseFromJson;
                }
                c16l.A0z();
            }
            return c38619GyM;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
