package X;

import com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HtC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40246HtC {
    public static Map A00(JM9 jm9) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jm9.AZE() != null) {
            A1I.put("ad_id", jm9.AZE());
        }
        if (jm9.Acq() != null) {
            List<IgShowreelCompositionAssetInfoIntf> Acq = jm9.Acq();
            ArrayList arrayList = null;
            if (Acq != null) {
                arrayList = AbstractC166987dD.A1E();
                for (IgShowreelCompositionAssetInfoIntf igShowreelCompositionAssetInfoIntf : Acq) {
                    if (igShowreelCompositionAssetInfoIntf != null) {
                        arrayList.add(igShowreelCompositionAssetInfoIntf.F7o());
                    }
                }
            }
            A1I.put("asset_infos", arrayList);
        }
        if (jm9.Anz() != null) {
            A1I.put("client_name", jm9.Anz());
        }
        if (jm9.Bmr() != null) {
            A1I.put("renderer_type", jm9.Bmr());
        }
        if (jm9.Bmu() != null) {
            A1I.put("rendering_spec", jm9.Bmu());
        }
        if (jm9.C5f() != null) {
            A1I.put("template_id", jm9.C5f());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
