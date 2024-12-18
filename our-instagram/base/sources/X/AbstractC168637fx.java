package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC168637fx {
    public static C169127gl A00(final UserSession userSession, C1GL c1gl, final String str) {
        return new C169127gl(c1gl, new InterfaceC169117gk() { // from class: X.7fz
            public final AbstractC43161yj A00;

            {
                this.A00 = C43231yq.A00(UserSession.this);
            }

            @Override // X.InterfaceC169117gk
            public final /* bridge */ /* synthetic */ Object AIV(Object obj, Object obj2) {
                List emptyList;
                List list = (List) obj2;
                if (list == null) {
                    list = C16930sl.A00;
                }
                if (obj != null) {
                    emptyList = (List) obj;
                } else {
                    emptyList = Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList(emptyList.size() + list.size());
                arrayList.addAll(emptyList);
                for (Object obj3 : list) {
                    if (!emptyList.contains(obj3)) {
                        arrayList.add(obj3);
                    }
                }
                return new ArrayList(arrayList);
            }

            @Override // X.InterfaceC169117gk
            public final Object E7Q(String str2) {
                ArrayList A02 = this.A00.A02(str2);
                ArrayList arrayList = new ArrayList(A02.size());
                Iterator it = A02.iterator();
                while (it.hasNext()) {
                    C69730VuP c69730VuP = new C69730VuP(AbstractC1120253r.A00((String) it.next()));
                    c69730VuP.A05 = true;
                    arrayList.add(c69730VuP.A00());
                }
                return arrayList;
            }

            @Override // X.InterfaceC169117gk
            public final /* bridge */ /* synthetic */ Object ARP() {
                return new ArrayList(Collections.emptyList());
            }
        }, new C169337h7(c1gl, new InterfaceC169327h6() { // from class: X.7fy
            @Override // X.InterfaceC169327h6
            public final C1ON AN3(String str2) {
                return A2J.A00(UserSession.this, str2, str);
            }
        }, true), false, true);
    }
}
