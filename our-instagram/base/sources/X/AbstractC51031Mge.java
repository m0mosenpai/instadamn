package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.Mge, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51031Mge extends AbstractC52922bZ {
    public String A00 = "0";
    public boolean A01;
    public boolean A02;
    public final C2GT A03;
    public final C2GT A04;
    public final C2GT A05;
    public final C2GT A06;
    public final C2GT A07;
    public final C2GT A08;
    public final C2GT A09;
    public final InterfaceC24731Iq A0A;
    public final InterfaceC19390xP A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C05A A0F;
    public final C05A A0G;
    public final C05A A0H;
    public final C05A A0I;

    public final String A01() {
        if (this instanceof NP1) {
            return ((NP1) this).A05;
        }
        if (this instanceof NP0) {
            C51633MrQ c51633MrQ = (C51633MrQ) this.A0G.getValue();
            if (c51633MrQ != null) {
                return c51633MrQ.A06;
            }
            return null;
        }
        return ((C52604NOz) this).A04;
    }

    public final void A02() {
        String str;
        String str2;
        if (this instanceof NP1) {
            NP1 np1 = (NP1) this;
            boolean z = np1.A06;
            P4X p4x = np1.A02;
            Long l = np1.A03;
            String str3 = np1.A04;
            if (z) {
                p4x.A09(l, str3, false);
                return;
            } else {
                p4x.A08(l, str3, false);
                return;
            }
        }
        if (this instanceof NP0) {
            return;
        }
        C52604NOz c52604NOz = (C52604NOz) this;
        boolean z2 = c52604NOz.A05;
        P4U p4u = c52604NOz.A01;
        Long l2 = c52604NOz.A03;
        if (z2) {
            str = "lead_gen_review_form";
            str2 = "review_lead_gen_form_tos_query";
        } else {
            str = "lead_gen_preview_form";
            str2 = "preview_lead_gen_form_tos_query";
        }
        AbstractC43592JPx.A1Q(p4u, l2, str, str2, RealtimeConstants.SEND_FAIL);
    }

    public final boolean A03() {
        if ((this instanceof NP0) && !A05() && MSX.A1X(this.A0C.getValue())) {
            return true;
        }
        return false;
    }

    public final boolean A04() {
        if (this instanceof NP1) {
            return ((NP1) this).A07;
        }
        if (this instanceof NP0) {
            return false;
        }
        return true;
    }

    public final boolean A05() {
        if (this instanceof NP0) {
            return AbstractC50523MSb.A1Z(((NP0) this).A01, "args_is_sub_page");
        }
        return false;
    }

    public AbstractC51031Mge() {
        C24721Ip A0q = MSX.A0q();
        this.A0A = A0q;
        this.A0B = AbstractC07080Za.A03(A0q);
        C16930sl c16930sl = C16930sl.A00;
        C008002u A00 = C10E.A00(c16930sl);
        this.A0C = A00;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A03 = AbstractC58232lf.A00(anonymousClass191, A00);
        C008002u A002 = C10E.A00(c16930sl);
        this.A0D = A002;
        this.A04 = AbstractC58232lf.A00(anonymousClass191, A002);
        C008002u A003 = C10E.A00(null);
        this.A0G = A003;
        this.A07 = AbstractC58232lf.A00(anonymousClass191, A003);
        C008002u A004 = C10E.A00(null);
        this.A0E = A004;
        this.A05 = AbstractC58232lf.A00(anonymousClass191, A004);
        Boolean A0a = AbstractC166997dE.A0a();
        C008002u A1H = AbstractC25225BEi.A1H(A0a);
        this.A0H = A1H;
        this.A08 = AbstractC58232lf.A00(anonymousClass191, A1H);
        C008002u A005 = C10E.A00(null);
        this.A0I = A005;
        this.A09 = AbstractC58232lf.A00(anonymousClass191, A005);
        C008002u A1H2 = AbstractC25225BEi.A1H(A0a);
        this.A0F = A1H2;
        this.A06 = AbstractC58232lf.A00(anonymousClass191, A1H2);
    }

    public static boolean A00(N6B n6b) {
        return n6b.A04().A05();
    }
}
