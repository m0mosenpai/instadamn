package X;

import com.instagram.api.schemas.GenAIPersonaBannerDictImpl;
import com.instagram.api.schemas.GenAIPersonaBannersResponseImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HnV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39940HnV {
    public static GenAIPersonaBannersResponseImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "banners")) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            GenAIPersonaBannerDictImpl parseFromJson = AbstractC39938HnT.parseFromJson(c16l);
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
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("banners", c16l, "GenAIPersonaBannersResponseImpl");
                throw C00O.createAndThrow();
            }
            return new GenAIPersonaBannersResponseImpl(arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
