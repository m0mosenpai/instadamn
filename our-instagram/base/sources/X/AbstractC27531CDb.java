package X;

import com.instagram.api.schemas.TextPostAppSuggestionCardProfileContextIdentifier;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CDb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC27531CDb {
    public static Map A00(InterfaceC1119953o interfaceC1119953o) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC1119953o.Aya() != null) {
            A1I.put(AbstractC111324zv.A00(900), interfaceC1119953o.Aya());
        }
        if (interfaceC1119953o.BFD() != null) {
            TextPostAppSuggestionCardProfileContextIdentifier BFD = interfaceC1119953o.BFD();
            C14360o3.A0B(BFD, 0);
            A1I.put("identifier", BFD.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
