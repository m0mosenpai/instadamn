package X;

import com.instagram.api.schemas.AssetRecommendationType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HlL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39811HlL {
    public static Map A00(InterfaceC43553JLn interfaceC43553JLn) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43553JLn.getAssetId() != null) {
            A1I.put("asset_id", interfaceC43553JLn.getAssetId());
        }
        if (interfaceC43553JLn.getAssetName() != null) {
            A1I.put("asset_name", interfaceC43553JLn.getAssetName());
        }
        if (interfaceC43553JLn.Acv() != null) {
            AssetRecommendationType Acv = interfaceC43553JLn.Acv();
            C14360o3.A0B(Acv, 0);
            A1I.put("asset_type", Acv.A00);
        }
        if (interfaceC43553JLn.AsE() != null) {
            ImageUrl AsE = interfaceC43553JLn.AsE();
            if (AsE != null) {
                str = AsE.getUrl();
            } else {
                str = null;
            }
            A1I.put("cover_artwork_thumbnail_uri", str);
        }
        if (interfaceC43553JLn.getExtra() != null) {
            A1I.put("extra", interfaceC43553JLn.getExtra());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
