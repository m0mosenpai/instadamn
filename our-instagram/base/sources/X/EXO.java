package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EXO extends AbstractC66412zI {
    public final Context A00;
    public final GYT A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        EY0 ey0 = (EY0) interfaceC66482zP;
        FC3.A00(this.A00, this.A01, (FLP) AbstractC31172DnG.A0x(c3oo.itemView), ey0.A01, ey0.A00, ey0.A02);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.row_search_for_x);
        A0A.setTag(new FLP(A0A));
        return new C3OO(A0A);
    }

    public EXO(Context context, GYT gyt) {
        this.A00 = context;
        this.A01 = gyt;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return EY0.class;
    }
}
