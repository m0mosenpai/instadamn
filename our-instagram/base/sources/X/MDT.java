package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final /* synthetic */ class MDT extends C03E implements InterfaceC16620sF {
    public static final MDT A00 = new MDT();

    public MDT() {
        super(2, AbstractC46455KhF.class, "generateShoppingProduct", "generateShoppingProduct(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/user/model/ProductDetailsProductItemDict;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ExtendedImageUrl extendedImageUrl;
        String str;
        String str2;
        String A19;
        ExtendedImageUrl A02;
        LEN len = (LEN) obj;
        ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) obj2;
        boolean A1R = AbstractC167007dF.A1R(0, len, productDetailsProductItemDict);
        User user = productDetailsProductItemDict.A0G;
        ExtendedImageUrl extendedImageUrl2 = null;
        if (user != null) {
            extendedImageUrl = AbstractC43593JPy.A0g(user);
            str = user.getUsername();
        } else {
            extendedImageUrl = null;
            str = null;
        }
        ImageInfo imageInfo = AbstractC38048Gob.A01(productDetailsProductItemDict).A08;
        if (imageInfo != null && (A02 = AbstractC40161tk.A02(imageInfo)) != null) {
            extendedImageUrl2 = new ExtendedImageUrl(A02);
        }
        String str3 = productDetailsProductItemDict.A0e;
        Integer valueOf = Integer.valueOf(A1R ? 1 : 0);
        Context context = (Context) len.A00.invoke();
        Product A01 = AbstractC38048Gob.A01(productDetailsProductItemDict);
        C14360o3.A0B(context, 0);
        String str4 = A01.A0G;
        if (str4 == null) {
            A19 = " ";
        } else {
            SpannableStringBuilder A012 = AbstractC37300Gc1.A01();
            if (A01.A05()) {
                str2 = AbstractC31174DnI.A0t(context, A01.A0L, str4, 2131963204);
            } else {
                str2 = A01.A0L;
            }
            A012.append((CharSequence) str2);
            A19 = AbstractC166987dD.A19(A012);
        }
        return AbstractC47996LLi.A05(extendedImageUrl, extendedImageUrl2, null, valueOf, valueOf, null, null, str, str3, A19, LEN.A00(len), null, 0);
    }
}
