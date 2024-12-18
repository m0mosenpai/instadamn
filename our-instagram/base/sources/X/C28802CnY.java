package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.CnY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28802CnY implements C5BH {
    public C5BH A00;
    public C18620vp A01;

    public final void A00() {
        C18620vp c18620vp = this.A01;
        if (c18620vp != null) {
            Object[] objArr = c18620vp.A01;
            int i = c18620vp.A00;
            for (int i2 = 0; i2 < i; i2++) {
                EEH((GraphicsLayer) objArr[i2]);
            }
            AbstractC06960Yn.A0V(c18620vp.A01, 0, c18620vp.A00);
            c18620vp.A00 = 0;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0vp, java.lang.Object, X.01h] */
    @Override // X.C5BH
    public final GraphicsLayer AMJ() {
        C5BH c5bh = this.A00;
        if (c5bh != null) {
            GraphicsLayer AMJ = c5bh.AMJ();
            C18620vp c18620vp = this.A01;
            if (c18620vp == null) {
                ?? obj = new Object();
                obj.A01 = new Object[1];
                obj.A00(AMJ);
                this.A01 = obj;
                return AMJ;
            }
            c18620vp.A00(AMJ);
            return AMJ;
        }
        AbstractC28290Cdc.A01("GraphicsContext not provided");
        throw C00O.createAndThrow();
    }

    @Override // X.C5BH
    public final void EEH(GraphicsLayer graphicsLayer) {
        C5BH c5bh = this.A00;
        if (c5bh != null) {
            c5bh.EEH(graphicsLayer);
        }
    }
}
