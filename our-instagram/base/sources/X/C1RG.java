package X;

import com.google.common.collect.ImmutableCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1RG, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1RG extends AbstractC24851Je {
    public int A00;
    public boolean A01;
    public Object[] A02;

    public static void A01(C1RG c1rg, int i) {
        Object[] objArr;
        Object[] objArr2 = c1rg.A02;
        int length = objArr2.length;
        if (length < i) {
            objArr = Arrays.copyOf(objArr2, AbstractC24851Je.A00(length, i));
        } else if (!c1rg.A01) {
            return;
        } else {
            objArr = (Object[]) objArr2.clone();
        }
        c1rg.A02 = objArr;
        c1rg.A01 = false;
    }

    public final void A03(Iterable elements) {
        if (elements instanceof Collection) {
            Collection collection = (Collection) elements;
            A01(this, this.A00 + collection.size());
            if (collection instanceof ImmutableCollection) {
                this.A00 = ((ImmutableCollection) collection).copyIntoArray(this.A02, this.A00);
                return;
            }
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }
}
