package X;

import androidx.fragment.app.Fragment;
import com.instagram.model.reels.Reel;
import com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Iw0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42762Iw0 implements InterfaceC57972PnI {
    public final int A00;
    public final Object A01;

    public C42762Iw0(HighlightsMigrationFragment highlightsMigrationFragment, int i) {
        this.A00 = i;
        this.A01 = highlightsMigrationFragment;
    }

    @Override // X.InterfaceC57972PnI
    public final void DqF(List list) {
        List<C32061E6n> A0g;
        C25671My A0Q;
        C155106xz c155106xz;
        if (this.A00 != 0) {
            if (list != null) {
                HighlightsMigrationFragment highlightsMigrationFragment = (HighlightsMigrationFragment) this.A01;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C32061E6n c32061E6n = (C32061E6n) it.next();
                    InterfaceC09390do interfaceC09390do = highlightsMigrationFragment.A0D;
                    Reel A0M = C1OU.A04(AbstractC166987dD.A0r(interfaceC09390do)).A0M(c32061E6n.A02);
                    if (A0M != null) {
                        AbstractC31176DnK.A0Q(interfaceC09390do).E4s(new C155106xz(A0M, 0, false));
                    }
                }
            }
            AbstractC31177DnL.A12((Fragment) this.A01);
            return;
        }
        if (list != null && (A0g = AbstractC001800i.A0g(list, new C37863GlI(1))) != null) {
            HighlightsMigrationFragment highlightsMigrationFragment2 = (HighlightsMigrationFragment) this.A01;
            for (C32061E6n c32061E6n2 : A0g) {
                InterfaceC09390do interfaceC09390do2 = highlightsMigrationFragment2.A0D;
                Reel A0M2 = C1OU.A04(AbstractC166987dD.A0r(interfaceC09390do2)).A0M(c32061E6n2.A02);
                if (A0M2 != null) {
                    if (c32061E6n2.A03) {
                        int i = c32061E6n2.A01;
                        A0Q = AbstractC31176DnK.A0Q(interfaceC09390do2);
                        c155106xz = new C155106xz(A0M2, i, true);
                    } else {
                        A0Q = AbstractC31176DnK.A0Q(interfaceC09390do2);
                        c155106xz = new C155106xz(A0M2, 0, false);
                    }
                    A0Q.E4s(c155106xz);
                }
            }
        }
    }
}
