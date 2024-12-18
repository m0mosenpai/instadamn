package X;

import com.instagram.api.schemas.MediaVCRTappableData;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes5.dex */
public final class BKM extends AbstractC37623GhI implements JIH, InterfaceC31029DkS {
    public final C37560GgG A00;
    public final java.util.Set A01;

    public BKM(C37560GgG c37560GgG) {
        C14360o3.A0B(c37560GgG, 1);
        this.A00 = c37560GgG;
        this.A01 = new LinkedHashSet();
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
        MediaVCRTappableData mediaVCRTappableData;
        C14360o3.A0B(c120985dq, 0);
        java.util.Set set = this.A01;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            BOG bog = ((BO6) it.next()).A00;
            bog.A03.A05(i, i2);
            bog.A04.A04(i);
        }
        List BlY = c120985dq.BlY(EnumC75383a5.A18);
        if ((!BlY.isEmpty()) && (mediaVCRTappableData = ((C84823qW) BlY.get(0)).A0K) != null) {
            Float f = mediaVCRTappableData.A02;
            Float f2 = mediaVCRTappableData.A01;
            if (f != null && f2 != null) {
                int floor = (int) Math.floor(f.floatValue());
                if (i < ((int) Math.ceil(f2.floatValue())) && floor <= i) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        InterfaceC56392iX interfaceC56392iX = ((BO6) it2.next()).A00.A01.A03;
                        if (interfaceC56392iX != null) {
                            interfaceC56392iX.setVisibility(0);
                        }
                    }
                    return;
                }
                if (i >= 0 && i < i2) {
                    Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        InterfaceC56392iX interfaceC56392iX2 = ((BO6) it3.next()).A00.A01.A03;
                        if (interfaceC56392iX2 != null) {
                            interfaceC56392iX2.setVisibility(8);
                        }
                    }
                }
            }
        }
    }

    @Override // X.JIH
    public final void E1V() {
    }

    @Override // X.InterfaceC31029DkS
    public final void EFZ(BO6 bo6) {
        C14360o3.A0B(bo6, 0);
        this.A01.remove(bo6);
    }

    @Override // X.AbstractC37623GhI
    public final void A0A() {
        this.A00.A99(this);
    }

    @Override // X.InterfaceC31029DkS
    public final void A98(BO6 bo6) {
        this.A01.add(bo6);
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }
}
