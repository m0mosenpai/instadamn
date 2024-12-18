package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.30w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C670530w implements InterfaceC670130s {
    public final /* synthetic */ C670330u A00;

    @Override // X.InterfaceC670130s
    public final void CtX(int i) {
    }

    @Override // X.InterfaceC670130s
    public final void D7Y() {
    }

    @Override // X.InterfaceC670130s
    public final C101484hA DnX(Integer num, List list) {
        C101484hA DnX;
        C14360o3.A0B(list, 0);
        C14360o3.A0B(num, 1);
        InterfaceC670130s interfaceC670130s = this.A00.A06;
        if (interfaceC670130s == null || (DnX = interfaceC670130s.DnX(num, list)) == null) {
            C16930sl c16930sl = C16930sl.A00;
            return new C101484hA(c16930sl, c16930sl);
        }
        return DnX;
    }

    public C670530w(C670330u c670330u) {
        this.A00 = c670330u;
    }

    @Override // X.InterfaceC670130s
    public final Map Bkt() {
        return new LinkedHashMap();
    }

    @Override // X.InterfaceC670130s
    public final /* synthetic */ C101484hA DnY(Integer num, Integer num2, List list) {
        throw new UnsupportedOperationException(AbstractC111324zv.A00(24));
    }
}
