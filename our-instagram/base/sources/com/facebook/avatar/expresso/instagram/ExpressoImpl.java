package com.facebook.avatar.expresso.instagram;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC18560vj;
import X.AbstractC23641Du;
import X.AbstractC43592JPx;
import X.AnonymousClass001;
import X.AnonymousClass057;
import X.AnonymousClass194;
import X.AnonymousClass197;
import X.C006802i;
import X.C05F;
import X.C06160Ug;
import X.C10M;
import X.C12L;
import X.C14360o3;
import X.C16360rh;
import X.C17050sx;
import X.C19K;
import X.C19L;
import X.C47953LGn;
import X.C57172PZq;
import X.C57261Pbj;
import X.C57289PcB;
import X.D52;
import X.InterfaceC06180Ui;
import X.InterfaceC09390do;
import X.InterfaceC15070pN;
import X.InterfaceC23621Ds;
import X.MSW;
import X.MWF;
import android.content.Context;
import com.facebook.avatar.expresso.odr.ODRController;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes9.dex */
public final class ExpressoImpl {
    public static final String A0B = AnonymousClass001.A0R("ODR_", "ExpressoImpl");
    public final QuickPerformanceLogger A00;
    public final UserSession A01;
    public final HashMap A02;
    public final ConcurrentLinkedQueue A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final C19L A08;
    public final InterfaceC06180Ui A09;
    public final InterfaceC15070pN A0A;

    public static final void A01(C47953LGn c47953LGn, ExpressoImpl expressoImpl) {
        if (expressoImpl.A04.compareAndSet(false, true)) {
            AbstractC18560vj.A03(expressoImpl.A08, MSW.A1I(new C57172PZq(expressoImpl, c47953LGn, (InterfaceC23621Ds) null, 35, 42), new C16360rh(new MWF(1, null), ((ODRController) expressoImpl.A07.getValue()).A0G)));
        }
        AbstractC23641Du.A05(new ExpressoImpl$getExceptionHandler$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key), new D52(expressoImpl, c47953LGn, (InterfaceC23621Ds) null, 48), expressoImpl.A08);
    }

    public final InterfaceC15070pN A02(C47953LGn c47953LGn) {
        C14360o3.A0B(c47953LGn, 0);
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        String str = c47953LGn.A00;
        int hashCode = str.hashCode();
        quickPerformanceLogger.markerStart(252645496, hashCode);
        quickPerformanceLogger.markerAnnotate(252645496, hashCode, "sticker_pack_name", str);
        if (this.A05.compareAndSet(false, true)) {
            A01(c47953LGn, this);
        } else {
            this.A03.add(c47953LGn);
        }
        return this.A0A;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.facebook.avatar.expresso.instagram.ExpressoImpl r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r3 = 22
            boolean r0 = X.MAN.A02(r9, r3)
            if (r0 == 0) goto L56
            r6 = r9
            X.MAN r6 = (X.MAN) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L31
            if (r0 != r4) goto L5c
            java.lang.Object r7 = r6.A01
            com.facebook.avatar.expresso.instagram.ExpressoImpl r7 = (com.facebook.avatar.expresso.instagram.ExpressoImpl) r7
            X.AbstractC09560e7.A00(r1)
        L28:
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.A05
            r0 = 0
            r1.set(r0)
            X.0eB r5 = X.C0eB.A00
            return r5
        L31:
            X.AbstractC09560e7.A00(r1)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r7.A03
            r0.clear()
            java.util.HashMap r1 = r7.A02
            java.lang.String r0 = "Timeout"
            r1.put(r8, r0)
            X.0Ui r3 = r7.A09
            java.lang.String r2 = "Sticker generation is taking more time"
            java.lang.Integer r1 = X.C05F.A00
            X.JuI r0 = new X.JuI
            r0.<init>(r2, r1)
            r6.A01 = r7
            r6.A00 = r4
            java.lang.Object r0 = r3.emit(r0, r6)
            if (r0 != r5) goto L28
            return r5
        L56:
            X.MAN r6 = new X.MAN
            r6.<init>(r7, r9, r3)
            goto L16
        L5c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.instagram.ExpressoImpl.A00(com.facebook.avatar.expresso.instagram.ExpressoImpl, java.lang.String, X.1Ds):java.lang.Object");
    }

    public ExpressoImpl(UserSession userSession, Context context) {
        C006802i A0N = AbstractC43592JPx.A0N();
        C19K A02 = AnonymousClass194.A02(new AnonymousClass197(null).plus(AbstractC43592JPx.A0W(C12L.A00, 637710289)));
        C17050sx A01 = AbstractC09440dt.A01(C57289PcB.A00);
        C17050sx A012 = AbstractC09440dt.A01(new C57261Pbj(7, context, A0N, userSession));
        this.A01 = userSession;
        this.A00 = A0N;
        this.A08 = A02;
        this.A03 = new ConcurrentLinkedQueue();
        this.A07 = A012;
        this.A06 = A01;
        this.A05 = new AtomicBoolean(false);
        this.A04 = new AtomicBoolean(false);
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 0);
        this.A09 = A00;
        this.A0A = new C06160Ug(null, A00);
        this.A02 = AbstractC166987dD.A1G();
    }
}
