package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.I2u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40714I2u {
    public static Map A00(InterfaceC37931pa interfaceC37931pa) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC37931pa.AgP() != null) {
            A1I.put("bloks_app_id", interfaceC37931pa.AgP());
        }
        if (interfaceC37931pa.Ata() != null) {
            A1I.put("cta_button_text", interfaceC37931pa.Ata());
        }
        if (interfaceC37931pa.Atn() != null) {
            A1I.put("cta_style", interfaceC37931pa.Atn());
        }
        interfaceC37931pa.getDuration();
        A1I.put("duration", Integer.valueOf(interfaceC37931pa.getDuration()));
        interfaceC37931pa.B7p();
        A1I.put("force_isolate_cta_button", Boolean.valueOf(interfaceC37931pa.B7p()));
        if (interfaceC37931pa.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC37931pa.getId(), A1I);
        }
        interfaceC37931pa.CS6();
        A1I.put("is_cta_button_enabled", Boolean.valueOf(interfaceC37931pa.CS6()));
        if (interfaceC37931pa.Bbj() != null) {
            A1I.put("payload", interfaceC37931pa.Bbj());
        }
        if (interfaceC37931pa.getTitle() != null) {
            AbstractC37300Gc1.A17(interfaceC37931pa.getTitle(), A1I);
        }
        if (interfaceC37931pa.CAR() != null) {
            A1I.put("tracking_token", interfaceC37931pa.CAR());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
