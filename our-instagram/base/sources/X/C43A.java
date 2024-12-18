package X;

import com.instagram.api.schemas.GrowthFrictionInterventionCategoriesImpl;
import com.instagram.api.schemas.GrowthFrictionInterventionDetailImpl;
import java.io.IOException;

/* renamed from: X.43A, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C43A {
    public static GrowthFrictionInterventionCategoriesImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl2 = null;
            GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("follow".equals(A0q)) {
                    growthFrictionInterventionDetailImpl = IOK.parseFromJson(c16l);
                } else if ("mention".equals(A0q)) {
                    growthFrictionInterventionDetailImpl2 = IOK.parseFromJson(c16l);
                } else if ("tag".equals(A0q)) {
                    growthFrictionInterventionDetailImpl3 = IOK.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new GrowthFrictionInterventionCategoriesImpl(growthFrictionInterventionDetailImpl, growthFrictionInterventionDetailImpl2, growthFrictionInterventionDetailImpl3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
