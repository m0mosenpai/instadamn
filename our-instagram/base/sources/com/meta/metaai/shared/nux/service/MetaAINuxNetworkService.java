package com.meta.metaai.shared.nux.service;

import X.AbstractC28057CYl;
import X.AbstractC40691uc;
import X.B4Z;
import X.C14360o3;
import X.C40701ud;
import X.EnumC27387C6q;
import X.InterfaceC40711ue;
import android.app.Application;
import com.meta.foa.session.FoaUserSession;

/* loaded from: classes5.dex */
public final class MetaAINuxNetworkService {
    public final Application A00;
    public final InterfaceC40711ue A01;
    public final FoaUserSession A02;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.EnumC27387C6q r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 24
            boolean r0 = X.C29631D3m.A03(r10, r3)
            if (r0 == 0) goto L5f
            r7 = r10
            X.D3m r7 = (X.C29631D3m) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r1 = r7.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L35
            if (r0 != r5) goto L79
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L64
            java.lang.Object r0 = X.AbstractC25231BEo.A0n(r1)
            if (r0 == 0) goto L6d
            X.3NX r6 = X.AbstractC25225BEi.A0z(r0)
            return r6
        L35:
            X.AbstractC09560e7.A00(r1)
            X.1ue r4 = r8.A01
            java.lang.Class<X.CX4> r0 = X.CX4.class
            java.lang.Object r3 = X.AbstractC25234BEr.A0d(r0)     // Catch: java.lang.Throwable -> L7e
            X.CpW r3 = (X.C28922CpW) r3     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = A00(r9)
            X.2JM r1 = r3.A00
            java.lang.String r0 = "intent_card_type"
            r1.A04(r0, r2)
            r3.A02 = r5
            X.1Dk r0 = r3.A00()
            X.C14360o3.A07(r0)
            r7.A00 = r5
            java.lang.Object r1 = X.CL2.A00(r4, r0, r7)
            if (r1 != r6) goto L24
            return r6
        L5f:
            X.D3m r7 = X.C29631D3m.A00(r8, r10, r3)
            goto L16
        L64:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L74
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r0 = r1.A00
            goto L6e
        L6d:
            r0 = 0
        L6e:
            X.8jk r6 = new X.8jk
            r6.<init>(r0)
            return r6
        L74:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L79:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L7e:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.shared.nux.service.MetaAINuxNetworkService.A01(X.C6q, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ MetaAINuxNetworkService(Application application, FoaUserSession foaUserSession) {
        C40701ud A01 = AbstractC40691uc.A01(AbstractC28057CYl.A00(foaUserSession));
        C14360o3.A0B(A01, 3);
        this.A00 = application;
        this.A02 = foaUserSession;
        this.A01 = A01;
    }

    public static final String A00(EnumC27387C6q enumC27387C6q) {
        int ordinal = enumC27387C6q.ordinal();
        if (ordinal != 0) {
            if (ordinal != 3) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return "WRITE_WITH_AI_MMLLM";
                    }
                    throw B4Z.A00();
                }
                return "WRITE_WITH_AI";
            }
            return "EDIT_WITH_AI";
        }
        return "IMAGINE";
    }
}
