package X;

import com.instagram.api.schemas.InlineStyleAtRangeDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HpH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40030HpH {
    public static Map A00(InlineStyleAtRangeDictIntf inlineStyleAtRangeDictIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (inlineStyleAtRangeDictIntf.BHr() != null) {
            A1I.put(AbstractC58317Pt9.A00(110), inlineStyleAtRangeDictIntf.BHr());
        }
        if (inlineStyleAtRangeDictIntf.BN2() != null) {
            A1I.put("length", inlineStyleAtRangeDictIntf.BN2());
        }
        if (inlineStyleAtRangeDictIntf.BYa() != null) {
            A1I.put("offset", inlineStyleAtRangeDictIntf.BYa());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
