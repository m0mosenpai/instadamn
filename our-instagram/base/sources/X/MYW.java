package X;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class MYW extends AbstractRunnableC14200nk {
    public final /* synthetic */ C209419Oa A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MYW(C209419Oa c209419Oa) {
        super(645279623, 3, false, false);
        this.A00 = c209419Oa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2PY c2py = this.A00.A01;
        ArrayList A00 = c2py.A00();
        C1YP c1yp = c2py.A01;
        c1yp.assertNotSuspendingTransaction();
        AbstractC29601bb abstractC29601bb = c2py.A03;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADi(1, 50L);
        try {
            c1yp.beginTransaction();
            try {
                acquire.ATb();
                c1yp.setTransactionSuccessful();
                abstractC29601bb.release(acquire);
                Iterator it = AbstractC001800i.A0e(A00, AbstractC001800i.A0V(c2py.A00())).iterator();
                while (it.hasNext()) {
                    AbstractC13530mf.A09(AbstractC166987dD.A1B(it));
                }
            } finally {
                c1yp.endTransaction();
            }
        } catch (Throwable th) {
            abstractC29601bb.release(acquire);
            throw th;
        }
    }
}
