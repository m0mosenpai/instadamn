package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.emptystate.IgdsEmptyState;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.6uw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153276uw extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final IgdsEmptyState A02;
    public final SpinnerImageView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C153276uw(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.empty_state_view_loading_spinner);
        C14360o3.A07(requireViewById);
        this.A03 = (SpinnerImageView) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.empty_state_headline_component);
        C14360o3.A07(requireViewById2);
        this.A02 = (IgdsEmptyState) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.empty_state_view_privacy_link);
        C14360o3.A07(requireViewById3);
        this.A00 = (TextView) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.empty_state_under_button_text);
        C14360o3.A07(requireViewById4);
        this.A01 = (TextView) requireViewById4;
    }
}
