package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import java.util.List;

/* renamed from: X.6IZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6IZ extends C58J implements InterfaceC113445Ag {
    public C6IO A00;

    @Override // X.InterfaceC113445Ag
    public final /* synthetic */ void DRD() {
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C6IZ) && C14360o3.A0K(this.A00, ((C6IZ) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DisplayingDisappearingItemsNode(animator=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        List list = this.A00.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C28373Cfb c28373Cfb = (C28373Cfb) list.get(i);
            GraphicsLayer graphicsLayer = c28373Cfb.A04;
            if (graphicsLayer != null) {
                long j = c28373Cfb.A00;
                float f = (int) (j >> 32);
                float f2 = (int) (j & 4294967295L);
                long j2 = graphicsLayer.A06;
                float f3 = f - ((int) (j2 >> 32));
                float f4 = f2 - ((int) (j2 & 4294967295L));
                C58A c58a = ((AnonymousClass587) interfaceC1129057z.AzL()).A01;
                c58a.F8X(f3, f4);
                try {
                    AbstractC119435b0.A00(interfaceC1129057z, graphicsLayer);
                } finally {
                    c58a.F8X(-f3, -f4);
                }
            }
        }
        interfaceC1129057z.AQf();
    }
}
