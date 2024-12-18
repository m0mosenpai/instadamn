package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.Foh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35647Foh implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ ENA A04;
    public final /* synthetic */ C7MJ A05;
    public final /* synthetic */ E70 A06;
    public final /* synthetic */ C32107E9f A07;
    public final /* synthetic */ InterfaceC83733oI A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public ViewOnClickListenerC35647Foh(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ENA ena, C7MJ c7mj, E70 e70, C32107E9f c32107E9f, InterfaceC83733oI interfaceC83733oI, String str, String str2, int i) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A00 = i;
        this.A06 = e70;
        this.A0A = str;
        this.A05 = c7mj;
        this.A08 = interfaceC83733oI;
        this.A07 = c32107E9f;
        this.A09 = str2;
        this.A04 = ena;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FRH frh;
        C41761wQ c41761wQ;
        C42221xC A0G;
        int i;
        int A05 = C0f9.A05(-797160336);
        Context context = this.A01;
        AbstractC31171DnF.A1O(context);
        if (!C35244Fgd.A03((Activity) context, context, this.A02, this.A03, null, this.A00, false)) {
            E70 e70 = this.A06;
            boolean contains = e70.A0S.contains(this.A0A);
            C7MJ c7mj = this.A05;
            if (contains) {
                InterfaceC83733oI interfaceC83733oI = this.A08;
                User user = this.A07.A00;
                String str = this.A09;
                String username = user.getUsername();
                ImageUrl Bhu = user.Bhu();
                C14360o3.A0B(interfaceC83733oI, 0);
                C7TQ A00 = C7MJ.A00(c7mj, interfaceC83733oI);
                frh = new FRH(Bhu, c7mj, interfaceC83733oI, str, username, 5);
                c41761wQ = c7mj.A01;
                A0G = A00.AOp(interfaceC83733oI, user).A0G();
                i = 11;
            } else {
                InterfaceC83733oI interfaceC83733oI2 = this.A08;
                User user2 = this.A07.A00;
                String str2 = this.A09;
                String username2 = user2.getUsername();
                ImageUrl Bhu2 = user2.Bhu();
                C14360o3.A0B(interfaceC83733oI2, 0);
                C7TQ A002 = C7MJ.A00(c7mj, interfaceC83733oI2);
                frh = new FRH(Bhu2, c7mj, interfaceC83733oI2, str2, username2, 4);
                c41761wQ = c7mj.A01;
                A0G = A002.E6K(interfaceC83733oI2, user2).A0G();
                i = 12;
            }
            GKK.A00(A0G, c41761wQ, frh, i);
        }
        C0f9.A0C(2097042804, A05);
    }
}
