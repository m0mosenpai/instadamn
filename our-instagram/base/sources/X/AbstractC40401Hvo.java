package X;

import com.instagram.api.schemas.TextEntityType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hvo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40401Hvo {
    public static Map A00(InterfaceC43543JLd interfaceC43543JLd) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43543JLd.Ayb() != null) {
            A1I.put("display_text", interfaceC43543JLd.Ayb());
        }
        if (interfaceC43543JLd.B2K() != null) {
            TextEntityType B2K = interfaceC43543JLd.B2K();
            C14360o3.A0B(B2K, 0);
            A1I.put("entity_type", B2K.A00);
        }
        if (interfaceC43543JLd.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC43543JLd.getId(), A1I);
        }
        if (interfaceC43543JLd.getUrl() != null) {
            AbstractC37300Gc1.A13(interfaceC43543JLd.getUrl(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
