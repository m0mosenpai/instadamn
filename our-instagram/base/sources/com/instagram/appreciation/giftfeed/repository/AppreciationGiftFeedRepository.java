package com.instagram.appreciation.giftfeed.repository;

import X.AbstractC208910l;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C14360o3;
import X.C43893Jb2;
import X.C51726Mt3;
import X.C6XI;
import X.InterfaceC57806PkY;
import X.LEG;
import X.MU9;
import X.MUq;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class AppreciationGiftFeedRepository {
    public long A00;
    public final C43893Jb2 A01;
    public final AppreciationGiftFeedDataSource A02;
    public final LEG A03;
    public final UserSession A04;
    public final String A05;
    public final C05A A06;
    public final C0UO A07;

    public /* synthetic */ AppreciationGiftFeedRepository(UserSession userSession, String str) {
        AppreciationGiftFeedDataSource appreciationGiftFeedDataSource = new AppreciationGiftFeedDataSource(userSession);
        C43893Jb2 c43893Jb2 = new C43893Jb2(userSession);
        LEG leg = new LEG(userSession, C6XI.A00);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        this.A04 = userSession;
        this.A05 = str;
        this.A02 = appreciationGiftFeedDataSource;
        this.A01 = c43893Jb2;
        this.A03 = leg;
        C008002u A00 = C10E.A00(MUq.A00);
        this.A06 = A00;
        this.A07 = AbstractC208910l.A02(A00);
        this.A00 = -1L;
    }

    public static final C51726Mt3 A00(AppreciationGiftFeedRepository appreciationGiftFeedRepository) {
        InterfaceC57806PkY interfaceC57806PkY = (InterfaceC57806PkY) appreciationGiftFeedRepository.A06.getValue();
        if (MU9.A01(interfaceC57806PkY, 1)) {
            return (C51726Mt3) ((MU9) interfaceC57806PkY).A01;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x012f, code lost:
    
        if (r16 == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.Long r26, java.lang.String r27, X.InterfaceC23621Ds r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository.A01(java.lang.Long, java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r23, X.InterfaceC23621Ds r24) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository.A02(java.lang.String, X.1Ds):java.lang.Object");
    }
}
