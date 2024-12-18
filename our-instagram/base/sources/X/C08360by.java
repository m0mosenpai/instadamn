package X;

import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: X.0by, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08360by {
    public final Pattern A00;
    public final boolean A01;

    public static C08360by A00(Object obj) {
        Pattern compile = Pattern.compile("");
        boolean z = false;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("pattern")) {
                compile = Pattern.compile(jSONObject.getString("pattern"), 32);
                if (jSONObject.has("negation") && jSONObject.getString("negation").equalsIgnoreCase("true")) {
                    z = true;
                }
            }
        } else if (obj instanceof String) {
            compile = Pattern.compile((String) obj, 32);
        }
        return new C08360by(compile, z);
    }

    public C08360by(Pattern pattern, boolean z) {
        this.A00 = pattern;
        this.A01 = z;
    }

    public C08360by() {
        this(Pattern.compile(""), false);
    }
}
