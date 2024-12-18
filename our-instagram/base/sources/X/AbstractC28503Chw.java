package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.Chw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28503Chw {
    public static final C5Y4 A01;
    public static final C5Y4 A02;
    public static final InterfaceC118485Xk A03 = new C118475Xj(C29956DIu.A00, C29957DIv.A00);
    public static final C5Y4 A00 = AbstractC25225BEi.A0I(null, 1.0f, 400.0f);

    public static /* synthetic */ BZO A04(InterfaceC118225Wj interfaceC118225Wj, int i) {
        Alignment alignment;
        boolean z = false;
        C29961DIz c29961DIz = null;
        C5Y4 A0I = (i & 1) != 0 ? AbstractC25225BEi.A0I(new C119055aN(AbstractC25232BEp.A0q()), 1.0f, 400.0f) : null;
        if ((i & 2) != 0) {
            interfaceC118225Wj = C118195Wf.A03;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            c29961DIz = C29961DIz.A00;
        }
        if (C14360o3.A0K(interfaceC118225Wj, C118195Wf.A05)) {
            alignment = C118195Wf.A0C;
        } else if (C14360o3.A0K(interfaceC118225Wj, C118195Wf.A03)) {
            alignment = C118195Wf.A06;
        } else {
            alignment = C118195Wf.A09;
        }
        return A03(A0I, alignment, DRS.A00(c29961DIz, 9), z);
    }

    public static /* synthetic */ BZP A09(InterfaceC118225Wj interfaceC118225Wj, int i) {
        Alignment alignment;
        boolean z = false;
        DJ2 dj2 = null;
        C5Y4 A0I = (i & 1) != 0 ? AbstractC25225BEi.A0I(new C119055aN(AbstractC25232BEp.A0q()), 1.0f, 400.0f) : null;
        if ((i & 2) != 0) {
            interfaceC118225Wj = C118195Wf.A03;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            dj2 = DJ2.A00;
        }
        if (C14360o3.A0K(interfaceC118225Wj, C118195Wf.A05)) {
            alignment = C118195Wf.A0C;
        } else if (C14360o3.A0K(interfaceC118225Wj, C118195Wf.A03)) {
            alignment = C118195Wf.A06;
        } else {
            alignment = C118195Wf.A09;
        }
        return A08(A0I, alignment, DRS.A00(dj2, 11), z);
    }

    static {
        long A0q = AbstractC25232BEp.A0q();
        A01 = AbstractC25225BEi.A0I(new C119235af(A0q), 1.0f, 400.0f);
        A02 = AbstractC25225BEi.A0I(new C119055aN(A0q), 1.0f, 400.0f);
    }

    public static final BZO A01(C5Y5 c5y5, float f) {
        CWS cws = CWS.A00;
        return new BZO(new C28271CdG(null, new CVC(c5y5, f), null, null, AbstractC06930Yk.A0E(), false));
    }

    public static final BZO A02(C5Y5 c5y5, float f, long j) {
        CWS cws = CWS.A00;
        return new BZO(new C28271CdG(null, null, new C27981CVd(c5y5, f, j), null, AbstractC06930Yk.A0E(), false));
    }

    public static final BZO A03(C5Y5 c5y5, Alignment alignment, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        CWS cws = CWS.A00;
        return new BZO(new C28271CdG(new C27995CVs(c5y5, alignment, interfaceC16660sJ, z), null, null, null, AbstractC06930Yk.A0E(), false));
    }

    public static final BZP A06(C5Y5 c5y5, float f) {
        CWT cwt = CWT.A00;
        return new BZP(new C28271CdG(null, new CVC(c5y5, f), null, null, AbstractC06930Yk.A0E(), false));
    }

    public static final BZP A07(C5Y5 c5y5, float f, long j) {
        CWT cwt = CWT.A00;
        return new BZP(new C28271CdG(null, null, new C27981CVd(c5y5, f, j), null, AbstractC06930Yk.A0E(), false));
    }

    public static final BZP A08(C5Y5 c5y5, Alignment alignment, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        CWT cwt = CWT.A00;
        return new BZP(new C28271CdG(new C27995CVs(c5y5, alignment, interfaceC16660sJ, z), null, null, null, AbstractC06930Yk.A0E(), false));
    }
}
