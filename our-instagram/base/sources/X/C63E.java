package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.react.modules.intent.IntentModule;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.63E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63E {
    public final Map A00;
    public final Map A01;

    public C63E(String str) {
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        JSONArray jSONArray = new JSONObject(str).getJSONArray("assembled_bundles");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONArray jSONArray2 = jSONArray.getJSONObject(i).getJSONArray("localized_information");
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                JSONArray jSONArray3 = jSONObject.getJSONObject("meta").getJSONArray("included_bloks_apps_ids");
                jSONArray3.length();
                String string = jSONArray3.getJSONObject(0).getString("app_id");
                String string2 = jSONObject.getString("bundle_type");
                C14360o3.A07(string2);
                for (Integer num : C05F.A00(2)) {
                    if (1 - num.intValue() != 0) {
                        str2 = "prepackaged";
                    } else {
                        str2 = "prebundled";
                    }
                    if (str2.equals(string2)) {
                        int intValue = num.intValue();
                        if (intValue != 0) {
                            if (intValue == 1) {
                                String string3 = jSONObject.getJSONObject("prebundled_data").getString("payload_output_file");
                                C14360o3.A0A(string3);
                                linkedHashMap2.put(string, new C63H(string3));
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            String string4 = jSONObject.getString("locale");
                            String string5 = jSONObject.getJSONObject("public_cdn_url").getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                            String string6 = jSONObject.getString("content_security_type");
                            C14360o3.A07(string6);
                            for (Integer num2 : C05F.A00(2)) {
                                if (1 - num2.intValue() != 0) {
                                    str3 = "normal";
                                } else {
                                    str3 = "secure";
                                }
                                if (str3.equals(string6)) {
                                    String string7 = jSONArray3.getJSONObject(0).getString("checksum");
                                    C14360o3.A0A(string7);
                                    C14360o3.A0A(string5);
                                    C63F c63f = new C63F(string7, num2, string5);
                                    C14360o3.A0A(string);
                                    C14360o3.A0A(string4);
                                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s:%s", string, string4);
                                    C14360o3.A07(formatStrLocaleSafe);
                                    linkedHashMap.put(formatStrLocaleSafe, c63f);
                                }
                            }
                            throw new NoSuchElementException(MSV.A00(6));
                        }
                    }
                }
                throw new NoSuchElementException(MSV.A00(6));
            }
        }
        this.A01 = linkedHashMap;
        this.A00 = linkedHashMap2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r0 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C63F A00(java.lang.String r9) {
        /*
            r8 = this;
            X.0do r2 = X.AbstractC58684Pzx.A00
            java.lang.Object r0 = r2.getValue()
            X.13y r0 = (X.InterfaceC217213y) r0
            if (r0 == 0) goto L60
            java.util.Locale r1 = r0.AcP()
        Le:
            java.lang.String r7 = "en_US"
            if (r1 == 0) goto L62
            java.lang.Object r0 = r2.getValue()
            X.13y r0 = (X.InterfaceC217213y) r0
            if (r0 == 0) goto L62
            java.util.Locale r0 = r0.C4D(r1)
            if (r0 == 0) goto L62
            java.lang.String r6 = X.AbstractC27081Th.A01(r0)
            X.C14360o3.A07(r6)
            java.util.Map r5 = r8.A01
            java.lang.String r4 = "%s:%s"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r4, r9, r6)
            X.C14360o3.A07(r0)
            java.lang.Object r0 = r5.get(r0)
            X.63F r0 = (X.C63F) r0
            if (r0 != 0) goto L5f
            r3 = 1
            char[] r1 = new char[r3]
            r0 = 95
            r2 = 0
            r1[r2] = r0
            java.util.List r1 = X.AbstractC001900j.A0Q(r6, r1, r2)
            int r0 = r1.size()
            if (r0 <= r3) goto L62
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r4, r9, r0)
            X.C14360o3.A07(r0)
            java.lang.Object r0 = r5.get(r0)
            X.63F r0 = (X.C63F) r0
            if (r0 == 0) goto L62
        L5f:
            return r0
        L60:
            r1 = 0
            goto Le
        L62:
            java.util.Map r1 = r8.A01
            java.lang.String r0 = "%s:%s"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r9, r7)
            X.C14360o3.A07(r0)
            java.lang.Object r0 = r1.get(r0)
            X.63F r0 = (X.C63F) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63E.A00(java.lang.String):X.63F");
    }
}
