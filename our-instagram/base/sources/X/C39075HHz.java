package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HHz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39075HHz extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42302IoQ c42302IoQ = (C42302IoQ) interfaceC66482zP;
        Gv9 gv9 = (Gv9) c3oo;
        AbstractC167017dG.A1N(c42302IoQ, gv9);
        gv9.A00.setText(c42302IoQ.A00.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42302IoQ.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new Gv9(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.tagging_feed_title, false));
    }
}
