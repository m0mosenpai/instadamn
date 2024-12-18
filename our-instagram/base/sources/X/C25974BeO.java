package X;

import com.facebook.proxygen.TraceFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.BeO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25974BeO extends CTY {
    public C25974BeO() {
        super(new JSONObject());
    }

    public final void A01(EnumC46252KdU enumC46252KdU) {
        JSONObject jSONObject;
        Object obj;
        try {
            if (enumC46252KdU == null) {
                jSONObject = this.A00;
                obj = JSONObject.NULL;
            } else {
                jSONObject = this.A00;
                obj = enumC46252KdU.toString();
            }
            jSONObject.put(TraceFieldType.ContentType, obj);
        } catch (JSONException unused) {
        }
    }

    public final void A02(EnumC46251KdT enumC46251KdT) {
        JSONObject jSONObject;
        Object obj;
        try {
            if (enumC46251KdT == null) {
                jSONObject = this.A00;
                obj = JSONObject.NULL;
            } else {
                jSONObject = this.A00;
                obj = enumC46251KdT.toString();
            }
            jSONObject.put("action_type", obj);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ void A03(InterfaceC30788DgP interfaceC30788DgP) {
        CTY cty = (CTY) interfaceC30788DgP;
        String A00 = AbstractC43591JPw.A00(997);
        try {
            if (cty == null) {
                this.A00.put(A00, JSONObject.NULL);
            } else {
                this.A00.put(A00, cty.A00);
            }
        } catch (JSONException unused) {
        }
    }

    public final /* bridge */ /* synthetic */ void A04(String str) {
        A00(AbstractC58361Pu1.A01(19, 8, 101), str);
    }
}
