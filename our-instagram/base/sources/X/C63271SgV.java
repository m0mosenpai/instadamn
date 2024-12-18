package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.SgV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63271SgV {
    public static final C63271SgV A01 = new C63271SgV(true);
    public static volatile C63271SgV A02;
    public final Map A00;

    public static C63271SgV A00() {
        C63271SgV c63271SgV;
        C63271SgV c63271SgV2 = A02;
        if (c63271SgV2 == null) {
            synchronized (C63271SgV.class) {
                c63271SgV = A02;
                if (c63271SgV == null) {
                    Class cls = AbstractC62338S7i.A00;
                    if (cls != null) {
                        try {
                            c63271SgV = (C63271SgV) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                        if (c63271SgV != null) {
                            A02 = c63271SgV;
                        }
                    }
                    c63271SgV = A01;
                    A02 = c63271SgV;
                }
            }
            return c63271SgV;
        }
        return c63271SgV2;
    }

    public C63271SgV(boolean z) {
        this.A00 = Collections.emptyMap();
    }

    public C63271SgV() {
        this.A00 = AbstractC166987dD.A1G();
    }
}
