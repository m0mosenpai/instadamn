package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.gallery.Medium;

/* loaded from: classes9.dex */
public final class NEX extends AbstractC66412zI {
    public final C8SF A00;
    public final N5W A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51302MlP(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_kit_selected_media_item, false), this.A01);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C52606NPb c52606NPb = (C52606NPb) interfaceC66482zP;
        boolean A1a = AbstractC167017dG.A1a(c52606NPb, c3oo);
        Medium medium = c52606NPb.A00.A00.A00;
        if (medium != null) {
            this.A00.A04(medium, new C56051OuQ(A1a ? 1 : 0, c3oo, c52606NPb));
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52606NPb.class;
    }

    public NEX(C8SF c8sf, N5W n5w) {
        this.A00 = c8sf;
        this.A01 = n5w;
    }
}
