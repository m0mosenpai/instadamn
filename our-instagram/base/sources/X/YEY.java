package X;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public final class YEY implements InterfaceC12870lZ {
    public final int A00;
    public final Object A01;

    public YEY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-936863195);
                C02780Bc c02780Bc = ((C73299Xzp) this.A01).A00;
                synchronized (c02780Bc) {
                    SparseArray sparseArray = c02780Bc.A01;
                    int size = sparseArray.size();
                    if (size != 0) {
                        List unmodifiableList = Collections.unmodifiableList(AbstractC166987dD.A1F(c02780Bc.A05));
                        for (int i2 = 0; i2 < size; i2++) {
                            c02780Bc.A04.EmS(new C02760Ba(C05F.A00, (Throwable) sparseArray.valueAt(i2), unmodifiableList), "CameraLeakListener:LEFT_OPEN_IN_BACKGROUND");
                        }
                    }
                }
                i = -1718021212;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A03 = C0f9.A03(-603587920);
                C47910LEe.A00((C47910LEe) this.A01, (short) 630);
                i = -634783806;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = C0f9.A03(-1422228601);
                C47619L1e c47619L1e = (C47619L1e) this.A01;
                c47619L1e.A00.markerEnd(20128591, (short) 630);
                C218914p.A06(c47619L1e.A01);
                i = -464350292;
                C0f9.A0A(i, A03);
                return;
            default:
                A03 = C0f9.A03(-627223570);
                WG5.A02(((V1R) this.A01).A0c, AbstractC111324zv.A00(173));
                i = 1815338893;
                C0f9.A0A(i, A03);
                return;
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(2013870803);
                i = -1143644945;
                break;
            case 1:
                A03 = C0f9.A03(-1414445857);
                i = -1073750373;
                break;
            case 2:
                A03 = C0f9.A03(2048003753);
                i = -417650669;
                break;
            default:
                A03 = C0f9.A03(1447904703);
                i = -201750687;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
