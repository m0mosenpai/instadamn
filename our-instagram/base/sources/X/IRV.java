package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IRV {
    public static final HML A00(C38061Goo c38061Goo) {
        String str;
        C14360o3.A0B(c38061Goo, 0);
        Integer num = c38061Goo.A0G;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    return new HML(c38061Goo);
                case 2:
                    return new HML(c38061Goo);
                case 3:
                    return new HML(c38061Goo);
                case 4:
                    return new HML(c38061Goo);
                case 5:
                    return new HML(c38061Goo);
                case 6:
                    return new HML(c38061Goo);
                case 7:
                    return new HML(c38061Goo);
                case 8:
                    return new HML(c38061Goo);
            }
        }
        if (num != null) {
            str = AbstractC40747I4b.A00(num);
        } else {
            str = "null";
        }
        C0w9.A03("AudioBrowserItem", AnonymousClass001.A0R("Unsupported music search result type ", str));
        return null;
    }

    public static final ArrayList A01(List list) {
        ArrayList A1E;
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38061Goo c38061Goo = (C38061Goo) it.next();
            if (c38061Goo.A0G == C05F.A1I) {
                A1E2.add(new HML(c38061Goo));
                C39685HjH c39685HjH = c38061Goo.A0D;
                if (c39685HjH != null) {
                    List list2 = ((H2J) c39685HjH.A00).A04;
                    if (list2 != null) {
                        A1E = AbstractC167017dG.A0q(list2);
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            A1E.add(new C38061Goo((InterfaceC43511JJx) it2.next()));
                        }
                    } else {
                        A1E = AbstractC166987dD.A1E();
                    }
                    Iterator it3 = A1E.iterator();
                    while (it3.hasNext()) {
                        HML A00 = A00((C38061Goo) it3.next());
                        if (A00 != null) {
                            A1E2.add(A00);
                        }
                    }
                }
            } else {
                HML A002 = A00(c38061Goo);
                if (A002 != null) {
                    A1E2.add(A002);
                }
            }
        }
        return A1E2;
    }
}
