package X;

import androidx.paging.PageEvent$Insert;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class OJN {
    public int A00;
    public int A01;
    public OX8 A02;
    public boolean A03;
    public final C01U A05 = new C01U();
    public final OMK A04 = new OMK();

    public final List A00() {
        AbstractC53628NnZ c51060MhE;
        if (!this.A03) {
            return C16930sl.A00;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        OX8 A01 = this.A04.A01();
        C01U c01u = this.A05;
        if (AbstractC25226BEj.A1b(c01u)) {
            PageEvent$Insert pageEvent$Insert = PageEvent$Insert.A06;
            List A0a = AbstractC001800i.A0a(c01u);
            int i = this.A01;
            int i2 = this.A00;
            OX8 ox8 = this.A02;
            C14360o3.A0B(A01, 3);
            c51060MhE = new PageEvent$Insert(A01, ox8, EnumC53109NeM.REFRESH, A0a, i, i2);
        } else {
            c51060MhE = new C51060MhE(A01, this.A02);
        }
        A1E.add(c51060MhE);
        return A1E;
    }
}
