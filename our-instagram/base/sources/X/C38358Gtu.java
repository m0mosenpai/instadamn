package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.ProductWithMediaImage;
import com.instagram.api.schemas.ShoppingBrandWithProducts;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gtu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38358Gtu extends C2UU {
    public InterfaceC65012wz A00;
    public String A01;
    public final Context A02;
    public final InterfaceC11380iw A03;
    public final List A05 = AbstractC166987dD.A1E();
    public final List A04 = AbstractC166987dD.A1E();

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Context context = this.A02;
        View A07 = AbstractC31175DnJ.A07(LayoutInflater.from(context), viewGroup, R.layout.merchant_card_layout, false);
        C39356HZw c39356HZw = new C39356HZw(A07);
        int A00 = I9C.A00(context);
        AbstractC13880nE.A0g(c39356HZw.A00, A00);
        int A0A = ((A00 - (AbstractC167017dG.A0A(context) * 2)) - context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material)) / 2;
        LinearLayout linearLayout = c39356HZw.A01;
        AbstractC13880nE.A0W(linearLayout, A0A);
        LayoutInflater from = LayoutInflater.from(context);
        int i2 = 0;
        do {
            View A0C = AbstractC31173DnH.A0C(from, linearLayout, R.layout.merchant_card_product_thumbnail, false);
            AbstractC13880nE.A0h(A0C, A0A, A0A);
            if (i2 > 0) {
                AbstractC13880nE.A0e(A0C, AbstractC166997dE.A04(context, R.dimen.abc_control_corner_material));
            }
            linearLayout.addView(A0C);
            c39356HZw.A05.add(AbstractC166987dD.A0c(A0C, R.id.product_thumbnail_image));
            i2++;
        } while (i2 < 2);
        C14360o3.A0B(A07, 0);
        A07.setOnTouchListener(ViewOnTouchListenerC42060IkT.A00);
        Object A0Q = AbstractC37303Gc4.A0Q(A07, c39356HZw);
        if (A0Q != null) {
            return (C3OO) A0Q;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        ?? r6;
        ImageInfo imageInfo;
        ExtendedImageUrl A02;
        AbstractC38392GuT abstractC38392GuT = (AbstractC38392GuT) c3oo;
        C14360o3.A0B(abstractC38392GuT, 0);
        InterfaceC65012wz interfaceC65012wz = this.A00;
        if (interfaceC65012wz != null) {
            C39356HZw c39356HZw = (C39356HZw) abstractC38392GuT;
            String str = this.A01;
            List list = this.A05;
            ShoppingBrandWithProducts shoppingBrandWithProducts = (ShoppingBrandWithProducts) list.get(i);
            InterfaceC11380iw interfaceC11380iw = this.A03;
            int A06 = AbstractC167007dF.A06(0, c39356HZw, shoppingBrandWithProducts);
            User CDj = shoppingBrandWithProducts.CDj();
            LinearLayout linearLayout = c39356HZw.A00;
            C0fQ.A00(new ViewOnClickListenerC55453Ok7(shoppingBrandWithProducts, interfaceC65012wz, str, i, 5), linearLayout);
            c39356HZw.A04.setUrl(CDj.Bhu(), interfaceC11380iw);
            TextView textView = c39356HZw.A03;
            AbstractC31173DnH.A1F(textView, CDj);
            textView.getPaint().setFakeBoldText(true);
            C85963sQ.A0C(textView, CDj.isVerified());
            TextView textView2 = c39356HZw.A02;
            String ArN = shoppingBrandWithProducts.ArN();
            if (ArN == null) {
                ArN = AbstractC166997dE.A0q(AbstractC25228BEl.A0M(linearLayout), 2131966340);
            }
            textView2.setText(ArN);
            List BhR = shoppingBrandWithProducts.BhR();
            if (BhR == null || (r6 = Collections.unmodifiableList(AbstractC38048Gob.A03(BhR))) == 0) {
                List unmodifiableList = Collections.unmodifiableList(shoppingBrandWithProducts.BhO());
                if (unmodifiableList != null) {
                    r6 = AbstractC166987dD.A1E();
                    Iterator it = unmodifiableList.iterator();
                    while (it.hasNext()) {
                        r6.add(AbstractC38048Gob.A01(((ProductWithMediaImage) it.next()).BTe()));
                    }
                } else {
                    r6 = C16930sl.A00;
                }
            }
            int i2 = 0;
            do {
                View childAt = c39356HZw.A01.getChildAt(i2);
                C14360o3.A0A(childAt);
                int i3 = 8;
                if (i2 < r6.size()) {
                    i3 = 0;
                }
                childAt.setVisibility(i3);
                if (childAt.getVisibility() == 0 && (imageInfo = ((Product) r6.get(i2)).A08) != null && (A02 = AbstractC40161tk.A02(imageInfo)) != null) {
                    ((IgImageView) c39356HZw.A05.get(i2)).setUrl(A02, interfaceC11380iw);
                }
                i2++;
            } while (i2 < A06);
            interfaceC65012wz.EDT(linearLayout, ((ShoppingBrandWithProducts) list.get(i)).CDj());
        }
    }

    public C38358Gtu(Context context, InterfaceC11380iw interfaceC11380iw) {
        this.A02 = context;
        this.A03 = interfaceC11380iw;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1225634002);
        int size = this.A05.size();
        C0f9.A0A(1950267535, A03);
        return size;
    }
}
