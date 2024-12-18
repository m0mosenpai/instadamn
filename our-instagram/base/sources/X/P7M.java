package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.archive.fragment.ArchiveHomeFragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P7M implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        AbstractC31171DnF.A1S(A00, EnumC53271Nh9.A07.A01, A00.A87, C23031Ai.A8c, 211);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("is_in_archive_home", true);
        C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity, userSession);
        A0r.A0B(A0b, new ArchiveHomeFragment());
        A0r.A04();
    }

    public P7M(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
