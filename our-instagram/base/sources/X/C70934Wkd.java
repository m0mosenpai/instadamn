package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wkd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70934Wkd implements GZA {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C70934Wkd(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.GZA
    public final void onActionClicked() {
        C63397SjR A0y;
        String str;
        int i = this.A00;
        String str2 = this.A02;
        if (i != 0) {
            if (str2 != null) {
                C67892V0z c67892V0z = (C67892V0z) this.A01;
                C70399WUb c70399WUb = c67892V0z.A0B;
                if (c70399WUb != null) {
                    c70399WUb.A0G(VG4.A1Q, "audience_validation_learn_more");
                }
                FragmentActivity requireActivity = c67892V0z.requireActivity();
                UserSession userSession = c67892V0z.A0H;
                if (userSession == null) {
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                A0y = AbstractC25228BEl.A0y(requireActivity, userSession, C2Fb.A35, str2);
                str = "promote_review";
            } else {
                return;
            }
        } else if (str2 != null) {
            V11 v11 = (V11) this.A01;
            C70399WUb c70399WUb2 = v11.A03;
            if (c70399WUb2 != null) {
                c70399WUb2.A0G(VG4.A0B, "audience_validation_learn_more");
            }
            A0y = AbstractC25228BEl.A0y(v11.requireActivity(), (UserSession) v11.A0N.getValue(), C2Fb.A35, str2);
            str = "promote_audience";
        } else {
            return;
        }
        A0y.A0S = str;
        A0y.A0A();
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
        C70399WUb c70399WUb;
        VG4 vg4;
        if (this.A00 != 0) {
            c70399WUb = ((C67892V0z) this.A01).A0B;
            if (c70399WUb != null) {
                vg4 = VG4.A1Q;
            } else {
                return;
            }
        } else {
            c70399WUb = ((V11) this.A01).A03;
            if (c70399WUb == null) {
                return;
            } else {
                vg4 = VG4.A0B;
            }
        }
        c70399WUb.A0G(vg4, "audience_validation_banner_close");
    }
}
