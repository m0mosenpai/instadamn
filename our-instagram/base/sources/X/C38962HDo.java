package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HDo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38962HDo extends C124275jh {
    public String A00;
    public List A01 = C16930sl.A00;
    public boolean A02;

    @Override // X.C124275jh, X.InterfaceC124295jj
    public final List AoP() {
        List<C38252Grv> list = this.A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (C38252Grv c38252Grv : list) {
            c38252Grv.A02();
            if (c38252Grv.A02().size() != 0) {
                A1E.add(c38252Grv.A01());
            }
        }
        ImmutableList A0L = AbstractC31173DnH.A0L(A1E);
        ArrayList A0q = AbstractC167017dG.A0q(A0L);
        Iterator<E> it = A0L.iterator();
        while (it.hasNext()) {
            A0q.add(C128085qc.A03((C40971v4) it.next()));
        }
        return AbstractC31172DnG.A19(A0q);
    }

    @Override // X.C124275jh, X.InterfaceC124295jj
    public final InterfaceC111084zP BbA() {
        C125905mf A00 = InterfaceC111084zP.A00.A00(this.A02);
        A00.A00 = this.A00;
        return A00.A00();
    }

    @Override // X.C124275jh, X.InterfaceC74303Vl
    public final boolean CQG() {
        return true;
    }

    @Override // X.C124275jh, X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A00;
    }

    public final void A01() {
        super.A00();
    }
}
