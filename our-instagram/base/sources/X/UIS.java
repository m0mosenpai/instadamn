package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes11.dex */
public final class UIS extends C3OO {
    public final View A00;
    public final IgTextView A01;

    public UIS(View view) {
        super(view);
        this.A00 = view;
        View requireViewById = view.requireViewById(R.id.text_view);
        IgTextView igTextView = (IgTextView) requireViewById;
        AbstractC25227BEk.A11(igTextView);
        C14360o3.A07(requireViewById);
        this.A01 = igTextView;
    }
}
