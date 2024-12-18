package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.banner.IgdsBanner;

/* loaded from: classes9.dex */
public final class NEC extends AbstractC66412zI {
    public final InterfaceC16820sZ A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51231MkG(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.row_appreciation_gift_feed_fb, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        LZE lze = (LZE) interfaceC66482zP;
        C51231MkG c51231MkG = (C51231MkG) c3oo;
        AbstractC167007dF.A1K(lze, c51231MkG);
        IgdsBanner igdsBanner = c51231MkG.A00;
        igdsBanner.setBody(AbstractC167017dG.A0k(igdsBanner.getResources(), (int) lze.A00, R.plurals.appreciation_gift_feed_fb_banner_body_text), false);
        igdsBanner.setIcon(AbstractC65877Tvg.A00(igdsBanner.getContext(), XNQ.A4J, BSV.SIZE_24, BSU.OUTLINE));
        igdsBanner.setDismissible(false);
        igdsBanner.A00 = new G81(this, 0);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZE.class;
    }

    public NEC(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }
}
