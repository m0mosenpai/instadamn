package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class EQK extends C2US implements InterfaceC65242xM, InterfaceC161877Mx {
    public final C31568Dtu A00;
    public final ArrayList A01;
    public final HashSet A02;
    public final Activity A03;
    public final Context A04;
    public final FNJ A05;
    public final C65662y2 A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;
    public final ESF A09;
    public final C31369DqY A0A;
    public final ESG A0B;
    public final C34609FMs A0C;
    public final C34531FJr A0D;
    public final C168737g7 A0E;
    public final ESA A0F;
    public final FNE A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.FJr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.2y2, java.lang.Object, X.2y0] */
    public EQK(Activity activity, Context context, FNJ fnj, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C34609FMs c34609FMs, C38O c38o, InterfaceC37216GaR interfaceC37216GaR, EVJ evj, C38M c38m, FNE fne) {
        super(false);
        C14360o3.A0B(userSession, 1);
        this.A08 = userSession;
        this.A04 = context;
        this.A03 = activity;
        this.A07 = interfaceC11380iw;
        this.A0C = c34609FMs;
        this.A0G = fne;
        this.A05 = fnj;
        this.A01 = AbstractC166987dD.A1E();
        this.A02 = AbstractC166987dD.A1H();
        ESA esa = new ESA(activity, context, fnj, interfaceC11380iw, userSession, evj, "unknown");
        this.A0F = esa;
        this.A0D = new Object();
        C168737g7 c168737g7 = new C168737g7(context);
        this.A0E = c168737g7;
        C31369DqY c31369DqY = new C31369DqY(context, interfaceC11380iw, userSession, c38o, interfaceC37216GaR, false, true, false);
        this.A0A = c31369DqY;
        ESG esg = new ESG(context, interfaceC11380iw, userSession, c34609FMs, interfaceC37216GaR, C18U.A06(C06090Tz.A05, userSession, 36328611506110132L));
        this.A0B = esg;
        C31568Dtu c31568Dtu = new C31568Dtu(context, c38m);
        this.A00 = c31568Dtu;
        ?? obj = new Object();
        this.A06 = obj;
        ESF esf = new ESF(activity, context, fnj, userSession);
        this.A09 = esf;
        init(esa, c168737g7, c31369DqY, esg, c31568Dtu, obj, esf);
        c31568Dtu.A00 = fne;
        obj.A03 = AbstractC167017dG.A0E(context);
    }

    @Override // X.InterfaceC161877Mx
    public final boolean AJn(String str) {
        C14360o3.A0B(str, 0);
        return this.A02.contains(str);
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0171, code lost:
    
        if (r11.A01 == false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EQK.A00():void");
    }

    public final void A01(C47P c47p) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            FPs fPs = (FPs) it.next();
            ArrayList A00 = fPs.A00();
            ArrayList A002 = fPs.A00();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it2 = A002.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                C47O A003 = ((C47L) next).A00();
                if (A003 != null) {
                    if (A003.equals(c47p)) {
                        A1E.add(next);
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            A00.removeAll(A1E);
        }
        A00();
    }

    @Override // X.InterfaceC161877Mx
    public final void FAg() {
        A00();
    }
}
