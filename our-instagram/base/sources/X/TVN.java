package X;

import com.instagram.profile.fragment.UserDetailFragment;
import java.util.function.Function;

/* loaded from: classes10.dex */
public final class TVN implements Function {
    public final int A00;
    public final Object A01;

    public TVN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        if (2 - this.A00 != 0) {
            return ((InterfaceC16660sJ) this.A01).invoke(obj);
        }
        UserDetailFragment userDetailFragment = (UserDetailFragment) this.A01;
        return AbstractC40771I4z.A00((C38748H4o) obj, userDetailFragment.A0I, userDetailFragment.A10.A03);
    }
}
