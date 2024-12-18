package X;

import java.util.List;

/* loaded from: classes10.dex */
public abstract class S1J {
    public static AbstractC08800ci A00(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return new C0B2((AbstractC08800ci[]) list.toArray(new AbstractC08800ci[size]));
            }
            return (AbstractC08800ci) AbstractC166987dD.A16(list);
        }
        return AbstractC62316S6l.A00;
    }
}
