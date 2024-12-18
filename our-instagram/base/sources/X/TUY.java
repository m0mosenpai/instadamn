package X;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class TUY implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public TUY(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A05 = str;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A04 = obj;
        this.A02 = obj4;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Q0H q0h;
        if (this.A00 != 0) {
            C62688SMc c62688SMc = (C62688SMc) this.A01;
            String str = this.A05;
            ArrayList A00 = c62688SMc.A00(str);
            C69405Vmp c69405Vmp = (C69405Vmp) this.A04;
            AbstractC95374Qx abstractC95374Qx = (AbstractC95374Qx) this.A03;
            c69405Vmp.A00 = abstractC95374Qx.A00();
            C99O A002 = C99N.A00();
            String A003 = AbstractC61790Rtk.A00(c62688SMc.A00);
            synchronized (A002.A03) {
                A002.A02 = A003;
            }
            ((C69518Vqh) this.A02).A00(str, AbstractC61789Rtj.A00(abstractC95374Qx.A00(), A00));
            return A00;
        }
        String str2 = this.A05;
        String A0R = AnonymousClass001.A0R("fetchResponseForKey:", str2);
        C60921Rbb c60921Rbb = (C60921Rbb) this.A03;
        C63Q c63q = (C63Q) this.A04;
        try {
            C1LN.A01(AnonymousClass001.A0T("BloksComponentQueryDiskCache", A0R, ':'));
            C63C c63c = c63q.A03;
            c60921Rbb.A00("io_read_start", c63c.currentMonotonicTimestamp());
            C63P c63p = c63q.A01;
            C14360o3.A0B(str2, 0);
            byte[] readResourceToMemory = c63p.A00.readResourceToMemory(str2);
            c60921Rbb.A00("io_read_end", c63c.currentMonotonicTimestamp());
            if (readResourceToMemory != null) {
                c60921Rbb.A00(AbstractC111324zv.A00(4256), c63c.currentMonotonicTimestamp());
                q0h = AbstractC62262S4h.A00(readResourceToMemory);
                c60921Rbb.A00(AbstractC111324zv.A00(4255), c63c.currentMonotonicTimestamp());
            } else {
                q0h = null;
            }
            ((Executor) this.A01).execute(new TPP(c60921Rbb, q0h, (InterfaceC16660sJ) this.A02));
            return C0eB.A00;
        } finally {
            C1LN.A00();
        }
    }
}
