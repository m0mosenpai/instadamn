package com.instagram.barcelona.weblink.data;

import X.C200148tJ;
import X.C200448tn;
import X.InterfaceC13000lm;
import X.InterfaceC200458to;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class FetchLinkMetadataCache implements InterfaceC13000lm {
    public final InterfaceC200458to A00;
    public final UserSession A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r9, java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.weblink.data.FetchLinkMetadataCache.A00(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        ((C200448tn) this.A00).A00.clear();
    }

    public FetchLinkMetadataCache(UserSession userSession) {
        this.A01 = userSession;
        C200148tJ c200148tJ = new C200148tJ();
        c200148tJ.A02(10L, TimeUnit.MINUTES);
        this.A00 = c200148tJ.A00();
    }
}
