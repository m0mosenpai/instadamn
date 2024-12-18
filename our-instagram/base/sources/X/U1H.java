package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes11.dex */
public final class U1H extends AbstractC66412zI {
    public final UserSession A00;
    public final XEO A01;
    public final XBB A02;
    public final InterfaceC72020XFi A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public U1H(UserSession userSession, XEO xeo, XBB xbb, InterfaceC72020XFi interfaceC72020XFi, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = xeo;
        this.A03 = interfaceC72020XFi;
        this.A05 = z;
        this.A04 = z2;
        this.A02 = xbb;
        this.A06 = z3;
        this.A07 = z4;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        ImageUrl AsT;
        WNX wnx;
        NUV nuv = (NUV) interfaceC66482zP;
        UI7 ui7 = (UI7) c3oo;
        AbstractC167007dF.A1K(nuv, ui7);
        Tx0 tx0 = ((AbstractC50621MWi) nuv).A00;
        UserSession userSession = this.A00;
        HYY hyy = nuv.A00;
        XEO xeo = this.A01;
        InterfaceC72020XFi interfaceC72020XFi = this.A03;
        Object tag = ui7.A00.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.AudioRowViewBinder.Holder");
        C69449VnY c69449VnY = (C69449VnY) tag;
        boolean A1M = AbstractC167007dF.A1M(tx0.A0F ? 1 : 0);
        boolean z = this.A07;
        boolean z2 = this.A05;
        boolean z3 = this.A04;
        XBB xbb = this.A02;
        boolean z4 = this.A06;
        AbstractC167007dF.A1G(userSession, 0, c69449VnY);
        JIN A06 = hyy.A06();
        if (A06 != null) {
            if (interfaceC72020XFi != null) {
                interfaceC72020XFi.EDz(c69449VnY.A06, hyy, tx0);
            }
            ImageView imageView = c69449VnY.A07;
            String str = null;
            if (A06.CSb()) {
                AsT = null;
            } else {
                AsT = A06.AsT();
            }
            AbstractC38055Goi.A00(imageView, AsT, null);
            TextView textView = c69449VnY.A09;
            Context context = textView.getContext();
            C38064Gos c38064Gos = new C38064Gos(textView, context.getColor(AbstractC53242c7.A09(context)));
            c69449VnY.A04 = c38064Gos;
            AbstractC38060Gon.A00(null, c38064Gos, A06.getTitle(), A06.isExplicit(), false);
            C41059IGc c41059IGc = c69449VnY.A02;
            if (c41059IGc != null) {
                String displayArtist = A06.getDisplayArtist();
                if (z4) {
                    str = A06.getFormattedClipsMediaCount();
                }
                AbstractC38075Gp4.A01(c41059IGc, displayArtist, str, null, A06.Ceq(), z);
            }
            View A01 = c69449VnY.A0A.A01();
            C14360o3.A07(A01);
            int i = 8;
            if (A1M) {
                i = 0;
            }
            A01.setVisibility(i);
            if (A1M) {
                wnx = new WNX(48, hyy, tx0, xeo);
            } else {
                wnx = null;
            }
            C0fQ.A00(wnx, A01);
            if (A1M) {
                AbstractC66174U2p.A00(A01);
            }
            View view = c69449VnY.A06;
            WNX.A00(view, hyy, tx0, xeo, 49);
            if (z) {
                int A062 = AbstractC43594JPz.A06(view.getContext());
                AbstractC43592JPx.A1F(imageView, A062);
                imageView.getLayoutParams().width = A062;
                AbstractC66174U2p.A01(view);
            }
            if (z2) {
                c69449VnY.A05 = z3;
                WCy.A00(A06, xeo, c69449VnY, xbb);
            }
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return NUV.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JQ0.A1M(viewGroup);
        return new UI7(WCy.A00.A01(viewGroup, this.A05, this.A04));
    }
}
