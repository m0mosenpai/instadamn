package com.instagram.igtv.draft.model;

import X.C51649Mrg;
import X.InterfaceC13000lm;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.InterfaceC58196Pr2;
import X.MSX;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class IGTVDraftsRepository implements InterfaceC58196Pr2, InterfaceC13000lm {
    public Map A00 = new ConcurrentHashMap();
    public final InterfaceC58196Pr2 A01;

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.InterfaceC58196Pr2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AOd(int r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r5 = 2
            boolean r0 = X.C57137PWp.A00(r8, r5)
            if (r0 == 0) goto L5b
            r4 = r8
            X.PWp r4 = (X.C57137PWp) r4
            int r2 = r4.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r4.A01 = r2
        L15:
            java.lang.Object r0 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r2 = r4.A01
            r1 = 1
            if (r2 == 0) goto L32
            if (r2 == r1) goto L28
            if (r2 != r5) goto L61
            X.AbstractC09560e7.A00(r0)
        L25:
            X.0eB r3 = X.C0eB.A00
        L27:
            return r3
        L28:
            int r7 = r4.A00
            java.lang.Object r1 = r4.A02
            com.instagram.igtv.draft.model.IGTVDraftsRepository r1 = (com.instagram.igtv.draft.model.IGTVDraftsRepository) r1
            X.AbstractC09560e7.A00(r0)
            goto L44
        L32:
            X.AbstractC09560e7.A00(r0)
            r4.A02 = r6
            r4.A00 = r7
            r4.A01 = r1
            X.Pr2 r0 = r6.A01
            java.lang.Object r0 = r0.AsI(r7, r4)
            if (r0 == r3) goto L27
            r1 = r6
        L44:
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r0 = X.AbstractC166987dD.A11(r0)
            r0.delete()
            X.Pr2 r1 = r1.A01
            r0 = 0
            r4.A02 = r0
            r4.A01 = r5
            java.lang.Object r0 = r1.AOd(r7, r4)
            if (r0 != r3) goto L25
            return r3
        L5b:
            X.PWp r4 = new X.PWp
            r4.<init>(r6, r8, r5)
            goto L15
        L61:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.draft.model.IGTVDraftsRepository.AOd(int, X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC58196Pr2
    public final Object FBG(InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        return MSX.A0b(this.A01.FBG(interfaceC23621Ds, i, true));
    }

    @Override // X.InterfaceC58196Pr2
    public final Object A8J(C51649Mrg c51649Mrg, InterfaceC23621Ds interfaceC23621Ds) {
        return MSX.A0b(this.A01.A8J(c51649Mrg, interfaceC23621Ds));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[LOOP:0: B:18:0x0049->B:20:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // X.InterfaceC58196Pr2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AOe(java.util.List r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 40
            boolean r0 = X.MAK.A01(r8, r3)
            if (r0 == 0) goto L6b
            r5 = r8
            X.MAK r5 = (X.MAK) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r2 = r5.A00
            r3 = 2
            r1 = 1
            if (r2 == 0) goto L36
            if (r2 == r1) goto L2a
            if (r2 != r3) goto L71
            X.AbstractC09560e7.A00(r0)
        L27:
            X.0eB r4 = X.C0eB.A00
        L29:
            return r4
        L2a:
            java.lang.Object r7 = r5.A02
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r5.A01
            com.instagram.igtv.draft.model.IGTVDraftsRepository r2 = (com.instagram.igtv.draft.model.IGTVDraftsRepository) r2
            X.AbstractC09560e7.A00(r0)
            goto L45
        L36:
            X.AbstractC09560e7.A00(r0)
            X.AbstractC31172DnG.A1V(r6, r7, r5, r1)
            X.Pr2 r0 = r6.A01
            java.lang.Object r0 = r0.AsJ(r7, r5)
            if (r0 == r4) goto L29
            r2 = r6
        L45:
            java.util.Iterator r1 = X.AbstractC25226BEj.A1J(r0)
        L49:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5b
            java.lang.String r0 = X.AbstractC166987dD.A1B(r1)
            java.io.File r0 = X.AbstractC166987dD.A11(r0)
            r0.delete()
            goto L49
        L5b:
            X.Pr2 r1 = r2.A01
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A00 = r3
            java.lang.Object r0 = r1.AOe(r7, r5)
            if (r0 != r4) goto L27
            return r4
        L6b:
            X.MAK r5 = new X.MAK
            r5.<init>(r6, r8, r3)
            goto L16
        L71:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.draft.model.IGTVDraftsRepository.AOe(java.util.List, X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC58196Pr2
    public final InterfaceC19390xP Ab9() {
        return this.A01.Ab9();
    }

    @Override // X.InterfaceC58196Pr2
    public final Object AsI(int i, InterfaceC23621Ds interfaceC23621Ds) {
        return this.A01.AsI(i, interfaceC23621Ds);
    }

    @Override // X.InterfaceC58196Pr2
    public final Object AsJ(List list, InterfaceC23621Ds interfaceC23621Ds) {
        return this.A01.AsJ(list, interfaceC23621Ds);
    }

    @Override // X.InterfaceC58196Pr2
    public final InterfaceC19390xP AzE(int i) {
        return this.A01.AzE(i);
    }

    @Override // X.InterfaceC58196Pr2
    public final Object BY7(InterfaceC23621Ds interfaceC23621Ds) {
        return this.A01.BY7(interfaceC23621Ds);
    }

    @Override // X.InterfaceC58196Pr2
    public final InterfaceC19390xP CDH(long j) {
        return this.A01.CDH(j);
    }

    @Override // X.InterfaceC58196Pr2
    public final Object FAo(C51649Mrg c51649Mrg, InterfaceC23621Ds interfaceC23621Ds) {
        return MSX.A0b(this.A01.FAo(c51649Mrg, interfaceC23621Ds));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
    }

    public IGTVDraftsRepository(InterfaceC58196Pr2 interfaceC58196Pr2) {
        this.A01 = interfaceC58196Pr2;
    }
}
