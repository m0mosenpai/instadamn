package X;

import com.instagram.model.androidlink.AndroidLink;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Hac, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39392Hac extends AbstractC86353t7 {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ AndroidLink A01;
    public final /* synthetic */ UserDetailFragment A02;
    public final /* synthetic */ C37952Gmu A03;

    public C39392Hac(C38321qM c38321qM, AndroidLink androidLink, UserDetailFragment userDetailFragment, C37952Gmu c37952Gmu) {
        this.A02 = userDetailFragment;
        this.A00 = c38321qM;
        this.A01 = androidLink;
        this.A03 = c37952Gmu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if ((r3 instanceof X.C40971v4) != false) goto L8;
     */
    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DId(java.lang.Integer r5) {
        /*
            r4 = this;
            com.instagram.profile.fragment.UserDetailFragment r1 = r4.A02
            r0 = 1
            r1.A1c = r0
            com.instagram.common.session.UserSession r0 = r1.A0I
            boolean r0 = X.C5Hu.A03(r0)
            if (r0 == 0) goto L26
            com.instagram.sponsored.analytics.SourceModelInfoParams r0 = r1.A1N
            java.lang.String r0 = r0.A04
            if (r0 != 0) goto L27
            X.1qR r3 = r1.A0M
            boolean r0 = r3 instanceof X.C40971v4
            if (r0 == 0) goto L27
        L19:
            com.instagram.model.androidlink.AndroidLink r0 = r4.A01
            java.lang.String r2 = r0.CHN()
            X.Gmu r1 = r4.A03
            java.lang.String r0 = "webclick"
            X.AbstractC41772Ieo.A07(r3, r1, r0, r2)
        L26:
            return
        L27:
            X.1qM r3 = r4.A00
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39392Hac.DId(java.lang.Integer):void");
    }
}
