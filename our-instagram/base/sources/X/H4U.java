package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class H4U extends C0T6 implements JKQ {
    public final User A00;

    @Override // X.JKQ
    public final H4U Exx(C1DY c1dy) {
        return this;
    }

    @Override // X.JKQ
    public final H4U Exy(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H4U) && C14360o3.A0K(this.A00, ((H4U) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public H4U(User user) {
        this.A00 = user;
    }

    @Override // X.JKQ
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        User user = this.A00;
        if (user != null) {
            A0X.put("producer", user.A07());
        }
        return AbstractC37300Gc1.A05("XDTPhotoCreditStickerDict", AbstractC06930Yk.A0B(A0X));
    }

    @Override // X.JKQ
    public final JKQ E9Y(C1DY c1dy) {
        return this;
    }
}
