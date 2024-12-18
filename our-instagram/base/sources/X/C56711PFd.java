package X;

import android.widget.ListView;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.PFd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56711PFd implements InterfaceC169457hL, InterfaceC37294Gbv, InterfaceC169477hN {
    public final int A00;
    public final Object A01;

    public C56711PFd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        String str3;
        C51642MrZ c51642MrZ;
        switch (this.A00) {
            case 0:
                String A0j = AbstractC167017dG.A0j();
                N5Z n5z = (N5Z) this.A01;
                return AbstractC55617On2.A00(n5z.A02, n5z.A0B, n5z.A0F, str, A0j, n5z.A00);
            case 1:
                C14360o3.A0B(str, 0);
                AbstractC52114N4m abstractC52114N4m = ((C54701OEd) this.A01).A00.A00;
                if (abstractC52114N4m instanceof N8H) {
                    str3 = "branded_content_request_brand_approval_page";
                } else if (abstractC52114N4m instanceof N8I) {
                    str3 = "branded_content_approved_business_partners";
                } else {
                    str3 = "branded_content_add_partner_page";
                }
                boolean equals = str3.equals("branded_content_approved_business_partners");
                UserSession A0r = AbstractC166987dD.A0r(abstractC52114N4m.A09);
                if (equals) {
                    c51642MrZ = new C51642MrZ(str, str3, null, null, null, null, 50, false, true, false);
                } else {
                    c51642MrZ = new C51642MrZ(str, str3, null, null, null, null, 50, true, false, false);
                }
                return AbstractC55112ObW.A03(A0r, c51642MrZ);
            case 2:
                PIC pic = (PIC) this.A01;
                C25621Ms c25621Ms = new C25621Ms(pic.A05);
                c25621Ms.A06();
                c25621Ms.A0B(pic.A00());
                c25621Ms.A0H("query", str);
                c25621Ms.A0H("max_id", pic.A02);
                c25621Ms.A0S(HBD.class, ISZ.class);
                pic.A02(c25621Ms);
                return c25621Ms.A0N();
            default:
                C14360o3.A0B(str, 0);
                C52174N7f c52174N7f = (C52174N7f) this.A01;
                return AbstractC55112ObW.A03(c52174N7f.getSession(), new C51642MrZ(str, "user_tagging_page", null, null, c52174N7f.A08, c52174N7f.A09, 50, false, false, false));
        }
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ boolean Cdt() {
        return false;
    }

    @Override // X.InterfaceC169457hL
    public final void Dfo(String str) {
        if (1 - this.A00 == 0) {
            C14360o3.A0B(str, 0);
        }
    }

    @Override // X.InterfaceC169457hL
    public final void Dft(AbstractC115105If abstractC115105If, String str) {
        switch (this.A00) {
            case 0:
                N5Z n5z = (N5Z) this.A01;
                if (!str.equalsIgnoreCase(n5z.A0M)) {
                    return;
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                List list = n5z.A0e.BjP(str).A06;
                if (list != null && !list.isEmpty()) {
                    A1E.addAll(list);
                    N5Z.A0B(n5z, A1E, true);
                    return;
                }
                C52201N8q c52201N8q = n5z.A0E;
                c52201N8q.A03.clear();
                c52201N8q.A04.clear();
                c52201N8q.A01(AbstractC166987dD.A1E());
                c52201N8q.A02(true);
                return;
            case 1:
                C14360o3.A0B(str, 0);
                C54701OEd c54701OEd = (C54701OEd) this.A01;
                c54701OEd.A03.add(str);
                AbstractC52114N4m abstractC52114N4m = c54701OEd.A01.A00;
                abstractC52114N4m.A06().A00 = 0;
                abstractC52114N4m.A06().A01();
                return;
            case 2:
                PIC pic = (PIC) this.A01;
                if (!pic.A01.equals(str)) {
                    return;
                }
                pic.A00 = C05F.A01;
                pic.A06.DG9(str, abstractC115105If.A01(), pic.A03);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC169457hL
    public final void Dg3(String str) {
        switch (this.A00) {
            case 0:
                ActionButton actionButton = ((N5Z) this.A01).A0A;
                if (actionButton == null) {
                    return;
                }
                actionButton.setDisplayedChild(0);
                return;
            case 1:
            case 2:
            default:
                return;
            case 3:
                C52174N7f c52174N7f = (C52174N7f) this.A01;
                c52174N7f.A0C = true;
                OL1 ol1 = c52174N7f.A06;
                if (ol1 == null) {
                    AbstractC31171DnF.A0t();
                    throw C00O.createAndThrow();
                }
                ol1.A00();
                return;
        }
    }

    @Override // X.InterfaceC169457hL
    public final void DgJ(String str) {
        switch (this.A00) {
            case 0:
                ActionButton actionButton = ((N5Z) this.A01).A0A;
                if (actionButton != null) {
                    actionButton.setDisplayedChild(1);
                    return;
                }
                return;
            case 1:
                C14360o3.A0B(str, 0);
                return;
            case 2:
                PIC pic = (PIC) this.A01;
                if (pic.A01.equals(str)) {
                    pic.A00 = C05F.A00;
                    return;
                }
                return;
            default:
                C52174N7f c52174N7f = (C52174N7f) this.A01;
                OL1 ol1 = c52174N7f.A06;
                if (ol1 == null) {
                    AbstractC31171DnF.A0t();
                    throw C00O.createAndThrow();
                }
                ol1.A01(AbstractC25227BEk.A0v(c52174N7f, 2131965660), c52174N7f.A00, true);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC169457hL
    public final /* bridge */ /* synthetic */ void DgS(InterfaceC40821up interfaceC40821up, String str) {
        String str2;
        switch (this.A00) {
            case 0:
                C73450YDt c73450YDt = (C73450YDt) interfaceC40821up;
                N5Z n5z = (N5Z) this.A01;
                if (str.equalsIgnoreCase(n5z.A0M)) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    List list = n5z.A0e.BjP(str).A06;
                    if (list != null) {
                        A1E.addAll(list);
                    }
                    A1E.addAll(c73450YDt.getItems());
                    n5z.A0D.A01(str, c73450YDt.Bk6(), A1E);
                    N5Z.A0B(n5z, A1E, true);
                    return;
                }
                return;
            case 1:
                AbstractC167017dG.A1N(str, interfaceC40821up);
                C54701OEd c54701OEd = (C54701OEd) this.A01;
                c54701OEd.A03.remove(str);
                AbstractC52114N4m abstractC52114N4m = c54701OEd.A01.A00;
                IgdsInlineSearchBox igdsInlineSearchBox = abstractC52114N4m.A02;
                if (igdsInlineSearchBox != null) {
                    if (C14360o3.A0K(igdsInlineSearchBox.getSearchString(), str)) {
                        abstractC52114N4m.A07().A04();
                        abstractC52114N4m.A06().A00 = 0;
                        abstractC52114N4m.A06().A01();
                        return;
                    }
                    return;
                }
                str2 = "inlineSearchBox";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 2:
                HBD hbd = (HBD) interfaceC40821up;
                PIC pic = (PIC) this.A01;
                if (pic.A01.equals(str)) {
                    pic.A00 = C05F.A0C;
                    pic.A04 = hbd.CLI();
                    pic.A02 = hbd.A01.A01;
                    pic.A06.DqP(hbd, str, pic.A03);
                    return;
                }
                return;
            default:
                C52174N7f c52174N7f = (C52174N7f) this.A01;
                OL1 ol1 = c52174N7f.A06;
                if (ol1 == null) {
                    str2 = "adapter";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                ((C65960TxC) ol1.A02.getValue()).A04();
                ((C52198N8n) ol1.A05.getValue()).A00();
                ListView listView = c52174N7f.A02;
                if (listView != null) {
                    listView.setSelection(0);
                    return;
                }
                return;
        }
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C1ON AN6(UQE uqe, String str) {
        return A2K.A00(uqe, this, str);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfn(UQE uqe) {
        C9QE.A02(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfq(UQE uqe, AbstractC115105If abstractC115105If) {
        C9QE.A01(uqe, abstractC115105If, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dg0(UQE uqe) {
        C9QE.A03(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgG(UQE uqe) {
        C9QE.A04(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgO(UQE uqe, InterfaceC40821up interfaceC40821up) {
        C9QE.A00(uqe, interfaceC40821up, this);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ void DpU(boolean z) {
    }
}
