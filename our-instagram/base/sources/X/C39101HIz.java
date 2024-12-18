package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

/* renamed from: X.HIz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39101HIz extends AbstractC66422zJ {
    public final IKT A00;

    public C39101HIz(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, C41029IEy c41029IEy, String str, String str2, java.util.Set set, int i, boolean z) {
        AbstractC25229BEm.A1J(userSession, 2, set);
        this.A00 = new IKT(context, interfaceC11380iw, userSession, c57112jm, c41029IEy, str, str2, set, i, z);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C38467Gvo(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_product_tab_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        ImageInfo BGx;
        C42292IoG c42292IoG = (C42292IoG) interfaceC66482zP;
        C38467Gvo c38467Gvo = (C38467Gvo) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c42292IoG, c38467Gvo);
        IKT ikt = this.A00;
        TextView textView = c38467Gvo.A01;
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf = c42292IoG.A00;
        textView.setText(productDetailsProductItemDictIntf.getName());
        boolean z = ikt.A09;
        TextView textView2 = c38467Gvo.A02;
        if (z) {
            String fullPriceStripped = productDetailsProductItemDictIntf.getFullPriceStripped();
            if (fullPriceStripped == null) {
                fullPriceStripped = "";
            }
            textView2.setText(fullPriceStripped);
        } else {
            textView2.setVisibility(8);
        }
        ProductImageContainer BPX = productDetailsProductItemDictIntf.BPX();
        if (BPX != null && (BGx = BPX.BGx()) != null) {
            ExtendedImageUrl A04 = AbstractC40161tk.A04(BGx, C05F.A0C, Math.min(AbstractC13880nE.A0A(ikt.A01), 1080));
            if (A04 != null) {
                c38467Gvo.A03.setUrl(A04, ikt.A02);
            }
        }
        RoundedCornerImageView roundedCornerImageView = c38467Gvo.A03;
        ViewOnClickListenerC42029Ijy.A00(roundedCornerImageView, c38467Gvo, c42292IoG, ikt, 21);
        roundedCornerImageView.setRadius(ikt.A01.getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        UserSession userSession = ikt.A03;
        if (C18U.A06(C06090Tz.A05, userSession, 36328980873625514L)) {
            roundedCornerImageView.setOnLongClickListener(new ViewOnLongClickListenerC42042IkB(ikt, 0));
            c38467Gvo.A00.setOnLongClickListener(new ViewOnLongClickListenerC42042IkB(ikt, A1R ? 1 : 0));
        }
        C57112jm c57112jm = ikt.A04;
        C59072n8 A00 = C59062n7.A00(c42292IoG, Integer.valueOf(c38467Gvo.getAbsoluteAdapterPosition()), c42292IoG.A01);
        InterfaceC11380iw interfaceC11380iw = ikt.A02;
        C14360o3.A0C(interfaceC11380iw, AbstractC111324zv.A00(7));
        A00.A00(new C42391Ips(userSession, (InterfaceC60442pS) interfaceC11380iw, ikt.A07, ikt.A08, c38467Gvo.getLayoutPosition(), ikt.A00));
        AbstractC25227BEk.A10(roundedCornerImageView, A00, c57112jm);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42292IoG.class;
    }
}
