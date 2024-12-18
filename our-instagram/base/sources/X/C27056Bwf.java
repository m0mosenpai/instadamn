package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Bwf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27056Bwf extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C25923BdQ(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.edit_channels_empty_pinned_channels, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C25923BdQ c25923BdQ = (C25923BdQ) c3oo;
        C14360o3.A0B(c25923BdQ, 1);
        c25923BdQ.A00.setVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C29156CtN.class;
    }
}
