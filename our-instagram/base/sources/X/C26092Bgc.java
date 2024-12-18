package X;

import android.graphics.Canvas;
import java.util.List;

/* renamed from: X.Bgc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26092Bgc extends C0T6 implements InterfaceC30925Dic {
    public final long A00;
    public final C26104Bgo A01;
    public final List A02;
    public final boolean A03;
    public final C26112Bgw A04;

    @Override // X.InterfaceC30925Dic
    public final void AQT(Canvas canvas, C28225CcV c28225CcV) {
        C14360o3.A0B(c28225CcV, 1);
        c28225CcV.A01(this.A04, new DHZ(30, canvas, this, c28225CcV));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26092Bgc) {
                C26092Bgc c26092Bgc = (C26092Bgc) obj;
                if (!C14360o3.A0K(this.A04, c26092Bgc.A04) || this.A00 != c26092Bgc.A00 || !C14360o3.A0K(this.A01, c26092Bgc.A01) || this.A03 != c26092Bgc.A03 || !C14360o3.A0K(this.A02, c26092Bgc.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC167007dF.A0D(this.A03, (AbstractC25236BEt.A01(this.A00, AbstractC166987dD.A0G(this.A04)) + AbstractC167017dG.A0M(this.A01)) * 31));
    }

    public C26092Bgc(C26104Bgo c26104Bgo, C26112Bgw c26112Bgw, List list, long j, boolean z) {
        this.A04 = c26112Bgw;
        this.A00 = j;
        this.A01 = c26104Bgo;
        this.A03 = z;
        this.A02 = list;
    }
}
