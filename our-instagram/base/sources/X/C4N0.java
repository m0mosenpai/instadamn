package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4N0, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4N0 {
    public final List A00 = new LinkedList();

    public C4N1 A00() {
        return ((AbstractC94474Mz) this).A00;
    }

    public void A01() {
        int i;
        AbstractC94474Mz abstractC94474Mz = (AbstractC94474Mz) this;
        try {
            JSONObject jSONObject = new JSONObject(abstractC94474Mz.A01);
            abstractC94474Mz.A04(jSONObject);
            if ("sandbox".equals(abstractC94474Mz.A03) && !TextUtils.isEmpty(abstractC94474Mz.A02)) {
                String str = abstractC94474Mz.A02;
                try {
                    if (!TextUtils.isEmpty(str)) {
                        if (str.contains(":")) {
                            String[] split = str.split(":", 2);
                            str = split[0];
                            i = Integer.parseInt(split[1]);
                        } else {
                            i = 8883;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("host_name_v6", str);
                            jSONObject.put("default_port", i);
                            jSONObject.put("backup_port", i);
                            jSONObject.put("use_ssl", false);
                            jSONObject.put("use_compression", false);
                        }
                    }
                    if (!TextUtils.isEmpty(null)) {
                        jSONObject.put("php_sandbox_host_name", (Object) null);
                    }
                } catch (Throwable th) {
                    C0K8.A0H("ConnectionConfigManager", "Failed to parse mqtt sandbox URL", th);
                }
            }
            abstractC94474Mz.A00 = new C4N1(jSONObject);
        } catch (JSONException e) {
            C0K8.A0G("BasicConnectionConfigManager", "Could not load connection config. Using default", e);
            abstractC94474Mz.A00 = new C4N1(new JSONObject());
        }
    }

    public void A02() {
        C94464My c94464My = (C94464My) this;
        c94464My.A01();
        Intent intent = new Intent(AbstractC58317Pt9.A00(730));
        Context context = c94464My.A02;
        intent.setPackage(context.getPackageName());
        C0b3.A00().A07().A0C(context, intent);
        C94454Mx c94454Mx = c94464My.A03;
        AnonymousClass206.A0G.A01(new RunnableC64618TNa(c94454Mx.A00, c94454Mx.A01));
    }

    public final synchronized void A03(C4N5 c4n5) {
        this.A00.add(c4n5);
    }

    public final synchronized void A04(JSONObject jSONObject) {
        for (C4N5 c4n5 : this.A00) {
            try {
                String BV7 = c4n5.BV7();
                if (!TextUtils.isEmpty(BV7)) {
                    jSONObject.put("host_name_v6", BV7);
                }
                String Abb = c4n5.Abb();
                if (!TextUtils.isEmpty(Abb)) {
                    jSONObject.put("analytics_endpoint", Abb);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
