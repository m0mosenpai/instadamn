package X;

import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LgZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48705LgZ implements MR2 {
    public final /* synthetic */ L48 A00;

    @Override // X.MR2
    public final void CwE(C148286ly c148286ly, EnumC46186KcO enumC46186KcO, int i) {
        MRR mrr;
        C14360o3.A0B(enumC46186KcO, 2);
        KCS kcs = this.A00.A03.A0A.A00;
        IgdsInlineSearchBox igdsInlineSearchBox = kcs.A0A;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A03();
        }
        L6D l6d = kcs.A07;
        if (l6d != null && (mrr = l6d.A00.A02) != null) {
            mrr.Cu8(c148286ly, enumC46186KcO, i);
        }
    }

    @Override // X.MR2
    public final void Dvy(String str) {
    }

    public C48705LgZ(L48 l48) {
        this.A00 = l48;
    }

    @Override // X.MR2
    public final void CwC() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A00.A03.A0A.A00.A0A;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A03();
        }
    }

    @Override // X.MR2
    public final void CwS(JWd jWd, int i) {
        C47987LJp c47987LJp = this.A00.A03;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A1J = AbstractC25226BEj.A1J(c47987LJp.A01.A01);
        int i2 = 0;
        while (A1J.hasNext()) {
            Object next = A1J.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            if (i2 == i) {
                A1E.add(jWd);
            } else {
                A1E.add(next);
            }
            i2 = i3;
        }
        C47987LJp.A01(C45111Jxg.A00(C05F.A0C, C47987LJp.A00(c47987LJp), c47987LJp.A01.A04, A1E, false), c47987LJp);
    }

    @Override // X.MR2
    public final void Deq(int i) {
        C47987LJp c47987LJp = this.A00.A03;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A1J = AbstractC25226BEj.A1J(c47987LJp.A01.A01);
        int i2 = 0;
        while (A1J.hasNext()) {
            Object next = A1J.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            if (i2 == i) {
                JWd jWd = (JWd) c47987LJp.A02.get(i2);
                long j = i;
                UserSession userSession = c47987LJp.A09;
                InterfaceC11380iw interfaceC11380iw = c47987LJp.A08;
                C148286ly c148286ly = (C148286ly) jWd.A00;
                String str = c148286ly.A0U;
                if (str == null) {
                    str = "";
                }
                List A1J2 = AbstractC166987dD.A1J(c148286ly.A0S);
                EnumC46271Ke3 enumC46271Ke3 = EnumC46271Ke3.AI_STICKER;
                String str2 = c47987LJp.A0E;
                boolean A0a = AbstractC001900j.A0a(AbstractC43592JPx.A0w(c148286ly.A0H), ".webp", false);
                Long valueOf = Long.valueOf(j);
                LJM.A01(enumC46271Ke3, interfaceC11380iw, userSession, valueOf, str, null, str2, A1J2, A0a);
                String str3 = c148286ly.A0U;
                if (str3 == null) {
                    str3 = "";
                }
                LJM.A03(EnumC46295KeR.PAIR_AI_GENERATED, interfaceC11380iw, userSession, valueOf, str3, str2, AbstractC166987dD.A1J(c148286ly.A0S), AbstractC001900j.A0a(AbstractC43592JPx.A0w(c148286ly.A0H), ".webp", false));
                next = c47987LJp.A02.get(i2);
            }
            A1E.add(next);
            i2 = i3;
        }
        C47987LJp.A01(C45111Jxg.A00(C05F.A0C, C47987LJp.A00(c47987LJp), c47987LJp.A01.A04, A1E, false), c47987LJp);
    }
}
