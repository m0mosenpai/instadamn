package X;

import android.content.Context;
import android.text.Spannable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes7.dex */
public final class IKB {
    public final Context A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final C6RB A05;
    public final ReelDashboardFragment A06;

    public IKB(View view, ReelDashboardFragment reelDashboardFragment) {
        Context context = view.getContext();
        this.A00 = context;
        this.A06 = reelDashboardFragment;
        this.A01 = view;
        this.A02 = AbstractC31173DnH.A0I(view, R.id.quiz_summary_answer_row_icon);
        this.A04 = AbstractC166997dE.A0T(view, R.id.quiz_summary_answer_row_answer_text);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.quiz_summary_answer_row_answer_count);
        this.A03 = A0T;
        AEZ.A01(A0T);
        Spannable spannable = C6RB.A0d;
        C6RB c6rb = new C6RB(context, AbstractC167017dG.A03(context));
        this.A05 = c6rb;
        c6rb.A0F(AbstractC31174DnI.A03(context));
        c6rb.A0A(context.getResources().getDimensionPixelSize(R.dimen.bio_product_sticker_subtitle_size));
        AEZ.A00(context, c6rb);
    }
}
