package com.instagram.mediakit.api;

import X.AbstractC115105If;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC23721Ec;
import X.AbstractC25228BEl;
import X.AbstractC31172DnG;
import X.AbstractC31177DnL;
import X.AbstractC31182DnR;
import X.AbstractC55033OXz;
import X.AnonymousClass001;
import X.B4Z;
import X.C115095Ie;
import X.C115115Ig;
import X.C14360o3;
import X.C25621Ms;
import X.C40781ul;
import X.C41323IQt;
import X.C41324IQu;
import X.C50534MSn;
import X.C54780OIu;
import X.C55702hA;
import X.H9C;
import X.H9K;
import X.InterfaceC40821up;
import X.InterfaceC58279PsX;
import X.JX4;
import X.MWG;
import X.PZ2;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class MediaKitApi implements InterfaceC58279PsX {
    public final UserSession A00;
    public final C54780OIu A01;
    public final C54780OIu A02;

    public static void A01(AbstractC23721Ec abstractC23721Ec, Object obj) {
        String format = String.format("media_kit/%s/", Arrays.copyOf(new Object[]{obj}, 1));
        C14360o3.A07(format);
        abstractC23721Ec.A0E = format;
    }

    public final MWG A04(String str) {
        C14360o3.A0B(str, 0);
        C25621Ms A0c = AbstractC167017dG.A0c(this.A00);
        A00(A0c);
        A01(A0c, AnonymousClass001.A0R(str, "/delete"));
        return JX4.A00(new C50534MSn(this, null, 9), AbstractC31172DnG.A0R(null, A0c, C40781ul.class, C55702hA.class, false).A03(240273335));
    }

    public final MWG A05(String str) {
        C14360o3.A0B(str, 0);
        C25621Ms A0M = AbstractC31177DnL.A0M(this.A00);
        A00(A0M);
        A01(A0M, str);
        return JX4.A00(new C50534MSn(this, null, 11), JX4.A01(new C50534MSn(this, null, 10), AbstractC31172DnG.A0R(null, A0M, H9K.class, C41323IQt.class, false).A03(763626105)));
    }

    public final MWG A06(Map map, boolean z) {
        C25621Ms A0c = AbstractC167017dG.A0c(this.A00);
        A00(A0c);
        A01(A0c, "create_or_update_media_kit");
        A0c.A0P(null, H9K.class, C41323IQt.class, false);
        if (map != null) {
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                A0c.A9s(AbstractC31172DnG.A17(A1K), (String) A1K.getValue());
            }
        }
        return JX4.A00(new PZ2(this, map, null, 2, z), JX4.A01(new C50534MSn(this, null, 8), A0c.A0N().A03(627162090)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
    
        if (X.AbstractC25228BEl.A1A(r2).length() > 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c4, code lost:
    
        r3.getErrorBody();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
    
        return X.AbstractC43592JPx.A0p(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        if (r3 != null) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(com.instagram.api.schemas.MediaKitVisibility r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            r2 = 1
            boolean r0 = X.C57145PWx.A02(r9, r2)
            if (r0 == 0) goto L72
            r4 = r9
            X.PWx r4 = (X.C57145PWx) r4
            int r3 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L72
            int r3 = r3 - r1
            r4.A00 = r3
        L15:
            java.lang.Object r0 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r1 = r4.A00
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L80
            java.lang.Object r4 = r4.A01
            com.instagram.mediakit.api.MediaKitApi r4 = (com.instagram.mediakit.api.MediaKitApi) r4
            X.AbstractC09560e7.A00(r0)
        L26:
            r3 = r0
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L77
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            X.H94 r0 = (X.H94) r0
            X.Muu r0 = r0.A00
            if (r0 != 0) goto L85
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3f:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Ms r5 = X.AbstractC167017dG.A0c(r0)
            r6.A00(r5)
            java.lang.String r0 = "/update_visibility"
            java.lang.String r0 = X.AnonymousClass001.A0R(r8, r0)
            A01(r5, r0)
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "visibility"
            r5.A9s(r0, r1)
            java.lang.Class<X.H94> r1 = X.H94.class
            java.lang.Class<X.IOV> r0 = X.IOV.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r5, r1, r0)
            r4.A01 = r6
            r4.A00 = r2
            r0 = 1879525183(0x7007473f, float:1.6746643E29)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 == r3) goto Lcb
            r4 = r6
            goto L26
        L72:
            X.PWx r4 = X.C57145PWx.A00(r6, r9, r2)
            goto L15
        L77:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L89
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L80:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L85:
            X.3NX r3 = X.AbstractC25225BEi.A0z(r0)
        L89:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 != 0) goto Lcb
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto Ld1
            X.5If r1 = X.MSX.A0E(r3)
            java.lang.Integer r0 = X.C05F.A0B
            A02(r1, r4, r0)
            X.C14360o3.A0B(r1, r2)
            boolean r0 = r1 instanceof X.C115115Ig
            r4 = 0
            if (r0 == 0) goto Lcc
            X.5Ig r1 = (X.C115115Ig) r1
            if (r1 == 0) goto Lcc
            java.lang.Object r3 = r1.A00
            X.1up r3 = (X.InterfaceC40821up) r3
            if (r3 == 0) goto Lcd
            java.lang.String r2 = r3.getErrorMessage()
            if (r2 == 0) goto Lcd
            int r1 = r3.getStatusCode()
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto Lcd
            java.lang.String r0 = X.AbstractC25228BEl.A1A(r2)
            int r0 = r0.length()
            if (r0 <= 0) goto Lcd
        Lc4:
            r3.getErrorBody()
        Lc7:
            X.8jk r3 = X.AbstractC43592JPx.A0p(r2)
        Lcb:
            return r3
        Lcc:
            r3 = r4
        Lcd:
            r2 = r4
            if (r3 == 0) goto Lc7
            goto Lc4
        Ld1:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.api.MediaKitApi.A07(com.instagram.api.schemas.MediaKitVisibility, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (r4 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A08(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r3 = 0
            boolean r0 = X.C57145PWx.A02(r7, r3)
            if (r0 == 0) goto L69
            r5 = r7
            X.PWx r5 = (X.C57145PWx) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r2 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L41
            if (r0 != r3) goto L6e
            java.lang.Object r1 = r5.A01
            com.instagram.mediakit.api.MediaKitApi r1 = (com.instagram.mediakit.api.MediaKitApi) r1
            X.AbstractC09560e7.A00(r2)
        L27:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L78
            X.3NX r2 = (X.C3NX) r2
            if (r2 == 0) goto L78
            java.lang.Object r0 = r2.A00
            X.H8f r0 = (X.C38831H8f) r0
            if (r0 == 0) goto L78
            X.Gxr r0 = r0.A00
            if (r0 != 0) goto L73
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L41:
            X.AbstractC09560e7.A00(r2)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r0)
            java.lang.String r0 = "async_get_user_insights_dictionary"
            A01(r2, r0)
            r6.A00(r2)
            java.lang.Class<X.H8f> r1 = X.C38831H8f.class
            java.lang.Class<X.IOU> r0 = X.IOU.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A01 = r6
            r5.A00 = r3
            r0 = 416990682(0x18dac5da, float:5.655146E-24)
            java.lang.Object r2 = r1.A00(r0, r5)
            if (r2 == r4) goto L77
            r1 = r6
            goto L27
        L69:
            X.PWx r5 = X.C57145PWx.A00(r6, r7, r3)
            goto L15
        L6e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L73:
            java.util.List r4 = r0.A00
            if (r4 == 0) goto L78
        L77:
            return r4
        L78:
            java.lang.Integer r0 = X.C05F.A0G
            X.AbstractC55033OXz.A01(r1, r0)
            X.0sl r4 = X.C16930sl.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mediakit.api.MediaKitApi.A08(X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "MediaKitApi";
    }

    private final void A00(C25621Ms c25621Ms) {
        C54780OIu c54780OIu = this.A02;
        if (AbstractC25228BEl.A1A(c54780OIu.A02).length() == 0) {
            c54780OIu.A02 = AbstractC166997dE.A0n();
        }
        c25621Ms.A9s(AbstractC31182DnR.A04(), c54780OIu.A02);
    }

    public static final void A02(AbstractC115105If abstractC115105If, MediaKitApi mediaKitApi, Integer num) {
        String message;
        String str;
        if (abstractC115105If instanceof C115115Ig) {
            message = ((InterfaceC40821up) ((C115115Ig) abstractC115105If).A00).getErrorMessage();
            str = "http";
        } else if (abstractC115105If instanceof C115095Ie) {
            message = ((C115095Ie) abstractC115105If).A00.getMessage();
            str = "network";
        } else {
            throw B4Z.A00();
        }
        AbstractC55033OXz.A00(null, mediaKitApi, num, str, message, AbstractC166987dD.A1G());
    }

    public final MWG A03() {
        UserSession userSession = this.A00;
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A00(A0M);
        A01(A0M, AnonymousClass001.A0R("user/", userSession.userId));
        return JX4.A00(new C50534MSn(this, null, 13), JX4.A01(new C50534MSn(this, null, 12), AbstractC31172DnG.A0R(null, A0M, H9C.class, C41324IQu.class, false).A03(308571972)));
    }

    @Override // X.InterfaceC58279PsX
    public final C54780OIu BOh() {
        return this.A01;
    }

    public MediaKitApi(UserSession userSession, C54780OIu c54780OIu) {
        AbstractC167017dG.A1P(userSession, c54780OIu);
        this.A00 = userSession;
        this.A02 = c54780OIu;
        this.A01 = c54780OIu;
    }
}
