package X;

import android.content.Context;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: X.1GN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1GN {
    public InterfaceC23931Fd A00;

    public final boolean A00(Context context, Map map) {
        InterfaceC23931Fd interfaceC23931Fd = this.A00;
        interfaceC23931Fd.getClass();
        OutputStream C2b = interfaceC23931Fd.C2b(context);
        if (C2b != null) {
            C120295cS A08 = AbstractC221915u.A00.A08(C2b);
            A08.A0c();
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    EnumC24331Hc enumC24331Hc = (EnumC24331Hc) EnumC24331Hc.A02.get(value.getClass());
                    if (enumC24331Hc == null) {
                        for (EnumC24331Hc enumC24331Hc2 : EnumC24331Hc.values()) {
                            if (enumC24331Hc2.A00.isInstance(value)) {
                                enumC24331Hc = enumC24331Hc2;
                            }
                        }
                        if (enumC24331Hc != null) {
                        }
                    }
                    String str = (String) entry.getKey();
                    String obj = value.toString();
                    A08.A0d();
                    if (str != null) {
                        A08.A0S("n", str);
                    }
                    if (obj != null) {
                        A08.A0S("v", obj);
                    }
                    A08.A0S("t", enumC24331Hc.A01);
                    A08.A0a();
                }
            }
            A08.A0Z();
            A08.flush();
            A08.close();
            return true;
        }
        return false;
    }
}
