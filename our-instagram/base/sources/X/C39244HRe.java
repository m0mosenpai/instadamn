package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;

/* renamed from: X.HRe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39244HRe extends C17T implements JKQ {
    public User A00;

    @Override // X.JKQ
    public final JKQ E9Y(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, -1003761774);
        return this;
    }

    @Override // X.JKQ
    public final H4U Exx(C1DY c1dy) {
        User user;
        User A0N;
        ImmutablePandoUserDict A0K = AbstractC37300Gc1.A0K(this, -1003761774);
        if (A0K != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0K)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        return new H4U(user);
    }

    @Override // X.JKQ
    public final H4U Exy(C1DV c1dv) {
        return Exx(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.JKQ
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        User user = this.A00;
        if (user != null) {
            A0X.put("producer", user.A07());
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
