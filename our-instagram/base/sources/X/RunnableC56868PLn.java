package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.creation.base.ui.filterview.FilterViewContainer;

/* renamed from: X.PLn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56868PLn implements Runnable {
    public final /* synthetic */ MXA A00;

    public RunnableC56868PLn(MXA mxa) {
        this.A00 = mxa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView;
        MXA mxa = this.A00;
        View findViewById = mxa.A02.findViewById(R.id.creation_image_container);
        if ((findViewById instanceof FilterViewContainer) && (imageView = ((FilterViewContainer) findViewById).A01) != null) {
            imageView.setVisibility(4);
        }
        mxa.A05.A08(C05F.A00);
        MX1.A01(mxa.A03).A0B(true, null);
    }
}
