package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.8ir, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194318ir extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.stories_gallery_meta_gallery_footer_message, viewGroup, false);
        C14360o3.A07(inflate);
        return new C210799Ub(inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C194368iw c194368iw = (C194368iw) interfaceC66482zP;
        C210799Ub c210799Ub = (C210799Ub) c3oo;
        C14360o3.A0B(c194368iw, 0);
        C14360o3.A0B(c210799Ub, 1);
        c210799Ub.A00.setText(c194368iw.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C194368iw.class;
    }
}
