package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.Bgl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26101Bgl extends C0T6 implements InterfaceC30926Did {
    public final float A00;
    public final float A01;
    public final float A02;
    public final long A03;
    public final boolean A04;

    @Override // X.InterfaceC30926Did
    public final void ACE(Path path, C28225CcV c28225CcV) {
        C14360o3.A0B(path, 0);
        long j = this.A03;
        float f = this.A01;
        C09530e4 A00 = CCQ.A00(this.A02, this.A00, this.A04);
        float A09 = AbstractC166987dD.A09(A00.A00);
        float A092 = AbstractC166987dD.A09(A00.A01);
        long j2 = AbstractC27755CLw.A00;
        float A002 = AbstractC25231BEo.A00(j);
        float A003 = AbstractC25232BEp.A00(j);
        path.arcTo(new RectF(A002 - f, A003 - f, A002 + f, A003 + f), A09, A092);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26101Bgl) {
                C26101Bgl c26101Bgl = (C26101Bgl) obj;
                long j = this.A03;
                long j2 = c26101Bgl.A03;
                long j3 = AbstractC27755CLw.A00;
                if (j != j2 || Float.compare(this.A01, c26101Bgl.A01) != 0 || Float.compare(this.A02, c26101Bgl.A02) != 0 || Float.compare(this.A00, c26101Bgl.A00) != 0 || this.A04 != c26101Bgl.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A03;
        long j2 = AbstractC27755CLw.A00;
        return AbstractC166987dD.A0K(this.A04, AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC25235BEs.A03(j), this.A01), this.A02), this.A00));
    }

    public C26101Bgl(float f, float f2, float f3, long j, boolean z) {
        this.A03 = j;
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A04 = z;
    }
}
