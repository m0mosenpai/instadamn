package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NQg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52633NQg extends C17T implements InterfaceC109814x8 {
    @Override // X.InterfaceC109814x8
    public final InterfaceC109794x6 AqY() {
        return (InterfaceC109794x6) A04(1356895302, C52629NQc.class);
    }

    @Override // X.InterfaceC109814x8
    public final InterfaceC109764x3 BdK() {
        return (InterfaceC109764x3) A04(-2123773938, C52630NQd.class);
    }

    @Override // X.InterfaceC109814x8
    public final List C8H() {
        return A0o(-1278380824, C52631NQe.class);
    }

    @Override // X.InterfaceC109814x8
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC53784Nqa.A00(this), this);
    }

    @Override // X.InterfaceC109814x8
    public final long AxP() {
        return A03(549122670);
    }

    @Override // X.InterfaceC109814x8
    public final long AxQ() {
        return A03(466154226);
    }

    @Override // X.InterfaceC109814x8
    public final long Bbi() {
        return A03(1375279474);
    }

    @Override // X.InterfaceC109814x8
    public final C109804x7 Ew5() {
        C109784x5 Ew1 = AqY().Ew1();
        long A03 = A03(549122670);
        long A032 = A03(466154226);
        long A033 = A03(1375279474);
        C109754x2 Ew2 = BdK().Ew2();
        List C8H = C8H();
        ArrayList A0q = AbstractC167017dG.A0q(C8H);
        Iterator it = C8H.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC109734x0) it.next()).Ew3());
        }
        return new C109804x7(Ew1, Ew2, A0q, A03, A032, A033);
    }
}
