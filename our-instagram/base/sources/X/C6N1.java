package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.6N1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6N1 implements InterfaceC117845Uu, C6N2 {
    public final InterfaceC74953Yl A00;
    public final InterfaceC117845Uu A01;
    public final java.util.Set A02;

    @Override // X.InterfaceC117845Uu
    public final boolean AFS(Object obj) {
        return this.A01.AFS(obj);
    }

    @Override // X.InterfaceC117845Uu
    public final Object AJe(String str) {
        return this.A01.AJe(str);
    }

    @Override // X.InterfaceC117845Uu
    public final InterfaceC138116Np EDf(String str, InterfaceC16820sZ interfaceC16820sZ) {
        return this.A01.EDf(str, interfaceC16820sZ);
    }

    public C6N1(InterfaceC117845Uu interfaceC117845Uu, Map map) {
        this.A01 = new C117835Ut(map, new C206929Dx(interfaceC117845Uu, 23));
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A00 = new ParcelableSnapshotMutableState(A00, null);
        this.A02 = new LinkedHashSet();
    }

    @Override // X.InterfaceC117845Uu
    public final Map E4F() {
        C6N2 c6n2 = (C6N2) this.A00.getValue();
        if (c6n2 != null) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                c6n2.EGL(it.next());
            }
        }
        return this.A01.E4F();
    }

    @Override // X.C6N2
    public final void EGL(Object obj) {
        C6N2 c6n2 = (C6N2) this.A00.getValue();
        if (c6n2 != null) {
            c6n2.EGL(obj);
            return;
        }
        throw new IllegalArgumentException("null wrappedHolder");
    }

    @Override // X.C6N2
    public final void A6z(C5Tl c5Tl, Object obj, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        c5Tl.Enr(-697180401);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (c5Tl.AH6(obj)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i4 = 16;
            if (c5Tl.AH6(interfaceC16620sF)) {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i5 = 128;
            if (c5Tl.AH6(this)) {
                i5 = 256;
            }
            i2 |= i5;
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1947073440, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
            }
            C6N2 c6n2 = (C6N2) this.A00.getValue();
            if (c6n2 != null) {
                c6n2.A6z(c5Tl, obj, interfaceC16620sF, (i2 & 112) | (i2 & 14));
                boolean AH6 = c5Tl.AH6(this) | c5Tl.AH6(obj);
                Object EEc = c5Tl.EEc();
                if (AH6 || EEc == C5UI.A00) {
                    EEc = new C9F3(2, this, obj);
                    c5Tl.FBy(EEc);
                }
                C5UX.A03(c5Tl, obj, (InterfaceC16660sJ) EEc);
                if (C0fH.A02()) {
                    C0fH.A00(-2076601886);
                }
            } else {
                throw new IllegalArgumentException("null wrappedHolder");
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C9FR(i, 0, this, obj, interfaceC16620sF);
        }
    }
}
