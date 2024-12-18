package X;

import com.instagram.api.schemas.ColorAtTextRangeDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hll, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39837Hll {
    public static Map A00(ColorAtTextRangeDictIntf colorAtTextRangeDictIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (colorAtTextRangeDictIntf.BDa() != null) {
            A1I.put(AbstractC58317Pt9.A00(105), colorAtTextRangeDictIntf.BDa());
        }
        if (colorAtTextRangeDictIntf.BDb() != null) {
            A1I.put(AbstractC58317Pt9.A00(106), colorAtTextRangeDictIntf.BDb());
        }
        if (colorAtTextRangeDictIntf.BN2() != null) {
            A1I.put("length", colorAtTextRangeDictIntf.BN2());
        }
        if (colorAtTextRangeDictIntf.BYa() != null) {
            A1I.put("offset", colorAtTextRangeDictIntf.BYa());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
