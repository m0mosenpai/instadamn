package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BoI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26559BoI extends AbstractC51572Yf {
    public final BX7 A00;
    public final C28272CdH A01;
    public final AbstractC27456C9y A02;
    public final InterfaceC16660sJ A03;
    public final boolean A04;
    public final C51722Yv A05;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        if (r22 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r45.A01.A03 == false) goto L6;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0oO, java.lang.Object] */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r46) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26559BoI.A0Y(X.3bS):X.2Vc");
    }

    private final boolean A03() {
        C40 c40;
        C28002CVz c28002CVz;
        AbstractC27456C9y abstractC27456C9y = this.A02;
        if (abstractC27456C9y instanceof C40) {
            c40 = (C40) abstractC27456C9y;
        } else {
            c40 = null;
        }
        if (c40 != null && (c28002CVz = c40.A00) != null) {
            List list = c28002CVz.A02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((C28266CdB) it.next()).A02 == C05F.A00) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public C26559BoI(C51722Yv c51722Yv, BX7 bx7, C28272CdH c28272CdH, AbstractC27456C9y abstractC27456C9y, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        AbstractC167027dH.A13(abstractC27456C9y, c28272CdH, bx7);
        this.A02 = abstractC27456C9y;
        this.A01 = c28272CdH;
        this.A00 = bx7;
        this.A05 = c51722Yv;
        this.A03 = interfaceC16660sJ;
        this.A04 = z;
    }
}
