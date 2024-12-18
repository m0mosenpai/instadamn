package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView;

/* renamed from: X.73h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1570273h {
    public static final void A00(Context context, C72V c72v, Integer num) {
        NestableRecyclerView nestableRecyclerView = c72v.A09;
        nestableRecyclerView.setPassThroughEdge(2);
        if (c72v.A00 != num) {
            c72v.A00 = num;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
            nestableRecyclerView.setLayoutManager(linearLayoutManager);
            linearLayoutManager.A12(true);
            final int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
            while (nestableRecyclerView.A12.size() > 0) {
                nestableRecyclerView.A0m(0);
            }
            if (num == C05F.A0C) {
                int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
                AbstractC13880nE.A0a(nestableRecyclerView, dimensionPixelOffset);
                AbstractC13880nE.A0c(nestableRecyclerView, dimensionPixelOffset);
                nestableRecyclerView.setClipToPadding(false);
                nestableRecyclerView.setClipChildren(false);
            } else {
                AbstractC13880nE.A0a(nestableRecyclerView, 0);
                AbstractC13880nE.A0c(nestableRecyclerView, 0);
                nestableRecyclerView.A10(new AbstractC70653Fc() { // from class: X.73i
                    @Override // X.AbstractC70653Fc
                    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
                        C14360o3.A0B(rect, 0);
                        C14360o3.A0B(view, 1);
                        C14360o3.A0B(recyclerView, 2);
                        if (RecyclerView.A02(view) == 0) {
                            rect.set(dimensionPixelSize, 0, 0, 0);
                        } else {
                            rect.set(0, 0, 0, 0);
                        }
                    }
                });
            }
            nestableRecyclerView.A0h();
        }
    }
}
