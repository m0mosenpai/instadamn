package X;

import com.instagram.api.schemas.RingSpecPoint;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hsj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40220Hsj {
    public static Map A00(RingSpecPoint ringSpecPoint) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ringSpecPoint.CI0();
        A1I.put("x", AbstractC166997dE.A0e(ringSpecPoint.CI0()));
        ringSpecPoint.CIZ();
        return AbstractC37301Gc2.A0r("y", AbstractC166997dE.A0e(ringSpecPoint.CIZ()), A1I);
    }
}
