package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.zzs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* loaded from: classes10.dex */
public final class TUC implements Callable {
    public final /* synthetic */ C63373Sif A00;
    public final /* synthetic */ InterfaceC65316Ths A01;
    public final /* synthetic */ String A02;

    public TUC(C63373Sif c63373Sif, InterfaceC65316Ths interfaceC65316Ths, String str) {
        this.A02 = str;
        this.A01 = interfaceC65316Ths;
        this.A00 = c63373Sif;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        SDA sda;
        Bundle FGf;
        C63373Sif c63373Sif = this.A00;
        String str = this.A02;
        AbstractC63398SjT.A09("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList A1E = AbstractC166987dD.A1E();
        Bundle A03 = AbstractC63398SjT.A03(c63373Sif.A0G, c63373Sif.A06);
        String str2 = null;
        while (true) {
            try {
                if (c63373Sif.A06) {
                    zzs zzsVar = c63373Sif.A0K;
                    int i = 19;
                    if (true != c63373Sif.A0C) {
                        i = 9;
                    }
                    FGf = zzsVar.FGj(A03, c63373Sif.A01.getPackageName(), str, str2, i);
                } else {
                    FGf = c63373Sif.A0K.FGf(c63373Sif.A01.getPackageName(), str, str2, 3);
                }
                SDB A00 = AbstractC61652RrS.A00(FGf, "getPurchase()");
                SYG syg = A00.A01;
                SYG syg2 = SA6.A0C;
                if (syg != syg2) {
                    AbstractC58319PtB.A1E(syg, c63373Sif.A02, A00.A00, 9);
                    sda = new SDA(syg, null);
                    break;
                }
                ArrayList<String> stringArrayList = FGf.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = FGf.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = FGf.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z = false;
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    AbstractC63398SjT.A09("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i2))));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.A02())) {
                            AbstractC63398SjT.A0A("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        A1E.add(purchase);
                    } catch (JSONException e) {
                        AbstractC63398SjT.A0B("BillingClient", "Got an exception trying to decode the purchase!", e);
                        InterfaceC65616To7 interfaceC65616To7 = c63373Sif.A02;
                        SYG syg3 = SA6.A0B;
                        AbstractC58319PtB.A1E(syg3, interfaceC65616To7, 51, 9);
                        sda = new SDA(syg3, null);
                    }
                }
                if (z) {
                    AbstractC58319PtB.A1E(SA6.A0B, c63373Sif.A02, 26, 9);
                }
                str2 = FGf.getString("INAPP_CONTINUATION_TOKEN");
                AbstractC63398SjT.A09("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    sda = new SDA(syg2, A1E);
                    break;
                }
            } catch (Exception e2) {
                InterfaceC65616To7 interfaceC65616To72 = c63373Sif.A02;
                SYG syg4 = SA6.A0D;
                AbstractC58319PtB.A1E(syg4, interfaceC65616To72, 52, 9);
                AbstractC63398SjT.A0B("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                sda = new SDA(syg4, null);
            }
        }
        List list = sda.A01;
        InterfaceC65316Ths interfaceC65316Ths = this.A01;
        if (list != null) {
            interfaceC65316Ths.Dcc(sda.A00, list);
            return null;
        }
        interfaceC65316Ths.Dcc(sda.A00, RO3.A00());
        return null;
    }
}
