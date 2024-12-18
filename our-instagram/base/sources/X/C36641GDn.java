package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.GDn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36641GDn implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C140966Yy A0P = AbstractC31173DnH.A0P(this.A00.requireActivity(), this.A01);
        FT2.A01();
        AbstractC31175DnJ.A0t(AbstractC166987dD.A0b(), new C32301EKo(), A0P);
    }

    public C36641GDn(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
