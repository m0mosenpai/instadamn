package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Alignment;

/* renamed from: X.5E0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5E0 extends C5E1 {
    public C5Y6 A02;
    public Alignment A03;
    public boolean A04;
    public final InterfaceC74953Yl A05;
    public long A01 = C6G8.A00;
    public long A00 = C5AU.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);

    @Override // X.C5DW
    public final InterfaceC119205ac CpE(InterfaceC1131559d interfaceC1131559d, C59Z c59z, long j) {
        C59W CpF;
        long A07;
        if (c59z.CXp()) {
            this.A00 = j;
            this.A04 = true;
            CpF = interfaceC1131559d.CpF(j);
        } else {
            long j2 = j;
            if (this.A04) {
                j2 = this.A00;
            }
            CpF = interfaceC1131559d.CpF(j2);
        }
        long A00 = AbstractC119215ad.A00(CpF.A01, CpF.A00);
        if (c59z.CXp()) {
            this.A01 = A00;
            A07 = A00;
        } else {
            long j3 = this.A01;
            if (j3 == C6G8.A00) {
                j3 = A00;
            }
            InterfaceC74953Yl interfaceC74953Yl = this.A05;
            C6GY c6gy = (C6GY) interfaceC74953Yl.getValue();
            boolean z = true;
            if (c6gy != null) {
                C5Y1 c5y1 = c6gy.A01;
                InterfaceC74953Yl interfaceC74953Yl2 = c5y1.A04.A05;
                if (j3 == ((C119055aN) interfaceC74953Yl2.getValue()).A00 || ((Boolean) c5y1.A08.getValue()).booleanValue()) {
                    z = false;
                }
                if (j3 != ((C119055aN) c5y1.A09.getValue()).A00 || z) {
                    c6gy.A00 = ((C119055aN) interfaceC74953Yl2.getValue()).A00;
                    C19L A05 = A05();
                    C9D7 c9d7 = new C9D7(c6gy, this, (InterfaceC23621Ds) null, j3);
                    AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d7, A05);
                }
            } else {
                c6gy = new C6GY(new C5Y1(AbstractC118445Xg.A04, new C119055aN(j3), new C119055aN(1 | (1 << 32))), j3);
            }
            interfaceC74953Yl.Egh(c6gy);
            A07 = C5AU.A07(j, ((C119055aN) c6gy.A01.A04.A05.getValue()).A00);
        }
        int i = (int) (A07 >> 32);
        int A002 = C119055aN.A00(A07);
        return c59z.Cgx(AbstractC06930Yk.A0E(), new C6GZ(this, c59z, CpF, i, A002, A00), i, A002);
    }

    public C5E0(C5Y6 c5y6, Alignment alignment) {
        this.A02 = c5y6;
        this.A03 = alignment;
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A05 = new ParcelableSnapshotMutableState(A00, null);
    }
}
