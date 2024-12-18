package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.GDt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36647GDt implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        if (AbstractC167007dF.A1W(C37001nx.A02)) {
            C140966Yy A0r = AbstractC25225BEi.A0r(this.A00.requireActivity(), this.A01);
            AbstractC35067Fce.A01();
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putBoolean(AbstractC111324zv.A00(84), false);
            AbstractC31175DnJ.A0t(A0b, new EK6(), A0r);
        }
    }

    public C36647GDt(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
