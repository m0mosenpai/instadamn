package com.instagram.creation.capture.quickcapture.sundial.sfx;

import X.AbstractC50522MSa;
import X.C14360o3;
import X.C1C6;
import X.C1E2;
import X.C1Ef;
import X.C1QW;
import X.C1QX;
import X.C1QY;
import X.C24891Jo;
import X.C26371Ps;
import X.C55935OsR;
import X.C57747Pja;
import X.InterfaceC23621Ds;
import X.InterfaceC27191Tt;
import X.MSY;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes9.dex */
public final class SfxNetworkSource {
    public final C1QY A00;

    public final Object A00(UserSession userSession, File file, String str, String str2, String str3, String str4, InterfaceC23621Ds interfaceC23621Ds, int i) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24891Jo.A04;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        C26371Ps A0U = AbstractC50522MSa.A0U(userSession);
        A0U.A02(str4);
        A0U.A05 = true;
        C1QW A00 = A0U.A00();
        InterfaceC27191Tt A02 = C1C6.A00().A02(new C55935OsR(file, str2, str3, str, c24891Jo, i), A00, this.A00);
        C14360o3.A07(A02);
        c24891Jo.CPA(C57747Pja.A00(A02, 34));
        return c24891Jo.A0E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (r0 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.instagram.common.session.UserSession r18, java.lang.String r19, java.lang.String r20, X.InterfaceC23621Ds r21) {
        /*
            r17 = this;
            r4 = 13
            r5 = r21
            boolean r0 = X.MAM.A02(r5, r4)
            if (r0 == 0) goto La5
            r3 = r5
            X.MAM r3 = (X.MAM) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La5
            int r2 = r2 - r1
            r3.A00 = r2
        L18:
            java.lang.Object r0 = r3.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r3.A00
            r4 = 1
            if (r1 == 0) goto L61
            if (r1 != r4) goto Lb5
            X.AbstractC09560e7.A00(r0)
        L26:
            r2 = r0
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L58
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            X.Gp0 r0 = (X.C38071Gp0) r0
            java.util.List r1 = r0.A05
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.music.common.model.MusicSearchItem>"
            X.C14360o3.A0C(r1, r0)
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.Iterator r1 = r1.iterator()
        L42:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = r1.next()
            X.Goo r0 = (X.C38061Goo) r0
            X.JIN r0 = r0.A00()
            if (r0 == 0) goto L42
            r2.add(r0)
            goto L42
        L58:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto La4
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L61:
            X.AbstractC09560e7.A00(r0)
            X.MYt r6 = X.C50675MYt.A02
            r13 = 0
            java.lang.String r1 = "playlists"
            java.lang.String r0 = "Sound Effects"
            r5 = r19
            com.instagram.music.common.model.MusicBrowseCategory r10 = X.C50535MSo.A03(r1, r5, r0)
            com.instagram.api.schemas.MusicProduct r7 = com.instagram.api.schemas.MusicProduct.A06
            java.lang.Integer r11 = X.C05F.A0Y
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.Long r12 = X.MSW.A0z(r0)
            java.lang.Class<X.Gp3> r1 = X.C38074Gp3.class
            X.0aQ r0 = new X.0aQ
            r8 = r18
            r0.<init>(r8)
            X.1Mo r9 = new X.1Mo
            r9.<init>(r0, r1)
            java.lang.String r15 = "sound_effects"
            r14 = r20
            r16 = r13
            X.1ON r1 = r6.A02(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.music.api.MusicSearchResponse, com.instagram.music.api.MusicSearchResponse>"
            X.C14360o3.A0C(r1, r0)
            r3.A00 = r4
            r0 = 1975100848(0x75b9a5b0, float:4.706716E32)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r2) goto L26
        La4:
            return r2
        La5:
            r0 = 42
            X.MAM r3 = new X.MAM
            r1 = r17
            r3.<init>(r1, r5, r4, r0)
            goto L18
        Lb0:
            X.3NX r2 = X.AbstractC25225BEi.A0z(r2)
            return r2
        Lb5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.sfx.SfxNetworkSource.A01(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public SfxNetworkSource() {
        C1QX A0J = MSY.A0J();
        A0J.A03 = C1Ef.OnScreen;
        this.A00 = A0J.A00();
    }
}
