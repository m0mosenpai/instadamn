package X;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class Rr3 {
    public static final boolean A00(String str) {
        C14360o3.A0B(str, 0);
        if (str.length() == 0) {
            return false;
        }
        try {
            new JSONObject(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
