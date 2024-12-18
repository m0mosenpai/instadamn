package X;

import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.user.model.Product;

/* renamed from: X.IyD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42899IyD implements InterfaceC43414JGe {
    public final /* synthetic */ TaggingActivity A00;
    public final /* synthetic */ TagsInteractiveLayout A01;

    @Override // X.InterfaceC43414JGe
    public final void Dyg(Product product) {
        C14360o3.A0B(product, 0);
        TaggingActivity taggingActivity = this.A00;
        TagsInteractiveLayout.A01(this.A01, product, false);
        TaggingActivity.A0M(taggingActivity, product);
    }

    public C42899IyD(TaggingActivity taggingActivity, TagsInteractiveLayout tagsInteractiveLayout) {
        this.A00 = taggingActivity;
        this.A01 = tagsInteractiveLayout;
    }
}
