package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Ih1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41863Ih1 implements View.OnClickListener {
    public final /* synthetic */ C114485Es A00;

    public ViewOnClickListenerC41863Ih1(C114485Es c114485Es) {
        this.A00 = c114485Es;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(955228115);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            activity.setResult(-1);
            activity.onBackPressed();
        }
        C0f9.A0C(139667068, A05);
    }
}
