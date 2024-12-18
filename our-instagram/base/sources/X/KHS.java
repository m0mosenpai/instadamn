package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KHS extends AbstractC66412zI {
    public final C47336Kvl A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_unified_location_sharing_entrypoint_item, false);
        C44620JpQ c44620JpQ = new C44620JpQ(A0D);
        KKp.A01(AbstractC166987dD.A0s(A0D), this, 23);
        return c44620JpQ;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C44620JpQ c44620JpQ = (C44620JpQ) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC66482zP, c44620JpQ);
        C7IK c7ik = this.A00.A00.A03.A0A;
        if (c7ik != null) {
            JQ1.A0W(c44620JpQ.A00, c7ik);
        }
        if (!KJ3.A00) {
            KJ3.A00 = A1R;
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return KJ3.class;
    }

    public KHS(C47336Kvl c47336Kvl) {
        this.A00 = c47336Kvl;
    }
}
