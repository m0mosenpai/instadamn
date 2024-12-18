package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Is5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42526Is5 implements InterfaceC73233Pz {
    public List A00;
    public final QIy A01;
    public final boolean A02;

    public final List A00() {
        List list = this.A00;
        if (list != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(new C41100IHr((InterfaceC43468JIg) it.next()));
            }
            return A0q;
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        return C1XV.A0N;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return (Integer) this.A01.A01;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return (InterfaceC39571se) this.A01.A03;
    }

    @Override // X.InterfaceC73233Pz
    public final /* synthetic */ Integer BWa() {
        return null;
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        return this.A01.A06;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A0N;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return (Integer) this.A01.A04;
    }

    @Override // X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return this.A01.A05;
    }

    public C42526Is5(QIy qIy) {
        ArrayList arrayList;
        this.A01 = qIy;
        this.A02 = AbstractC167007dF.A1T((Boolean) qIy.A02);
        Collection collection = (Collection) qIy.A00;
        if (collection != null) {
            arrayList = AbstractC166987dD.A1F(collection);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((H3N) ((InterfaceC43468JIg) it.next())).A01 == null) {
                        it.remove();
                    }
                }
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
    }
}
