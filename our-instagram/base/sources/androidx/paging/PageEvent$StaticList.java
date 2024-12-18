package androidx.paging;

import X.AbstractC001800i;
import X.AbstractC16490ru;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC50522MSa;
import X.AbstractC53628NnZ;
import X.AnonymousClass001;
import X.C14360o3;
import X.OX8;
import java.util.List;

/* loaded from: classes9.dex */
public final class PageEvent$StaticList extends AbstractC53628NnZ {
    public final OX8 A00;
    public final OX8 A01;
    public final List A02;

    public PageEvent$StaticList(OX8 ox8, OX8 ox82, List list) {
        C14360o3.A0B(list, 1);
        this.A02 = list;
        this.A01 = ox8;
        this.A00 = ox82;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageEvent$StaticList) {
                PageEvent$StaticList pageEvent$StaticList = (PageEvent$StaticList) obj;
                if (!C14360o3.A0K(this.A02, pageEvent$StaticList.A02) || !C14360o3.A0K(this.A01, pageEvent$StaticList.A01) || !C14360o3.A0K(this.A00, pageEvent$StaticList.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A02) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public final String toString() {
        OX8 ox8 = this.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PageEvent.StaticList with ");
        List list = this.A02;
        A1C.append(list.size());
        A1C.append(" items (\n                    |   first item: ");
        A1C.append(AbstractC001800i.A0J(list));
        A1C.append("\n                    |   last item: ");
        A1C.append(AbstractC001800i.A0L(list));
        A1C.append("\n                    |   sourceLoadStates: ");
        A1C.append(this.A01);
        return AbstractC16490ru.A0q(AnonymousClass001.A0R(AbstractC50522MSa.A0l(ox8, "\n                    ", A1C), "|)"), "|");
    }
}
