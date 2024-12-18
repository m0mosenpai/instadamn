package X;

import com.facebook.location.platform.api.Location;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Evt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33767Evt {
    public static Map A00(InterfaceC37278GbV interfaceC37278GbV) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC37278GbV.AZj() != null) {
            A1I.put("additional_business_address_id", interfaceC37278GbV.AZj());
        }
        if (interfaceC37278GbV.AZq() != null) {
            A1I.put("address_street", interfaceC37278GbV.AZq());
        }
        if (interfaceC37278GbV.Anh() != null) {
            A1I.put("city_id", interfaceC37278GbV.Anh());
        }
        if (interfaceC37278GbV.Ani() != null) {
            A1I.put("city_name", interfaceC37278GbV.Ani());
        }
        if (interfaceC37278GbV.BIO() != null) {
            A1I.put(AbstractC58317Pt9.A00(291), interfaceC37278GbV.BIO());
        }
        if (interfaceC37278GbV.BMH() != null) {
            A1I.put(Location.LATITUDE, AnonymousClass010.A0m(String.valueOf(interfaceC37278GbV.BMH())));
        }
        if (interfaceC37278GbV.BPG() != null) {
            A1I.put("longitude", AnonymousClass010.A0m(String.valueOf(interfaceC37278GbV.BPG())));
        }
        if (interfaceC37278GbV.CIl() != null) {
            A1I.put("zip_code", interfaceC37278GbV.CIl());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
