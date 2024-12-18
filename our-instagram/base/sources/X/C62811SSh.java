package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.SSh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62811SSh {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1um, X.RaV, X.1ul] */
    public static RaV parseFromJson(C16L c16l) {
        String str;
        String str2;
        JsonElement jsonElement;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("json_response".equals(A0s)) {
                    SCL scl = new SCL();
                    if (c16l.A11() == C16R.A0J && C14360o3.A0K(c16l.A0q(), "json_response")) {
                        C73773Sh c73773Sh = AbstractC73763Sg.A03;
                        String A1Q = c16l.A1Q();
                        C14360o3.A07(A1Q);
                        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
                        JsonObject A03 = AbstractC100754fe.A03((JsonElement) c73773Sh.A00(A1Q, jsonElementSerializer));
                        JsonElement jsonElement2 = (JsonElement) A03.get(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
                        if (jsonElement2 != null) {
                            AbstractC100754fe.A06(jsonElement2);
                        }
                        JsonElement jsonElement3 = (JsonElement) A03.get(TraceFieldType.StatusCode);
                        if (jsonElement3 == null || (str = AbstractC100754fe.A06(jsonElement3).A00()) == null) {
                            str = "";
                        }
                        scl.A00 = str;
                        Object obj = A03.get("content");
                        if (obj == null || (str2 = obj.toString()) == null) {
                            str2 = "";
                        }
                        if (str2.length() > 0 && (jsonElement = (JsonElement) AbstractC100754fe.A03((JsonElement) c73773Sh.A00(str2, jsonElementSerializer)).get(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS)) != null) {
                            AbstractC100754fe.A06(jsonElement);
                        }
                    }
                    c40791um.A00 = scl;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
