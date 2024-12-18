package X;

/* renamed from: X.4q3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC105924q3 {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r15 == false) goto L24;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x009d: INVOKE 
      (r5 I:X.4q2)
      (r6 I:java.lang.String)
      (r7 I:java.lang.String)
      (r8 I:java.lang.String)
      (r9 I:java.lang.String)
      (r10 I:int)
     STATIC call: X.4q2.A01(X.4q2, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void A[MD:(X.4q2, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:157), block:B:36:0x009d */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x008c: INVOKE (r10 I:int) = (r6 I:java.lang.Integer) STATIC call: X.4q2.A00(java.lang.Integer):int A[MD:(java.lang.Integer):int (m)] (LINE:140), block:B:35:0x008c */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0095: INVOKE (r10 I:int) = (r6 I:java.lang.Integer) STATIC call: X.4q2.A00(java.lang.Integer):int A[MD:(java.lang.Integer):int (m)] (LINE:149), block:B:38:0x0095 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x009d: INVOKE 
      (r5v0 ?? I:X.4q2)
      (r6v2 ?? I:java.lang.String)
      (r7v1 ?? I:java.lang.String)
      (r8 I:java.lang.String)
      (r9 I:java.lang.String)
      (r10 I:int)
     STATIC call: X.4q2.A01(X.4q2, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void A[MD:(X.4q2, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:157), block:B:36:0x009d */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x009d: INVOKE 
      (r5v0 ?? I:X.4q2)
      (r6v2 ?? I:java.lang.String)
      (r7v1 ?? I:java.lang.String)
      (r8v0 ?? I:java.lang.String)
      (r9 I:java.lang.String)
      (r10 I:int)
     STATIC call: X.4q2.A01(X.4q2, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void A[MD:(X.4q2, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:157), block:B:36:0x009d */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e A[Catch: NullPointerException -> 0x008c, JSONException -> 0x0095, TryCatch #1 {NullPointerException -> 0x008c, blocks: (B:3:0x0001, B:5:0x0027, B:6:0x0029, B:8:0x003c, B:10:0x004d, B:13:0x0054, B:14:0x005a, B:17:0x0070, B:20:0x007e, B:34:0x0052), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(X.C105914q2 r10, java.lang.Integer r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            r2 = 0
            r5 = r10
            r6 = r11
            r9 = r13
            r8 = r14
            X.4q4 r4 = X.C105934q4.A01     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            r7 = r12
            org.json.JSONObject r1 = r4.A00(r5, r6, r7, r8, r9)     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            int r4 = r11.intValue()     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            org.json.JSONObject r3 = r1.getJSONObject(r0)     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            X.C14360o3.A07(r3)     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            X.4q6 r0 = X.EnumC105944q5.A02     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            java.util.Map r0 = r0.A00     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            java.lang.Object r0 = r0.get(r14)     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            java.lang.Enum r0 = (java.lang.Enum) r0     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            if (r0 != 0) goto L29
            X.4q5 r0 = X.EnumC105944q5.A3q     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
        L29:
            X.4q5 r0 = (X.EnumC105944q5) r0     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            int r0 = r0.A00     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            org.json.JSONObject r1 = r3.getJSONObject(r0)     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            X.C14360o3.A07(r1)     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            boolean r3 = r3.has(r0)     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            r0 = 4
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: org.json.JSONException -> L52 java.lang.NullPointerException -> L8c
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch: org.json.JSONException -> L52 java.lang.NullPointerException -> L8c
            java.lang.Object r1 = r0.get(r2)     // Catch: org.json.JSONException -> L52 java.lang.NullPointerException -> L8c
            boolean r0 = r1 instanceof java.lang.Integer     // Catch: org.json.JSONException -> L52 java.lang.NullPointerException -> L8c
            if (r0 == 0) goto L59
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: org.json.JSONException -> L52 java.lang.NullPointerException -> L8c
            if (r1 == 0) goto L59
            goto L54
        L52:
            java.lang.Integer r1 = X.C05F.A0C     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
        L54:
            int r1 = r1.intValue()     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            goto L5a
        L59:
            r1 = 2
        L5a:
            switch(r4) {
                case 1: goto L60;
                case 2: goto L60;
                default: goto L5d;
            }     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
        L5d:
            if (r3 == 0) goto L7e
            goto L70
        L60:
            if (r1 == r2) goto L6a
            r0 = 1
            if (r1 != r0) goto L6c
            if (r3 == 0) goto L6a
            r3 = 1
            if (r15 != 0) goto L5d
        L6a:
            r3 = 0
            goto L5d
        L6c:
            r0 = 2
            if (r1 != r0) goto L6a
            goto L5d
        L70:
            int r15 = X.C105914q2.A00(r11)     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            java.lang.String r11 = "acl_passed"
            java.lang.String r12 = "no_error"
            r13 = r14
            r14 = r9
            X.C105914q2.A01(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            return r3
        L7e:
            int r15 = X.C105914q2.A00(r11)     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            java.lang.String r11 = "acl_failed"
            java.lang.String r12 = "caller_name_not_found"
            r13 = r14
            r14 = r9
            X.C105914q2.A01(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.NullPointerException -> L8c org.json.JSONException -> L95
            return r3
        L8c:
            int r10 = X.C105914q2.A00(r6)
            java.lang.String r6 = "acl_failed"
            java.lang.String r7 = "acl_not_found"
            goto L9d
        L95:
            int r10 = X.C105914q2.A00(r6)
            java.lang.String r6 = "acl_failed"
            java.lang.String r7 = "acl_is_empty"
        L9d:
            X.C105914q2.A01(r5, r6, r7, r8, r9, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC105924q3.A00(X.4q2, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean):boolean");
    }
}
