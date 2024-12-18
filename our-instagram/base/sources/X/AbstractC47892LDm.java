package X;

import java.util.Map;

/* renamed from: X.LDm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47892LDm {
    public static final Map A00 = AbstractC166987dD.A1I();

    public static final OB1 A00(C07T c07t) {
        C14360o3.A0B(c07t, 0);
        OB1 ob1 = (OB1) AbstractC166997dE.A0m(A00, c07t.hashCode());
        if (ob1 != null) {
            return ob1;
        }
        throw AbstractC166987dD.A14("StoriesUIComponentServiceLocator is not initialized for this lifecycle");
    }
}
