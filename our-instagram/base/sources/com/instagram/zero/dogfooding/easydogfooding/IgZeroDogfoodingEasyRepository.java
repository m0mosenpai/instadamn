package com.instagram.zero.dogfooding.easydogfooding;

import X.AbstractC40691uc;
import X.AnonymousClass195;
import X.C14360o3;
import X.C40701ud;
import X.InterfaceC13000lm;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class IgZeroDogfoodingEasyRepository implements InterfaceC13000lm {
    public AnonymousClass195 A00;
    public final UserSession A01;
    public final C40701ud A02;

    public IgZeroDogfoodingEasyRepository(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = AbstractC40691uc.A01(userSession);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        synchronized (this) {
            AnonymousClass195 anonymousClass195 = this.A00;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            this.A00 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0097, code lost:
    
        if (r10 == (-1)) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository r23, X.C1R4 r24, X.C1R4 r25, X.InterfaceC23621Ds r26) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository.A00(com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository, X.1R4, X.1R4, X.1Ds):java.lang.Object");
    }
}
