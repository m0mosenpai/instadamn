package X;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class SSJ {
    public static String A00(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return AbstractC58319PtB.A0x(bArr);
    }

    public static void A01(AbstractC64537TIt abstractC64537TIt, String str, JSONObject jSONObject) {
        jSONObject.put(str, A00(abstractC64537TIt.A03()));
    }
}
