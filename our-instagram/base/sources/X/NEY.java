package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* loaded from: classes9.dex */
public final class NEY extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final C54444O3y A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C51376Mmb c51376Mmb = new C51376Mmb(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.layout_highlight_story_item, false));
        c51376Mmb.A04.A00 = 0.5625f;
        return c51376Mmb;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C51815MvJ c51815MvJ = (C51815MvJ) interfaceC66482zP;
        C51376Mmb c51376Mmb = (C51376Mmb) c3oo;
        AbstractC167007dF.A1K(c51815MvJ, c51376Mmb);
        C38321qM c38321qM = c51815MvJ.A02;
        IgImageView igImageView = c51376Mmb.A03;
        ExtendedImageUrl A1q = c38321qM.A1q(AbstractC166997dE.A0L(igImageView));
        if (A1q != null) {
            igImageView.setUrl(A1q, this.A00);
        }
        boolean Cff = c38321qM.Cff();
        int i = 8;
        IgTextView igTextView = c51376Mmb.A02;
        if (Cff) {
            igTextView.setText(AbstractC189358aC.A01((int) c38321qM.A1C()));
            igTextView.setVisibility(0);
        } else {
            igTextView.setVisibility(8);
        }
        ImageView imageView = c51376Mmb.A01;
        imageView.setVisibility(0);
        View view = c51376Mmb.A00;
        if (c51815MvJ.A00 != -1) {
            i = 0;
        }
        view.setVisibility(i);
        c51376Mmb.A05.A00(c51815MvJ.A00);
        ViewOnClickListenerC55459OkE A00 = ViewOnClickListenerC55459OkE.A00(c51376Mmb, c51815MvJ, this, 23);
        C0fQ.A00(A00, c51376Mmb.A04);
        C0fQ.A00(A00, imageView);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C51815MvJ.class;
    }

    public NEY(InterfaceC11380iw interfaceC11380iw, C54444O3y c54444O3y) {
        this.A00 = interfaceC11380iw;
        this.A01 = c54444O3y;
    }
}
