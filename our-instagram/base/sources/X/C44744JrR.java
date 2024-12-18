package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.JrR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44744JrR extends C3OO {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final ConstraintLayout A04;
    public final InterfaceC56392iX A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44744JrR(View view, boolean z) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A03 = AbstractC167007dF.A0N(view, R.id.prompts_title);
        this.A02 = AbstractC31176DnK.A0D(view, R.id.prompts_face_pile);
        this.A00 = AbstractC166997dE.A0S(view, R.id.prompts_divider);
        this.A05 = AbstractC56372iV.A01(view.requireViewById(R.id.prompts_featured_prompt_preview_image_stub), false, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.requireViewById(R.id.prompts_button_container);
        this.A04 = constraintLayout;
        if (z) {
            view.getLayoutParams().width = AbstractC25228BEl.A0M(this.itemView).getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
            AbstractC31172DnG.A1F(AbstractC25228BEl.A0M(this.itemView), view.getLayoutParams(), R.dimen.clips_grid_page_thumbnail_height_vertical);
            ((RoundedCornerConstraintLayout) view).setStrokeColor(0);
            AbstractC31172DnG.A1F(AbstractC25228BEl.A0M(this.itemView), constraintLayout.getLayoutParams(), R.dimen.album_preview_add_item_margin);
        }
    }
}
