package X;

import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDictImpl;
import com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDictImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hny, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39969Hny {
    public static IGAdCreationOptimizationPayloadDictImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                if ("adCreativeOptimizationConfigByType".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            IGAdCreativeOptimizationConfigByTypeDictImpl parseFromJson = Ho0.parseFromJson(c16l);
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
            return new IGAdCreationOptimizationPayloadDictImpl(arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}