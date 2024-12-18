package X;

import android.app.ActivityThread;
import android.os.Bundle;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.SgZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63275SgZ {
    public LinkedList A01;
    public final /* synthetic */ C26981Su A03;
    public long A00 = 0;
    public JSONObject A02 = null;

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x008c: IGET (r0 I:X.1Su) = (r3 I:X.SgZ) (LINE:140) X.SgZ.A03 X.1Su, block:B:30:0x008c */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.SgZ] */
    public static JSONObject A00(C63275SgZ c63275SgZ, Object obj, LinkedList linkedList, long j) {
        ?? r3;
        Object A01;
        JSONObject A0q = AbstractC31171DnF.A0q();
        try {
            String A0h = MSY.A0h(obj);
            A0q.put("_type", A0h);
            A0q.put("_size", j);
            if (obj instanceof Bundle) {
                Bundle bundle = (Bundle) obj;
                if (A02(bundle)) {
                    if (A02(bundle)) {
                        Object obj2 = bundle.get(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                        obj2.getClass();
                        Object A012 = C0HB.A00(ActivityThread.currentActivityThread().getApplication()).A01(obj2, "mClassName");
                        if (A012 == null) {
                            A012 = "FailedToGetFragmentClassName";
                        }
                        linkedList.addFirst(A012);
                        if (!bundle.containsKey("childFragmentManager") && j > c63275SgZ.A00) {
                            c63275SgZ.A00 = j;
                            c63275SgZ.A01 = new LinkedList(linkedList);
                        }
                        c63275SgZ.A01(bundle, linkedList, A0q, j);
                        linkedList.removeFirst();
                        return A0q;
                    }
                } else {
                    c63275SgZ.A01(bundle, linkedList, A0q, j);
                    return A0q;
                }
            } else if (A0h.equals("androidx.fragment.app.FragmentState") && (A01 = C0HB.A00(ActivityThread.currentActivityThread().getApplication()).A01(obj, "mClassName")) != null) {
                A0q.put("mClassName", A01);
                return A0q;
            }
        } catch (JSONException e) {
            r3.A03.A0C(e);
        }
        return A0q;
    }

    public C63275SgZ(C26981Su c26981Su) {
        this.A03 = c26981Su;
    }

    private void A01(Bundle bundle, LinkedList linkedList, JSONObject jSONObject, long j) {
        Object obj;
        long j2 = j;
        try {
            Bundle bundle2 = new Bundle(bundle);
            JSONArray A0p = AbstractC31171DnF.A0p();
            Iterator A14 = AbstractC58319PtB.A14(bundle);
            while (A14.hasNext()) {
                String A1B = AbstractC166987dD.A1B(A14);
                Object obj2 = bundle2.get(A1B);
                bundle2.remove(A1B);
                long A00 = C26981Su.A00(bundle2);
                long j3 = j2 - A00;
                if (obj2 != null) {
                    if (j3 > 10240 || A02(bundle) || ((obj = bundle.get(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE)) != null && MSY.A0h(obj).equals("androidx.fragment.app.FragmentManagerState"))) {
                        jSONObject.put(A1B, A00(this, obj2, linkedList, j3));
                    } else {
                        A0p.put(A1B);
                    }
                }
                j2 = A00;
            }
            if (A0p.length() > 0) {
                jSONObject.put("_small", A0p);
            }
        } catch (Throwable th) {
            this.A03.A0C(th);
        }
    }

    public static boolean A02(Bundle bundle) {
        Object obj = bundle.get(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        if (obj != null && MSY.A0h(obj).equals("androidx.fragment.app.FragmentState")) {
            return true;
        }
        return false;
    }
}
