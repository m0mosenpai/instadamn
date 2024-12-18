package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.EnQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33269EnQ extends AbstractC77473dX {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC37215GaQ A01;

    public C33269EnQ(InterfaceC37215GaQ interfaceC37215GaQ, int i) {
        this.A01 = interfaceC37215GaQ;
        this.A00 = i;
    }

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        this.A01.D3t(user, this.A00);
    }
}
