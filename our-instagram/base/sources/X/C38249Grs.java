package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.Grs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38249Grs extends AbstractC77473dX {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C47N A01;
    public final /* synthetic */ C38241Grk A02;
    public final /* synthetic */ String A03;

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        String str;
        AbstractC167007dF.A1K(user, followStatus);
        if (user.B7L() != FollowStatus.A05 && user.B7L() != FollowStatus.A07) {
            if (user.B7L() == FollowStatus.A06) {
                str = "destroy";
            } else {
                str = "";
            }
        } else {
            str = "create";
        }
        C63702ur c63702ur = C37549Gg5.A06;
        if (c63702ur != null) {
            C6PG A00 = C38238Grh.A00(this.A00, this.A01, user, (Integer) C37549Gg5.A0A.get(user.getId()), this.A03);
            A00.A0A = str;
            A00.A06 = AbstractC38851rI.A06(user.B7L());
            c63702ur.A08(new C6PH(A00));
        }
        AbstractC125325le A01 = AbstractC125325le.A01(this.A02.A00, 0);
        A01.A0G();
        AbstractC125325le A0E = A01.A0E(C55942hf.A03(0.5d, 0.5d));
        A0E.A0U(0.975f, 1.0f, -1.0f);
        A0E.A0V(0.975f, 1.0f, -1.0f);
        A0E.A0H();
    }

    public C38249Grs(InterfaceC11380iw interfaceC11380iw, C47N c47n, C38241Grk c38241Grk, String str) {
        this.A00 = interfaceC11380iw;
        this.A01 = c47n;
        this.A03 = str;
        this.A02 = c38241Grk;
    }
}
