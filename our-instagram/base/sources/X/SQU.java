package X;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public abstract class SQU {
    public static void A01(ImmutableList.Builder builder, ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i2);
        duplicate.limit(i2 + (i - i2));
        builder.add((Object) duplicate.slice());
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003b A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.common.collect.ImmutableList A00(java.nio.ByteBuffer r7) {
        /*
            int r0 = r7.remaining()
            if (r0 != 0) goto Lb
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            return r0
        Lb:
            r3 = -1
            int r2 = r7.limit()
            r4 = 0
        L11:
            if (r4 >= r2) goto Lb6
            int r0 = r7.limit()
            int r0 = r0 + (-3)
            r1 = 1
            if (r4 >= r0) goto Lac
            byte r0 = r7.get(r4)
            if (r0 != 0) goto Lac
            int r0 = r4 + 1
            byte r0 = r7.get(r0)
            if (r0 != 0) goto Lac
            int r0 = r4 + 2
            byte r0 = r7.get(r0)
            if (r0 != r1) goto Lac
            int r3 = r4 + 3
            r6 = 1
        L35:
            com.google.common.collect.ImmutableList$Builder r4 = new com.google.common.collect.ImmutableList$Builder
            r4.<init>()
            r1 = r3
        L3b:
            if (r3 >= r2) goto Lb9
            int r0 = r7.limit()
            int r0 = r0 + (-3)
            r5 = 1
            if (r3 >= r0) goto Laa
            byte r0 = r7.get(r3)
            if (r0 != 0) goto Laa
            int r0 = r3 + 1
            byte r0 = r7.get(r0)
            if (r0 != 0) goto Laa
            int r0 = r3 + 2
            byte r0 = r7.get(r0)
            if (r0 != r5) goto Laa
        L5c:
            if (r6 == 0) goto L8c
            if (r5 == 0) goto L67
            A01(r4, r7, r3, r1)
            int r1 = r3 + 3
            r3 = r1
            goto L3b
        L67:
            int r0 = r7.limit()
            int r0 = r0 + (-3)
            if (r3 >= r0) goto La7
            byte r0 = r7.get(r3)
            if (r0 != 0) goto La7
            int r0 = r3 + 1
            byte r0 = r7.get(r0)
            if (r0 != 0) goto La7
            int r0 = r3 + 2
            byte r0 = r7.get(r0)
            if (r0 != 0) goto La7
            A01(r4, r7, r3, r1)
            int r3 = r3 + 1
            r6 = 0
            goto L92
        L8c:
            if (r5 == 0) goto L9a
            int r3 = r3 + 3
            r1 = r3
            r6 = 1
        L92:
            if (r3 != r2) goto L3b
            if (r6 == 0) goto L3b
            A01(r4, r7, r3, r1)
            goto L3b
        L9a:
            byte r0 = r7.get(r3)
            if (r0 == 0) goto La7
            java.lang.String r0 = "Invalid NAL units"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        La7:
            int r3 = r3 + 1
            goto L92
        Laa:
            r5 = 0
            goto L5c
        Lac:
            byte r0 = r7.get(r4)
            if (r0 != 0) goto Lc1
            int r4 = r4 + 1
            goto L11
        Lb6:
            r6 = 0
            goto L35
        Lb9:
            r7.rewind()
            com.google.common.collect.ImmutableList r0 = r4.build()
            return r0
        Lc1:
            java.lang.String r0 = "Sample does not start with a NAL unit"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQU.A00(java.nio.ByteBuffer):com.google.common.collect.ImmutableList");
    }
}
