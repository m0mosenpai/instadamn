package X;

import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class OQy {
    public static final List A00 = AbstractC166987dD.A1E();

    public static final Object A00(C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, AbstractC58317Pt9.A00(1));
        Map map = (Map) A01;
        if (MSW.A1b(map)) {
            for (C55127Obo c55127Obo : A00) {
                JSONObject jSONObject = new JSONObject(map);
                C55143Od2 c55143Od2 = c55127Obo.A0B.A0C.A00;
                if (c55143Od2 == null) {
                    C14360o3.A0F("provider");
                    throw C00O.createAndThrow();
                }
                c55143Od2.A0D.A02.A00(jSONObject);
            }
            return null;
        }
        return null;
    }
}
