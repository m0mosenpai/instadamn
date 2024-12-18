package X;

import android.graphics.RadialGradient;
import android.graphics.Shader;

/* renamed from: X.Bga, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26090Bga extends C0T6 implements InterfaceC30924Dib {
    public final float A00;
    public final long A01;
    public final Shader.TileMode A02;
    public final C50627MWo A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26090Bga) {
                C26090Bga c26090Bga = (C26090Bga) obj;
                if (C14360o3.A0K(this.A03, c26090Bga.A03)) {
                    long j = this.A01;
                    long j2 = c26090Bga.A01;
                    long j3 = AbstractC27755CLw.A00;
                    if (j != j2 || Float.compare(this.A00, c26090Bga.A00) != 0 || this.A02 != c26090Bga.A02) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC30924Dib
    public final Shader F7h() {
        long j = this.A01;
        long j2 = AbstractC27755CLw.A00;
        float A00 = AbstractC25231BEo.A00(j);
        float A002 = AbstractC25232BEp.A00(j);
        float f = this.A00;
        C50627MWo c50627MWo = this.A03;
        return new RadialGradient(A00, A002, f, (int[]) c50627MWo.A00, (float[]) c50627MWo.A01, this.A02);
    }

    public final int hashCode() {
        int A0G = AbstractC166987dD.A0G(this.A03);
        long j = this.A01;
        long j2 = AbstractC27755CLw.A00;
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A00(AbstractC25236BEt.A01(j, A0G), this.A00));
    }

    public C26090Bga(Shader.TileMode tileMode, C50627MWo c50627MWo, float f, long j) {
        this.A03 = c50627MWo;
        this.A01 = j;
        this.A00 = f;
        this.A02 = tileMode;
    }
}
