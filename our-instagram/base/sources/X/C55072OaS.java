package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* renamed from: X.OaS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55072OaS {
    public OFE A00;
    public final UserSession A01;
    public final EnumC142806cg A02;
    public final C05A A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;
    public final C0UO A08;
    public final C0UO A09;
    public final C0UO A0A;

    public C55072OaS(UserSession userSession, EnumC142806cg enumC142806cg) {
        AbstractC167017dG.A1P(userSession, enumC142806cg);
        this.A01 = userSession;
        this.A02 = enumC142806cg;
        this.A00 = null;
        C008002u A00 = C10E.A00(null);
        this.A06 = A00;
        this.A0A = AbstractC208910l.A02(A00);
        C008002u A002 = C10E.A00(null);
        this.A04 = A002;
        this.A08 = AbstractC208910l.A02(A002);
        C008002u A003 = C10E.A00(null);
        this.A03 = A003;
        this.A07 = AbstractC208910l.A02(A003);
        C008002u A004 = C10E.A00(null);
        this.A05 = A004;
        this.A09 = AbstractC208910l.A02(A004);
    }

    private final java.util.Set A00(EnumC53187Nfj enumC53187Nfj, boolean z) {
        java.util.Set<C54825OLj> set;
        OFE ofe = this.A00;
        if (ofe != null) {
            set = ofe.A03.A02(AbstractC43592JPx.A16(enumC53187Nfj), z);
        } else {
            set = C16910sj.A00;
        }
        ArrayList A0q = AbstractC167017dG.A0q(set);
        for (C54825OLj c54825OLj : set) {
            C14360o3.A0A(c54825OLj);
            A0q.add(AbstractC54263Nyi.A00(this.A01, c54825OLj));
        }
        return AbstractC001800i.A0k(A0q);
    }

    public final void A02(C54825OLj c54825OLj) {
        this.A06.Egh(AbstractC54263Nyi.A00(this.A01, c54825OLj));
        C05A c05a = this.A04;
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        EnumC53187Nfj enumC53187Nfj = EnumC53187Nfj.A02;
        A01(enumC53187Nfj, this, A0l, true);
        EnumC53187Nfj enumC53187Nfj2 = EnumC53187Nfj.A0A;
        A01(enumC53187Nfj2, this, A0l, true);
        EnumC53187Nfj enumC53187Nfj3 = EnumC53187Nfj.A04;
        A01(enumC53187Nfj3, this, A0l, true);
        EnumC53187Nfj enumC53187Nfj4 = EnumC53187Nfj.A03;
        A01(enumC53187Nfj4, this, A0l, true);
        A01(EnumC53187Nfj.A06, this, A0l, true);
        c05a.Egh(A0l);
        C05A c05a2 = this.A03;
        EnumC53187Nfj enumC53187Nfj5 = EnumC53187Nfj.A08;
        c05a2.Egh(A00(enumC53187Nfj5, false));
        C05A c05a3 = this.A05;
        LinkedHashSet A0l2 = AbstractC31171DnF.A0l();
        if (this.A02 == EnumC142806cg.A03) {
            A01(enumC53187Nfj, this, A0l2, false);
            A01(enumC53187Nfj2, this, A0l2, false);
            A01(enumC53187Nfj3, this, A0l2, false);
            A01(enumC53187Nfj4, this, A0l2, false);
            A01(enumC53187Nfj5, this, A0l2, false);
        }
        c05a3.Egh(A0l2);
    }

    public static void A01(EnumC53187Nfj enumC53187Nfj, C55072OaS c55072OaS, Collection collection, boolean z) {
        collection.addAll(c55072OaS.A00(enumC53187Nfj, z));
    }
}
