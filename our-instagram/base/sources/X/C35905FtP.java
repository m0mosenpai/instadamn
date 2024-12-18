package X;

import com.facebook.R;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.FtP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35905FtP implements InterfaceC114785Gl {
    public final int A00;
    public final Object A01;

    public C35905FtP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC114785Gl
    public final void FAY(android.net.Uri uri) {
        switch (this.A00) {
            case 0:
                C32252EIl.A00((C32252EIl) this.A01);
                return;
            case 1:
                C32255EIp.A00((C32255EIp) this.A01);
                return;
            case 2:
                return;
            default:
                C31721DwQ c31721DwQ = (C31721DwQ) this.A01;
                MUK.A02(c31721DwQ.A0V).A00 = true;
                if (c31721DwQ.A13) {
                    IgdsHeadline igdsHeadline = (IgdsHeadline) c31721DwQ.A03.findViewById(R.id.complete_your_profile_headline_title);
                    if (igdsHeadline != null) {
                        igdsHeadline.setCircularImageUrl(AbstractC31174DnI.A0T(c31721DwQ.A0V, C17060sy.A01), null);
                    }
                    C31721DwQ.A06(c31721DwQ);
                    return;
                }
                if (AbstractC31178DnM.A1X(C06090Tz.A05, c31721DwQ.A0V, 36322624321628533L)) {
                    c31721DwQ.A00 = uri;
                    C57012jc c57012jc = c31721DwQ.A0Z;
                    if (c57012jc != null) {
                        c57012jc.A02();
                    }
                    if (c31721DwQ.A0Z == null) {
                        C57012jc A0U = AbstractC31177DnL.A0U(c31721DwQ.A03, R.id.broadcast_profile_photo_update_stub);
                        c31721DwQ.A0Z = A0U;
                        IgdsBanner igdsBanner = (IgdsBanner) A0U.A01();
                        igdsBanner.setBody(2131954301);
                        igdsBanner.setAction(2131954300);
                        G81.A00(igdsBanner, c31721DwQ, 9);
                    }
                    C57012jc c57012jc2 = c31721DwQ.A0Z;
                    if (c57012jc2 != null) {
                        c57012jc2.A03(0);
                    }
                    C31721DwQ.A0C(c31721DwQ);
                    return;
                }
                AbstractC25226BEj.A1Q(c31721DwQ);
                return;
        }
    }
}
