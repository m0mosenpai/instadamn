package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.JhQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44274JhQ implements MQL {
    public C44059Jdk A00;
    public final C44275JhR A01;
    public final List A02;

    public final void A00() {
        C44275JhR c44275JhR = this.A01;
        C44059Jdk A01 = c44275JhR.A01();
        if (A01 != null) {
            if (A01.A07 != null) {
                InterfaceC14020nS A00 = C14120nc.A00();
                final String str = A01.A07;
                A00.ATO(new AbstractRunnableC14200nk() { // from class: X.0ve
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(106, 4, false, false);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC13530mf.A09(str);
                    }
                });
            }
            boolean remove = c44275JhR.A01.remove(A01);
            C44276JhS c44276JhS = c44275JhR.A00;
            if (remove && c44276JhS != null) {
                c44276JhS.A00(A01);
                return;
            }
            return;
        }
        C0K8.A0D("ClipStackManager", "Attempted to delete a non-existent clip");
    }

    public final boolean A01() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            if (((C44059Jdk) it.next()).A05 != C05F.A00) {
                return true;
            }
        }
        return false;
    }

    @Override // X.MQL
    public final void D4o(C44059Jdk c44059Jdk, long j) {
        List list = this.A02;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((MRD) it.next()).D4n(c44059Jdk);
        }
        if (60000 - this.A01.A00() < 300) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((MRD) it2.next()).D4t();
            }
        }
    }

    @Override // X.MQL
    public final void D4u(C44059Jdk c44059Jdk, Integer num) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((MRD) it.next()).D4m(c44059Jdk, num);
        }
    }

    public C44274JhQ() {
        C44275JhR c44275JhR = new C44275JhR();
        this.A01 = c44275JhR;
        this.A02 = AbstractC166987dD.A1E();
        c44275JhR.A00 = new C44276JhS(this);
    }
}
