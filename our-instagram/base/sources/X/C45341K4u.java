package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.K4u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45341K4u extends C668630d {
    public final View A00;
    public final boolean A01;
    public final /* synthetic */ C149216nV A02;

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A09.A00;
        View view = this.A00;
        view.setTranslationX(200.0f - (200.0f * f));
        view.setAlpha(f);
    }

    public C45341K4u(View view, C149216nV c149216nV, boolean z) {
        this.A02 = c149216nV;
        this.A00 = view;
        this.A01 = z;
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        View view = this.A00;
        view.setLayerType(2, null);
        view.setTranslationX(200.0f);
        view.setAlpha(0.0f);
        view.setVisibility(0);
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        this.A00.setLayerType(0, null);
        if (this.A01) {
            C149216nV c149216nV = this.A02;
            View view = c149216nV.A09;
            if (view != null) {
                View A0S = AbstractC166997dE.A0S(view, R.id.tap_to_dismiss);
                A0S.setAlpha(0.0f);
                A0S.setVisibility(0);
                A0S.animate().withLayer().setDuration(200L).alpha(1.0f).withEndAction(new M2O(c149216nV));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
