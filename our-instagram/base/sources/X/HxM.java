package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.user.model.Product;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class HxM {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A03;
        Object A032 = c6fw.A03(1);
        C14360o3.A0C(A032, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) A032;
        Object A033 = c6fw.A03(2);
        C14360o3.A0C(A033, AbstractC111324zv.A00(22));
        List list = (List) A033;
        List list2 = c6fw.A00;
        C102884kP c102884kP = (C102884kP) list2.get(3);
        C102884kP c102884kP2 = (C102884kP) list2.get(4);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C14360o3.A0C(A04, "null cannot be cast to non-null type com.instagram.tagging.activity.TaggingActivity");
        Intent intent = new Intent();
        C14360o3.A0B(list, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        Product A01 = AbstractC41287IPc.A01((C102884kP) list.get(0));
        C41746IeK c41746IeK = new C41746IeK(A01);
        c41746IeK.A0D = new TaggingFeedSessionInformation(str2, str3);
        intent.putExtra("selected_product", c41746IeK.A03(A01.A0H));
        if (c102884kP2 != null) {
            str = c102884kP2.A0E();
        } else {
            str = null;
        }
        intent.putExtra("tagging_info_id", str);
        ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = null;
        if (c102884kP != null) {
            String A0E = c102884kP.A0E();
            String A0G = c102884kP.A0G();
            String A0I = c102884kP.A0I();
            if (A0E != null && A0G != null) {
                productCollectionFeedTaggingMeta = new ProductCollectionFeedTaggingMeta(AbstractC40163Hrb.A00(A0G), A0E, A0I, null, null, false);
            }
        }
        intent.putExtra(MSV.A00(589), productCollectionFeedTaggingMeta);
        A04.onActivityResult(18, -1, intent);
        return null;
    }
}
