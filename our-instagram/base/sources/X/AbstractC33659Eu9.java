package X;

import com.instagram.api.schemas.ActionButtonPartnerType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Eu9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33659Eu9 {
    public static Map A00(InterfaceC111194zh interfaceC111194zh) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC111194zh.AcH() != null) {
            A1I.put("app_id", interfaceC111194zh.AcH());
        }
        if (interfaceC111194zh.AcL() != null) {
            A1I.put("app_logo_url", interfaceC111194zh.AcL());
        }
        if (interfaceC111194zh.Aj3() != null) {
            A1I.put("button_label", interfaceC111194zh.Aj3());
        }
        if (interfaceC111194zh.Amd() != null) {
            A1I.put("category_type", interfaceC111194zh.Amd());
        }
        if (interfaceC111194zh.AyS() != null) {
            A1I.put(AbstractC58317Pt9.A00(96), interfaceC111194zh.AyS());
        }
        if (interfaceC111194zh.Bba() != null) {
            A1I.put("partner_name", interfaceC111194zh.Bba());
        }
        if (interfaceC111194zh.Bbb() != null) {
            ActionButtonPartnerType Bbb = interfaceC111194zh.Bbb();
            C14360o3.A0B(Bbb, 0);
            A1I.put(AbstractC58317Pt9.A00(900), Bbb.A00);
        }
        if (interfaceC111194zh.getUrl() != null) {
            A1I.put("url", interfaceC111194zh.getUrl());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
