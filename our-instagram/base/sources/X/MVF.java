package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class MVF extends AbstractC37623GhI {
    public InterfaceC56392iX A00;
    public final FragmentActivity A01;

    public MVF(FragmentActivity fragmentActivity) {
        C14360o3.A0B(fragmentActivity, 1);
        this.A01 = fragmentActivity;
    }

    public final void A0B(View view, String str, int i) {
        C14360o3.A0B(view, 0);
        AbstractC166987dD.A1Z(new C57152PYg(this, view, str, null, i, 2), C07Y.A00(this.A01));
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        this.A00 = AbstractC56372iV.A01(AbstractC166997dE.A0S(view, R.id.emoji_reaction_animation_stub), false, false);
    }
}
