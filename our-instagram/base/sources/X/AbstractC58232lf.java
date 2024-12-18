package X;

import androidx.lifecycle.CoroutineLiveData;

/* renamed from: X.2lf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC58232lf {
    public static final CoroutineLiveData A00(C12W c12w, InterfaceC19390xP interfaceC19390xP) {
        C14360o3.A0B(interfaceC19390xP, 0);
        C14360o3.A0B(c12w, 1);
        CoroutineLiveData A00 = AbstractC58242lg.A00(c12w, new C9D3(interfaceC19390xP, (InterfaceC23621Ds) null, 7, 42));
        if (interfaceC19390xP instanceof C0UO) {
            boolean A03 = C72051XLs.A00().A03();
            Object value = ((C0UO) interfaceC19390xP).getValue();
            if (A03) {
                A00.A0B(value);
            } else {
                A00.A0A(value);
                return A00;
            }
        }
        return A00;
    }
}
