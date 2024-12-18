package X;

import com.instagram.archive.fragment.ArchiveReelHighlightsFragment;
import java.util.Iterator;

/* renamed from: X.P8i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56536P8i implements InterfaceC58058Poj {
    public final int A00;
    public final Object A01;

    public C56536P8i(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC58058Poj
    public final void DWe() {
        C66362zD c66362zD;
        switch (this.A00) {
            case 0:
                P2X p2x = ((ArchiveReelHighlightsFragment) this.A01).A00;
                if (p2x == null) {
                    AbstractC31171DnF.A0t();
                    throw C00O.createAndThrow();
                }
                Iterator it = p2x.A0A.iterator();
                while (it.hasNext()) {
                    ((C56113OvY) it.next()).A03 = false;
                }
                c66362zD = p2x.A05;
                break;
            case 1:
            default:
                return;
            case 2:
                C52167N6w c52167N6w = (C52167N6w) this.A01;
                P2Y p2y = c52167N6w.A02;
                if (p2y != null) {
                    Iterator it2 = p2y.A0E.iterator();
                    while (it2.hasNext()) {
                        ((C56113OvY) it2.next()).A03 = false;
                    }
                }
                P2Y p2y2 = c52167N6w.A02;
                if (p2y2 == null) {
                    return;
                }
                c66362zD = p2y2.A09;
                break;
        }
        c66362zD.notifyDataSetChanged();
    }

    @Override // X.InterfaceC58058Poj
    public final void Ddx() {
        switch (this.A00) {
            case 1:
                AbstractC43593JPy.A1Q(this.A01);
                return;
            case 2:
            default:
                return;
            case 3:
                ((InterfaceC24901Jp) this.A01).EKh(null, C0eB.A00);
                return;
        }
    }
}
