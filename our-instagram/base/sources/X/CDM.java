package X;

import com.instagram.api.schemas.MoreInfoFacepilePositionType;
import com.instagram.api.schemas.MoreInfoFacepileSizeType;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDM {
    public static Map A00(InterfaceC107094sC interfaceC107094sC) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str2 = null;
        if (interfaceC107094sC.Beb() != null) {
            MoreInfoFacepilePositionType Beb = interfaceC107094sC.Beb();
            if (Beb != null) {
                str = Beb.A00;
            } else {
                str = null;
            }
            A1I.put("position", str);
        }
        if (interfaceC107094sC.BxZ() != null) {
            MoreInfoFacepileSizeType BxZ = interfaceC107094sC.BxZ();
            if (BxZ != null) {
                str2 = BxZ.A00;
            }
            A1I.put("size", str2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
