package X;

import android.util.Base64;
import java.io.IOException;
import java.security.MessageDigest;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class W8v {
    public JSONObject A00 = new JSONObject();
    public final C54370O1c A01;

    public static final void A00(W8v w8v) {
        if (w8v.A00.names() == null) {
            try {
                String str = w8v.A01.A00.A3u;
                if (str != null) {
                    w8v.A00 = new JSONObject(str);
                }
            } catch (IOException e) {
                throw new Exception("Cannot read from the data store", e);
            } catch (JSONException e2) {
                throw new Exception("Cannot read from the data store", e2);
            }
        }
    }

    public static final void A01(W8v w8v) {
        try {
            C54370O1c c54370O1c = w8v.A01;
            String A19 = AbstractC166987dD.A19(w8v.A00);
            C47Z c47z = c54370O1c.A00;
            c47z.A3u = A19;
            c47z.A0O();
        } catch (IOException e) {
            throw new Exception("Cannot write to data store", e);
        }
    }

    public W8v(C54370O1c c54370O1c, String str, String str2) {
        this.A01 = c54370O1c;
        String A0R = AnonymousClass001.A0R(str, str2);
        MessageDigest messageDigest = MessageDigest.getInstance("sha256");
        C14360o3.A07(messageDigest);
        C14360o3.A07(Base64.encodeToString(messageDigest.digest(MSY.A1a(A0R)), 10));
    }
}
