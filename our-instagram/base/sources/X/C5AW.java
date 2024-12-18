package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.5AW, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5AW {
    public boolean A00;

    public final void A04(GraphicsLayer graphicsLayer, C59W c59w, long j) {
        if (A02() != AnonymousClass583.Ltr && A01() != 0) {
            j = AbstractC113765Bo.A00((A01() - c59w.A01) - ((int) (j >> 32)), (int) (j & 4294967295L));
        }
        A00(c59w);
        c59w.A0J(graphicsLayer, 0.0f, C119235af.A01(j, c59w.A02));
    }

    public final void A07(C59W c59w, int i, int i2) {
        long A00 = AbstractC113765Bo.A00(i, i2);
        if (A02() != AnonymousClass583.Ltr && A01() != 0) {
            A00 = AbstractC113765Bo.A00((A01() - c59w.A01) - ((int) (A00 >> 32)), (int) (A00 & 4294967295L));
        }
        A00(c59w);
        c59w.A0K(null, 0.0f, C119235af.A01(A00, c59w.A02));
    }

    public final void A08(C59W c59w, long j) {
        if (A02() != AnonymousClass583.Ltr && A01() != 0) {
            j = AbstractC113765Bo.A00((A01() - c59w.A01) - ((int) (j >> 32)), (int) (j & 4294967295L));
        }
        A00(c59w);
        c59w.A0K(null, 0.0f, C119235af.A01(j, c59w.A02));
    }

    public final void A0B(C59W c59w, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        long A00 = AbstractC113765Bo.A00(i, i2);
        if (A02() != AnonymousClass583.Ltr && A01() != 0) {
            A00 = AbstractC113765Bo.A00((A01() - c59w.A01) - ((int) (A00 >> 32)), (int) (A00 & 4294967295L));
        }
        A00(c59w);
        c59w.A0K(interfaceC16660sJ, 0.0f, C119235af.A01(A00, c59w.A02));
    }

    public final void A0C(C59W c59w, InterfaceC16660sJ interfaceC16660sJ, long j) {
        if (A02() != AnonymousClass583.Ltr && A01() != 0) {
            j = AbstractC113765Bo.A00((A01() - c59w.A01) - ((int) (j >> 32)), (int) (j & 4294967295L));
        }
        A00(c59w);
        c59w.A0K(interfaceC16660sJ, 0.0f, C119235af.A01(j, c59w.A02));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A00(C59W c59w) {
        if (c59w instanceof InterfaceC1131359b) {
            ((InterfaceC1131359b) c59w).Eat(this.A00);
        }
    }

    public final int A01() {
        if (this instanceof C5AV) {
            return ((C5AV) this).A00.A0G();
        }
        return ((C59W) ((AndroidComposeView) ((C119225ae) this).A00).A0Y.A0U.A0J).A01;
    }

    public final AnonymousClass583 A02() {
        if (this instanceof C5AV) {
            return ((C5AV) this).A00.getLayoutDirection();
        }
        return ((C119225ae) this).A00.getLayoutDirection();
    }

    public final void A03(GraphicsLayer graphicsLayer, C59W c59w, float f, long j) {
        A00(c59w);
        c59w.A0J(graphicsLayer, f, C119235af.A01(j, c59w.A02));
    }

    public final void A05(C59W c59w, float f, int i, int i2) {
        long A00 = AbstractC113765Bo.A00(i, i2);
        A00(c59w);
        c59w.A0K(null, f, C119235af.A01(A00, c59w.A02));
    }

    public final void A06(C59W c59w, float f, long j) {
        A00(c59w);
        c59w.A0K(null, f, C119235af.A01(j, c59w.A02));
    }

    public final void A09(C59W c59w, InterfaceC16660sJ interfaceC16660sJ, float f, int i, int i2) {
        long A00 = AbstractC113765Bo.A00(i, i2);
        A00(c59w);
        c59w.A0K(interfaceC16660sJ, f, C119235af.A01(A00, c59w.A02));
    }

    public final void A0A(C59W c59w, InterfaceC16660sJ interfaceC16660sJ, float f, long j) {
        A00(c59w);
        c59w.A0K(interfaceC16660sJ, f, C119235af.A01(j, c59w.A02));
    }
}
