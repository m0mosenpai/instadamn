package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Zx, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0Zx {
    public Map A00 = new HashMap();

    public final void A01(InterfaceC02530Ab interfaceC02530Ab, String str) {
        Map map = this.A00;
        Object obj = interfaceC02530Ab;
        if (interfaceC02530Ab != null) {
            obj = interfaceC02530Ab.getValue();
        }
        map.put(str, obj);
    }

    public final void A02(C0Zx c0Zx, String str) {
        if (c0Zx == null) {
            this.A00.put(str, c0Zx);
        } else {
            A08(str, c0Zx.A00);
        }
    }

    public final void A03(String str, Boolean bool) {
        this.A00.put(str, bool);
    }

    public final void A04(String str, Double d) {
        this.A00.put(str, d);
    }

    public final void A05(String str, Long l) {
        this.A00.put(str, l);
    }

    public final void A06(String str, String str2) {
        this.A00.put(str, str2);
    }

    public final void A07(String str, List list) {
        this.A00.put(str, list);
    }

    public final void A08(String str, Map map) {
        this.A00.put(str, map);
    }
}
