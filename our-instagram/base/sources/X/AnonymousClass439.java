package X;

import com.instagram.api.schemas.GrowthFrictionInfoImpl;
import com.instagram.api.schemas.GrowthFrictionInterventionCategoriesImpl;
import java.io.IOException;

/* renamed from: X.439, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass439 {
    public static GrowthFrictionInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            GrowthFrictionInterventionCategoriesImpl growthFrictionInterventionCategoriesImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("has_active_interventions".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("interventions".equals(A0q)) {
                    growthFrictionInterventionCategoriesImpl = C43A.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("has_active_interventions", "GrowthFrictionInfoImpl");
                throw C00O.createAndThrow();
            }
            return new GrowthFrictionInfoImpl(growthFrictionInterventionCategoriesImpl, bool.booleanValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
