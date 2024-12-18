package X;

import com.instagram.api.schemas.TIFUAppDestinationEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDY {
    public static Map A00(InterfaceC99464dK interfaceC99464dK) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC99464dK.BL4() != null) {
            TIFUAppDestinationEnum BL4 = interfaceC99464dK.BL4();
            if (BL4 != null) {
                str = BL4.A00;
            } else {
                str = null;
            }
            A1I.put(AbstractC111324zv.A00(4809), str);
        }
        if (interfaceC99464dK.getUrl() != null) {
            A1I.put("url", interfaceC99464dK.getUrl());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
