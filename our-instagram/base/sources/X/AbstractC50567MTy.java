package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.MTy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50567MTy {
    public static final List A00(List list) {
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                InterfaceC38901rP interfaceC38901rP = (InterfaceC38901rP) obj;
                if (interfaceC38901rP.CRq() != null && C14360o3.A0K(interfaceC38901rP.CRq(), false)) {
                    A1E.add(obj);
                }
            }
            return A1E;
        }
        return null;
    }

    public static final Map A01(List list) {
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC50522MSa.A09(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC38901rP interfaceC38901rP = (InterfaceC38901rP) it.next();
            A18.put(interfaceC38901rP.getPk(), interfaceC38901rP.Apd());
        }
        return AbstractC06930Yk.A0B(A18);
    }

    public static final Map A02(List list) {
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC50522MSa.A09(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC38901rP interfaceC38901rP = (InterfaceC38901rP) it.next();
            A18.put(interfaceC38901rP.getPk(), interfaceC38901rP.BC2());
        }
        return AbstractC06930Yk.A0B(A18);
    }

    public static final void A03(C38321qM c38321qM, String str) {
        ArrayList arrayList;
        List A17 = MSW.A17(c38321qM);
        if (A17 != null) {
            ArrayList A1F = AbstractC166987dD.A1F(A17);
            arrayList = AbstractC166987dD.A1E();
            Iterator it = A1F.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!C14360o3.A0K(str, ((InterfaceC38901rP) next).getPk())) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        c38321qM.A0C.Eeu(arrayList);
    }

    public static final void A04(C38321qM c38321qM, String str, int i) {
        ArrayList arrayList;
        Object obj;
        AbstractC167017dG.A1N(c38321qM, str);
        List A17 = MSW.A17(c38321qM);
        if (A17 != null) {
            Iterator it = A17.iterator();
            while (true) {
                arrayList = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC50523MSb.A1b(obj, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            InterfaceC38901rP interfaceC38901rP = (InterfaceC38901rP) obj;
            if (interfaceC38901rP != null) {
                C32955Eem A00 = InterfaceC38901rP.A00.A00();
                A00.A0Z = Integer.valueOf(i);
                InterfaceC38901rP A002 = XMJ.A00(interfaceC38901rP, A00.A01());
                if (A002 != null) {
                    List A172 = MSW.A17(c38321qM);
                    if (A172 != null) {
                        arrayList = AbstractC166987dD.A1F(A172);
                        List A173 = MSW.A17(c38321qM);
                        int i2 = -1;
                        if (A173 != null) {
                            int i3 = 0;
                            Iterator it2 = A173.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (AbstractC50523MSb.A1b(it2.next(), str)) {
                                    i2 = i3;
                                    break;
                                }
                                i3++;
                            }
                        }
                        arrayList.set(i2, A002);
                    }
                    c38321qM.A0C.Eeu(arrayList);
                }
            }
        }
    }

    public static final void A05(C38321qM c38321qM, String str, boolean z) {
        ArrayList arrayList;
        Object obj;
        AbstractC167017dG.A1N(c38321qM, str);
        List A17 = MSW.A17(c38321qM);
        if (A17 != null) {
            Iterator it = A17.iterator();
            while (true) {
                arrayList = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC50523MSb.A1b(obj, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            InterfaceC38901rP interfaceC38901rP = (InterfaceC38901rP) obj;
            if (interfaceC38901rP != null) {
                C32955Eem A00 = InterfaceC38901rP.A00.A00();
                A00.A0E = Boolean.valueOf(z);
                InterfaceC38901rP A002 = XMJ.A00(interfaceC38901rP, A00.A01());
                if (A002 != null) {
                    List A172 = MSW.A17(c38321qM);
                    if (A172 != null) {
                        arrayList = AbstractC166987dD.A1F(A172);
                        List A173 = MSW.A17(c38321qM);
                        int i = -1;
                        if (A173 != null) {
                            int i2 = 0;
                            Iterator it2 = A173.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (AbstractC50523MSb.A1b(it2.next(), str)) {
                                    i = i2;
                                    break;
                                }
                                i2++;
                            }
                        }
                        arrayList.set(i, A002);
                    }
                    c38321qM.A0C.Eeu(arrayList);
                }
            }
        }
    }
}
