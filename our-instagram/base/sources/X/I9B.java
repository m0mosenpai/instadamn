package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I9B {
    public static final C42307IoV A00(Context context, InterfaceC11380iw interfaceC11380iw, EnumC39620HeU enumC39620HeU, InterfaceC43418JGi interfaceC43418JGi, String str, String str2, String str3, String str4, String str5, List list, int i, int i2) {
        ImageUrl imageUrl;
        List list2;
        ImageInfo BGx;
        ExtendedImageUrl A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (true) {
            imageUrl = null;
            if (!it.hasNext()) {
                break;
            }
            ProductImageContainer productImageContainer = (ProductImageContainer) it.next();
            if (productImageContainer != null && (BGx = productImageContainer.BGx()) != null && (A01 = AbstractC40161tk.A01(context, BGx)) != null) {
                A1E.add(A01);
            }
        }
        List A0d = AbstractC001800i.A0d(A1E, 4);
        if (enumC39620HeU == EnumC39620HeU.A08) {
            list2 = C16930sl.A00;
        } else if (enumC39620HeU == EnumC39620HeU.A05 && A0d.size() == 1) {
            imageUrl = (ImageUrl) AbstractC001800i.A0O(A0d, 0);
            list2 = C16930sl.A00;
            A0d = list2;
        } else {
            list2 = A0d;
            A0d = C16930sl.A00;
        }
        return new C42307IoV(interfaceC11380iw, imageUrl, str, str2, list2, A0d, new J7T(interfaceC43418JGi, str3, str4, str5, i, i2), C43361JEc.A01(interfaceC43418JGi, 30));
    }
}
