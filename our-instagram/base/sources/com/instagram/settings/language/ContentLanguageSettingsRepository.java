package com.instagram.settings.language;

import X.AbstractC167017dG;
import android.app.Application;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ContentLanguageSettingsRepository {
    public final Application A00;
    public final UserSession A01;
    public final ContentLanguageSettingsApi A02;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r3 = 0
            boolean r0 = X.C57146PWy.A01(r7, r3)
            if (r0 == 0) goto L7e
            r5 = r7
            X.PWy r5 = (X.C57146PWy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L5c
            if (r0 != r3) goto L9e
            java.lang.Object r2 = r5.A01
            java.util.List r2 = (java.util.List) r2
            X.AbstractC09560e7.A00(r1)
        L27:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L8f
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.E5k r0 = (X.C32032E5k) r0
            java.util.List r5 = r0.A00
            java.util.ArrayList r4 = X.AbstractC167017dG.A0q(r2)
            java.util.Iterator r3 = r2.iterator()
        L3d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r2 = r3.next()
            X.E9i r2 = (X.C32110E9i) r2
            java.util.Locale r0 = r2.A03
            java.lang.String r0 = r0.toString()
            boolean r1 = r5.contains(r0)
            X.Mth r0 = new X.Mth
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L3d
        L5c:
            X.AbstractC09560e7.A00(r1)
            android.app.Application r2 = r6.A00
            r0 = 13
            X.Ds4 r1 = new X.Ds4
            r1.<init>(r2, r0)
            java.util.List r0 = X.AbstractC35114FeG.A00
            java.util.ArrayList r2 = X.AbstractC166987dD.A1F(r0)
            java.util.Collections.sort(r2, r1)
            com.instagram.settings.language.ContentLanguageSettingsApi r0 = r6.A02
            r5.A01 = r2
            r5.A00 = r3
            java.lang.Object r1 = r0.A00(r5)
            if (r1 != r4) goto L27
            return r4
        L7e:
            X.PWy r5 = new X.PWy
            r5.<init>(r6, r7, r3)
            goto L15
        L84:
            r1 = 7
            X.GRI r0 = new X.GRI
            r0.<init>(r1)
            java.util.List r4 = X.AbstractC001800i.A0g(r4, r0)
            return r4
        L8f:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L99
            X.6mI r0 = new X.6mI
            r0.<init>()
            throw r0
        L99:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L9e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings.language.ContentLanguageSettingsRepository.A01(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.C51758Mth r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r4 = 28
            boolean r0 = X.PXC.A03(r8, r4)
            if (r0 == 0) goto L84
            r2 = r8
            X.PXC r2 = (X.PXC) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L84
            int r3 = r3 - r1
            r2.A00 = r3
        L16:
            java.lang.Object r0 = r2.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r2.A00
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 != r3) goto L8c
            X.AbstractC09560e7.A00(r0)
        L24:
            boolean r1 = r0 instanceof X.C194848jk
            if (r1 == 0) goto L2e
            r3 = 0
        L29:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L2e:
            boolean r0 = r0 instanceof X.C3NX
            if (r0 != 0) goto L29
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L37:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A01
            X.1Ms r5 = X.AbstractC25228BEl.A0q(r0)
            boolean r0 = r7.A01
            if (r0 == 0) goto L81
            java.lang.String r1 = "add"
        L46:
            java.lang.String r0 = "action"
            r5.A9s(r0, r1)
            java.lang.Object r0 = r7.A00
            X.E9i r0 = (X.C32110E9i) r0
            java.util.Locale r0 = r0.A03
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "locale"
            r5.A9s(r0, r1)
            r5.A05()
            r5.A03()
            java.lang.String r0 = "api/v1/i18n/update_content_locale/"
            r5.A0B(r0)
            java.lang.Class<X.E9y> r1 = X.C32125E9y.class
            java.lang.Class<X.FS6> r0 = X.FS6.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r5, r1, r0)
            r0 = 5
            java.lang.String r0 = X.MSV.A00(r0)
            X.C14360o3.A0C(r1, r0)
            r2.A00 = r3
            r0 = 103745445(0x62f07a5, float:3.2919458E-35)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r4) goto L24
            return r4
        L81:
            java.lang.String r1 = "remove"
            goto L46
        L84:
            r0 = 42
            X.PXC r2 = new X.PXC
            r2.<init>(r6, r8, r4, r0)
            goto L16
        L8c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings.language.ContentLanguageSettingsRepository.A00(X.Mth, X.1Ds):java.lang.Object");
    }

    public ContentLanguageSettingsRepository(Application application, UserSession userSession, ContentLanguageSettingsApi contentLanguageSettingsApi) {
        AbstractC167017dG.A1P(application, userSession);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = contentLanguageSettingsApi;
    }
}
