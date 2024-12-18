package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HHw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39072HHw extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42297IoL.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new Gv7(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.tagging_feed_divider, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
    }
}
