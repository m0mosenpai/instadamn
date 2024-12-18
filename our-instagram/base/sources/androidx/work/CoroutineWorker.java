package androidx.work;

import X.AbstractC23641Du;
import X.AbstractC48352Kc;
import X.AnonymousClass190;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.AnonymousClass197;
import X.C05F;
import X.C12P;
import X.C12T;
import X.C14360o3;
import X.C19K;
import X.C206639Cu;
import X.C2LB;
import X.C49182Nr;
import X.C57172PZq;
import X.InterfaceC23621Ds;
import X.T8O;
import android.content.Context;
import androidx.work.CoroutineWorker;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes3.dex */
public abstract class CoroutineWorker extends AbstractC48352Kc {
    public final C49182Nr A00;
    public final C12T A01;
    public final AnonymousClass197 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.2Nr, X.2Nt] */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(workerParameters, 2);
        this.A02 = new AnonymousClass197(null);
        ?? obj = new Object();
        this.A00 = obj;
        obj.addListener(new Runnable() { // from class: X.5Or
            @Override // java.lang.Runnable
            public final void run() {
                CoroutineWorker coroutineWorker = CoroutineWorker.this;
                if (coroutineWorker.A00.isCancelled()) {
                    coroutineWorker.A02.AGH(null);
                }
            }
        }, ((C2LB) this.mWorkerParams.A07).A01);
        this.A01 = C12P.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.0Aj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A03(X.InterfaceC23621Ds r15) {
        /*
            r14 = this;
            r4 = r14
            com.instagram.security.attestation.keystore.worker.KeyAttestationWorker r4 = (com.instagram.security.attestation.keystore.worker.KeyAttestationWorker) r4
            r3 = 46
            boolean r0 = X.C9CY.A00(r15, r3)
            if (r0 == 0) goto Lcd
            r11 = r15
            X.9CY r11 = (X.C9CY) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lcd
            int r2 = r2 - r1
            r11.A00 = r2
        L19:
            java.lang.Object r1 = r11.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r11.A00
            r13 = 1
            if (r0 == 0) goto L42
            if (r0 != r13) goto Ld4
            java.lang.Object r6 = r11.A01
            X.0Aj r6 = (X.AbstractC02600Aj) r6
            X.AbstractC09560e7.A00(r1)
        L2b:
            X.9BR r1 = (X.C9BR) r1
            X.0Ai r0 = r6.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L38
            r6.Cht()
        L38:
            boolean r0 = r1.A02
            if (r0 == 0) goto L9f
            X.51A r2 = new X.51A
            r2.<init>()
            return r2
        L42:
            X.AbstractC09560e7.A00(r1)
            X.09Y r0 = X.C023409i.A0A     // Catch: java.lang.IllegalStateException -> Ldc
            com.instagram.common.session.UserSession r7 = r0.A08(r4)     // Catch: java.lang.IllegalStateException -> Ldc
            r5 = 0
            X.0kP r0 = new X.0kP
            r0.<init>(r7)
            X.0wW r3 = r0.A00()
            java.lang.String r1 = "ig_attest_keystore_background"
            X.0kM r0 = r3.A00
            X.0Ai r1 = r3.A00(r0, r1)
            r0 = 193(0xc1, float:2.7E-43)
            X.1Mh r6 = new X.1Mh
            r6.<init>(r1, r0)
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 2342160539704366419(0x2081069a00041553, double:4.063491945810231E-152)
            boolean r0 = X.C18U.A06(r3, r7, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            boolean r1 = X.C218914p.A08()
            if (r0 == 0) goto La5
            if (r1 != 0) goto La5
            X.0Ai r0 = r6.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L9f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            java.lang.String r0 = "requires_backgrounded"
            r6.A0O(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "is_backgrounded"
            r6.A0O(r0, r1)
            java.lang.String r1 = "app_not_backgrounded"
            java.lang.String r0 = "error_type"
            r6.A0R(r0, r1)
            r6.Cht()
        L9f:
            X.50g r2 = new X.50g
            r2.<init>()
            return r2
        La5:
            java.lang.String r0 = "requires_backgrounded"
            r6.A0O(r0, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "is_backgrounded"
            r6.A0O(r0, r1)
            android.content.Context r5 = r4.mAppContext
            X.C14360o3.A07(r5)
            X.0nZ r12 = r4.A00
            r8 = 0
            r11.A01 = r6
            r11.A00 = r13
            java.lang.String r9 = "AndroidKeyAttestationWorker"
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.Object r1 = com.instagram.security.attestation.keystore.worker.KeyAttestationUtils.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r1 != r2) goto L2b
            return r2
        Lcd:
            X.9CY r11 = new X.9CY
            r11.<init>(r4, r15, r3)
            goto L19
        Ld4:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Ldc:
            X.50g r2 = new X.50g
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.CoroutineWorker.A03(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.2Nr] */
    @Override // X.AbstractC48352Kc
    public final ListenableFuture getForegroundInfoAsync() {
        AnonymousClass197 anonymousClass197 = new AnonymousClass197(null);
        C19K A02 = AnonymousClass194.A02(AnonymousClass190.A02(this.A01, anonymousClass197));
        T8O t8o = new T8O(new Object(), anonymousClass197);
        AbstractC23641Du.A05(AnonymousClass191.A00, new C57172PZq(this, t8o, (InterfaceC23621Ds) null, 32, 42), A02);
        return t8o;
    }

    public Object A04(InterfaceC23621Ds interfaceC23621Ds) {
        throw new IllegalStateException("Not implemented");
    }

    @Override // X.AbstractC48352Kc
    public final void onStopped() {
        this.A00.cancel(false);
    }

    @Override // X.AbstractC48352Kc
    public final ListenableFuture startWork() {
        C19K A02 = AnonymousClass194.A02(AnonymousClass190.A02(this.A01, this.A02));
        C206639Cu c206639Cu = new C206639Cu(this, null, 3);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206639Cu, A02);
        return this.A00;
    }
}
