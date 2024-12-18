package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.AyQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24804AyQ implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ C9SV A02;

    public RunnableC24804AyQ(View view, TextView textView, C9SV c9sv) {
        this.A01 = textView;
        this.A00 = view;
        this.A02 = c9sv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.A01;
        float x = textView.getX() + (textView.getWidth() / 2);
        View view = this.A00;
        float A07 = x / AbstractC166987dD.A07(view);
        float y = (textView.getY() + (textView.getHeight() / 2)) / AbstractC166987dD.A08(view);
        float A08 = AbstractC166987dD.A08(textView);
        C9SV c9sv = this.A02;
        Context context = c9sv.A02;
        float dimension = (A08 + (context.getResources().getDimension(R.dimen.account_discovery_bottom_gap) * 2.0f)) / AbstractC166987dD.A08(view);
        float A072 = AbstractC166987dD.A07(textView) / AbstractC166987dD.A07(view);
        float A082 = AbstractC166987dD.A08(textView) / AbstractC166987dD.A08(view);
        String A0E = AbstractC13950nL.A0E(-1);
        AbstractC13950nL.A0E(AbstractC167007dF.A09(context, R.attr.igds_color_controls));
        c9sv.A06.A02 = new URK(AbstractC166997dE.A0a(), Float.valueOf(dimension), Float.valueOf(A07), Float.valueOf(y), Float.valueOf(A082), Float.valueOf(A072), Float.valueOf(0.0f), A0E, null);
    }
}
