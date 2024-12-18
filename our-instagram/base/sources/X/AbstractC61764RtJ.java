package X;

import android.content.Intent;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.RtJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61764RtJ {
    public static final ArrayList A00(Intent intent, String str) {
        String str2;
        if (intent != null) {
            str2 = intent.getStringExtra(str);
        } else {
            str2 = null;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        if (str2 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    C14360o3.A07(string);
                    A1E.add(string);
                }
            } catch (JSONException unused) {
            }
        }
        return A1E;
    }
}
