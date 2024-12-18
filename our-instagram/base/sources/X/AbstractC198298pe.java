package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.8pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC198298pe {
    public static final List A00(Object obj) {
        C198308pf c198308pf;
        C195868lW c195868lW;
        C183978Ee c183978Ee;
        if (obj instanceof C187688Tl) {
            c183978Ee = ((C187688Tl) obj).A01;
        } else {
            if (obj instanceof C187698Tm) {
                c195868lW = ((C187698Tm) obj).A01;
            } else {
                if (obj instanceof C187708Tn) {
                    return ((C187708Tn) obj).A00;
                }
                if (obj instanceof C8V8) {
                    c183978Ee = ((C8V8) obj).A00;
                } else if (obj instanceof C187718To) {
                    c195868lW = ((C187718To) obj).A01;
                } else {
                    if (obj instanceof C8WN) {
                        c198308pf = ((C8WN) obj).A00;
                        List singletonList = Collections.singletonList(c198308pf);
                        C14360o3.A07(singletonList);
                        return singletonList;
                    }
                    return C16930sl.A00;
                }
            }
            c198308pf = new C198308pf(c195868lW);
            List singletonList2 = Collections.singletonList(c198308pf);
            C14360o3.A07(singletonList2);
            return singletonList2;
        }
        c198308pf = new C198308pf(c183978Ee);
        List singletonList22 = Collections.singletonList(c198308pf);
        C14360o3.A07(singletonList22);
        return singletonList22;
    }
}
