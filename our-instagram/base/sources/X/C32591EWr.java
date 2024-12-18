package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.EWr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32591EWr extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        c3oo.itemView.getTag().getClass();
        throw AbstractC166987dD.A15(DialogModule.KEY_TITLE);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0C = AbstractC31173DnH.A0C(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.direct_dismissable_nux_row, false);
        A0C.setTag(new E2O(A0C));
        return new C3OO(A0C);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return AbstractC32611EXl.class;
    }
}
