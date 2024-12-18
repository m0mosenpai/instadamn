package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class MUM implements GZI {
    public String A00;
    public List A01;
    public final String A02;
    public final InterfaceC16820sZ A03;

    @Override // X.GZI
    public final String AbS() {
        Object next;
        List list = (List) this.A03.invoke();
        if (C14360o3.A0K(list, this.A01)) {
            return this.A00;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass016.A16((Iterable) ((C51757Mtg) it.next()).A00, A1E);
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj : A1E) {
            if (((BJF) obj).A03) {
                A1E2.add(obj);
            }
        }
        ArrayList A1E3 = AbstractC166987dD.A1E();
        Iterator it2 = A1E2.iterator();
        while (it2.hasNext()) {
            String str = ((BJF) it2.next()).A01;
            if (str != null) {
                A1E3.add(str);
            }
        }
        Iterator it3 = C50583MUt.A00(A1E3, 16).iterator();
        if (!it3.hasNext()) {
            next = null;
        } else {
            next = it3.next();
            while (it3.hasNext()) {
                next = AnonymousClass001.A0T((String) next, (String) it3.next(), ',');
            }
        }
        String str2 = (String) next;
        this.A01 = list;
        this.A00 = str2;
        return str2;
    }

    @Override // X.GZI
    public final String BdC() {
        return this.A02;
    }

    public MUM(String str, InterfaceC16820sZ interfaceC16820sZ) {
        this.A03 = interfaceC16820sZ;
        this.A02 = str;
    }
}
