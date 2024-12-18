package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GAo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36564GAo implements GY1 {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C36564GAo(UserSession userSession, boolean z, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = userSession;
            this.A02 = z;
        } else {
            this.A02 = z;
            this.A01 = userSession;
        }
    }

    @Override // X.GY1
    public final void CIz(FragmentActivity fragmentActivity) {
        if (this.A00 != 0) {
            C14360o3.A0B(fragmentActivity, 0);
            C1V3 A00 = C3BH.A00();
            UserSession userSession = (UserSession) this.A01;
            A00.A04(fragmentActivity, userSession, new GB8(fragmentActivity, userSession, this.A02), EnumC33445EqI.A04, false, false);
            return;
        }
        C14360o3.A0B(fragmentActivity, 0);
        boolean z = this.A02;
        UserSession userSession2 = (UserSession) this.A01;
        C19270xB c19270xB = AbstractC34919Fa5.A00;
        if (z) {
            AbstractC31525Dt9.A07(fragmentActivity, null, c19270xB, userSession2, AbstractC31171DnF.A01(), true, false, false, true);
        } else {
            AbstractC31525Dt9.A04(fragmentActivity, null, c19270xB, userSession2);
        }
    }
}
