package X;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.SRz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62805SRz {
    public static final List A00(Intent intent, String str) {
        String stringExtra;
        if (intent.hasExtra(str) && (stringExtra = intent.getStringExtra(str)) != null) {
            try {
                JSONArray jSONArray = new JSONArray(stringExtra);
                ArrayList A1E = AbstractC166987dD.A1E();
                int i = 0;
                int length = stringExtra.length();
                if (length < 0) {
                    return A1E;
                }
                while (true) {
                    String string = jSONArray.getString(i);
                    C14360o3.A07(string);
                    A1E.add(string);
                    if (i != length) {
                        i++;
                    } else {
                        return A1E;
                    }
                }
            } catch (JSONException unused) {
                return C16930sl.A00;
            }
        } else {
            return C16930sl.A00;
        }
    }
}
