package X;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AWE implements BBS {
    public final /* synthetic */ C179887ye A00;

    public AWE(C179887ye c179887ye) {
        this.A00 = c179887ye;
    }

    @Override // X.BBS
    public final void DX1(int i, int i2) {
        C179887ye c179887ye = this.A00;
        if (c179887ye.A00 != i) {
            c179887ye.A00 = i;
            Iterator A0k = AbstractC167007dF.A0k(c179887ye.A04);
            while (A0k.hasNext()) {
                ((C176507t8) AbstractC166997dE.A0l(A0k)).A06 = c179887ye.A00;
            }
        }
    }
}
