package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HIQ extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final ShoppingCartFragment A01;
    public final UserSession A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        ExtendedImageUrl A02;
        View view;
        H7B h7b = (H7B) interfaceC66482zP;
        C38507GwS c38507GwS = (C38507GwS) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, h7b, c38507GwS);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        ShoppingCartFragment shoppingCartFragment = this.A01;
        int A08 = AbstractC25230BEn.A08(3, interfaceC11380iw, shoppingCartFragment);
        View view2 = c38507GwS.A00;
        ViewOnClickListenerC42034Ik3.A00(view2, 44, shoppingCartFragment, h7b);
        User user = h7b.A01;
        ImageUrl Bhu = user.Bhu();
        InterfaceC09390do interfaceC09390do = c38507GwS.A03;
        ((IgImageView) AbstractC166987dD.A17(interfaceC09390do)).setUrl(Bhu, interfaceC11380iw);
        InterfaceC09390do interfaceC09390do2 = c38507GwS.A04;
        AbstractC31173DnH.A1F(AbstractC37302Gc3.A06(interfaceC09390do2), user);
        AbstractC37300Gc1.A0d(AbstractC37302Gc3.A06(interfaceC09390do2), A1R);
        InterfaceC09390do interfaceC09390do3 = c38507GwS.A07;
        TextView A06 = AbstractC37302Gc3.A06(interfaceC09390do3);
        String str = h7b.A02;
        A06.setText(str);
        ViewOnClickListenerC42034Ik3.A00(AbstractC167007dF.A0L(interfaceC09390do), 45, shoppingCartFragment, h7b);
        ViewOnClickListenerC42034Ik3.A00(AbstractC167007dF.A0L(interfaceC09390do2), 46, shoppingCartFragment, h7b);
        ViewOnClickListenerC42034Ik3.A00(AbstractC167007dF.A0L(interfaceC09390do3), 47, shoppingCartFragment, h7b);
        view2.setContentDescription(AnonymousClass001.A0T(user.getUsername(), str, ' '));
        InterfaceC09390do interfaceC09390do4 = c38507GwS.A09;
        ViewOnClickListenerC42034Ik3.A00(AbstractC167007dF.A0L(interfaceC09390do4), 48, shoppingCartFragment, h7b);
        TextView A062 = AbstractC37302Gc3.A06(interfaceC09390do4);
        Context context = view2.getContext();
        AbstractC166987dD.A1P(context, A062, 2131974039);
        InterfaceC09390do interfaceC09390do5 = c38507GwS.A08;
        ViewOnClickListenerC42034Ik3.A00(AbstractC167007dF.A0L(interfaceC09390do5), 49, shoppingCartFragment, h7b);
        InterfaceC09390do interfaceC09390do6 = c38507GwS.A01;
        AbstractC167017dG.A1W(interfaceC09390do6, 0);
        View A0L = AbstractC167007dF.A0L(interfaceC09390do6);
        C41634IbP c41634IbP = h7b.A00;
        List<C41730Ie1> list = c41634IbP.A09;
        C14360o3.A07(list);
        A0L.setEnabled(AbstractC166987dD.A1b(list));
        ViewOnClickListenerC42034Ik3.A00(AbstractC167007dF.A0L(interfaceC09390do6), 50, shoppingCartFragment, h7b);
        AbstractC167017dG.A1W(interfaceC09390do5, 0);
        AbstractC167007dF.A0L(interfaceC09390do4).setVisibility(8);
        ConstraintLayout constraintLayout = (ConstraintLayout) view2;
        C110964z8 c110964z8 = new C110964z8();
        c110964z8.A0I(constraintLayout);
        c110964z8.A09(R.id.thumbnail_image_container_0, A08);
        c110964z8.A09(R.id.divider, 3);
        c110964z8.A0C(R.id.thumbnail_image_container_0, A08, R.id.view_cart_button_bottom, 3);
        c110964z8.A0C(R.id.divider, 3, R.id.view_cart_button_bottom, A08);
        C110964z8.A02(c110964z8, R.id.divider).A03.A0p = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        c110964z8.A0G(constraintLayout);
        AbstractC167007dF.A0L(c38507GwS.A02).setVisibility(AbstractC31175DnJ.A01(h7b.A03 ? 1 : 0));
        ArrayList A1E = AbstractC166987dD.A1E();
        if (c41634IbP.A00 > 0) {
            for (C41730Ie1 c41730Ie1 : list) {
                Product A04 = c41730Ie1.A04();
                if (A04 != null && !AbstractC83893oY.A00(A04.A0N)) {
                    Iterator it = c41730Ie1.A04().A0N.iterator();
                    while (it.hasNext()) {
                        A1E.add(it.next());
                    }
                }
            }
        }
        boolean A1b = AbstractC25226BEj.A1b(A1E);
        InterfaceC09390do interfaceC09390do7 = c38507GwS.A05;
        TextView textView = (TextView) interfaceC09390do7.getValue();
        if (A1b) {
            AbstractC166987dD.A1P(context, textView, 2131968939);
            AbstractC166987dD.A0d(interfaceC09390do7).setVisibility(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) AbstractC167007dF.A0L(interfaceC09390do2).getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = context.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness);
            }
            AbstractC167007dF.A0L(interfaceC09390do2).setLayoutParams(marginLayoutParams);
        } else {
            textView.setVisibility(8);
        }
        List subList = Collections.unmodifiableList(c41634IbP.A06).subList(0, Math.min(Collections.unmodifiableList(c41634IbP.A06).size(), 3));
        InterfaceC09390do interfaceC09390do8 = c38507GwS.A06;
        int size = AbstractC31171DnF.A0n(interfaceC09390do8).size();
        for (int i = 0; i < size; i++) {
            II6 ii6 = (II6) AbstractC37302Gc3.A0Y(interfaceC09390do8, i);
            if (i > AbstractC25226BEj.A05(subList)) {
                view = ii6.A02;
            } else {
                ViewGroup viewGroup = ii6.A02;
                viewGroup.setVisibility(0);
                ViewOnClickListenerC42034Ik3.A00(viewGroup, 43, shoppingCartFragment, h7b);
                AbstractC68575VWc.A00(ii6.A00, ii6.A03);
                Product A042 = ((C41730Ie1) subList.get(i)).A04();
                if (A042 == null) {
                    Drawable A01 = AbstractC85953sP.A01(context, R.drawable.instagram_no_photo_pano_outline_24, AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_05));
                    IgImageView igImageView = ii6.A03;
                    igImageView.setImageDrawable(A01);
                    igImageView.setScaleType(ImageView.ScaleType.CENTER);
                    ii6.A00.setVisibility(0);
                    view = ii6.A01;
                } else {
                    IgImageView igImageView2 = ii6.A03;
                    igImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ImageInfo imageInfo = A042.A08;
                    if (imageInfo != null && (A02 = AbstractC40161tk.A02(imageInfo)) != null) {
                        igImageView2.setUrl(A02, interfaceC11380iw);
                    } else {
                        igImageView2.A09();
                    }
                    View view3 = ii6.A01;
                    int i2 = 0;
                    if (A042.A0P) {
                        i2 = 4;
                    }
                    view3.setVisibility(i2);
                }
            }
            view.setVisibility(8);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return H7B.class;
    }

    public HIQ(InterfaceC11380iw interfaceC11380iw, UserSession userSession, ShoppingCartFragment shoppingCartFragment) {
        this.A02 = userSession;
        this.A00 = interfaceC11380iw;
        this.A01 = shoppingCartFragment;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C38507GwS c38507GwS = new C38507GwS(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.global_cart_merchant_row, false));
        Resources A0M = AbstractC25228BEl.A0M(viewGroup);
        float A05 = ((A0M.getDisplayMetrics().widthPixels - (AbstractC166997dE.A05(A0M) * 2.0f)) - (A0M.getDimensionPixelSize(R.dimen.accent_edge_thickness) * 2.0f)) / 3.0f;
        C38294Gsd c38294Gsd = new C38294Gsd(AbstractC166997dE.A0L(c38507GwS.A00));
        InterfaceC09390do interfaceC09390do = c38507GwS.A06;
        int size = AbstractC31171DnF.A0n(interfaceC09390do).size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = (int) A05;
            AbstractC13880nE.A0g(((II6) AbstractC37302Gc3.A0Y(interfaceC09390do, i2)).A03, i3);
            AbstractC13880nE.A0W(((II6) AbstractC37302Gc3.A0Y(interfaceC09390do, i2)).A03, i3);
            AbstractC13880nE.A0g(((II6) AbstractC37302Gc3.A0Y(interfaceC09390do, i2)).A02, i3);
            AbstractC13880nE.A0W(((II6) AbstractC37302Gc3.A0Y(interfaceC09390do, i2)).A02, i3);
            ((II6) AbstractC37302Gc3.A0Y(interfaceC09390do, i2)).A01.setBackground(c38294Gsd);
        }
        return c38507GwS;
    }
}
