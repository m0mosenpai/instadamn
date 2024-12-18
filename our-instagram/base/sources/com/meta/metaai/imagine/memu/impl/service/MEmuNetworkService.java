package com.meta.metaai.imagine.memu.impl.service;

import X.AbstractC28057CYl;
import X.AbstractC40691uc;
import X.B4Z;
import X.C14360o3;
import X.C40701ud;
import X.C7V;
import X.EnumC53327Ni6;
import X.InterfaceC40711ue;
import X.OWt;
import android.content.Context;
import com.meta.foa.session.FoaUserSession;

/* loaded from: classes9.dex */
public final class MEmuNetworkService {
    public static final OWt A03 = new OWt(EnumC53327Ni6.A0T, 95, true);
    public final Context A00;
    public final InterfaceC40711ue A01;
    public final FoaUserSession A02;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(android.graphics.Bitmap r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 13
            boolean r0 = X.C29631D3m.A03(r8, r3)
            if (r0 == 0) goto L3b
            r5 = r8
            X.D3m r5 = (X.C29631D3m) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L40
            X.AbstractC09560e7.A00(r1)
        L24:
            X.W63 r1 = (X.W63) r1
            java.lang.String r0 = r1.A05
            return r0
        L29:
            X.AbstractC09560e7.A00(r1)
            android.content.Context r2 = r6.A00
            com.meta.foa.session.FoaUserSession r1 = r6.A02
            X.OWt r0 = com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService.A03
            r5.A00 = r3
            java.lang.Object r1 = X.AbstractC54304NzO.A00(r2, r7, r1, r0, r5)
            if (r1 != r4) goto L24
            return r4
        L3b:
            X.D3m r5 = X.C29631D3m.A00(r6, r8, r3)
            goto L16
        L40:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService.A01(android.graphics.Bitmap, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r12, java.lang.String r13, X.InterfaceC23621Ds r14, X.C5Hc r15, boolean r16) {
        /*
            r11 = this;
            r4 = 40
            boolean r0 = X.C57146PWy.A01(r14, r4)
            if (r0 == 0) goto Ld1
            r3 = r14
            X.PWy r3 = (X.C57146PWy) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Ld1
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r1 = r3.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L4a
            if (r0 != r2) goto Ldd
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L41
            java.lang.Object r0 = X.AbstractC25231BEo.A0n(r1)
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)
        L32:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L40
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Ld8
            X.OSc r0 = X.C54952OSc.A00
            X.8jk r1 = X.AbstractC43592JPx.A0p(r0)
        L40:
            return r1
        L41:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L32
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L4a:
            X.AbstractC09560e7.A00(r1)
            java.lang.Class<X.ON4> r0 = X.ON4.class
            java.lang.Object r6 = X.AbstractC25234BEr.A0d(r0)     // Catch: java.lang.Throwable -> Le2
            X.Oo1 r6 = (X.C55676Oo1) r6     // Catch: java.lang.Throwable -> Le2
            X.2JO r5 = new X.2JO
            r5.<init>()
            com.meta.foa.session.FoaUserSession r0 = r11.A02
            java.lang.String r1 = r0.getUserId()
            if (r1 != 0) goto L64
            java.lang.String r1 = ""
        L64:
            java.lang.String r0 = "user_id"
            r5.A09(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r16)
            java.lang.String r0 = "has_data_use_restrictions"
            r5.A08(r0, r1)
            java.util.ArrayList r8 = X.AbstractC167017dG.A0q(r15)
            java.util.Iterator r10 = r15.iterator()
        L7a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r9 = r10.next()
            X.OLk r9 = (X.OLk) r9
            X.2JO r7 = new X.2JO
            r7.<init>()
            java.lang.String r1 = r9.A02
            java.lang.String r0 = "photo_handle"
            r7.A09(r1, r0)
            X.C7V r0 = r9.A01
            java.lang.String r1 = A00(r0)
            java.lang.String r0 = "orientation"
            r7.A09(r1, r0)
            r8.add(r7)
            goto L7a
        La1:
            java.lang.String r0 = "photos"
            r5.A05(r0, r8)
            r0 = 274(0x112, float:3.84E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r5.A09(r12, r0)
            java.lang.String r0 = "trigger_message_id"
            r5.A09(r13, r0)
            X.2JM r1 = r6.A00
            java.lang.String r0 = "input"
            r1.A00(r5, r0)
            r6.A01 = r2
            com.facebook.pando.PandoGraphQLRequest r1 = r6.build()
            X.1ue r0 = r11.A01
            X.C14360o3.A0A(r1)
            r3.A01 = r11
            r3.A00 = r2
            java.lang.Object r1 = X.CL2.A00(r0, r1, r3)
            if (r1 != r4) goto L24
            return r4
        Ld1:
            X.PWy r3 = new X.PWy
            r3.<init>(r11, r14, r4)
            goto L16
        Ld8:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ldd:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Le2:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService.A02(java.lang.String, java.lang.String, X.1Ds, X.5Hc, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r12, X.C5Hc r13) {
        /*
            r11 = this;
            r3 = 12
            boolean r0 = X.C29631D3m.A03(r12, r3)
            if (r0 == 0) goto Lb8
            r5 = r12
            X.D3m r5 = (X.C29631D3m) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb8
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L4a
            if (r0 != r4) goto Lc3
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L41
            java.lang.Object r0 = X.AbstractC25231BEo.A0n(r1)
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)
        L32:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L40
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lbe
            X.OSc r0 = X.C54952OSc.A00
            X.8jk r1 = X.AbstractC43592JPx.A0p(r0)
        L40:
            return r1
        L41:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L32
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L4a:
            X.AbstractC09560e7.A00(r1)
            java.lang.Class<X.ON3> r0 = X.ON3.class
            java.lang.Object r8 = X.AbstractC25234BEr.A0d(r0)     // Catch: java.lang.Throwable -> Lc8
            X.Oo0 r8 = (X.C55675Oo0) r8     // Catch: java.lang.Throwable -> Lc8
            X.2JO r7 = new X.2JO
            r7.<init>()
            com.meta.foa.session.FoaUserSession r0 = r11.A02
            java.lang.String r1 = r0.getUserId()
            if (r1 != 0) goto L64
            java.lang.String r1 = ""
        L64:
            java.lang.String r0 = "user_id"
            r7.A09(r1, r0)
            java.util.ArrayList r9 = X.AbstractC167017dG.A0q(r13)
            java.util.Iterator r10 = r13.iterator()
        L71:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r3 = r10.next()
            X.OLk r3 = (X.OLk) r3
            X.2JO r2 = new X.2JO
            r2.<init>()
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "photo_handle"
            r2.A09(r1, r0)
            X.C7V r0 = r3.A01
            java.lang.String r1 = A00(r0)
            java.lang.String r0 = "orientation"
            r2.A09(r1, r0)
            r9.add(r2)
            goto L71
        L98:
            java.lang.String r0 = "photos"
            r7.A05(r0, r9)
            X.2JM r1 = r8.A00
            java.lang.String r0 = "input"
            r1.A00(r7, r0)
            r8.A01 = r4
            com.facebook.pando.PandoGraphQLRequest r1 = r8.build()
            X.1ue r0 = r11.A01
            X.C14360o3.A0A(r1)
            r5.A00 = r4
            java.lang.Object r1 = X.CL2.A00(r0, r1, r5)
            if (r1 != r6) goto L24
            return r6
        Lb8:
            X.D3m r5 = X.C29631D3m.A00(r11, r12, r3)
            goto L16
        Lbe:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lc3:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lc8:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService.A03(X.1Ds, X.5Hc):java.lang.Object");
    }

    public MEmuNetworkService(Context context, FoaUserSession foaUserSession) {
        this.A00 = context;
        this.A02 = foaUserSession;
        C40701ud A01 = AbstractC40691uc.A01(AbstractC28057CYl.A00(foaUserSession));
        C14360o3.A07(A01);
        this.A01 = A01;
    }

    public static final String A00(C7V c7v) {
        int ordinal = c7v.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return "CAMERA_ROLL";
                    }
                    throw B4Z.A00();
                }
                return "CENTER";
            }
            return "RIGHT";
        }
        return "LEFT";
    }
}
