package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EPo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32413EPo extends C7E1 implements InterfaceC161877Mx {
    public C47K A00;
    public ED9 A01;
    public final C31369DqY A02;
    public final C31335Dq0 A03;
    public final C34531FJr A04;
    public final C168737g7 A05;
    public final C31568Dtu A06;
    public final C31576Du4 A07;
    public final ESK A08;

    @Override // X.InterfaceC161877Mx
    public final boolean AJn(String str) {
        String str2;
        C47K c47k;
        User user;
        C14360o3.A0B(str, 0);
        ED9 ed9 = this.A01;
        if (ed9 != null && (user = ed9.A03) != null) {
            str2 = user.getId();
        } else {
            str2 = null;
        }
        if (!C14360o3.A0K(str2, str) && ((c47k = this.A00) == null || !c47k.A0A(str))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.FJr, java.lang.Object] */
    public C32413EPo(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38O c38o, InterfaceC37216GaR interfaceC37216GaR, ENQ enq, C38M c38m) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        ESK esk = new ESK(context, interfaceC11380iw, userSession, enq);
        this.A08 = esk;
        C31369DqY c31369DqY = new C31369DqY(context, interfaceC11380iw, userSession, c38o, interfaceC37216GaR, C18U.A06(C06090Tz.A05, userSession, 36316014367215480L), A1V, false);
        this.A02 = c31369DqY;
        this.A04 = new Object();
        C168737g7 c168737g7 = new C168737g7(context);
        this.A05 = c168737g7;
        C31335Dq0 A00 = C31335Dq0.A00(2131974883);
        A00.A02 = 0;
        A00.A0I = false;
        this.A03 = A00;
        C31568Dtu c31568Dtu = new C31568Dtu(context, c38m);
        this.A06 = c31568Dtu;
        this.A07 = new C31576Du4(C05F.A0C);
        A0B(esk, c31369DqY, c168737g7, c31568Dtu);
    }

    public static final void A00(C32413EPo c32413EPo) {
        List A03;
        c32413EPo.A06();
        ED9 ed9 = c32413EPo.A01;
        if (ed9 != null) {
            c32413EPo.A08(c32413EPo.A08, ed9);
        }
        C47K c47k = c32413EPo.A00;
        if (c47k != null) {
            if (!c47k.A07()) {
                A03 = c47k.A0M;
            } else {
                A03 = c47k.A03();
            }
            int i = 0;
            if (A03 != null && !A03.isEmpty()) {
                c32413EPo.A09(c32413EPo.A05, c32413EPo.A03, c32413EPo.A04);
                Iterator it = A03.iterator();
                while (it.hasNext()) {
                    c32413EPo.A09(c32413EPo.A02, it.next(), Integer.valueOf(i));
                    i++;
                }
                c32413EPo.A08(c32413EPo.A06, c32413EPo.A07);
            }
        }
        c32413EPo.A07();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        A00(this);
    }
}
