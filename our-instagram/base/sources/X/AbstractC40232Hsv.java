package X;

import com.instagram.api.schemas.SellerBadgeDictIntf;
import com.instagram.api.schemas.SellerBadgeSurfaces;
import com.instagram.api.schemas.SellerBadgeType;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hsv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40232Hsv {
    public static Map A00(SellerBadgeDictIntf sellerBadgeDictIntf) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (sellerBadgeDictIntf.getDescription() != null) {
            A1I.put(DevServerEntity.COLUMN_DESCRIPTION, sellerBadgeDictIntf.getDescription());
        }
        if (sellerBadgeDictIntf.getName() != null) {
            AbstractC37300Gc1.A14(sellerBadgeDictIntf.getName(), A1I);
        }
        String str = null;
        if (sellerBadgeDictIntf.C4T() != null) {
            List<SellerBadgeSurfaces> C4T = sellerBadgeDictIntf.C4T();
            if (C4T != null) {
                arrayList = AbstractC167017dG.A0q(C4T);
                for (SellerBadgeSurfaces sellerBadgeSurfaces : C4T) {
                    C14360o3.A0B(sellerBadgeSurfaces, 0);
                    arrayList.add(sellerBadgeSurfaces.A00);
                }
            } else {
                arrayList = null;
            }
            A1I.put("surfaces", arrayList);
        }
        if (sellerBadgeDictIntf.CBZ() != null) {
            SellerBadgeType CBZ = sellerBadgeDictIntf.CBZ();
            if (CBZ != null) {
                str = CBZ.A00;
            }
            AbstractC37300Gc1.A16(str, A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
