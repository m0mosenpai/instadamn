package X;

import com.instagram.api.schemas.OriginalitySourceMediaInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hqx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40130Hqx {
    public static Map A00(OriginalitySourceMediaInfo originalitySourceMediaInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (originalitySourceMediaInfo.getPk() != null) {
            A1I.put("pk", originalitySourceMediaInfo.getPk());
        }
        AbstractC37302Gc3.A1T(originalitySourceMediaInfo.CDj(), A1I);
        return AbstractC06930Yk.A0B(A1I);
    }
}
