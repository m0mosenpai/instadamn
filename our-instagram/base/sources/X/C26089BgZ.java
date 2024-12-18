package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;

/* renamed from: X.BgZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26089BgZ extends C0T6 implements InterfaceC30924Dib {
    public final long A00;
    public final long A01;
    public final Shader.TileMode A02;
    public final C50627MWo A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26089BgZ) {
                C26089BgZ c26089BgZ = (C26089BgZ) obj;
                if (C14360o3.A0K(this.A03, c26089BgZ.A03)) {
                    long j = this.A01;
                    long j2 = c26089BgZ.A01;
                    long j3 = AbstractC27755CLw.A00;
                    if (j != j2 || this.A00 != c26089BgZ.A00 || this.A02 != c26089BgZ.A02) {
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
        float A01 = AbstractC25227BEk.A01(j);
        float A00 = AbstractC25232BEp.A00(j);
        long j3 = this.A00;
        float A012 = AbstractC25227BEk.A01(j3);
        float A002 = AbstractC25232BEp.A00(j3);
        C50627MWo c50627MWo = this.A03;
        return new LinearGradient(A01, A00, A012, A002, (int[]) c50627MWo.A00, (float[]) c50627MWo.A01, this.A02);
    }

    public final int hashCode() {
        int A0G = AbstractC166987dD.A0G(this.A03);
        long j = this.A01;
        long j2 = AbstractC27755CLw.A00;
        return AbstractC166987dD.A0I(this.A02, AbstractC167007dF.A07(this.A00, AbstractC167007dF.A07(j, A0G)));
    }

    public C26089BgZ(Shader.TileMode tileMode, C50627MWo c50627MWo, long j, long j2) {
        this.A03 = c50627MWo;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = tileMode;
    }
}
