package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;

/* renamed from: X.89N, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89N extends AbstractC52922bZ {
    public C221849qn A00;
    public C22947A9r A01;
    public Medium A02;
    public C38321qM A03;
    public boolean A04;
    public final UserSession A05;
    public final InterfaceC24731Iq A06;
    public final InterfaceC19390xP A07;
    public final C05A A08;

    public C89N(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        this.A08 = C10E.A00(null);
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A06 = c24721Ip;
        this.A07 = AbstractC07080Za.A03(c24721Ip);
    }

    public final void A03(C38321qM c38321qM) {
        A00();
        this.A04 = false;
        C141796aw A00 = AbstractC141776au.A00(this);
        AbstractC23641Du.A05(AnonymousClass191.A00, new C57156PZa(this, c38321qM, (InterfaceC23621Ds) null, 43), A00);
        this.A03 = c38321qM;
        this.A02 = null;
    }

    public final void A00() {
        C221849qn c221849qn = this.A00;
        if (c221849qn != null) {
            C5TA c5ta = c221849qn.A00;
            if (c5ta != null) {
                c5ta.A0A("auto");
            }
            c221849qn.A00 = null;
        }
        C22947A9r c22947A9r = this.A01;
        if (c22947A9r != null) {
            C55208OeM c55208OeM = c22947A9r.A00;
            if (c55208OeM != null) {
                c55208OeM.A07();
            }
            c22947A9r.A00 = null;
        }
        this.A00 = null;
        this.A01 = null;
        this.A08.Egh(null);
    }

    public final void A01() {
        C55208OeM c55208OeM;
        C5TA c5ta;
        C221849qn c221849qn = this.A00;
        if (c221849qn != null && (c5ta = c221849qn.A00) != null) {
            c5ta.A09("auto");
        }
        C22947A9r c22947A9r = this.A01;
        if (c22947A9r != null && (c55208OeM = c22947A9r.A00) != null) {
            c55208OeM.A05();
        }
        if (this.A04) {
            C22947A9r c22947A9r2 = this.A01;
            if (c22947A9r2 != null) {
                C55208OeM c55208OeM2 = c22947A9r2.A00;
                if (c55208OeM2 != null) {
                    c55208OeM2.A06();
                    return;
                }
                return;
            }
            Medium medium = this.A02;
            if (medium == null) {
                return;
            }
            A02(medium);
            return;
        }
        C221849qn c221849qn2 = this.A00;
        if (c221849qn2 != null) {
            C5TA c5ta2 = c221849qn2.A00;
            if (c5ta2 == null) {
                return;
            }
            c5ta2.A0B("auto", false);
            return;
        }
        C38321qM c38321qM = this.A03;
        if (c38321qM == null) {
            return;
        }
        A03(c38321qM);
    }

    public final void A02(Medium medium) {
        A00();
        this.A04 = true;
        C141796aw A00 = AbstractC141776au.A00(this);
        AbstractC23641Du.A05(AnonymousClass191.A00, new C57156PZa(this, medium, (InterfaceC23621Ds) null, 44), A00);
        this.A03 = null;
        this.A02 = medium;
    }
}
