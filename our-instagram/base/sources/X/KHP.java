package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KHP extends AbstractC66412zI {
    public final C47337Kvm A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_unified_add_yours_entrypoint_item, false);
        C44617JpN c44617JpN = new C44617JpN(A0D);
        KKp.A01(AbstractC166987dD.A0s(A0D), this, 20);
        return c44617JpN;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C44617JpN c44617JpN = (C44617JpN) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC66482zP, c44617JpN);
        C7IK c7ik = this.A00.A00.A03.A0A;
        if (c7ik != null) {
            JQ1.A0W(c44617JpN.A00, c7ik);
        }
        if (!KJ0.A00) {
            KJ0.A00 = A1R;
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return KJ0.class;
    }

    public KHP(C47337Kvm c47337Kvm) {
        this.A00 = c47337Kvm;
    }
}
