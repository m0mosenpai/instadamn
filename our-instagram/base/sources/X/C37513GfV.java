package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GfV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37513GfV implements JH6 {
    public final C25671My A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C689038b A03;
    public final C38i A04;

    public C37513GfV(Fragment fragment, C25671My c25671My, UserSession userSession, C689038b c689038b, C38i c38i) {
        AbstractC25233BEq.A0x(3, c25671My, c38i, c689038b);
        this.A02 = userSession;
        this.A01 = fragment;
        this.A00 = c25671My;
        this.A04 = c38i;
        this.A03 = c689038b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JH6
    public final void DbW(C81373k7 c81373k7, C38321qM c38321qM, C75113Zb c75113Zb) {
        String str;
        JLT BZV = c38321qM.A0C.BZV();
        if (BZV != null) {
            C38i.A00(this.A04, c38321qM, AbstractC111324zv.A00(2050));
            int ordinal = BZV.Atr().ordinal();
            if (ordinal != 2) {
                if (ordinal != 1) {
                    if (ordinal == 3) {
                        IQ7.A01(this.A01, c38321qM);
                        return;
                    }
                    return;
                }
                C35157Fez c35157Fez = C35157Fez.A00;
                Fragment fragment = this.A01;
                FragmentActivity requireActivity = fragment.requireActivity();
                UserSession userSession = this.A02;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) fragment;
                String str2 = userSession.userId;
                User A2E = c38321qM.A2E(userSession);
                if (A2E != null) {
                    str = A2E.getId();
                } else {
                    str = "";
                }
                c35157Fez.A01(requireActivity, interfaceC11380iw, userSession, AbstractC111324zv.A00(102), str2, str, null, "book_now_cta_media_post");
                return;
            }
            IQ7.A00(this.A01, this.A02, c38321qM, new DGY(this, 44));
            this.A00.A05(new C42240InQ(true));
        }
    }

    @Override // X.JH6
    public final void DbX(View view, C38321qM c38321qM) {
        C689038b c689038b = this.A03;
        C57112jm c57112jm = c689038b.A00;
        C59072n8 A00 = C59062n7.A00(c38321qM, 0, AnonymousClass001.A0R("media_cta_component_", c38321qM.getId()));
        A00.A00(c689038b.A01);
        AbstractC25227BEk.A10(view, A00, c57112jm);
    }
}
