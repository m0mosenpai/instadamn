package X;

/* renamed from: X.7Oa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162167Oa {
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(android.net.Uri r1, java.lang.String r2) {
        /*
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            r0 = 1
            X.C14360o3.A0B(r1, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1411109025: goto L1f;
                case 446723834: goto L11;
                case 1155029876: goto L28;
                case 1981798234: goto L1c;
                default: goto Lf;
            }
        Lf:
            r0 = 0
            return r0
        L11:
            java.lang.String r0 = "direct_v2_delete_item"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "did"
            goto L32
        L1c:
            java.lang.String r0 = "direct_v2_message"
            goto L21
        L1f:
            java.lang.String r0 = "direct_v2_edit_message"
        L21:
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L30
            goto Lf
        L28:
            java.lang.String r0 = "direct_v2_reply_reminder"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf
        L30:
            java.lang.String r0 = "id"
        L32:
            java.lang.String r0 = r1.getQueryParameter(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC162167Oa.A00(android.net.Uri, java.lang.String):java.lang.String");
    }

    public static final String A01(String str, String str2) {
        boolean z = false;
        if (str2.length() == 0) {
            z = true;
        }
        if (!z && AbstractC001900j.A0a(str2, ";", false) && AbstractC001900j.A0a(str2, str, false)) {
            for (String str3 : (String[]) new C11L(";").A03(str2).toArray(new String[0])) {
                if (AbstractC001900j.A0a(str3, str, false)) {
                    return ((String[]) new C11L(str).A03(str3).toArray(new String[0]))[1];
                }
            }
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r4.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A02(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            if (r4 == 0) goto L11
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L12
        L11:
            r0 = 1
        L12:
            java.lang.String r1 = ";"
            if (r0 != 0) goto L21
            r2.append(r1)
            java.lang.String r0 = "thread_id:"
            r2.append(r0)
            r2.append(r4)
        L21:
            if (r5 == 0) goto L34
            int r0 = r5.length()
            if (r0 == 0) goto L34
            r2.append(r1)
            java.lang.String r0 = "type:"
            r2.append(r0)
            r2.append(r5)
        L34:
            java.lang.String r0 = r2.toString()
            X.C14360o3.A07(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC162167Oa.A02(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
