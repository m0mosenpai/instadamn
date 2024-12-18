package X;

import java.io.Serializable;
import java.util.List;

/* renamed from: X.T2a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64171T2a implements InterfaceC65620ToB, Serializable {
    public final TIH A00;
    public transient List A01;

    @Override // X.InterfaceC65620ToB
    public final C45U AVZ(C45T c45t, Class cls) {
        RBL BSA;
        C45U A04;
        C45U c45u = C45U.A07;
        C44W A00 = c45t.A00();
        if (A00 != null && (BSA = BSA()) != null && (A04 = A00.A04(BSA)) != null) {
            return c45u.A00(A04);
        }
        return c45u;
    }

    @Override // X.InterfaceC65620ToB
    public final TIH BTQ() {
        if (this instanceof R9k) {
            R9k r9k = (R9k) this;
            TIH tih = ((AbstractC64171T2a) r9k).A00;
            RBV rbv = r9k.A00;
            if (rbv != null) {
                return tih.A01(rbv.BTQ().A06);
            }
            return tih;
        }
        return this.A00;
    }

    public AbstractC64171T2a(TIH tih) {
        this.A00 = tih == null ? TIH.A09 : tih;
    }

    @Override // X.InterfaceC65620ToB
    public final C45H AVa(C45T c45t, Class cls) {
        C44W A00 = c45t.A00();
        RBL BSA = BSA();
        if (BSA == null) {
            return ((C45S) c45t).A01.A00;
        }
        BSA.A04();
        C45H c45h = ((C45S) c45t).A01.A00;
        if (A00 == null) {
            return c45h;
        }
        return c45h.A00(A00.A06(BSA));
    }

    public AbstractC64171T2a(AbstractC64171T2a abstractC64171T2a) {
        this.A00 = abstractC64171T2a.A00;
    }
}
