package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.common.session.UserSession;

/* renamed from: X.GDe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36632GDe implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0f = C31720DwP.__redex_internal_original_name;
        A0y.A00().A02(this.A00.requireActivity(), AbstractC33775Ew1.A00(UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A04, userSession, "ig_edit_profile", true, true, true));
    }

    public C36632GDe(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
