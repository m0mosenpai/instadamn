package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class EHS extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "WellbeingInterstitialFragment";
    public UserSession A00;

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-525325696);
        super.onCreate(bundle);
        this.A00 = AbstractC31171DnF.A0G(requireArguments());
        C0f9.A09(-413703869, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String A0v;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String A0v2;
        int A02 = C0f9.A02(-755773842);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.wellbeing_interstitial_layout);
        int A01 = AbstractC31177DnL.A01(A0A, R.id.wellbeing_interstitial_image);
        TextView A0T = AbstractC166997dE.A0T(A0A, R.id.wellbeing_interstitial_title);
        boolean z = this instanceof C32899Edg;
        if (z) {
            A0v = getString(2131960776);
        } else {
            A0v = AbstractC25227BEk.A0v(this, 2131960331);
        }
        A0T.setText(A0v);
        TextView A0T2 = AbstractC166997dE.A0T(A0A, R.id.wellbeing_interstitial_sub_title);
        if (TextUtils.isEmpty(null)) {
            i = 8;
        } else {
            A0T2.setText((CharSequence) null);
            i = 0;
        }
        A0T2.setVisibility(i);
        TextView A0T3 = AbstractC166997dE.A0T(A0A, R.id.wellbeing_interstitial_note);
        if (TextUtils.isEmpty(null)) {
            i2 = 8;
        } else {
            A0T3.setText((CharSequence) null);
            i2 = 0;
        }
        A0T3.setVisibility(i2);
        RecyclerView A0G = AbstractC31172DnG.A0G(A0A, R.id.wellbeing_interstitial_list);
        ArrayList A1E = AbstractC166987dD.A1E();
        if (z) {
            A1E.add(new C34551FKl(R.drawable.instagram_arrow_ccw_pano_outline_24, 2131960784, 2131960783));
            A1E.add(new C34551FKl(R.drawable.instagram_lock_pano_outline_24, 2131960778, 2131960777));
            i3 = R.drawable.instagram_shield_pano_outline_24;
            i4 = 2131960782;
            i5 = 2131960781;
        } else {
            A1E.add(new C34551FKl(R.drawable.instagram_arrow_ccw_pano_outline_24, 2131960780, 2131960779));
            A1E.add(new C34551FKl(R.drawable.instagram_lock_pano_outline_24, 2131960778, 2131960332));
            i3 = R.drawable.instagram_shield_pano_outline_24;
            i4 = 2131960782;
            i5 = 2131960333;
        }
        A1E.add(new C34551FKl(i3, i4, i5));
        A0G.setAdapter(new C31866DzY(A1E));
        TextView A0T4 = AbstractC166997dE.A0T(A0A, R.id.wellbeing_interstitial_cta_btn);
        if (z) {
            A0v2 = getString(android.R.string.ok);
        } else {
            A0v2 = AbstractC25227BEk.A0v(this, android.R.string.ok);
        }
        A0T4.setText(A0v2);
        ViewOnClickListenerC35666Fp0.A00(A0T4, 58, this);
        AbstractC31172DnG.A1J(A0A, R.id.wellbeing_interstitial_close, A01);
        C0f9.A09(2018840384, A02);
        return A0A;
    }
}
