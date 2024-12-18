package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7vz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178257vz {
    public boolean A00;
    public final InterfaceC178157vo[] A04;
    public final Map A02 = Collections.synchronizedMap(new HashMap());
    public final Map A03 = new HashMap(1);
    public final ArrayList A01 = new ArrayList();

    public final InterfaceC178287w2 A00(C178307w4 c178307w4) {
        InterfaceC178287w2 interfaceC178287w2 = (InterfaceC178287w2) this.A02.get(c178307w4);
        if (interfaceC178287w2 != null) {
            return interfaceC178287w2;
        }
        throw new IllegalArgumentException("CoreComponent not available. Did you add specify component dependency or the plugin configuration?");
    }

    public final void A01(String str, String str2, String str3) {
        if (str != null) {
            ((InterfaceC178407wE) A00(InterfaceC178407wE.A00)).Ebb(str);
        }
        if (str2 != null) {
            ((InterfaceC178407wE) A00(InterfaceC178407wE.A00)).Ebc(str2);
        }
        if (str3 != null) {
            ((InterfaceC178407wE) A00(InterfaceC178407wE.A00)).ETs(str3);
        }
    }

    public C178257vz(InterfaceC178157vo[] interfaceC178157voArr) {
        this.A04 = interfaceC178157voArr;
    }
}
