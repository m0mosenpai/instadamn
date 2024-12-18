package X;

import androidx.fragment.app.Fragment;
import com.instagram.user.model.User;

/* renamed from: X.Fts, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35934Fts implements InterfaceC145346gt {
    public final /* synthetic */ C86293t1 A00;

    public C35934Fts(C86293t1 c86293t1) {
        this.A00 = c86293t1;
    }

    @Override // X.InterfaceC145346gt
    public final void Cvg(User user) {
        C14360o3.A0B(user, 0);
        C86293t1 c86293t1 = this.A00;
        C684436h c684436h = c86293t1.A01;
        Fragment fragment = c86293t1.A00;
        c684436h.A03(c86293t1.A02, AbstractC31180DnO.A0K(fragment.requireActivity(), fragment), user, C05F.A00);
    }
}
