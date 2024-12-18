package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.GDr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36645GDr implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C66277U6x A00 = C66277U6x.A00(AbstractC111324zv.A00(192));
        Fragment fragment = this.A00;
        FragmentActivity requireActivity = fragment.requireActivity();
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(this.A01);
        AbstractC31171DnF.A10(fragment.requireActivity(), A0C, 2131970064);
        A0C.A0i = true;
        A00.A04(requireActivity, A0C);
    }

    public C36645GDr(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
