package X;

import com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf;
import com.instagram.model.showreel.IgShowreelCompositionAssetType;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I4O {
    public static Map A00(IgShowreelCompositionAssetInfoIntf igShowreelCompositionAssetInfoIntf) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (igShowreelCompositionAssetInfoIntf.CBh() != null) {
            IgShowreelCompositionAssetType CBh = igShowreelCompositionAssetInfoIntf.CBh();
            if (CBh != null) {
                str = CBh.A00;
            } else {
                str = null;
            }
            AbstractC37300Gc1.A16(str, A1I);
        }
        if (igShowreelCompositionAssetInfoIntf.getUrl() != null) {
            AbstractC37300Gc1.A13(igShowreelCompositionAssetInfoIntf.getUrl(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
