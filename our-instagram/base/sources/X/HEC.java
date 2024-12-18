package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HEC extends C7E1 {
    public Reel A00;
    public C41181vS A01;
    public final List A02;
    public final C65662y2 A03;
    public final C41951wl A04;
    public final C41891wf A05;
    public final C66266U6k A06;
    public final InterfaceC62602sz A07;
    public final C65842yM A08;
    public final boolean A09;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.2y2, java.lang.Object] */
    public HEC(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC71989XEc interfaceC71989XEc, InterfaceC62602sz interfaceC62602sz) {
        C66266U6k c66266U6k = new C66266U6k(context, interfaceC11380iw, userSession, interfaceC71989XEc);
        this.A06 = c66266U6k;
        C65842yM c65842yM = new C65842yM(context);
        this.A08 = c65842yM;
        ?? obj = new Object();
        this.A03 = obj;
        this.A07 = interfaceC62602sz;
        this.A02 = AbstractC166987dD.A1E();
        this.A09 = AbstractC31174DnI.A1V(userSession);
        this.A04 = C41951wl.A00(userSession);
        C41891wf A01 = C41891wf.A01(userSession);
        C14360o3.A07(A01);
        this.A05 = A01;
        AbstractC37304Gc5.A1N(this, c66266U6k, c65842yM, obj, AbstractC167017dG.A05(context));
    }

    public static final void A00(HEC hec) {
        hec.A06();
        InterfaceC65642y0 interfaceC65642y0 = hec.A03;
        hec.A08(interfaceC65642y0, null);
        Iterator it = hec.A02.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                C38824H7s c38824H7s = (C38824H7s) it.next();
                User user = c38824H7s.A00;
                Reel reel = hec.A00;
                C41181vS c41181vS = hec.A01;
                if (hec.A09) {
                    C41891wf c41891wf = hec.A05;
                    C41951wl c41951wl = hec.A04;
                    if (user != null) {
                        if (c41891wf.A0C(c41951wl, user)) {
                            C38266GsB c38266GsB = new C38266GsB(reel, c41181vS, user, z);
                            c38266GsB.A05 = c38824H7s.A02;
                            hec.A08(hec.A06, c38266GsB);
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                z = false;
                C38266GsB c38266GsB2 = new C38266GsB(reel, c41181vS, user, z);
                c38266GsB2.A05 = c38824H7s.A02;
                hec.A08(hec.A06, c38266GsB2);
            } else {
                InterfaceC62602sz interfaceC62602sz = hec.A07;
                if (interfaceC62602sz != null && interfaceC62602sz.CLJ()) {
                    hec.A08(hec.A08, interfaceC62602sz);
                }
                hec.A08(interfaceC65642y0, null);
                hec.A07();
                return;
            }
        }
    }
}
