package X;

import com.instagram.api.schemas.InstagramProfileCallToActionDestinations;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VRv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68465VRv {
    public static final List A00(PromoteData promoteData) {
        if (!promoteData.A1q.isEmpty() && promoteData.A0i == XIGIGBoostDestination.A0B) {
            java.util.Set set = promoteData.A24;
            C14360o3.A06(set);
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations = (InstagramProfileCallToActionDestinations) obj;
                C14360o3.A0A(instagramProfileCallToActionDestinations);
                if (WGQ.A00(instagramProfileCallToActionDestinations, promoteData) || instagramProfileCallToActionDestinations == InstagramProfileCallToActionDestinations.A0B) {
                    arrayList.add(obj);
                }
            }
            ArrayList A0q = AbstractC167017dG.A0q(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A0q.add(((InstagramProfileCallToActionDestinations) it.next()).A00);
            }
            return A0q;
        }
        return null;
    }
}
