package X;

/* renamed from: X.6Mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC137846Mj {
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
    
        if ((r17 & com.facebook.common.dextricks.DalvikInternals.IOPRIO_BACKGROUND) == 16384) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
    
        if ((r17 & 3072) == 2048) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0059, code lost:
    
        if ((r17 & 384) == 256) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0044, code lost:
    
        if ((r17 & 48) == 32) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.Modifier A00(X.C6M3 r11, X.C6MF r12, X.InterfaceC137836Mi r13, X.C5Tl r14, androidx.compose.ui.Modifier r15, X.AnonymousClass583 r16, int r17, boolean r18, boolean r19) {
        /*
            r3 = r17
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L10
            r1 = 1334364862(0x4f88cabe, float:4.5899766E9)
            java.lang.String r0 = "androidx.compose.foundation.lazy.layout.lazyLayoutBeyondBoundsModifier (LazyLayoutBeyondBoundsModifierLocal.kt:51)"
            X.C0fH.A01(r1, r0)
        L10:
            if (r19 != 0) goto L2b
            r0 = -1890658823(0xffffffff8f4ed5f9, float:-1.0197794E-29)
            r14.Eno(r0)
        L18:
            X.5Tk r14 = (X.C117505Tk) r14
            r0 = 0
            X.C117505Tk.A0L(r14, r0)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L2a
            r0 = -1240488402(0xffffffffb60fa62e, float:-2.140539E-6)
            X.C0fH.A00(r0)
        L2a:
            return r15
        L2b:
            r0 = -1890632411(0xffffffff8f4f3d25, float:-1.0217664E-29)
            r14.Eno(r0)
            r0 = r17 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            r5 = 0
            r8 = r13
            if (r0 <= r1) goto L41
            boolean r0 = r14.AH4(r13)
            if (r0 != 0) goto L46
        L41:
            r0 = r17 & 48
            r4 = 0
            if (r0 != r1) goto L47
        L46:
            r4 = 1
        L47:
            r0 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            r7 = r12
            if (r0 <= r2) goto L56
            boolean r0 = r14.AH4(r12)
            if (r0 != 0) goto L5b
        L56:
            r1 = r3 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L5c
        L5b:
            r0 = 1
        L5c:
            r4 = r4 | r0
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            r2 = 2048(0x800, float:2.87E-42)
            r10 = r18
            if (r0 <= r2) goto L6d
            boolean r0 = r14.AH5(r10)
            if (r0 != 0) goto L72
        L6d:
            r1 = r3 & 3072(0xc00, float:4.305E-42)
            r0 = 0
            if (r1 != r2) goto L73
        L72:
            r0 = 1
        L73:
            r4 = r4 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r17
            r0 = r0 ^ 24576(0x6000, float:3.4438E-41)
            r2 = 16384(0x4000, float:2.2959E-41)
            r9 = r16
            if (r0 <= r2) goto L87
            boolean r0 = r14.AH4(r9)
            if (r0 != 0) goto L8c
        L87:
            r1 = r3 & 24576(0x6000, float:3.4438E-41)
            r0 = 0
            if (r1 != r2) goto L8d
        L8c:
            r0 = 1
        L8d:
            r4 = r4 | r0
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r17
            r2 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 ^ r2
            r1 = 131072(0x20000, float:1.83671E-40)
            r6 = r11
            if (r0 <= r1) goto La0
            boolean r0 = r14.AH4(r11)
            if (r0 != 0) goto La4
        La0:
            r3 = r17 & r2
            if (r3 != r1) goto La5
        La4:
            r5 = 1
        La5:
            r4 = r4 | r5
            java.lang.Object r5 = r14.EEc()
            if (r4 != 0) goto Lb0
            java.lang.Object r0 = X.C5UI.A00
            if (r5 != r0) goto Lb8
        Lb0:
            X.6Mk r5 = new X.6Mk
            r5.<init>(r6, r7, r8, r9, r10)
            r14.FBy(r5)
        Lb8:
            X.6Mk r5 = (X.C137856Mk) r5
            androidx.compose.ui.Modifier r15 = r15.Eq3(r5)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC137846Mj.A00(X.6M3, X.6MF, X.6Mi, X.5Tl, androidx.compose.ui.Modifier, X.583, int, boolean, boolean):androidx.compose.ui.Modifier");
    }
}
