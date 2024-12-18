package X;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes9.dex */
public abstract class OX5 {
    public final Integer A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Number] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.OX5 A00(android.net.Uri r5) {
        /*
            java.lang.String r0 = "s"
            java.lang.String r0 = r5.getQueryParameter(r0)
            if (r0 == 0) goto L25
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L1d
            if (r2 <= 0) goto L25
            r1 = 3
            java.lang.Integer[] r0 = X.C05F.A00(r1)     // Catch: java.lang.NumberFormatException -> L1d
            int r0 = r0.length     // Catch: java.lang.NumberFormatException -> L1d
            if (r2 >= r0) goto L25
            java.lang.Integer[] r0 = X.C05F.A00(r1)     // Catch: java.lang.NumberFormatException -> L1d
            r5 = r0[r2]     // Catch: java.lang.NumberFormatException -> L1d
            goto L5d
        L1d:
            r2 = move-exception
            java.lang.String r1 = "SecureFileProviderScope"
            java.lang.String r0 = "Invalid scope for direct file access"
            X.C0K8.A0F(r1, r0, r2)
        L25:
            java.util.List r2 = r5.getPathSegments()
            int r1 = r2.size()
            r0 = 2
            if (r1 < r0) goto L5b
            int r0 = X.AbstractC31172DnG.A03(r2, r0)
            java.lang.Object r4 = r2.get(r0)
            r0 = 3
            java.lang.Integer[] r3 = X.C05F.A00(r0)
            int r2 = r3.length
            r1 = 0
        L3f:
            if (r1 >= r2) goto L5b
            r5 = r3[r1]
            int r0 = r5.intValue()
            switch(r0) {
                case 1: goto L55;
                case 2: goto L58;
                default: goto L4a;
            }
        L4a:
            java.lang.String r0 = "any_app"
        L4c:
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L5d
            int r1 = r1 + 1
            goto L3f
        L55:
            java.lang.String r0 = "third_party"
            goto L4c
        L58:
            java.lang.String r0 = "family"
            goto L4c
        L5b:
            java.lang.Integer r5 = X.C05F.A00
        L5d:
            int r1 = r5.intValue()
            r0 = 0
            if (r1 == r0) goto L76
            r0 = 1
            if (r1 == r0) goto L70
            r0 = 2
            if (r1 != r0) goto L76
            X.N0O r0 = new X.N0O
            r0.<init>()
            return r0
        L70:
            X.N0P r0 = new X.N0P
            r0.<init>()
            return r0
        L76:
            X.N0N r0 = new X.N0N
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OX5.A00(android.net.Uri):X.OX5");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0bW, java.lang.Object] */
    public final android.net.Uri A01(Context context, File file) {
        HashMap hashMap = C58331PtP.A06;
        return AbstractC31174DnI.A0B(C58331PtP.A01(context, null, new Object()).A04(file).buildUpon(), "s", String.valueOf(this.A00.intValue()));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0bW, java.lang.Object] */
    public final File A02(Context context, android.net.Uri uri) {
        HashMap hashMap = C58331PtP.A06;
        return C58331PtP.A01(context, null, new Object()).A05(uri, AbstractC166997dE.A0b());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0bW, java.lang.Object] */
    public final File A03(Context context, String str, String str2) {
        String str3;
        HashMap hashMap = C58331PtP.A06;
        C54807OKb A02 = C58331PtP.A02(C58331PtP.A01(context, null, new Object()), EnumC58332PtQ.CACHE_PATH);
        switch (this.A00.intValue()) {
            case 0:
                str3 = "any_app";
                break;
            case 1:
                str3 = "third_party";
                break;
            default:
                str3 = "family";
                break;
        }
        String A0R = AnonymousClass001.A0R("__SFP_SCOPE__/", str3);
        if (A0R != null && !A0R.isEmpty()) {
            HashMap hashMap2 = A02.A02;
            if (hashMap2.containsKey(A0R)) {
                A02 = (C54807OKb) hashMap2.get(A0R);
            } else {
                A02 = new C54807OKb(A02.A00, MSW.A0w(A02.A01, A0R));
                hashMap2.put(A0R, A02);
            }
        }
        if (str2 != null && !str2.startsWith(".")) {
            str2 = AnonymousClass001.A0R(".", str2);
        }
        return File.createTempFile(str, str2, A02.A00());
    }

    public final Boolean A04(Context context) {
        if (this instanceof N0N) {
            return AbstractC166997dE.A0b();
        }
        boolean z = this instanceof N0P;
        C08600cO c08600cO = new C08600cO();
        c08600cO.A01 = AbstractC08590cN.A00();
        boolean A03 = c08600cO.A00().A03(context, null, null);
        if (z) {
            return AbstractC31172DnG.A0s(A03);
        }
        return Boolean.valueOf(A03);
    }

    public OX5(Integer num) {
        this.A00 = num;
    }
}
