package X;

import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.AttributionUserImpl;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.feed.media.CameraToolInfoIntf;
import com.instagram.feed.media.CreativeConfig;
import com.instagram.feed.media.EffectPreview;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ProductItemWithARIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I04 {
    public static CreativeConfig A00(AttributionUser attributionUser, EffectPreviewIntf effectPreviewIntf, ProductItemWithARIntf productItemWithARIntf, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, List list3, List list4) {
        AttributionUserImpl attributionUserImpl;
        ArrayList arrayList;
        ArrayList arrayList2;
        EffectPreview effectPreview;
        ProductItemWithAR productItemWithAR;
        ArrayList arrayList3 = null;
        C1DY A0b = AbstractC25235BEs.A0b(new C37761pD(null));
        if (attributionUser != null) {
            attributionUserImpl = attributionUser.Eqz();
        } else {
            attributionUserImpl = null;
        }
        if (list2 != null) {
            arrayList = AbstractC167007dF.A0i(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((CameraToolInfoIntf) it.next()).F4T());
            }
        } else {
            arrayList = null;
        }
        if (list3 != null) {
            arrayList2 = AbstractC167007dF.A0i(list3);
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((EffectPreviewIntf) it2.next()).F4a());
            }
        } else {
            arrayList2 = null;
        }
        if (effectPreviewIntf != null) {
            effectPreview = effectPreviewIntf.F4a();
        } else {
            effectPreview = null;
        }
        if (productItemWithARIntf != null) {
            productItemWithAR = productItemWithARIntf.F5v(A0b);
        } else {
            productItemWithAR = null;
        }
        if (list4 != null) {
            arrayList3 = AbstractC167007dF.A0i(list4);
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((GenAIToolInfoDictIntf) it3.next()).Etq());
            }
        }
        return new CreativeConfig(attributionUserImpl, effectPreview, productItemWithAR, str, str2, str3, str4, str5, str6, str7, str8, list, arrayList, arrayList2, arrayList3);
    }
}
