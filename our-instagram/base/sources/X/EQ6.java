package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EQ6 extends C2US {
    public C34624FNh A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;
    public final C32455ERh A04;
    public final C41951wl A05;
    public final C41891wf A06;
    public final C31545DtV A07;
    public final ERQ A08;
    public final Integer A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final boolean A0G;
    public final ERN A0H;
    public final C152996uT A0I;
    public final C168737g7 A0J;

    public static final boolean A00(EQ6 eq6, DirectShareTarget directShareTarget) {
        List list = eq6.A0B;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((E6V) it.next()).A07, directShareTarget)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A01(List list) {
        List list2 = this.A0B;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
            boolean z = this.A01;
            Integer num = this.A09;
            E6V e6v = new E6V(directShareTarget, num, 0, true, z, false, false);
            list2.add(e6v);
            if (num == C05F.A01) {
                this.A0D.add(e6v);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQ6(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37165GZc interfaceC37165GZc, GYQ gyq, Integer num, List list) {
        super(false);
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A02 = context;
        this.A03 = userSession;
        this.A0A = list;
        this.A09 = num;
        C152996uT c152996uT = new C152996uT(context);
        this.A0I = c152996uT;
        this.A0B = AbstractC166987dD.A1E();
        this.A0C = AbstractC166987dD.A1E();
        this.A0D = AbstractC166987dD.A1E();
        C32455ERh c32455ERh = new C32455ERh(context, interfaceC11380iw, userSession, interfaceC37165GZc);
        this.A04 = c32455ERh;
        ERN ern = new ERN(context, gyq);
        this.A0H = ern;
        C168737g7 c168737g7 = new C168737g7(context);
        this.A0J = c168737g7;
        C31545DtV c31545DtV = new C31545DtV(context);
        this.A07 = c31545DtV;
        ERQ erq = new ERQ(context, C36739GHi.A00);
        this.A08 = erq;
        this.A0F = C1XM.A00(GTX.A00);
        this.A0E = C1XM.A00(new MHS(this, 32));
        this.A0G = AbstractC31174DnI.A1V(userSession);
        this.A05 = C41951wl.A00(userSession);
        C41891wf A01 = C41891wf.A01(userSession);
        C14360o3.A07(A01);
        this.A06 = A01;
        this.A01 = A1V;
        init(c32455ERh, ern, c168737g7, c31545DtV, erq, c152996uT);
    }
}
