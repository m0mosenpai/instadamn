package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Lmx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49071Lmx implements C7Zf {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final C7TT A02;
    public final C2EC A03;
    public final DirectShareTarget A04;
    public final C3o9 A05;

    public C49071Lmx(AbstractC59962oe abstractC59962oe, UserSession userSession, C7TT c7tt, C2EC c2ec, DirectShareTarget directShareTarget, C3o9 c3o9) {
        C14360o3.A0B(userSession, 2);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A05 = c3o9;
        this.A03 = c2ec;
        this.A02 = c7tt;
        this.A04 = directShareTarget;
    }

    @Override // X.C7Zf
    public final void Cqb(String str, String str2) {
        UserSession userSession = this.A01;
        L6G l6g = new L6G(userSession);
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A0C, userSession);
        c116875Qr.A0h = str;
        c116875Qr.A1J = null;
        l6g.A00(this.A00.requireActivity(), c116875Qr.A00(), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if (X.C161867Mw.A02(r6.Aic()) != false) goto L14;
     */
    @Override // X.C7Zf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cqj(android.graphics.RectF r40, com.instagram.common.typedurl.ImageUrl r41, X.C47777L8c r42, com.instagram.model.direct.messageid.MessageIdentifier r43, X.C40971v4 r44, java.lang.Boolean r45, java.lang.Boolean r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49071Lmx.Cqj(android.graphics.RectF, com.instagram.common.typedurl.ImageUrl, X.L8c, com.instagram.model.direct.messageid.MessageIdentifier, X.1v4, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
