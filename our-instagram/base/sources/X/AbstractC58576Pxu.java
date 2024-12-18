package X;

import com.google.common.collect.ImmutableList;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Pxu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58576Pxu implements Iterable {
    public final C46h A00;

    public static AbstractC58576Pxu A00(final Iterable iterable) {
        if (iterable instanceof AbstractC58576Pxu) {
            return (AbstractC58576Pxu) iterable;
        }
        return new C58582Py3(iterable, iterable);
    }

    public static ImmutableList A01(AbstractC58576Pxu abstractC58576Pxu, int i) {
        return abstractC58576Pxu.A02(new C58605PyY(i)).A03();
    }

    public final AbstractC58576Pxu A02(C2n2 function) {
        Object A05 = this.A00.A05(this);
        A05.getClass();
        return A00(new C60756RQi(1, function, A05));
    }

    public final ImmutableList A03() {
        return ImmutableList.copyOf((Iterable) this.A00.A05(this));
    }

    public final Object[] A04() {
        Collection A1E;
        Iterable iterable = (Iterable) this.A00.A05(this);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) String.class, 0);
        if (iterable instanceof Collection) {
            A1E = (Collection) iterable;
        } else {
            Iterator it = iterable.iterator();
            A1E = AbstractC166987dD.A1E();
            AbstractC63071Sbt.A02(A1E, it);
        }
        return A1E.toArray(objArr);
    }

    public String toString() {
        return SSP.A01((Iterable) this.A00.A05(this));
    }

    public AbstractC58576Pxu(Iterable iterable) {
        this.A00 = C46h.A01(iterable);
    }

    public AbstractC58576Pxu() {
        this.A00 = C4JK.A00;
    }
}
