package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.XVf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72189XVf extends AbstractC107474ss {
    public C42Q A00;
    public final C42N A03;
    public final List A04;
    public int A02 = 0;
    public boolean A01 = false;

    public static void A00(AbstractC107474ss abstractC107474ss, C72189XVf c72189XVf) {
        List list = c72189XVf.A04;
        if (abstractC107474ss == list.get(c72189XVf.A02)) {
            C42N c42n = c72189XVf.A03;
            abstractC107474ss.A01.remove(c42n);
            int i = c72189XVf.A02 + 1;
            c72189XVf.A02 = i;
            if (i >= list.size()) {
                c72189XVf.A03();
                c72189XVf.A01 = false;
                c72189XVf.A00 = null;
                return;
            } else {
                AbstractC107474ss abstractC107474ss2 = (AbstractC107474ss) list.get(c72189XVf.A02);
                abstractC107474ss2.A01.add(c42n);
                abstractC107474ss2.A09(c72189XVf.A00);
                return;
            }
        }
        throw AbstractC166987dD.A18("Unexpected Binding completed");
    }

    @Override // X.AbstractC107474ss
    public final void A08() {
        if (this.A01) {
            this.A01 = false;
            ((AbstractC107474ss) this.A04.get(this.A02)).A08();
        }
    }

    @Override // X.AbstractC107474ss
    public final void A09(C42Q c42q) {
        if (!this.A01) {
            if (!A06()) {
                A02();
                return;
            }
            A05();
            List list = this.A04;
            int size = list.size();
            for (int i = 1; i < size; i++) {
                ((AbstractC107474ss) list.get(i)).A07();
            }
            this.A01 = true;
            this.A00 = c42q;
            AbstractC107474ss abstractC107474ss = (AbstractC107474ss) list.get(0);
            abstractC107474ss.A01.add(this.A03);
            abstractC107474ss.A09(this.A00);
            return;
        }
        throw AbstractC166987dD.A18(MSV.A00(143));
    }

    @Override // X.AbstractC107474ss
    public final void A0A(ArrayList arrayList) {
        List list = this.A04;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC107474ss) list.get(i)).A0A(arrayList);
        }
    }

    public C72189XVf(List list) {
        this.A04 = list;
        if (!list.isEmpty()) {
            this.A03 = new YBD(this);
            return;
        }
        throw AbstractC166987dD.A12("Empty binding sequence");
    }

    @Override // X.AbstractC107474ss
    public final void A07() {
        A04();
        List list = this.A04;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC107474ss) list.get(i)).A07();
        }
    }

    @Override // X.AbstractC107474ss
    public final boolean A0B() {
        return this.A01;
    }
}
