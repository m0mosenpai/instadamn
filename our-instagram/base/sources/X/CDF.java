package X;

import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDF {
    public static Map A00(InterfaceC105994qD interfaceC105994qD) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC105994qD.BKx() != null) {
            A1I.put("label", interfaceC105994qD.BKx());
        }
        if (interfaceC105994qD.Bde() != null) {
            IGAdTransparencyDisclaimerPlacement Bde = interfaceC105994qD.Bde();
            if (Bde != null) {
                str = Bde.A00;
            } else {
                str = null;
            }
            A1I.put("placement", str);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
