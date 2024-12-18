package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Mm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04700Mm implements InterfaceC02580Ag {
    public static final C08270bp A04 = new C08260bo().A00();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC02580Ag
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String F7g() {
        StringBuilder sb = new StringBuilder();
        String str = this.A03;
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append(':');
        }
        String str2 = this.A00;
        if (!TextUtils.isEmpty(str2)) {
            sb.append("//");
            sb.append(str2);
        }
        String str3 = this.A01;
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
        }
        String str4 = this.A02;
        if (!TextUtils.isEmpty(str4)) {
            sb.append('?');
            sb.append(str4);
        }
        return sb.toString();
    }

    public final JSONObject A01() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.A03;
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("scheme", str);
            }
            String str2 = this.A00;
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("authority", str2);
            }
            String str3 = this.A01;
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("path", str3);
            }
            String str4 = this.A02;
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("query", str4);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public C04700Mm(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }
}
