package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EvO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33736EvO {
    public static Map A00(InterfaceC38531qh interfaceC38531qh) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC38531qh.BGt() != null) {
            ImageUrl BGt = interfaceC38531qh.BGt();
            if (BGt != null) {
                str = BGt.getUrl();
            } else {
                str = null;
            }
            A1I.put("image_url", str);
        }
        if (interfaceC38531qh.getText() != null) {
            A1I.put("text", interfaceC38531qh.getText());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
