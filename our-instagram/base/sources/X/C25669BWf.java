package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.BWf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25669BWf implements InterfaceC74253Vg {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    @Override // X.InterfaceC74253Vg
    public final /* synthetic */ void CwW() {
    }

    public C25669BWf(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A04 = obj4;
    }

    @Override // X.InterfaceC74253Vg
    public final void Cwl(boolean z, float f) {
        C25816BbX c25816BbX;
        if (this.A00 != 0) {
            C2XI c2xi = (C2XI) this.A02;
            Float valueOf = Float.valueOf((((C25454BNt) this.A04).A00 + 1.0f) * f);
            c2xi.A00(valueOf);
            ((C2XI) this.A03).A00(valueOf);
            C2XI c2xi2 = (C2XI) this.A01;
            if (!z) {
                f = 1.0f;
            }
            c2xi2.A00(Float.valueOf(f));
            return;
        }
        C2XI c2xi3 = (C2XI) this.A02;
        Float valueOf2 = Float.valueOf(f);
        c2xi3.A00(valueOf2);
        ((C2XI) this.A03).A00(valueOf2);
        C2XI c2xi4 = (C2XI) this.A01;
        float f2 = 1.0f;
        if (z) {
            f2 = f;
        }
        c2xi4.A00(Float.valueOf(f2));
        if (z) {
            return;
        }
        C26422Bm5 c26422Bm5 = (C26422Bm5) this.A04;
        c26422Bm5.A03.invoke(valueOf2);
        InterfaceC16660sJ interfaceC16660sJ = c26422Bm5.A02;
        boolean z2 = false;
        if (f > 0.0f) {
            z2 = true;
        }
        interfaceC16660sJ.invoke(Boolean.valueOf(z2));
        if (f > 0.0f || (c25816BbX = c26422Bm5.A00) == null) {
            return;
        }
        String str = c26422Bm5.A01;
        C14360o3.A0B(str, 0);
        C05A c05a = c25816BbX.A00;
        LinkedHashMap A03 = AbstractC06930Yk.A03((Map) c05a.getValue());
        A03.put(str, true);
        c05a.Egh(A03);
    }
}
