package X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.RrS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61652RrS {
    public static SDB A00(Bundle bundle, String str) {
        int i;
        SYG syg = SA6.A0B;
        if (bundle == null) {
            AbstractC63398SjT.A0A("BillingClient", String.format("%s got null owned items list", str));
            i = 54;
        } else {
            int A02 = AbstractC63398SjT.A02(bundle, "BillingClient");
            SYG A00 = SYG.A00(AbstractC63398SjT.A07(bundle, "BillingClient"), A02);
            if (A02 != 0) {
                AbstractC63398SjT.A0A("BillingClient", String.format("%s failed. Response code: %s", AbstractC25228BEl.A1Z(str, A02)));
                return new SDB(A00, 23);
            }
            if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    AbstractC63398SjT.A0A("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str));
                    i = 56;
                } else if (stringArrayList2 == null) {
                    AbstractC63398SjT.A0A("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str));
                    i = 57;
                } else if (stringArrayList3 == null) {
                    AbstractC63398SjT.A0A("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str));
                    i = 58;
                } else {
                    return new SDB(SA6.A0C, 1);
                }
            } else {
                AbstractC63398SjT.A0A("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str));
                i = 55;
            }
        }
        return new SDB(syg, i);
    }
}
