package X;

import java.util.Comparator;

/* renamed from: X.Pzf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58667Pzf {
    public static final AbstractC58667Pzf A00 = new C58669Pzh();
    public static final AbstractC58667Pzf A02 = new C58668Pzg(-1);
    public static final AbstractC58667Pzf A01 = new C58668Pzg(1);

    public final int A00() {
        if (this instanceof C58669Pzh) {
            return 0;
        }
        return ((C58668Pzg) this).A00;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public final AbstractC58667Pzf A01(int left, int right) {
        ?? A1S;
        if (this instanceof C58669Pzh) {
            if (left >= right && (A1S = AbstractC25230BEn.A1S(left, right)) >= 0) {
                if (A1S > 0) {
                    return A01;
                }
                return A00;
            }
            return A02;
        }
        return this;
    }

    public final AbstractC58667Pzf A02(Object left, Object right, Comparator comparator) {
        if (this instanceof C58669Pzh) {
            int compare = comparator.compare(left, right);
            if (compare < 0) {
                return A02;
            }
            if (compare > 0) {
                return A01;
            }
            return A00;
        }
        return this;
    }

    public final AbstractC58667Pzf A03(boolean left, boolean right) {
        if (this instanceof C58669Pzh) {
            if (left == right) {
                return A00;
            }
            if (left) {
                return A01;
            }
            return A02;
        }
        return this;
    }

    public final AbstractC58667Pzf A04(boolean left, boolean right) {
        if (this instanceof C58668Pzg) {
            return this;
        }
        if (right != left) {
            if (right) {
                return A01;
            }
            return A02;
        }
        return A00;
    }
}
