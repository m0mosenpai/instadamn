package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KH9 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44675JqK(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.pending_threads_spam_folder_header_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45643KIg c45643KIg = (C45643KIg) interfaceC66482zP;
        C44675JqK c44675JqK = (C44675JqK) c3oo;
        AbstractC167017dG.A1N(c45643KIg, c44675JqK);
        c44675JqK.A00.setText(c45643KIg.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45643KIg.class;
    }
}
