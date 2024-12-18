package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Sbf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63058Sbf {
    public static final List A00(Object obj, List list, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        ArrayList A1F = AbstractC166987dD.A1F(list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (AbstractC25231BEo.A1a(next, interfaceC16660sJ)) {
                if (next != null) {
                    Iterator it2 = list.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (AbstractC166987dD.A1a(interfaceC16620sF.invoke(it2.next(), next))) {
                            if (i != -1) {
                                A1F.set(i, obj);
                            }
                        } else {
                            i++;
                        }
                    }
                    throw AbstractC31172DnG.A0u();
                }
            }
        }
        return AbstractC001800i.A0a(A1F);
    }

    public static final List A01(Object obj, List list, InterfaceC16620sF interfaceC16620sF) {
        ArrayList A1F = AbstractC166987dD.A1F(list);
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (AbstractC166987dD.A1a(interfaceC16620sF.invoke(it.next(), obj))) {
                if (i != -1) {
                    A1F.remove(i);
                }
            } else {
                i++;
            }
        }
        return AbstractC001800i.A0a(A1F);
    }

    public static final List A02(Object obj, List list, InterfaceC16620sF interfaceC16620sF, int i) {
        ArrayList A1F = AbstractC166987dD.A1F(list);
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (AbstractC166987dD.A1a(interfaceC16620sF.invoke(it.next(), obj))) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i > list.size()) {
            i = 0;
        }
        if (i2 != -1) {
            A1F.set(i2, obj);
        } else {
            A1F.add(i, obj);
        }
        return AbstractC001800i.A0a(A1F);
    }
}
