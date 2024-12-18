package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.Kaf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46081Kaf extends AbstractC77473dX {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C46081Kaf(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        String str;
        if (this.A00 != 0) {
            C14360o3.A0B(user, 0);
            C3OO c3oo = (C3OO) this.A01;
            C44569Jnu c44569Jnu = (C44569Jnu) this.A02;
            FollowStatus A00 = ViewOnAttachStateChangeListenerC110564yT.A00(c44569Jnu.A03, user);
            int bindingAdapterPosition = c3oo.getBindingAdapterPosition();
            if (A00 != FollowStatus.A05 && A00 != FollowStatus.A07) {
                str = "unfollow";
            } else {
                str = "follow";
            }
            c44569Jnu.A00(bindingAdapterPosition, str);
            return;
        }
        AbstractC167017dG.A1N(user, followStatus);
        C44570Jnv c44570Jnv = (C44570Jnv) this.A02;
        InterfaceC63682up interfaceC63682up = c44570Jnv.A03;
        C47K c47k = c44570Jnv.A01;
        int i = c47k.A01;
        C47O c47o = (C47O) this.A01;
        int A01 = c47k.A01(c47o);
        C47K c47k2 = c44570Jnv.A01;
        interfaceC63682up.Dqr(c47o, c47k2.A0C, "profile", c47k2.getId(), c47k2.A0I, i, A01);
        interfaceC63682up.Cly(c44570Jnv.A01);
    }
}
