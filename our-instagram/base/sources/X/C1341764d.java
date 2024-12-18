package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.64d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1341764d {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public final boolean A01(int i) {
        Object obj = this.A00.get(Integer.valueOf(i));
        if (obj == null) {
            obj = false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final void A00(int i, boolean z) {
        this.A00.put(Integer.valueOf(i), Boolean.valueOf(z));
    }
}
