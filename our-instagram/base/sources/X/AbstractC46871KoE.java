package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.KoE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46871KoE {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.42m, X.JuZ] */
    public static final C44921JuZ A00(EnumC46253KdV enumC46253KdV, ImmutableList immutableList) {
        AbstractC167017dG.A1N(enumC46253KdV, immutableList);
        JSONObject A0q = AbstractC31171DnF.A0q();
        JSONObject A0q2 = AbstractC31171DnF.A0q();
        try {
            A0q2.put("product_type", enumC46253KdV.toString());
        } catch (JSONException unused) {
        }
        try {
            A0q.put("product_params", A0q2);
        } catch (JSONException unused2) {
        }
        JSONObject A0q3 = AbstractC31171DnF.A0q();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<E> it = immutableList.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toString());
            }
            A0q3.put("feature_tags", jSONArray);
        } catch (JSONException unused3) {
        }
        try {
            A0q.put(AbstractC58317Pt9.A00(859), A0q3);
        } catch (JSONException unused4) {
        }
        return new AbstractC907342m(A0q);
    }
}
