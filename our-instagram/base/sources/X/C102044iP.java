package X;

import android.os.Debug;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.4iP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102044iP implements C0LR {
    public static final C102044iP A00 = new Object();

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    public static C102044iP A00() {
        return A00;
    }

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A0O;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        C10850hu c10850hu = C0LK.A79;
        JSONObject jSONObject = new JSONObject();
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            for (Map.Entry<String, String> entry : memoryInfo.getMemoryStats().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (Throwable unused) {
        }
        c024209q.A03(c10850hu, jSONObject.toString());
    }
}
