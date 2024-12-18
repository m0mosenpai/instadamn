package com.instagram.pendingmedia.service.impl;

import X.AbstractC09440dt;
import X.AbstractC167007dF;
import X.AbstractC31177DnL;
import X.AbstractC55111ObU;
import X.AnonymousClass194;
import X.C14360o3;
import X.C48532Kv;
import X.DGZ;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC23621Ds;
import X.L59;
import X.MCR;
import X.MVD;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.instagram.pendingmedia.model.constants.ShareType;

/* loaded from: classes8.dex */
public final class PendingMediaWorker extends CoroutineWorker {
    public final Context A00;
    public final L59 A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingMediaWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        ShareType shareType;
        AbstractC167007dF.A1D(context, 1, workerParameters);
        this.A00 = context;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new DGZ(this, 11));
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new DGZ(this, 10));
        C48532Kv c48532Kv = this.mWorkerParams.A02;
        C14360o3.A07(c48532Kv);
        int A04 = AbstractC31177DnL.A04(c48532Kv.A03("PENDING_MEDIA_KEY"));
        String A03 = this.mWorkerParams.A02.A03("PENDING_SHARE_TYPE_KEY");
        if (A03 != null) {
            shareType = ShareType.valueOf(A03);
        } else {
            shareType = null;
        }
        this.A01 = new L59(null, null, null, null, A04, AbstractC55111ObU.A03(shareType), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        if (r1 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1114250g A00(X.C45107Jxb r9, com.instagram.pendingmedia.service.impl.PendingMediaWorker r10, java.lang.String r11, java.lang.Throwable r12) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.PendingMediaWorker.A00(X.Jxb, com.instagram.pendingmedia.service.impl.PendingMediaWorker, java.lang.String, java.lang.Throwable):X.50g");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C47Z r11, com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor r12, com.instagram.pendingmedia.service.impl.PendingMediaWorker r13, java.lang.String r14, X.InterfaceC23621Ds r15) {
        /*
            r6 = r11
            r3 = 16
            r5 = r15
            boolean r0 = X.PXA.A03(r15, r3)
            if (r0 == 0) goto L2c
            r4 = r5
            X.PXA r4 = (X.PXA) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r0 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L3b
            if (r2 != r1) goto L36
            java.lang.Object r12 = r4.A02
            com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor r12 = (com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor) r12
            java.lang.Object r6 = r4.A01
            X.47Z r6 = (X.C47Z) r6
            goto L32
        L2c:
            X.PXA r4 = new X.PXA
            r4.<init>(r13, r15, r3)
            goto L18
        L32:
            X.AbstractC09560e7.A00(r0)     // Catch: java.util.concurrent.CancellationException -> L5e
            return r0
        L36:
            java.lang.IllegalStateException r2 = X.AbstractC166987dD.A13()
            throw r2
        L3b:
            X.AbstractC09560e7.A00(r0)
            r9 = 0
            r10 = 2
            X.3Pr r8 = new X.3Pr     // Catch: java.util.concurrent.CancellationException -> L5e
            r8.<init>()     // Catch: java.util.concurrent.CancellationException -> L5e
            r11 = 0
            X.KYx r5 = new X.KYx     // Catch: java.util.concurrent.CancellationException -> L5e
            r7 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L5e
            X.3Pr r0 = r12.A00(r5)     // Catch: java.util.concurrent.CancellationException -> L5e
            r4.A01 = r6     // Catch: java.util.concurrent.CancellationException -> L5e
            r4.A02 = r12     // Catch: java.util.concurrent.CancellationException -> L5e
            r4.A00 = r1     // Catch: java.util.concurrent.CancellationException -> L5e
            java.lang.Object r0 = r0.A0E(r4)     // Catch: java.util.concurrent.CancellationException -> L5e
            if (r0 != r3) goto L5d
            return r3
        L5d:
            return r0
        L5e:
            r2 = move-exception
            java.lang.String r0 = r6.A35
            X.KYw r1 = new X.KYw
            r1.<init>(r0)
            X.1Iq r0 = r12.A0D
            X.AbstractC129685tX.A00(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.PendingMediaWorker.A01(X.47Z, com.instagram.pendingmedia.service.impl.ConcurrentUploadQueueProcessor, com.instagram.pendingmedia.service.impl.PendingMediaWorker, java.lang.String, X.1Ds):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object A03(InterfaceC23621Ds interfaceC23621Ds) {
        return AnonymousClass194.A00(interfaceC23621Ds, new MCR(this, null, 23));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(1:(6:15|16|17|(1:19)|20|21)(2:12|13))(11:22|23|24|(2:32|33)(2:26|(7:28|(1:30)|16|17|(0)|20|21))|31|(0)|16|17|(0)|20|21))(7:41|42|43|17|(0)|20|21))(2:44|(7:46|(1:48)|43|17|(0)|20|21)(11:49|(1:51)|24|(0)(0)|31|(0)|16|17|(0)|20|21))))|54|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00be, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bf, code lost:
    
        r0 = new X.C09540e5(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:15:0x00b8, B:16:0x00bb, B:23:0x0069, B:24:0x006c, B:33:0x007d, B:31:0x00b3, B:26:0x008a, B:36:0x0082, B:39:0x0089, B:42:0x0051, B:43:0x0054, B:46:0x0046, B:49:0x005e), top: B:7:0x001f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.pendingmedia.service.impl.PendingMediaWorker r7, X.InterfaceC23621Ds r8, boolean r9) {
        /*
            r3 = 26
            boolean r0 = X.C57145PWx.A02(r8, r3)
            if (r0 == 0) goto L29
            r6 = r8
            X.PWx r6 = (X.C57145PWx) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r5 = r6.A02
            X.1JX r4 = X.C1JX.A02
            int r3 = r6.A00
            r2 = 3
            r0 = 2
            r1 = 1
            if (r3 == 0) goto L41
            if (r3 == r1) goto L3c
            if (r3 == r0) goto L37
            if (r3 != r2) goto L2f
            goto Lb8
        L29:
            X.PWx r6 = new X.PWx
            r6.<init>(r7, r8, r3)
            goto L16
        L2f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L37:
            java.lang.Object r7 = r6.A01
            X.2Kc r7 = (X.AbstractC48352Kc) r7
            goto L69
        L3c:
            java.lang.Object r7 = r6.A01
            X.2Kc r7 = (X.AbstractC48352Kc) r7
            goto L51
        L41:
            X.AbstractC09560e7.A00(r5)
            if (r9 == 0) goto L5e
            r6.A01 = r7     // Catch: java.lang.Throwable -> Lbe
            r6.A00 = r1     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r5 = r7.A04(r6)     // Catch: java.lang.Throwable -> Lbe
            if (r5 != r4) goto L54
            return r4
        L51:
            X.AbstractC09560e7.A00(r5)     // Catch: java.lang.Throwable -> Lbe
        L54:
            X.Q0Z r5 = (X.Q0Z) r5     // Catch: java.lang.Throwable -> Lbe
            com.google.common.util.concurrent.ListenableFuture r0 = r7.setForegroundAsync(r5)     // Catch: java.lang.Throwable -> Lbe
            X.C14360o3.A0A(r0)     // Catch: java.lang.Throwable -> Lbe
            goto Lc4
        L5e:
            r6.A01 = r7     // Catch: java.lang.Throwable -> Lbe
            r6.A00 = r0     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r5 = r7.A04(r6)     // Catch: java.lang.Throwable -> Lbe
            if (r5 != r4) goto L6c
            return r4
        L69:
            X.AbstractC09560e7.A00(r5)     // Catch: java.lang.Throwable -> Lbe
        L6c:
            X.Q0Z r5 = (X.Q0Z) r5     // Catch: java.lang.Throwable -> Lbe
            r0 = 0
            r6.A01 = r0     // Catch: java.lang.Throwable -> Lbe
            r6.A00 = r2     // Catch: java.lang.Throwable -> Lbe
            com.google.common.util.concurrent.ListenableFuture r3 = r7.setForegroundAsync(r5)     // Catch: java.lang.Throwable -> Lbe
            boolean r0 = r3.isDone()     // Catch: java.lang.Throwable -> Lbe
            if (r0 == 0) goto L8a
            r3.get()     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.Throwable -> Lbe
            goto Lb3
        L81:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()     // Catch: java.lang.Throwable -> Lbe
            if (r0 != 0) goto L89
            r0 = r1
        L89:
            throw r0     // Catch: java.lang.Throwable -> Lbe
        L8a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C24891Jo.A02     // Catch: java.lang.Throwable -> Lbe
            X.1Ds r0 = X.C1E2.A02(r6)     // Catch: java.lang.Throwable -> Lbe
            X.1Jo r2 = new X.1Jo     // Catch: java.lang.Throwable -> Lbe
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> Lbe
            r2.A0I()     // Catch: java.lang.Throwable -> Lbe
            X.JiG r1 = new X.JiG     // Catch: java.lang.Throwable -> Lbe
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> Lbe
            X.JiH r0 = X.EnumC44324JiH.A01     // Catch: java.lang.Throwable -> Lbe
            r3.addListener(r1, r0)     // Catch: java.lang.Throwable -> Lbe
            r1 = 14
            X.9Ee r0 = new X.9Ee     // Catch: java.lang.Throwable -> Lbe
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> Lbe
            r2.CPA(r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r0 = r2.A0E()     // Catch: java.lang.Throwable -> Lbe
            if (r0 != r4) goto Lb3
            goto Lb5
        Lb3:
            X.0eB r0 = X.C0eB.A00     // Catch: java.lang.Throwable -> Lbe
        Lb5:
            if (r0 != r4) goto Lbb
            return r4
        Lb8:
            X.AbstractC09560e7.A00(r5)     // Catch: java.lang.Throwable -> Lbe
        Lbb:
            X.0eB r0 = X.C0eB.A00     // Catch: java.lang.Throwable -> Lbe
            goto Lc4
        Lbe:
            r1 = move-exception
            X.0e5 r0 = new X.0e5
            r0.<init>(r1)
        Lc4:
            java.lang.Throwable r2 = X.C09550e6.A00(r0)
            if (r2 == 0) goto Ld1
            java.lang.String r1 = "PendingMediaWorker"
            java.lang.String r0 = "setForeground failure"
            X.C0K8.A0F(r1, r0, r2)
        Ld1:
            X.0eB r4 = X.C0eB.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.PendingMediaWorker.A02(com.instagram.pendingmedia.service.impl.PendingMediaWorker, X.1Ds, boolean):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object A04(InterfaceC23621Ds interfaceC23621Ds) {
        MVD mvd = MVD.A00;
        Context context = this.mAppContext;
        C14360o3.A07(context);
        L59 l59 = this.A01;
        this.A02.getValue();
        return mvd.A01(context, l59);
    }
}
