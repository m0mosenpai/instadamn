package X;

import android.graphics.Typeface;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.8y1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC202838y1 {
    public static final float A00(EnumC190948cq enumC190948cq) {
        C14360o3.A0B(enumC190948cq, 0);
        int ordinal = enumC190948cq.ordinal();
        if (ordinal != 5) {
            if (ordinal != 6) {
                if (ordinal != 7) {
                    if (ordinal != 8) {
                        if (ordinal != 4) {
                            if (ordinal == 11) {
                                return 0.38f;
                            }
                            switch (ordinal) {
                                case 18:
                                    return 0.71f;
                                case Process.SIGSTOP /* 19 */:
                                    return 0.33f;
                                case 20:
                                    return 0.42f;
                                case 21:
                                    return 0.38f;
                                case 22:
                                    return 0.29f;
                                case 23:
                                    return 0.88f;
                                case 24:
                                    return 0.46f;
                                case 25:
                                case 26:
                                    return 1.0f;
                                default:
                                    return 0.5f;
                            }
                        }
                        return 0.29f;
                    }
                    return 0.46f;
                }
                return 0.33f;
            }
            return 0.58f;
        }
        return 0.96f;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    public static final Typeface A01(C15980qs c15980qs, EnumC190948cq enumC190948cq) {
        EnumC15950qp enumC15950qp;
        C14360o3.A0B(c15980qs, 1);
        if (enumC190948cq != null) {
            switch (enumC190948cq.ordinal()) {
                case 0:
                    enumC15950qp = EnumC15950qp.A0B;
                    return c15980qs.A02(enumC15950qp);
                case 1:
                    enumC15950qp = EnumC15950qp.A10;
                    return c15980qs.A02(enumC15950qp);
                case 2:
                    enumC15950qp = EnumC15950qp.A14;
                    return c15980qs.A02(enumC15950qp);
                case 4:
                    Typeface A02 = c15980qs.A02(EnumC15950qp.A0C);
                    if (A02 != null) {
                        return A02;
                    }
                    return Typeface.MONOSPACE;
                case 5:
                    Typeface A022 = c15980qs.A02(EnumC15950qp.A0c);
                    if (A022 != null) {
                        return A022;
                    }
                    return Typeface.create(Typeface.SANS_SERIF, 3);
                case 6:
                    enumC15950qp = EnumC15950qp.A0D;
                    return c15980qs.A02(enumC15950qp);
                case 7:
                    enumC15950qp = EnumC15950qp.A06;
                    return c15980qs.A02(enumC15950qp);
                case 8:
                    enumC15950qp = EnumC15950qp.A08;
                    return c15980qs.A02(enumC15950qp);
                case 9:
                case 20:
                    enumC15950qp = EnumC15950qp.A0g;
                    return c15980qs.A02(enumC15950qp);
                case 11:
                    enumC15950qp = EnumC15950qp.A0V;
                    return c15980qs.A02(enumC15950qp);
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    enumC15950qp = EnumC15950qp.A0F;
                    return c15980qs.A02(enumC15950qp);
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    enumC15950qp = EnumC15950qp.A0o;
                    return c15980qs.A02(enumC15950qp);
                case 14:
                    enumC15950qp = EnumC15950qp.A09;
                    return c15980qs.A02(enumC15950qp);
                case Process.SIGTERM /* 15 */:
                    enumC15950qp = EnumC15950qp.A05;
                    return c15980qs.A02(enumC15950qp);
                case 16:
                    enumC15950qp = EnumC15950qp.A0H;
                    return c15980qs.A02(enumC15950qp);
                case 17:
                    enumC15950qp = EnumC15950qp.A0N;
                    return c15980qs.A02(enumC15950qp);
                case 18:
                    enumC15950qp = EnumC15950qp.A0P;
                    return c15980qs.A02(enumC15950qp);
                case Process.SIGSTOP /* 19 */:
                    enumC15950qp = EnumC15950qp.A0Z;
                    return c15980qs.A02(enumC15950qp);
                case 21:
                    enumC15950qp = EnumC15950qp.A0R;
                    return c15980qs.A02(enumC15950qp);
                case 22:
                    enumC15950qp = EnumC15950qp.A0Q;
                    return c15980qs.A02(enumC15950qp);
                case 23:
                    enumC15950qp = EnumC15950qp.A0S;
                    return c15980qs.A02(enumC15950qp);
                case 24:
                    enumC15950qp = EnumC15950qp.A0a;
                    return c15980qs.A02(enumC15950qp);
                case 25:
                    enumC15950qp = EnumC15950qp.A0O;
                    return c15980qs.A02(enumC15950qp);
                case 26:
                    enumC15950qp = EnumC15950qp.A0M;
                    return c15980qs.A02(enumC15950qp);
            }
        }
        enumC15950qp = EnumC15950qp.A0z;
        return c15980qs.A02(enumC15950qp);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (X.AbstractC190978ct.A05(r8) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.content.Context r7, android.text.Editable r8, X.C190888ck r9) {
        /*
            r6 = 0
            r0 = 1
            X.C14360o3.A0B(r8, r0)
            r0 = 2
            X.C14360o3.A0B(r7, r0)
            java.lang.Class<X.8y9> r5 = X.C202918y9.class
            java.lang.Object r2 = X.C4GL.A00(r8, r5)
            X.8y9 r2 = (X.C202918y9) r2
            boolean r4 = X.AbstractC190978ct.A06(r8)
            if (r4 != 0) goto L1e
            boolean r0 = X.AbstractC190978ct.A05(r8)
            r3 = 1
            if (r0 != 0) goto L1f
        L1e:
            r3 = 0
        L1f:
            if (r2 == 0) goto L2c
            X.8cq r1 = r2.A02
            X.8cq r0 = r9.A05
            if (r1 != r0) goto L2c
            r2.A01 = r4
            r2.A00 = r3
            return
        L2c:
            java.lang.Class[] r0 = new java.lang.Class[]{r5}
            X.C4GL.A05(r8, r0)
            X.8y9 r2 = new X.8y9
            r2.<init>(r7, r9)
            r2.A01 = r4
            r2.A00 = r3
            int r1 = r8.length()
            r0 = 65554(0x10012, float:9.1861E-41)
            r8.setSpan(r2, r6, r1, r0)
            X.39t r1 = X.C2UX.A00()
            r0 = -1
            r1.A8N(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC202838y1.A02(android.content.Context, android.text.Editable, X.8ck):void");
    }
}
