package X;

/* renamed from: X.FCd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34335FCd {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(java.lang.String r1) {
        /*
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1090974990: goto L2e;
                case -948696717: goto L2b;
                case 1501196714: goto L20;
                case 1563991648: goto L15;
                case 1885454214: goto L12;
                default: goto Lb;
            }
        Lb:
            java.lang.String r0 = "Invalid direct mutation lifecycle state: "
            java.lang.IllegalStateException r0 = X.AbstractC31175DnJ.A0V(r0, r1)
            throw r0
        L12:
            java.lang.String r0 = "upload_failed_transient"
            goto L22
        L15:
            java.lang.String r0 = "uploaded"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "success"
            return r0
        L20:
            java.lang.String r0 = "upload_failed_permanent"
        L22:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "fail"
            return r0
        L2b:
            java.lang.String r0 = "queued"
            goto L30
        L2e:
            java.lang.String r0 = "executing"
        L30:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "in_progress"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC34335FCd.A00(java.lang.String):java.lang.String");
    }
}
