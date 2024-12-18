package X;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.PurchaseHistoryRecord;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class TUD implements Callable {
    public final /* synthetic */ C63373Sif A00;
    public final /* synthetic */ InterfaceC65315Thr A01;
    public final /* synthetic */ String A02;

    public TUD(C63373Sif c63373Sif, InterfaceC65315Thr interfaceC65315Thr, String str) {
        this.A02 = str;
        this.A01 = interfaceC65315Thr;
        this.A00 = c63373Sif;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        SD9 sd9;
        C63373Sif c63373Sif = this.A00;
        String str = this.A02;
        AbstractC63398SjT.A09("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList A1E = AbstractC166987dD.A1E();
        Bundle A03 = AbstractC63398SjT.A03(c63373Sif.A0G, c63373Sif.A06);
        String str2 = null;
        while (true) {
            if (!c63373Sif.A05) {
                AbstractC63398SjT.A0A("BillingClient", "getPurchaseHistory is not supported on current device");
                sd9 = new SD9(SA6.A0G, null);
                break;
            }
            try {
                Bundle FGb = c63373Sif.A0K.FGb(A03, c63373Sif.A01.getPackageName(), str, str2, 6);
                SDB A00 = AbstractC61652RrS.A00(FGb, "getPurchaseHistory()");
                SYG syg = A00.A01;
                SYG syg2 = SA6.A0C;
                if (syg != syg2) {
                    AbstractC58319PtB.A1E(syg, c63373Sif.A02, A00.A00, 11);
                    sd9 = new SD9(syg, null);
                    break;
                }
                ArrayList<String> stringArrayList = FGb.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = FGb.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = FGb.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z = false;
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    AbstractC63398SjT.A09("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        JSONObject jSONObject = purchaseHistoryRecord.A02;
                        if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                            AbstractC63398SjT.A0A("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        A1E.add(purchaseHistoryRecord);
                    } catch (JSONException e) {
                        AbstractC63398SjT.A0B("BillingClient", "Got an exception trying to decode the purchase!", e);
                        InterfaceC65616To7 interfaceC65616To7 = c63373Sif.A02;
                        SYG syg3 = SA6.A0B;
                        AbstractC58319PtB.A1E(syg3, interfaceC65616To7, 51, 11);
                        sd9 = new SD9(syg3, null);
                    }
                }
                if (z) {
                    AbstractC58319PtB.A1E(SA6.A0B, c63373Sif.A02, 26, 11);
                }
                str2 = FGb.getString("INAPP_CONTINUATION_TOKEN");
                AbstractC63398SjT.A09("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    sd9 = new SD9(syg2, A1E);
                    break;
                }
            } catch (RemoteException e2) {
                AbstractC63398SjT.A0B("BillingClient", "Got exception trying to get purchase history, try to reconnect", e2);
                InterfaceC65616To7 interfaceC65616To72 = c63373Sif.A02;
                SYG syg4 = SA6.A0D;
                AbstractC58319PtB.A1E(syg4, interfaceC65616To72, 59, 11);
                sd9 = new SD9(syg4, null);
            }
        }
        this.A01.DcX(sd9.A00, sd9.A01);
        return null;
    }
}
