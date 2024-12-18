package X;

import android.content.Intent;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.shopping.intf.productpicker.MultiProductPickerResult;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.IeL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41747IeL {
    public static final TaggingFeedMultiSelectState A00(Intent intent) {
        MultiProductPickerResult multiProductPickerResult = (MultiProductPickerResult) intent.getParcelableExtra(MSV.A00(57));
        if (multiProductPickerResult == null) {
            return null;
        }
        List list = multiProductPickerResult.A02;
        Map map = multiProductPickerResult.A03;
        return new TaggingFeedMultiSelectState(multiProductPickerResult.A00, multiProductPickerResult.A01, list, map);
    }

    public static final ArrayList A01(C38686GzR c38686GzR, String str) {
        List<C38682GzN> list;
        TaggingFeedSessionInformation taggingFeedSessionInformation;
        if (c38686GzR != null) {
            list = (List) c38686GzR.A01;
        } else {
            list = null;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        if (list != null) {
            for (C38682GzN c38682GzN : list) {
                String str2 = c38682GzN.A06;
                if (str != null && str2 != null) {
                    taggingFeedSessionInformation = new TaggingFeedSessionInformation(str, str2);
                } else {
                    taggingFeedSessionInformation = null;
                }
                ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) c38682GzN.A00;
                if (productDetailsProductItemDict != null) {
                    A1E.add(new Product(taggingFeedSessionInformation, productDetailsProductItemDict));
                }
            }
        }
        return A1E;
    }

    public final C38686GzR A04(Intent intent, String str) {
        MultiProductPickerResult multiProductPickerResult = (MultiProductPickerResult) intent.getParcelableExtra(MSV.A00(57));
        if (multiProductPickerResult == null) {
            return null;
        }
        ProductCollection productCollection = multiProductPickerResult.A01;
        return C41722Idt.A00(productCollection, productCollection != null ? productCollection.Ap3() : null, str, multiProductPickerResult.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        if (r2 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(X.C38645Gym r6, com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r7) {
        /*
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = r7.A00
            r1 = 0
            if (r0 == 0) goto L4b
            java.lang.String r5 = r0.A01
        L7:
            java.util.Map r0 = r7.A04
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r4 = 0
            if (r0 == 0) goto L41
            if (r5 == 0) goto L41
            if (r6 == 0) goto L42
            X.GzT r2 = r6.A02
            if (r2 == 0) goto L43
            java.lang.Object r0 = r2.A01
            X.MUD r0 = (X.MUD) r0
            if (r0 == 0) goto L43
            java.lang.String r3 = r0.A02
        L22:
            java.lang.Object r2 = r2.A00
            X.Mta r2 = (X.C51751Mta) r2
            if (r2 == 0) goto L47
            java.lang.Object r0 = r2.A00
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = (com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta) r0
            if (r0 == 0) goto L47
            java.lang.String r0 = r0.A01
        L30:
            java.lang.String r1 = r2.A02
        L32:
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L41
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L41
            if (r3 != 0) goto L41
            r4 = 1
        L41:
            return r4
        L42:
            r2 = r1
        L43:
            r3 = r1
            if (r2 != 0) goto L22
            r2 = r1
        L47:
            r0 = r1
            if (r2 == 0) goto L32
            goto L30
        L4b:
            r5 = r1
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41747IeL.A02(X.Gym, com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r2 != com.instagram.api.schemas.ProductCollectionV2Type.A05) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0052, code lost:
    
        if (r3 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A03(X.C38645Gym r5, com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r6) {
        /*
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = r6.A00
            r2 = 0
            if (r0 == 0) goto L57
            java.lang.String r1 = r0.A01
        L7:
            java.util.Map r0 = r6.A04
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r4 = 0
            if (r0 == 0) goto L4f
            if (r1 != 0) goto L4f
            if (r5 == 0) goto L50
            X.GzT r3 = r5.A02
            if (r3 == 0) goto L51
            java.lang.Object r0 = r3.A01
            X.MUD r0 = (X.MUD) r0
            if (r0 == 0) goto L51
            java.lang.String r1 = r0.A02
        L22:
            java.lang.Object r0 = r3.A00
            X.Mta r0 = (X.C51751Mta) r0
            if (r0 == 0) goto L55
            java.lang.Object r0 = r0.A00
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = (com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta) r0
            if (r0 == 0) goto L55
            java.lang.String r3 = r0.A01
        L30:
            if (r1 != 0) goto L45
            if (r5 == 0) goto L40
            X.Mti r0 = r5.A00
            if (r0 == 0) goto L40
            java.lang.Object r0 = r0.A00
            com.instagram.user.model.ProductCollectionImpl r0 = (com.instagram.user.model.ProductCollectionImpl) r0
            if (r0 == 0) goto L40
            com.instagram.api.schemas.ProductCollectionV2Type r2 = r0.A00
        L40:
            com.instagram.api.schemas.ProductCollectionV2Type r0 = com.instagram.api.schemas.ProductCollectionV2Type.A05
            r1 = 1
            if (r2 == r0) goto L46
        L45:
            r1 = 0
        L46:
            boolean r0 = X.AbstractC167007dF.A1W(r3)
            if (r1 != 0) goto L4e
            if (r0 == 0) goto L4f
        L4e:
            r4 = 1
        L4f:
            return r4
        L50:
            r3 = r2
        L51:
            r1 = r2
            if (r3 == 0) goto L55
            goto L22
        L55:
            r3 = r2
            goto L30
        L57:
            r1 = r2
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41747IeL.A03(X.Gym, com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState):boolean");
    }

    public final TaggingFeedMultiSelectState A05(ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta, List list) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC38048Gob.A00((ProductTag) it.next()));
        }
        return new TaggingFeedMultiSelectState(productCollectionFeedTaggingMeta, null, A0q, null);
    }
}
