package com.instagram.gallery.scanner;

import X.AbstractC195758lG;
import X.AbstractC23641Du;
import X.AnonymousClass001;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C12L;
import X.C14360o3;
import X.C18U;
import X.C19K;
import X.C206649Cv;
import X.C218914p;
import X.C40Y;
import X.C47945LFz;
import X.C60322pF;
import X.C60342pI;
import X.C60352pJ;
import X.C901940c;
import X.C902040d;
import X.InterfaceC12870lZ;
import X.InterfaceC13050lr;
import android.content.Context;
import android.os.Build;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class MediaScannerScheduler implements InterfaceC12870lZ, InterfaceC13050lr {
    public int A00;
    public final Context A01;
    public final UserSession A02;
    public final C60342pI A03;
    public final C60352pJ A04;
    public final C60322pF A05;
    public volatile boolean A06;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.2pI, java.lang.Object] */
    public /* synthetic */ MediaScannerScheduler(Context context, UserSession userSession, C60322pF c60322pF) {
        ?? obj = new Object();
        C60352pJ c60352pJ = new C60352pJ(userSession);
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = c60322pF;
        this.A03 = obj;
        this.A04 = c60352pJ;
    }

    private final void A00() {
        UserSession userSession = this.A02;
        C40Y A00 = C40Y.A00(this.A01, userSession);
        C14360o3.A0B(userSession, 0);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36317977169303291L);
        C901940c c901940c = new C901940c(MediaScannerJobService.class, R.id.media_scanner_job_scheduler_id);
        c901940c.A05 = true;
        c901940c.A00 = 1;
        c901940c.A02 = TimeUnit.MINUTES.toMillis(10L);
        c901940c.A09 = A06;
        c901940c.A08 = false;
        A00.A04(new C902040d(c901940c));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r3 = 25
            boolean r0 = X.MAH.A01(r7, r3)
            if (r0 == 0) goto L5a
            r5 = r7
            X.MAH r5 = (X.MAH) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L40
            if (r0 != r3) goto L60
            java.lang.Object r2 = r5.A01
            com.instagram.gallery.scanner.MediaScannerScheduler r2 = (com.instagram.gallery.scanner.MediaScannerScheduler) r2
            X.AbstractC09560e7.A00(r1)
        L29:
            com.instagram.common.session.UserSession r1 = r2.A02
            X.2pJ r0 = new X.2pJ
            r0.<init>(r1)
            boolean r0 = r0.A01()
            if (r0 == 0) goto L3d
            r2.A06 = r3
            r0 = 0
            r2.A03(r0, r4, r4)
        L3d:
            X.0eB r2 = X.C0eB.A00
        L3f:
            return r2
        L40:
            X.AbstractC09560e7.A00(r1)
            r6.A06 = r4
            r6.A00()
            boolean r0 = r6.A06
            if (r0 != 0) goto L3d
            r0 = 1000(0x3e8, double:4.94E-321)
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r0 = X.AbstractC89993zf.A01(r5, r0)
            if (r0 == r2) goto L3f
            r2 = r6
            goto L29
        L5a:
            X.MAH r5 = new X.MAH
            r5.<init>(r6, r7, r3)
            goto L16
        L60:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.gallery.scanner.MediaScannerScheduler.A01(X.1Ds):java.lang.Object");
    }

    public final void A02() {
        C19K A02 = AnonymousClass194.A02(C12L.A00.AOT(281480192, 3));
        C206649Cv c206649Cv = new C206649Cv(this, null, 23);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, A02);
    }

    public final void A03(long j, boolean z, boolean z2) {
        String A0c;
        C47945LFz c47945LFz = (C47945LFz) C47945LFz.A03.getValue();
        UserSession userSession = this.A02;
        if (AbstractC195758lG.A00(userSession) == C05F.A00) {
            A0c = "user permission for suggestions not granted.";
        } else {
            int i = this.A00;
            if (i >= 100) {
                A0c = AnonymousClass001.A0c("max scans per session reached: ", " - not scheduling another", i);
            } else {
                if (Build.VERSION.SDK_INT <= 29) {
                    return;
                }
                c47945LFz.A00("start scheduling.");
                A00();
                this.A00++;
                Context context = this.A01;
                C40Y A00 = C40Y.A00(context, userSession);
                C901940c c901940c = new C901940c(MediaScannerJobService.class, R.id.media_scanner_job_scheduler_id);
                c901940c.A05 = true;
                c901940c.A00 = 1;
                c901940c.A02 = TimeUnit.MINUTES.toMillis(j);
                c901940c.A09 = z2;
                c901940c.A08 = z;
                A00.A03(context, userSession, new C902040d(c901940c));
                return;
            }
        }
        c47945LFz.A00(A0c);
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        if (this.A06) {
            this.A06 = false;
            A00();
            C218914p.A06(this);
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-285417652);
        UserSession userSession = this.A02;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        A03(10L, C18U.A06(c06090Tz, userSession, 2342160986382341875L), C18U.A06(c06090Tz, userSession, 36317977169303291L));
        C0f9.A0A(1064604974, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-988515033);
        A00();
        C0f9.A0A(-339703130, A03);
    }
}
