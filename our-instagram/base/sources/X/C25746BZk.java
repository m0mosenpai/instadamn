package X;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;

/* renamed from: X.BZk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25746BZk extends C58J implements InterfaceC113445Ag, InterfaceC114155Db {
    public float A00;
    public C5WI A01;
    public C5YC A02;
    public AbstractC119385av A03;
    public C5AH A04;
    public AnonymousClass583 A05;
    public C27836COz A06;
    public C25763Ba2 A07;
    public List A08;

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        AbstractC119385av AMh;
        C14360o3.A0B(interfaceC1129057z, 0);
        C5WI c5wi = this.A01;
        C5WH c5wh = c5wi.A03;
        if (C14360o3.A0K(c5wh, c5wi.A02) && C14360o3.A0K(c5wh, c5wi.A01) && C14360o3.A0K(c5wh, c5wi.A00)) {
            C25763Ba2 c25763Ba2 = this.A07;
            C5WH c5wh2 = this.A01.A03;
            long Bxc = interfaceC1129057z.Bxc();
            float EqU = c5wh2.EqU(interfaceC1129057z, Bxc);
            long A00 = AbstractC137636Lj.A00(EqU, EqU);
            interfaceC1129057z.AR3(c25763Ba2, null, C119815bf.A00, 1.0f, 3, 0L, C62U.A00(Bxc, 0L), A00);
        } else {
            long Bxc2 = interfaceC1129057z.Bxc();
            C5YC c5yc = this.A02;
            if (c5yc != null && Bxc2 == c5yc.A00 && interfaceC1129057z.getLayoutDirection() == this.A05 && C14360o3.A0K(this.A04, this.A01)) {
                AMh = this.A03;
                if (AMh == null) {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                AMh = this.A01.AMh(interfaceC1129057z, interfaceC1129057z.getLayoutDirection(), interfaceC1129057z.Bxc());
            }
            CBE.A00(this.A07, AMh, interfaceC1129057z, C119815bf.A00, 1.0f);
            this.A03 = AMh;
            this.A02 = new C5YC(interfaceC1129057z.Bxc());
            this.A05 = interfaceC1129057z.getLayoutDirection();
            this.A04 = this.A01;
        }
        interfaceC1129057z.AQf();
    }

    @Override // X.InterfaceC114155Db
    public final void DJc(InterfaceC1131459c interfaceC1131459c) {
        float A02;
        C14360o3.A0B(interfaceC1131459c, 0);
        C27836COz c27836COz = this.A06;
        if (c27836COz != null) {
            C27209BzS c27209BzS = c27836COz.A00;
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            A02 = c27209BzS.A00.getTop();
        } else {
            InterfaceC1131459c BbN = interfaceC1131459c.BbN();
            long j = 0;
            if (BbN != null) {
                j = BbN.Chl(interfaceC1131459c, 0L);
            }
            A02 = C119365at.A02(j);
        }
        C25763Ba2 c25763Ba2 = this.A07;
        if (A02 != c25763Ba2.A00) {
            c25763Ba2.A00 = A02;
            Matrix matrix = c25763Ba2.A02;
            matrix.setTranslate(0.0f, -A02);
            Shader shader = c25763Ba2.A01;
            if (shader != null) {
                shader.setLocalMatrix(matrix);
            }
            C5Zx.A00(this);
        }
    }

    @Override // X.InterfaceC113445Ag
    public final /* synthetic */ void DRD() {
    }
}
