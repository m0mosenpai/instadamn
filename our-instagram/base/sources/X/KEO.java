package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes8.dex */
public final class KEO extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return C05F.A00(1).length;
    }

    public KEO(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1668513078);
        AbstractC167007dF.A1D(view, 1, obj);
        if (JQ0.A04(1, i) == 0) {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteThumbnailDrawableImageViewBinder.Holder");
            C47270Kuh c47270Kuh = (C47270Kuh) tag;
            C47273Kuk c47273Kuk = (C47273Kuk) obj;
            C14360o3.A0B(c47270Kuh, 0);
            C14360o3.A0B(c47273Kuk, 1);
            c47270Kuh.A00.setImageDrawable(c47273Kuk.A00);
            C0f9.A0A(708215190, A03);
            return;
        }
        B4Z A00 = B4Z.A00();
        C0f9.A0A(-1801684464, A03);
        throw A00;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC167017dG.A1N(anonymousClass306, obj);
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-470867676);
        C14360o3.A0B(viewGroup, 1);
        if (JQ0.A04(1, i) == 0) {
            View inflate = AbstractC31172DnG.A09(this.A00).inflate(R.layout.promote_recycler_thumbnail_drawable_image_view, viewGroup, false);
            C14360o3.A0C(inflate, AbstractC111324zv.A00(69));
            IgSimpleImageView igSimpleImageView = (IgSimpleImageView) inflate;
            igSimpleImageView.setTag(new C47270Kuh(igSimpleImageView));
            C0f9.A0A(-1332356112, A03);
            return igSimpleImageView;
        }
        B4Z A00 = B4Z.A00();
        C0f9.A0A(-996750080, A03);
        throw A00;
    }
}
