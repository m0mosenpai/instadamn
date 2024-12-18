package X;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class RBB extends R98 {
    public final Collection A00;
    public transient String A01;

    public RBB(TID tid, C16L c16l, String str, Collection collection) {
        super(str, null);
        ((AnonymousClass400) this).A00 = tid;
        super.A01 = c16l;
        this.A00 = collection;
    }

    @Override // X.AnonymousClass400
    public final String A07() {
        Collection collection;
        String str = this.A01;
        if (str == null && (collection = this.A00) != null) {
            StringBuilder A0q = AbstractC58318PtA.A0q(100);
            int size = collection.size();
            if (size == 1) {
                A0q.append(" (one known property: \"");
                A0q.append(String.valueOf(collection.iterator().next()));
                A0q.append('\"');
            } else {
                A0q.append(" (");
                A0q.append(size);
                A0q.append(" known properties: ");
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    A0q.append('\"');
                    A0q.append(String.valueOf(it.next()));
                    A0q.append('\"');
                    if (A0q.length() > 1000) {
                        A0q.append(" [truncated]");
                        break;
                    }
                    if (it.hasNext()) {
                        AbstractC58318PtA.A1S(A0q);
                    }
                }
            }
            String A0x = AbstractC166997dE.A0x("])", A0q);
            this.A01 = A0x;
            return A0x;
        }
        return str;
    }
}
