package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Gpl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38118Gpl extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.title_header, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(3));
        return new C38409Guk((TextView) inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        throw AbstractC166987dD.A15("getText");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HKc.class;
    }
}
