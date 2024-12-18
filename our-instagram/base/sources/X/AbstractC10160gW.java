package X;

import java.util.Iterator;

/* renamed from: X.0gW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10160gW {
    public static final Iterator A00(Iterator it, int i, int i2, boolean z) {
        C14360o3.A0B(it, 0);
        if (!it.hasNext()) {
            return C16940sm.A00;
        }
        return AbstractC224917l.A0D(new C06910Yi(it, null, i, i2, z, true));
    }

    public static final void A01(int i, int i2) {
        StringBuilder sb;
        if (i > 0 && i2 > 0) {
            return;
        }
        if (i != i2) {
            sb = new StringBuilder();
            sb.append("Both size ");
            sb.append(i);
            sb.append(" and step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append("size ");
            sb.append(i);
        }
        sb.append(" must be greater than zero.");
        throw new IllegalArgumentException(sb.toString());
    }
}
