package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.3JO, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3JO {
    public static final void A00(Context context, AbstractC12990ll abstractC12990ll) {
        "app_installations".getClass();
        C19280xC A01 = C19280xC.A01("app_installations", null);
        for (Map.Entry entry : C26431Py.A02.entrySet()) {
            A01.A09((String) entry.getKey(), Boolean.valueOf(AbstractC14490oL.A0J(context.getPackageManager(), (String) entry.getValue())));
        }
        AbstractC11060iN.A00(abstractC12990ll).EHW(A01);
    }
}
