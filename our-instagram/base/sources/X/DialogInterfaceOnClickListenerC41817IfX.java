package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;

/* renamed from: X.IfX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41817IfX implements DialogInterface.OnClickListener {
    public final /* synthetic */ C19260xA A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C75113Zb A03;
    public final /* synthetic */ SearchContext A04;
    public final /* synthetic */ InterfaceC77483dY A05;
    public final /* synthetic */ ViewOnAttachStateChangeListenerC110564yT A06;
    public final /* synthetic */ User A07;
    public final /* synthetic */ C1M1 A08;
    public final /* synthetic */ Double A09;
    public final /* synthetic */ String A0A;

    public DialogInterfaceOnClickListenerC41817IfX(C19260xA c19260xA, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, SearchContext searchContext, InterfaceC77483dY interfaceC77483dY, ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT, User user, C1M1 c1m1, Double d, String str) {
        this.A07 = user;
        this.A01 = userSession;
        this.A06 = viewOnAttachStateChangeListenerC110564yT;
        this.A05 = interfaceC77483dY;
        this.A02 = c38321qM;
        this.A03 = c75113Zb;
        this.A00 = c19260xA;
        this.A08 = c1m1;
        this.A0A = str;
        this.A04 = searchContext;
        this.A09 = d;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        User user = this.A07;
        UserSession userSession = this.A01;
        IA6.A00(userSession, user, MSV.A00(602));
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = this.A06;
        InterfaceC77483dY interfaceC77483dY = this.A05;
        C38321qM c38321qM = this.A02;
        C75113Zb c75113Zb = this.A03;
        ViewOnAttachStateChangeListenerC110564yT.A02(this.A00, userSession, c38321qM, c75113Zb, this.A04, interfaceC77483dY, viewOnAttachStateChangeListenerC110564yT, user, this.A09, this.A0A);
    }
}
