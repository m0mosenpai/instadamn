package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

/* loaded from: classes9.dex */
public final class NF7 extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final C54400O2g A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C51294MlH(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.add_highlight_row_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56082Ouz c56082Ouz = (C56082Ouz) interfaceC66482zP;
        C51294MlH c51294MlH = (C51294MlH) c3oo;
        AbstractC167017dG.A1N(c56082Ouz, c51294MlH);
        Reel reel = c56082Ouz.A00;
        ImageUrl A07 = reel.A07();
        if (A07 != null) {
            c51294MlH.A02.setUrl(A07, this.A00);
        }
        c51294MlH.A01.setText(reel.A0r);
        View view = c51294MlH.A00;
        ViewOnClickListenerC55464OkJ.A01(view, 67, this, c56082Ouz);
        AbstractC56952jT.A01(view);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56082Ouz.class;
    }

    public NF7(InterfaceC11380iw interfaceC11380iw, C54400O2g c54400O2g) {
        this.A00 = interfaceC11380iw;
        this.A01 = c54400O2g;
    }
}
