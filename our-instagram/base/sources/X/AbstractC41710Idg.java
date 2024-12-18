package X;

import com.instagram.model.shopping.CompoundProductId;
import com.instagram.model.shopping.ProductTag;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Idg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41710Idg {
    public static ShoppingTaggingFeedArguments A00(ClipInfo clipInfo, EnumC39584Hdu enumC39584Hdu, ShoppingTaggingFeedClientState shoppingTaggingFeedClientState, ShoppingTaggingFeedHeader shoppingTaggingFeedHeader, TaggingFeedMultiSelectState taggingFeedMultiSelectState, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, boolean z) {
        String str9 = str7;
        if (str7 == null) {
            str9 = AbstractC167017dG.A0j();
        }
        return new ShoppingTaggingFeedArguments(clipInfo, enumC39584Hdu, shoppingTaggingFeedClientState, shoppingTaggingFeedHeader, taggingFeedMultiSelectState, num, l, str3, str8, str9, str6, str5, str4, str, str2, list, z, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static void A03(ShoppingTaggingFeedClientState shoppingTaggingFeedClientState, List list, List list2) {
        ?? r5;
        String str;
        String str2;
        ArrayList A0i = AbstractC167007dF.A0i(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductTag productTag = (ProductTag) it.next();
            String str3 = AbstractC38048Gob.A00(productTag).A0H;
            User user = AbstractC38048Gob.A00(productTag).A0B;
            if (user == null || (str2 = AbstractC76433bn.A00(user)) == null) {
                str2 = "";
            }
            A0i.add(new CompoundProductId(str3, str2));
        }
        if (list2 != null) {
            r5 = AbstractC167007dF.A0i(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ProductTag productTag2 = (ProductTag) it2.next();
                String str4 = AbstractC38048Gob.A00(productTag2).A0H;
                User user2 = AbstractC38048Gob.A00(productTag2).A0B;
                if (user2 == null || (str = AbstractC76433bn.A00(user2)) == null) {
                    str = "";
                }
                r5.add(new CompoundProductId(str4, str));
            }
        } else {
            r5 = C16930sl.A00;
        }
        List A0W = AbstractC001800i.A0W(AbstractC06950Ym.A1F(AbstractC16960so.A1Q(A0i, (List) r5)));
        C14360o3.A0B(A0W, 0);
        shoppingTaggingFeedClientState.A05 = A0W;
        List list3 = shoppingTaggingFeedClientState.A04;
        ArrayList A0i2 = AbstractC167007dF.A0i(A0W);
        Iterator it3 = A0W.iterator();
        while (it3.hasNext()) {
            A0i2.add(((CompoundProductId) it3.next()).A00);
        }
        List A0W2 = AbstractC001800i.A0W(AbstractC06950Ym.A1F(AbstractC16960so.A1Q(list3, A0i2)));
        C14360o3.A0B(A0W2, 0);
        shoppingTaggingFeedClientState.A04 = A0W2;
        List list4 = shoppingTaggingFeedClientState.A06;
        List list5 = shoppingTaggingFeedClientState.A05;
        ArrayList A0i3 = AbstractC167007dF.A0i(list5);
        Iterator it4 = list5.iterator();
        while (it4.hasNext()) {
            A0i3.add(((CompoundProductId) it4.next()).A00);
        }
        ArrayList A0S = AbstractC001800i.A0S(AbstractC001800i.A0W(A0i3), list4);
        C14360o3.A0B(A0S, 0);
        shoppingTaggingFeedClientState.A06 = A0S;
    }

    public static ShoppingTaggingFeedArguments A01(ClipInfo clipInfo, EnumC39584Hdu enumC39584Hdu, ShoppingTaggingFeedClientState shoppingTaggingFeedClientState, TaggingFeedMultiSelectState taggingFeedMultiSelectState, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z) {
        return new ShoppingTaggingFeedArguments(clipInfo, enumC39584Hdu, shoppingTaggingFeedClientState, null, taggingFeedMultiSelectState, num, l, str3, str7, AbstractC167017dG.A0j(), str6, str5, str4, str, str2, list, true, false, z);
    }

    public static void A02(ShoppingTaggingFeedClientState shoppingTaggingFeedClientState, List list) {
        String str;
        String A00;
        ArrayList A0i = AbstractC167007dF.A0i(list);
        Iterator it = list.iterator();
        while (true) {
            String str2 = "";
            if (!it.hasNext()) {
                break;
            }
            Product A0L = AbstractC37300Gc1.A0L(it);
            String str3 = A0L.A0H;
            User user = A0L.A0B;
            if (user != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                str2 = A00;
            }
            A0i.add(new CompoundProductId(str3, str2));
        }
        List A0W = AbstractC001800i.A0W(A0i);
        C14360o3.A0B(A0W, 0);
        shoppingTaggingFeedClientState.A05 = A0W;
        ArrayList A0i2 = AbstractC167007dF.A0i(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            User user2 = AbstractC37300Gc1.A0L(it2).A0B;
            if (user2 == null || (str = AbstractC76433bn.A00(user2)) == null) {
                str = "";
            }
            A0i2.add(str);
        }
        List A0W2 = AbstractC001800i.A0W(A0i2);
        C14360o3.A0B(A0W2, 0);
        shoppingTaggingFeedClientState.A04 = A0W2;
    }
}
