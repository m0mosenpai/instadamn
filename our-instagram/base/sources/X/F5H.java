package X;

import com.instagram.direct.model.DirectForwardingParams;

/* loaded from: classes6.dex */
public abstract class F5H {
    public static final Integer A00(DirectForwardingParams directForwardingParams, InterfaceC83713oG interfaceC83713oG) {
        if (directForwardingParams.A0A) {
            if (interfaceC83713oG instanceof InterfaceC83703oF) {
                return C05F.A0C;
            }
            if (interfaceC83713oG instanceof InterfaceC2056098k) {
                return C05F.A0N;
            }
        } else {
            if (interfaceC83713oG instanceof InterfaceC2056098k) {
                return C05F.A01;
            }
            if (interfaceC83713oG instanceof InterfaceC83703oF) {
                return C05F.A00;
            }
        }
        throw AbstractC166987dD.A14("Unknown forward type!");
    }
}
