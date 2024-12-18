package X;

import com.instagram.api.schemas.AppreciationUFIEntryActionType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HkH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39745HkH {
    public static Map A00(InterfaceC116735Qc interfaceC116735Qc) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC116735Qc.AYg() != null) {
            AppreciationUFIEntryActionType AYg = interfaceC116735Qc.AYg();
            C14360o3.A0B(AYg, 0);
            A1I.put("action_type", AYg.A00);
        }
        interfaceC116735Qc.B9q();
        return AbstractC37301Gc2.A0r("gift_count", Integer.valueOf(interfaceC116735Qc.B9q()), A1I);
    }
}
