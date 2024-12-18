package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.M5o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49999M5o implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C160587Hs A01;
    public final /* synthetic */ DirectThreadKey A02;

    public RunnableC49999M5o(Bitmap bitmap, C160587Hs c160587Hs, DirectThreadKey directThreadKey) {
        this.A01 = c160587Hs;
        this.A02 = directThreadKey;
        this.A00 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C160587Hs c160587Hs = this.A01;
        if (c160587Hs.A03(this.A02, c160587Hs.A0K) != null) {
            C160587Hs.A01(c160587Hs);
            IgImageView igImageView = c160587Hs.A02;
            if (igImageView != null) {
                igImageView.setImageBitmap(this.A00);
            }
            AbstractC167007dF.A0w(c160587Hs.A01);
            Activity activity = c160587Hs.A05;
            View findViewById = activity.findViewById(R.id.message_list_refresh_container);
            if (findViewById != null) {
                findViewById.animate().alpha(0.5f).start();
            }
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) activity.findViewById(R.id.thread_fragment_container);
            if (touchInterceptorFrameLayout != null) {
                touchInterceptorFrameLayout.COs(new ViewOnTouchListenerC48084LQj(c160587Hs, 17));
            }
        }
    }
}
