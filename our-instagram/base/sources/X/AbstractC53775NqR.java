package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.NqR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC53775NqR {
    public static Map A00(InterfaceC84473pq interfaceC84473pq) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC84473pq.BF4();
        A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(interfaceC84473pq.BF4()));
        interfaceC84473pq.BJL();
        A1I.put("inventory_quantity", Long.valueOf(interfaceC84473pq.BJL()));
        interfaceC84473pq.CQc();
        A1I.put("is_bip_order", Boolean.valueOf(interfaceC84473pq.CQc()));
        interfaceC84473pq.Bg9();
        A1I.put("price_amount", Long.valueOf(interfaceC84473pq.Bg9()));
        if (interfaceC84473pq.BgA() != null) {
            A1I.put("price_currency", interfaceC84473pq.BgA());
        }
        if (interfaceC84473pq.BhQ() != null) {
            A1I.put("product_variants", interfaceC84473pq.BhQ());
        }
        if (interfaceC84473pq.getTitle() != null) {
            A1I.put(DialogModule.KEY_TITLE, interfaceC84473pq.getTitle());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
