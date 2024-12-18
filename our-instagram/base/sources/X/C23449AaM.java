package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AaM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23449AaM implements InterfaceC174637px {
    public final Comparator A00 = new C50585MUv(this, 11);

    @Override // X.InterfaceC174637px
    public final C176997tv ApU(EnumC174667q0 enumC174667q0, EnumC174667q0 enumC174667q02, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        AbstractC167017dG.A1O(list, list3);
        C176877tj c176877tj = (C176877tj) AbstractC166987dD.A16(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C176877tj c176877tj2 = (C176877tj) it.next();
            if (c176877tj.A02 * c176877tj.A01 < c176877tj2.A02 * c176877tj2.A01) {
                c176877tj = c176877tj2;
            }
        }
        double d = c176877tj.A01 / c176877tj.A02;
        int min = Math.min(i2, i);
        ArrayList A1F = AbstractC166987dD.A1F(list3);
        Comparator comparator = this.A00;
        C01T.A1D(A1F, comparator);
        List unmodifiableList = Collections.unmodifiableList(A1F);
        C14360o3.A07(unmodifiableList);
        Iterator it2 = unmodifiableList.iterator();
        C176877tj c176877tj3 = null;
        while (true) {
            if (it2.hasNext()) {
                C176877tj c176877tj4 = (C176877tj) it2.next();
                int i4 = c176877tj4.A01;
                int i5 = c176877tj4.A02;
                if (Math.abs((i4 / i5) - d) <= 0.1d && (c176877tj3 == null || c176877tj3.A02 * c176877tj3.A01 <= i5 * i4)) {
                    c176877tj3 = c176877tj4;
                    if (Math.min(i4, i5) >= min) {
                        break;
                    }
                }
            } else if (c176877tj3 == null) {
                ArrayList A1F2 = AbstractC166987dD.A1F(list3);
                C01T.A1D(A1F2, comparator);
                List<C176877tj> unmodifiableList2 = Collections.unmodifiableList(A1F2);
                C14360o3.A07(unmodifiableList2);
                for (C176877tj c176877tj5 : unmodifiableList2) {
                    if (c176877tj3 == null || c176877tj3.A02 * c176877tj3.A01 <= c176877tj5.A02 * c176877tj5.A01) {
                        c176877tj3 = c176877tj5;
                        if (Math.min(c176877tj5.A01, c176877tj5.A02) > min) {
                            break;
                        }
                    }
                }
            }
        }
        return new C176997tv(c176877tj3, c176877tj, c176877tj3, null);
    }

    @Override // X.InterfaceC174637px
    public final C176997tv Bcq(EnumC174667q0 enumC174667q0, List list, List list2, int i, int i2, int i3) {
        throw AbstractC166987dD.A1D("getPhotoModeSizes() is not implemented");
    }

    @Override // X.InterfaceC174637px
    public final C176997tv Bfv(List list, int i, int i2, int i3) {
        throw AbstractC166987dD.A1D("getPreviewModeSizes() is not implemented");
    }

    @Override // X.InterfaceC174637px
    public final C176997tv CFI(EnumC174667q0 enumC174667q0, List list, List list2, int i, int i2, int i3) {
        throw AbstractC166987dD.A1D("getVideoModeSizes() is not implemented");
    }
}
