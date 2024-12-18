package X;

/* renamed from: X.3a9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC75423a9 {
    public static final boolean A00(C1NI c1ni, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(c1ni, 0);
        C14360o3.A0B(interfaceC60442pS, 1);
        if (!A01(c1ni, interfaceC60442pS) && !A02(c1ni, interfaceC60442pS) && !c1ni.CW9()) {
            return false;
        }
        return true;
    }

    public static final boolean A01(C1NI c1ni, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(c1ni, 0);
        C14360o3.A0B(interfaceC60442pS, 1);
        if (c1ni.CZq() && interfaceC60442pS.isOrganicEligible()) {
            return true;
        }
        return false;
    }

    public static final boolean A02(C1NI c1ni, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(c1ni, 0);
        C14360o3.A0B(interfaceC60442pS, 1);
        if (c1ni.CdW() && interfaceC60442pS.isSponsoredEligible()) {
            return true;
        }
        return false;
    }
}
