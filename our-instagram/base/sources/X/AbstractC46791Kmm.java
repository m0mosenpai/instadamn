package X;

/* renamed from: X.Kmm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46791Kmm {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r14 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r15 != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba A[EDGE_INSN: B:40:0x00ba->B:38:0x00ba BREAK  A[LOOP:1: B:32:0x00a6->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C51u A00(java.util.Comparator r9, java.util.List r10, java.util.List r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            r3 = 0
            X.AbstractC167007dF.A1E(r10, r3, r11)
            r0 = 6
            X.C14360o3.A0B(r9, r0)
            java.util.ArrayList r2 = X.AnonymousClass483.A02(r9, r10, r11)
            if (r12 != 0) goto L11
            r8 = 0
            if (r14 == 0) goto L12
        L11:
            r8 = 1
        L12:
            if (r13 != 0) goto L17
            r7 = 0
            if (r15 == 0) goto L18
        L17:
            r7 = 1
        L18:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L32
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L28
            if (r12 != 0) goto L32
            if (r13 != 0) goto L32
        L28:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L40
            if (r14 != 0) goto L32
            if (r15 == 0) goto L40
        L32:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            X.51u r3 = new X.51u
            r3.<init>(r2, r1, r0)
            return r3
        L40:
            if (r12 != 0) goto L83
            if (r14 != 0) goto L98
            java.lang.Object r5 = r2.get(r3)
        L48:
            if (r13 != 0) goto L69
            if (r15 != 0) goto L7e
            java.lang.Object r6 = X.AbstractC001800i.A0K(r2)
        L50:
            java.util.Iterator r1 = r2.iterator()
            r4 = 0
        L55:
            boolean r0 = r1.hasNext()
            r3 = -1
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r1.next()
            int r0 = r9.compare(r0, r5)
            if (r0 == 0) goto L9e
            int r4 = r4 + 1
            goto L55
        L69:
            if (r15 == 0) goto L79
            java.lang.Object r1 = X.AbstractC001800i.A0K(r10)
            java.lang.Object r0 = X.AbstractC001800i.A0K(r11)
            int r0 = r9.compare(r1, r0)
            if (r0 > 0) goto L7e
        L79:
            java.lang.Object r6 = X.AbstractC001800i.A0K(r10)
            goto L50
        L7e:
            java.lang.Object r6 = X.AbstractC001800i.A0K(r11)
            goto L50
        L83:
            if (r14 == 0) goto L93
            java.lang.Object r1 = r10.get(r3)
            java.lang.Object r0 = r11.get(r3)
            int r0 = r9.compare(r1, r0)
            if (r0 < 0) goto L98
        L93:
            java.lang.Object r5 = r10.get(r3)
            goto L48
        L98:
            java.lang.Object r5 = r11.get(r3)
            goto L48
        L9d:
            r4 = -1
        L9e:
            int r0 = r2.size()
            java.util.ListIterator r1 = r2.listIterator(r0)
        La6:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto Lba
            java.lang.Object r0 = r1.previous()
            int r0 = r9.compare(r0, r6)
            if (r0 != 0) goto La6
            int r3 = r1.nextIndex()
        Lba:
            int r0 = r3 + 1
            java.util.List r2 = r2.subList(r4, r0)
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC46791Kmm.A00(java.util.Comparator, java.util.List, java.util.List, boolean, boolean, boolean, boolean):X.51u");
    }
}
