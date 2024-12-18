package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IxE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42838IxE implements JGR {
    public final /* synthetic */ HCE A00;

    public C42838IxE(HCE hce) {
        this.A00 = hce;
    }

    @Override // X.JGR
    public final void DVd() {
        C1XJ c1xj = C1XJ.A00;
        HCE hce = this.A00;
        FragmentActivity requireActivity = hce.requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(hce.A0G);
        String str = hce.A0D;
        if (str == null) {
            C14360o3.A0F("waterfallId");
            throw C00O.createAndThrow();
        }
        c1xj.A1D(requireActivity, A0r, str, EnumC33406Epd.A0A.toString(), null, null, false, false, false);
    }
}
