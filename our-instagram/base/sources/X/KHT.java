package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KHT extends AbstractC66412zI {
    public final C47333Kvi A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_unified_poll_entrypoint_item, false);
        C44621JpR c44621JpR = new C44621JpR(A0D);
        KKp.A01(AbstractC166987dD.A0s(A0D), this, 24);
        return c44621JpR;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C44621JpR c44621JpR = (C44621JpR) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC66482zP, c44621JpR);
        C7IK c7ik = this.A00.A00.A03.A0A;
        if (c7ik != null) {
            JQ1.A0W(c44621JpR.A00, c7ik);
        }
        if (!KJ4.A00) {
            KJ4.A00 = A1R;
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return KJ4.class;
    }

    public KHT(C47333Kvi c47333Kvi) {
        this.A00 = c47333Kvi;
    }
}
