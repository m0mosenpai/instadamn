package X;

import android.app.Application;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class Gt6 extends C193578hc {
    public boolean A00;
    public final ArrayList A01;
    public final C05A A02;
    public final UserSession A03;

    public final void A0E() {
        this.A00 = true;
        ArrayList arrayList = this.A01;
        Iterator A13 = AbstractC166997dE.A13(arrayList);
        while (A13.hasNext()) {
            C38514GwZ c38514GwZ = (C38514GwZ) AbstractC166997dE.A0l(A13);
            J23 j23 = c38514GwZ.A01;
            if (j23 != null) {
                j23.A00();
            }
            c38514GwZ.A01 = null;
            c38514GwZ.A02 = null;
            c38514GwZ.A00 = null;
        }
        arrayList.clear();
    }

    public final void A0F() {
        this.A00 = true;
        Iterator A13 = AbstractC166997dE.A13(this.A01);
        while (A13.hasNext()) {
            C38514GwZ c38514GwZ = (C38514GwZ) AbstractC166997dE.A0l(A13);
            J23 j23 = c38514GwZ.A01;
            if (j23 != null) {
                j23.A00();
            }
            c38514GwZ.A01 = null;
        }
    }

    public static void A00(C38514GwZ c38514GwZ) {
        if (c38514GwZ != null) {
            View view = c38514GwZ.A04;
            view.animate().alpha(0.0f).setDuration(200L).setListener(new C38291Gsa(view, 0));
        }
    }

    public static final void A01(Gt6 gt6) {
        J23 j23;
        if (!gt6.A00) {
            C38514GwZ c38514GwZ = (C38514GwZ) gt6.A02.getValue();
            if (c38514GwZ != null) {
                C38321qM c38321qM = c38514GwZ.A00;
                if (c38321qM != null) {
                    if (c38514GwZ.A01 == null) {
                        gt6.A0G(c38514GwZ);
                    }
                    ArrayList arrayList = gt6.A01;
                    ArrayList<J23> A0i = AbstractC167007dF.A0i(arrayList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        A0i.add(((C38514GwZ) it.next()).A01);
                    }
                    for (J23 j232 : A0i) {
                        if (j232 != null) {
                            j232.A01 = false;
                            ((C5TA) j232.A07.getValue()).A09("recycler view scroll");
                        }
                    }
                    if (c38321qM.getId() != null && (j23 = c38514GwZ.A01) != null) {
                        Integer num = j23.A00;
                        Integer num2 = C05F.A01;
                        if (num != num2) {
                            j23.A00 = num2;
                            C5TA c5ta = (C5TA) j23.A07.getValue();
                            String str = c38321qM.A0M;
                            C75363a3 CFR = c38321qM.CFR();
                            SimpleVideoLayout simpleVideoLayout = j23.A05;
                            C4S7 c4s7 = new C4S7(c38321qM, j23.A02);
                            c4s7.A00 = true;
                            c5ta.A08(simpleVideoLayout, CFR, c4s7, str, AbstractC111324zv.A00(188), 1.0f, -1, 0, true, false);
                            j23.A06.getValue();
                            if (c38321qM.getId() == null) {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                        j23.A01 = true;
                        return;
                    }
                    return;
                }
                return;
            }
            ArrayList arrayList2 = gt6.A01;
            ArrayList<J23> A0i2 = AbstractC167007dF.A0i(arrayList2);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                A0i2.add(((C38514GwZ) it2.next()).A01);
            }
            for (J23 j233 : A0i2) {
                if (j233 != null) {
                    j233.A01 = false;
                    ((C5TA) j233.A07.getValue()).A09("recycler view scroll");
                }
            }
        }
    }

    public final void A0H(C38514GwZ c38514GwZ) {
        C05A c05a = this.A02;
        C38514GwZ c38514GwZ2 = (C38514GwZ) c05a.getValue();
        if (c38514GwZ == null) {
            if (c05a.getValue() != null) {
                A00(c38514GwZ2);
                c05a.Egh(null);
                return;
            } else {
                A01(this);
                return;
            }
        }
        if (c38514GwZ.A00 == null || C14360o3.A0K(c38514GwZ2, c38514GwZ)) {
            return;
        }
        if (c38514GwZ.A01 == null) {
            A0G(c38514GwZ);
        }
        A00(c38514GwZ2);
        View view = c38514GwZ.A04;
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(200L).setListener(null);
        c05a.Egh(c38514GwZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gt6(Application application, UserSession userSession) {
        super(application);
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A03 = userSession;
        this.A02 = C10E.A00(null);
        this.A01 = AbstractC166987dD.A1E();
        this.A00 = A1V;
        AbstractC166987dD.A1Z(new PXT(this, null, 3), AbstractC141776au.A00(this));
    }

    public final void A0G(C38514GwZ c38514GwZ) {
        c38514GwZ.A01 = new J23(A0D(), this.A03, c38514GwZ.A0C, new C41001IDw(c38514GwZ), AbstractC31177DnL.A03(c38514GwZ.A02));
        this.A01.add(c38514GwZ);
    }
}
