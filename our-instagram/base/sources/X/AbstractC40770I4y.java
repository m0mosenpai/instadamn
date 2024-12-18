package X;

import com.instagram.model.people.PeopleTag;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.I4y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40770I4y {
    public static final int A00(C38321qM c38321qM, String str) {
        c38321qM.A5M();
        if (str != null) {
            int A0p = c38321qM.A0p();
            for (int i = 0; i < A0p; i++) {
                C38321qM A1e = c38321qM.A1e(i);
                if (A1e != null) {
                    ArrayList A3M = A1e.A3M();
                    if (A3M != null) {
                        Iterator it = A3M.iterator();
                        while (it.hasNext()) {
                            if (C14360o3.A0K(((PeopleTag) it.next()).A07().getId(), str)) {
                                return i;
                            }
                        }
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        return 0;
    }
}
