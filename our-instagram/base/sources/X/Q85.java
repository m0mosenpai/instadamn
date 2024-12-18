package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* loaded from: classes10.dex */
public final class Q85 extends Fragment implements InterfaceC65387TjK {
    public View A00;
    public TextView A01;
    public Context A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;

    @Override // X.InterfaceC65387TjK
    public final SOB C8u() {
        return new SOB(null, null, null, getString(2131962345), 0, 0, false, false, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        this.A01 = AbstractC166997dE.A0T(view, R.id.fbpay_qr_code_description);
        this.A05 = AbstractC166997dE.A0T(view, R.id.fbpay_qr_code_share_button);
        this.A04 = AbstractC166997dE.A0T(view, R.id.fbpay_qr_code_link_text);
        this.A03 = AbstractC31173DnH.A0I(view, R.id.fbpay_qr_code_image);
        this.A00 = view.requireViewById(R.id.fbpay_progress_bar);
        TextView textView = this.A05;
        C14360o3.A0A(textView);
        ViewOnClickListenerC63508Sob.A01(textView, 14, this);
        C63307ShD.A00(this).A00(Q8M.class);
        C14360o3.A0A(null);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1212994852);
        C14360o3.A0B(layoutInflater, 0);
        FragmentActivity activity = getActivity();
        C2FP.A0E();
        C0K8.A0C("FBPayIgHubManager", AnonymousClass001.A0c("Unknown style: ", " is not supported!", 11));
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, R.style.Ig4aFbPay);
        this.A02 = contextThemeWrapper;
        View inflate = layoutInflater.cloneInContext(contextThemeWrapper).inflate(R.layout.fragment_p2p_qr_code, viewGroup, false);
        C0f9.A09(645534204, A02);
        return inflate;
    }
}
