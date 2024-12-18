package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;

/* renamed from: X.FQg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34695FQg {
    public boolean A00;
    public final EnumC33373Ep6 A01;
    public final GroupLinkPreviewResponse$Success A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final C19L A06;
    public final C50679MYx A07;
    public final C50679MYx A08;
    public final C12N A09;
    public final UserSession A0A;
    public final C33091Eir A0B;
    public final C34702FQn A0C;

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C32791Ebv
            if (r0 == 0) goto L18
            r2 = r3
            X.Ebv r2 = (X.C32791Ebv) r2
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r1 = r2.A07
            boolean r0 = r1.A0G
            if (r0 != 0) goto L16
            boolean r0 = r1.A0D
            if (r0 != 0) goto L16
            boolean r1 = r2.A00
        L13:
            r0 = 1
            if (r1 == 0) goto L17
        L16:
            r0 = 0
        L17:
            return r0
        L18:
            boolean r0 = r3 instanceof X.C32790Ebu
            if (r0 != 0) goto L16
            boolean r0 = r3 instanceof X.C32789Ebt
            if (r0 != 0) goto L16
            r2 = r3
            X.Ebw r2 = (X.C32792Ebw) r2
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r1 = r2.A05
            boolean r0 = r1.A0D
            if (r0 != 0) goto L16
            java.lang.Long r0 = r1.A04
            java.lang.String r1 = java.lang.String.valueOf(r0)
            com.instagram.common.session.UserSession r0 = r2.A00
            boolean r1 = X.AbstractC31171DnF.A1W(r0, r1)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC34695FQg.A00():boolean");
    }

    public AbstractC34695FQg(C50679MYx c50679MYx, C50679MYx c50679MYx2, UserSession userSession, EnumC33373Ep6 enumC33373Ep6, C33091Eir c33091Eir, C34702FQn c34702FQn, GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success) {
        this.A0A = userSession;
        this.A0B = c33091Eir;
        this.A01 = enumC33373Ep6;
        this.A07 = c50679MYx;
        this.A08 = c50679MYx2;
        this.A02 = groupLinkPreviewResponse$Success;
        this.A0C = c34702FQn;
        this.A05 = groupLinkPreviewResponse$Success.A0B;
        this.A03 = groupLinkPreviewResponse$Success.A06;
        this.A04 = groupLinkPreviewResponse$Success.A09;
        C12L c12l = C12L.A00;
        this.A09 = c12l;
        this.A06 = AbstractC167017dG.A0w(c12l, 483063461);
    }
}
