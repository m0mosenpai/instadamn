package com.facebook.videolite.instagram;

import X.AbstractC166987dD;
import X.C06090Tz;
import X.C18U;
import X.C47Z;
import X.InterfaceC23621Ds;
import X.InterfaceC70363Du;
import X.MQE;
import X.OXD;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;

/* loaded from: classes9.dex */
public final class VideoIngestionStep implements MQE {
    public Exception A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC70363Du A03;

    @Override // X.MQE
    public final Object F8t(OXD oxd, InterfaceC23621Ds interfaceC23621Ds) {
        return A00(this, oxd, interfaceC23621Ds);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A00(com.facebook.videolite.instagram.VideoIngestionStep r9, X.OXD r10, X.InterfaceC23621Ds r11) {
        /*
            r3 = 18
            boolean r0 = X.MAL.A01(r11, r3)
            if (r0 == 0) goto L2a
            r7 = r11
            X.MAL r7 = (X.MAL) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r0 = r7.A04
            X.1JX r8 = X.C1JX.A02
            int r3 = r7.A00
            r2 = 2
            r1 = 1
            r6 = 0
            if (r3 == 0) goto L41
            if (r3 == r1) goto L35
            if (r3 != r2) goto L30
            java.lang.Object r5 = r7.A01
            X.139 r5 = (X.AnonymousClass139) r5
            goto L6e
        L2a:
            X.MAL r7 = new X.MAL
            r7.<init>(r9, r11, r3)
            goto L16
        L30:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L35:
            java.lang.Object r5 = r7.A03
            X.139 r5 = (X.AnonymousClass139) r5
            java.lang.Object r10 = r7.A02
            java.lang.Object r9 = r7.A01
            X.AbstractC09560e7.A00(r0)
            goto L50
        L41:
            X.AbstractC09560e7.A00(r0)
            X.139 r5 = X.O0J.A00
            X.AbstractC25235BEs.A1J(r9, r10, r5, r7, r1)
            java.lang.Object r0 = X.AnonymousClass139.A00(r7, r5)
            if (r0 != r8) goto L50
            return r8
        L50:
            r0 = 25
            X.Pg7 r4 = new X.Pg7     // Catch: java.lang.Throwable -> L77
            r4.<init>(r0, r10, r9)     // Catch: java.lang.Throwable -> L77
            X.MSW.A1Z(r5, r7)     // Catch: java.lang.Throwable -> L77
            r7.A00 = r2     // Catch: java.lang.Throwable -> L77
            X.191 r3 = X.AnonymousClass191.A00     // Catch: java.lang.Throwable -> L77
            r2 = 30
            r1 = 42
            X.PYx r0 = new X.PYx     // Catch: java.lang.Throwable -> L77
            r0.<init>(r4, r6, r2, r1)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r0 = X.AbstractC23641Du.A00(r7, r3, r0)     // Catch: java.lang.Throwable -> L77
            if (r0 != r8) goto L71
            return r8
        L6e:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> L79
        L71:
            X.O3s r0 = (X.AbstractC54438O3s) r0     // Catch: java.lang.Throwable -> L79
            r5.A04(r6)
            return r0
        L77:
            r0 = move-exception
            goto L7a
        L79:
            r0 = move-exception
        L7a:
            r5.A04(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.videolite.instagram.VideoIngestionStep.A00(com.facebook.videolite.instagram.VideoIngestionStep, X.OXD, X.1Ds):java.lang.Object");
    }

    public static final String A01(C47Z c47z) {
        ClipInfo clipInfo = c47z.A1N;
        String str = clipInfo.A0F;
        String str2 = clipInfo.A0D;
        if (clipInfo.A0M) {
            if (str2 != null) {
                return str2;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (str == null) {
            throw AbstractC166987dD.A14("Required value was null.");
        }
        return str;
    }

    public static final boolean A02(UserSession userSession, C47Z c47z) {
        if (c47z.A6C || (c47z.A0D() == ShareType.A0E && C18U.A06(C06090Tz.A05, userSession, 36314167533373929L))) {
            return true;
        }
        return false;
    }

    @Override // X.MQE
    public final String getName() {
        return "VideoIngestionStep";
    }

    public VideoIngestionStep(Context context, UserSession userSession, InterfaceC70363Du interfaceC70363Du) {
        this.A02 = userSession;
        this.A01 = context;
        this.A03 = interfaceC70363Du;
    }

    public static final boolean A03(C47Z c47z) {
        FilterGroupModel filterGroupModel;
        if (c47z.A0D() == ShareType.A0b && (filterGroupModel = c47z.A1D) != null && ((FilterGroupModelImpl) filterGroupModel).A04) {
            return true;
        }
        return false;
    }
}
