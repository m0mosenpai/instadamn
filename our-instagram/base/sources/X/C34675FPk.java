package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.FPk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34675FPk {
    public AbstractC10360h2 A00;
    public final FragmentActivity A01;
    public final UserSession A02;

    public C34675FPk(UserSession userSession, FragmentActivity fragmentActivity) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = fragmentActivity;
    }

    public final void A00(Fragment fragment, FR9 fr9, String str, String str2) {
        String str3;
        Bundle A08 = AbstractC31176DnK.A08(str);
        if (fr9 != null && (str3 = fr9.A01) != null) {
            A08.putString("DirectEditIceBreakerFragment.icebreaker_id", str3);
        }
        if (str2 != null && str2.length() != 0) {
            A08.putString("DirectEditIceBreakerFragment.prefill_answer", str2);
        }
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A01;
        String A00 = AbstractC111324zv.A00(2253);
        if (fragment != null) {
            AbstractC31171DnF.A0L(fragmentActivity, A08, userSession, ModalActivity.class, A00).A0D(fragment, 17465);
        } else {
            AbstractC25228BEl.A1G(fragmentActivity, A08, userSession, ModalActivity.class, A00);
        }
    }
}
