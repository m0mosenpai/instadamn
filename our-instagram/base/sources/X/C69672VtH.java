package X;

import android.os.Bundle;

/* renamed from: X.VtH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69672VtH {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.os.Bundle r10, java.lang.Object r11) {
        /*
            r9 = this;
            java.lang.String r0 = "DynamicFlowPlugin.extraFlowId"
            java.lang.String r7 = r10.getString(r0)
            if (r7 == 0) goto L5c
            X.1V1 r6 = X.C1V1.A01()
            X.1V0 r6 = (X.C1V0) r6
            java.util.Map r5 = r6.A01
            java.lang.Object r4 = r5.get(r7)
            X.XFd r4 = (X.InterfaceC72015XFd) r4
            java.lang.String r0 = "Could not find flow for the given id."
            X.C18C.A07(r4, r0)
            X.WoF r4 = (X.C71118WoF) r4
            X.VnC r3 = r4.A01
            if (r3 != 0) goto L68
            r0 = 0
        L22:
            X.VBW r2 = new X.VBW
            r2.<init>(r4, r0)
        L27:
            boolean r0 = r2 instanceof X.VBX
            if (r0 == 0) goto L5d
            X.VBX r2 = (X.VBX) r2
            int r0 = r2.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L5c
            java.lang.Object r0 = r2.A03
            boolean r0 = X.AbstractC25229BEm.A1Z(r0)
            if (r0 == 0) goto L5c
        L3b:
            java.util.Map r3 = r6.A00
            java.lang.Object r0 = r3.get(r7)
            X.Vg4 r0 = (X.C69028Vg4) r0
            if (r0 == 0) goto L56
            X.VJn r0 = r0.A00
            X.C1V4.A00(r0)
            X.6Yy r2 = r0.A00
            X.VHn r0 = X.VHn.A06
            java.lang.String r1 = r0.toString()
            r0 = 1
            r2.A0G(r1, r0)
        L56:
            r5.remove(r7)
            r3.remove(r7)
        L5c:
            return
        L5d:
            boolean r0 = r2 instanceof X.VBW
            if (r0 == 0) goto L5c
            X.VBW r2 = (X.VBW) r2
            int r0 = r2.A00
            if (r0 == 0) goto L3b
            return
        L68:
            X.XFh r0 = r3.A05
            java.lang.Object r2 = r0.F8H(r3, r11)
            X.XFe r0 = r3.A00
            boolean r0 = r0.AFe(r3, r2)
            if (r0 == 0) goto Lb1
            java.util.Stack r1 = r4.A04
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9c
            r0 = 0
        L7f:
            r8 = -1
            X.XFg r1 = r3.A03
            java.lang.Object r2 = r1.DV9(r3, r2, r8)
            r1 = 0
            r3.A04 = r1
            r4.A01 = r0
            if (r0 == 0) goto L95
            X.XFg r1 = r0.A02
            java.lang.Object r1 = r1.DV9(r0, r2, r8)
            r4.A02 = r1
        L95:
            r1 = 1
            X.VBX r2 = new X.VBX
            r2.<init>(r4, r3, r0, r1)
            goto L27
        L9c:
            java.lang.Object r0 = r1.pop()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r4.A00 = r1
            java.util.List r0 = r4.A03
            java.lang.Object r0 = r0.get(r1)
            X.VnC r0 = (X.C69427VnC) r0
            goto L7f
        Lb1:
            r0 = 1
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69672VtH.A00(android.os.Bundle, java.lang.Object):void");
    }

    public final void A01(Bundle bundle, Object obj) {
        String string = bundle.getString("DynamicFlowPlugin.extraFlowId");
        if (string != null) {
            C1V1.A01().A06(string, obj);
        }
    }
}
