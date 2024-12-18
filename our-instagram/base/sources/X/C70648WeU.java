package X;

import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.PendingLocation;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WeU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70648WeU implements XAC {
    public final /* synthetic */ C67875V0g A00;

    public C70648WeU(C67875V0g c67875V0g) {
        this.A00 = c67875V0g;
    }

    @Override // X.XAC
    public final void DNL(AudienceGeoLocation audienceGeoLocation) {
        C67875V0g c67875V0g = this.A00;
        UGb uGb = c67875V0g.A05;
        if (uGb == null) {
            C14360o3.A0F("selectedLocationAdapter");
            throw C00O.createAndThrow();
        }
        PendingLocation pendingLocation = uGb.A01.A0o;
        List list = pendingLocation.A05;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = ((AudienceGeoLocation) it.next()).A06;
            if (str != null) {
                String str2 = audienceGeoLocation.A06;
                if (str2 != null) {
                    if (str.equals(str2)) {
                        it.remove();
                        pendingLocation.A05 = list;
                        PromoteState.A01(uGb.A02, C05F.A1I);
                        uGb.notifyDataSetChanged();
                        break;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C70179WFe c70179WFe = VZI.A00;
        List list2 = ((PromoteData) AbstractC166987dD.A17(c67875V0g.A0E)).A0o.A05;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        while (true) {
            size--;
            if (size > 0) {
                AudienceGeoLocation audienceGeoLocation2 = (AudienceGeoLocation) list2.get(size);
                if (C70179WFe.A03(audienceGeoLocation2, list2.subList(0, size))) {
                    arrayList.add(audienceGeoLocation2);
                }
            } else {
                c67875V0g.A06 = arrayList;
                C67875V0g.A00(c67875V0g);
                return;
            }
        }
    }
}
