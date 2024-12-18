package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes8.dex */
public final class L3F {
    public TextView A00;
    public TextView A01;
    public RecyclerView A02;
    public IgdsBanner A03;
    public SpinnerImageView A04;

    public L3F(Context context, C66392zG c66392zG, IgLinearLayout igLinearLayout, int i, boolean z) {
        RecyclerView recyclerView;
        boolean A1V = AbstractC167007dF.A1V(igLinearLayout);
        View inflate = View.inflate(context, R.layout.sticker_suggestion_hscroll_section, null);
        if (z) {
            igLinearLayout.addView(inflate, igLinearLayout.getChildCount() - (A1V ? 1 : 0));
        } else {
            igLinearLayout.addView(inflate);
        }
        AbstractC167007dF.A0N(inflate, R.id.suggestions_section_header).setText(i);
        this.A03 = (IgdsBanner) inflate.requireViewById(R.id.show_avatar_suggestions_banner);
        this.A01 = AbstractC166997dE.A0T(inflate, R.id.see_all_title);
        this.A04 = (SpinnerImageView) inflate.requireViewById(R.id.sticker_suggestion_row_loading_spinner);
        this.A00 = AbstractC166997dE.A0T(inflate, R.id.sticker_suggestions_no_results_text_view);
        C66362zD A00 = c66392zG.A00();
        RecyclerView A0G = AbstractC31172DnG.A0G(inflate, R.id.suggestions_hscroll_recyclerview);
        this.A02 = A0G;
        if (A0G != null) {
            A0G.setAdapter(A00);
        }
        RecyclerView recyclerView2 = this.A02;
        if (recyclerView2 != null) {
            AbstractC31174DnI.A17(context, recyclerView2, false);
        }
        RecyclerView recyclerView3 = this.A02;
        if (recyclerView3 != null) {
            recyclerView3.setNestedScrollingEnabled(false);
        }
        Resources resources = context.getResources();
        if (resources != null && (recyclerView = this.A02) != null && recyclerView.A12.size() == 0) {
            int A08 = AbstractC166997dE.A08(resources);
            RecyclerView recyclerView4 = this.A02;
            if (recyclerView4 != null) {
                AbstractC37304Gc5.A0z(recyclerView4, A08 * 2, A08);
            }
        }
    }
}
