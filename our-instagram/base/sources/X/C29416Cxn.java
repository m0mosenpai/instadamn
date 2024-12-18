package X;

import android.app.Activity;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.Cxn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29416Cxn implements InterfaceC71987XDy {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C25814BbV A01;
    public final /* synthetic */ C166947d8 A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ InterfaceC60442pS A04;
    public final /* synthetic */ C189478aR A05;
    public final /* synthetic */ WEz A06;

    public C29416Cxn(Activity activity, C25814BbV c25814BbV, C166947d8 c166947d8, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C189478aR c189478aR, WEz wEz) {
        this.A02 = c166947d8;
        this.A03 = userSession;
        this.A00 = activity;
        this.A04 = interfaceC60442pS;
        this.A05 = c189478aR;
        this.A01 = c25814BbV;
        this.A06 = wEz;
    }

    @Override // X.InterfaceC71987XDy
    public final void Czj() {
        C166947d8 c166947d8 = this.A02;
        String str = c166947d8.A05;
        User user = c166947d8.A00;
        if (user.B7L() == FollowStatus.A08) {
            AbstractC129875tr.A00(this.A03).A0G(user, false);
        }
        Activity activity = this.A00;
        UserSession userSession = this.A03;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C189478aR c189478aR = this.A05;
        JSONObject jSONObject = c166947d8.A09;
        C14360o3.A0B(jSONObject, 0);
        FYZ.A01(activity, interfaceC60442pS, userSession, c189478aR, user, null, str, jSONObject);
    }

    @Override // X.InterfaceC71987XDy
    public final void Dfg() {
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        c006802i.markerPoint(309476254, "report_comment_click");
        WEz.A00(this.A05, this.A06);
    }

    @Override // X.InterfaceC71987XDy
    public final void Dgv() {
        C25814BbV c25814BbV = this.A01;
        C166947d8 c166947d8 = this.A02;
        User user = c166947d8.A00;
        String str = c166947d8.A05;
        String str2 = c166947d8.A07;
        AbstractC167017dG.A1N(user, str);
        c25814BbV.A0B.A00(new C50371MLy(c25814BbV, user, str, str2, 20));
        AbstractC34045F0y.A00(this.A00, c25814BbV, this.A03, this.A04, user, c166947d8.A04, str, str2, c166947d8.A09);
    }

    @Override // X.InterfaceC71987XDy
    public final void Dwj() {
        C25814BbV c25814BbV = this.A01;
        C166947d8 c166947d8 = this.A02;
        String str = c166947d8.A05;
        String str2 = c166947d8.A07;
        User user = c166947d8.A00;
        AbstractC167017dG.A1O(str, user);
        c25814BbV.A0B.A00(new C50371MLy(c25814BbV, user, str, str2, 21));
        C166217bp c166217bp = c25814BbV.A0H;
        if (c166217bp != null) {
            c166217bp.A01(user);
        }
        MediaCommentListRepository mediaCommentListRepository = c25814BbV.A0A;
        C30185DRq A02 = C30185DRq.A02(c25814BbV, 20);
        J7Q j7q = new J7Q(c25814BbV, 18);
        AbstractC166987dD.A1Z(new JZ1(A02, j7q, mediaCommentListRepository, str, str2, null, 0), ((C4A7) mediaCommentListRepository).A01);
    }
}
