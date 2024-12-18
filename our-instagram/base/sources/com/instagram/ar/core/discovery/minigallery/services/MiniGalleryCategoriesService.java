package com.instagram.ar.core.discovery.minigallery.services;

import X.C14360o3;
import android.content.Context;
import com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class MiniGalleryCategoriesService {
    public final long A00;
    public final Context A01;
    public final MiniGalleryCategoriesRepository A02;
    public final UserSession A03;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService r6, X.AnonymousClass859 r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 7
            boolean r0 = X.C9CW.A00(r8, r3)
            if (r0 == 0) goto L45
            r5 = r8
            X.9CW r5 = (X.C9CW) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 != r3) goto L53
            X.AbstractC09560e7.A00(r1)
        L23:
            X.7mr r1 = (X.C172807mr) r1
            java.util.List r0 = r1.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4d
            X.9er r0 = X.C214539er.A00
            X.8jk r4 = new X.8jk
            r4.<init>(r0)
            return r4
        L35:
            X.AbstractC09560e7.A00(r1)
            com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository r2 = r6.A02
            long r0 = r6.A00
            r5.A00 = r3
            java.lang.Object r1 = r2.A00(r7, r5, r0)
            if (r1 != r4) goto L23
            return r4
        L45:
            r0 = 42
            X.9CW r5 = new X.9CW
            r5.<init>(r6, r8, r3, r0)
            goto L15
        L4d:
            X.3NX r4 = new X.3NX
            r4.<init>(r1)
            return r4
        L53:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService.A00(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService, X.859, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ MiniGalleryCategoriesService(Context context, UserSession userSession) {
        MiniGalleryCategoriesRepository miniGalleryCategoriesRepository = new MiniGalleryCategoriesRepository(userSession);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 2);
        this.A03 = userSession;
        this.A01 = context;
        this.A02 = miniGalleryCategoriesRepository;
        this.A00 = TimeUnit.DAYS.toMillis(90L);
    }
}
