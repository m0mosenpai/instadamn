package com.instagram.direct.securityalert.data;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC43594JPz;
import X.AnonymousClass139;
import X.C44182Jfl;
import X.C46083Kah;
import X.C4A7;
import X.C4A8;
import X.PYc;
import java.util.List;

/* loaded from: classes8.dex */
public final class SecurityAlertRepository extends C4A7 {
    public static final C44182Jfl A04 = new Object();
    public static final List A05 = AbstractC43594JPz.A11(1520, 1519);
    public boolean A00;
    public final C46083Kah A01;
    public final SecurityAlertLocalDataSource A02;
    public final AnonymousClass139 A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0167 A[LOOP:2: B:43:0x0161->B:45:0x0167, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019d A[LOOP:3: B:48:0x0197->B:50:0x019d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b7 A[LOOP:4: B:53:0x01b1->B:55:0x01b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r24) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.securityalert.data.SecurityAlertRepository.A00(X.1Ds):java.lang.Object");
    }

    public final void A01(String str) {
        AbstractC166987dD.A1Z(new PYc(this, str, null, 39), super.A01);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityAlertRepository(C46083Kah c46083Kah, SecurityAlertLocalDataSource securityAlertLocalDataSource) {
        super("SecurityAlertFeed", C4A8.A00(92144098));
        AbstractC167017dG.A1P(securityAlertLocalDataSource, c46083Kah);
        this.A02 = securityAlertLocalDataSource;
        this.A01 = c46083Kah;
        this.A03 = new AnonymousClass139();
    }
}
