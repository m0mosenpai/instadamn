package X;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.ROd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60723ROd extends AbstractC63296Sgx {
    public static final Class A00 = AbstractC58320PtC.A0k();

    public /* synthetic */ C60723ROd(AbstractC61505Rog abstractC61505Rog) {
    }

    public C60723ROd() {
    }

    @Override // X.AbstractC63296Sgx
    public final void A02(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) C63409Sjj.A06(obj, j);
        if (list instanceof InterfaceC65685Ts7) {
            unmodifiableList = ((InterfaceC65685Ts7) list).FGD();
        } else {
            if (AbstractC58321PtD.A1W(A00, list)) {
                return;
            }
            if ((list instanceof InterfaceC65263Tgt) && (list instanceof InterfaceC65693TsF)) {
                InterfaceC65693TsF interfaceC65693TsF = (InterfaceC65693TsF) list;
                if (!interfaceC65693TsF.FG0()) {
                    return;
                }
                interfaceC65693TsF.FFq();
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C63409Sjj.A0J(obj, j, unmodifiableList);
    }

    @Override // X.AbstractC63296Sgx
    public final void A03(Object obj, long j, Object obj2) {
        AbstractList roa;
        List list = (List) C63409Sjj.A06(obj2, j);
        int size = list.size();
        List list2 = (List) C63409Sjj.A06(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC65685Ts7) {
                list2 = new ROA(size);
            } else if ((list2 instanceof InterfaceC65263Tgt) && (list2 instanceof InterfaceC65693TsF)) {
                list2 = ((InterfaceC65693TsF) list2).FG7(size);
            } else {
                list2 = AbstractC25225BEi.A17(size);
            }
            C63409Sjj.A0J(obj, j, list2);
        } else {
            if (AbstractC58321PtD.A1W(A00, list2)) {
                roa = AbstractC58322PtE.A0w(list2, size);
                roa.addAll(list2);
            } else if (list2 instanceof TZ6) {
                InterfaceC65685Ts7 interfaceC65685Ts7 = ROA.A01;
                roa = new ROA(list2.size() + size);
                roa.addAll(roa.size(), list2);
            } else if ((list2 instanceof InterfaceC65263Tgt) && (list2 instanceof InterfaceC65693TsF)) {
                InterfaceC65693TsF interfaceC65693TsF = (InterfaceC65693TsF) list2;
                if (!interfaceC65693TsF.FG0()) {
                    list2 = interfaceC65693TsF.FG7(list2.size() + size);
                    C63409Sjj.A0J(obj, j, list2);
                }
            }
            C63409Sjj.A0J(obj, j, roa);
            list2 = roa;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0) {
            if (size3 > 0) {
                list2.addAll(list);
            }
            list = list2;
        }
        C63409Sjj.A0J(obj, j, list);
    }
}
