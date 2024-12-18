package X;

import android.content.Context;
import android.util.SparseArray;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.6T8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6T8 {
    public final Context A03;
    public final C1338462s A04;
    public final InterfaceC62872tQ A05;
    public Map A01 = Collections.emptyMap();
    public Map A02 = Collections.emptyMap();
    public SparseArray A00 = new SparseArray();

    public final C6T7 A00() {
        Context context = this.A03;
        context.getClass();
        C1338462s c1338462s = this.A04;
        c1338462s.getClass();
        Map map = this.A01;
        Map map2 = this.A02;
        InterfaceC62872tQ interfaceC62872tQ = this.A05;
        interfaceC62872tQ.getClass();
        return new C6T7(context, this.A00, c1338462s, interfaceC62872tQ, map, map2);
    }

    public C6T8(Context context, C1338462s c1338462s, InterfaceC62872tQ interfaceC62872tQ) {
        this.A03 = context;
        this.A04 = c1338462s;
        this.A05 = interfaceC62872tQ;
    }
}
