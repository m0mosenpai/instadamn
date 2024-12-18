package X;

import android.content.Context;

/* renamed from: X.Ewa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33810Ewa {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A01()).A00;
        String A0i = AbstractC31180DnO.A0i(c6fw, 1);
        C41451vu.A01.A02(new C36156FxV(c6fq, interfaceC103384lE, 0), C36048Fvk.class);
        FP4 fp4 = FP4.getInstance();
        Context context = C1LZ.A00().A00;
        if (A0i == null) {
            A0i = "unknown";
        }
        fp4.startDeviceValidation(context, A0i);
        return null;
    }
}
