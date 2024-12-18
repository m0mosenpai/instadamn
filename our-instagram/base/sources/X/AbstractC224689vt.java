package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.9vt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224689vt {
    public static C23518AbY A00(Context context, InterfaceC142616cN interfaceC142616cN, InterfaceC178337w7 interfaceC178337w7, boolean z) {
        InterfaceC178337w7 interfaceC178337w72 = null;
        InterfaceC142616cN interfaceC142616cN2 = interfaceC142616cN != null ? interfaceC142616cN : null;
        if (interfaceC178337w7 != null) {
            interfaceC178337w72 = interfaceC178337w7;
        }
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(AK4.A06, new C55772Opg(context, VYI.A00));
        A1G.put(AK4.A07, new C23507AbN(context, new AG9(interfaceC142616cN2, interfaceC178337w72, z)));
        return new C23518AbY(new AK4(A1G));
    }
}
