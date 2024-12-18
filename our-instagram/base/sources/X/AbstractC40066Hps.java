package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hps, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40066Hps {
    public static Map A00(InterfaceC38251qF interfaceC38251qF) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC38251qF.B3D();
        A1I.put("expiring_at", Long.valueOf(interfaceC38251qF.B3D()));
        if (interfaceC38251qF.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC38251qF.getId(), A1I);
        }
        if (interfaceC38251qF.BGx() != null) {
            A1I.put("image_versions2", interfaceC38251qF.BGx().F7o());
        }
        if (interfaceC38251qF.getMediaType() != null) {
            AbstractC37300Gc1.A19(interfaceC38251qF.getMediaType(), A1I);
        }
        if (interfaceC38251qF.getPreview() != null) {
            A1I.put("preview", interfaceC38251qF.getPreview());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
