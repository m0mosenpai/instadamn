package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KHA extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44649Jpt(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.user_group_header_text, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45646KIj c45646KIj = (C45646KIj) interfaceC66482zP;
        C44649Jpt c44649Jpt = (C44649Jpt) c3oo;
        AbstractC167017dG.A1N(c45646KIj, c44649Jpt);
        c44649Jpt.A00.setText(c45646KIj.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45646KIj.class;
    }
}
