package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G8F implements InterfaceC199918sv {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ InterfaceC16820sZ A04;

    public G8F(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = user;
        this.A04 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        Context context = this.A00;
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        User user = this.A03;
        InterfaceC16820sZ interfaceC16820sZ = this.A04;
        C28261Yl.A00.A00(context, null, userSession, user, new C36765GIo(interfaceC16820sZ, 6), interfaceC11380iw.getModuleName(), null, user.getUsername());
    }
}
