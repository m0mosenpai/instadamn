package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.CrV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29042CrV implements C2YT {
    public final UserSession A00;
    public final User A01;
    public final String A02;

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        View A0Q = AbstractC25228BEl.A0Q(c2yr, C26644Bpf.A09);
        Object tag = A0Q.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.adapter.row.coalesced.followchaining.SuggestedEntityUserCardComponent.Holder");
        C27928CSn c27928CSn = (C27928CSn) tag;
        User user = this.A01;
        AbstractC27669CIo.A00(c27928CSn, user, this.A02);
        c27928CSn.A05.A0J.A07(this.A00, user);
        AbstractC25231BEo.A0z(A0Q, j);
        return AbstractC25232BEp.A19(C2Z3.A00(c2yr.BoZ(), AbstractC77623dm.A0D(c2yr, R.dimen.birthday_selfie_preview_margin_top)), Math.max(C78613fT.A02(j), A0Q.getMeasuredHeight()));
    }

    public C29042CrV(UserSession userSession, User user, String str) {
        AbstractC167017dG.A1P(userSession, user);
        this.A00 = userSession;
        this.A01 = user;
        this.A02 = str;
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
