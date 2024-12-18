package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes11.dex */
public final class V5C extends AbstractC66412zI {
    public final InterfaceC11380iw A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new UJJ(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_broadcast_channel_featured_event_banner, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        C66638URc c66638URc = (C66638URc) interfaceC66482zP;
        UJJ ujj = (UJJ) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c66638URc, ujj);
        IgImageView igImageView = ujj.A03;
        igImageView.setVisibility(8);
        IgImageView igImageView2 = ujj.A02;
        igImageView2.setVisibility(8);
        ujj.A01.setText(c66638URc.A03);
        ujj.A00.setText(c66638URc.A02);
        if (!c66638URc.A04) {
            igImageView2 = igImageView;
        }
        if ((C1H6.A03() && (str = c66638URc.A00) != null && (!AbstractC001900j.A0T(str)) == A1R) || ((str = c66638URc.A01) != null && (!AbstractC001900j.A0T(str)) == A1R)) {
            igImageView2.setUrl(new SimpleImageUrl(str), this.A00);
            igImageView2.setVisibility(0);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C66638URc.class;
    }

    public V5C(InterfaceC11380iw interfaceC11380iw) {
        this.A00 = interfaceC11380iw;
    }
}
