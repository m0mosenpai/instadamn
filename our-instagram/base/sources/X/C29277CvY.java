package X;

import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.CvY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29277CvY implements InterfaceC62612t0 {
    public final int A00;
    public final Object A01;

    public C29277CvY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC62612t0
    public final void AD4() {
        AbstractC153666vb abstractC153666vb;
        switch (this.A00) {
            case 0:
                abstractC153666vb = ((C25799BbG) ((C26834Bsw) this.A01).A0J.getValue()).A02.A00;
                abstractC153666vb.A04(null, null, C16930sl.A00, false);
                return;
            case 1:
                InterfaceC30932Dim interfaceC30932Dim = ((C25831Bbm) ((C26837Bsz) this.A01).A0D.getValue()).A00;
                if (interfaceC30932Dim == null) {
                    return;
                }
                interfaceC30932Dim.E3F();
                return;
            case 2:
                abstractC153666vb = ((C25800BbH) ((C26835Bsx) this.A01).A0P.getValue()).A02.A00;
                abstractC153666vb.A04(null, null, C16930sl.A00, false);
                return;
            default:
                C25901Bd4 c25901Bd4 = (C25901Bd4) this.A01;
                ShimmerFrameLayout shimmerFrameLayout = c25901Bd4.A00;
                if (shimmerFrameLayout != null && !shimmerFrameLayout.A00) {
                    abstractC153666vb = c25901Bd4.A03.A03.A01;
                    abstractC153666vb.A04(null, null, C16930sl.A00, false);
                    return;
                }
                return;
        }
    }
}
