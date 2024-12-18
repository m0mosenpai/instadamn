package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* loaded from: classes8.dex */
public final class KIN extends AbstractC66412zI {
    public final UserSession A00;
    public final InterfaceC16620sF A01;
    public final InterfaceC16620sF A02;
    public final InterfaceC16610sE A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44688JqX(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_giphy_sticker_tray_item, false), this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        ImageView.ScaleType scaleType;
        int A06;
        C45202Jzi c45202Jzi = (C45202Jzi) interfaceC66482zP;
        C44688JqX c44688JqX = (C44688JqX) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c45202Jzi, c44688JqX);
        C45026JwH c45026JwH = c45202Jzi.A02;
        C51751Mta c51751Mta = c45202Jzi.A01;
        InterfaceC16620sF interfaceC16620sF = this.A02;
        InterfaceC16620sF interfaceC16620sF2 = this.A01;
        C14360o3.A0B(c45026JwH, 0);
        AbstractC25233BEq.A0v(A1R ? 1 : 0, c51751Mta, interfaceC16620sF, interfaceC16620sF2);
        ConstrainedImageView constrainedImageView = c44688JqX.A01;
        Context context = constrainedImageView.getContext();
        DirectAnimatedMedia directAnimatedMedia = c45026JwH.A01;
        GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
        C14360o3.A0A(context);
        UserSession userSession = c44688JqX.A00;
        String str = directAnimatedMedia.A05;
        float A04 = AbstractC43594JPz.A04(context);
        C74V A01 = C74U.A01(context, 0.4f, AbstractC46673Kkq.A00(gifUrlImpl), context.getResources().getDimensionPixelSize(R.dimen.avatar_reel_ring_size_extra_large));
        int A09 = AbstractC167007dF.A09(context, R.attr.stickerLoadingStartColor);
        int A092 = AbstractC167007dF.A09(context, R.attr.stickerLoadingEndColor);
        Integer num = C05F.A01;
        constrainedImageView.setImageDrawable(new C74P(context, userSession, A01, gifUrlImpl, (GifUrlImpl) null, num, str, A04, A09, A092, false));
        boolean z = directAnimatedMedia.A06;
        if (z) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        constrainedImageView.setScaleType(scaleType);
        RoundedCornerFrameLayout roundedCornerFrameLayout = c44688JqX.A02;
        if (z) {
            A06 = 0;
        } else {
            A06 = AbstractC167017dG.A06(context);
        }
        roundedCornerFrameLayout.setCornerRadius(A06);
        constrainedImageView.setVisibility(0);
        AbstractC56952jT.A04(constrainedImageView, num);
        C3P9 A0s = AbstractC166987dD.A0s(roundedCornerFrameLayout);
        A0s.A04 = new KKm(A1R ? 1 : 0, interfaceC16620sF2, interfaceC16620sF, c45026JwH, c51751Mta, c44688JqX);
        AbstractC47848LBr.A01(userSession, A0s);
        JWd jWd = c45202Jzi.A00;
        if (jWd != null && !jWd.A02) {
            this.A03.invoke(jWd.A01, AbstractC166987dD.A1J(str), EnumC46295KeR.REGULAR);
            jWd.A02 = A1R;
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45202Jzi.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C44688JqX c44688JqX = (C44688JqX) c3oo;
        C14360o3.A0B(c44688JqX, 0);
        ConstrainedImageView constrainedImageView = c44688JqX.A01;
        constrainedImageView.setImageDrawable(null);
        constrainedImageView.setOnTouchListener(null);
        constrainedImageView.setVisibility(4);
    }

    public KIN(UserSession userSession, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, InterfaceC16610sE interfaceC16610sE) {
        this.A00 = userSession;
        this.A02 = interfaceC16620sF;
        this.A01 = interfaceC16620sF2;
        this.A03 = interfaceC16610sE;
    }
}
