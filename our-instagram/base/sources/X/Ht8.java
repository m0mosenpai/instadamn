package X;

import com.instagram.api.schemas.ShowreelNativeClientName;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class Ht8 {
    public static Map A00(C69N c69n) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c69n.Abu() != null) {
            A1I.put("animation_payload", c69n.Abu());
        }
        if (c69n.Acx() != null) {
            A1I.put("assets", c69n.Acx());
        }
        if (c69n.Acz() != null) {
            List<JLX> Acz = c69n.Acz();
            ArrayList arrayList = null;
            if (Acz != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JLX jlx : Acz) {
                    if (jlx != null) {
                        arrayList.add(jlx.F7o());
                    }
                }
            }
            A1I.put("assets_info", arrayList);
        }
        if (c69n.Any() != null) {
            ShowreelNativeClientName Any = c69n.Any();
            C14360o3.A0B(Any, 0);
            A1I.put("client_name", Any.A00);
        }
        if (c69n.Aqq() != null) {
            A1I.put("content", c69n.Aqq());
        }
        if (c69n.BDS() != null) {
            A1I.put(IgReactMediaPickerNativeModule.HEIGHT, c69n.BDS());
        }
        if (c69n.BOt() != null) {
            A1I.put("logging_info", c69n.BOt());
        }
        if (c69n.C5i() != null) {
            A1I.put("template_name", c69n.C5i());
        }
        if (c69n.CHg() != null) {
            A1I.put(IgReactMediaPickerNativeModule.WIDTH, c69n.CHg());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
