package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Bwg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27057Bwg extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.edit_channels_label_item, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(3));
        return new C25924BdR((TextView) inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C26168Bht c26168Bht = (C26168Bht) interfaceC66482zP;
        C25924BdR c25924BdR = (C25924BdR) c3oo;
        AbstractC167017dG.A1N(c26168Bht, c25924BdR);
        c25924BdR.A00.setText(c26168Bht.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C26168Bht.class;
    }
}
