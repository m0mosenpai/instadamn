package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Lga, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48706Lga implements MR2 {
    public final /* synthetic */ L4U A00;

    @Override // X.MR2
    public final void CwC() {
    }

    @Override // X.MR2
    public final void CwE(C148286ly c148286ly, EnumC46186KcO enumC46186KcO, int i) {
        MRR mrr;
        C14360o3.A0B(enumC46186KcO, 2);
        C47933LFf c47933LFf = this.A00.A03.A0J.A00.A00;
        if (c47933LFf != null && (mrr = C47933LFf.A00(c47933LFf).A02) != null) {
            mrr.Cu8(c148286ly, enumC46186KcO, i);
        }
    }

    @Override // X.MR2
    public final void CwS(JWd jWd, int i) {
    }

    @Override // X.MR2
    public final void Deq(int i) {
    }

    public C48706Lga(L4U l4u) {
        this.A00 = l4u;
    }

    @Override // X.MR2
    public final void Dvy(String str) {
        Object obj;
        C48733Lh1 c48733Lh1 = this.A00.A03;
        ArrayList A0U = AbstractC001800i.A0U(c48733Lh1.A09.A04);
        Iterator it = A0U.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C45105JxZ) obj).A01(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C15500q5.A00(A0U).remove(obj);
        C45104JxY c45104JxY = c48733Lh1.A09;
        C48733Lh1.A03(c48733Lh1, c45104JxY, c45104JxY.A00, c45104JxY.A02, A0U);
    }
}
