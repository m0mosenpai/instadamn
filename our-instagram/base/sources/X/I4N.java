package X;

import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I4N {
    public static Map A00(IgShowreelComposition igShowreelComposition) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (igShowreelComposition.Acz() != null) {
            List<IgShowreelCompositionAssetInfoIntf> Acz = igShowreelComposition.Acz();
            ArrayList arrayList = null;
            if (Acz != null) {
                arrayList = AbstractC166987dD.A1E();
                for (IgShowreelCompositionAssetInfoIntf igShowreelCompositionAssetInfoIntf : Acz) {
                    if (igShowreelCompositionAssetInfoIntf != null) {
                        arrayList.add(igShowreelCompositionAssetInfoIntf.F7o());
                    }
                }
            }
            A1I.put("assets_info", arrayList);
        }
        if (igShowreelComposition.Anz() != null) {
            A1I.put("client_name", igShowreelComposition.Anz());
        }
        if (igShowreelComposition.Aqq() != null) {
            A1I.put("content", igShowreelComposition.Aqq());
        }
        if (igShowreelComposition.C5i() != null) {
            A1I.put("template_name", igShowreelComposition.C5i());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
