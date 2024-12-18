package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.ProductCollection;

/* loaded from: classes7.dex */
public final class HF9 extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final InterfaceC43422JGm A01;
    public final boolean A02;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public HF9(InterfaceC11380iw interfaceC11380iw, InterfaceC43422JGm interfaceC43422JGm, boolean z) {
        this.A00 = interfaceC11380iw;
        this.A02 = z;
        this.A01 = interfaceC43422JGm;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        ProductImageContainer BGV;
        ImageInfo BGx;
        ExtendedImageUrl A02;
        int A0G = AbstractC25231BEo.A0G(view, -1327506252);
        C14360o3.A0B(obj, 2);
        ProductCollection productCollection = (ProductCollection) obj;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        boolean z = this.A02;
        InterfaceC43422JGm interfaceC43422JGm = this.A01;
        C14360o3.A0B(productCollection, 1);
        AbstractC167007dF.A1F(interfaceC11380iw, 2, interfaceC43422JGm);
        Object tag = view.getTag();
        if (tag != null) {
            C41109IIa c41109IIa = (C41109IIa) tag;
            IgTextView igTextView = c41109IIa.A02;
            igTextView.setText(productCollection.getTitle());
            AbstractC37300Gc1.A0d(igTextView, true);
            c41109IIa.A01.setText(productCollection.getSubtitle());
            RoundedCornerImageView roundedCornerImageView = c41109IIa.A03;
            roundedCornerImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ProductCollectionCover AsD = productCollection.AsD();
            if (AsD != null && (BGV = AsD.BGV()) != null && (BGx = BGV.BGx()) != null && (A02 = AbstractC40161tk.A02(BGx)) != null) {
                roundedCornerImageView.setUrl(A02, interfaceC11380iw);
            }
            if (z) {
                ImageButton imageButton = c41109IIa.A00;
                imageButton.setVisibility(0);
                ViewOnClickListenerC38053Gog.A03(imageButton, 44, interfaceC43422JGm, productCollection);
            }
            C0f9.A0A(1794445408, A0G);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 798722394);
        View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.shopping_item, false);
        A0C.setTag(new C41109IIa(A0C));
        C0f9.A0A(500217884, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
