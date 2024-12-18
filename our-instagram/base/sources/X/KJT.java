package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* loaded from: classes8.dex */
public final class KJT extends AbstractC66422zJ {
    public final UserSession A00;
    public final InterfaceC159877Ez A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int A06;
        LZK lzk = (LZK) interfaceC66482zP;
        C44664Jq9 c44664Jq9 = (C44664Jq9) c3oo;
        AbstractC167017dG.A1N(lzk, c44664Jq9);
        UserSession userSession = this.A00;
        C45026JwH c45026JwH = lzk.A00;
        InterfaceC159877Ez interfaceC159877Ez = this.A01;
        AbstractC167007dF.A1E(userSession, 0, interfaceC159877Ez);
        IgImageView igImageView = c44664Jq9.A00;
        Context context = igImageView.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_circle_size);
        DirectAnimatedMedia directAnimatedMedia = c45026JwH.A01;
        GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
        C14360o3.A0A(context);
        C74P c74p = new C74P(context, userSession, C74U.A00(AbstractC46673Kkq.A00(gifUrlImpl), 0, dimensionPixelSize, -1), gifUrlImpl, (GifUrlImpl) null, C05F.A01, directAnimatedMedia.A05, AbstractC43594JPz.A04(context), AbstractC167007dF.A09(context, R.attr.stickerLoadingStartColor), AbstractC167007dF.A09(context, R.attr.stickerLoadingEndColor), false);
        RoundedCornerFrameLayout roundedCornerFrameLayout = c44664Jq9.A01;
        if (directAnimatedMedia.A06) {
            A06 = 0;
        } else {
            A06 = AbstractC167017dG.A06(context);
        }
        roundedCornerFrameLayout.setCornerRadius(A06);
        igImageView.setImageDrawable(c74p);
        C3P9 A0s = AbstractC166987dD.A0s(roundedCornerFrameLayout);
        A0s.A04 = new KKo(6, c45026JwH, interfaceC159877Ez);
        AbstractC47848LBr.A01(userSession, A0s);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZK.class;
    }

    public KJT(UserSession userSession, InterfaceC159877Ez interfaceC159877Ez) {
        this.A00 = userSession;
        this.A01 = interfaceC159877Ez;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C44664Jq9(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_star_tab_item, false));
    }
}
