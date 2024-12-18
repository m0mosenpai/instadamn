package X;

/* renamed from: X.4UV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4UV extends C4UI {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1 A[ADDED_TO_REGION, LOOP:4: B:33:0x00b1->B:34:0x00b3, LOOP_START, PHI: r4
      0x00b1: PHI (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:12:0x0035, B:34:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C4UE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E7Z(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            int r4 = r10.position()
            int r3 = r10.limit()
            int r2 = r3 - r4
            X.4UJ r0 = r9.A00
            int r0 = r0.A02
            r8 = 805306368(0x30000000, float:4.656613E-10)
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = 268435456(0x10000000, float:2.524355E-29)
            r5 = 4
            r1 = 3
            if (r0 == r1) goto L2b
            if (r0 == r5) goto L26
            if (r0 == r6) goto L2d
            if (r0 == r7) goto L29
            if (r0 == r8) goto L26
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L26:
            int r2 = r2 / 2
            goto L2d
        L29:
            int r2 = r2 / 3
        L2b:
            int r2 = r2 * 2
        L2d:
            java.nio.ByteBuffer r2 = r9.A02(r2)
            X.4UJ r0 = r9.A00
            int r0 = r0.A02
            if (r0 == r1) goto Lb1
            if (r0 == r5) goto L88
            if (r0 == r6) goto L73
            if (r0 == r7) goto L5c
            if (r0 == r8) goto L45
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L45:
            if (r4 >= r3) goto Lc6
            int r0 = r4 + 2
            byte r0 = r10.get(r0)
            r2.put(r0)
            int r0 = r4 + 3
            byte r0 = r10.get(r0)
            r2.put(r0)
            int r4 = r4 + 4
            goto L45
        L5c:
            if (r4 >= r3) goto Lc6
            int r0 = r4 + 1
            byte r0 = r10.get(r0)
            r2.put(r0)
            int r0 = r4 + 2
            byte r0 = r10.get(r0)
            r2.put(r0)
            int r4 = r4 + 3
            goto L5c
        L73:
            if (r4 >= r3) goto Lc6
            int r0 = r4 + 1
            byte r0 = r10.get(r0)
            r2.put(r0)
            byte r0 = r10.get(r4)
            r2.put(r0)
            int r4 = r4 + 2
            goto L73
        L88:
            if (r4 >= r3) goto Lc6
            float r5 = r10.getFloat(r4)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r5, r0)
            float r1 = java.lang.Math.max(r1, r0)
            r0 = 1191181824(0x46fffe00, float:32767.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            short r1 = (short) r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r2.put(r0)
            int r0 = r1 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r2.put(r0)
            int r4 = r4 + 4
            goto L88
        Lb1:
            if (r4 >= r3) goto Lc6
            r0 = 0
            r2.put(r0)
            byte r0 = r10.get(r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 + (-128)
            byte r0 = (byte) r0
            r2.put(r0)
            int r4 = r4 + 1
            goto Lb1
        Lc6:
            int r0 = r10.limit()
            r10.position(r0)
            r2.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4UV.E7Z(java.nio.ByteBuffer):void");
    }
}
