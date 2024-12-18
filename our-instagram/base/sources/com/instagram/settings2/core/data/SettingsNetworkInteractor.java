package com.instagram.settings2.core.data;

import X.AbstractC166987dD;
import X.AbstractC37303Gc4;
import X.AbstractC50522MSa;
import X.B4Z;
import X.C47979LIr;
import X.C51718Msv;
import X.InterfaceC57866PlW;
import X.InterfaceC57989PnZ;
import X.InterfaceC58156PqL;
import X.InterfaceC58302Psu;
import X.InterfaceC58303Psv;
import X.XVa;
import com.instagram.api.schemas.RemoteBooleanSettingId;
import com.instagram.api.schemas.RemoteStringSettingId;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class SettingsNetworkInteractor {
    public final UserSession A00;

    public static final String A00(InterfaceC57989PnZ interfaceC57989PnZ, C47979LIr c47979LIr) {
        InterfaceC58156PqL A0d;
        if (interfaceC57989PnZ instanceof InterfaceC58303Psv) {
            A0d = AbstractC50522MSa.A0d(c47979LIr, interfaceC57989PnZ);
            if (A0d == null) {
                throw AbstractC37303Gc4.A0M(interfaceC57989PnZ, "No setting model found for ID ", AbstractC166987dD.A1C());
            }
        } else if (interfaceC57989PnZ instanceof InterfaceC58302Psu) {
            A0d = AbstractC50522MSa.A0d(c47979LIr, interfaceC57989PnZ);
            if (A0d == null) {
                throw AbstractC37303Gc4.A0M(interfaceC57989PnZ, "No setting model found for ID ", AbstractC166987dD.A1C());
            }
        } else {
            throw B4Z.A00();
        }
        InterfaceC57866PlW interfaceC57866PlW = (InterfaceC57866PlW) A0d.C0q().A01;
        if (XVa.A03(interfaceC57866PlW, 1)) {
            C51718Msv c51718Msv = (C51718Msv) ((XVa) interfaceC57866PlW).A01;
            if (C51718Msv.A00(c51718Msv, 0)) {
                return ((RemoteBooleanSettingId) c51718Msv.A01).A00;
            }
            if (C51718Msv.A00(c51718Msv, 1)) {
                return ((RemoteStringSettingId) c51718Msv.A01).A00;
            }
            throw B4Z.A00();
        }
        throw AbstractC166987dD.A12("Non remove storage types are not supported for parental controls");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.instagram.api.schemas.RemoteBooleanSettingId r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 30
            boolean r0 = X.PXC.A03(r8, r3)
            if (r0 == 0) goto L7e
            r5 = r8
            X.PXC r5 = (X.PXC) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L55
            if (r0 != r3) goto L83
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L4c
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r1 = r1.A00
            X.XZE r1 = (X.XZE) r1
            X.Mr8 r0 = r1.F7f()
            boolean r0 = r0.A02
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            X.Mr8 r0 = r1.F7f()
            java.lang.String r2 = r0.A00
            r1 = 13
            X.GzS r0 = new X.GzS
            r0.<init>(r2, r3, r1)
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)
        L4b:
            return r1
        L4c:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L4b
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L55:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r0)
            java.lang.String r0 = "settings/get_bool/"
            r2.A0B(r0)
            java.lang.Class<X.XZE> r1 = X.XZE.class
            java.lang.Class<X.XqL> r0 = X.C72886XqL.class
            r2.A0R(r1, r0)
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "setting_id"
            X.1ON r1 = X.AbstractC31172DnG.A0T(r2, r0, r1)
            r5.A00 = r3
            r0 = 1651663603(0x627262f3, float:1.1178105E21)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L24
            return r4
        L7e:
            X.PXC r5 = X.PXC.A00(r6, r8, r3)
            goto L16
        L83:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsNetworkInteractor.A01(com.instagram.api.schemas.RemoteBooleanSettingId, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067 A[Catch: Exception -> 0x00a9, TryCatch #0 {Exception -> 0x00a9, blocks: (B:12:0x0063, B:14:0x0067, B:18:0x007e, B:21:0x009a, B:26:0x00a8, B:23:0x00a0, B:25:0x00a4), top: B:11:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0 A[Catch: Exception -> 0x00a9, TryCatch #0 {Exception -> 0x00a9, blocks: (B:12:0x0063, B:14:0x0067, B:18:0x007e, B:21:0x009a, B:26:0x00a8, B:23:0x00a0, B:25:0x00a4), top: B:11:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(com.instagram.api.schemas.RemoteBooleanSettingId r9, X.InterfaceC23621Ds r10, boolean r11) {
        /*
            r8 = this;
            r3 = 32
            boolean r0 = X.PXC.A03(r10, r3)
            if (r0 == 0) goto L5e
            r4 = r10
            X.PXC r4 = (X.PXC) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A01
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L28
            if (r0 != r6) goto Lb4
            X.AbstractC09560e7.A00(r1)
        L25:
            X.3NY r1 = (X.C3NY) r1
            goto L63
        L28:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1Ms r7 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = "settings/set_bool/"
            r7.A0B(r0)
            java.lang.Class<X.XZE> r2 = X.XZE.class
            java.lang.Class<X.XqL> r1 = X.C72886XqL.class
            r0 = 0
            r7.A0P(r3, r2, r1, r0)
            java.lang.String r1 = r9.A00
            java.lang.String r0 = "setting_id"
            r7.A9s(r0, r1)
            java.lang.String r0 = "value"
            r7.A0I(r0, r11)
            java.lang.String r1 = "allow_error_codes"
            java.lang.String r0 = "true"
            X.1ON r1 = X.AbstractC31172DnG.A0T(r7, r1, r0)
            r4.A00 = r6
            r0 = 351963398(0x14fa8906, float:2.5297595E-26)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r5) goto L25
            return r5
        L5e:
            X.PXC r4 = X.PXC.A00(r8, r10, r3)
            goto L16
        L63:
            boolean r0 = r1 instanceof X.C3NX     // Catch: java.lang.Exception -> La9
            if (r0 == 0) goto La0
            X.3NX r1 = (X.C3NX) r1     // Catch: java.lang.Exception -> La9
            java.lang.Object r2 = r1.A00     // Catch: java.lang.Exception -> La9
            X.XZE r2 = (X.XZE) r2     // Catch: java.lang.Exception -> La9
            X.Mr8 r0 = r2.F7f()     // Catch: java.lang.Exception -> La9
            java.lang.String r1 = r0.A00     // Catch: java.lang.Exception -> La9
            X.Mr8 r0 = r2.F7f()     // Catch: java.lang.Exception -> La9
            java.lang.String r0 = r0.A01     // Catch: java.lang.Exception -> La9
            if (r0 == 0) goto L7c
            r3 = r0
        L7c:
            if (r1 != 0) goto L9a
            X.Mr8 r0 = r2.F7f()     // Catch: java.lang.Exception -> La9
            boolean r0 = r0.A02     // Catch: java.lang.Exception -> La9
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> La9
            X.Mr8 r0 = r2.F7f()     // Catch: java.lang.Exception -> La9
            java.lang.String r2 = r0.A00     // Catch: java.lang.Exception -> La9
            r1 = 13
            X.GzS r0 = new X.GzS     // Catch: java.lang.Exception -> La9
            r0.<init>(r2, r3, r1)     // Catch: java.lang.Exception -> La9
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)     // Catch: java.lang.Exception -> La9
            return r1
        L9a:
            X.Njs r0 = new X.Njs     // Catch: java.lang.Exception -> La9
            r0.<init>(r1, r3)     // Catch: java.lang.Exception -> La9
            goto La8
        La0:
            boolean r0 = r1 instanceof X.C194848jk     // Catch: java.lang.Exception -> La9
            if (r0 != 0) goto Lb3
            X.B4Z r0 = X.B4Z.A00()     // Catch: java.lang.Exception -> La9
        La8:
            throw r0     // Catch: java.lang.Exception -> La9
        La9:
            r1 = move-exception
            X.5Ie r0 = new X.5Ie
            r0.<init>(r1)
            X.8jk r1 = X.AbstractC43592JPx.A0p(r0)
        Lb3:
            return r1
        Lb4:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsNetworkInteractor.A02(com.instagram.api.schemas.RemoteBooleanSettingId, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067 A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:12:0x0063, B:14:0x0067, B:18:0x007e, B:21:0x0096, B:26:0x00a4, B:23:0x009c, B:25:0x00a0), top: B:11:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:12:0x0063, B:14:0x0067, B:18:0x007e, B:21:0x0096, B:26:0x00a4, B:23:0x009c, B:25:0x00a0), top: B:11:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(com.instagram.api.schemas.RemoteStringSettingId r9, java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            r8 = this;
            r3 = 33
            boolean r0 = X.PXC.A03(r11, r3)
            if (r0 == 0) goto L5e
            r4 = r11
            X.PXC r4 = (X.PXC) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A01
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L28
            if (r0 != r6) goto Lb0
            X.AbstractC09560e7.A00(r1)
        L25:
            X.3NY r1 = (X.C3NY) r1
            goto L63
        L28:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1Ms r7 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = "settings/set_string/"
            r7.A0B(r0)
            java.lang.Class<X.XZF> r2 = X.XZF.class
            java.lang.Class<X.XqO> r1 = X.C72889XqO.class
            r0 = 0
            r7.A0P(r3, r2, r1, r0)
            java.lang.String r1 = r9.A00
            java.lang.String r0 = "setting_id"
            r7.A9s(r0, r1)
            java.lang.String r0 = "value"
            r7.A9s(r0, r10)
            java.lang.String r1 = "allow_error_codes"
            java.lang.String r0 = "true"
            X.1ON r1 = X.AbstractC31172DnG.A0T(r7, r1, r0)
            r4.A00 = r6
            r0 = 1979761659(0x7600c3fb, float:6.529189E32)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r5) goto L25
            return r5
        L5e:
            X.PXC r4 = X.PXC.A00(r8, r11, r3)
            goto L16
        L63:
            boolean r0 = r1 instanceof X.C3NX     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto L9c
            X.3NX r1 = (X.C3NX) r1     // Catch: java.lang.Exception -> La5
            java.lang.Object r2 = r1.A00     // Catch: java.lang.Exception -> La5
            X.XZF r2 = (X.XZF) r2     // Catch: java.lang.Exception -> La5
            X.Mr9 r0 = r2.F7f()     // Catch: java.lang.Exception -> La5
            java.lang.String r1 = r0.A00     // Catch: java.lang.Exception -> La5
            X.Mr9 r0 = r2.F7f()     // Catch: java.lang.Exception -> La5
            java.lang.String r0 = r0.A01     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto L7c
            r3 = r0
        L7c:
            if (r1 != 0) goto L96
            X.Mr9 r0 = r2.F7f()     // Catch: java.lang.Exception -> La5
            java.lang.String r3 = r0.A02     // Catch: java.lang.Exception -> La5
            X.Mr9 r0 = r2.F7f()     // Catch: java.lang.Exception -> La5
            java.lang.String r2 = r0.A00     // Catch: java.lang.Exception -> La5
            r1 = 13
            X.GzS r0 = new X.GzS     // Catch: java.lang.Exception -> La5
            r0.<init>(r2, r3, r1)     // Catch: java.lang.Exception -> La5
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)     // Catch: java.lang.Exception -> La5
            return r1
        L96:
            X.Njs r0 = new X.Njs     // Catch: java.lang.Exception -> La5
            r0.<init>(r1, r3)     // Catch: java.lang.Exception -> La5
            goto La4
        L9c:
            boolean r0 = r1 instanceof X.C194848jk     // Catch: java.lang.Exception -> La5
            if (r0 != 0) goto Laf
            X.B4Z r0 = X.B4Z.A00()     // Catch: java.lang.Exception -> La5
        La4:
            throw r0     // Catch: java.lang.Exception -> La5
        La5:
            r1 = move-exception
            X.5Ie r0 = new X.5Ie
            r0.<init>(r1)
            X.8jk r1 = X.AbstractC43592JPx.A0p(r0)
        Laf:
            return r1
        Lb0:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsNetworkInteractor.A03(com.instagram.api.schemas.RemoteStringSettingId, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(com.instagram.api.schemas.RemoteStringSettingId r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 31
            boolean r0 = X.PXC.A03(r8, r3)
            if (r0 == 0) goto L7a
            r5 = r8
            X.PXC r5 = (X.PXC) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L51
            if (r0 != r3) goto L7f
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L48
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r1 = r1.A00
            X.XZF r1 = (X.XZF) r1
            X.Mr9 r0 = r1.F7f()
            java.lang.String r3 = r0.A02
            X.Mr9 r0 = r1.F7f()
            java.lang.String r2 = r0.A00
            r1 = 13
            X.GzS r0 = new X.GzS
            r0.<init>(r2, r3, r1)
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)
        L47:
            return r1
        L48:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L47
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L51:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r0)
            java.lang.String r0 = "settings/get_string/"
            r2.A0B(r0)
            java.lang.Class<X.XZF> r1 = X.XZF.class
            java.lang.Class<X.XqO> r0 = X.C72889XqO.class
            r2.A0R(r1, r0)
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "setting_id"
            X.1ON r1 = X.AbstractC31172DnG.A0T(r2, r0, r1)
            r5.A00 = r3
            r0 = 963719809(0x39713281, float:2.3002365E-4)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L24
            return r4
        L7a:
            X.PXC r5 = X.PXC.A00(r6, r8, r3)
            goto L16
        L7f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsNetworkInteractor.A04(com.instagram.api.schemas.RemoteStringSettingId, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00aa, code lost:
    
        if (r0 == r7) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(X.InterfaceC23621Ds r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsNetworkInteractor.A05(X.1Ds):java.lang.Object");
    }

    public SettingsNetworkInteractor(UserSession userSession) {
        this.A00 = userSession;
    }
}
