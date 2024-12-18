package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* renamed from: X.ENe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32357ENe extends C53Z {
    public static final String __redex_internal_original_name = "IgFxFragment";
    public Window A00;
    public C57012jc A01;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-417293314);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.bloks_fragment);
        C0f9.A09(624427050, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = AbstractC31177DnL.A0V(view, R.id.error_view_stub);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.A00 = activity.getWindow();
        }
        AbstractC34209F7h.A00().A00(getContext(), this.A00, false, false);
    }
}
