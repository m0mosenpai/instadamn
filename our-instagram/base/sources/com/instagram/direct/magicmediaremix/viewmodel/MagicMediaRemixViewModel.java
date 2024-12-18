package com.instagram.direct.magicmediaremix.viewmodel;

import X.AbstractC141776au;
import X.AbstractC167017dG;
import X.AbstractC208910l;
import X.AbstractC25229BEm;
import X.AbstractC25234BEr;
import X.AbstractC52922bZ;
import X.AnonymousClass111;
import X.B4I;
import X.C0UO;
import X.C11200ib;
import X.C12L;
import X.C14090nZ;
import X.C141796aw;
import X.C14360o3;
import X.C15870qh;
import X.C189268a2;
import X.C43901JbB;
import X.C45060Jwp;
import X.C47365KwG;
import X.C47907LEb;
import X.C48788Lhv;
import X.C60352pJ;
import X.InterfaceC16660sJ;
import X.InterfaceC19630xq;
import X.K2S;
import X.KZD;
import X.MBl;
import android.content.res.Resources;
import com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl;
import com.instagram.gallery.scanner.MediaScannerScheduler;

/* loaded from: classes8.dex */
public final class MagicMediaRemixViewModel extends AbstractC52922bZ {
    public final C14090nZ A00;
    public final C60352pJ A01;
    public final KZD A02;
    public final C47907LEb A03;
    public final String A04;
    public final C0UO A05;
    public final Resources A06;
    public final C14090nZ A07;

    public MagicMediaRemixViewModel(Resources resources, MagicMediaRemixContentCompositorImpl magicMediaRemixContentCompositorImpl, C60352pJ c60352pJ, C47365KwG c47365KwG, KZD kzd, C47907LEb c47907LEb, C189268a2 c189268a2, MediaScannerScheduler mediaScannerScheduler, C43901JbB c43901JbB, InterfaceC19630xq interfaceC19630xq, String str, InterfaceC16660sJ interfaceC16660sJ, int i) {
        Object obj;
        AbstractC167017dG.A1P(c43901JbB, kzd);
        C14360o3.A0B(c47907LEb, 3);
        AbstractC25234BEr.A0k(4, interfaceC19630xq, c189268a2, mediaScannerScheduler, magicMediaRemixContentCompositorImpl);
        AbstractC25229BEm.A1L(c47365KwG, 11, str);
        this.A02 = kzd;
        this.A03 = c47907LEb;
        this.A01 = c60352pJ;
        this.A04 = str;
        this.A06 = resources;
        C12L c12l = C12L.A00;
        this.A07 = c12l.CPG(281480192, 3);
        this.A00 = c12l.AOT(281480192, 3);
        C0UO c0uo = c47907LEb.A03;
        MBl mBl = new MBl(magicMediaRemixContentCompositorImpl, c47365KwG, this, c189268a2, mediaScannerScheduler, c43901JbB, interfaceC19630xq, null, interfaceC16660sJ, i);
        int i2 = AnonymousClass111.A00;
        C15870qh c15870qh = new C15870qh(new C11200ib(mBl, c0uo, 2));
        C141796aw A00 = AbstractC141776au.A00(this);
        B4I b4i = new B4I();
        C45060Jwp c45060Jwp = (C45060Jwp) c0uo.getValue();
        if (c45060Jwp.A07) {
            obj = new K2S(c45060Jwp);
        } else {
            obj = C48788Lhv.A00;
        }
        this.A05 = AbstractC208910l.A01(obj, A00, c15870qh, b4i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C43888Jav r11, com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl r12, X.C60352pJ r13, X.C47365KwG r14, X.KZD r15, com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel r16, com.instagram.gallery.scanner.MediaScannerScheduler r17, X.C43901JbB r18, X.InterfaceC23621Ds r19, int r20) {
        /*
            r3 = r19
            r10 = r16
            r9 = r15
            r6 = r12
            r5 = r11
            r7 = r13
            r8 = r14
            r13 = r20
            boolean r0 = r3 instanceof X.MAB
            if (r0 == 0) goto L9d
            r12 = r3
            X.MAB r12 = (X.MAB) r12
            int r2 = r12.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9d
            int r2 = r2 - r1
            r12.A01 = r2
        L1d:
            java.lang.Object r11 = r12.A08
            X.1JX r2 = X.C1JX.A02
            int r0 = r12.A01
            r1 = 2
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 == r3) goto L62
            if (r0 != r1) goto La4
            X.AbstractC09560e7.A00(r11)
        L2e:
            return r11
        L2f:
            X.AbstractC09560e7.A00(r11)
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            X.9sD r0 = X.EnumC222729sD.A03
            r4.add(r0)
            X.0nZ r0 = r10.A07
            r19 = 0
            X.PZo r14 = new X.PZo
            r16 = r17
            r17 = r18
            r15 = r10
            r18 = r4
            r14.<init>(r15, r16, r17, r18, r19)
            r12.A02 = r10
            r12.A03 = r9
            r12.A04 = r6
            r12.A05 = r5
            r12.A06 = r7
            r12.A07 = r8
            r12.A00 = r13
            r12.A01 = r3
            java.lang.Object r11 = X.AbstractC23641Du.A00(r12, r0, r14)
            if (r11 != r2) goto L7f
            return r2
        L62:
            int r13 = r12.A00
            java.lang.Object r8 = r12.A07
            X.KwG r8 = (X.C47365KwG) r8
            java.lang.Object r7 = r12.A06
            X.2pJ r7 = (X.C60352pJ) r7
            java.lang.Object r5 = r12.A05
            X.Jav r5 = (X.C43888Jav) r5
            java.lang.Object r6 = r12.A04
            com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl r6 = (com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl) r6
            java.lang.Object r9 = r12.A03
            X.KZD r9 = (X.KZD) r9
            java.lang.Object r10 = r12.A02
            com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel r10 = (com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel) r10
            X.AbstractC09560e7.A00(r11)
        L7f:
            java.util.List r11 = (java.util.List) r11
            boolean r0 = X.AbstractC166987dD.A1b(r11)
            if (r0 == 0) goto La9
            r0 = 0
            r12.A02 = r0
            r12.A03 = r0
            r12.A04 = r0
            r12.A05 = r0
            r12.A06 = r0
            r12.A07 = r0
            r12.A01 = r1
            java.lang.Object r11 = A01(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r11 != r2) goto L2e
            return r2
        L9d:
            X.MAB r12 = new X.MAB
            r12.<init>(r10, r3)
            goto L1d
        La4:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        La9:
            X.0sl r1 = X.C16930sl.A00
            X.K2T r0 = new X.K2T
            r0.<init>(r1, r1)
            X.0rp r11 = new X.0rp
            r11.<init>(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel.A00(X.Jav, com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl, X.2pJ, X.KwG, X.KZD, com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel, com.instagram.gallery.scanner.MediaScannerScheduler, X.JbB, X.1Ds, int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        if (r11 == r9) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.4A7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C43888Jav r20, com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl r21, X.C60352pJ r22, X.C47365KwG r23, X.KZD r24, com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel r25, java.util.List r26, X.InterfaceC23621Ds r27, int r28) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel.A01(X.Jav, com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl, X.2pJ, X.KwG, X.KZD, com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel, java.util.List, X.1Ds, int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0241, code lost:
    
        if (r12 >= 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
    
        if (r1 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0252, code lost:
    
        if (r12 >= 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0245, code lost:
    
        if (r12 >= 3) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00f9 -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0122 -> B:11:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.C43888Jav r19, com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl r20, X.C60352pJ r21, X.C47365KwG r22, com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel r23, com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel r24, X.C9ZK r25, java.util.List r26, java.util.Map r27, X.InterfaceC23621Ds r28, int r29) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel.A02(X.Jav, com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl, X.2pJ, X.KwG, com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel, com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel, X.9ZK, java.util.List, java.util.Map, X.1Ds, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(X.C43888Jav r14, com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl r15, com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel r16, com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response r17, X.C9ZK r18, java.lang.String r19, java.util.List r20, X.InterfaceC23621Ds r21, int r22, int r23) {
        /*
            r8 = r17
            r10 = r19
            r1 = r22
            r5 = r23
            r6 = 0
            r4 = r21
            boolean r0 = r4 instanceof X.PWV
            if (r0 == 0) goto L8b
            r13 = r4
            X.PWV r13 = (X.PWV) r13
            int r0 = r13.A07
            if (r0 != r6) goto L8b
            int r3 = r13.A02
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L8b
            int r3 = r3 - r2
            r13.A02 = r3
        L21:
            java.lang.Object r7 = r13.A06
            X.1JX r3 = X.C1JX.A02
            int r0 = r13.A02
            r2 = 1
            if (r0 == 0) goto L62
            if (r0 != r2) goto L93
            int r5 = r13.A01
            int r1 = r13.A00
            java.lang.Object r10 = r13.A05
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r14 = r13.A04
            X.Jav r14 = (X.C43888Jav) r14
            java.lang.Object r8 = r13.A03
            com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response r8 = (com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response) r8
            X.AbstractC09560e7.A00(r7)
        L3f:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            java.lang.Object r0 = r14.A01
            X.0sJ r0 = (X.InterfaceC16660sJ) r0
            java.lang.Object r4 = r0.invoke(r7)
            double r2 = (double) r1
            r0 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r2 = r2 * r0
            int r0 = (int) r2
            android.graphics.Bitmap r1 = X.C1NC.A09(r7, r0, r0, r6, r6)
            X.C14360o3.A07(r1)
            X.LZi r0 = new X.LZi
            r0.<init>(r1, r8, r10, r5)
            X.0e4 r0 = X.AbstractC166987dD.A1L(r4, r0)
            return r0
        L62:
            X.AbstractC09560e7.A00(r7)
            X.KdN r0 = r8.A0G()
            if (r0 == 0) goto L71
            java.lang.String r11 = r0.name()
            if (r11 != 0) goto L73
        L71:
            java.lang.String r11 = ""
        L73:
            r13.A03 = r8
            r13.A04 = r14
            r13.A05 = r10
            r13.A00 = r1
            r13.A01 = r5
            r13.A02 = r2
            r9 = r18
            r12 = r20
            r7 = r15
            java.lang.Object r7 = r7.A03(r8, r9, r10, r11, r12, r13)
            if (r7 != r3) goto L3f
            return r3
        L8b:
            X.PWV r13 = new X.PWV
            r0 = r16
            r13.<init>(r0, r4, r6)
            goto L21
        L93:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel.A03(X.Jav, com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositorImpl, com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel, com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response, X.9ZK, java.lang.String, java.util.List, X.1Ds, int, int):java.lang.Object");
    }
}
