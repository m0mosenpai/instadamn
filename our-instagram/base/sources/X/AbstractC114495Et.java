package X;

import android.R;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.5Et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC114495Et extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "IgThemedFragment";

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        int A02 = C0f9.A02(1672790109);
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(AbstractC53242c7.A0F(window.getContext(), R.attr.colorBackground)));
        }
        C0f9.A09(1850724313, A02);
    }
}
