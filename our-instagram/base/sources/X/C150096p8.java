package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6p8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150096p8 implements InterfaceC150106p9 {
    public final InterfaceC40711ue A00;
    public final Map A01;

    public C150096p8(InterfaceC40711ue interfaceC40711ue) {
        C14360o3.A0B(interfaceC40711ue, 1);
        this.A00 = interfaceC40711ue;
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        C14360o3.A07(synchronizedMap);
        this.A01 = synchronizedMap;
    }
}
