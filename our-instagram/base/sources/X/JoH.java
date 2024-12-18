package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class JoH extends AbstractC70653Fc {
    public final float A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public JoH(Object obj, Object obj2, float f, int i) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = f;
        this.A03 = obj2;
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        C18950wb c18950wb;
        int i;
        String str;
        int i2 = this.A01;
        C14360o3.A0B(rect, 0);
        AbstractC167027dH.A13(view, recyclerView, c3f5);
        super.getItemOffsets(rect, view, recyclerView, c3f5);
        int A02 = RecyclerView.A02(view);
        if (i2 != 0) {
            if (A02 != -1) {
                view.setVisibility(0);
                C2UU c2uu = recyclerView.A0A;
                if (c2uu != null) {
                    int itemCount = c2uu.getItemCount();
                    try {
                        float f = this.A00;
                        Context context = (Context) this.A02;
                        int A0B = (Resources.getSystem().getDisplayMetrics().widthPixels - AbstractC166987dD.A0B(f, context.getResources().getDimension(R.dimen.media_thumbnail_preview_item_height))) / 2;
                        int A022 = (int) AbstractC43594JPz.A02(context);
                        if (A02 == 0) {
                            rect.left = A0B;
                            return;
                        }
                        rect.left = A022;
                        if (A02 == itemCount - 1) {
                            rect.right = A0B;
                            return;
                        }
                        return;
                    } catch (Resources.NotFoundException e) {
                        e = e;
                        c18950wb = C18950wb.A01;
                        i = 817897926;
                        str = "boost_media_picker_sub_tab_fragment";
                        AbstractC167007dF.A15(c18950wb.AEp(str, i), str, AbstractC166997dE.A0y("attaching the new instance to thumbnail recycler view caused an exception: ", e), e);
                        return;
                    }
                }
                throw AbstractC166997dE.A0g();
            }
        } else if (A02 != -1) {
            int i3 = 0;
            view.setVisibility(0);
            C2UU c2uu2 = recyclerView.A0A;
            if (c2uu2 != null) {
                i3 = c2uu2.getItemCount();
            }
            try {
                Context context2 = (Context) this.A02;
                int A023 = AbstractC31171DnF.A02(context2.getResources(), R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                int A0B2 = AbstractC166987dD.A0B(this.A00, context2.getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_width));
                int i4 = Resources.getSystem().getDisplayMetrics().widthPixels;
                int i5 = ((i4 - (A0B2 * 2)) - A023) / 2;
                if (i4 > 0) {
                    if (A02 == 0) {
                        rect.left = i5;
                        return;
                    }
                    rect.left = A023;
                    if (A02 == i3 - 1) {
                        rect.right = i5;
                        return;
                    }
                    return;
                }
                return;
            } catch (Resources.NotFoundException e2) {
                e = e2;
                c18950wb = C18950wb.A01;
                i = 817897926;
                str = "boost_media_picker_ab_test_sub_tab_fragment";
                AbstractC167007dF.A15(c18950wb.AEp(str, i), str, AbstractC166997dE.A0y("attaching the new instance to thumbnail recycler view caused an exception: ", e), e);
                return;
            }
        }
        view.setVisibility(4);
    }
}
