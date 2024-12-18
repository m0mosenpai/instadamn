package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FQz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34714FQz {
    public int A00 = -1;
    public final List A01;

    public final AbstractC34718FRf A00() {
        int i = this.A00 + 1;
        this.A00 = i;
        List list = this.A01;
        if (i < list.size()) {
            return (AbstractC34718FRf) list.get(this.A00);
        }
        return null;
    }

    public final boolean A01(Enum r4) {
        List list = this.A01;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((AbstractC34718FRf) it.next()).A00, r4)) {
                    return true;
                }
            }
        }
        return false;
    }

    public AbstractC34714FQz(Collection collection) {
        this.A01 = AbstractC001800i.A0a(collection);
    }
}
