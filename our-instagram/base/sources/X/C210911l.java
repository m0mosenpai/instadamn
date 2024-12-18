package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: X.11l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C210911l {
    public final void A01(Context context, Integer num, List list) {
        C09530e4 A00;
        C14360o3.A0B(context, 0);
        int i = 0;
        C14360o3.A07(String.format(Locale.US, "Initializing %d initializers in parallel with AppInit", Arrays.copyOf(new Object[]{Integer.valueOf(list.size())}, 1)));
        if (num == null) {
            A00 = new C09530e4(C16930sl.A00, list);
        } else {
            A00 = A00(list, new C206999Ee(num, 32));
        }
        List list2 = (List) A00.A00;
        List<C211211o> list3 = (List) A00.A01;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((C211211o) it.next()).A00().A03();
        }
        new LinkedHashSet();
        C0QO A002 = C0QO.A0J.A00(context);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((C211211o) it2.next()).A00));
        }
        java.util.Set A0k = AbstractC001800i.A0k(arrayList);
        for (C211211o c211211o : list3) {
            int i2 = c211211o.A00;
            String valueOf = String.valueOf(i2);
            int[] Awl = c211211o.A01.Awl(i2);
            ArrayList arrayList2 = new ArrayList();
            int length = Awl.length;
            while (i < length) {
                int i3 = Awl[i];
                if (!A0k.contains(Integer.valueOf(i3))) {
                    arrayList2.add(Integer.valueOf(i3));
                }
                i = 1;
            }
            A002.A02(c211211o, valueOf, AbstractC001800i.A0x(arrayList2), i2);
            i = 0;
        }
        A002.A01();
    }

    public final void A02(Context context, Integer num, List list) {
        C09530e4 A00;
        int[] iArr;
        C14360o3.A0B(context, 0);
        C14360o3.A07(String.format(Locale.US, "Initializing %d initializers sequentially with AppInit", Arrays.copyOf(new Object[]{Integer.valueOf(list.size())}, 1)));
        if (num == null) {
            A00 = new C09530e4(C16930sl.A00, list);
        } else {
            A00 = A00(list, new C206999Ee(num, 33));
        }
        List list2 = (List) A00.A00;
        List list3 = (List) A00.A01;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((C211211o) it.next()).A00().A03();
        }
        C0QO A002 = C0QO.A0J.A00(context);
        int i = 0;
        for (Object obj : list3) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            C211211o c211211o = (C211211o) obj;
            String valueOf = String.valueOf(i);
            if (i == 0) {
                iArr = null;
            } else {
                iArr = new int[]{i - 1};
            }
            A002.A02(c211211o, valueOf, iArr, i);
            i = i2;
        }
        A002.A01();
    }

    public static final C09530e4 A00(List list, InterfaceC16660sJ interfaceC16660sJ) {
        Object obj;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((Boolean) interfaceC16660sJ.invoke(it.next())).booleanValue()) {
                if (i != -1) {
                    int i2 = i + 1;
                    obj = list.subList(0, i2);
                    list = list.subList(i2, list.size());
                }
            } else {
                i++;
            }
        }
        obj = C16930sl.A00;
        return new C09530e4(obj, list);
    }
}
