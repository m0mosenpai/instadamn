package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HEE extends C7E1 {
    public Reel A00;
    public C41181vS A01;
    public String A02;
    public final List A03;
    public final C65662y2 A04;
    public final C41951wl A05;
    public final C41891wf A06;
    public final C66266U6k A07;
    public final InterfaceC62602sz A08;
    public final C65842yM A09;
    public final boolean A0A;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.2y2, java.lang.Object] */
    public HEE(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC71989XEc interfaceC71989XEc, InterfaceC62602sz interfaceC62602sz) {
        C66266U6k c66266U6k = new C66266U6k(context, interfaceC11380iw, userSession, interfaceC71989XEc);
        this.A07 = c66266U6k;
        C65842yM c65842yM = new C65842yM(context);
        this.A09 = c65842yM;
        ?? obj = new Object();
        this.A04 = obj;
        this.A08 = interfaceC62602sz;
        this.A03 = AbstractC166987dD.A1E();
        this.A0A = AbstractC31174DnI.A1V(userSession);
        this.A05 = C41951wl.A00(userSession);
        C41891wf A01 = C41891wf.A01(userSession);
        C14360o3.A07(A01);
        this.A06 = A01;
        AbstractC37304Gc5.A1N(this, c66266U6k, c65842yM, obj, AbstractC167017dG.A05(context));
    }

    public static final void A00(HEE hee) {
        hee.A06();
        InterfaceC65642y0 interfaceC65642y0 = hee.A04;
        hee.A08(interfaceC65642y0, null);
        Iterator it = hee.A03.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                InterfaceC43561JLv interfaceC43561JLv = (InterfaceC43561JLv) it.next();
                User CDj = interfaceC43561JLv.CDj();
                if (CDj != null) {
                    Reel reel = hee.A00;
                    C41181vS c41181vS = hee.A01;
                    if (c41181vS != null) {
                        if (!hee.A0A || !hee.A06.A0C(hee.A05, CDj)) {
                            z = false;
                        }
                        C38266GsB c38266GsB = new C38266GsB(reel, c41181vS, CDj, z);
                        c38266GsB.A08 = hee.A02;
                        if (interfaceC43561JLv.Ac5() != null) {
                            C41181vS c41181vS2 = hee.A01;
                            C14360o3.A0A(c41181vS2);
                            Wm1 A01 = AbstractC97594Zu.A01(c41181vS2);
                            if (A01 != null) {
                                List list = A01.A02.A0C;
                                if (list != null) {
                                    Integer Ac5 = interfaceC43561JLv.Ac5();
                                    C14360o3.A0A(Ac5);
                                    Object obj = list.get(Ac5.intValue());
                                    C14360o3.A0A(obj);
                                    InterfaceC43540JLa interfaceC43540JLa = (InterfaceC43540JLa) obj;
                                    C14360o3.A0B(interfaceC43540JLa, 0);
                                    String text = interfaceC43540JLa.getText();
                                    if (text == null || text.length() > 1000) {
                                        text = "";
                                    }
                                    c38266GsB.A07 = text;
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                        hee.A08(hee.A07, c38266GsB);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                InterfaceC62602sz interfaceC62602sz = hee.A08;
                if (interfaceC62602sz != null && interfaceC62602sz.CLJ()) {
                    hee.A08(hee.A09, interfaceC62602sz);
                }
                hee.A08(interfaceC65642y0, null);
                hee.A07();
                return;
            }
        }
    }
}
