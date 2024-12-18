package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PjF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57726PjF extends C0YY implements InterfaceC16660sJ {
    public static final C57726PjF A00 = new C57726PjF();

    public C57726PjF() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        byte[] bArr = (byte[]) obj;
        C14360o3.A0B(bArr, 0);
        try {
            return new JSONObject(new String(bArr, C15W.A05));
        } catch (JSONException unused) {
            return null;
        }
    }
}
