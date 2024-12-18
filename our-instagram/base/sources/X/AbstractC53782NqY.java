package X;

import com.instagram.api.schemas.LiveUserPaySupportTier;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.NqY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC53782NqY {
    public static Map A00(InterfaceC109734x0 interfaceC109734x0) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC109734x0.AxQ();
        A1I.put("digital_product_id", Long.valueOf(interfaceC109734x0.AxQ()));
        if (interfaceC109734x0.Bxk() != null) {
            A1I.put("sku", interfaceC109734x0.Bxk());
        }
        if (interfaceC109734x0.C4A() != null) {
            LiveUserPaySupportTier C4A = interfaceC109734x0.C4A();
            C14360o3.A0B(C4A, 0);
            A1I.put("support_tier", C4A.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
