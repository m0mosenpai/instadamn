package com.instagram.nux.aymh.responsehandlers;

import X.AbstractC166987dD;
import X.AnonymousClass001;
import X.C14360o3;
import X.C36560GAk;
import X.InterfaceC58057Poi;
import X.OAZ;
import X.OKH;
import X.OLh;
import X.PZP;
import java.util.Map;

/* loaded from: classes9.dex */
public final class HandlerExecutorAndBuilder {
    public OLh A00;
    public OAZ A01;
    public OAZ A02;
    public OAZ A03;
    public final OKH A07 = new OKH(this);
    public final Map A04 = AbstractC166987dD.A1I();
    public final Map A05 = AbstractC166987dD.A1I();
    public final Map A06 = AbstractC166987dD.A1I();

    public final void A03(InterfaceC58057Poi interfaceC58057Poi) {
        C14360o3.A0B(interfaceC58057Poi, 0);
        A00(new OAZ(new C36560GAk(new PZP(this, interfaceC58057Poi, null, 48))), this);
    }

    public static final void A00(OAZ oaz, HandlerExecutorAndBuilder handlerExecutorAndBuilder) {
        if (handlerExecutorAndBuilder.A02 == null) {
            handlerExecutorAndBuilder.A02 = oaz;
        } else {
            OAZ oaz2 = handlerExecutorAndBuilder.A01;
            if (oaz2 != null) {
                oaz2.A00 = oaz;
            }
        }
        handlerExecutorAndBuilder.A01 = oaz;
        handlerExecutorAndBuilder.A03 = oaz;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0070 -> B:10:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r9) {
        /*
            r8 = this;
            r3 = 11
            boolean r0 = X.PXA.A03(r9, r3)
            if (r0 == 0) goto L80
            r4 = r9
            X.PXA r4 = (X.PXA) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A03
            X.1JX r5 = X.C1JX.A02
            int r1 = r4.A00
            r3 = 1
            if (r1 == 0) goto L73
            if (r1 != r3) goto L88
            java.lang.Object r2 = r4.A02
            X.0ps r2 = (X.C15370ps) r2
            java.lang.Object r6 = r4.A01
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r6 = (com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder) r6
            X.AbstractC09560e7.A00(r0)
        L2c:
            if (r0 == 0) goto L37
            java.util.Map r7 = r6.A06
            X.0YZ r1 = X.AbstractC25229BEm.A0r(r0)
            r7.put(r1, r0)
        L37:
            java.lang.Object r1 = r2.A00
            X.OAZ r1 = (X.OAZ) r1
            X.OLh r1 = r1.A01
            if (r1 == 0) goto L53
            r1.A01 = r3
            r1.A00 = r0
            java.lang.String r7 = r1.A02
            java.util.Map r1 = r6.A05
            java.lang.Object r1 = r1.get(r7)
            X.OLh r1 = (X.OLh) r1
            if (r1 == 0) goto L53
            r1.A01 = r3
            r1.A00 = r0
        L53:
            java.lang.Object r0 = r2.A00
            X.OAZ r0 = (X.OAZ) r0
            X.OAZ r0 = r0.A00
            r2.A00 = r0
        L5b:
            java.lang.Object r0 = r2.A00
            if (r0 == 0) goto L85
            java.lang.Object r0 = r2.A00
            X.OAZ r0 = (X.OAZ) r0
            X.GAk r0 = r0.A02
            X.OKH r1 = r6.A07
            X.PXA.A01(r6, r2, r4, r3)
            X.0sF r0 = r0.A01
            java.lang.Object r0 = r0.invoke(r1, r4)
            if (r0 != r5) goto L2c
            return r5
        L73:
            X.AbstractC09560e7.A00(r0)
            X.0ps r2 = X.AbstractC25225BEi.A1F()
            X.OAZ r0 = r8.A02
            r2.A00 = r0
            r6 = r8
            goto L5b
        L80:
            X.PXA r4 = X.PXA.A00(r8, r9, r3)
            goto L16
        L85:
            X.OKH r0 = r6.A07
            return r0
        L88:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder.A01(X.1Ds):java.lang.Object");
    }

    public final void A02(InterfaceC58057Poi interfaceC58057Poi) {
        C36560GAk c36560GAk = new C36560GAk(interfaceC58057Poi.AYV());
        String Bot = interfaceC58057Poi.Bot();
        c36560GAk.A00 = Bot;
        OAZ oaz = new OAZ(c36560GAk);
        OLh oLh = oaz.A01;
        if (oLh != null && Bot != null) {
            Map map = this.A05;
            if (map.get(Bot) == null) {
                map.put(Bot, oLh);
            } else {
                throw AbstractC166987dD.A14(AnonymousClass001.A0g("Action result named '", Bot, "' already defined"));
            }
        }
        A00(oaz, this);
    }
}
