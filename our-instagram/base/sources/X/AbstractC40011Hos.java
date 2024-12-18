package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hos, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40011Hos {
    public static Map A00(InterfaceC104884nz interfaceC104884nz) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC104884nz.getCategory() != null) {
            A1I.put("category", interfaceC104884nz.getCategory());
        }
        if (interfaceC104884nz.BIk() != null) {
            A1I.put("integration_point_id", interfaceC104884nz.BIk());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
