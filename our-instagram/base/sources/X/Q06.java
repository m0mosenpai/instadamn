package X;

import android.util.JsonReader;
import android.util.Pair;
import java.io.StringReader;
import java.util.List;

/* loaded from: classes10.dex */
public final class Q06 {
    public List A00;

    public static Pair A00(InterfaceC102764kD interfaceC102764kD) {
        String str;
        Integer E3x = interfaceC102764kD.E3x();
        if (E3x != C05F.A0j) {
            if (E3x != null) {
                str = AbstractC62263S4i.A00(E3x);
            } else {
                str = "null";
            }
            AbstractC25241Le.A02(AnonymousClass001.A0R("Expected string while parsing string-encoded component payload, got ", str), "BloksComponentQueryPayload");
            return null;
        }
        String Ep1 = interfaceC102764kD.E3y().Ep1();
        C192928gY c192928gY = new C192928gY(new JsonReader(new StringReader(Ep1)));
        c192928gY.Csy();
        return new Pair(Ep1, Q05.A00(c192928gY));
    }
}
