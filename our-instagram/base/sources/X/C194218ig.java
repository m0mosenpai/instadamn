package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8ig, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194218ig implements InterfaceC153786vn {
    public Map A00 = new HashMap();
    public final C66362zD A01;

    @Override // X.InterfaceC153786vn
    public final InterfaceC127925qL BAO(int i) {
        InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) this.A01.A04(i);
        if (this.A00.containsKey(interfaceC66482zP)) {
            return (InterfaceC127925qL) this.A00.get(interfaceC66482zP);
        }
        if (interfaceC66482zP instanceof InterfaceC127955qO) {
            return ((InterfaceC127955qO) interfaceC66482zP).BAN();
        }
        throw new IllegalStateException(AnonymousClass001.A0O("No GridSpec at position: ", i));
    }

    public C194218ig(C66362zD c66362zD) {
        this.A01 = c66362zD;
    }
}
