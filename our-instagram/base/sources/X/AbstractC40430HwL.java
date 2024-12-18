package X;

import com.instagram.api.schemas.UrpRendererType;
import com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HwL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40430HwL {
    public static Map A00(InterfaceC43564JLy interfaceC43564JLy) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43564JLy.Acq() != null) {
            List<IgShowreelCompositionAssetInfoIntf> Acq = interfaceC43564JLy.Acq();
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
        if (interfaceC43564JLy.BOt() != null) {
            A1I.put("logging_info", interfaceC43564JLy.BOt());
        }
        if (interfaceC43564JLy.Bmq() != null) {
            UrpRendererType Bmq = interfaceC43564JLy.Bmq();
            C14360o3.A0B(Bmq, 0);
            A1I.put("renderer_type", Bmq.A00);
        }
        if (interfaceC43564JLy.Bmu() != null) {
            A1I.put("rendering_spec", interfaceC43564JLy.Bmu());
        }
        if (interfaceC43564JLy.C5f() != null) {
            A1I.put("template_id", interfaceC43564JLy.C5f());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
