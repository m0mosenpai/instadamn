package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9CN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CN extends C0T6 {
    public final int A00 = 1;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C9CN(ImageUrl imageUrl, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A02 = str2;
        this.A01 = imageUrl;
        this.A05 = str3;
        this.A03 = str4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L46;
                case 1: goto L80;
                case 2: goto L9c;
                default: goto L5;
            }
        L5:
            if (r2 == r3) goto Ld7
            r1 = 3
            boolean r0 = r3 instanceof X.C9CN
            if (r0 == 0) goto L44
            X.9CN r3 = (X.C9CN) r3
            int r0 = r3.A00
            if (r0 != r1) goto L44
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L44
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L44
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L44
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L44
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
        L3e:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto Ld7
        L44:
            r0 = 0
            return r0
        L46:
            if (r2 == r3) goto Ld7
            r1 = 0
            boolean r0 = r3 instanceof X.C9CN
            if (r0 == 0) goto L44
            X.9CN r3 = (X.C9CN) r3
            int r0 = r3.A00
            if (r0 != r1) goto L44
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L44
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L44
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L44
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L44
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            goto L3e
        L80:
            if (r2 == r3) goto Ld7
            r1 = 1
            boolean r0 = r3 instanceof X.C9CN
            if (r0 == 0) goto L44
            X.9CN r3 = (X.C9CN) r3
            int r0 = r3.A00
            if (r0 != r1) goto L44
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L44
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto Lb7
        L9c:
            if (r2 == r3) goto Ld7
            r1 = 2
            boolean r0 = r3 instanceof X.C9CN
            if (r0 == 0) goto L44
            X.9CN r3 = (X.C9CN) r3
            int r0 = r3.A00
            if (r0 != r1) goto L44
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L44
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r3.A05
        Lb7:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L44
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L44
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L44
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            goto L3e
        Ld7:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CN.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CN.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        switch (this.A00) {
            case 0:
                sb = new StringBuilder();
                sb.append("CallerInfo(callerContext=");
                sb.append(this.A01);
                sb.append(", callerName=");
                sb.append(this.A02);
                sb.append(AbstractC111324zv.A00(278));
                sb.append(this.A03);
                sb.append(", flow=");
                sb.append(this.A04);
                sb.append(", step=");
                str = this.A05;
                break;
            case 1:
            case 2:
            default:
                return super.toString();
            case 3:
                sb = new StringBuilder();
                sb.append("CommentViewState(id=");
                sb.append(this.A04);
                sb.append(", authorId=");
                sb.append(this.A02);
                sb.append(MSV.A00(133));
                sb.append(this.A01);
                sb.append(MSV.A00(299));
                sb.append(this.A05);
                sb.append(", commentText=");
                str = this.A03;
                break;
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public C9CN(AbstractC129825tm abstractC129825tm, String str) {
        this(abstractC129825tm, (String) null, (String) null, (String) null, str);
    }

    public C9CN(CallerContext callerContext, String str, String str2, String str3, String str4) {
        C14360o3.A0B(str3, 4);
        this.A01 = callerContext;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
    }

    public C9CN(Boolean bool, String str, String str2, String str3, String str4) {
        C14360o3.A0B(str, 1);
        this.A05 = str;
        this.A01 = bool;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = str4;
    }

    public C9CN(AbstractC129825tm abstractC129825tm, String str, String str2, String str3, String str4) {
        this.A01 = abstractC129825tm;
        this.A05 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = str4;
    }

    public C9CN() {
        this((Boolean) false, "", (String) null, (String) null, (String) null);
    }
}
