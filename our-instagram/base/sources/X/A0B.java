package X;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class A0B {
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, X.8bb] */
    public static C219779nP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C219779nP c219779nP = new C219779nP();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("sourceEffect".equals(AbstractC166997dE.A0s(c16l))) {
                    try {
                        float f = (float) new JSONObject(c16l.A1P()).getDouble("processingAmount");
                        ?? obj = new Object();
                        obj.A00 = f;
                        c219779nP.A00 = obj;
                    } catch (JSONException e) {
                        throw new IOException(e);
                    }
                }
                c16l.A0z();
            }
            return c219779nP;
        } catch (IOException e2) {
            throw e2;
        } catch (Exception e3) {
            throw AbstractC166987dD.A0m(e3);
        }
    }
}
