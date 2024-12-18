package X;

import java.util.List;

/* renamed from: X.9CG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CG extends C0T6 {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9CG(int r7) {
        /*
            r6 = this;
            r0 = r6
            r6.A04 = r7
            r1 = 0
            int r7 = 2 - r7
            if (r7 == 0) goto L12
            r5 = 3
        L9:
            r6.A04 = r5
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L12:
            r5 = 2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CG.<init>(int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CG.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        if (r0 != null) goto L42;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A04
            switch(r0) {
                case 0: goto L85;
                case 1: goto L2b;
                case 2: goto L60;
                case 3: goto L3d;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r3.A03
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.String r0 = r3.A02
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            if (r0 != 0) goto L26
            r0 = 0
        L1b:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
        L26:
            int r0 = r0.hashCode()
            goto L1b
        L2b:
            java.lang.Object r0 = r3.A01
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.String r0 = r3.A02
            r2 = 0
            if (r0 == 0) goto La2
            int r0 = r0.hashCode()
            goto L70
        L3d:
            java.lang.String r0 = r3.A03
            r2 = 0
            if (r0 != 0) goto L5b
            r0 = 0
        L43:
            int r1 = r0 * 31
            java.lang.String r0 = r3.A02
            if (r0 != 0) goto L56
            r0 = 0
        L4a:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            if (r0 == 0) goto L77
            int r0 = r0.hashCode()
            goto L78
        L56:
            int r0 = r0.hashCode()
            goto L4a
        L5b:
            int r0 = r0.hashCode()
            goto L43
        L60:
            java.lang.String r0 = r3.A02
            r2 = 0
            if (r0 != 0) goto La4
            r0 = 0
        L66:
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            if (r0 == 0) goto La2
            int r0 = r0.hashCode()
        L70:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            if (r0 != 0) goto L98
        L77:
            r0 = 0
        L78:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            if (r0 == 0) goto L83
            int r2 = r0.hashCode()
        L83:
            int r1 = r1 + r2
            return r1
        L85:
            java.lang.Object r0 = r3.A01
            r2 = 0
            if (r0 != 0) goto L9d
            r0 = 0
        L8b:
            int r1 = r0 * 31
            java.lang.String r0 = r3.A03
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A02
        L98:
            int r0 = r0.hashCode()
            goto L78
        L9d:
            int r0 = r0.hashCode()
            goto L8b
        La2:
            r0 = 0
            goto L70
        La4:
            int r0 = r0.hashCode()
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CG.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        switch (this.A04) {
            case 1:
                sb = new StringBuilder();
                sb.append("DraftComment(text=");
                sb.append(this.A01);
                sb.append(", repliedToCommentPk=");
                sb.append(this.A02);
                sb.append(", repliedToParentCommentPk=");
                sb.append(this.A03);
                str = ", slideMentionModel=";
                break;
            case 2:
            case 3:
            default:
                return super.toString();
            case 4:
                sb = new StringBuilder();
                sb.append("SliderStickerUiState(mediaId=");
                sb.append(this.A03);
                sb.append(AbstractC111324zv.A00(1409));
                sb.append(this.A02);
                sb.append(AbstractC111324zv.A00(1445));
                sb.append(this.A01);
                str = ", actions=";
                break;
        }
        sb.append(str);
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C9CG(C9BH c9bh, String str, String str2, List list) {
        this.A04 = 4;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = list;
        this.A00 = c9bh;
    }

    public C9CG(Object obj, Object obj2, String str, String str2, int i) {
        this.A04 = i;
        this.A02 = str;
        this.A01 = obj;
        this.A03 = str2;
        this.A00 = obj2;
    }

    public C9CG(C9BN c9bn, String str, String str2, List list) {
        this.A04 = 0;
        C14360o3.A0B(str, 2);
        this.A01 = c9bn;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = list;
    }

    public C9CG(C167987et c167987et, CharSequence charSequence, String str, String str2) {
        this.A04 = 1;
        this.A01 = charSequence;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = c167987et;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9CG(C9BN c9bn) {
        this(c9bn, "", "", C16930sl.A00);
        this.A04 = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9CG() {
        this(null, null, null, null, 2);
        this.A04 = 2;
    }
}
