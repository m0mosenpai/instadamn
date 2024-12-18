package X;

import java.util.Arrays;
import java.util.LinkedHashSet;

/* renamed from: X.1J2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1J2 extends AbstractC208410g {
    public static int[] A00;
    public static final C1J2 A01 = new Object();
    public static final java.util.Set A02 = new LinkedHashSet();

    @Override // X.C0Xc
    public final String getName() {
        return "ig_memory_manager";
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerDrop(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        java.util.Set set = A02;
        set.remove(Integer.valueOf(c0xx.CCe()));
        if (set.isEmpty()) {
            AbstractC25061Kk.A00().A0C(false);
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerStart(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        AbstractC25061Kk.A00().A0C(true);
        A02.add(Integer.valueOf(c0xx.CCe()));
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerStop(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        java.util.Set set = A02;
        set.remove(Integer.valueOf(c0xx.CCe()));
        if (set.isEmpty()) {
            AbstractC25061Kk.A00().A0C(false);
        }
    }

    @Override // X.C0Xc
    public final C06650Xb getListenerMarkers() {
        int[] iArr = A00;
        if (iArr == null) {
            C14360o3.A0F("criticalEvents");
            throw C00O.createAndThrow();
        }
        return new C06650Xb(Arrays.copyOf(iArr, iArr.length), null);
    }
}
