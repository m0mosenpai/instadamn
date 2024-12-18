package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Xzs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73301Xzs {
    public final C69495VoJ A00;
    public final YOn A01;
    public final C12320ka A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0129: INVOKE (r8v1 ?? I:X.YA7), (r10 I:X.OMZ), (r1 I:X.YOn), (r0 I:X.Y0F), (r2 I:java.lang.String) DIRECT call: X.YA7.<init>(X.OMZ, X.YOn, X.Y0F, java.lang.String):void A[MD:(X.OMZ, X.YOn, X.Y0F, java.lang.String):void (m)] (LINE:297), block:B:56:0x0121 */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0133: INVOKE (r8v0 ?? I:X.YA7), (r10 I:X.OMZ), (r2 I:X.YOn), (r0 I:X.Y0F), (r1 I:java.lang.String) DIRECT call: X.YA7.<init>(X.OMZ, X.YOn, X.Y0F, java.lang.String):void A[MD:(X.OMZ, X.YOn, X.Y0F, java.lang.String):void (m)] (LINE:307), block:B:58:0x012d */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.OMZ] */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.OMZ] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.Y0F, java.lang.Object, X.XS2] */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.Y0F, java.lang.Object, X.XS1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.Y0F, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, X.Xlm] */
    public static InterfaceC58193Pqz A00(OMZ omz, C73301Xzs c73301Xzs) {
        ?? ya7;
        ?? ya72;
        List asList;
        try {
            try {
                String str = omz.A02;
                try {
                    ?? obj = new Object();
                    Y0F.A00(obj, new JSONObject(str));
                    String str2 = obj.A03;
                    if (str2 != null && obj.A02 != null) {
                        if (str2.equals("single-context-buckets-table")) {
                            try {
                                ?? obj2 = new Object();
                                JSONObject jSONObject = new JSONObject(str);
                                Y0F.A00(obj2, jSONObject);
                                obj2.A00 = C73306Xzx.A00(jSONObject.optJSONObject("context"));
                                obj2.A01 = jSONObject.optString("output", null);
                                if (jSONObject.isNull("table")) {
                                    asList = null;
                                } else {
                                    JSONArray jSONArray = jSONObject.getJSONArray("table");
                                    int length = jSONArray.length();
                                    C72714Xlm[] c72714XlmArr = new C72714Xlm[length];
                                    for (int i = 0; i < length; i++) {
                                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                        ?? obj3 = new Object();
                                        obj3.A00 = jSONObject2.optString("bucket", null);
                                        obj3.A01 = jSONObject2.optString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, null);
                                        c72714XlmArr[i] = obj3;
                                    }
                                    asList = Arrays.asList(c72714XlmArr);
                                }
                                obj2.A03 = asList;
                                obj2.A02 = jSONObject.optString(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, null);
                                return new XS0(c73301Xzs.A00, omz, c73301Xzs.A01, (XS2) obj2, c73301Xzs.A02);
                            } catch (JSONException e) {
                                throw new IOException(e);
                            }
                        }
                        if (str2.equals("multi-output-resolved")) {
                            try {
                                JSONObject jSONObject3 = new JSONObject(str);
                                ?? obj4 = new Object();
                                Y0F.A00(obj4, jSONObject3);
                                obj4.A00 = Y4K.A00("monitors", jSONObject3);
                                obj4.A01 = Y4K.A03(jSONObject3);
                                obj4.A02 = Y4K.A01("values", jSONObject3);
                                return new C72187XRy(c73301Xzs.A00, omz, c73301Xzs.A01, obj4, c73301Xzs.A02);
                            } catch (JSONException e2) {
                                throw new IOException(e2);
                            }
                        }
                        if (str2.equals("table")) {
                            XS4 A01 = AbstractC72881XqF.A01(str);
                            return new XS0(c73301Xzs.A00, omz, c73301Xzs.A01, A01, c73301Xzs.A02);
                        }
                        if (str2.equals("dense")) {
                            XS3 A00 = AbstractC72881XqF.A00(str);
                            return new C72188XRz(c73301Xzs.A00, omz, c73301Xzs.A01, A00, c73301Xzs.A02);
                        }
                        throw new VI3("Unknown config type", str2);
                    }
                    throw new Exception("Can't identify config");
                } catch (JSONException e3) {
                    throw new IOException(e3);
                }
            } catch (VI3 | IndexOutOfBoundsException e4) {
                return new YA7(ya72, c73301Xzs.A01, null, e4.getMessage());
            }
        } catch (IOException unused) {
            return new YA7(ya7, c73301Xzs.A01, null, "Can't read config");
        }
    }

    public C73301Xzs(C69495VoJ c69495VoJ, YOn yOn, C12320ka c12320ka) {
        this.A00 = c69495VoJ;
        this.A02 = c12320ka;
        this.A01 = yOn;
    }
}
