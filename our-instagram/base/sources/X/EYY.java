package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.model.reels.Reel;

/* loaded from: classes6.dex */
public final class EYY extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final FF5 A01;

    public EYY(InterfaceC11380iw interfaceC11380iw, FF5 ff5) {
        C14360o3.A0B(ff5, 2);
        this.A00 = interfaceC11380iw;
        this.A01 = ff5;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new E3S(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.recipient_picker_share_to_highlight_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        Drawable drawable;
        C36194Fy8 c36194Fy8 = (C36194Fy8) interfaceC66482zP;
        E3S e3s = (E3S) c3oo;
        AbstractC167017dG.A1N(c36194Fy8, e3s);
        Reel reel = c36194Fy8.A00;
        ImageUrl A07 = reel.A07();
        if (A07 != null) {
            e3s.A05.setUrl(A07, this.A00);
        }
        e3s.A04.setText(reel.A0r);
        boolean z = c36194Fy8.A01;
        IgSimpleImageView igSimpleImageView = e3s.A03;
        if (z) {
            drawable = e3s.A00;
        } else {
            drawable = e3s.A01;
        }
        igSimpleImageView.setImageDrawable(drawable);
        ViewOnClickListenerC35683FpI.A00(e3s.A02, 27, c36194Fy8, this);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36194Fy8.class;
    }
}
