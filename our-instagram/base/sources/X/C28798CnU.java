package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.CnU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28798CnU implements Alignment {
    public final float A00;
    public final float A01 = -1.0f;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C28798CnU) && Float.compare(this.A00, ((C28798CnU) obj).A00) == 0 && Float.compare(-1.0f, -1.0f) == 0);
    }

    public final String toString() {
        return AnonymousClass001.A0U("BiasAbsoluteAlignment(horizontalBias=", AbstractC111324zv.A00(3458), ')', this.A00, -1.0f);
    }

    public C28798CnU(float f) {
        this.A00 = f;
    }

    @Override // androidx.compose.ui.Alignment
    public final long AB9(AnonymousClass583 anonymousClass583, long j, long j2) {
        long A00 = AbstractC119215ad.A00(((int) (j2 >> 32)) - ((int) (j >> 32)), C119055aN.A00(j2) - C119055aN.A00(j));
        return AbstractC113765Bo.A00(Math.round((((int) (A00 >> 32)) / 2.0f) * (this.A00 + 1.0f)), Math.round((C119055aN.A00(A00) / 2.0f) * (1.0f - 1.0f)));
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(AbstractC25235BEs.A02(this.A00), -1.0f);
    }
}
