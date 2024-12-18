package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gdd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37397Gdd {
    public static Map A00(InterfaceC93074Fh interfaceC93074Fh) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC93074Fh.getCount();
        A1I.put("count", Integer.valueOf(interfaceC93074Fh.getCount()));
        if (interfaceC93074Fh.getHexRgbaColor() != null) {
            A1I.put("hex_rgba_color", interfaceC93074Fh.getHexRgbaColor());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
