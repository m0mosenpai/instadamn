package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* loaded from: classes4.dex */
public final class AjI implements InterfaceC80653iu {
    public final /* synthetic */ C160577Hr A00;
    public final /* synthetic */ IgProgressImageView A01;
    public final /* synthetic */ Integer A02;

    public AjI(C160577Hr c160577Hr, IgProgressImageView igProgressImageView, Integer num) {
        this.A01 = igProgressImageView;
        this.A00 = c160577Hr;
        this.A02 = num;
    }

    @Override // X.InterfaceC80653iu
    public final /* synthetic */ void DFp() {
    }

    @Override // X.InterfaceC80653iu
    public final void DPX(C73083Pj c73083Pj) {
        int i;
        IgProgressImageView igProgressImageView = this.A01;
        C160577Hr c160577Hr = this.A00;
        igProgressImageView.addView(c160577Hr.A02, igProgressImageView.indexOfChild(igProgressImageView.getIgImageView()) + 1);
        C160567Hq c160567Hq = c160577Hr.A05;
        Integer num = this.A02;
        View view = c160567Hq.A00;
        if (view == null) {
            view = c160567Hq.A02.inflate();
            c160567Hq.A00 = view;
        }
        if (c160567Hq.A01 == null) {
            C14360o3.A0A(view);
            c160567Hq.A01 = (IgSimpleImageView) view.requireViewById(R.id.gated_icon);
        }
        View view2 = c160567Hq.A00;
        C14360o3.A0A(view2);
        Context context = view2.getContext();
        View view3 = c160567Hq.A00;
        C14360o3.A0A(view3);
        view3.setVisibility(0);
        IgSimpleImageView igSimpleImageView = c160567Hq.A01;
        C14360o3.A0A(igSimpleImageView);
        igSimpleImageView.setVisibility(0);
        Integer num2 = C05F.A00;
        IgSimpleImageView igSimpleImageView2 = c160567Hq.A01;
        if (num == num2) {
            C14360o3.A0A(igSimpleImageView2);
            i = R.drawable.instagram_news_off_outline_18;
        } else {
            C14360o3.A0A(igSimpleImageView2);
            i = R.drawable.instagram_eye_off_outline_18;
        }
        AbstractC166997dE.A19(context, igSimpleImageView2, i);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        IgSimpleImageView igSimpleImageView3 = c160567Hq.A01;
        C14360o3.A0A(igSimpleImageView3);
        Drawable drawable = igSimpleImageView3.getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(porterDuffColorFilter);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
