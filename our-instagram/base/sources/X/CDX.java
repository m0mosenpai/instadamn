package X;

import com.instagram.api.schemas.SponsoredAdsDisclaimerType;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDX {
    public static Map A00(InterfaceC104974oC interfaceC104974oC) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC104974oC.Ah4() != null) {
            A1I.put("bold_style_text", interfaceC104974oC.Ah4());
        }
        interfaceC104974oC.BBF();
        A1I.put("has_bold_style_text", Boolean.valueOf(interfaceC104974oC.BBF()));
        if (interfaceC104974oC.BKx() != null) {
            A1I.put("label", interfaceC104974oC.BKx());
        }
        if (interfaceC104974oC.BL1() != null) {
            SponsoredAdsDisclaimerType BL1 = interfaceC104974oC.BL1();
            C14360o3.A0B(BL1, 0);
            A1I.put("label_type", BL1.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
