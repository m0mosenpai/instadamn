package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gfa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37518Gfa implements BC7 {
    public final UserSession A00;
    public final Fragment A01;

    @Override // X.BC7
    public final void DWk(C38321qM c38321qM, C75113Zb c75113Zb) {
        Context context = this.A01.getContext();
        if (context != null) {
            EgZ.A04.A02(context, this.A00, new C42740Iva(1, context, this, c38321qM), true, false);
        }
    }

    public C37518Gfa(Fragment fragment, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = fragment;
    }
}
