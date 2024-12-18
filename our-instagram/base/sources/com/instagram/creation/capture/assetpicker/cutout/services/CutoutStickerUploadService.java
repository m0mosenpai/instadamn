package com.instagram.creation.capture.assetpicker.cutout.services;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25651Mw;
import X.C14360o3;
import X.C47Z;
import X.EnumC915447k;
import X.InterfaceC53852dP;
import X.LYN;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.EnumSet;
import java.util.List;

/* loaded from: classes8.dex */
public final class CutoutStickerUploadService implements InterfaceC53852dP {
    public final UserSession A00;
    public final List A01;
    public final Context A02;

    @Override // X.InterfaceC53852dP
    public final void DHI(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        if (!EnumSet.of(EnumC915447k.A09, EnumC915447k.A02).contains(c47z.A1f)) {
            AbstractC25651Mw.A00(this.A00).E4s(new LYN(c47z.A1C, null, "upload failed"));
        }
    }

    @Override // X.InterfaceC53852dP
    public final /* synthetic */ void DSR(C47Z c47z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, X.1tl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(android.graphics.Bitmap r11, X.C40121td r12, java.lang.String r13, java.lang.String r14, X.InterfaceC23621Ds r15) {
        /*
            r10 = this;
            r3 = 29
            boolean r0 = X.MAL.A01(r15, r3)
            r8 = r10
            if (r0 == 0) goto L8b
            r5 = r15
            X.MAL r5 = (X.MAL) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8b
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r1 = r5.A04
            X.1JX r2 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L2a
            if (r0 != r4) goto L91
            X.AbstractC09560e7.A00(r1)
        L25:
            X.0e6 r1 = (X.C09550e6) r1
            java.lang.Object r0 = r1.A00
            return r0
        L2a:
            X.AbstractC09560e7.A00(r1)
            X.47Z r6 = X.AbstractC209399Nx.A01(r14)
            java.lang.String r0 = X.AbstractC917048o.A02(r11)
            r6.A33 = r0
            r6.A3h = r13
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0D
            r6.A0c(r0)
            r0 = 6
            r6.A0N = r0
            com.instagram.common.session.UserSession r3 = r10.A00
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.C25A.A00(r3)
            java.lang.String r0 = r6.A35
            r1.A0D(r6, r0)
            com.instagram.pendingmedia.store.PendingMediaStoreSerializer r0 = X.AnonymousClass257.A00(r3)
            r0.A04()
            r9 = r12
            X.AbstractC25235BEs.A1J(r10, r12, r6, r5, r4)
            X.3yw r7 = X.JQ0.A0r(r5)
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.C25A.A00(r3)
            android.content.Context r0 = r10.A02
            r1.A0B(r0)
            r5 = 0
            X.LYV r4 = new X.LYV
            r4.<init>(r5, r6, r7, r8, r9)
            X.1My r1 = X.AbstractC25651Mw.A00(r3)
            java.lang.Class<X.LYN> r0 = X.LYN.class
            r1.A01(r4, r0)
            java.util.List r0 = r10.A01
            r0.add(r4)
            r12.A0H(r10)
            X.1tj r1 = new X.1tj
            r1.<init>()
            r0 = 0
            r12.A0E(r6, r1, r0)
            java.lang.Object r1 = r7.A00()
            if (r1 != r2) goto L25
            return r2
        L8b:
            X.MAL r5 = new X.MAL
            r5.<init>(r10, r15, r3)
            goto L17
        L91:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.assetpicker.cutout.services.CutoutStickerUploadService.A00(android.graphics.Bitmap, X.1td, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public CutoutStickerUploadService(UserSession userSession, Context context) {
        AbstractC167017dG.A1P(userSession, context);
        this.A00 = userSession;
        this.A02 = context;
        this.A01 = AbstractC166987dD.A1E();
    }
}
