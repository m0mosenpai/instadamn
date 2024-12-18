package X;

import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0Ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04690Ml implements InterfaceC08280bq {
    @Override // X.InterfaceC08280bq
    public final String ELW(String str) {
        C08270bp c08270bp = C04700Mm.A04;
        try {
            new java.net.URI(str);
            return A03(android.net.Uri.parse(str), c08270bp).F7g();
        } catch (NullPointerException | URISyntaxException unused) {
            return A03(android.net.Uri.parse(str), c08270bp).F7g();
        }
    }

    public static C04700Mm A00(android.net.Uri uri, C08270bp c08270bp) {
        return new C04700Mm(uri.getScheme(), uri.getAuthority(), A01(uri, c08270bp), A02(uri, c08270bp));
    }

    public static String A01(android.net.Uri uri, C08270bp c08270bp) {
        String group;
        if (!TextUtils.isEmpty(uri.getPath())) {
            if (uri.getPath().equals("/")) {
                return "/";
            }
            if (c08270bp != null && c08270bp.A02) {
                List list = c08270bp.A01;
                if (!Collections.unmodifiableList(list).isEmpty()) {
                    String path = uri.getPath();
                    if (!TextUtils.isEmpty(path)) {
                        for (List list2 : Collections.unmodifiableList(list)) {
                            String scheme = uri.getScheme();
                            String authority = uri.getAuthority();
                            if (scheme != null && authority != null) {
                                Matcher matcher = ((Pattern) list2.get(2)).matcher(path);
                                if (matcher.matches() && ((Pattern) list2.get(0)).matcher(scheme).matches()) {
                                    if (((Pattern) list2.get(1)).matcher(authority).matches()) {
                                        StringBuilder sb = new StringBuilder();
                                        int groupCount = matcher.groupCount();
                                        if (groupCount <= 0) {
                                            group = matcher.group(0);
                                        } else {
                                            for (int i = 1; i < groupCount; i++) {
                                                sb.append(matcher.group(i));
                                                sb.append(';');
                                            }
                                            group = matcher.group(groupCount);
                                        }
                                        sb.append(group);
                                        return sb.toString();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return "/--sanitized--";
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (java.util.Collections.unmodifiableList(r14.A00).isEmpty() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A02(android.net.Uri r13, X.C08270bp r14) {
        /*
            java.lang.String r0 = r13.getQuery()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r0 == 0) goto Lc
            return r2
        Lc:
            java.util.Set r1 = r13.getQueryParameterNames()     // Catch: java.lang.UnsupportedOperationException -> L11
            goto L12
        L11:
            r1 = r2
        L12:
            if (r1 == 0) goto Ld3
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Ld3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r6 = 0
            r5 = 1
            if (r14 == 0) goto L34
            boolean r0 = r14.A03
            if (r0 == 0) goto L34
            java.util.List r0 = r14.A00
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            boolean r0 = r0.isEmpty()
            r12 = 1
            if (r0 == 0) goto L35
        L34:
            r12 = 0
        L35:
            if (r14 == 0) goto Lc8
            java.util.List r0 = r14.A00
            java.util.List r8 = java.util.Collections.unmodifiableList(r0)
        L3d:
            java.util.Iterator r11 = r1.iterator()
        L41:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lce
            java.lang.Object r10 = r11.next()
            java.lang.String r10 = (java.lang.String) r10
            int r0 = r7.length()
            if (r0 <= 0) goto L58
            r0 = 38
            r7.append(r0)
        L58:
            r7.append(r10)
            java.lang.String r4 = "=--sanitized--"
            if (r12 == 0) goto Lc3
            r9 = 0
        L60:
            int r0 = r8.size()
            if (r9 >= r0) goto Lb7
            java.lang.Object r2 = r8.get(r9)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r2.get(r6)
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            java.util.regex.Matcher r0 = r0.matcher(r10)
            boolean r0 = r0.matches()
            if (r0 == 0) goto Lb4
            java.lang.String r1 = r13.getQueryParameter(r10)
            if (r1 == 0) goto Lb4
            java.lang.Object r0 = r2.get(r5)
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            java.util.regex.Matcher r3 = r0.matcher(r1)
            boolean r0 = r3.matches()
            if (r0 == 0) goto Lb4
            r0 = 61
            r7.append(r0)
            int r2 = r3.groupCount()
            if (r2 <= 0) goto Lb9
            r1 = 1
        L9e:
            if (r1 >= r2) goto Laf
            java.lang.String r0 = r3.group(r1)
            r7.append(r0)
            r0 = 59
            r7.append(r0)
            int r1 = r1 + 1
            goto L9e
        Laf:
            java.lang.String r0 = r3.group(r2)
            goto Lbd
        Lb4:
            int r9 = r9 + 1
            goto L60
        Lb7:
            r0 = 0
            goto Lc1
        Lb9:
            java.lang.String r0 = r3.group(r6)
        Lbd:
            r7.append(r0)
            r0 = 1
        Lc1:
            if (r0 != 0) goto L41
        Lc3:
            r7.append(r4)
            goto L41
        Lc8:
            java.util.List r8 = java.util.Collections.emptyList()
            goto L3d
        Lce:
            java.lang.String r0 = r7.toString()
            return r0
        Ld3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04690Ml.A02(android.net.Uri, X.0bp):java.lang.String");
    }

    public final C04700Mm A03(android.net.Uri uri, C08270bp c08270bp) {
        return new C04700Mm(uri.getScheme(), uri.getAuthority(), A01(uri, c08270bp), A02(uri, c08270bp));
    }
}
