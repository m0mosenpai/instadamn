package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7vy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178247vy {
    public boolean A00;
    public final Map A01 = Collections.synchronizedMap(new HashMap());
    public final InterfaceC178157vo[] A02;

    public final InterfaceC178077vg A00(AbstractC178097vi abstractC178097vi) {
        InterfaceC178077vg interfaceC178077vg = (InterfaceC178077vg) this.A01.get(abstractC178097vi);
        if (interfaceC178077vg != null) {
            return interfaceC178077vg;
        }
        throw new IllegalArgumentException("Component not available. Did you add specify the dependency or the plugin configuration?");
    }

    public C178247vy(InterfaceC178157vo[] interfaceC178157voArr) {
        this.A02 = interfaceC178157voArr;
    }
}
