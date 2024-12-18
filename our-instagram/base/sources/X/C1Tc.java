package X;

/* renamed from: X.1Tc, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Tc {
    public InterfaceC27041Tb A00;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C62944SYm A00(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.String r0 = "error_code"
            r3 = 1
            int r7 = r9.getInt(r0, r3)
            java.lang.String r1 = "exception"
            android.os.Parcelable r0 = r9.getParcelable(r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r6 = 0
            if (r0 == 0) goto L30
            java.io.Serializable r0 = r0.getSerializable(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1f
            java.lang.Integer r1 = X.C05F.A00     // Catch: java.lang.Throwable -> L24
            goto L33
        L1f:
            java.lang.Integer r1 = X.C05F.A0N     // Catch: java.lang.Throwable -> L24
            goto L33
        L22:
            r2 = move-exception
            goto L26
        L24:
            r2 = move-exception
            r6 = r0
        L26:
            X.1Tb r1 = r8.A00
            java.lang.String r0 = "IpcExceptionFactory_DESERIALIZATION_FAILED"
            r1.EHB(r0, r2)
            java.lang.Integer r1 = X.C05F.A0C
            goto L34
        L30:
            java.lang.Integer r1 = X.C05F.A0N
            goto L34
        L33:
            r6 = r0
        L34:
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L3e
            java.lang.String r0 = "serialization_result"
            r9.getBoolean(r0, r3)
        L3e:
            java.lang.String r0 = "stringified_exception"
            java.lang.String r5 = r9.getString(r0)
            java.lang.String r0 = "exception_hierarchies"
            java.util.ArrayList r0 = r9.getStringArrayList(r0)
            com.google.common.collect.ImmutableList$Builder r4 = com.google.common.collect.ImmutableList.builder()
            if (r0 == 0) goto L7e
            com.google.common.collect.ImmutableList$Builder r3 = com.google.common.collect.ImmutableList.builder()
            java.util.Iterator r2 = r0.iterator()
        L5a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "--"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7a
            com.google.common.collect.ImmutableList r0 = r3.build()
            r4.add(r0)
            com.google.common.collect.ImmutableList$Builder r3 = com.google.common.collect.ImmutableList.builder()
            goto L5a
        L7a:
            r3.add(r1)
            goto L5a
        L7e:
            com.google.common.collect.ImmutableList r1 = r4.build()
            X.SYm r0 = new X.SYm
            r0.<init>(r1, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1Tc.A00(android.os.Bundle):X.SYm");
    }
}
