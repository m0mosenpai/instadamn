package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.google.common.collect.ImmutableMap;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes11.dex */
public final class U4U implements Runnable {
    public final /* synthetic */ C72743Nv A00;

    public U4U(C72743Nv c72743Nv) {
        this.A00 = c72743Nv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C72743Nv c72743Nv = this.A00;
        ImmutableMap immutableMap = C72743Nv.A0U;
        if (c72743Nv.mView != null && c72743Nv.getContext() != null) {
            View view = c72743Nv.A00;
            if (view == null || view.getParent() != null) {
                Integer num = c72743Nv.A09.A0N;
                if (num != null) {
                    View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(c72743Nv.getContext()), (ViewGroup) c72743Nv.mView, num.intValue());
                    c72743Nv.A00 = A0A;
                    ((ViewGroup) c72743Nv.mView).addView(A0A);
                    return;
                }
                SpinnerImageView spinnerImageView = new SpinnerImageView(c72743Nv.getContext());
                spinnerImageView.setImageResource(R.drawable.spinner_large);
                c72743Nv.A00 = spinnerImageView;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                ((ViewGroup) c72743Nv.mView).addView(c72743Nv.A00, layoutParams);
            }
        }
    }
}
