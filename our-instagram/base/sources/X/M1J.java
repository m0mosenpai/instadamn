package X;

import android.content.res.Resources;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class M1J implements Runnable {
    public final /* synthetic */ TextView A00;

    public M1J(TextView textView) {
        this.A00 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.A00;
        Resources resources = textView.getResources();
        C13680mu.A05(textView, textView.getMaxLines(), resources.getDimensionPixelSize(R.dimen.afi_margin_top), AbstractC166997dE.A0A(resources));
    }
}
