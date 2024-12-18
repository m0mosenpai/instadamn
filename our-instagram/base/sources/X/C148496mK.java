package X;

import android.view.View;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.6mK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148496mK {
    public final View A00;
    public final GradientSpinner A01;

    public C148496mK(View view) {
        View requireViewById = view.requireViewById(R.id.loading_overlay);
        C14360o3.A07(requireViewById);
        this.A00 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.loading_overlay_spinner);
        C14360o3.A07(requireViewById2);
        this.A01 = (GradientSpinner) requireViewById2;
    }
}
