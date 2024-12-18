package X;

/* renamed from: X.4Hx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC93564Hx {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0014 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(X.C47Z r4, java.lang.Integer r5) {
        /*
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            int r0 = r5.intValue()
            r2 = 0
            switch(r0) {
                case 2: goto L2a;
                case 3: goto L16;
                case 4: goto L8d;
                case 5: goto L96;
                case 6: goto L86;
                case 7: goto L83;
                case 8: goto L7e;
                case 9: goto L73;
                case 10: goto L6e;
                case 11: goto L6b;
                case 12: goto L62;
                case 13: goto L14;
                case 14: goto L5f;
                case 15: goto L5c;
                default: goto Lc;
            }
        Lc:
            java.lang.String r0 = r4.A3D
            if (r0 == 0) goto L15
            boolean r0 = r4.A5e
            if (r0 != 0) goto L15
        L14:
            r2 = 1
        L15:
            return r2
        L16:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0I
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            X.C14360o3.A07(r0)
            boolean r0 = r4.A14(r0)
            if (r0 == 0) goto L15
            boolean r0 = r4.A0m()
            goto L39
        L2a:
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.A0V
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0W
            java.util.EnumSet r0 = java.util.EnumSet.of(r1, r0)
            X.C14360o3.A07(r0)
            boolean r0 = r4.A14(r0)
        L39:
            if (r0 == 0) goto L15
            java.util.List r0 = r4.A4c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L14
            java.util.List r0 = r4.A4c
            java.util.Iterator r1 = r0.iterator()
        L49:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L15
            java.lang.Object r0 = r1.next()
            X.1tl r0 = (X.InterfaceC40171tl) r0
            boolean r0 = r0.CVX()
            if (r0 != 0) goto L49
            goto L14
        L5c:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A09
            goto L88
        L5f:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0Q
            goto L88
        L62:
            com.instagram.pendingmedia.model.constants.ShareType r3 = com.instagram.pendingmedia.model.constants.ShareType.A0H
            com.instagram.pendingmedia.model.constants.ShareType r2 = com.instagram.pendingmedia.model.constants.ShareType.A08
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.A0J
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0Q
            goto L9e
        L6b:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0L
            goto L88
        L6e:
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.A08
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0C
            goto L91
        L73:
            com.instagram.pendingmedia.model.constants.ShareType r2 = com.instagram.pendingmedia.model.constants.ShareType.A0H
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.A0J
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0Q
            java.util.EnumSet r0 = java.util.EnumSet.of(r2, r1, r0)
            goto La2
        L7e:
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.A0J
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0Q
            goto L91
        L83:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0M
            goto L88
        L86:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0N
        L88:
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            goto La2
        L8d:
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.A0F
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0W
        L91:
            java.util.EnumSet r0 = java.util.EnumSet.of(r1, r0)
            goto La2
        L96:
            com.instagram.pendingmedia.model.constants.ShareType r3 = com.instagram.pendingmedia.model.constants.ShareType.A0H
            com.instagram.pendingmedia.model.constants.ShareType r2 = com.instagram.pendingmedia.model.constants.ShareType.A0V
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.A0F
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0W
        L9e:
            java.util.EnumSet r0 = java.util.EnumSet.of(r3, r2, r1, r0)
        La2:
            X.C14360o3.A07(r0)
            boolean r2 = r4.A14(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC93564Hx.A00(X.47Z, java.lang.Integer):boolean");
    }
}
