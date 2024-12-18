package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VWh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68580VWh {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList A00(String str, List list) {
        InterfaceC71959XCl interfaceC71959XCl;
        ArrayList<Object> arrayList = new ArrayList();
        for (Object obj : list) {
            C70077W1u c70077W1u = (C70077W1u) obj;
            if (C14360o3.A0K(c70077W1u.A01, str) && (c70077W1u instanceof InterfaceC71959XCl) && (interfaceC71959XCl = (InterfaceC71959XCl) c70077W1u) != null && interfaceC71959XCl.CM8()) {
                arrayList.add(obj);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(arrayList);
        for (Object obj2 : arrayList) {
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.survey.structuredsurvey.model.AnswerableItem<*>");
            A0q.add(((InterfaceC71959XCl) obj2).Ac4());
        }
        ArrayList arrayList2 = new ArrayList(A0q);
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }
}
