package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class IF6 {
    public final TextView A00;
    public final IF5 A01;

    public IF6(View view, C38930HCd c38930HCd) {
        Context context = view.getContext();
        this.A01 = new IF5(view);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.see_all);
        this.A00 = A0T;
        Drawable drawable = context.getDrawable(R.drawable.forward_arrow);
        drawable.mutate().setColorFilter(context.getColor(R.color.countdown_sticker_title_text_color), PorterDuff.Mode.SRC_IN);
        A0T.setCompoundDrawablePadding(AbstractC167017dG.A06(context));
        A0T.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        C3P9 A0s = AbstractC166987dD.A0s(A0T);
        A0s.A07 = true;
        A0s.A04 = new HJA(7, this, c38930HCd);
        A0s.A00();
    }
}
