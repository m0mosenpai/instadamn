package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class IKL {
    public final Context A00;
    public final GradientDrawable A01;
    public final View A02;
    public final View A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;

    public IKL(View view) {
        this.A00 = view.getContext();
        View requireViewById = view.requireViewById(R.id.poll_v2_result_option_row_unfilled);
        this.A03 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.poll_v2_result_option_row_filled);
        this.A02 = requireViewById2;
        this.A05 = AbstractC166997dE.A0T(requireViewById, R.id.poll_v2_result_option_row_option_text);
        this.A04 = AbstractC166997dE.A0T(requireViewById2, R.id.poll_v2_result_option_row_option_text_filled);
        TextView A0T = AbstractC166997dE.A0T(requireViewById, R.id.poll_v2_result_option_row_vote_percentage);
        this.A07 = A0T;
        TextView A0T2 = AbstractC166997dE.A0T(requireViewById2, R.id.poll_v2_result_option_row_vote_percentage_filled);
        this.A06 = A0T2;
        Drawable background = requireViewById2.getBackground();
        background.getClass();
        this.A01 = (GradientDrawable) background.mutate();
        C6QV.A02(A0T);
        C6QV.A02(A0T2);
    }
}
