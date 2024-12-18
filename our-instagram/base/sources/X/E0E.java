package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserCategoriesViewController;
import com.instagram.profile.bindergroup.AccountLinkModel;
import java.util.List;

/* loaded from: classes6.dex */
public final class E0E extends AbstractC70653Fc {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public E0E(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int A06;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(rect, 0);
                AbstractC167027dH.A13(view, recyclerView, c3f5);
                super.getItemOffsets(rect, view, recyclerView, c3f5);
                Context context = ((View) this.A01).getContext();
                Resources resources = context.getResources();
                int A03 = RecyclerView.A03(view);
                int i = R.dimen.abc_button_padding_horizontal_material;
                if (A03 == 0) {
                    i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
                }
                rect.left = resources.getDimensionPixelSize(i);
                Jng jng = ((GiphyClipsBrowserCategoriesViewController) this.A02).A00;
                if (jng == null) {
                    return;
                }
                if (RecyclerView.A03(view) != AbstractC25226BEj.A05(jng.A01)) {
                    return;
                }
                A06 = AbstractC167017dG.A06(context);
                break;
            case 1:
            default:
                super.getItemOffsets(rect, view, recyclerView, c3f5);
                return;
            case 2:
                if (recyclerView.A0A == null || RecyclerView.A02(view) == r0.getItemCount() - 1) {
                    return;
                }
                A06 = AbstractC166987dD.A0C((Context) this.A02, 5);
                break;
        }
        rect.right = A06;
    }

    @Override // X.AbstractC70653Fc
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C3F5 c3f5) {
        if (1 - this.A00 != 0) {
            super.onDrawOver(canvas, recyclerView, c3f5);
            return;
        }
        AbstractC167017dG.A1N(canvas, recyclerView);
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        List A01 = C32287EJz.A01((C32287EJz) this.A02);
        int i = childCount - 1;
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int A02 = RecyclerView.A02(childAt);
            if (A02 < A01.size()) {
                int i3 = A02 + 1;
                if ((A01.get(i3) instanceof AccountLinkModel.AddFacebookLinkData) || (A01.get(i3) instanceof AccountLinkModel.AddFacebookPageLinkData)) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    C14360o3.A0C(layoutParams, AbstractC111324zv.A00(17));
                    int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    InterfaceC09390do interfaceC09390do = (InterfaceC09390do) this.A01;
                    ((Drawable) interfaceC09390do.getValue()).setBounds(paddingLeft, bottom, width, ((Drawable) interfaceC09390do.getValue()).getIntrinsicHeight() + bottom);
                    ((Drawable) interfaceC09390do.getValue()).draw(canvas);
                    return;
                }
            }
        }
    }

    public E0E(C32287EJz c32287EJz) {
        this.A00 = 1;
        this.A02 = c32287EJz;
        this.A01 = AbstractC09440dt.A01(new GSv(c32287EJz, 34));
    }
}
