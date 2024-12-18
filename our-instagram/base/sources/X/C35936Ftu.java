package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* renamed from: X.Ftu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35936Ftu implements InterfaceC145346gt {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C75443aB A01;

    public C35936Ftu(FragmentActivity fragmentActivity, C75443aB c75443aB) {
        this.A01 = c75443aB;
        this.A00 = fragmentActivity;
    }

    @Override // X.InterfaceC145346gt
    public final void Cvg(User user) {
        C14360o3.A0B(user, 0);
        C75443aB c75443aB = this.A01;
        c75443aB.A02.A03(c75443aB.A04, AbstractC31180DnO.A0K(this.A00, c75443aB.A00), user, C05F.A00);
    }
}
