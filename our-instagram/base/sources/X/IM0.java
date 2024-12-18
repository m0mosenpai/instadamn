package X;

import android.view.View;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public final class IM0 {
    public final C4EF A00;
    public final C4EH A01;
    public final java.util.Set A02;
    public final InterfaceC16820sZ A03;

    public final synchronized void A00(View view, String str) {
        this.A01.AAU(new J2Q(this), view, null, str, false);
        this.A02.add(view);
    }

    public IM0(C4EF c4ef, C4EH c4eh, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c4ef;
        this.A01 = c4eh;
        this.A03 = interfaceC16820sZ;
        java.util.Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        C14360o3.A07(newSetFromMap);
        this.A02 = newSetFromMap;
    }
}
