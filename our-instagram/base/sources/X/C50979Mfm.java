package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mfm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50979Mfm extends AbstractC52922bZ {
    public C51761Mtk A00;
    public MusicAttributionConfig A01;
    public C38061Goo A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final MusicProduct A06;
    public final UserSession A07;
    public final List A08;
    public final java.util.Set A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC19390xP A0B;
    public final C05A A0C;

    public C50979Mfm(MusicProduct musicProduct, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, musicProduct);
        this.A07 = userSession;
        this.A06 = musicProduct;
        this.A0A = AbstractC09440dt.A01(new C57245PbT(this, 15));
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A0C = A0o;
        this.A0B = A0o;
        this.A08 = AbstractC166987dD.A1E();
        this.A09 = AbstractC31171DnF.A0l();
    }

    public final void A00() {
        Integer num;
        ArrayList A1E = AbstractC166987dD.A1E();
        List list = this.A08;
        if (AbstractC166987dD.A1b(list)) {
            A1E.add(new HM8());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A1E.add(new HMA(AbstractC166987dD.A1B(it)));
            }
        }
        C38061Goo c38061Goo = this.A02;
        if (c38061Goo != null) {
            java.util.Set set = this.A09;
            java.util.Set A0j = AbstractC001800i.A0j(set);
            set.clear();
            C38061Goo c38061Goo2 = (C38061Goo) AbstractC001800i.A0A(A0j);
            if (c38061Goo2 != null) {
                num = c38061Goo2.A0G;
            } else {
                num = null;
            }
            if (num == C05F.A0Y) {
                set.add(c38061Goo2);
                A0j.remove(c38061Goo2);
            }
            set.add(c38061Goo);
            set.addAll(A0j);
        }
        java.util.Set set2 = this.A09;
        if (AbstractC31171DnF.A1b(set2)) {
            A1E.isEmpty();
            C51761Mtk c51761Mtk = this.A00;
            if (c51761Mtk != null) {
                A1E.add(new HM9(c51761Mtk));
            }
            A1E.addAll(IRV.A01(AbstractC001800i.A0a(set2)));
        }
        A1E.add(new HM7());
        this.A0C.Egh(A1E);
    }
}
