package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.8ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194168ib extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.stories_gallery_section_subheader, viewGroup, false);
        C14360o3.A07(inflate);
        return new C210829Uf(inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C194208if c194208if = (C194208if) interfaceC66482zP;
        C210829Uf c210829Uf = (C210829Uf) c3oo;
        C14360o3.A0B(c194208if, 0);
        C14360o3.A0B(c210829Uf, 1);
        c210829Uf.A00.setText(c194208if.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C194208if.class;
    }
}
