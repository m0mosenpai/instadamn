package X;

import com.instagram.api.schemas.IGAdProfileProductTabDict;
import com.instagram.api.schemas.IGAdProfileProductTabFeatureModeEnum;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Eum, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33698Eum {
    public static Map A00(IGAdProfileProductTabDict iGAdProfileProductTabDict) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList = null;
        if (iGAdProfileProductTabDict.B5K() != null) {
            IGAdProfileProductTabFeatureModeEnum B5K = iGAdProfileProductTabDict.B5K();
            if (B5K != null) {
                str = B5K.A00;
            } else {
                str = null;
            }
            A1I.put("feature_mode", str);
        }
        if (iGAdProfileProductTabDict.Cay() != null) {
            A1I.put("is_price_eligible", iGAdProfileProductTabDict.Cay());
        }
        if (iGAdProfileProductTabDict.BUz() != null) {
            A1I.put(MSV.A00(232), iGAdProfileProductTabDict.BUz());
        }
        if (iGAdProfileProductTabDict.BhR() != null) {
            List<ProductDetailsProductItemDictIntf> BhR = iGAdProfileProductTabDict.BhR();
            if (BhR != null) {
                arrayList = AbstractC166987dD.A1E();
                for (ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf : BhR) {
                    if (productDetailsProductItemDictIntf != null) {
                        arrayList.add(productDetailsProductItemDictIntf.F7o());
                    }
                }
            }
            A1I.put("products", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
