package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.L7h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47761L7h {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final Context A04;

    public final void A00(int i, int i2, int i3) {
        TextView textView = this.A03;
        Context context = this.A04;
        AbstractC166987dD.A1P(context, textView, i);
        AbstractC166987dD.A1P(context, this.A02, i2);
        this.A01.setImageResource(i3);
    }

    public C47761L7h(View view, Context context) {
        this.A00 = view;
        this.A04 = context;
        this.A01 = AbstractC31176DnK.A0D(view, R.id.icon);
        this.A03 = AbstractC31178DnM.A0C(view);
        this.A02 = AbstractC167007dF.A0N(view, R.id.content);
    }
}
