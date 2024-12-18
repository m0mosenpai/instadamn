package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IbH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41626IbH {
    public static C38294Gsd A00;
    public static final C41626IbH A01 = new Object();

    public final void A00(InterfaceC11380iw interfaceC11380iw, C34470FHi c34470FHi, InterfaceC43445JHj interfaceC43445JHj, IK9 ik9, Product product) {
        C38294Gsd c38294Gsd;
        CharSequence A012;
        View view;
        int i;
        String str;
        C14360o3.A0B(interfaceC11380iw, 0);
        AbstractC167027dH.A0a(1, ik9, product, c34470FHi, interfaceC43445JHj);
        View view2 = ik9.A00;
        Context context = view2.getContext();
        ViewOnClickListenerC38053Gog.A03(view2, 47, interfaceC43445JHj, product);
        ImageInfo imageInfo = product.A07;
        if (imageInfo != null) {
            C14360o3.A0A(context);
            ExtendedImageUrl A013 = AbstractC40161tk.A01(context, imageInfo);
            if (A013 != null) {
                ik9.A05.setUrl(A013, interfaceC11380iw);
            }
        }
        RoundedCornerImageView roundedCornerImageView = ik9.A05;
        if (product.A04() && !product.A0P) {
            AbstractC167007dF.A1C(context);
            c38294Gsd = A00;
            if (c38294Gsd == null) {
                c38294Gsd = new C38294Gsd(context);
                A00 = c38294Gsd;
            }
        } else {
            c38294Gsd = null;
        }
        roundedCornerImageView.setForeground(c38294Gsd);
        ik9.A03.setText(product.A0J);
        boolean Eja = interfaceC43445JHj.Eja(product);
        TextView textView = ik9.A02;
        if (Eja) {
            User user = product.A0B;
            if (user != null) {
                str = user.getUsername();
            } else {
                str = "";
            }
            textView.setText(AbstractC1566271k.A09(context, str, Integer.valueOf(R.style.FullPriceSubtitleStyle)));
        } else {
            C14360o3.A0A(context);
            ArrayList A1E = AbstractC166987dD.A1E();
            if (!product.A0P && product.A04()) {
                A1E.add(context.getResources().getString(2131970008));
            }
            C14360o3.A0B(context, 1);
            if (product.A05 == ProductReviewStatus.A04) {
                A012 = AbstractC1566271k.A08(context, product, null, null);
            } else {
                A012 = AbstractC1566271k.A01(context, product, R.style.PendingReviewSubtitleStyle, R.style.AuthErrorTextAppearance);
            }
            A1E.add(A012);
            List<ProductVariantPossibleValueDictIntf> list = product.A0O;
            if (list != null) {
                for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : list) {
                    if (productVariantPossibleValueDictIntf.getValue().length() > 0) {
                        A1E.add(productVariantPossibleValueDictIntf.getValue());
                    }
                }
            }
            String str2 = product.A0M;
            if (str2 != null) {
                A1E.add(AnonymousClass001.A0R("SKU ", str2));
            }
            SpannableStringBuilder A014 = AbstractC37300Gc1.A01();
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                A014.append((CharSequence) it.next());
                if (it.hasNext()) {
                    A014.append((CharSequence) " ");
                    A014.append((CharSequence) "·");
                    A014.append((CharSequence) " ");
                }
            }
            textView.setText(A014);
            textView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC55503Okw(ik9, 11));
        }
        int intValue = c34470FHi.A00.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                view2.removeCallbacks(ik9.A06);
                view2.setTouchDelegate(null);
                ik9.A01.setVisibility(8);
                ik9.A04.setVisibility(8);
                return;
            }
            view2.post(ik9.A06);
            view = ik9.A01;
            view.setVisibility(0);
            i = 46;
        } else {
            view = ik9.A04;
            view.setVisibility(0);
            i = 45;
        }
        ViewOnClickListenerC38053Gog.A03(view, i, interfaceC43445JHj, product);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r1.equals(r0.A0A) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(com.instagram.common.ui.widget.imageview.RoundedCornerImageView r3, com.instagram.user.model.Product r4) {
        /*
            r2 = this;
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            r1 = 1
            boolean r0 = r4.A04()
            if (r0 == 0) goto L34
            boolean r0 = r4.A0P
            if (r0 != 0) goto L34
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r4.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L21
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r0 = r0.A0A
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L34
        L21:
            android.content.Context r1 = X.AbstractC166997dE.A0L(r3)
            X.Gsd r0 = X.C41626IbH.A00
            if (r0 != 0) goto L30
            X.Gsd r0 = new X.Gsd
            r0.<init>(r1)
            X.C41626IbH.A00 = r0
        L30:
            r3.setForeground(r0)
            return
        L34:
            r0 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41626IbH.A01(com.instagram.common.ui.widget.imageview.RoundedCornerImageView, com.instagram.user.model.Product):void");
    }
}
