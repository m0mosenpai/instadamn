package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UH4 extends AbstractC70653Fc {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C69644Vsl A01;

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        C14360o3.A0B(rect, 0);
        AbstractC167027dH.A13(view, recyclerView, c3f5);
        super.getItemOffsets(rect, view, recyclerView, c3f5);
        int A02 = RecyclerView.A02(view);
        if (A02 == -1) {
            view.setVisibility(4);
            return;
        }
        view.setVisibility(0);
        C2UU c2uu = recyclerView.A0A;
        if (c2uu != null) {
            int itemCount = c2uu.getItemCount();
            float f = this.A00;
            C69644Vsl c69644Vsl = this.A01;
            Context context = c69644Vsl.A04.getContext();
            int width = (c69644Vsl.A02.getWidth() - Math.round(f * context.getResources().getDimension(R.dimen.media_thumbnail_preview_item_height))) / 2;
            int A022 = (int) AbstractC43594JPz.A02(context);
            if (A02 == 0) {
                rect.left = width;
                return;
            }
            rect.left = A022;
            if (A02 != itemCount - 1) {
                return;
            }
            rect.right = width;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public UH4(C69644Vsl c69644Vsl, float f) {
        this.A00 = f;
        this.A01 = c69644Vsl;
    }
}
