package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.wearable.mediastream.layouts.StatusIndicator;

/* loaded from: classes9.dex */
public final class PLG implements Runnable {
    public final /* synthetic */ StatusIndicator A00;

    public PLG(StatusIndicator statusIndicator) {
        this.A00 = statusIndicator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect A0U = AbstractC166987dD.A0U();
        StatusIndicator statusIndicator = this.A00;
        TextView textView = statusIndicator.A0M;
        textView.getHitRect(A0U);
        Resources resources = statusIndicator.A0H.getResources();
        A0U.inset(-resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), -resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap));
        statusIndicator.A05.setTouchDelegate(new TouchDelegate(A0U, textView));
    }
}
