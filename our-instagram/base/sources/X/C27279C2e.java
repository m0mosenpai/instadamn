package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.C2e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27279C2e extends AnonymousClass522 {
    public final /* synthetic */ C72q A00;
    public final /* synthetic */ User A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27279C2e(C72q c72q, User user, int i) {
        super(Integer.valueOf(i));
        this.A00 = c72q;
        this.A01 = user;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        GBV A02;
        C72q c72q = this.A00;
        if (c72q != null && (A02 = c72q.A02()) != null) {
            User user = this.A01;
            UserSession userSession = A02.A02;
            AnonymousClass730 anonymousClass730 = new AnonymousClass730(userSession);
            UserDetailFragment userDetailFragment = A02.A04;
            if (userDetailFragment.getContext() != null) {
                String CAl = user.A03.CAl();
                if (CAl != null) {
                    String id = user.getId();
                    Rie rie = Rie.PROFILE;
                    anonymousClass730.A00(rie, id, CAl, null, true);
                    AbstractC76693cH.A01(userDetailFragment.requireContext(), rie, userSession, user.getId(), CAl);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }
}
