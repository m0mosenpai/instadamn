package X;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.android.webview.chromium.membrane.MembraneJavaScriptExecutionResultWithOrigin;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Sor, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63524Sor implements ValueCallback {
    public final int A00;
    public final Object A01;

    public C63524Sor(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.webkit.ValueCallback
    public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
        String str;
        switch (this.A00) {
            case 0:
                C62604SIi c62604SIi = (C62604SIi) this.A01;
                if (!AbstractC166987dD.A1a(obj)) {
                    String str2 = c62604SIi.A04;
                    if (str2.startsWith("http://")) {
                        str = str2.replaceFirst("http://", "https://");
                    } else if (!str2.startsWith("https://")) {
                        str = AnonymousClass001.A0R("https://", str2);
                    } else {
                        str = str2;
                    }
                    AbstractC61739Rsu.A00(c62604SIi.A00, str);
                    C63940SwF c63940SwF = c62604SIi.A01;
                    c63940SwF.ES9(str2, c62604SIi.A03);
                    if (!c62604SIi.A05) {
                        return;
                    }
                    c63940SwF.flush();
                    return;
                }
                C23016ACq c23016ACq = c62604SIi.A02;
                if (c23016ACq == null || !c23016ACq.A0p || c23016ACq.A0g) {
                    return;
                }
                c23016ACq.A0g = true;
                c23016ACq.A09 = c23016ACq.A0m.now();
                return;
            case 1:
                MembraneJavaScriptExecutionResultWithOrigin membraneJavaScriptExecutionResultWithOrigin = (MembraneJavaScriptExecutionResultWithOrigin) obj;
                if (membraneJavaScriptExecutionResultWithOrigin == null) {
                    return;
                }
                String str3 = membraneJavaScriptExecutionResultWithOrigin.mOriginName;
                String str4 = membraneJavaScriptExecutionResultWithOrigin.mCallbackResult;
                if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                    return;
                }
                try {
                    JSONObject A17 = AbstractC58318PtA.A17(str4);
                    String string = A17.getString("text_and_dom");
                    String string2 = A17.getString("text_only");
                    String string3 = A17.getString("dom_only");
                    C58881QEr c58881QEr = (C58881QEr) this.A01;
                    Map map = c58881QEr.A08;
                    synchronized (map) {
                        map.put(str3, string);
                        c58881QEr.A0A.put(str3, string2);
                        c58881QEr.A09.put(str3, string3);
                    }
                    return;
                } catch (JSONException | Exception unused) {
                    return;
                }
            case 2:
                InterfaceC65483Tl0 interfaceC65483Tl0 = (InterfaceC65483Tl0) this.A01;
                String str5 = (String) obj;
                if (interfaceC65483Tl0 == null) {
                    return;
                }
                interfaceC65483Tl0.Dh2(str5);
                return;
            default:
                ((CountDownLatch) this.A01).countDown();
                return;
        }
    }
}
