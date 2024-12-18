package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* loaded from: classes9.dex */
public final class NEL extends AbstractC66412zI {
    public final N5W A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51320Mlh(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_kit_selected_media_item, false), this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C52607NPc c52607NPc = (C52607NPc) interfaceC66482zP;
        C51320Mlh c51320Mlh = (C51320Mlh) c3oo;
        AbstractC167017dG.A1N(c52607NPc, c51320Mlh);
        P5B p5b = c52607NPc.A00;
        ExtendedImageUrl A1q = p5b.A00.A1q(AbstractC37301Gc2.A03(c51320Mlh));
        if (A1q != null) {
            c51320Mlh.A01.setUrl(A1q, c51320Mlh.A00);
        }
        ViewOnClickListenerC55465OkK.A01(c51320Mlh.A02, 65, p5b, c51320Mlh);
        ViewOnClickListenerC55465OkK.A01(c51320Mlh.A01, 66, p5b, c51320Mlh);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52607NPc.class;
    }

    public NEL(N5W n5w) {
        this.A00 = n5w;
    }
}
