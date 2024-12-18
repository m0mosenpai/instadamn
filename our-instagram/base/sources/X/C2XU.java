package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2XU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2XU {
    public final Map A00 = Collections.synchronizedMap(new HashMap());

    public final Object A00(InterfaceC75873as interfaceC75873as) {
        C14360o3.A0B(interfaceC75873as, 0);
        Map map = this.A00;
        if (map.containsKey(interfaceC75873as)) {
            return map.get(interfaceC75873as);
        }
        return interfaceC75873as.AwR();
    }

    public final void A01(InterfaceC75873as interfaceC75873as, Object obj) {
        C14360o3.A0B(interfaceC75873as, 0);
        Map map = this.A00;
        C14360o3.A06(map);
        map.put(interfaceC75873as, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2XU)) {
            return false;
        }
        return C14360o3.A0K(this.A00, ((C2XU) obj).A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }
}
