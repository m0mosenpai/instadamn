package X;

import com.facebook.minscript.compiler.MinsCompilerImpl$Helper;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.UnsupportedEncodingException;
import java.nio.ByteOrder;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.VKw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68284VKw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.4kO] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.4kP, X.4kO] */
    public static final C102874kO A00(JSONObject jSONObject) {
        C14360o3.A0B(jSONObject, 0);
        ?? c102884kP = new C102884kP(null, jSONObject.getInt("__style_id"), jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        C14360o3.A07(keys);
        while (keys.hasNext()) {
            String next = keys.next();
            if (!next.equals("__style_id")) {
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    obj = A00((JSONObject) obj);
                } else if (obj instanceof String) {
                    obj = (String) obj;
                    try {
                        String str = obj;
                        if (obj.startsWith("lispx")) {
                            str = obj.substring(15);
                        }
                        try {
                            MinsCompilerImpl$Helper.doCompile(str.getBytes(ReactWebViewManager.HTML_ENCODING), false).order(ByteOrder.nativeOrder());
                            throw new RuntimeException("Invalid param");
                        } catch (UnsupportedEncodingException e) {
                            throw new RuntimeException(e);
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                c102884kP.A0Q(Integer.parseInt(next), obj);
            }
        }
        c102884kP.A0P();
        return c102884kP;
    }
}
