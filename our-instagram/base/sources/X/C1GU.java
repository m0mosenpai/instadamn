package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.1GU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1GU {
    public String A00;
    public final InterfaceC19630xq A01;

    public C1GU(Context context) {
        Map map = C1FE.A09;
        C1FE A00 = new C1FF(context, "AuthHeaderPrefs").A00();
        this.A01 = A00;
        this.A00 = (String) C1FE.A00(A00, "", "DEVICE_HEADER_ID");
    }
}
