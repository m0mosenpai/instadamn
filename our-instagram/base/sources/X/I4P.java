package X;

import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.model.showreelnative.IgShowreelNativeAsset;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I4P {
    public static Map A00(IgShowreelNativeAnimationIntf igShowreelNativeAnimationIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (igShowreelNativeAnimationIntf.Abu() != null) {
            A1I.put("animation_payload", igShowreelNativeAnimationIntf.Abu());
        }
        if (igShowreelNativeAnimationIntf.Acx() != null) {
            A1I.put("assets", igShowreelNativeAnimationIntf.Acx());
        }
        if (igShowreelNativeAnimationIntf.Acz() != null) {
            List<IgShowreelNativeAsset> Acz = igShowreelNativeAnimationIntf.Acz();
            ArrayList arrayList = null;
            if (Acz != null) {
                arrayList = AbstractC166987dD.A1E();
                for (IgShowreelNativeAsset igShowreelNativeAsset : Acz) {
                    if (igShowreelNativeAsset != null) {
                        arrayList.add(igShowreelNativeAsset.F7o());
                    }
                }
            }
            A1I.put("assets_info", arrayList);
        }
        if (igShowreelNativeAnimationIntf.Anz() != null) {
            A1I.put("client_name", igShowreelNativeAnimationIntf.Anz());
        }
        if (igShowreelNativeAnimationIntf.Aqq() != null) {
            A1I.put("content", igShowreelNativeAnimationIntf.Aqq());
        }
        if (igShowreelNativeAnimationIntf.BDS() != null) {
            A1I.put(IgReactMediaPickerNativeModule.HEIGHT, igShowreelNativeAnimationIntf.BDS());
        }
        if (igShowreelNativeAnimationIntf.C5i() != null) {
            A1I.put("template_name", igShowreelNativeAnimationIntf.C5i());
        }
        if (igShowreelNativeAnimationIntf.CHg() != null) {
            A1I.put(IgReactMediaPickerNativeModule.WIDTH, igShowreelNativeAnimationIntf.CHg());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
