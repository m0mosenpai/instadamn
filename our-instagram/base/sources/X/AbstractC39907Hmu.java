package X;

import com.instagram.api.schemas.Entity;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hmu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39907Hmu {
    public static Map A00(Entity entity) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (entity.getId() != null) {
            AbstractC37300Gc1.A12(entity.getId(), A1I);
        }
        if (entity.CBy() != null) {
            A1I.put("typename", entity.CBy());
        }
        if (entity.getUrl() != null) {
            AbstractC37300Gc1.A13(entity.getUrl(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
