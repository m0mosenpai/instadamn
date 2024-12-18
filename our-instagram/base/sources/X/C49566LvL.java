package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.LvL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49566LvL implements MPC {
    public final /* synthetic */ C146036i0 A00;

    public C49566LvL(C146036i0 c146036i0) {
        this.A00 = c146036i0;
    }

    @Override // X.MPC
    public final void Dau() {
        C146036i0 c146036i0 = this.A00;
        UserSession userSession = c146036i0.A09;
        FragmentActivity fragmentActivity = c146036i0.A07;
        String A00 = AbstractC111324zv.A00(220);
        JZ8 jz8 = AbstractC47193KtS.A01;
        C14360o3.A0B(userSession, 0);
        jz8.A05(fragmentActivity, userSession, "ig_stories_consumption", A00);
    }
}
