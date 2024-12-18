package com.instagram.creation.capture.quickcapture.inspirationhub.network;

import X.AbstractC191488e4;
import X.AnonymousClass057;
import X.C05F;
import X.C10M;
import X.C14360o3;
import X.C191498e5;
import X.C23031Ai;
import X.InterfaceC06180Ui;
import X.InterfaceC15070pN;
import android.util.LruCache;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class InspirationHubRepository {
    public final LruCache A00;
    public final InspirationHubNetworkDataSource A01;
    public final HashMap A02;
    public final HashMap A03;
    public final InterfaceC06180Ui A04;
    public final InterfaceC15070pN A05;
    public final InterfaceC15070pN A06;
    public final InterfaceC15070pN A07;
    public final UserSession A08;
    public final C23031Ai A09;
    public final InterfaceC06180Ui A0A;
    public final InterfaceC06180Ui A0B;

    public InspirationHubRepository(UserSession userSession, InspirationHubNetworkDataSource inspirationHubNetworkDataSource, C23031Ai c23031Ai) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c23031Ai, 2);
        this.A08 = userSession;
        this.A09 = c23031Ai;
        this.A01 = inspirationHubNetworkDataSource;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 0, 0);
        this.A04 = A00;
        AnonymousClass057 A002 = C10M.A00(num, 0, 0);
        this.A0B = A002;
        AnonymousClass057 A003 = C10M.A00(num, 0, 0);
        this.A0A = A003;
        C191498e5 A0B = c23031Ai.A0B();
        this.A00 = A0B == null ? AbstractC191488e4.A00() : A0B;
        this.A05 = A003;
        this.A07 = A00;
        this.A06 = A002;
        this.A03 = new HashMap();
        this.A02 = new HashMap();
    }

    public static final boolean A02(Medium medium) {
        return medium != null && medium.A06() && new File(medium.A0X).exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository r13, java.lang.String r14, java.util.List r15, X.InterfaceC23621Ds r16) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository.A00(com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository, java.lang.String, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository r13, java.util.List r14, X.InterfaceC23621Ds r15) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository.A01(com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 9
            boolean r0 = X.C206459Cc.A00(r7, r3)
            if (r0 == 0) goto L56
            r4 = r7
            X.9Cc r4 = (X.C206459Cc) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L38
            if (r2 != r1) goto L5c
            java.lang.Object r6 = r4.A02
            java.lang.Object r2 = r4.A01
            com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository r2 = (com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository) r2
            X.AbstractC09560e7.A00(r0)
        L2a:
            if (r0 == 0) goto L31
            java.util.HashMap r1 = r2.A02
            r1.put(r6, r0)
        L31:
            java.util.HashMap r0 = r2.A02
            java.lang.Object r0 = r0.get(r6)
            return r0
        L38:
            X.AbstractC09560e7.A00(r0)
            java.util.HashMap r0 = r5.A02
            java.lang.Object r0 = r0.get(r6)
            if (r0 != 0) goto L54
            r4.A01 = r5
            r4.A02 = r6
            r4.A00 = r1
            com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubNetworkDataSource r0 = r5.A01
            java.lang.Object r0 = r0.A00(r6, r4)
            if (r0 != r3) goto L52
            return r3
        L52:
            r2 = r5
            goto L2a
        L54:
            r2 = r5
            goto L31
        L56:
            X.9Cc r4 = new X.9Cc
            r4.<init>(r5, r7, r3)
            goto L16
        L5c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository.A03(java.lang.String, X.1Ds):java.lang.Object");
    }
}
