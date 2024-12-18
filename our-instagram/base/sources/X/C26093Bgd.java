package X;

import android.graphics.Canvas;
import java.util.List;

/* renamed from: X.Bgd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26093Bgd extends C0T6 implements InterfaceC30925Dic {
    public final float A00;
    public final int A01;
    public final long A02;
    public final C26104Bgo A03;
    public final List A04;
    public final C26112Bgw A05;

    @Override // X.InterfaceC30925Dic
    public final void AQT(Canvas canvas, C28225CcV c28225CcV) {
        C14360o3.A0B(c28225CcV, 1);
        c28225CcV.A01(this.A05, new DHZ(31, canvas, this, c28225CcV));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26093Bgd) {
                C26093Bgd c26093Bgd = (C26093Bgd) obj;
                if (!C14360o3.A0K(this.A05, c26093Bgd.A05) || this.A02 != c26093Bgd.A02 || !C14360o3.A0K(this.A03, c26093Bgd.A03) || Float.compare(this.A00, c26093Bgd.A00) != 0 || this.A01 != c26093Bgd.A01 || !C14360o3.A0K(this.A04, c26093Bgd.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A04, (AbstractC166997dE.A00((AbstractC25236BEt.A01(this.A02, AbstractC166987dD.A0G(this.A05)) + AbstractC167017dG.A0M(this.A03)) * 31, this.A00) + this.A01) * 31);
    }

    public C26093Bgd(C26104Bgo c26104Bgo, C26112Bgw c26112Bgw, List list, float f, int i, long j) {
        this.A05 = c26112Bgw;
        this.A02 = j;
        this.A03 = c26104Bgo;
        this.A00 = f;
        this.A01 = i;
        this.A04 = list;
    }
}
