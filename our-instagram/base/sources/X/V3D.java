package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes11.dex */
public final class V3D extends AbstractC65632xz {
    public final UserSession A00;
    public final XEO A01;
    public final XBB A02;
    public final InterfaceC72020XFi A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public V3D(UserSession userSession, XEO xeo, XBB xbb, InterfaceC72020XFi interfaceC72020XFi, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(interfaceC72020XFi, 3);
        this.A00 = userSession;
        this.A01 = xeo;
        this.A03 = interfaceC72020XFi;
        this.A05 = z;
        this.A04 = z2;
        this.A06 = z3;
        this.A02 = xbb;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        ImageUrl AsT;
        WNX wnx;
        int A03 = C0f9.A03(1222295271);
        C14360o3.A0B(view, 1);
        C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.search.common.model.SearchItemState");
        Tx0 tx0 = (Tx0) obj2;
        UserSession userSession = this.A00;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.search.common.model.AudioSearchEntry");
        HYY hyy = (HYY) obj;
        XEO xeo = this.A01;
        InterfaceC72020XFi interfaceC72020XFi = this.A03;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.AudioRowViewBinder.Holder");
        C69449VnY c69449VnY = (C69449VnY) tag;
        boolean A1M = AbstractC167007dF.A1M(tx0.A0F ? 1 : 0);
        boolean z = this.A05;
        boolean z2 = this.A04;
        XBB xbb = this.A02;
        boolean z3 = this.A06;
        C14360o3.A0B(userSession, 0);
        AbstractC167007dF.A1G(hyy, 1, c69449VnY);
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
                if (z3) {
                    str = A06.getFormattedClipsMediaCount();
                }
                AbstractC38075Gp4.A01(c41059IGc, displayArtist, str, null, A06.Ceq(), false);
            }
            View A01 = c69449VnY.A0A.A01();
            C14360o3.A07(A01);
            int i2 = 8;
            if (A1M) {
                i2 = 0;
            }
            A01.setVisibility(i2);
            if (A1M) {
                wnx = new WNX(48, hyy, tx0, xeo);
            } else {
                wnx = null;
            }
            C0fQ.A00(wnx, A01);
            if (A1M) {
                AbstractC66174U2p.A00(A01);
            }
            WNX.A00(c69449VnY.A06, hyy, tx0, xeo, 49);
            if (z) {
                c69449VnY.A05 = z2;
                WCy.A00(A06, xeo, c69449VnY, xbb);
            }
        }
        C0f9.A0A(-1189156343, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 594773133);
        View A01 = WCy.A00.A01(viewGroup, this.A05, this.A04);
        C0f9.A0A(-1503430178, A0G);
        return A01;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
