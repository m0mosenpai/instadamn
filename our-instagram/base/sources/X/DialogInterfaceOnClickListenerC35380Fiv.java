package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Fiv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35380Fiv implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ ENA A04;
    public final /* synthetic */ C7MJ A05;
    public final /* synthetic */ E70 A06;
    public final /* synthetic */ C32107E9f A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public DialogInterfaceOnClickListenerC35380Fiv(Context context, UserSession userSession, ENA ena, C7MJ c7mj, E70 e70, C32107E9f c32107E9f, String str, String str2, int i, int i2) {
        this.A03 = userSession;
        this.A00 = i;
        this.A01 = i2;
        this.A08 = str;
        this.A09 = str2;
        this.A05 = c7mj;
        this.A06 = e70;
        this.A07 = c32107E9f;
        this.A02 = context;
        this.A04 = ena;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A03;
        int i2 = this.A00;
        AbstractC35213Fg6.A03(userSession, this.A08, this.A09, i2, this.A01);
        C7MJ c7mj = this.A05;
        E70 e70 = this.A06;
        InterfaceC83733oI interfaceC83733oI = e70.A0L;
        User user = this.A07.A00;
        List A1J = AbstractC166987dD.A1J(MessagingUser.A00(user));
        String A02 = C7KH.A02(this.A02, userSession, e70, false);
        String username = user.getUsername();
        ImageUrl Bhu = user.Bhu();
        C14360o3.A0B(interfaceC83733oI, 0);
        C7TQ A00 = C7MJ.A00(c7mj, interfaceC83733oI);
        FRH frh = new FRH(Bhu, c7mj, interfaceC83733oI, A02, username, i2);
        GKK.A00(A00.AGX(interfaceC83733oI, A1J).A0G(), c7mj.A01, frh, 10);
    }
}
