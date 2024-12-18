package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.I2h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40701I2h {
    public static Map A00(InterfaceC130575v2 interfaceC130575v2) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC130575v2.getHeight();
        A1I.put(IgReactMediaPickerNativeModule.HEIGHT, Integer.valueOf(interfaceC130575v2.getHeight()));
        if (interfaceC130575v2.getScansProfile() != null) {
            A1I.put(AbstractC111324zv.A00(5248), interfaceC130575v2.getScansProfile());
        }
        if (interfaceC130575v2.getUrl() != null) {
            AbstractC37300Gc1.A13(interfaceC130575v2.getUrl(), A1I);
        }
        interfaceC130575v2.getWidth();
        return AbstractC37301Gc2.A0r(IgReactMediaPickerNativeModule.WIDTH, Integer.valueOf(interfaceC130575v2.getWidth()), A1I);
    }
}
