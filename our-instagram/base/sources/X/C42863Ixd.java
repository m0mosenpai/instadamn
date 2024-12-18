package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.user.model.Product;
import java.util.Collections;

/* renamed from: X.Ixd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42863Ixd implements JHP {
    public final /* synthetic */ TaggingActivity A00;
    public final /* synthetic */ TagsInteractiveLayout A01;
    public final /* synthetic */ Product A02;

    @Override // X.JHP
    public final void Dq0(ProductGroup productGroup) {
        if (productGroup != null && !AbstractC37301Gc2.A1b(productGroup.A02)) {
            C1XJ c1xj = C1XJ.A00;
            TaggingActivity taggingActivity = this.A00;
            c1xj.A0e(taggingActivity, taggingActivity.getSupportFragmentManager(), TaggingActivity.A03(taggingActivity), productGroup, new C42899IyD(taggingActivity, this.A01), AbstractC166997dE.A0r(taggingActivity.getResources(), ((ProductVariantDimension) Collections.unmodifiableList(productGroup.A02).get(0)).A03, 2131955164), false);
            return;
        }
        TaggingActivity taggingActivity2 = this.A00;
        Product product = this.A02;
        TagsInteractiveLayout.A01(this.A01, product, false);
        TaggingActivity.A0M(taggingActivity2, product);
    }

    public C42863Ixd(TaggingActivity taggingActivity, TagsInteractiveLayout tagsInteractiveLayout, Product product) {
        this.A00 = taggingActivity;
        this.A02 = product;
        this.A01 = tagsInteractiveLayout;
    }

    @Override // X.JHP
    public final void DFf() {
        this.A01.AVh();
    }
}
