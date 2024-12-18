package X;

import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes10.dex */
public final class T3F implements InterfaceC65385TjI {
    public final int A00;

    public T3F(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC65385TjI
    public final C3OO D8V(ViewGroup viewGroup) {
        return new C3OO(AbstractC31172DnG.A0A(AbstractC58322PtE.A0I(viewGroup.getContext(), this.A00), viewGroup, R.layout.fbpay_divider));
    }
}
