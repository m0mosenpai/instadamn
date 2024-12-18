package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class L6A {
    public final /* synthetic */ KCY A00;

    public L6A(KCY kcy) {
        this.A00 = kcy;
    }

    public final void A00(C26086BgF c26086BgF) {
        List list;
        Long l;
        List list2;
        List<C206179Ba> list3;
        KCY kcy = this.A00;
        KCT A00 = KCY.A00(kcy);
        ArrayList arrayList = null;
        if (A00 != null) {
            list = A00.A00();
        } else {
            list = null;
        }
        kcy.A0N = list;
        InterfaceC09390do interfaceC09390do = kcy.A0m;
        if (C18U.A06(C06090Tz.A06, AbstractC166987dD.A0o(interfaceC09390do), 36325669454427392L)) {
            C7FR c7fr = new C7FR(kcy, AbstractC166987dD.A0r(interfaceC09390do));
            InterfaceC83713oG interfaceC83713oG = kcy.A0K;
            EnumC72433Xdd A002 = AbstractC34774FTx.A00(kcy.A0H);
            List list4 = kcy.A0N;
            if (list4 != null) {
                l = AbstractC31171DnF.A0V(list4.size());
            } else {
                l = null;
            }
            C2EC c2ec = kcy.A0H;
            if (c2ec != null) {
                list2 = c2ec.BKb().A02;
            } else {
                list2 = null;
            }
            if (c26086BgF != null && (list3 = (List) c26086BgF.A00) != null) {
                arrayList = AbstractC166987dD.A1E();
                for (C206179Ba c206179Ba : list3) {
                    try {
                        String str = c26086BgF.A04;
                        int i = c206179Ba.A02;
                        String obj = str.subSequence(i, c206179Ba.A01 + i).toString();
                        if (obj != null) {
                            arrayList.add(obj);
                        }
                    } catch (IndexOutOfBoundsException unused) {
                        AbstractC166987dD.A1T(C18950wb.A01, AbstractC111324zv.A00(4143), 20134884);
                    }
                }
            }
            c7fr.A00(EnumC46270Ke2.TAP, A002, interfaceC83713oG, l, "send", "media_picker_composer", list2, arrayList);
        }
        KCY.A01(c26086BgF, kcy, 0, kcy.A0V, ((C44526JmW) kcy.A0k.getValue()).A01());
    }
}
