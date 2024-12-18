package X;

import android.graphics.Rect;

/* loaded from: classes5.dex */
public final class BXJ implements InterfaceC113845Bw {
    public InterfaceC30781DgI A00;
    public C28845CoF A01;
    public AnonymousClass195 A02;
    public InterfaceC06180Ui A03;

    private final void A01(InterfaceC16660sJ interfaceC16660sJ) {
        Object obj = this.A00;
        if (obj != null) {
            C23671Dx c23671Dx = null;
            MCP mcp = new MCP((InterfaceC23621Ds) null, this, obj, interfaceC16660sJ, 3);
            C58J c58j = (C58J) obj;
            if (c58j.A08) {
                C19L A05 = c58j.A05();
                c23671Dx = AbstractC23641Du.A03(C05F.A0N, AnonymousClass191.A00, new D52(c58j, mcp, (InterfaceC23621Ds) null, 17), A05);
            }
            this.A02 = c23671Dx;
        }
    }

    @Override // X.InterfaceC113845Bw
    public final void EnQ() {
        A01(null);
    }

    @Override // X.InterfaceC113845Bw
    public final void EnR(C114085Cu c114085Cu, C5C3 c5c3, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        A01(new MIL(1, c114085Cu, this, interfaceC16660sJ2, c5c3, interfaceC16660sJ));
    }

    public static final InterfaceC06180Ui A00(BXJ bxj) {
        InterfaceC06180Ui interfaceC06180Ui = bxj.A03;
        if (interfaceC06180Ui == null) {
            if (!AbstractC27745CLm.A00) {
                return null;
            }
            AnonymousClass057 A00 = C10M.A00(C05F.A0C, 1, 0);
            bxj.A03 = A00;
            return A00;
        }
        return interfaceC06180Ui;
    }

    public final void A02(InterfaceC30781DgI interfaceC30781DgI) {
        if (this.A00 == interfaceC30781DgI) {
            this.A00 = null;
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Expected textInputModifierNode to be ");
        A1C.append(interfaceC30781DgI);
        A1C.append(AbstractC111324zv.A00(1384));
        throw AbstractC166987dD.A14(AbstractC166997dE.A0v(this.A00, A1C));
    }

    @Override // X.InterfaceC113845Bw
    public final void CMy() {
        InterfaceC30781DgI interfaceC30781DgI = this.A00;
        if (interfaceC30781DgI != null) {
            C5D2 c5d2 = (C5D2) C5Zy.A00(C5V2.A0A, (BXK) interfaceC30781DgI);
            if (c5d2 != null) {
                c5d2.hide();
            }
        }
    }

    @Override // X.InterfaceC113845Bw
    public final void CtA(C114205Dh c114205Dh) {
        Rect rect;
        C28845CoF c28845CoF = this.A01;
        if (c28845CoF != null) {
            c28845CoF.A00 = new Rect(C1H4.A01(c114205Dh.A01), C1H4.A01(c114205Dh.A03), C1H4.A01(c114205Dh.A02), C1H4.A01(c114205Dh.A00));
            if (c28845CoF.A06.isEmpty() && (rect = c28845CoF.A00) != null) {
                c28845CoF.A09.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    @Override // X.InterfaceC113845Bw
    public final void Ele() {
        InterfaceC30781DgI interfaceC30781DgI = this.A00;
        if (interfaceC30781DgI != null) {
            C5D2 c5d2 = (C5D2) C5Zy.A00(C5V2.A0A, (BXK) interfaceC30781DgI);
            if (c5d2 != null) {
                c5d2.show();
            }
        }
    }

    @Override // X.InterfaceC113845Bw
    public final void Eoa() {
        AnonymousClass195 anonymousClass195 = this.A02;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A02 = null;
        InterfaceC06180Ui A00 = A00(this);
        if (A00 != null) {
            A00.EJt();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (X.C14360o3.A0K(r7.A02, r15.A02) == false) goto L8;
     */
    @Override // X.InterfaceC113845Bw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FCH(X.C5C3 r14, X.C5C3 r15) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BXJ.FCH(X.5C3, X.5C3):void");
    }

    @Override // X.InterfaceC113845Bw
    public final void FCR(C114205Dh c114205Dh, C114205Dh c114205Dh2, C127055oj c127055oj, InterfaceC31114Dlw interfaceC31114Dlw, C5C3 c5c3, InterfaceC16660sJ interfaceC16660sJ) {
        C28845CoF c28845CoF = this.A01;
        if (c28845CoF != null) {
            C28190Cbe c28190Cbe = c28845CoF.A0B;
            synchronized (c28190Cbe.A0B) {
                c28190Cbe.A04 = c5c3;
                c28190Cbe.A03 = interfaceC31114Dlw;
                c28190Cbe.A02 = c127055oj;
                c28190Cbe.A01 = c114205Dh;
                c28190Cbe.A00 = c114205Dh2;
                if (c28190Cbe.A05 || c28190Cbe.A0A) {
                    C28190Cbe.A00(c28190Cbe);
                }
            }
        }
    }
}
