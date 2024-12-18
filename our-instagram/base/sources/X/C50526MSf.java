package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.MSf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50526MSf extends C0T6 {
    public boolean A00;
    public boolean A01;
    public final int A02;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50526MSf(int r4, int r5, boolean r6) {
        /*
            r3 = this;
            r2 = 0
            r3.A02 = r5
            switch(r5) {
                case 0: goto L6b;
                case 1: goto L64;
                case 2: goto L6;
                case 3: goto L5d;
                case 4: goto L56;
                case 5: goto L4f;
                case 6: goto L42;
                case 7: goto L3b;
                case 8: goto L2e;
                case 9: goto L21;
                case 10: goto L19;
                case 11: goto L11;
                case 12: goto L6;
                case 13: goto L6;
                case 14: goto L72;
                default: goto L6;
            }
        L6:
            r1 = 0
            boolean r6 = X.MSX.A1T(r4, r6)
            r0 = 16
        Ld:
            r3.<init>(r6, r1, r0)
            return
        L11:
            r1 = 0
            boolean r6 = X.MSX.A1T(r4, r6)
            r0 = 11
            goto Ld
        L19:
            r1 = 0
            boolean r6 = X.MSX.A1T(r4, r6)
            r0 = 10
            goto Ld
        L21:
            r1 = 0
            boolean r6 = X.MSX.A1T(r4, r6)
            r0 = r4 & 2
            if (r0 == 0) goto L2b
            r1 = 1
        L2b:
            r0 = 9
            goto Ld
        L2e:
            r1 = 0
            boolean r6 = X.MSX.A1T(r4, r6)
            r0 = r4 & 2
            if (r0 == 0) goto L38
            r1 = 1
        L38:
            r0 = 8
            goto Ld
        L3b:
            r1 = 0
            boolean r6 = X.MSX.A1T(r4, r6)
            r0 = 7
            goto Ld
        L42:
            r1 = 0
            r0 = r4 & 1
            if (r0 == 0) goto L48
            r6 = 1
        L48:
            r0 = r4 & 2
            if (r0 == 0) goto L4d
            r1 = 1
        L4d:
            r0 = 6
            goto Ld
        L4f:
            r1 = 0
            boolean r6 = X.MSX.A1T(r4, r6)
            r0 = 5
            goto Ld
        L56:
            r1 = 0
            boolean r6 = X.MSX.A1T(r4, r6)
            r0 = 4
            goto Ld
        L5d:
            r1 = 0
            boolean r6 = X.MSX.A1T(r4, r6)
            r0 = 3
            goto Ld
        L64:
            r1 = 0
            boolean r6 = X.MSX.A1T(r4, r6)
            r0 = 1
            goto Ld
        L6b:
            r1 = 0
            boolean r6 = X.MSX.A1T(r4, r6)
            r0 = 0
            goto Ld
        L72:
            boolean r1 = X.MSX.A1T(r4, r6)
            r0 = 14
            r3.<init>(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50526MSf.<init>(int, int, boolean):void");
    }

    public static void A00(C05A c05a, int i, boolean z, boolean z2) {
        c05a.Egh(new C50526MSf(z, z2, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 0: goto La;
                case 1: goto L5;
                case 2: goto Le;
                case 3: goto L12;
                case 4: goto L16;
                case 5: goto L1a;
                case 6: goto L1e;
                case 7: goto L22;
                case 8: goto L26;
                case 9: goto L2b;
                case 10: goto L30;
                case 11: goto L35;
                case 12: goto L3a;
                case 13: goto L3f;
                case 14: goto L44;
                case 15: goto L49;
                case 16: goto L4e;
                case 17: goto L53;
                case 18: goto L58;
                case 19: goto L5d;
                case 20: goto L62;
                case 21: goto L67;
                case 22: goto L80;
                default: goto L5;
            }
        L5:
            boolean r0 = super.equals(r3)
            return r0
        La:
            if (r2 == r3) goto L9c
            r1 = 0
            goto L84
        Le:
            if (r2 == r3) goto L9c
            r1 = 2
            goto L6b
        L12:
            if (r2 == r3) goto L9c
            r1 = 3
            goto L6b
        L16:
            if (r2 == r3) goto L9c
            r1 = 4
            goto L6b
        L1a:
            if (r2 == r3) goto L9c
            r1 = 5
            goto L84
        L1e:
            if (r2 == r3) goto L9c
            r1 = 6
            goto L84
        L22:
            if (r2 == r3) goto L9c
            r1 = 7
            goto L84
        L26:
            if (r2 == r3) goto L9c
            r1 = 8
            goto L84
        L2b:
            if (r2 == r3) goto L9c
            r1 = 9
            goto L84
        L30:
            if (r2 == r3) goto L9c
            r1 = 10
            goto L84
        L35:
            if (r2 == r3) goto L9c
            r1 = 11
            goto L6b
        L3a:
            if (r2 == r3) goto L9c
            r1 = 12
            goto L6b
        L3f:
            if (r2 == r3) goto L9c
            r1 = 13
            goto L84
        L44:
            if (r2 == r3) goto L9c
            r1 = 14
            goto L6b
        L49:
            if (r2 == r3) goto L9c
            r1 = 15
            goto L6b
        L4e:
            if (r2 == r3) goto L9c
            r1 = 16
            goto L84
        L53:
            if (r2 == r3) goto L9c
            r1 = 17
            goto L84
        L58:
            if (r2 == r3) goto L9c
            r1 = 18
            goto L84
        L5d:
            if (r2 == r3) goto L9c
            r1 = 19
            goto L6b
        L62:
            if (r2 == r3) goto L9c
            r1 = 20
            goto L6b
        L67:
            if (r2 == r3) goto L9c
            r1 = 21
        L6b:
            boolean r0 = r3 instanceof X.C50526MSf
            if (r0 == 0) goto L9a
            X.MSf r3 = (X.C50526MSf) r3
            int r0 = r3.A02
            if (r0 != r1) goto L9a
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L9a
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            goto L98
        L80:
            if (r2 == r3) goto L9c
            r1 = 22
        L84:
            boolean r0 = r3 instanceof X.C50526MSf
            if (r0 == 0) goto L9a
            X.MSf r3 = (X.C50526MSf) r3
            int r0 = r3.A02
            if (r0 != r1) goto L9a
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            if (r1 != r0) goto L9a
            boolean r1 = r2.A01
            boolean r0 = r3.A01
        L98:
            if (r1 == r0) goto L9c
        L9a:
            r0 = 0
            return r0
        L9c:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50526MSf.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A08;
        boolean z;
        switch (this.A02) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 16:
            case 17:
            case 18:
            case 22:
                A08 = AbstractC25225BEi.A08(this.A00);
                z = this.A01;
                break;
            case 1:
            default:
                return super.hashCode();
            case 2:
            case 3:
            case 4:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
                A08 = AbstractC25225BEi.A08(this.A01);
                z = this.A00;
                break;
        }
        return AbstractC166987dD.A0K(z, A08);
    }

    public final String toString() {
        if (16 - this.A02 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RemixType(v1Available=");
        A1C.append(this.A00);
        A1C.append(", v2Available=");
        return AbstractC25236BEt.A0a(A1C, this.A01);
    }

    public C50526MSf(boolean z, boolean z2, int i) {
        this.A02 = i;
        switch (i) {
            case 0:
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 16:
            case 17:
            case 18:
            case 22:
                this.A00 = z;
                this.A01 = z2;
                return;
            case 2:
            case 3:
            case 4:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            default:
                this.A01 = z;
                this.A00 = z2;
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50526MSf() {
        this(1, 14, false);
        this.A02 = 14;
    }
}
