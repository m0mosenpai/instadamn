package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class C5E extends AbstractC25398BLp {
    public float A00;
    public float A01;
    public CSK A02;
    public final AbstractC70653Fc A03;
    public final C2XI A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final C28184CbX A07;

    public C5E(Context context, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C75113Zb c75113Zb, InterfaceC30855DhU interfaceC30855DhU) {
        super(context, c120985dq, c37644Ghd, null, interfaceC11380iw, userSession, c75113Zb, interfaceC30855DhU);
        this.A07 = new C28184CbX(c120985dq.A0F, userSession);
        UserSession userSession2 = this.A0H;
        C1DX A00 = C1DW.A00(userSession2);
        C38321qM c38321qM = this.A0D.A02;
        if (c38321qM != null) {
            String id = c38321qM.getId();
            if (A00.A02(id) == null) {
                A00.A03(c38321qM);
            } else {
                C38321qM A02 = A00.A02(id);
                if (A02 != null) {
                    c38321qM.A46(userSession2, A02, false);
                }
            }
        }
        ((AbstractC25398BLp) this).A00 = AbstractC13880nE.A01(context, AbstractC13880nE.A0A(context));
        this.A05 = AbstractC09440dt.A00(EnumC09460dv.A02, DH2.A01(interfaceC11380iw, c120985dq, userSession, 40));
        this.A06 = AbstractC09440dt.A01(DFH.A00);
        this.A04 = new C2XI(AbstractC166997dE.A0a());
        this.A03 = new C44286Jhc(this, 13);
    }

    public static final float A00(C5E c5e, float f) {
        float f2;
        float f3;
        UserSession userSession = c5e.A0H;
        C06090Tz A0U = AbstractC166997dE.A0U(userSession);
        double A00 = C18U.A00(A0U, userSession, 37166138719863206L);
        if (C18U.A00(A0U, userSession, 37166138719797669L) > 0.0d) {
            return ((AbstractC25398BLp) c5e).A00 - ((float) ((C18U.A00(A0U, userSession, 37166138719797669L) + (A00 * 2.0d)) + 12.0d));
        }
        if (C18U.A00(A0U, userSession, 37166138719732132L) <= 0.0d && C18U.A00(A0U, userSession, 37166138719928743L) <= 0.0d) {
            f2 = f - ((float) (12.0d + (A00 * 2.0d)));
            f3 = c5e.A0H();
        } else {
            f2 = f - ((float) ((A00 * 2.0d) + 12.0d));
            f3 = 2.0f;
        }
        return f2 / f3;
    }

    public final int A0H() {
        if (AbstractC28342CeU.A02(this.A0H) && AbstractC25231BEo.A0I(this.A0J) / 3 >= 2) {
            return 3;
        }
        return 2;
    }

    public List A0I() {
        int size;
        List list = this.A0J;
        if (list == null) {
            return C16930sl.A00;
        }
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(new C5A((C38321qM) it.next()));
        }
        ArrayList A0U = AbstractC001800i.A0U(A0q);
        UserSession userSession = this.A0H;
        if (!C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36321713788626639L)) {
            size = 4;
        } else {
            boolean A02 = AbstractC28342CeU.A02(userSession);
            size = A0U.size();
            if (A02) {
                size = (size / 3) * 3;
            }
        }
        return AbstractC001800i.A0d(A0U, size);
    }

    public final void A0J() {
        BYP byp;
        C2XI c2xi = this.A0B;
        Boolean A0b = AbstractC166997dE.A0b();
        c2xi.A00(A0b);
        this.A04.A00(A0b);
        CSK csk = this.A02;
        if (csk != null && (byp = csk.A01) != null) {
            byp.cancel();
            csk.A01 = null;
        }
        this.A02 = null;
    }
}
