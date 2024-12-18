package X;

import com.facebook.odin.model.Example;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.94F, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C94F {
    public final C0JM A00;
    public final InterfaceC73603Rm A01;
    public final C94E A02;

    public C94F(C0JM c0jm, InterfaceC73603Rm interfaceC73603Rm, C94E c94e) {
        C14360o3.A0B(interfaceC73603Rm, 2);
        this.A02 = c94e;
        this.A01 = interfaceC73603Rm;
        this.A00 = c0jm;
    }

    public final void A00(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3RU c3ru = (C3RU) it.next();
            if (c3ru.Car()) {
                InterfaceC73603Rm interfaceC73603Rm = this.A01;
                if (!interfaceC73603Rm.CM9(c3ru.CDV(), c3ru.BtZ()).A02) {
                    C3SN A00 = this.A02.A00(AD6.A00(c3ru));
                    if (A00.A02) {
                        Object obj = A00.A00;
                        if (!((Collection) obj).isEmpty()) {
                            ArrayList arrayList2 = new ArrayList();
                            List<Example> list2 = (List) obj;
                            if (C14360o3.A0K(c3ru.CDV(), "FB_CP")) {
                                for (Example example : list2) {
                                    String CDV = c3ru.CDV();
                                    C14360o3.A0B(CDV, 0);
                                    C14360o3.A0B(example, 1);
                                    Map map = example.A00.A04;
                                    interfaceC73603Rm.Eow(example, AnonymousClass001.A0T(CDV, (String) map.get("2476"), '_'), this.A00.now());
                                    Object obj2 = map.get("2476");
                                    if (obj2 == null) {
                                        obj2 = "";
                                    }
                                    arrayList2.add(obj2);
                                }
                            } else {
                                interfaceC73603Rm.Eow((Example) list2.get(0), c3ru.CDV(), this.A00.now());
                            }
                            arrayList.add(arrayList2);
                            interfaceC73603Rm.Eov(c3ru.CDV(), arrayList2);
                        }
                    }
                } else {
                    arrayList.add(interfaceC73603Rm.E83(c3ru.CDV()));
                }
            }
        }
    }
}
