package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.W8r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70151W8r {
    public final InterfaceC02550Ad A00;

    public static final String A00(String str, String str2, Throwable th, List list) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_name", str);
        if (str2 != null) {
            jSONObject.put(DialogModule.KEY_MESSAGE, str2);
        }
        if (list != null) {
            jSONObject.put("event_types", list);
        }
        if (th != null) {
            jSONObject.put("exception", th.toString());
        }
        return AbstractC166987dD.A19(jSONObject);
    }

    public static final void A01(String str, String str2, C70151W8r c70151W8r) {
        InterfaceC02590Ai A0H = MSY.A0H(c70151W8r.A00, "attribution_sdk_debug");
        if (A0H.isSampled()) {
            A0H.AAP("log_level", str2);
            A0H.AAP(DialogModule.KEY_MESSAGE, str);
            A0H.Cht();
        }
    }

    public C70151W8r(InterfaceC02550Ad interfaceC02550Ad) {
        this.A00 = interfaceC02550Ad;
    }
}
