package X;

import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VVJ {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse, java.lang.Object] */
    public static LocationPageInfoPageOperationHourResponse parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("schedule".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            LocationPageInfoPageOperationHour parseFromJson = VVK.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A04 = arrayList;
                } else if ("current_status".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("hours_today".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("is_open".equals(A0s)) {
                    obj.A00 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
