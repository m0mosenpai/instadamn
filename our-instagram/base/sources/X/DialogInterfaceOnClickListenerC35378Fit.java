package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Fit, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35378Fit implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;

    public DialogInterfaceOnClickListenerC35378Fit(Context context, UserSession userSession, ENA ena, C7MJ c7mj, E70 e70, C32107E9f c32107E9f, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A07 = userSession;
        this.A01 = i;
        this.A08 = str;
        this.A09 = str2;
        this.A03 = c7mj;
        this.A06 = e70;
        this.A05 = c32107E9f;
        this.A02 = context;
        this.A04 = ena;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        FRH frh;
        C41761wQ c41761wQ;
        C42221xC A0G;
        int i2;
        int i3 = this.A00;
        UserSession userSession = (UserSession) this.A07;
        int i4 = this.A01;
        String str = this.A08;
        String str2 = this.A09;
        if (i3 != 0) {
            AbstractC35213Fg6.A03(userSession, str, str2, 3, i4);
            C7MJ c7mj = (C7MJ) this.A03;
            E70 e70 = (E70) this.A06;
            InterfaceC83733oI interfaceC83733oI = e70.A0L;
            User user = ((C32107E9f) this.A05).A00;
            List A1J = AbstractC166987dD.A1J(MessagingUser.A00(user));
            String A02 = C7KH.A02((Context) this.A02, userSession, e70, false);
            String username = user.getUsername();
            ImageUrl Bhu = user.Bhu();
            C14360o3.A0B(interfaceC83733oI, 0);
            C7TQ A00 = C7MJ.A00(c7mj, interfaceC83733oI);
            frh = new FRH(Bhu, c7mj, interfaceC83733oI, A02, username, 3);
            c41761wQ = c7mj.A01;
            A0G = A00.EFn(interfaceC83733oI, A1J).A0G();
            i2 = 15;
        } else {
            AbstractC35213Fg6.A03(userSession, str, str2, 2, i4);
            C7MJ c7mj2 = (C7MJ) this.A03;
            E70 e702 = (E70) this.A06;
            InterfaceC83733oI interfaceC83733oI2 = e702.A0L;
            User user2 = ((C32107E9f) this.A05).A00;
            List A1J2 = AbstractC166987dD.A1J(MessagingUser.A00(user2));
            String A022 = C7KH.A02((Context) this.A02, userSession, e702, false);
            String username2 = user2.getUsername();
            ImageUrl Bhu2 = user2.Bhu();
            C14360o3.A0B(interfaceC83733oI2, 0);
            C7TQ A002 = C7MJ.A00(c7mj2, interfaceC83733oI2);
            frh = new FRH(Bhu2, c7mj2, interfaceC83733oI2, A022, username2, 2);
            c41761wQ = c7mj2.A01;
            A0G = A002.EF9(interfaceC83733oI2, A1J2).A0G();
            i2 = 13;
        }
        GKK.A00(A0G, c41761wQ, frh, i2);
    }
}
