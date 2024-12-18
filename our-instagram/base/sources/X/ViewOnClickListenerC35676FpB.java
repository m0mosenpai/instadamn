package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.user.model.User;

/* renamed from: X.FpB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35676FpB implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public ViewOnClickListenerC35676FpB(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC58311Pt3 interfaceC58311Pt3, C5HW c5hw, User user, int i, int i2) {
        this.A00 = i2;
        this.A02 = interfaceC58311Pt3;
        this.A03 = c5hw;
        if (1 - i2 != 0) {
            this.A01 = i;
            this.A04 = userSession;
            this.A05 = user;
        } else {
            this.A04 = user;
            this.A01 = i;
            this.A05 = userSession;
        }
        this.A06 = interfaceC11380iw;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-2036197886);
                C23031Ai c23031Ai = (C23031Ai) this.A04;
                int i2 = this.A01 + 1;
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(c23031Ai);
                A0w.E7D(AbstractC43591JPw.A00(1449), i2);
                A0w.apply();
                JR2.A0C((RectF) this.A02, (InterfaceC50477MQf) this.A05, (JR2) this.A06, (C2EC) this.A03);
                i = -1211132632;
                C0f9.A0C(i, A05);
                return;
            case 1:
                InterfaceC58311Pt3 interfaceC58311Pt3 = (InterfaceC58311Pt3) this.A02;
                C5HW c5hw = (C5HW) this.A03;
                User user = (User) this.A04;
                int i3 = this.A01;
                UserSession userSession = (UserSession) this.A05;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A06;
                interfaceC58311Pt3.A7A(null, c5hw, user, i3);
                BIM.A00(interfaceC11380iw, userSession, user.getId(), i3);
                return;
            case 2:
                InterfaceC58311Pt3 interfaceC58311Pt32 = (InterfaceC58311Pt3) this.A02;
                C5HW c5hw2 = (C5HW) this.A03;
                int i4 = this.A01;
                UserSession userSession2 = (UserSession) this.A04;
                User user2 = (User) this.A05;
                InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) this.A06;
                interfaceC58311Pt32.D9j(null, c5hw2, i4, false);
                BIM.A01(interfaceC11380iw2, userSession2, user2.getId(), i4);
                return;
            case 3:
                A05 = C0f9.A05(-383157897);
                Context context = (Context) this.A03;
                C14360o3.A0A(context);
                AbstractC33285Eng.A00(context, (UserSession) this.A06, (FBUserTag) this.A05, (InterfaceC37183GZu) this.A04, (Integer) this.A02);
                i = 1135969907;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(1982979937);
                Context context2 = (Context) this.A03;
                C14360o3.A0A(context2);
                AbstractC33285Eng.A00(context2, (UserSession) this.A06, (FBUserTag) this.A05, (InterfaceC37183GZu) this.A04, (Integer) this.A02);
                i = 602975204;
                C0f9.A0C(i, A05);
                return;
        }
    }

    public ViewOnClickListenerC35676FpB(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i2;
        this.A03 = obj;
        this.A05 = obj3;
        this.A01 = i;
        this.A04 = obj4;
        this.A02 = obj5;
        this.A06 = obj2;
    }
}
