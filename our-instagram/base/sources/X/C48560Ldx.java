package X;

import android.content.Context;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.Ldx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48560Ldx implements InterfaceC13640mq {
    public boolean A00 = false;
    public final Context A01;
    public final UserSession A02;
    public final L1T A03;
    public final C47367KwI A04;
    public final C18A A05;
    public final InterfaceC08830cm A06;
    public final InterfaceC08830cm A07;
    public final InterfaceC08830cm A08;
    public final C47366KwH A09;

    @Override // X.InterfaceC13640mq
    public final void CzH() {
        this.A00 = true;
    }

    @Override // X.InterfaceC13640mq
    public final void DDa() {
        this.A00 = false;
        A01();
    }

    private InterfaceC66482zP A00(int i) {
        InterfaceC66482zP AWm;
        C7VC A0S = this.A09.A00.A0S(i);
        if (A0S instanceof C160787Im) {
            try {
                L1T l1t = this.A03;
                Context context = this.A01;
                UserSession userSession = this.A02;
                C18A c18a = this.A05;
                C7IM c7im = (C7IM) this.A07.get();
                AnonymousClass988 anonymousClass988 = (AnonymousClass988) this.A08.get();
                C160787Im c160787Im = (C160787Im) A0S;
                AbstractC25234BEr.A0j(2, c18a, c7im, anonymousClass988, c160787Im);
                InterfaceC162527Pp interfaceC162527Pp = (InterfaceC162527Pp) AbstractC166997dE.A0m((Map) l1t.A01.getValue(), c160787Im.getType());
                if (interfaceC162527Pp == null) {
                    interfaceC162527Pp = l1t.A00;
                }
                AWm = interfaceC162527Pp.AWm(context, userSession, anonymousClass988, c160787Im, c7im, c18a, l1t.A02);
            } catch (IllegalArgumentException e) {
                int type = A0S.getType();
                C0f5 AEp = C18950wb.A01.AEp(AnonymousClass001.A0O("IllegalArgumentException is thrown for viewType ", type), 20134884);
                AEp.ERI(e);
                AEp.ABU("view_type", type);
                AEp.report();
                throw e;
            }
        } else if (A0S instanceof InterfaceC66482zP) {
            AWm = (InterfaceC66482zP) A0S;
        } else if (A0S instanceof C43671JTf) {
            C47367KwI c47367KwI = this.A04;
            C43671JTf c43671JTf = (C43671JTf) A0S;
            C14360o3.A0B(c43671JTf, 0);
            AWm = new JUY(c47367KwI.A00.A00, c43671JTf.A01, c43671JTf.A00);
        } else {
            String name = A0S.getClass().getName();
            IllegalStateException A0V = AbstractC31175DnJ.A0V("Unsupported ThreadRowData: ", name);
            C0f5 AEp2 = C18950wb.A01.AEp(AnonymousClass001.A0R("Unsupported ThreadRowData: ", name), 20134884);
            AEp2.ERI(A0V);
            AEp2.ABU("view_type", A0S.getType());
            AEp2.report();
            throw A0V;
        }
        if (((C66362zD) this.A06.get()).A06 && AWm.getKey() == null) {
            C18950wb c18950wb = C18950wb.A01;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("setModel search find model with null key for model: ");
            A1C.append(AWm.getClass().getName());
            A1C.append(", with viewType ");
            A1C.append(A0S.getType());
            A1C.append(", with timestampMicro ");
            A1C.append(A0S.C8f());
            A1C.append(", at index ");
            A1C.append(i);
            AbstractC166987dD.A1T(c18950wb, A1C.toString(), 20134884);
        }
        return AWm;
    }

    @Override // X.InterfaceC13640mq
    public final void D2i(int i, int i2) {
        if (!this.A00) {
            if (i2 == 1) {
                ((C66362zD) this.A06.get()).A07(C66362zD.A0D, A00(i), i);
                return;
            }
            A01();
        }
    }

    @Override // X.InterfaceC13640mq
    public final void DMJ(int i, int i2) {
        if (!this.A00) {
            if (i2 == 1) {
                C66362zD c66362zD = (C66362zD) this.A06.get();
                InterfaceC66482zP A00 = A00(i);
                ArrayList A1F = AbstractC166987dD.A1F(c66362zD.A04.AuX());
                A1F.add(i, A00);
                c66362zD.A06(AbstractC43593JPy.A0L(A1F), C66362zD.A0D);
                return;
            }
            A01();
        }
    }

    @Override // X.InterfaceC13640mq
    public final void DTy(int i, int i2) {
        if (!this.A00) {
            C66362zD c66362zD = (C66362zD) this.A06.get();
            ArrayList A1F = AbstractC166987dD.A1F(c66362zD.A04.AuX());
            A1F.add(i2, A1F.remove(i));
            c66362zD.A06(AbstractC43593JPy.A0L(A1F), C66362zD.A0D);
        }
    }

    @Override // X.InterfaceC13640mq
    public final void DfC(int i, int i2) {
        if (!this.A00) {
            if (i2 == 1) {
                C66362zD c66362zD = (C66362zD) this.A06.get();
                ArrayList A1F = AbstractC166987dD.A1F(c66362zD.A04.AuX());
                A1F.remove(i);
                c66362zD.A06(AbstractC43593JPy.A0L(A1F), C66362zD.A0D);
                return;
            }
            A01();
        }
    }

    public C48560Ldx(Context context, UserSession userSession, C47366KwH c47366KwH, L1T l1t, C47367KwI c47367KwI, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3) {
        this.A02 = userSession;
        this.A01 = context;
        this.A06 = interfaceC08830cm;
        this.A07 = interfaceC08830cm2;
        this.A08 = interfaceC08830cm3;
        this.A05 = AnonymousClass189.A00(userSession);
        this.A03 = l1t;
        this.A04 = c47367KwI;
        this.A09 = c47366KwH;
    }

    public final void A01() {
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        C163547Tr c163547Tr = this.A09.A00;
        int i = c163547Tr.A0R().A01;
        for (int i2 = 0; i2 < i; i2++) {
            A0E.A00(A00(i2));
        }
        try {
            ((C66362zD) this.A06.get()).A05(A0E);
        } catch (C50099M9n e) {
            int type = ((C7VC) c163547Tr.A0R().A04(e.A00)).getType();
            C0f5 AEp = C18950wb.A01.AEp(AnonymousClass001.A07(type, "Seen duplicate model key for class ", e.A01, " with viewType "), 20134884);
            AEp.ERI(e);
            AEp.ABU("view_type", type);
            AEp.report();
        }
    }
}
