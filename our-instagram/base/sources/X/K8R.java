package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class K8R extends C40781ul implements InterfaceC168867gL {
    public C46499Khy A00;
    public C46519KiI A01;

    @Override // X.InterfaceC168867gL
    public final Object B3l() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final String Bk6() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final Integer BmK() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final String Bo9() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final List Bri() {
        return null;
    }

    @Override // X.InterfaceC168867gL
    public final boolean CLI() {
        return false;
    }

    @Override // X.InterfaceC168867gL, X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    @Override // X.InterfaceC168867gL
    public final List getItems() {
        ?? A1E;
        EnumC150226pU enumC150226pU;
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (C148276lx c148276lx : this.A01.A00()) {
            C14360o3.A0B(c148276lx, 1);
            A1E2.add(new C148306m0(c148276lx));
        }
        List list = this.A01.A01;
        if (list == null) {
            A1E = Collections.emptyList();
        } else {
            A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C148286ly A0Y = AbstractC43592JPx.A0Y(it);
                String str = A0Y.A0a;
                A0Y.A0S = str;
                C148276lx c148276lx2 = C148276lx.A1d;
                List singletonList = Collections.singletonList(A0Y);
                if (A0Y.A0S.startsWith("cutout_video_")) {
                    enumC150226pU = EnumC150226pU.A0M;
                } else {
                    enumC150226pU = EnumC150226pU.A0L;
                }
                A1E.add(new C148276lx(enumC150226pU, str, singletonList));
            }
        }
        Iterator it2 = A1E.iterator();
        while (it2.hasNext()) {
            A1E2.add(new C148306m0((C148276lx) it2.next()));
        }
        A1E2.addAll((Collection) AbstractC47040Kqx.A00(AbstractC43594JPz.A12(this.A01.A05)).first);
        A1E2.addAll((Collection) AbstractC47040Kqx.A00(AbstractC43594JPz.A12(this.A01.A04)).first);
        return A1E2;
    }
}
