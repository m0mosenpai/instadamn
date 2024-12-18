package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.common.dextricks.DexStore;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0LO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LO {
    public final InterfaceC08350bx A00;

    public C0LO(InterfaceC08350bx interfaceC08350bx) {
        this.A00 = interfaceC08350bx;
    }

    public final boolean A00(Context context, Intent intent, Object obj) {
        int length;
        C08310bt.A04(context);
        C08310bt.A04(context);
        InterfaceC08350bx interfaceC08350bx = this.A00;
        if (interfaceC08350bx.EiH()) {
            C08340bw[] AvJ = interfaceC08350bx.AvJ();
            boolean z = false;
            if (AvJ != null && (length = AvJ.length) > 0) {
                int i = 0;
                while (true) {
                    C08340bw c08340bw = AvJ[i];
                    Pattern pattern = c08340bw.A03;
                    if (pattern == null || pattern.matcher(obj.getClass().getName()).matches()) {
                        try {
                            C0LG A00 = AbstractC08500cE.A00(context, intent, null, DexStore.DAYS_TO_MS_FACTOR);
                            C08330bv c08330bv = c08340bw.A00;
                            if (c08330bv != null) {
                                if (A00 != null) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("caller_uid", A00.A00);
                                    String A05 = A00.A05();
                                    if (A05 != null) {
                                        jSONObject.put("caller_package_name", A05);
                                    }
                                    String str = A00.A02;
                                    if (str != null) {
                                        jSONObject.put("caller_version_name", str);
                                    }
                                    String str2 = A00.A01;
                                    if (str2 != null) {
                                        jSONObject.put("caller_domain", str2);
                                    }
                                    if (!c08330bv.A01(null, jSONObject)) {
                                    }
                                }
                            }
                            if (c08340bw.A01(intent)) {
                                z = true;
                                break;
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    i++;
                    if (i >= length) {
                        break;
                    }
                }
            }
            if (!z) {
                for (C08320bu c08320bu : interfaceC08350bx.BIq()) {
                    String str3 = c08320bu.A02;
                    if (str3 == null || str3.equals(obj.getClass().getName())) {
                        IntentFilter intentFilter = c08320bu.A01;
                        if (intentFilter != null) {
                            boolean z2 = false;
                            if (intentFilter.match(c08320bu.A00, intent, false, "TAG") > 0) {
                                z2 = true;
                            }
                            if (c08320bu.A03) {
                                if (!z2) {
                                }
                            } else if (z2) {
                                return false;
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }
}
