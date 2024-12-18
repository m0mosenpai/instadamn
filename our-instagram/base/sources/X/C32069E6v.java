package X;

import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.E6v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32069E6v extends C0T6 {
    public boolean A00;
    public boolean A01;
    public final User A02;

    public C32069E6v(User user, boolean z, boolean z2) {
        C14360o3.A0B(user, 1);
        this.A02 = user;
        this.A01 = z;
        this.A00 = z2;
    }

    public static void A00(EQ8 eq8, Iterator it) {
        C32069E6v c32069E6v = (C32069E6v) it.next();
        boolean z = eq8.A04;
        User user = c32069E6v.A02;
        boolean z2 = c32069E6v.A01;
        C14360o3.A0B(user, 0);
        eq8.addModel(new C32069E6v(user, z2, z), eq8.A08);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32069E6v)) {
            return false;
        }
        return C14360o3.A0K(this.A02, ((C32069E6v) obj).A02);
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public static void A01(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C32069E6v) it.next()).A02);
    }
}
