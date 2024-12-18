package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WXZ implements InterfaceC55932he {
    public final C55982hj A00;
    public final UserSession A01;
    public final View A02;

    public WXZ(View view, UserSession userSession) {
        AbstractC167007dF.A1D(userSession, 1, view);
        this.A01 = userSession;
        View A0S = AbstractC166997dE.A0S(view, R.id.privacy_message);
        this.A02 = A0S;
        A0S.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC66124U0h(this, 1));
        C55982hj A02 = C55952hg.A00().A02();
        A02.A06 = true;
        A02.A0A(this);
        this.A00 = A02;
        WNN.A00(view.requireViewById(R.id.privacy_message_dismiss_button), 62, this);
        A02.A08(AbstractC23021Ah.A00(userSession).A01.getBoolean("archive_map_privacy_banner_dismissed", false) ? 1.0f : 0.0f, true);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    public static final void A00(WXZ wxz) {
        float f = (float) wxz.A00.A09.A00;
        View view = wxz.A02;
        float f2 = 1.0f - 0.0f;
        float f3 = (-view.getHeight()) - 0.0f;
        float f4 = 0.0f;
        if (f2 != 0.0f) {
            f4 = (f - 0.0f) / f2;
        }
        view.setTranslationY((f4 * f3) + 0.0f);
        int i = 0;
        if (f == 1.0f) {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        A00(this);
    }
}
